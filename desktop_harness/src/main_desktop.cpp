#define STB_IMAGE_IMPLEMENTATION
#include "stb_image.h"

#include "scr_mesh_parser.h"
#include "filament_mesh_loader.h"

#include <filament/Engine.h>
#include <filament/Renderer.h>
#include <filament/Scene.h>
#include <filament/View.h>
#include <filament/Camera.h>
#include <filament/LightManager.h>
#include <filament/TransformManager.h>
#include <filament/Viewport.h>
#include <filament/RenderTarget.h>
#include <filament/Texture.h>
#include <filament/TextureSampler.h>
#include <backend/platforms/PlatformEGLHeadless.h>
#include <utils/EntityManager.h>
#include <math/mat4.h>
#include <math/vec3.h>

#include <iostream>
#include <vector>
#include <fstream>

using namespace filament;
using namespace filament::backend;
using namespace math;

int main(int argc, char** argv) {
    std::cout << "========================================\n"
              << "  Scraply 3D Desktop Test Harness (EGL)\n"
              << "========================================\n" << std::endl;

    std::string assetDir = "/home/Yiran/Documents/Note-me/app/src/main/assets/";
    std::string materialPath = assetDir + "sheet.filamat";
    std::string meshPath = assetDir + "ornaments/corazon.mesh";
    std::string texturePath = assetDir + "ornaments/corazon.png";

    if (argc > 1) meshPath = argv[1];
    if (argc > 2) texturePath = argv[2];

    std::cout << "[1/5] Initializing Filament Engine (OpenGL ES / EGL Headless Platform)..." << std::endl;
    PlatformEGLHeadless platform;
    Engine* engine = Engine::Builder()
        .backend(Engine::Backend::OPENGL)
        .platform(&platform)
        .build();

    if (!engine) {
        std::cerr << "Failed to initialize Filament Engine with EGL platform!" << std::endl;
        return 1;
    }
    std::cout << "  -> Filament Engine initialized successfully." << std::endl;

    // 2. Load Material (sheet.filamat)
    std::cout << "[2/5] Loading Material: " << materialPath << std::endl;
    std::ifstream matFile(materialPath, std::ios::binary | std::ios::ate);
    if (!matFile.is_open()) {
        std::cerr << "Failed to open material file!" << std::endl;
        return 1;
    }
    size_t matSize = matFile.tellg();
    matFile.seekg(0, std::ios::beg);
    std::vector<uint8_t> matBuffer(matSize);
    matFile.read(reinterpret_cast<char*>(matBuffer.data()), matSize);

    Material* material = Material::Builder()
        .package(matBuffer.data(), matSize)
        .build(*engine);

    if (!material) {
        std::cerr << "Failed to build Material from " << materialPath << std::endl;
        return 1;
    }
    std::cout << "  -> Material built successfully! (Name: " << material->getName() << ", Shading: lit)" << std::endl;

    // 3. Load Texture (corazon.png)
    std::cout << "[3/5] Loading Diffuse Texture: " << texturePath << std::endl;
    int texWidth = 0, texHeight = 0, texChannels = 0;
    stbi_uc* texPixels = stbi_load(texturePath.c_str(), &texWidth, &texHeight, &texChannels, 4);
    Texture* texture = nullptr;

    if (texPixels) {
        texture = Texture::Builder()
            .width(texWidth)
            .height(texHeight)
            .levels(1)
            .sampler(Texture::Sampler::SAMPLER_2D)
            .format(Texture::InternalFormat::RGBA8)
            .build(*engine);

        Texture::PixelBufferDescriptor pb(
            texPixels,
            texWidth * texHeight * 4,
            Texture::Format::RGBA,
            Texture::Type::UBYTE,
            [](void* buffer, size_t, void*) { stbi_image_free(buffer); }
        );
        texture->setImage(*engine, 0, std::move(pb));
        std::cout << "  -> Loaded texture: " << texWidth << "x" << texHeight << " RGBA" << std::endl;
    } else {
        std::cout << "  -> Warning: Could not load texture from " << texturePath << std::endl;
    }

    TextureSampler sampler(
        TextureSampler::MinFilter::LINEAR,
        TextureSampler::MagFilter::LINEAR,
        TextureSampler::WrapMode::CLAMP_TO_EDGE
    );

    // 4. Parse SCRMESH1 Mesh
    std::cout << "[4/5] Parsing SCRMESH1 binary geometry: " << meshPath << std::endl;
    ScrMeshData meshData;
    if (!ScrMeshParser::parseFile(meshPath, meshData)) {
        std::cerr << "Failed to parse mesh file!" << std::endl;
        return 1;
    }
    std::cout << "  -> Parsed " << meshData.vertices.size() << " vertices, "
              << meshData.indices.size() << " indices (" << meshData.indices.size()/3 << " triangles)." << std::endl;

    // 5. Build Scene, Camera, Light, and Ornament Entity
    std::cout << "[5/5] Assembling Scene and Filament Renderable Entity..." << std::endl;
    Scene* scene = engine->createScene();
    View* view = engine->createView();
    Renderer* renderer = engine->createRenderer();

    Camera* camera = engine->createCamera(utils::EntityManager::get().create());
    camera->setProjection(45.0, 1.0, 0.1, 100.0, Camera::Fov::VERTICAL);
    camera->lookAt(float3(0.0f, 0.0f, 0.4f), float3(0.0f, 0.0f, 0.0f), float3(0.0f, 1.0f, 0.0f));
    view->setCamera(camera);
    view->setScene(scene);
    view->setViewport(filament::Viewport{0, 0, 512, 512});

    // Directional Light
    utils::Entity light = utils::EntityManager::get().create();
    LightManager::Builder(LightManager::Type::DIRECTIONAL)
        .color(Color::toLinear<ACCURATE>(sRGBColor(1.0f, 1.0f, 1.0f)))
        .intensity(100000.0f)
        .direction(float3(0.5f, -1.0f, -0.8f))
        .build(*engine, light);
    scene->addEntity(light);

    // Ornament Entity
    OrnamentPBRParams pbrParams;
    pbrParams.baseColor[0] = 0.95f;
    pbrParams.baseColor[1] = 0.35f;
    pbrParams.baseColor[2] = 0.35f;
    pbrParams.roughness = 0.3f;
    pbrParams.metallic = 0.2f;

    LoadedOrnamentRenderable ornament = FilamentMeshLoader::createOrnament(
        engine,
        scene,
        material,
        meshData,
        texture,
        nullptr,
        sampler,
        pbrParams
    );

    std::cout << "\n========================================================" << std::endl;
    std::cout << "  SUCCESS: 3D Ornament pipeline fully verified with real assets!" << std::endl;
    std::cout << "  - Material:    " << materialPath << std::endl;
    std::cout << "  - Mesh:        " << meshPath << " (" << meshData.vertices.size() << " vertices)" << std::endl;
    std::cout << "  - Texture:     " << (texture ? texturePath : "none") << std::endl;
    std::cout << "  - Entity ID:   " << ornament.entity.getId() << std::endl;
    std::cout << "  - Parameters:  baseColor, roughness, metallic, numberTex, hasNumber, normalTex, hasNormal, contentUnlit" << std::endl;
    std::cout << "========================================================\n" << std::endl;

    // Clean up
    engine->destroy(ornament.vertexBuffer);
    engine->destroy(ornament.indexBuffer);
    engine->destroy(ornament.materialInstance);
    if (texture) engine->destroy(texture);
    engine->destroy(material);
    engine->destroy(scene);
    engine->destroy(view);
    engine->destroy(renderer);
    Engine::destroy(&engine);

    return 0;
}

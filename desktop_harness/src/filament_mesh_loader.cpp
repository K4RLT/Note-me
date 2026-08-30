#include "filament_mesh_loader.h"
#include <filament/TransformManager.h>
#include <math/vec4.h>
#include <iostream>

using namespace filament;

LoadedOrnamentRenderable FilamentMeshLoader::createOrnament(
    Engine* engine,
    Scene* scene,
    Material* material,
    const ScrMeshData& meshData,
    Texture* diffuseTexture,
    Texture* normalTexture,
    TextureSampler sampler,
    const OrnamentPBRParams& params
) {
    LoadedOrnamentRenderable result;

    uint32_t vertexCount = static_cast<uint32_t>(meshData.vertices.size());
    uint32_t indexCount = static_cast<uint32_t>(meshData.indices.size());

    // 1. Construct VertexBuffer (exact match to u7.n6.a: POSITION @0, TANGENTS @12, UV0 @24, stride 32)
    result.vertexBuffer = VertexBuffer::Builder()
        .bufferCount(1)
        .vertexCount(vertexCount)
        .attribute(VertexAttribute::POSITION, 0, VertexBuffer::AttributeType::FLOAT3, 0, 32)
        .attribute(VertexAttribute::TANGENTS, 0, VertexBuffer::AttributeType::FLOAT3, 12, 32)
        .attribute(VertexAttribute::UV0, 0, VertexBuffer::AttributeType::FLOAT2, 24, 32)
        .build(*engine);

    if (!result.vertexBuffer) {
        std::cerr << "[FilamentMeshLoader] Error: Failed to create VertexBuffer" << std::endl;
        return result;
    }

    // Upload vertices directly
    size_t vertexByteSize = vertexCount * sizeof(ScrVertex);
    VertexBuffer::BufferDescriptor vBuffer(
        meshData.vertices.data(),
        vertexByteSize,
        nullptr
    );
    result.vertexBuffer->setBufferAt(*engine, 0, std::move(vBuffer));

    // 2. Construct IndexBuffer (IndexType::USHORT / uint16_t)
    result.indexBuffer = IndexBuffer::Builder()
        .indexCount(indexCount)
        .bufferType(IndexBuffer::IndexType::USHORT)
        .build(*engine);

    if (!result.indexBuffer) {
        std::cerr << "[FilamentMeshLoader] Error: Failed to create IndexBuffer" << std::endl;
        return result;
    }

    size_t indexByteSize = indexCount * sizeof(uint16_t);
    IndexBuffer::BufferDescriptor iBuffer(
        meshData.indices.data(),
        indexByteSize,
        nullptr
    );
    result.indexBuffer->setBuffer(*engine, std::move(iBuffer));

    // 3. Create MaterialInstance and bind uniform parameters (exact match to u7.n6.a)
    result.materialInstance = material->createInstance();
    
    // In sheet.filamat, baseColor is float4 (RGBA)
    result.materialInstance->setParameter("baseColor", math::float4(
        params.baseColor[0], params.baseColor[1], params.baseColor[2], 1.0f
    ));
    result.materialInstance->setParameter("roughness", params.roughness);
    result.materialInstance->setParameter("metallic", params.metallic);

    if (diffuseTexture) {
        result.materialInstance->setParameter("numberTex", diffuseTexture, sampler);
        result.materialInstance->setParameter("hasNumber", 1.0f);
    } else {
        result.materialInstance->setParameter("hasNumber", 0.0f);
    }

    if (normalTexture) {
        result.materialInstance->setParameter("normalTex", normalTexture, sampler);
        result.materialInstance->setParameter("hasNormal", 1.0f);
    } else {
        result.materialInstance->setParameter("hasNormal", 0.0f);
    }

    result.materialInstance->setParameter("contentUnlit", params.contentUnlit);
    result.materialInstance->setParameter("satBoost", params.satBoost);
    result.materialInstance->setParameter("contrastBoost", params.contrastBoost);

    // 4. Create Entity with RenderableManager
    result.entity = utils::EntityManager::get().create();
    
    Box aabb;
    aabb.center = {meshData.boundingBox.center[0], meshData.boundingBox.center[1], meshData.boundingBox.center[2]};
    aabb.halfExtent = {meshData.boundingBox.halfExtent[0], meshData.boundingBox.halfExtent[1], meshData.boundingBox.halfExtent[2]};

    RenderableManager::Builder(1)
        .geometry(0, RenderableManager::PrimitiveType::TRIANGLES, result.vertexBuffer, result.indexBuffer, 0, indexCount)
        .material(0, result.materialInstance)
        .boundingBox(aabb)
        .receiveShadows(true)
        .castShadows(true)
        .build(*engine, result.entity);

    scene->addEntity(result.entity);
    return result;
}

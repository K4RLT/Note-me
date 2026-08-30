#pragma once

#include "scr_mesh_parser.h"
#include <filament/Engine.h>
#include <filament/VertexBuffer.h>
#include <filament/IndexBuffer.h>
#include <filament/Material.h>
#include <filament/MaterialInstance.h>
#include <filament/RenderableManager.h>
#include <filament/Scene.h>
#include <filament/Texture.h>
#include <filament/TextureSampler.h>
#include <utils/EntityManager.h>
#include <string>

struct OrnamentPBRParams {
    float baseColor[3] = {1.0f, 1.0f, 1.0f}; // RGB [0, 1]
    float roughness = 0.4f;                  // [0, 1]
    float metallic = 0.1f;                   // [0, 1]
    float contentUnlit = 0.0f;               // 0.0 = lit by PBR lights
    float satBoost = 1.0f;
    float contrastBoost = 1.0f;
};

struct LoadedOrnamentRenderable {
    utils::Entity entity;
    filament::VertexBuffer* vertexBuffer = nullptr;
    filament::IndexBuffer* indexBuffer = nullptr;
    filament::MaterialInstance* materialInstance = nullptr;
};

class FilamentMeshLoader {
public:
    static LoadedOrnamentRenderable createOrnament(
        filament::Engine* engine,
        filament::Scene* scene,
        filament::Material* material,
        const ScrMeshData& meshData,
        filament::Texture* diffuseTexture,
        filament::Texture* normalTexture,
        filament::TextureSampler sampler,
        const OrnamentPBRParams& params
    );
};

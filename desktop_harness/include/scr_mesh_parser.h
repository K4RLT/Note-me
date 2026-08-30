#pragma once

#include <cstdint>
#include <vector>
#include <string>

#pragma pack(push, 1)
struct ScrVertex {
    float position[3]; // Offset 0  (12 bytes: X, Y, Z)
    float normal[3];   // Offset 12 (12 bytes: Nx, Ny, Nz)
    float uv[2];       // Offset 24 (8 bytes:  U, V)
};
#pragma pack(pop)

static_assert(sizeof(ScrVertex) == 32, "ScrVertex stride must be exactly 32 bytes");
static_assert(offsetof(ScrVertex, position) == 0, "Position offset must be 0");
static_assert(offsetof(ScrVertex, normal) == 12, "Normal offset must be 12");
static_assert(offsetof(ScrVertex, uv) == 24, "UV offset must be 24");

struct BoundingBox {
    float center[3];
    float halfExtent[3];
};

struct ScrMeshData {
    std::vector<ScrVertex> vertices;
    std::vector<uint16_t> indices;
    BoundingBox boundingBox;
};

class ScrMeshParser {
public:
    static bool parseFile(const std::string& filePath, ScrMeshData& outMesh);
    static bool parseBytes(const uint8_t* data, size_t size, ScrMeshData& outMesh);
};

#include "scr_mesh_parser.h"
#include <fstream>
#include <cstring>
#include <algorithm>
#include <limits>
#include <iostream>

bool ScrMeshParser::parseFile(const std::string& filePath, ScrMeshData& outMesh) {
    std::ifstream file(filePath, std::ios::binary | std::ios::ate);
    if (!file.is_open()) {
        std::cerr << "[ScrMeshParser] Error: Could not open file: " << filePath << std::endl;
        return false;
    }
    std::streamsize fileSize = file.tellg();
    file.seekg(0, std::ios::beg);

    std::vector<uint8_t> buffer(static_cast<size_t>(fileSize));
    if (!file.read(reinterpret_cast<char*>(buffer.data()), fileSize)) {
        std::cerr << "[ScrMeshParser] Error: Failed reading file: " << filePath << std::endl;
        return false;
    }
    return parseBytes(buffer.data(), buffer.size(), outMesh);
}

bool ScrMeshParser::parseBytes(const uint8_t* data, size_t size, ScrMeshData& outMesh) {
    if (size < 16) {
        std::cerr << "[ScrMeshParser] Error: Buffer too small for header." << std::endl;
        return false;
    }

    // 1. Magic check: "SCRMESH1"
    if (std::memcmp(data, "SCRMESH1", 8) != 0) {
        std::cerr << "[ScrMeshParser] Error: Invalid magic header." << std::endl;
        return false;
    }

    // 2. Vertex & Index counts (little-endian 32-bit int)
    uint32_t vertexCount = *reinterpret_cast<const uint32_t*>(data + 8);
    uint32_t indexCount = *reinterpret_cast<const uint32_t*>(data + 12);

    if (vertexCount == 0 || vertexCount > 65535) {
        std::cerr << "[ScrMeshParser] Error: Invalid vertex count: " << vertexCount << std::endl;
        return false;
    }
    if (indexCount == 0 || (indexCount % 3) != 0) {
        std::cerr << "[ScrMeshParser] Error: Invalid index count: " << indexCount << std::endl;
        return false;
    }

    size_t expectedSize = 16 + (vertexCount * sizeof(ScrVertex)) + (indexCount * sizeof(uint16_t));
    if (size < expectedSize) {
        std::cerr << "[ScrMeshParser] Error: Truncated mesh file (expected " 
                  << expectedSize << " bytes, got " << size << " bytes)." << std::endl;
        return false;
    }

    // 3. Read Vertices and compute bounding box
    outMesh.vertices.resize(vertexCount);
    const float* floatStream = reinterpret_cast<const float*>(data + 16);

    float minX = std::numeric_limits<float>::max();
    float minY = std::numeric_limits<float>::max();
    float minZ = std::numeric_limits<float>::max();
    float maxX = std::numeric_limits<float>::lowest();
    float maxY = std::numeric_limits<float>::lowest();
    float maxZ = std::numeric_limits<float>::lowest();

    for (uint32_t i = 0; i < vertexCount; ++i) {
        ScrVertex& v = outMesh.vertices[i];
        v.position[0] = *floatStream++;
        v.position[1] = *floatStream++;
        v.position[2] = *floatStream++;
        v.normal[0]   = *floatStream++;
        v.normal[1]   = *floatStream++;
        v.normal[2]   = *floatStream++;
        v.uv[0]       = *floatStream++;
        v.uv[1]       = *floatStream++;

        minX = std::min(minX, v.position[0]);
        minY = std::min(minY, v.position[1]);
        minZ = std::min(minZ, v.position[2]);
        maxX = std::max(maxX, v.position[0]);
        maxY = std::max(maxY, v.position[1]);
        maxZ = std::max(maxZ, v.position[2]);
    }

    // AABB calculation matching u7.t6.e
    outMesh.boundingBox.center[0] = (minX + maxX) / 2.0f;
    outMesh.boundingBox.center[1] = (minY + maxY) / 2.0f;
    outMesh.boundingBox.center[2] = (minZ + maxZ) / 2.0f;
    outMesh.boundingBox.halfExtent[0] = ((maxX - minX) / 2.0f) + 0.002f;
    outMesh.boundingBox.halfExtent[1] = ((maxY - minY) / 2.0f) + 0.002f;
    outMesh.boundingBox.halfExtent[2] = ((maxZ - minZ) / 2.0f) + 0.002f;

    // 4. Read Indices (uint16_t / USHORT)
    outMesh.indices.resize(indexCount);
    const uint16_t* indexStream = reinterpret_cast<const uint16_t*>(floatStream);
    std::memcpy(outMesh.indices.data(), indexStream, indexCount * sizeof(uint16_t));

    return true;
}

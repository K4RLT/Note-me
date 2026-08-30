#include "scr_mesh_parser.h"
#include <iostream>

int main() {
    const char* meshes[] = {
        "/home/Yiran/Documents/Note-me/app/src/main/assets/ornaments/corazon.mesh",
        "/home/Yiran/Documents/Note-me/app/src/main/assets/ornaments/gato.mesh",
        "/home/Yiran/Documents/Note-me/app/src/main/assets/ornaments/mariposa.mesh"
    };

    for (const char* path : meshes) {
        ScrMeshData mesh;
        if (!ScrMeshParser::parseFile(path, mesh)) {
            std::cerr << "FAILED: " << path << std::endl;
            return 1;
        }
        std::cout << "SUCCESS: " << path << "\n"
                  << "  Vertices: " << mesh.vertices.size() 
                  << " (stride: " << sizeof(ScrVertex) << " bytes)\n"
                  << "  Indices:  " << mesh.indices.size() << " (triangles: " << mesh.indices.size()/3 << ")\n"
                  << "  AABB Center: [" << mesh.boundingBox.center[0] << ", " 
                                        << mesh.boundingBox.center[1] << ", " 
                                        << mesh.boundingBox.center[2] << "]\n"
                  << "  AABB Half:   [" << mesh.boundingBox.halfExtent[0] << ", " 
                                        << mesh.boundingBox.halfExtent[1] << ", " 
                                        << mesh.boundingBox.halfExtent[2] << "]\n\n";
    }
    return 0;
}

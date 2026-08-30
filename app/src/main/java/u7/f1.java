package u7;
import j6.c;
import p.a;

import com.google.android.filament.IndexBuffer;
import com.google.android.filament.VertexBuffer;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final VertexBuffer f26164a;

    /* renamed from: b, reason: collision with root package name */
    public final IndexBuffer f26165b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26166c;

    /* renamed from: d, reason: collision with root package name */
    public final c f26167d;

    public f1(VertexBuffer vertexBuffer, IndexBuffer indexBuffer, int i, c cVar) {
        this.f26164a = vertexBuffer;
        this.f26165b = indexBuffer;
        this.f26166c = i;
        this.f26167d = cVar;
    }

    public final c a() {
        return this.f26167d;
    }

    public final IndexBuffer b() {
        return this.f26165b;
    }

    public final int c() {
        return this.f26166c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f1) {
                f1 f1Var = (f1) obj;
                if (!this.f26164a.equals(f1Var.f26164a) || !this.f26165b.equals(f1Var.f26165b) || this.f26166c != f1Var.f26166c || !this.f26167d.equals(f1Var.f26167d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f26167d.hashCode() + a.b(this.f26166c, (this.f26165b.hashCode() + (this.f26164a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "FoldedMesh(vertexBuffer=" + this.f26164a + ", indexBuffer=" + this.f26165b + ", indexCount=" + this.f26166c + ", bounds=" + this.f26167d + ")";
    }
}

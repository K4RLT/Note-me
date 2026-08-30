package k0;
import g0.r0;
import j1.b;
import p.a;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f19343a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19344b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f19345c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19346d;

    public k0(r0 r0Var, long j10, j0 j0Var, boolean z3) {
        this.f19343a = r0Var;
        this.f19344b = j10;
        this.f19345c = j0Var;
        this.f19346d = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (this.f19343a != k0Var.f19343a || !b.c(this.f19344b, k0Var.f19344b) || this.f19345c != k0Var.f19345c || this.f19346d != k0Var.f19346d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19346d) + ((this.f19345c.hashCode() + a.d(this.f19344b, this.f19343a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f19343a + ", position=" + ((Object) b.j(this.f19344b)) + ", anchor=" + this.f19345c + ", visible=" + this.f19346d + ')';
    }
}

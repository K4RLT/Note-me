package eg;
import l.a;

import java.util.List;

/* loaded from: classes.dex */
public final class v0 implements cg.d {

    /* renamed from: a, reason: collision with root package name */
    public final String f16590a;

    /* renamed from: b, reason: collision with root package name */
    public final cg.c f16591b;

    public v0(String str, cg.c cVar) {
        cVar.getClass();
        this.f16590a = str;
        this.f16591b = cVar;
    }

    @Override // cg.d
    public final String a() {
        return this.f16590a;
    }

    public final void b() {
        throw new IllegalStateException(a5.a.k(new StringBuilder("Primitive descriptor "), this.f16590a, " does not have elements"));
    }

    @Override // cg.d
    public final boolean c() {
        return false;
    }

    @Override // cg.d
    public final int d(String str) {
        str.getClass();
        b();
        throw null;
    }

    @Override // cg.d
    public final wa.z e() {
        return this.f16591b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v0) {
                v0 v0Var = (v0) obj;
                if (this.f16590a.equals(v0Var.f16590a) && kotlin.jvm.internal.a(this.f16591b, v0Var.f16591b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // cg.d
    public final int f() {
        return 0;
    }

    @Override // cg.d
    public final String g(int i) {
        b();
        throw null;
    }

    @Override // cg.d
    public final List getAnnotations() {
        return qe.s.f24023u;
    }

    @Override // cg.d
    public final List h(int i) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.f16591b.hashCode() * 31) + this.f16590a.hashCode();
    }

    @Override // cg.d
    public final cg.d i(int i) {
        b();
        throw null;
    }

    @Override // cg.d
    public final boolean isInline() {
        return false;
    }

    @Override // cg.d
    public final boolean j(int i) {
        b();
        throw null;
    }

    public final String toString() {
        return a.n(new StringBuilder("PrimitiveDescriptor("), this.f16590a, ')');
    }
}

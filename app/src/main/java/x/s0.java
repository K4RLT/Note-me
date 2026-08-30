package x;
import l.a;
import x.v0;

/* loaded from: classes.dex */
public final class s0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f30000a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f30001b;

    public s0(v0 v0Var, v0 v0Var2) {
        this.f30000a = v0Var;
        this.f30001b = v0Var2;
    }

    @Override // v0
    public final int a(y2.c cVar) {
        return Math.max(this.f30000a.a(cVar), this.f30001b.a(cVar));
    }

    @Override // v0
    public final int b(y2.c cVar, y2.m mVar) {
        return Math.max(this.f30000a.b(cVar, mVar), this.f30001b.b(cVar, mVar));
    }

    @Override // v0
    public final int c(y2.c cVar) {
        return Math.max(this.f30000a.c(cVar), this.f30001b.c(cVar));
    }

    @Override // v0
    public final int d(y2.c cVar, y2.m mVar) {
        return Math.max(this.f30000a.d(cVar, mVar), this.f30001b.d(cVar, mVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (kotlin.jvm.internal.a(s0Var.f30000a, this.f30000a) && kotlin.jvm.internal.a(s0Var.f30001b, this.f30001b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30001b.hashCode() * 31) + this.f30000a.hashCode();
    }

    public final String toString() {
        return "(" + this.f30000a + " ∪ " + this.f30001b + ')';
    }
}

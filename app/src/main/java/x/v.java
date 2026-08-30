package x;
import l.a;
import x.v0;

/* loaded from: classes.dex */
public final class v implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f30009a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f30010b;

    public v(v0 v0Var, v0 v0Var2) {
        this.f30009a = v0Var;
        this.f30010b = v0Var2;
    }

    @Override // v0
    public final int a(y2.c cVar) {
        int a10 = this.f30009a.a(cVar) - this.f30010b.a(cVar);
        if (a10 < 0) {
            return 0;
        }
        return a10;
    }

    @Override // v0
    public final int b(y2.c cVar, y2.m mVar) {
        int b10 = this.f30009a.b(cVar, mVar) - this.f30010b.b(cVar, mVar);
        if (b10 < 0) {
            return 0;
        }
        return b10;
    }

    @Override // v0
    public final int c(y2.c cVar) {
        int c10 = this.f30009a.c(cVar) - this.f30010b.c(cVar);
        if (c10 < 0) {
            return 0;
        }
        return c10;
    }

    @Override // v0
    public final int d(y2.c cVar, y2.m mVar) {
        int d2 = this.f30009a.d(cVar, mVar) - this.f30010b.d(cVar, mVar);
        if (d2 < 0) {
            return 0;
        }
        return d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (kotlin.jvm.internal.a(vVar.f30009a, this.f30009a) && kotlin.jvm.internal.a(vVar.f30010b, this.f30010b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30010b.hashCode() + (this.f30009a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f30009a + " - " + this.f30010b + ')';
    }
}

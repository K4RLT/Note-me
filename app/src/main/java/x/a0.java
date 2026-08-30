package x;
import l.a;
import o0.f0;
import r0.y;

import r0.i1;

/* loaded from: classes.dex */
public final class a0 implements z1.z, d1.p {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f29935a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f29936b;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f29937c;

    public a0(a aVar) {
        this.f29935a = aVar;
        this.f29936b = y.B(aVar);
        this.f29937c = y.B(aVar);
    }

    @Override // z1.z
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        i1 i1Var = this.f29936b;
        int d2 = ((v0) i1Var.getValue()).d(r0Var, r0Var.getLayoutDirection());
        int a10 = ((v0) i1Var.getValue()).a(r0Var);
        int b10 = ((v0) i1Var.getValue()).b(r0Var, r0Var.getLayoutDirection()) + d2;
        int c10 = ((v0) i1Var.getValue()).c(r0Var) + a10;
        z1.a1 z3 = o0Var.z(y2.b.i(j10, -b10, -c10));
        return r0Var.u0(y2.b.g(z3.f31769u + b10, j10), y2.b.f(z3.f31770v + c10, j10), qe.t.f24024u, new f0(z3, d2, a10, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        return kotlin.jvm.internal.a(((a0) obj).f29935a, this.f29935a);
    }

    public final int hashCode() {
        return this.f29935a.hashCode();
    }
}

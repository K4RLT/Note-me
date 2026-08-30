package j0;
import l.a;

import b2.k1;
import b2.l0;
import b2.r0;
import b2.x;
import java.util.List;
import k0.a0;
import k0.a1;
import k1.u;
import m2.q0;
import z1.o0;

/* loaded from: classes.dex */
public final class h extends b2.k implements x, b2.n, b2.o {
    public j K;
    public final o L;

    public h(m2.g gVar, q0 q0Var, q2.h hVar, df.l lVar, int i, boolean z3, int i10, int i11, List list, df.l lVar2, j jVar, u uVar, g0.i iVar) {
        this.K = jVar;
        o oVar = new o(gVar, q0Var, hVar, lVar, i, z3, i10, i11, list, lVar2, jVar, uVar, iVar, null);
        Y0(oVar);
        this.L = oVar;
        if (this.K != null) {
            return;
        }
        w.a.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        l4.a.p();
        throw null;
    }

    @Override // b2.x
    public final int A(r0 r0Var, o0 o0Var, int i) {
        return this.L.A(r0Var, o0Var, i);
    }

    @Override // b2.x
    public final int J(r0 r0Var, o0 o0Var, int i) {
        return this.L.J(r0Var, o0Var, i);
    }

    @Override // d1.q
    public final boolean N0() {
        return false;
    }

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, o0 o0Var, long j10) {
        return this.L.c(r0Var, o0Var, j10);
    }

    @Override // b2.n
    public final void e0(l0 l0Var) {
        this.L.e0(l0Var);
    }

    @Override // b2.o
    public final void h0(k1 k1Var) {
        j jVar = this.K;
        if (jVar != null) {
            jVar.f18736x = a(jVar.f18736x, k1Var, null, 2);
            a1 a1Var = jVar.f18734v;
            long j10 = jVar.f18733u;
            a1Var.f19217a = false;
            a0 a0Var = a1Var.e;
            if (a0Var != null) {
                a0Var.invoke(Long.valueOf(j10));
            }
        }
    }

    @Override // b2.x
    public final int n(r0 r0Var, o0 o0Var, int i) {
        return this.L.n(r0Var, o0Var, i);
    }

    @Override // b2.x
    public final int v(r0 r0Var, o0 o0Var, int i) {
        return this.L.v(r0Var, o0Var, i);
    }
}

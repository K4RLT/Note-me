package b0;
import a0.k0;
import d1.q;
import t.z0;

import b2.e2;

/* loaded from: classes.dex */
public final class z0 extends q implements e2 {
    public df.a I;
    public v0 J;
    public t.z0 K;
    public boolean L;
    public j2.h M;
    public final x0 N = new x0(this, 0);
    public x0 O;

    public z0(df.a aVar, v0 v0Var, t.z0 z0Var, boolean z3) {
        this.I = aVar;
        this.J = v0Var;
        this.K = z0Var;
        this.L = z3;
        Y0();
    }

    @Override // b2.e2
    public final void F0(j2.j jVar) {
        kf.g[] gVarArr = j2.u.f18865a;
        j2.v vVar = j2.s.f18849m;
        kf.g[] gVarArr2 = j2.u.f18865a;
        kf.g gVar = gVarArr2[6];
        jVar.k(vVar, Boolean.TRUE);
        jVar.k(j2.s.L, this.N);
        t.z0 z0Var = this.K;
        j2.h hVar = this.M;
        if (z0Var == t.z0.f25597u) {
            if (hVar != null) {
                j2.v vVar2 = j2.s.f18857u;
                kf.g gVar2 = gVarArr2[12];
                jVar.k(vVar2, hVar);
            } else {
                kotlin.jvm.internal.l.h("scrollAxisRange");
                throw null;
            }
        } else if (hVar != null) {
            j2.v vVar3 = j2.s.f18856t;
            kf.g gVar3 = gVarArr2[11];
            jVar.k(vVar3, hVar);
        } else {
            kotlin.jvm.internal.l.h("scrollAxisRange");
            throw null;
        }
        x0 x0Var = this.O;
        if (x0Var != null) {
            jVar.k(j2.i.f18793f, new j2.a(null, x0Var));
        }
        jVar.k(j2.i.B, new j2.a(null, new k0(23, new w0(this, 0))));
        j2.b e = this.J.e();
        j2.v vVar4 = j2.s.f18843f;
        kf.g gVar4 = gVarArr2[22];
        jVar.k(vVar4, e);
    }

    @Override // q
    public final boolean N0() {
        return false;
    }

    public final void Y0() {
        x0 x0Var;
        this.M = new j2.h(new w0(this, 1), new w0(this, 2));
        if (this.L) {
            x0Var = new x0(this, 1);
        } else {
            x0Var = null;
        }
        this.O = x0Var;
    }
}

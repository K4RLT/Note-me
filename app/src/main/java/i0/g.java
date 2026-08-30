package i0;
import m.h;
import s.i;

import b2.e2;
import g0.e1;
import g0.f2;
import g0.i0;
import j2.u;
import j2.v;
import k0.j1;
import m2.g0;
import m2.p0;
import pe.z;
import r2.b0;
import r2.c0;
import r2.x;

/* loaded from: classes.dex */
public final class g extends b2.k implements e2 {
    public c0 K;
    public x L;
    public e1 M;
    public boolean N;
    public boolean O;
    public r2.q P;
    public j1 Q;
    public r2.j R;
    public i1.o S;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b1(g gVar, e1 e1Var, String str, boolean z3) {
        if (z3) {
            b0 b0Var = e1Var.e;
            i0 i0Var = e1Var.f17081v;
            z zVar = null;
            if (b0Var != null) {
                x g8 = e1Var.f17065d.g(qe.h(new Object(), new r2.a(str, 1)));
                b0Var.a(null, g8);
                i0Var.invoke(g8);
                zVar = z.f22715a;
            }
            if (zVar == null) {
                int length = str.length();
                i0Var.invoke(new x(str, g0.b(length, length), 4));
            }
        }
    }

    @Override // b2.e2
    public final void F0(j2.j jVar) {
        boolean z3 = this.O;
        m2.g gVar = this.L.f24515a;
        kf.g[] gVarArr = u.f18865a;
        v vVar = j2.s.D;
        kf.g[] gVarArr2 = u.f18865a;
        kf.g gVar2 = gVarArr2[17];
        jVar.k(vVar, gVar);
        m2.g gVar3 = this.K.f24483a;
        v vVar2 = j2.s.E;
        kf.g gVar4 = gVarArr2[18];
        jVar.k(vVar2, gVar3);
        long j10 = this.L.f24516b;
        v vVar3 = j2.s.F;
        kf.g gVar5 = gVarArr2[19];
        jVar.k(vVar3, new p0(j10));
        v vVar4 = j2.s.f18854r;
        kf.g gVar6 = gVarArr2[9];
        jVar.k(vVar4, e1.j.f15885a);
        jVar.k(j2.i.f18794g, new j2.a(null, new f(this, 0)));
        boolean z9 = this.N;
        z zVar = z.f22715a;
        if (!z9) {
            jVar.k(j2.i, zVar);
        }
        if (z3) {
            jVar.k(j2.s.J, zVar);
        }
        boolean z10 = this.N;
        v vVar5 = j2.s.M;
        kf.g gVar7 = gVarArr2[25];
        jVar.k(vVar5, Boolean.valueOf(z10));
        u.a(jVar, new f(this, 1));
        int i = 2;
        if (z10) {
            jVar.k(j2.i.f18796j, new j2.a(null, new f(this, i)));
            jVar.k(j2.i.f18800n, new j2.a(null, new f(this, jVar)));
        }
        jVar.k(j2.i.i, new j2.a(null, new f2(i, this)));
        int i10 = this.R.e;
        e eVar = new e(this, 3);
        jVar.k(j2.s.G, new r2.i(i10));
        jVar.k(j2.i.f18801o, new j2.a(null, eVar));
        jVar.k(j2.i.f18790b, new j2.a(null, new e(this, 4)));
        jVar.k(j2.i.f18791c, new j2.a(null, new e(this, 5)));
        if (!p0.b(this.L.f24516b) && !z3) {
            jVar.k(j2.i.f18802p, new j2.a(null, new e(this, 6)));
            if (this.N) {
                jVar.k(j2.i.f18803q, new j2.a(null, new e(this, 1)));
            }
        }
        if (this.N) {
            jVar.k(j2.i.f18804r, new j2.a(null, new e(this, 2)));
        }
    }

    @Override // b2.e2
    public final boolean H0() {
        return true;
    }
}

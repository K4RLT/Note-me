package h1;

import a0.o;
import b2.l0;
import b2.n;
import b2.q1;
import com.google.android.gms.internal.ads.wd0;
import d1.q;
import df.l;
import y2.m;
import ya.vd;

/* loaded from: classes.dex */
public final class b extends q implements q1, a, n {
    public final d I;
    public boolean J;
    public l K;

    public b(d dVar, l lVar) {
        this.I = dVar;
        this.K = lVar;
        dVar.f17824u = this;
    }

    @Override // d1.q
    public final void S0() {
        Y0();
    }

    @Override // b2.n
    public final void W() {
        Y0();
    }

    public final void Y0() {
        this.J = false;
        this.I.f17825v = null;
        b2.l.k(this);
    }

    @Override // b2.j
    public final void Z() {
        Y0();
    }

    @Override // h1.a
    public final y2.c a() {
        return b2.l.u(this).S;
    }

    @Override // b2.j
    public final void d() {
        Y0();
    }

    @Override // h1.a
    public final long e() {
        return vd.c(b2.l.s(this, 128).f31771w);
    }

    @Override // b2.n
    public final void e0(l0 l0Var) {
        boolean z3 = this.J;
        d dVar = this.I;
        if (!z3) {
            dVar.f17825v = null;
            b2.l.q(this, new o(this, 14, dVar));
            if (dVar.f17825v != null) {
                this.J = true;
            } else {
                throw wd0.m("DrawResult not defined, did you forget to call onDraw?");
            }
        }
        pd.c cVar = dVar.f17825v;
        cVar.getClass();
        ((l) cVar.f22681u).invoke(l0Var);
    }

    @Override // h1.a
    public final m getLayoutDirection() {
        return b2.l.u(this).T;
    }

    @Override // b2.q1
    public final void r0() {
        Y0();
    }

    @Override // d1.q
    public final void R0() {
    }
}

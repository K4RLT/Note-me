package w7;
import k1.l0;
import k1.r;
import p7.p0;
import p7.q0;
import r0.e1;
import r0.i1;
import r0.y;

import java.util.List;

/* loaded from: classes.dex */
public final class e3 {
    public final i1 A;
    public final e1 B;
    public final i1 C;
    public final e1 D;
    public final i1 E;
    public final i1 F;
    public final i1 G;
    public final i1 H;
    public final i1 I;
    public final i1 J;
    public final i1 K;
    public final i1 L;

    /* renamed from: a, reason: collision with root package name */
    public final b1.v f28125a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f28126b;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f28127c;

    /* renamed from: d, reason: collision with root package name */
    public final i1 f28128d;
    public final i1 e;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f28129f;

    /* renamed from: g, reason: collision with root package name */
    public final i1 f28130g;

    /* renamed from: h, reason: collision with root package name */
    public final i1 f28131h;
    public final i1 i;

    /* renamed from: j, reason: collision with root package name */
    public final i1 f28132j;

    /* renamed from: k, reason: collision with root package name */
    public final i1 f28133k;

    /* renamed from: l, reason: collision with root package name */
    public final i1 f28134l;

    /* renamed from: m, reason: collision with root package name */
    public final i1 f28135m;

    /* renamed from: n, reason: collision with root package name */
    public final i1 f28136n;

    /* renamed from: o, reason: collision with root package name */
    public final i1 f28137o;

    /* renamed from: p, reason: collision with root package name */
    public final i1 f28138p;

    /* renamed from: q, reason: collision with root package name */
    public final i1 f28139q;

    /* renamed from: r, reason: collision with root package name */
    public final i1 f28140r;

    /* renamed from: s, reason: collision with root package name */
    public final e1 f28141s;

    /* renamed from: t, reason: collision with root package name */
    public final e1 f28142t;

    /* renamed from: u, reason: collision with root package name */
    public final e1 f28143u;

    /* renamed from: v, reason: collision with root package name */
    public final e1 f28144v;

    /* renamed from: w, reason: collision with root package name */
    public final e1 f28145w;

    /* renamed from: x, reason: collision with root package name */
    public final e1 f28146x;

    /* renamed from: y, reason: collision with root package name */
    public final e1 f28147y;

    /* renamed from: z, reason: collision with root package name */
    public final i1 f28148z;

    public e3() {
        r[] rVarArr = {new r(l0.d(4280953392L)), new r(l0.d(4279916236L)), new r(l0.d(4291574298L)), new r(l0.d(4280981056L)), new r(l0.d(4291595290L)), new r(l0.d(4287310540L)), new r(l0.d(4291566190L)), new r(l0.d(4287137928L))};
        b1.v vVar = new b1.v();
        vVar.addAll(qe.k.t(rVarArr));
        this.f28125a = vVar;
        Boolean bool = Boolean.FALSE;
        this.f28126b = y.B(bool);
        this.f28127c = y.B(bool);
        this.f28128d = y.B(bool);
        this.e = y.B(bool);
        this.f28129f = y.B(bool);
        this.f28130g = y.B(bool);
        this.f28131h = y.B(bool);
        this.i = y.B(bool);
        this.f28132j = y.B(bool);
        this.f28133k = y.B(bool);
        this.f28134l = y.B("sans");
        this.f28135m = y.B(vVar.get(0));
        this.f28136n = y.B(vVar.get(0));
        this.f28137o = y.B(vVar.get(3));
        this.f28138p = y.B(vVar.get(0));
        this.f28139q = y.B(vVar.get(0));
        this.f28140r = y.B(vVar.get(0));
        this.f28141s = new e1(5.0f);
        this.f28142t = new e1(5.0f);
        this.f28143u = new e1(5.0f);
        this.f28144v = new e1(5.0f);
        this.f28145w = new e1(15.0f);
        this.f28146x = new e1(18.0f);
        this.f28147y = new e1(12.0f);
        this.f28148z = y.B(((p0) qe.l.w(q0.f22560b)).f22551a);
        this.A = y.B("unicornio");
        this.B = new e1(0.0f);
        this.C = y.B(qe.m.h(-1689274, -12223587, -918802, -5711140));
        this.D = new e1(0.12f);
        this.E = y.B(bool);
        this.F = y.B(bool);
        this.G = y.B(bool);
        this.H = y.B(0);
        this.I = y.B(0);
        this.J = y.B(0);
        this.K = y.B(bool);
        this.L = y.B(null);
    }

    public final void A(boolean z3) {
        this.F.setValue(Boolean.valueOf(z3));
    }

    public final void B(boolean z3) {
        this.E.setValue(Boolean.valueOf(z3));
    }

    public final void C(boolean z3) {
        this.f28132j.setValue(Boolean.valueOf(z3));
    }

    public final void D(float f10) {
        if (j()) {
            this.f28142t.i(f10);
            return;
        }
        if (c()) {
            this.f28143u.i(f10);
        } else if (i()) {
            this.f28144v.i(f10);
        } else {
            this.f28141s.i(f10);
        }
    }

    public final void E(boolean z3) {
        this.f28130g.setValue(Boolean.valueOf(z3));
    }

    public final boolean a() {
        return ((Boolean) this.f28126b.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.f28129f.getValue()).booleanValue();
    }

    public final List d() {
        return (List) this.C.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.f28133k.getValue()).booleanValue();
    }

    public final String f() {
        return (String) this.A.getValue();
    }

    public final float g() {
        return this.B.h();
    }

    public final boolean h() {
        return ((Boolean) this.f28131h.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.f28128d.getValue()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) this.f28127c.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    public final long l() {
        if (j()) {
            return ((r) this.f28136n.getValue()).f19523a;
        }
        if (c()) {
            return ((r) this.f28137o.getValue()).f19523a;
        }
        if (i()) {
            return ((r) this.f28138p.getValue()).f19523a;
        }
        if (b()) {
            return ((r) this.f28139q.getValue()).f19523a;
        }
        if (r()) {
            return ((r) this.f28140r.getValue()).f19523a;
        }
        return ((r) this.f28135m.getValue()).f19523a;
    }

    public final boolean m() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    public final boolean n() {
        return ((Boolean) this.f28132j.getValue()).booleanValue();
    }

    public final float o() {
        if (j()) {
            return this.f28142t.h();
        }
        if (c()) {
            return this.f28143u.h();
        }
        if (i()) {
            return this.f28144v.h();
        }
        return this.f28141s.h();
    }

    public final int p() {
        return ((Number) this.H.getValue()).intValue();
    }

    public final int q() {
        return ((Number) this.J.getValue()).intValue();
    }

    public final boolean r() {
        return ((Boolean) this.f28130g.getValue()).booleanValue();
    }

    public final void s(boolean z3) {
        this.f28126b.setValue(Boolean.valueOf(z3));
    }

    public final void t(boolean z3) {
        this.e.setValue(Boolean.valueOf(z3));
    }

    public final void u(boolean z3) {
        this.f28129f.setValue(Boolean.valueOf(z3));
    }

    public final void v(boolean z3) {
        this.f28133k.setValue(Boolean.valueOf(z3));
    }

    public final void w(boolean z3) {
        this.f28131h.setValue(Boolean.valueOf(z3));
    }

    public final void x(boolean z3) {
        this.f28128d.setValue(Boolean.valueOf(z3));
    }

    public final void y(boolean z3) {
        this.f28127c.setValue(Boolean.valueOf(z3));
    }

    public final void z(boolean z3) {
        this.i.setValue(Boolean.valueOf(z3));
    }
}

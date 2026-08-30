package b1;
import n.j0;
import p.b;
import p.h;
import p.l;

/* loaded from: classes.dex */
public final class m0 extends d {

    /* renamed from: o, reason: collision with root package name */
    public final d f1371o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1372p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1373q;

    /* renamed from: r, reason: collision with root package name */
    public df.l f1374r;

    /* renamed from: s, reason: collision with root package name */
    public df.l f1375s;

    /* renamed from: t, reason: collision with root package name */
    public final long f1376t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m0(b1.d r8, df.l r9, df.l r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            a1.j r0 = b1.p.f1385a
            if (r8 == 0) goto La
            df.l r0 = r8.e()
            if (r0 != 0) goto Le
        La:
            b1.c r0 = b1.p.f1392j
            df.l r0 = r0.e
        Le:
            df.l r5 = b1.l(r9, r0, r11)
            if (r8 == 0) goto L1a
            df.l r9 = r8.i()
            if (r9 != 0) goto L1e
        L1a:
            b1.c r9 = b1.p.f1392j
            df.l r9 = r9.f1321f
        L1e:
            df.l r6 = b1.b(r10, r9)
            r2 = 0
            b1.m r4 = b1.m.f1366y
            r1 = r7
            r1.<init>(r2, r4, r5, r6)
            r1.f1371o = r8
            r1.f1372p = r11
            r1.f1373q = r12
            df.l r8 = r1.e
            r1.f1374r = r8
            df.l r8 = r1.f1321f
            r1.f1375s = r8
            long r8 = z0.h.b()
            r1.f1376t = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.m0.<init>(b1.d, df.l, df.l, boolean, boolean):void");
    }

    @Override // b1.d
    public final void B(j0 j0Var) {
        w.k();
        throw null;
    }

    @Override // b1.d
    public final d C(df.l lVar, df.l lVar2) {
        df.l l10 = l(lVar, this.f1374r, true);
        df.l b10 = b(lVar2, this.f1375s);
        if (!this.f1372p) {
            return new m0(D().C(null, b10), l10, b10, false, true);
        }
        return D().C(l10, b10);
    }

    public final d D() {
        d dVar = this.f1371o;
        if (dVar == null) {
            return p.f1392j;
        }
        return dVar;
    }

    @Override // b1.d, b1.i
    public final void c() {
        d dVar;
        this.f1347c = true;
        if (this.f1373q && (dVar = this.f1371o) != null) {
            dVar.c();
        }
    }

    @Override // b1.i
    public final m d() {
        return D().d();
    }

    @Override // b1.d, b1.i
    public final df.l e() {
        return this.f1374r;
    }

    @Override // b1.d, b1.i
    public final boolean f() {
        return D().f();
    }

    @Override // b1.i
    public final long g() {
        return D().g();
    }

    @Override // b1.d, b1.i
    public final int h() {
        return D().h();
    }

    @Override // b1.d, b1.i
    public final df.l i() {
        return this.f1375s;
    }

    @Override // b1.d, b1.i
    public final void k() {
        w.k();
        throw null;
    }

    @Override // b1.d, b1.i
    public final void l() {
        w.k();
        throw null;
    }

    @Override // b1.d, b1.i
    public final void m() {
        D().m();
    }

    @Override // b1.d, b1.i
    public final void n(h0 h0Var) {
        D().n(h0Var);
    }

    @Override // b1.i
    public final void r(m mVar) {
        w.k();
        throw null;
    }

    @Override // b1.i
    public final void s(long j10) {
        w.k();
        throw null;
    }

    @Override // b1.d, b1.i
    public final void t(int i) {
        D().t(i);
    }

    @Override // b1.d, b1.i
    public final i u(df.l lVar) {
        df.l l10 = l(lVar, this.f1374r, true);
        if (!this.f1372p) {
            return h(D().u(null), l10, true);
        }
        return D().u(l10);
    }

    @Override // b1.d
    public final w w() {
        return D().w();
    }

    @Override // b1.d
    public final j0 x() {
        return D().x();
    }

    @Override // b1.d
    /* renamed from: y */
    public final df.l e() {
        return this.f1374r;
    }
}

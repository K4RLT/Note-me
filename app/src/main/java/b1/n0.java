package b1;
import p.h;
import p.l;

/* loaded from: classes.dex */
public final class n0 extends i {
    public final i e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1380f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1381g;

    /* renamed from: h, reason: collision with root package name */
    public df.l f1382h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(i iVar, df.l lVar, boolean z3, boolean z9) {
        super(0L, m.f1366y);
        df.l e;
        a1.j jVar = p.f1385a;
        this.e = iVar;
        this.f1380f = z3;
        this.f1381g = z9;
        this.f1382h = l(lVar, (iVar == null || (e = iVar.e()) == null) ? p.f1392j.e : e, z3);
        this.i = z0.h.b();
    }

    @Override // b1.i
    public final void c() {
        i iVar;
        this.f1347c = true;
        if (this.f1381g && (iVar = this.e) != null) {
            iVar.c();
        }
    }

    @Override // b1.i
    public final m d() {
        return v().d();
    }

    @Override // b1.i
    public final df.l e() {
        return this.f1382h;
    }

    @Override // b1.i
    public final boolean f() {
        return v().f();
    }

    @Override // b1.i
    public final long g() {
        return v().g();
    }

    @Override // b1.i
    public final df.l i() {
        return null;
    }

    @Override // b1.i
    public final void k() {
        w.k();
        throw null;
    }

    @Override // b1.i
    public final void l() {
        w.k();
        throw null;
    }

    @Override // b1.i
    public final void m() {
        v().m();
    }

    @Override // b1.i
    public final void n(h0 h0Var) {
        v().n(h0Var);
    }

    @Override // b1.i
    public final i u(df.l lVar) {
        df.l l10 = l(lVar, this.f1382h, true);
        if (!this.f1380f) {
            return h(v().u(null), l10, true);
        }
        return v().u(l10);
    }

    public final i v() {
        i iVar = this.e;
        if (iVar == null) {
            return p.f1392j;
        }
        return iVar;
    }
}

package b1;
import p.l;

/* loaded from: classes.dex */
public final class f extends i {
    public final df.l e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1335f;

    public f(long j10, m mVar, df.l lVar, i iVar) {
        super(j10, mVar);
        this.e = lVar;
        this.f1335f = iVar;
        iVar.k();
    }

    @Override // b1.i
    public final void c() {
        i iVar = this.f1335f;
        if (!this.f1347c) {
            if (this.f1346b != iVar.g()) {
                a();
            }
            iVar.l();
            this.f1347c = true;
            synchronized (p.f1387c) {
                o();
            }
        }
    }

    @Override // b1.i
    public final df.l e() {
        return this.e;
    }

    @Override // b1.i
    public final boolean f() {
        return true;
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
    public final void n(h0 h0Var) {
        a1.j jVar = p.f1385a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // b1.i
    public final i u(df.l lVar) {
        return new f(this.f1346b, this.f1345a, l(lVar, this.e, true), this.f1335f);
    }

    @Override // b1.i
    public final void m() {
    }
}

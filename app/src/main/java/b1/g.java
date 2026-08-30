package b1;
import p.d;
import p.l;

/* loaded from: classes.dex */
public final class g extends i {
    public final df.l e;

    /* renamed from: f, reason: collision with root package name */
    public int f1337f;

    public g(long j10, m mVar, df.l lVar) {
        super(j10, mVar);
        this.e = lVar;
        this.f1337f = 1;
    }

    @Override // b1.i
    public final void c() {
        if (!this.f1347c) {
            l();
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
        this.f1337f++;
    }

    @Override // b1.i
    public final void l() {
        int i = this.f1337f - 1;
        this.f1337f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // b1.i
    public final void n(h0 h0Var) {
        a1.j jVar = p.f1385a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // b1.i
    public final i u(df.l lVar) {
        d(this);
        return new f(this.f1346b, this.f1345a, l(lVar, this.e, true), this);
    }

    @Override // b1.i
    public final void m() {
    }
}

package b1;

/* loaded from: classes.dex */
public final class d0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public v0.b f1328c;

    /* renamed from: d, reason: collision with root package name */
    public int f1329d;
    public int e;

    public d0(long j10, v0.b bVar) {
        super(j10);
        this.f1328c = bVar;
    }

    @Override // b1.j0
    public final void a(j0 j0Var) {
        synchronized (w.f1403a) {
            j0Var.getClass();
            this.f1328c = ((d0) j0Var).f1328c;
            this.f1329d = ((d0) j0Var).f1329d;
            this.e = ((d0) j0Var).e;
        }
    }

    @Override // b1.j0
    public final j0 b(long j10) {
        return new d0(j10, this.f1328c);
    }
}

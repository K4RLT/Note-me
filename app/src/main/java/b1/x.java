package b1;

/* loaded from: classes.dex */
public final class x extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public w0.b f1405c;

    /* renamed from: d, reason: collision with root package name */
    public int f1406d;

    public x(long j10, w0.b bVar) {
        super(j10);
        this.f1405c = bVar;
    }

    @Override // b1.j0
    public final void a(j0 j0Var) {
        j0Var.getClass();
        x xVar = (x) j0Var;
        synchronized (w.f1404b) {
            this.f1405c = xVar.f1405c;
            this.f1406d = xVar.f1406d;
        }
    }

    @Override // b1.j0
    public final j0 b(long j10) {
        return new x(j10, this.f1405c);
    }
}

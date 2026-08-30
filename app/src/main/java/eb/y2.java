package eb;

/* loaded from: classes.dex */
public final class y2 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final long f16464u;

    /* renamed from: v, reason: collision with root package name */
    public final long f16465v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j6.c f16466w;

    public y2(j6.c cVar, long j10, long j11) {
        this.f16466w = cVar;
        this.f16464u = j10;
        this.f16465v = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y0 h3 = ((v2) this.f16466w.f18915w).h();
        a6.x xVar = new a6.x(12);
        xVar.f297v = this;
        h3.D(xVar);
    }
}

package pf;

/* loaded from: classes.dex */
public final class s0 extends t0 {

    /* renamed from: w, reason: collision with root package name */
    public final Runnable f22790w;

    public s0(Runnable runnable, long j10) {
        super(j10);
        this.f22790w = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22790w.run();
    }

    @Override // pf.t0
    public final String toString() {
        return super.toString() + this.f22790w;
    }
}

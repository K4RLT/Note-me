package pf;

/* loaded from: classes.dex */
public final class r0 extends t0 {

    /* renamed from: w, reason: collision with root package name */
    public final l f22784w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v0 f22785x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(v0 v0Var, long j10, l lVar) {
        super(j10);
        this.f22785x = v0Var;
        this.f22784w = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22784w.C(this.f22785x);
    }

    @Override // pf.t0
    public final String toString() {
        return super.toString() + this.f22784w;
    }
}

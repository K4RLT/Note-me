package eb;

/* loaded from: classes.dex */
public final class f2 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16131u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f16132v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f16133w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f16134x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f16135y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ z f16136z;

    public f2(t1 t1Var, o1 o1Var, long j10, boolean z3, o1 o1Var2) {
        this.f16134x = o1Var;
        this.f16132v = j10;
        this.f16133w = z3;
        this.f16135y = o1Var2;
        this.f16136z = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16131u) {
            case 0:
                t1 t1Var = (t1) this.f16136z;
                o1 o1Var = (o1) this.f16134x;
                t1Var.G(o1Var);
                t1.I(t1Var, o1Var, this.f16132v, false, this.f16133w);
                t1.J(t1Var, o1Var, (o1) this.f16135y);
                return;
            default:
                ((l2) this.f16136z).F((k2) this.f16134x, (k2) this.f16135y, this.f16132v, this.f16133w, null);
                return;
        }
    }

    public f2(l2 l2Var, k2 k2Var, k2 k2Var2, long j10, boolean z3) {
        this.f16134x = k2Var;
        this.f16135y = k2Var2;
        this.f16132v = j10;
        this.f16133w = z3;
        this.f16136z = l2Var;
    }
}

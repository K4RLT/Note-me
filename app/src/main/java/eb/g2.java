package eb;

import com.google.android.gms.internal.measurement.p6;

/* loaded from: classes.dex */
public final class g2 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o1 f16144u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f16145v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f16146w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f16147x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o1 f16148y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ t1 f16149z;

    public g2(t1 t1Var, o1 o1Var, long j10, long j11, boolean z3, o1 o1Var2) {
        this.f16144u = o1Var;
        this.f16145v = j10;
        this.f16146w = j11;
        this.f16147x = z3;
        this.f16148y = o1Var2;
        this.f16149z = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t1 t1Var = this.f16149z;
        o1 o1Var = this.f16144u;
        t1Var.G(o1Var);
        p6.a();
        if (!((d1) t1Var.f3443v).A.F(null, v.T0)) {
            t1Var.D(this.f16145v, false);
        }
        t1.I(t1Var, o1Var, this.f16146w, true, this.f16147x);
        t1.J(t1Var, o1Var, this.f16148y);
    }
}

package eb;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class b2 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16067u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f16068v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t1 f16069w;

    public /* synthetic */ b2(t1 t1Var, long j10, int i) {
        this.f16067u = i;
        this.f16068v = j10;
        this.f16069w = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16067u) {
            case 0:
                t1 t1Var = this.f16069w;
                s0 s0Var = t1Var.s().G;
                long j10 = this.f16068v;
                s0Var.b(j10);
                t1Var.f().H.f(Long.valueOf(j10), "Session timeout duration set");
                return;
            default:
                long j11 = this.f16068v;
                t1 t1Var2 = this.f16069w;
                t1Var2.D(j11, true);
                ((d1) t1Var2.f3443v).p().E(new AtomicReference());
                return;
        }
    }
}

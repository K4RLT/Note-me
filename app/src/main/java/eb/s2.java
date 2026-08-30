package eb;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class s2 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16369u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r2 f16370v;

    public /* synthetic */ s2(r2 r2Var, int i) {
        this.f16369u = i;
        this.f16370v = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16369u) {
            case 0:
                n2 n2Var = this.f16370v.f16355w;
                n2Var.f16280y = null;
                n2Var.M();
                return;
            default:
                n2 n2Var2 = this.f16370v.f16355w;
                ComponentName componentName = new ComponentName(((d1) n2Var2.f3443v).f16102u, "com.google.android.gms.measurement.AppMeasurementService");
                n2Var2.u();
                if (n2Var2.f16280y != null) {
                    n2Var2.f16280y = null;
                    n2Var2.f().I.f(componentName, "Disconnected from device MeasurementService");
                    n2Var2.u();
                    n2Var2.G();
                    return;
                }
                return;
        }
    }
}

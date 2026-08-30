package eb;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class q2 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16331u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o3 f16332v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n2 f16333w;

    public /* synthetic */ q2(n2 n2Var, o3 o3Var, int i) {
        this.f16331u = i;
        this.f16332v = o3Var;
        this.f16333w = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16331u) {
            case 0:
                o3 o3Var = this.f16332v;
                n2 n2Var = this.f16333w;
                d0 d0Var = n2Var.f16280y;
                if (d0Var == null) {
                    n2Var.f().A.g("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    d0Var.r2(o3Var);
                } catch (RemoteException e) {
                    n2Var.f().A.f(e, "Failed to reset data on the service: remote exception");
                }
                n2Var.O();
                return;
            default:
                o3 o3Var2 = this.f16332v;
                n2 n2Var2 = this.f16333w;
                d0 d0Var2 = n2Var2.f16280y;
                if (d0Var2 == null) {
                    n2Var2.f().A.g("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    d0Var2.J2(o3Var2);
                    n2Var2.O();
                    return;
                } catch (RemoteException e8) {
                    n2Var2.f().A.f(e8, "Failed to send measurementEnabled to the service");
                    return;
                }
        }
    }
}

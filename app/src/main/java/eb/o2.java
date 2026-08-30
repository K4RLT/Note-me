package eb;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class o2 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16286u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ n2 f16287v;

    public /* synthetic */ o2(int i) {
        this.f16286u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16286u) {
            case 0:
                n2 n2Var = this.f16287v;
                d0 d0Var = n2Var.f16280y;
                if (d0Var == null) {
                    n2Var.f().A.g("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    d0Var.k3(n2Var.P(false));
                    n2Var.O();
                    return;
                } catch (RemoteException e) {
                    n2Var.f().A.f(e, "Failed to send Dma consent settings to the service");
                    return;
                }
            default:
                n2 n2Var2 = this.f16287v;
                d0 d0Var2 = n2Var2.f16280y;
                if (d0Var2 == null) {
                    n2Var2.f().A.g("Failed to send storage consent settings to service");
                    return;
                }
                try {
                    d0Var2.a4(n2Var2.P(false));
                    n2Var2.O();
                    return;
                } catch (RemoteException e8) {
                    n2Var2.f().A.f(e8, "Failed to send storage consent settings to the service");
                    return;
                }
        }
    }
}

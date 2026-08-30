package z8;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.pu;
import g9.e2;
import g9.k0;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f32011u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f32012v;

    public /* synthetic */ v(k kVar, int i) {
        this.f32011u = i;
        this.f32012v = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32011u) {
            case 0:
                k kVar = this.f32012v;
                try {
                    e2 e2Var = kVar.f31994u;
                    e2Var.getClass();
                    try {
                        k0 k0Var = (k0) e2Var.f17621j;
                        if (k0Var != null) {
                            k0Var.a();
                            return;
                        }
                        return;
                    } catch (RemoteException e) {
                        l9.i.i(e, "#007 Could not call remote method.");
                        return;
                    }
                } catch (IllegalStateException e8) {
                    pu.a(kVar.getContext()).c("BaseAdView.pause", e8);
                    return;
                }
            case 1:
                k kVar2 = this.f32012v;
                try {
                    e2 e2Var2 = kVar2.f31994u;
                    e2Var2.getClass();
                    try {
                        k0 k0Var2 = (k0) e2Var2.f17621j;
                        if (k0Var2 != null) {
                            k0Var2.b();
                            return;
                        }
                        return;
                    } catch (RemoteException e10) {
                        l9.i.i(e10, "#007 Could not call remote method.");
                        return;
                    }
                } catch (IllegalStateException e11) {
                    pu.a(kVar2.getContext()).c("BaseAdView.resume", e11);
                    return;
                }
            default:
                k kVar3 = this.f32012v;
                try {
                    e2 e2Var3 = kVar3.f31994u;
                    e2Var3.getClass();
                    try {
                        k0 k0Var3 = (k0) e2Var3.f17621j;
                        if (k0Var3 != null) {
                            k0Var3.y();
                            return;
                        }
                        return;
                    } catch (RemoteException e12) {
                        l9.i.i(e12, "#007 Could not call remote method.");
                        return;
                    }
                } catch (IllegalStateException e13) {
                    pu.a(kVar3.getContext()).c("BaseAdView.destroy", e13);
                    return;
                }
        }
    }
}

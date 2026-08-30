package g9;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.hq0;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qh;

/* loaded from: classes.dex */
public final class s extends ph implements z0 {

    /* renamed from: u, reason: collision with root package name */
    public final com.google.ads.mediation.d f17700u;

    public s(com.google.ads.mediation.d dVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f17700u = dVar;
    }

    @Override // g9.z0
    public final void E() {
        com.google.ads.mediation.d dVar = this.f17700u;
        if (dVar != null) {
            hq0 hq0Var = (hq0) dVar.f4205d;
            hq0Var.getClass();
            fa.y.d("#008 Must be called on the main UI thread.");
            l9.i.a("Adapter called onAdClosed.");
            try {
                ((as) hq0Var.f6872v).b();
            } catch (RemoteException e) {
                l9.i.i(e, "#007 Could not call remote method.");
            }
        }
    }

    @Override // g9.z0
    public final void s2(y1 y1Var) {
        if (this.f17700u != null) {
            y1Var.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        return false;
                    }
                } else {
                    E();
                }
            } else {
                y();
            }
        } else {
            y1 y1Var = (y1) qh.b(parcel, y1.CREATOR);
            qh.f(parcel);
            s2(y1Var);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // g9.z0
    public final void y() {
        com.google.ads.mediation.d dVar = this.f17700u;
        if (dVar != null) {
            hq0 hq0Var = (hq0) dVar.f4205d;
            hq0Var.getClass();
            fa.y.d("#008 Must be called on the main UI thread.");
            l9.i.a("Adapter called onAdOpened.");
            try {
                ((as) hq0Var.f6872v).g();
            } catch (RemoteException e) {
                l9.i.i(e, "#007 Could not call remote method.");
            }
        }
    }

    @Override // g9.z0
    public final void a() {
    }

    @Override // g9.z0
    public final void k() {
    }
}

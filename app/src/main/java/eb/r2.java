package eb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.pu1;

/* loaded from: classes.dex */
public final class r2 implements ServiceConnection, fa.b, fa.c {

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f16353u;

    /* renamed from: v, reason: collision with root package name */
    public volatile i0 f16354v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n2 f16355w;

    public r2(n2 n2Var) {
        this.f16355w = n2Var;
    }

    @Override // fa.b
    public final void R(int i) {
        fa.y.d("MeasurementServiceConnection.onConnectionSuspended");
        n2 n2Var = this.f16355w;
        n2Var.f().H.g("Service connection suspended");
        n2Var.h().D(new s2(this, 1));
    }

    @Override // fa.b
    public final void g0() {
        fa.y.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                fa.y.h(this.f16354v);
                this.f16355w.h().D(new pu1(13, this, (d0) this.f16354v.t(), false));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f16354v = null;
                this.f16353u = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object e0Var;
        fa.y.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f16353u = false;
                this.f16355w.f().A.g("Service connected with null binder");
                return;
            }
            Object obj = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof d0) {
                        e0Var = (d0) queryLocalInterface;
                    } else {
                        e0Var = new e0(iBinder);
                    }
                    obj = e0Var;
                    this.f16355w.f().I.g("Bound to IMeasurementService interface");
                } else {
                    this.f16355w.f().A.f(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                this.f16355w.f().A.g("Service connect failed to get IMeasurementService");
            }
            if (obj == null) {
                this.f16353u = false;
                try {
                    ka.a b10 = ka.a.b();
                    n2 n2Var = this.f16355w;
                    b10.c(((d1) n2Var.f3443v).f16102u, n2Var.f16279x);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f16355w.h().D(new ou1(15, this, obj, false));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        fa.y.d("MeasurementServiceConnection.onServiceDisconnected");
        n2 n2Var = this.f16355w;
        n2Var.f().H.g("Service disconnected");
        n2Var.h().D(new iv1(14, this, componentName, false));
    }

    @Override // fa.c
    public final void r0(ca.b bVar) {
        fa.y.d("MeasurementServiceConnection.onConnectionFailed");
        k0 k0Var = ((d1) this.f16355w.f3443v).C;
        if (k0Var == null || !k0Var.f16205w) {
            k0Var = null;
        }
        if (k0Var != null) {
            k0Var.D.f(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f16353u = false;
            this.f16354v = null;
        }
        this.f16355w.h().D(new s2(this, 0));
    }
}

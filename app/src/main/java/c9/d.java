package c9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.ei;
import g9.t0;
import g9.u0;
import wa.e7;

/* loaded from: classes.dex */
public final class d extends ga.a {
    public static final Parcelable.Creator<d> CREATOR = new f(1);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f4013u;

    /* renamed from: v, reason: collision with root package name */
    public final u0 f4014v;

    /* renamed from: w, reason: collision with root package name */
    public final IBinder f4015w;

    public d(boolean z3, IBinder iBinder, IBinder iBinder2) {
        u0 u0Var;
        this.f4013u = z3;
        if (iBinder != null) {
            int i = ei.f5693v;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof u0) {
                u0Var = (u0) queryLocalInterface;
            } else {
                u0Var = new t0(iBinder);
            }
        } else {
            u0Var = null;
        }
        this.f4014v = u0Var;
        this.f4015w = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f4013u ? 1 : 0);
        u0 u0Var = this.f4014v;
        if (u0Var == null) {
            asBinder = null;
        } else {
            asBinder = u0Var.asBinder();
        }
        e7.c(parcel, 2, asBinder);
        e7.c(parcel, 3, this.f4015w);
        e7.l(parcel, k3);
    }
}

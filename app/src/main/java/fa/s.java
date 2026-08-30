package fa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.oh;
import wa.e7;

/* loaded from: classes.dex */
public final class s extends ga.a {
    public static final Parcelable.Creator<s> CREATOR = new c9.f(20);

    /* renamed from: u, reason: collision with root package name */
    public final int f16916u;

    /* renamed from: v, reason: collision with root package name */
    public final IBinder f16917v;

    /* renamed from: w, reason: collision with root package name */
    public final ca.b f16918w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f16919x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f16920y;

    public s(int i, IBinder iBinder, ca.b bVar, boolean z3, boolean z9) {
        this.f16916u = i;
        this.f16917v = iBinder;
        this.f16918w = bVar;
        this.f16919x = z3;
        this.f16920y = z9;
    }

    public final boolean equals(Object obj) {
        Object ohVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof s) {
                    s sVar = (s) obj;
                    if (this.f16918w.equals(sVar.f16918w)) {
                        Object obj2 = null;
                        IBinder iBinder = this.f16917v;
                        if (iBinder == null) {
                            ohVar = null;
                        } else {
                            int i = a.f16835v;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof i) {
                                ohVar = (i) queryLocalInterface;
                            } else {
                                ohVar = new oh(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 5);
                            }
                        }
                        IBinder iBinder2 = sVar.f16917v;
                        if (iBinder2 != null) {
                            int i10 = a.f16835v;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof i) {
                                obj2 = (i) queryLocalInterface2;
                            } else {
                                obj2 = new oh(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 5);
                            }
                        }
                        if (y.l(ohVar, obj2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f16916u);
        e7.c(parcel, 2, this.f16917v);
        e7.d(parcel, 3, this.f16918w, i);
        e7.j(parcel, 4, 4);
        parcel.writeInt(this.f16919x ? 1 : 0);
        e7.j(parcel, 5, 4);
        parcel.writeInt(this.f16920y ? 1 : 0);
        e7.l(parcel, k3);
    }
}

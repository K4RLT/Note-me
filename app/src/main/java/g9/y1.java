package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class y1 extends ga.a {
    public static final Parcelable.Creator<y1> CREATOR = new h1(2);

    /* renamed from: u, reason: collision with root package name */
    public final int f17714u;

    /* renamed from: v, reason: collision with root package name */
    public final String f17715v;

    /* renamed from: w, reason: collision with root package name */
    public final String f17716w;

    /* renamed from: x, reason: collision with root package name */
    public y1 f17717x;

    /* renamed from: y, reason: collision with root package name */
    public IBinder f17718y;

    public y1(int i, String str, String str2, y1 y1Var, IBinder iBinder) {
        this.f17714u = i;
        this.f17715v = str;
        this.f17716w = str2;
        this.f17717x = y1Var;
        this.f17718y = iBinder;
    }

    public final z8.a a() {
        y1 y1Var = this.f17717x;
        z8.a aVar = null;
        if (y1Var != null) {
            String str = y1Var.f17716w;
            aVar = new z8.a(y1Var.f17714u, y1Var.f17715v, str, null);
        }
        return new z8.a(this.f17714u, this.f17715v, this.f17716w, aVar);
    }

    public final z8.l b() {
        z8.a aVar;
        v1 u1Var;
        y1 y1Var = this.f17717x;
        z8.q qVar = null;
        if (y1Var == null) {
            aVar = null;
        } else {
            aVar = new z8.a(y1Var.f17714u, y1Var.f17715v, y1Var.f17716w, null);
        }
        IBinder iBinder = this.f17718y;
        if (iBinder == null) {
            u1Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof v1) {
                u1Var = (v1) queryLocalInterface;
            } else {
                u1Var = new u1(iBinder);
            }
        }
        if (u1Var != null) {
            qVar = new z8.q(u1Var);
        }
        return new z8.l(this.f17714u, this.f17715v, this.f17716w, aVar, qVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f17714u);
        e7.e(parcel, 2, this.f17715v);
        e7.e(parcel, 3, this.f17716w);
        e7.d(parcel, 4, this.f17717x, i);
        e7.c(parcel, 5, this.f17718y);
        e7.l(parcel, k3);
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class b40 extends ph implements ti {

    /* renamed from: u, reason: collision with root package name */
    public final a40 f4709u;

    /* renamed from: v, reason: collision with root package name */
    public final g9.k0 f4710v;

    /* renamed from: w, reason: collision with root package name */
    public final jo0 f4711w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4712x;

    /* renamed from: y, reason: collision with root package name */
    public final be0 f4713y;

    public b40(a40 a40Var, g9.k0 k0Var, jo0 jo0Var, be0 be0Var) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.f4709u = a40Var;
        this.f4710v = k0Var;
        this.f4711w = jo0Var;
        this.f4713y = be0Var;
        nl nlVar = sl.f10833m1;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.f4712x = true;
        } else {
            this.f4712x = ((Boolean) rVar.f17698c.a(sl.f10849n1)).booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final g9.v1 e() {
        if (!((Boolean) g9.r.e.f17698c.a(sl.F7)).booleanValue()) {
            return null;
        }
        return this.f4709u.f13071f;
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final void g3(oa.a aVar, yi yiVar) {
        try {
            this.f4711w.f7496x.set(yiVar);
            this.f4709u.c((Activity) oa.b.z1(aVar), this.f4712x);
        } catch (RemoteException e) {
            int i = k9.a0.f19634b;
            l9.i.i(e, "#007 Could not call remote method.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        long j10;
        c60 c60Var;
        c60 c60Var2;
        yi yiVar = null;
        String str = null;
        g9.k0 k0Var = this.f4710v;
        a40 a40Var = this.f4709u;
        switch (i) {
            case 2:
                parcel2.writeNoException();
                qh.e(parcel2, k0Var);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof wi) {
                    }
                }
                qh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    if (queryLocalInterface2 instanceof yi) {
                        yiVar = (yi) queryLocalInterface2;
                    } else {
                        yiVar = new oh(readStrongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback", 0);
                    }
                }
                qh.f(parcel);
                g3(v12, yiVar);
                parcel2.writeNoException();
                return true;
            case 5:
                g9.v1 e = e();
                parcel2.writeNoException();
                qh.e(parcel2, e);
                return true;
            case 6:
                boolean a10 = qh.a(parcel);
                qh.f(parcel);
                this.f4712x = a10;
                parcel2.writeNoException();
                return true;
            case 7:
                g9.q1 v4 = g9.s2.v4(parcel.readStrongBinder());
                qh.f(parcel);
                fa.y.d("setOnPaidEventListener must be called on the main UI thread.");
                jo0 jo0Var = this.f4711w;
                if (jo0Var != null) {
                    try {
                        if (!v4.b()) {
                            this.f4713y.b();
                        }
                    } catch (RemoteException e8) {
                        int i10 = k9.a0.f19634b;
                        l9.i.b("Error in making CSI ping for reporting paid event callback", e8);
                    }
                    jo0Var.A.set(v4);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                try {
                    str = k0Var.M();
                } catch (RemoteException e10) {
                    int i11 = k9.a0.f19634b;
                    l9.i.i(e10, "#007 Could not call remote method.");
                }
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 9:
                if (a40Var != null && (c60Var = a40Var.f13074j) != null) {
                    j10 = c60Var.f5014a.get();
                } else {
                    j10 = 0;
                }
                parcel2.writeNoException();
                parcel2.writeLong(j10);
                return true;
            case 10:
                long readLong = parcel.readLong();
                qh.f(parcel);
                if (a40Var != null && (c60Var2 = a40Var.f13074j) != null) {
                    c60Var2.a(readLong);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

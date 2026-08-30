package com.google.android.gms.internal.ads;
import g9.y1;
import i0.m;
import l9.i;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class pi extends ph implements vi {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9525u;

    /* renamed from: v, reason: collision with root package name */
    public String f9526v;

    /* renamed from: w, reason: collision with root package name */
    public Object f9527w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pi(rf0 rf0Var, String str) {
        this((byte) 0);
        this.f9525u = 0;
        this.f9527w = rf0Var;
        this.f9526v = str;
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final void F(y1 y1Var) {
        switch (this.f9525u) {
            case 0:
                rf0 rf0Var = (rf0) this.f9527w;
                if (rf0Var != null) {
                    rf0Var.a(y1Var.b());
                    return;
                }
                return;
            default:
                m mVar = (m) this.f9527w;
                if (mVar != null) {
                    String lVar = y1Var.b().toString();
                    String str = this.f9526v;
                    StringBuilder sb2 = new StringBuilder(lVar.length() + 60 + String.valueOf(str).length());
                    sb2.append("Failed to load app open ad with error parcel: ");
                    sb2.append(lVar);
                    sb2.append(" for ad unit: ");
                    sb2.append(str);
                    i.f(sb2.toString());
                    ((dt0) mVar.f18054v).c(y1Var);
                    this.f9527w = null;
                    this.f9526v = null;
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final void W0(ti tiVar) {
        switch (this.f9525u) {
            case 0:
                rf0 rf0Var = (rf0) this.f9527w;
                if (rf0Var != null) {
                    rf0Var.b(new qi(tiVar, this.f9526v));
                    return;
                }
                return;
            default:
                m mVar = (m) this.f9527w;
                if (mVar != null) {
                    ((d91) mVar.f18055w).d(tiVar);
                    this.f9527w = null;
                    this.f9526v = null;
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        ti ohVar;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                y1 y1Var = (y1) qh.b(parcel, y1.CREATOR);
                qh.f(parcel);
                F(y1Var);
            } else {
                int readInt = parcel.readInt();
                qh.f(parcel);
                w(readInt);
            }
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                ohVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                if (queryLocalInterface instanceof ti) {
                    ohVar = (ti) queryLocalInterface;
                } else {
                    ohVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd", 0);
                }
            }
            qh.f(parcel);
            W0(ohVar);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final void w(int i) {
        switch (this.f9525u) {
            case 0:
                return;
            default:
                this.f9527w = null;
                this.f9526v = null;
                return;
        }
    }

    public pi(byte b10) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi() {
        this((byte) 0);
        this.f9525u = 1;
    }

    private final void v4(int i) {
    }
}

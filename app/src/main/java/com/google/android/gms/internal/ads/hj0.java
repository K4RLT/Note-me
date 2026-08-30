package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class hj0 extends ph implements vs {

    /* renamed from: u, reason: collision with root package name */
    public final gi0 f6828u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ vi0 f6829v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj0(vi0 vi0Var, gi0 gi0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        this.f6829v = vi0Var;
        this.f6828u = gi0Var;
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void k1(gs gsVar) {
        this.f6829v.f11910d = gsVar;
        ((zi0) this.f6828u.f6408c).f();
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void r(g9.y1 y1Var) {
        ((zi0) this.f6828u.f6408c).K2(y1Var);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        gs fsVar;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                g9.y1 y1Var = (g9.y1) qh.b(parcel, g9.y1.CREATOR);
                qh.f(parcel);
                r(y1Var);
            } else {
                String readString = parcel.readString();
                qh.f(parcel);
                ((zi0) this.f6828u.f6408c).o4(0, readString);
            }
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                fsVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                if (queryLocalInterface instanceof gs) {
                    fsVar = (gs) queryLocalInterface;
                } else {
                    fsVar = new fs(readStrongBinder);
                }
            }
            qh.f(parcel);
            k1(fsVar);
        }
        parcel2.writeNoException();
        return true;
    }
}

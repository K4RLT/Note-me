package com.google.android.gms.internal.ads;
import g9.y1;
import oa.a;
import oa.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;

/* loaded from: classes.dex */
public final class ui0 extends ph implements rs {

    /* renamed from: u, reason: collision with root package name */
    public final gi0 f11640u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ vi0 f11641v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui0(vi0 vi0Var, gi0 gi0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        this.f11641v = vi0Var;
        this.f11640u = gi0Var;
    }

    @Override // com.google.android.gms.internal.ads.rs
    public final void c0(oa.a aVar) {
        this.f11641v.f11910d = (View) oa.b.z1(aVar);
        ((zi0) this.f11640u.f6408c).f();
    }

    @Override // com.google.android.gms.internal.ads.rs
    public final void r(g9.y1 y1Var) {
        ((zi0) this.f11640u.f6408c).K2(y1Var);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        bs bsVar;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        bsVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                        if (queryLocalInterface instanceof bs) {
                            bsVar = (bs) queryLocalInterface;
                        } else {
                            bsVar = new bs(readStrongBinder);
                        }
                    }
                    qh.f(parcel);
                    this.f11641v.e = bsVar;
                    ((zi0) this.f11640u.f6408c).f();
                } else {
                    g9.y1 y1Var = (g9.y1) qh.b(parcel, g9.y1.CREATOR);
                    qh.f(parcel);
                    r(y1Var);
                }
            } else {
                String readString = parcel.readString();
                qh.f(parcel);
                ((zi0) this.f11640u.f6408c).o4(0, readString);
            }
        } else {
            oa.a v12 = oa.b.v1(parcel.readStrongBinder());
            qh.f(parcel);
            c0(v12);
        }
        parcel2.writeNoException();
        return true;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class dj0 extends ph implements ts {

    /* renamed from: u, reason: collision with root package name */
    public final gi0 f5442u;

    public dj0(qi0 qi0Var, gi0 gi0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
        this.f5442u = gi0Var;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void a() {
        ((zi0) this.f5442u.f6408c).f();
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void r(g9.y1 y1Var) {
        ((zi0) this.f5442u.f6408c).K2(y1Var);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return false;
                }
                g9.y1 y1Var = (g9.y1) qh.b(parcel, g9.y1.CREATOR);
                qh.f(parcel);
                r(y1Var);
            } else {
                String readString = parcel.readString();
                qh.f(parcel);
                ((zi0) this.f5442u.f6408c).o4(0, readString);
            }
        } else {
            a();
        }
        parcel2.writeNoException();
        return true;
    }
}

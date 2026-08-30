package com.google.android.gms.internal.ads;
import g3.a;
import oa.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class bs extends oh implements IInterface {
    public bs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd", 0);
    }

    public final boolean b() {
        boolean z3;
        Parcel u22 = u2(g2(), 2);
        ClassLoader classLoader = qh.f9846a;
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    public final a u4() {
        return a.q(u2(g2(), 1));
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ur extends oh implements vr {
    @Override // com.google.android.gms.internal.ads.vr
    public final boolean C(String str) {
        boolean z3;
        Parcel g22 = g2();
        g22.writeString(str);
        Parcel u22 = u2(g22, 4);
        ClassLoader classLoader = qh.f9846a;
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.zs] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // com.google.android.gms.internal.ads.vr
    public final zs H(String str) {
        Object ohVar;
        Parcel g22 = g2();
        g22.writeString(str);
        Parcel u22 = u2(g22, 3);
        IBinder readStrongBinder = u22.readStrongBinder();
        int i = dt.f5488z;
        if (readStrongBinder == null) {
            ohVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            if (queryLocalInterface instanceof zs) {
                ohVar = (zs) queryLocalInterface;
            } else {
                ohVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter", 0);
            }
        }
        u22.recycle();
        return ohVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.xr] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // com.google.android.gms.internal.ads.vr
    public final xr o(String str) {
        Object ohVar;
        Parcel g22 = g2();
        g22.writeString(str);
        Parcel u22 = u2(g22, 1);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            ohVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (queryLocalInterface instanceof xr) {
                ohVar = (xr) queryLocalInterface;
            } else {
                ohVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter", 0);
            }
        }
        u22.recycle();
        return ohVar;
    }

    @Override // com.google.android.gms.internal.ads.vr
    public final boolean t(String str) {
        boolean z3;
        Parcel g22 = g2();
        g22.writeString(str);
        Parcel u22 = u2(g22, 2);
        ClassLoader classLoader = qh.f9846a;
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }
}
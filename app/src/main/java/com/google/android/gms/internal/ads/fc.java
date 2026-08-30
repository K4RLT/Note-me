package com.google.android.gms.internal.ads;
import nc.a;

import java.util.Locale;
import java.util.Optional;

/* loaded from: classes.dex */
public final class fc extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fc(com.google.android.gms.internal.ads.ec r5, com.google.android.gms.internal.ads.dc r6, long r7) {
        /*
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r2 = r5.f5649u
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r2 = 0
            r1[r2] = r5
            long r2 = r6.f5398u
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r2 = 1
            r1[r2] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r7 = 2
            r1[r7] = r5
            java.lang.String r7 = "bk3t6gFTc30="
            java.lang.String r7 = com.google.android.gms.internal.ads.a(r7)
            java.lang.String r7 = java.lang.String.format(r0, r7, r1)
            r4.<init>(r7)
            java.util.Optional.of(r6)
            java.util.Optional.of(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fc.<init>(com.google.android.gms.internal.ads.ec, com.google.android.gms.internal.ads.dc, long):void");
    }

    public fc(ec ecVar, Exception exc) {
        super(String.format(Locale.US, a("bk0="), Long.valueOf(ecVar.f5649u)), exc);
        Optional.empty();
        Optional.empty();
    }
}

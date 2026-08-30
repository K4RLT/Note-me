package com.google.android.gms.internal.ads;
import c2.z1;
import z1.b;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes.dex */
public final class qh0 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final ik0 f9847a;

    public qh0(ik0 ik0Var) {
        this.f9847a = ik0Var;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z3;
        int b10 = c2.z1.b(telephonyDisplayInfo);
        int i = 5;
        if (b10 == 3 || b10 == 4 || b10 == 5) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (true == z3) {
            i = 10;
        }
        this.f9847a.c(i);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class kx0 extends ix0 {
    public static kx0 i;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.ix0, com.google.android.gms.internal.ads.kx0] */
    public static final kx0 f(Context context) {
        kx0 kx0Var;
        synchronized (kx0.class) {
            try {
                if (i == null) {
                    i = new ix0(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                kx0Var = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kx0Var;
    }

    public final void g() {
        synchronized (kx0.class) {
            try {
                j6.s sVar = this.f7247f;
                if (((SharedPreferences) sVar.f18982w).contains(this.f7243a)) {
                    c(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class jx0 extends ix0 {
    public static jx0 i;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.ix0, com.google.android.gms.internal.ads.jx0] */
    public static final jx0 f(Context context) {
        jx0 jx0Var;
        synchronized (jx0.class) {
            try {
                if (i == null) {
                    i = new ix0(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                jx0Var = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jx0Var;
    }
}

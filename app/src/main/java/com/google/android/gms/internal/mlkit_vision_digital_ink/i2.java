package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final nw f14454a;

    static {
        h2 h2Var;
        try {
            SystemClock.elapsedRealtimeNanos();
            h2Var = new h2(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            h2Var = new h2(1);
        }
        f14454a = h2Var;
    }
}

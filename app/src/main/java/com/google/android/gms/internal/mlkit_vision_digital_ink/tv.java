package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class tv {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f15034a;

    static {
        boolean z3;
        try {
            SystemClock.elapsedRealtimeNanos();
            z3 = true;
        } catch (Throwable unused) {
            z3 = false;
        }
        f15034a = z3;
    }
}

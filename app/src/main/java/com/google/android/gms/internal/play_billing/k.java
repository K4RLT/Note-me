package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final j f15469a;

    static {
        j jVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            jVar = new j(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            jVar = new j(1);
        }
        f15469a = jVar;
    }
}

package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.Closeable;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class g0 implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    public final u0 f14350u;

    /* renamed from: v, reason: collision with root package name */
    public final long f14351v = 10000;

    /* renamed from: w, reason: collision with root package name */
    public long f14352w;

    public g0(u0 u0Var) {
        Instant now;
        long epochMilli;
        this.f14350u = u0Var;
        now = Instant.now();
        epochMilli = now.toEpochMilli();
        this.f14352w = epochMilli;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14350u.q();
    }

    public final void f(int i) {
        ConnectivityManager connectivityManager;
        String str;
        Instant now;
        long epochMilli;
        Instant now2;
        long epochMilli2;
        long j10 = i;
        u0 u0Var = this.f14350u;
        AtomicLong atomicLong = (AtomicLong) u0Var.f15039y;
        AtomicLong atomicLong2 = (AtomicLong) u0Var.f15040z;
        NetworkInfo networkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) ((Context) u0Var.f15036v).getSystemService("connectivity");
        } catch (SecurityException unused) {
            cx.f("%s: Couldn't retrieve ConnectivityManager.", "NetworkUsageMonitor");
            connectivityManager = null;
        }
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        }
        boolean z3 = false;
        if (networkInfo == null) {
            cx.f("%s: Fail to get network type ", "NetworkUsageMonitor");
        } else if (networkInfo.getType() != 1 && networkInfo.getType() != 9 && networkInfo.getType() != 17) {
            z3 = true;
        }
        if (z3) {
            atomicLong2.getAndAdd(j10);
        } else {
            atomicLong.getAndAdd(j10);
        }
        if (true != z3) {
            str = "wifi";
        } else {
            str = "cellular";
        }
        cx.k("%s: Received data (%s) for fileGroup = %s, len = %d, wifiCounter = %d, cellularCounter = %d", "NetworkUsageMonitor", str, ((yr) u0Var.f15038x).y().w(), Long.valueOf(j10), Long.valueOf(atomicLong.get()), Long.valueOf(atomicLong2.get()));
        now = Instant.now();
        epochMilli = now.toEpochMilli();
        if (epochMilli - this.f14352w >= this.f14351v) {
            u0Var.q();
            now2 = Instant.now();
            epochMilli2 = now2.toEpochMilli();
            this.f14352w = epochMilli2;
        }
    }
}

package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class k7 extends cp {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f14547c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f14548d;
    public static final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReference f14549f;

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLong f14550g;

    /* renamed from: h, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f14551h;

    /* renamed from: b, reason: collision with root package name */
    public volatile cp f14552b;

    static {
        boolean z3;
        boolean z9;
        String str = Build.FINGERPRINT;
        boolean z10 = false;
        if (str == null || "robolectric".equals(str)) {
            z3 = true;
        } else {
            z3 = false;
        }
        f14547c = z3;
        String str2 = Build.HARDWARE;
        if ("goldfish".equals(str2) || "ranchu".equals(str2)) {
            z9 = true;
        } else {
            z9 = false;
        }
        f14548d = z9;
        String str3 = Build.TYPE;
        if ("eng".equals(str3) || "userdebug".equals(str3)) {
            z10 = true;
        }
        e = z10;
        f14549f = new AtomicReference();
        f14550g = new AtomicLong();
        f14551h = new ConcurrentLinkedQueue();
    }

    public static void m() {
        while (true) {
            j7 j7Var = (j7) f14551h.poll();
            if (j7Var != null) {
                f14550g.getAndDecrement();
                k7 k7Var = j7Var.f14501a;
                q5 q5Var = j7Var.f14502b;
                v5 v5Var = q5Var.f14839c;
                if ((v5Var != null && Boolean.TRUE.equals(v5Var.n(u5.f15048g))) || k7Var.i(q5Var.f14837a)) {
                    k7Var.f(q5Var);
                }
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final void e(RuntimeException runtimeException, q5 q5Var) {
        if (this.f14552b != null) {
            this.f14552b.e(runtimeException, q5Var);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final void f(q5 q5Var) {
        if (this.f14552b != null) {
            this.f14552b.f(q5Var);
            return;
        }
        if (f14550g.incrementAndGet() > 20) {
            f14551h.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f14551h.offer(new j7(this, q5Var));
        if (this.f14552b != null) {
            m();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final boolean i(Level level) {
        if (this.f14552b != null && !this.f14552b.i(level)) {
            return false;
        }
        return true;
    }
}

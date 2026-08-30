package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f14830a;

    /* renamed from: b, reason: collision with root package name */
    public static final jm f14831b;

    /* renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f14832c;

    /* renamed from: d, reason: collision with root package name */
    public static final a7.k f14833d;

    static {
        n4.s(new Object[]{"androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl"}, 5);
        f14830a = new AtomicReference(f5.D);
        f14831b = new jm(5);
        f14832c = new WeakHashMap();
        f14833d = new a7.k(13);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static d2 a() {
        return (d2) f14833d.get();
    }

    public static e2 b() {
        d2 a10 = a();
        e2 e2Var = a10.f14179b;
        if (e2Var != null && e2Var != v1.A) {
            return e2Var;
        }
        ba.p pVar = t1.A;
        UUID b10 = r1.f14885c.b();
        String f10 = l1.f(b10);
        n4 n4Var = (n4) f14830a.get();
        if (!n4Var.isEmpty()) {
            n4Var.forEach(new s1(0));
        }
        return new t1(b10, f10, t1.A, a10);
    }

    public static e2 c(d2 d2Var, e2 e2Var) {
        boolean equals;
        d2Var.getClass();
        e2 e2Var2 = d2Var.f14179b;
        if (e2Var2 != e2Var) {
            if (e2Var2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    equals = Trace.isEnabled();
                } else {
                    f14831b.getClass();
                    String str = "false";
                    try {
                        str = (String) d.f14176a.invoke(null, "tiktok_systrace", "false");
                    } catch (Exception e) {
                        Log.e("SystemProperties", "get error", e);
                    }
                    equals = "true".equals(str);
                }
                d2Var.f14178a = equals;
            }
            if (d2Var.f14178a) {
                if (e2Var2 != null) {
                    if (e2Var != null) {
                        if (((l1) e2Var2).f14585u == e2Var && !nw.t(e2Var2)) {
                            Trace.endSection();
                        } else if (e2Var2 == ((l1) e2Var).f14585u && !nw.t(e2Var)) {
                            nw.r(e2Var);
                        }
                    }
                    nw.m(e2Var2);
                }
                if (e2Var != null) {
                    nw.h(e2Var);
                }
            }
            if (e2Var2 != e2Var) {
                d2Var.f14179b = e2Var;
                return e2Var2;
            }
        }
        return e2Var;
    }
}

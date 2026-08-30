package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.e91;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public t0 f15522u;

    @Override // java.lang.Runnable
    public final void run() {
        r0 r0Var;
        e0 e0Var;
        t0 t0Var = this.f15522u;
        if (t0Var != null && (r0Var = t0Var.B) != null) {
            this.f15522u = null;
            if (r0Var.isDone()) {
                Object obj = t0Var.f15473u;
                if (obj == null) {
                    if (r0Var.isDone()) {
                        if (k0.A.f(t0Var, null, t0.h(r0Var))) {
                            t0.j(t0Var);
                            return;
                        }
                        return;
                    }
                    d0 d0Var = new d0(t0Var, r0Var);
                    if (k0.A.f(t0Var, null, d0Var)) {
                        try {
                            r0Var.k(d0Var, o0.f15497u);
                            return;
                        } catch (Throwable th) {
                            try {
                                e0Var = new e0(th);
                            } catch (Error | Exception unused) {
                                e0Var = e0.f15410b;
                            }
                            k0.A.f(t0Var, d0Var, e0Var);
                            return;
                        }
                    }
                    obj = t0Var.f15473u;
                }
                if (obj instanceof c0) {
                    r0Var.cancel(((c0) obj).f15392a);
                    return;
                }
                return;
            }
            try {
                ScheduledFuture scheduledFuture = t0Var.C;
                t0Var.C = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    try {
                        long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (abs > 10) {
                            str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                        }
                    } catch (Throwable th2) {
                        if (k0.A.f(t0Var, null, new e0(new e91(str, 1)))) {
                            t0.j(t0Var);
                        }
                        throw th2;
                    }
                }
                if (k0.A.f(t0Var, null, new e0(new e91(str + ": " + r0Var.toString(), 1)))) {
                    t0.j(t0Var);
                }
            } finally {
                r0Var.cancel(true);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class g60 implements j9.m {

    /* renamed from: v, reason: collision with root package name */
    public final wp0 f6311v;

    /* renamed from: w, reason: collision with root package name */
    public final qp0 f6312w;

    /* renamed from: x, reason: collision with root package name */
    public final la.a f6313x;

    /* renamed from: y, reason: collision with root package name */
    public final be0 f6314y;

    /* renamed from: z, reason: collision with root package name */
    public final ScheduledExecutorService f6315z;

    /* renamed from: u, reason: collision with root package name */
    public final Object f6310u = new Object();
    public final ks0 A = ls0.z();
    public boolean B = false;
    public boolean C = false;

    public g60(wp0 wp0Var, qp0 qp0Var, la.a aVar, be0 be0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f6311v = wp0Var;
        this.f6312w = qp0Var;
        this.f6313x = aVar;
        this.f6314y = be0Var;
        this.f6315z = scheduledExecutorService;
    }

    @Override // j9.m
    public final void R0() {
        b(9);
    }

    @Override // j9.m
    public final void T1() {
        b(8);
    }

    public final void a() {
        synchronized (this.f6310u) {
            try {
                be0 be0Var = this.f6314y;
                String str = ((sp0) this.f6311v.f12313b.f11471w).f11091b;
                String encodeToString = Base64.encodeToString(((ls0) this.A.c()).b(), 1);
                if (((Boolean) g9.r.e.f17698c.a(sl.f10896pe)).booleanValue()) {
                    j6.s a10 = be0Var.a();
                    a10.k("action", "pclma");
                    a10.k("pclmd", encodeToString);
                    a10.k("gqi", str);
                    a10.n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        synchronized (this.f6310u) {
            try {
                if (!this.C && this.B) {
                    ks0 ks0Var = this.A;
                    or0 z3 = pr0.z();
                    z3.b();
                    ((pr0) z3.f4845v).B(i);
                    this.f6313x.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    z3.b();
                    ((pr0) z3.f4845v).A(currentTimeMillis);
                    pr0 pr0Var = (pr0) z3.c();
                    ks0Var.b();
                    ((ls0) ks0Var.f4845v).A(pr0Var);
                    if (i == 10) {
                        a();
                        this.C = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // j9.m
    public final void d() {
    }

    @Override // j9.m
    public final void g2() {
        b(5);
    }

    @Override // j9.m
    public final void i4(int i) {
    }

    @Override // j9.m
    public final void o3() {
        b(7);
    }

    @Override // j9.m
    public final void r0() {
        b(4);
    }

    @Override // j9.m
    public final void t1() {
        b(10);
    }

    @Override // j9.m
    public final void u2() {
    }

    @Override // j9.m
    public final void v2() {
        b(6);
    }

    @Override // j9.m
    public final void z1() {
        b(3);
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a60 implements s60, w80, g80, z60, ai {
    public ScheduledFuture A;
    public final String C;

    /* renamed from: u, reason: collision with root package name */
    public final a70 f4370u;

    /* renamed from: v, reason: collision with root package name */
    public final u70 f4371v;

    /* renamed from: w, reason: collision with root package name */
    public final qp0 f4372w;

    /* renamed from: x, reason: collision with root package name */
    public final ScheduledExecutorService f4373x;

    /* renamed from: y, reason: collision with root package name */
    public final Executor f4374y;

    /* renamed from: z, reason: collision with root package name */
    public final d91 f4375z = new Object();
    public final AtomicBoolean B = new AtomicBoolean();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.d91] */
    public a60(a70 a70Var, qp0 qp0Var, ScheduledExecutorService scheduledExecutorService, wx wxVar, String str, u70 u70Var) {
        this.f4370u = a70Var;
        this.f4372w = qp0Var;
        this.f4373x = scheduledExecutorService;
        this.f4374y = wxVar;
        this.C = str;
        this.f4371v = u70Var;
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void C() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void E() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void F() {
        qp0 qp0Var = this.f4372w;
        if (qp0Var.e != 3) {
            int i = qp0Var.Y;
            if (i == 0 || i == 1) {
                if (((Boolean) g9.r.e.f17698c.a(sl.Uc)).booleanValue() && this.C.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                    return;
                }
                this.f4370u.l();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void e() {
        qp0 qp0Var = this.f4372w;
        int i = qp0Var.e;
        if (i != 3) {
            if (i == 4) {
                this.f4371v.l();
                return;
            }
            if (((Boolean) g9.r.e.f17698c.a(sl.d2)).booleanValue() && qp0Var.Y == 2) {
                int i10 = qp0Var.f9952q;
                if (i10 == 0) {
                    this.f4370u.l();
                    return;
                }
                lx0 lx0Var = new lx0(17, this);
                d91 d91Var = this.f4375z;
                d91Var.a(new t81(d91Var, 0, lx0Var), this.f4374y);
                this.A = this.f4373x.schedule(new e40(3, this), i10, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final void k(zh zhVar) {
        if (((Boolean) g9.r.e.f17698c.a(sl.Uc)).booleanValue() && this.C.equals("com.google.ads.mediation.admob.AdMobAdapter") && zhVar.f13171j && this.B.compareAndSet(false, true) && this.f4372w.e != 3) {
            k9.a0.k("Full screen 1px impression occurred");
            this.f4370u.l();
        }
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final synchronized void o(g9.y1 y1Var) {
        try {
            d91 d91Var = this.f4375z;
            if (d91Var.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.A;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            d91Var.e(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.g80
    public final synchronized void r() {
        if (this.f4372w.e == 4) {
            this.f4370u.l();
            return;
        }
        d91 d91Var = this.f4375z;
        if (d91Var.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.A;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        d91Var.d(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.g80
    public final void w() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void v(iv ivVar, String str, String str2) {
    }
}

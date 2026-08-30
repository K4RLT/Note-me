package com.google.android.gms.internal.ads;
import b5.a;
import j9.m;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class m90 implements j9.m, g9.a {

    /* renamed from: u, reason: collision with root package name */
    public final kd0 f8282u;

    /* renamed from: v, reason: collision with root package name */
    public final sp0 f8283v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f8284w = new AtomicBoolean(false);

    public m90(kd0 kd0Var, sp0 sp0Var) {
        this.f8282u = kd0Var;
        this.f8283v = sp0Var;
    }

    @Override // g9.a
    public final void L() {
        kd0 kd0Var = this.f8282u;
        if (kd0Var.f7719b.get()) {
            gx0 gx0Var = kd0Var.f7718a;
            gx0Var.getClass();
            x21.n(gx0Var.f6491a, gx0Var.f6492b, new ww0(gx0Var, null, 1));
        }
    }

    @Override // j9.m
    public final void R0() {
    }

    @Override // j9.m
    public final void T1() {
    }

    public final void a() {
        if (!this.f8284w.getAndSet(true)) {
            kd0 kd0Var = this.f8282u;
            if (kd0Var.f7719b.getAndSet(false)) {
                gx0 gx0Var = kd0Var.f7718a;
                gx0Var.getClass();
                x21.n(gx0Var.f6491a, gx0Var.f6492b, new ww0(gx0Var, null, 2));
            }
        }
    }

    @Override // j9.m
    public final void d() {
        String str = this.f8283v.f11091b;
        boolean y10 = xy.y(str);
        kd0 kd0Var = this.f8282u;
        if (y10) {
            kd0Var.getClass();
            return;
        }
        if (kd0Var.f7720c.get() && !kd0Var.f7719b.getAndSet(true)) {
            gx0 gx0Var = kd0Var.f7718a;
            gx0Var.getClass();
            str.getClass();
            x21.n(gx0Var.f6491a, gx0Var.f6492b, new b5.a(gx0Var, str, null, 16));
        }
    }

    @Override // j9.m
    public final void g2() {
    }

    @Override // j9.m
    public final void i4(int i) {
        a();
    }

    @Override // j9.m
    public final void o3() {
    }

    @Override // j9.m
    public final void r0() {
    }

    @Override // j9.m
    public final void t1() {
    }

    @Override // j9.m
    public final void u2() {
        a();
    }

    @Override // j9.m
    public final void v2() {
    }

    @Override // j9.m
    public final void z1() {
    }
}

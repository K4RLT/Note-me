package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class t40 implements k70, ai, g80 {

    /* renamed from: u, reason: collision with root package name */
    public final qp0 f11245u;

    /* renamed from: v, reason: collision with root package name */
    public final a70 f11246v;

    /* renamed from: w, reason: collision with root package name */
    public final o70 f11247w;

    /* renamed from: z, reason: collision with root package name */
    public final u70 f11250z;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f11248x = new AtomicBoolean();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f11249y = new AtomicBoolean();
    public final AtomicBoolean A = new AtomicBoolean();

    public t40(qp0 qp0Var, a70 a70Var, o70 o70Var, u70 u70Var) {
        this.f11245u = qp0Var;
        this.f11246v = a70Var;
        this.f11247w = o70Var;
        this.f11250z = u70Var;
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final synchronized void e() {
        int i = this.f11245u.e;
        if (i != 1 && i != 4) {
            if (this.f11248x.compareAndSet(false, true)) {
                this.f11246v.l();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final void k(zh zhVar) {
        int i = this.f11245u.e;
        if (i == 1) {
            if (zhVar.f13171j && this.f11248x.compareAndSet(false, true)) {
                this.f11246v.l();
            }
        } else if (i == 4 && zhVar.f13171j && this.A.compareAndSet(false, true)) {
            this.f11250z.l();
        }
        if (zhVar.f13171j && this.f11249y.compareAndSet(false, true)) {
            o70 o70Var = this.f11247w;
            synchronized (o70Var) {
                o70Var.P1(f70.C);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.g80
    public final void r() {
        if (this.f11245u.e == 4 && this.f11248x.compareAndSet(false, true)) {
            this.f11246v.l();
        }
    }

    @Override // com.google.android.gms.internal.ads.g80
    public final void w() {
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class iy1 implements i3 {

    /* renamed from: a, reason: collision with root package name */
    public final ry1 f7253a;

    /* renamed from: b, reason: collision with root package name */
    public final ry1 f7254b;

    /* renamed from: c, reason: collision with root package name */
    public final l2 f7255c = new l2();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f7256d = new AtomicReference(hy1.f6927u);

    public iy1(ry1 ry1Var) {
        this.f7253a = ry1Var;
        this.f7254b = ry1Var;
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final void a(int i, xk0 xk0Var) {
        g().a(i, xk0Var);
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final int b(fs1 fs1Var, int i, boolean z3) {
        return g().b(fs1Var, i, z3);
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final void c(long j10, int i, int i10, int i11, h3 h3Var) {
        g().c(j10, i, i10, i11, h3Var);
        AtomicReference atomicReference = this.f7256d;
        if (atomicReference.get() == hy1.f6928v) {
            this.f7254b.k(false);
            atomicReference.set(hy1.f6929w);
        }
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final int d(fs1 fs1Var, int i, boolean z3) {
        return g().d(fs1Var, i, z3);
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final void e(mw1 mw1Var) {
        this.f7253a.e(mw1Var);
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final void f(xk0 xk0Var, int i, int i10) {
        g().f(xk0Var, i, i10);
    }

    public final i3 g() {
        if (this.f7256d.get() == hy1.f6929w) {
            return this.f7255c;
        }
        return this.f7254b;
    }
}

package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class g0 extends wa.e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15425a = AtomicReferenceFieldUpdater.newUpdater(j0.class, Thread.class, "a");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15426b = AtomicReferenceFieldUpdater.newUpdater(j0.class, j0.class, "b");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15427c = AtomicReferenceFieldUpdater.newUpdater(k0.class, j0.class, "w");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15428d = AtomicReferenceFieldUpdater.newUpdater(k0.class, f0.class, "v");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "u");

    @Override // wa.e0
    public final f0 a(t0 t0Var) {
        return (f0) f15428d.getAndSet(t0Var, f0.f15416d);
    }

    @Override // wa.e0
    public final j0 b(t0 t0Var) {
        return (j0) f15427c.getAndSet(t0Var, j0.f15457c);
    }

    @Override // wa.e0
    public final void c(j0 j0Var, j0 j0Var2) {
        f15426b.lazySet(j0Var, j0Var2);
    }

    @Override // wa.e0
    public final void d(j0 j0Var, Thread thread) {
        f15425a.lazySet(j0Var, thread);
    }

    @Override // wa.e0
    public final boolean e(t0 t0Var, f0 f0Var, f0 f0Var2) {
        return wa.f0.a(f15428d, t0Var, f0Var, f0Var2);
    }

    @Override // wa.e0
    public final boolean f(k0 k0Var, Object obj, Object obj2) {
        return wa.f0.a(e, k0Var, obj, obj2);
    }

    @Override // wa.e0
    public final boolean g(k0 k0Var, j0 j0Var, j0 j0Var2) {
        return wa.f0.a(f15427c, k0Var, j0Var, j0Var2);
    }
}

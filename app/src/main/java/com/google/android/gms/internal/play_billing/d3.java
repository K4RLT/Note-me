package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wa.v5;

/* loaded from: classes.dex */
public final class d3 extends wa.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15405a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15406b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15407c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15408d;
    public final AtomicReferenceFieldUpdater e;

    public d3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f15405a = atomicReferenceFieldUpdater;
        this.f15406b = atomicReferenceFieldUpdater2;
        this.f15407c = atomicReferenceFieldUpdater3;
        this.f15408d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // wa.g0
    public final void a(a4 a4Var, a4 a4Var2) {
        this.f15406b.lazySet(a4Var, a4Var2);
    }

    @Override // wa.g0
    public final void b(a4 a4Var, Thread thread) {
        this.f15405a.lazySet(a4Var, thread);
    }

    @Override // wa.g0
    public final boolean c(b4 b4Var, g2 g2Var, g2 g2Var2) {
        return v5.a(this.f15408d, b4Var, g2Var, g2Var2);
    }

    @Override // wa.g0
    public final boolean d(b4 b4Var, Object obj, Object obj2) {
        return v5.a(this.e, b4Var, obj, obj2);
    }

    @Override // wa.g0
    public final boolean e(b4 b4Var, a4 a4Var, a4 a4Var2) {
        return v5.a(this.f15407c, b4Var, a4Var, a4Var2);
    }
}

package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class o9 extends tl {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14750c = AtomicReferenceFieldUpdater.newUpdater(r9.class, Thread.class, "a");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14751d = AtomicReferenceFieldUpdater.newUpdater(r9.class, r9.class, "b");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(s9.class, r9.class, "w");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14752f = AtomicReferenceFieldUpdater.newUpdater(s9.class, k9.class, "v");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14753g = AtomicReferenceFieldUpdater.newUpdater(s9.class, Object.class, "u");

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final k9 b(n9 n9Var) {
        return (k9) f14752f.getAndSet(n9Var, k9.f14560d);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final r9 k(n9 n9Var) {
        return (r9) e.getAndSet(n9Var, r9.f14894c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final void r(r9 r9Var, r9 r9Var2) {
        f14751d.lazySet(r9Var, r9Var2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final void u(r9 r9Var, Thread thread) {
        f14750c.lazySet(r9Var, thread);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean w(n9 n9Var, k9 k9Var, k9 k9Var2) {
        return gn.g(f14752f, n9Var, k9Var, k9Var2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean y(s9 s9Var, Object obj, Object obj2) {
        return gn.g(f14753g, s9Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean z(s9 s9Var, r9 r9Var, r9 r9Var2) {
        return gn.g(e, s9Var, r9Var, r9Var2);
    }
}

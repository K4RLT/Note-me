package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f81 extends x21 {

    /* renamed from: i0, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5971i0 = AtomicReferenceFieldUpdater.newUpdater(h81.class, Set.class, "B");

    /* renamed from: j0, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5972j0 = AtomicIntegerFieldUpdater.newUpdater(h81.class, "C");

    @Override // com.google.android.gms.internal.ads.x21
    public final void k(e81 e81Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f5971i0;
            if (atomicReferenceFieldUpdater.compareAndSet(e81Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(e81Var) == null);
    }

    @Override // com.google.android.gms.internal.ads.x21
    public final int v(e81 e81Var) {
        return f5972j0.decrementAndGet(e81Var);
    }
}

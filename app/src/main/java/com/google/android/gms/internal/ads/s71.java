package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class s71 extends ay0 {
    public static final AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(y71.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(y71.class, y71.class, "b");
    public static final AtomicReferenceFieldUpdater I = AtomicReferenceFieldUpdater.newUpdater(z71.class, y71.class, "w");
    public static final AtomicReferenceFieldUpdater J = AtomicReferenceFieldUpdater.newUpdater(z71.class, o71.class, "v");
    public static final AtomicReferenceFieldUpdater K = AtomicReferenceFieldUpdater.newUpdater(z71.class, Object.class, "u");

    @Override // com.google.android.gms.internal.ads.ay0
    public final boolean D(r71 r71Var, o71 o71Var, o71 o71Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = J;
            if (atomicReferenceFieldUpdater.compareAndSet(r71Var, o71Var, o71Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r71Var) == o71Var);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final y71 H(r71 r71Var) {
        return (y71) I.getAndSet(r71Var, y71.f12806c);
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final o71 N(r71 r71Var) {
        return (o71) J.getAndSet(r71Var, o71.f8996d);
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final boolean T(z71 z71Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = K;
            if (atomicReferenceFieldUpdater.compareAndSet(z71Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(z71Var) == obj);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final void j(y71 y71Var, Thread thread) {
        G.lazySet(y71Var, thread);
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final void q(y71 y71Var, y71 y71Var2) {
        H.lazySet(y71Var, y71Var2);
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final boolean x(z71 z71Var, y71 y71Var, y71 y71Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = I;
            if (atomicReferenceFieldUpdater.compareAndSet(z71Var, y71Var, y71Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(z71Var) == y71Var);
        return false;
    }
}

package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class aa extends nw {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14017c = AtomicReferenceFieldUpdater.newUpdater(ca.class, Set.class, "B");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14018d = AtomicIntegerFieldUpdater.newUpdater(ca.class, "C");

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.nw
    public final int a(ha haVar) {
        return f14018d.decrementAndGet(haVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.nw
    public final void n(ha haVar, Set set) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14017c;
            if (!atomicReferenceFieldUpdater.compareAndSet(haVar, null, set)) {
                if (atomicReferenceFieldUpdater.get(haVar) != null && atomicReferenceFieldUpdater.get(haVar) != null) {
                    return;
                }
            } else {
                return;
            }
        }
    }
}

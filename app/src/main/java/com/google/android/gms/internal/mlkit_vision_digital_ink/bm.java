package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class bm extends tl {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14095c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14096d;
    public final AtomicReferenceFieldUpdater e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14097f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14098g;

    public bm(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f14095c = atomicReferenceFieldUpdater;
        this.f14096d = atomicReferenceFieldUpdater2;
        this.e = atomicReferenceFieldUpdater3;
        this.f14097f = atomicReferenceFieldUpdater4;
        this.f14098g = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final void g(dm dmVar, dm dmVar2) {
        this.f14096d.lazySet(dmVar, dmVar2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final void n(dm dmVar, Thread thread) {
        this.f14095c.lazySet(dmVar, thread);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean s(em emVar, am amVar, am amVar2) {
        return gn.h(this.f14097f, emVar, amVar, amVar2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean v(em emVar, Object obj, Object obj2) {
        return gn.h(this.f14098g, emVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean x(em emVar, dm dmVar, dm dmVar2) {
        return gn.h(this.e, emVar, dmVar, dmVar2);
    }
}

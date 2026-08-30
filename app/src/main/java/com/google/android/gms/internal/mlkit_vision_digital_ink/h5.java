package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class h5 extends n4 {

    /* renamed from: x, reason: collision with root package name */
    public final transient Object f14394x;

    public h5(Object obj) {
        obj.getClass();
        this.f14394x = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.f14394x;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14394x.equals(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n4, com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final h4 g() {
        return h4.u(this.f14394x);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n4, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14394x.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new q4(this.f14394x);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final k5 k() {
        return new q4(this.f14394x);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final boolean n() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return p.a.k("[", this.f14394x.toString(), "]");
    }
}

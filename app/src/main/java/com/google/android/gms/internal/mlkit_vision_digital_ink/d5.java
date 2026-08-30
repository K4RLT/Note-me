package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Objects;

/* loaded from: classes.dex */
public final class d5 extends h4 {

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f14181w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f14182x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f14183y;

    public d5(Object[] objArr, int i, int i10) {
        this.f14181w = objArr;
        this.f14182x = i;
        this.f14183y = i10;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pa.d(i, this.f14183y);
        Object obj = this.f14181w[i + i + this.f14182x];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14183y;
    }
}

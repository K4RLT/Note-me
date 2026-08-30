package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class c61 extends d51 {

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f5015w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f5016x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f5017y;

    public c61(Object[] objArr, int i, int i10) {
        this.f5015w = objArr;
        this.f5016x = i;
        this.f5017y = i10;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b80.N(i, this.f5017y);
        Object obj = this.f5015w[i + i + this.f5016x];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5017y;
    }
}

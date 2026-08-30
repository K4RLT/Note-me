package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class y51 extends d51 {

    /* renamed from: y, reason: collision with root package name */
    public static final y51 f12781y = new y51(new Object[0], 0);

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f12782w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f12783x;

    public y51(Object[] objArr, int i) {
        this.f12782w = objArr;
        this.f12783x = i;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final Object[] b() {
        return this.f12782w;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final int g() {
        return this.f12783x;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b80.N(i, this.f12783x);
        Object obj = this.f12782w[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.d51, com.google.android.gms.internal.ads.z41
    public final int o(Object[] objArr, int i) {
        Object[] objArr2 = this.f12782w;
        int i10 = this.f12783x;
        System.arraycopy(objArr2, 0, objArr, i, i10);
        return i + i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12783x;
    }
}

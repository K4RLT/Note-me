package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
public final class v extends r {

    /* renamed from: y, reason: collision with root package name */
    public static final v f15535y = new v(new Object[0], 0);

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f15536w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f15537x;

    public v(Object[] objArr, int i) {
        this.f15536w = objArr;
        this.f15537x = i;
    }

    @Override // com.google.android.gms.internal.play_billing.r, com.google.android.gms.internal.play_billing.o
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f15536w;
        int i = this.f15537x;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int b() {
        return this.f15537x;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wa.a0.a(i, this.f15537x);
        Object obj = this.f15536w[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean k() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] n() {
        return this.f15536w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15537x;
    }
}

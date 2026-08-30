package com.google.android.gms.internal.play_billing;
import a0.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class z extends r {

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f15556w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f15557x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f15558y;

    public z(Object[] objArr, int i, int i10) {
        this.f15556w = objArr;
        this.f15557x = i;
        this.f15558y = i10;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wa.a(i, this.f15558y);
        Object obj = this.f15556w[i + i + this.f15557x];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15558y;
    }
}

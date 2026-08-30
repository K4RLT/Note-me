package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n0 extends k0 {

    /* renamed from: y, reason: collision with root package name */
    public static final n0 f13498y = new n0(new Object[0], 0);

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f13499w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f13500x;

    public n0(Object[] objArr, int i) {
        this.f13499w = objArr;
        this.f13500x = i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.k0, com.google.android.gms.internal.consent_sdk.h0
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f13499w;
        int i = this.f13500x;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h0
    public final int b() {
        return this.f13500x;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h0
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h0
    public final Object[] g() {
        return this.f13499w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        f0.b(i, this.f13500x);
        Object obj = this.f13499w[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13500x;
    }
}

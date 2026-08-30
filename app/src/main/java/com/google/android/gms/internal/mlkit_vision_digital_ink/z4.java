package com.google.android.gms.internal.mlkit_vision_digital_ink;
import pa.d;

import java.util.Objects;

/* loaded from: classes.dex */
public final class z4 extends h4 {

    /* renamed from: y, reason: collision with root package name */
    public static final z4 f15325y = new z4(new Object[0], 0);

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f15326w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f15327x;

    public z4(Object[] objArr, int i) {
        this.f15326w = objArr;
        this.f15327x = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.h4, com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int a(Object[] objArr, int i) {
        Object[] objArr2 = this.f15326w;
        int i10 = this.f15327x;
        System.arraycopy(objArr2, 0, objArr, i, i10);
        return i + i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int b() {
        return this.f15327x;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pa.d(i, this.f15327x);
        Object obj = this.f15326w[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final Object[] o() {
        return this.f15326w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15327x;
    }
}

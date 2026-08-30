package com.google.android.gms.internal.mlkit_vision_digital_ink;
import pa.d;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a5 extends h4 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b5 f14014w;

    public a5(b5 b5Var) {
        this.f14014w = b5Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        b5 b5Var = this.f14014w;
        pa.d(i, b5Var.f14066z);
        Object[] objArr = b5Var.f14065y;
        int i10 = i + i;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14014w.f14066z;
    }
}

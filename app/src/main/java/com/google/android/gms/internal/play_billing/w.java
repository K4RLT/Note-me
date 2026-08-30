package com.google.android.gms.internal.play_billing;
import a0.a;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w extends r {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f15538w;

    public w(x xVar) {
        this.f15538w = xVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        x xVar = this.f15538w;
        wa.a(i, xVar.f15544y);
        Object[] objArr = xVar.f15543x;
        int i10 = i + i;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15538w.f15544y;
    }
}

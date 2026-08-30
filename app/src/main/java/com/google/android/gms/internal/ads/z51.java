package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z51 extends d51 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a61 f13085w;

    public z51(a61 a61Var) {
        this.f13085w = a61Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        a61 a61Var = this.f13085w;
        b80.N(i, a61Var.f4378z);
        Object[] objArr = a61Var.f4377y;
        int i10 = i + i;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13085w.f4378z;
    }
}

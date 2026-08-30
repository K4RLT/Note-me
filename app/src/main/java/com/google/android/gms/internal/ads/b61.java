package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b61 extends j51 {

    /* renamed from: x, reason: collision with root package name */
    public final transient d61 f4726x;

    /* renamed from: y, reason: collision with root package name */
    public final transient c61 f4727y;

    public b61(d61 d61Var, c61 c61Var) {
        this.f4726x = d61Var;
        this.f4727y = c61Var;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final m61 a() {
        return this.f4727y.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.z41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f4726x.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f4727y.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.j51, com.google.android.gms.internal.ads.z41
    public final d51 k() {
        return this.f4727y;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final int o(Object[] objArr, int i) {
        return this.f4727y.o(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4726x.f5327z;
    }
}

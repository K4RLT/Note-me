package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class h51 extends z41 {

    /* renamed from: v, reason: collision with root package name */
    public final transient l51 f6604v;

    public h51(l51 l51Var) {
        this.f6604v = l51Var;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final m61 a() {
        return new g51(this.f6604v);
    }

    @Override // com.google.android.gms.internal.ads.z41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f6604v.c(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new g51(this.f6604v);
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final int o(Object[] objArr, int i) {
        b51 listIterator = ((d51) this.f6604v.f7950x.values()).listIterator(0);
        while (listIterator.hasNext()) {
            i = ((z41) listIterator.next()).o(objArr, i);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f6604v.f7951y;
    }
}

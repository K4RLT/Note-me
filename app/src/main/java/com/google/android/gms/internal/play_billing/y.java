package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class y extends u {

    /* renamed from: w, reason: collision with root package name */
    public final transient a0 f15551w;

    /* renamed from: x, reason: collision with root package name */
    public final transient z f15552x;

    public y(a0 a0Var, z zVar) {
        this.f15551w = a0Var;
        this.f15552x = zVar;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int a(Object[] objArr) {
        return this.f15552x.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f15551w.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.u, com.google.android.gms.internal.play_billing.o
    public final r g() {
        return this.f15552x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f15552x.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15551w.f15370z;
    }
}

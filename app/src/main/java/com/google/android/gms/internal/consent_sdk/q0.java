package com.google.android.gms.internal.consent_sdk;
import p.a;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class q0 extends l0 {

    /* renamed from: w, reason: collision with root package name */
    public final transient Object f13531w;

    public q0(Object obj) {
        this.f13531w = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h0
    public final int a(Object[] objArr) {
        objArr[0] = this.f13531w;
        return 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13531w.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13531w.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new m0(this.f13531w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a.k("[", this.f13531w.toString(), "]");
    }
}

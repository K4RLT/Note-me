package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class x extends u {

    /* renamed from: w, reason: collision with root package name */
    public final transient a0 f15542w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f15543x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f15544y;

    public x(a0 a0Var, Object[] objArr, int i) {
        this.f15542w = a0Var;
        this.f15543x = objArr;
        this.f15544y = i;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int a(Object[] objArr) {
        return g().a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f15542w.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.u
    public final r o() {
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15544y;
    }
}

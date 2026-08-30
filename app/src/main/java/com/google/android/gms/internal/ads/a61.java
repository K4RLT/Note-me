package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a61 extends j51 {

    /* renamed from: x, reason: collision with root package name */
    public final transient d61 f4376x;

    /* renamed from: y, reason: collision with root package name */
    public final transient Object[] f4377y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f4378z;

    public a61(d61 d61Var, Object[] objArr, int i) {
        this.f4376x = d61Var;
        this.f4377y = objArr;
        this.f4378z = i;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final m61 a() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.z41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f4376x.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final int o(Object[] objArr, int i) {
        return k().o(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4378z;
    }

    @Override // com.google.android.gms.internal.ads.j51
    public final d51 t() {
        return new z51(this);
    }
}

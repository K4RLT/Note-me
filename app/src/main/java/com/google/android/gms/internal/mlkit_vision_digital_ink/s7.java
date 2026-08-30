package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.mr1;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s7 extends AbstractSet {

    /* renamed from: u, reason: collision with root package name */
    public final int f14963u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t7 f14964v;

    public s7(t7 t7Var, int i) {
        this.f14964v = t7Var;
        this.f14963u = i;
    }

    public final int a() {
        return this.f14964v.f15006v[this.f14963u + 1];
    }

    public final int b() {
        int i = this.f14963u;
        if (i == -1) {
            return 0;
        }
        return this.f14964v.f15006v[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        r7 r7Var;
        Object[] objArr = this.f14964v.f15005u;
        int b10 = b();
        int a10 = a();
        if (this.f14963u == -1) {
            r7Var = t7.f15004z;
        } else {
            r7Var = u7.f15055b;
        }
        if (Arrays.binarySearch(objArr, b10, a10, obj, r7Var) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new mr1(this, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a() - b();
    }
}

package com.google.android.gms.internal.consent_sdk;
import i1.c;
import q.x;
import x.l;
import x.m;

import com.google.android.gms.internal.ads.wd0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class k6 extends d5 implements RandomAccess {

    /* renamed from: x, reason: collision with root package name */
    public static final Object[] f13474x;

    /* renamed from: y, reason: collision with root package name */
    public static final k6 f13475y;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f13476v;

    /* renamed from: w, reason: collision with root package name */
    public int f13477w;

    static {
        Object[] objArr = new Object[0];
        f13474x = objArr;
        f13475y = new k6(objArr, 0, false);
    }

    public k6(Object[] objArr, int i, boolean z3) {
        super(z3);
        this.f13476v = objArr;
        this.f13477w = i;
    }

    public final void a(int i) {
        if (i >= 0 && i < this.f13477w) {
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f13477w, ", Size:"));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        zza();
        if (i >= 0 && i <= (i10 = this.f13477w)) {
            int i11 = i + 1;
            Object[] objArr = this.f13476v;
            int length = objArr.length;
            if (i10 < length) {
                System.arraycopy(objArr, i, objArr, i11, i10 - i);
            } else {
                Object[] objArr2 = new Object[wd0.l(length, 3, 2, 1, 10)];
                System.arraycopy(this.f13476v, 0, objArr2, 0, i);
                System.arraycopy(this.f13476v, i, objArr2, i11, this.f13477w - i);
                this.f13476v = objArr2;
            }
            this.f13476v[i] = obj;
            this.f13477w++;
            ((AbstractList) this).modCount++;
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f13477w, ", Size:"));
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final /* bridge */ /* synthetic */ t5 f(int i) {
        Object[] copyOf;
        if (i >= this.f13477w) {
            if (i == 0) {
                copyOf = f13474x;
            } else {
                copyOf = Arrays.copyOf(this.f13476v, i);
            }
            return new k6(copyOf, this.f13477w, true);
        }
        q.x.m();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        a(i);
        return this.f13476v[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.d5, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        a(i);
        Object[] objArr = this.f13476v;
        Object obj = objArr[i];
        if (i < this.f13477w - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f13477w--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        a(i);
        Object[] objArr = this.f13476v;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13477w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.f13477w;
        int length = this.f13476v.length;
        if (i == length) {
            this.f13476v = Arrays.copyOf(this.f13476v, wd0.l(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f13476v;
        int i10 = this.f13477w;
        this.f13477w = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

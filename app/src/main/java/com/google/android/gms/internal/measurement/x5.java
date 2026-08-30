package com.google.android.gms.internal.measurement;
import i1.c;
import q.x;
import w7.i1;
import x.l;
import x.m;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class x5 extends o4 implements RandomAccess {

    /* renamed from: x, reason: collision with root package name */
    public static final x5 f13969x = new x5(new Object[0], 0, false);

    /* renamed from: v, reason: collision with root package name */
    public Object[] f13970v;

    /* renamed from: w, reason: collision with root package name */
    public int f13971w;

    public x5(Object[] objArr, int i, boolean z3) {
        super(z3);
        this.f13970v = objArr;
        this.f13971w = i;
    }

    public final void a(int i) {
        if (i >= 0 && i < this.f13971w) {
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f13971w, ", Size:"));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        zza();
        if (i >= 0 && i <= (i10 = this.f13971w)) {
            Object[] objArr = this.f13970v;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i10 - i);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f13970v, i, objArr2, i + 1, this.f13971w - i);
                this.f13970v = objArr2;
            }
            this.f13970v[i] = obj;
            this.f13971w++;
            ((AbstractList) this).modCount++;
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f13971w, ", Size:"));
    }

    @Override // com.google.android.gms.internal.measurement.i5
    public final /* synthetic */ i5 e(int i) {
        if (i >= this.f13971w) {
            return new x5(Arrays.copyOf(this.f13970v, i), this.f13971w, true);
        }
        q.x.m();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        a(i);
        return this.f13970v[i];
    }

    @Override // com.google.android.gms.internal.measurement.o4, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        a(i);
        Object[] objArr = this.f13970v;
        Object obj = objArr[i];
        if (i < this.f13971w - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f13971w--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        a(i);
        Object[] objArr = this.f13970v;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13971w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.f13971w;
        Object[] objArr = this.f13970v;
        if (i == objArr.length) {
            this.f13970v = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f13970v;
        int i10 = this.f13971w;
        this.f13971w = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

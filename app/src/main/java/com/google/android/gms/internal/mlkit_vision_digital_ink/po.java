package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.wd0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class po extends mm implements RandomAccess {

    /* renamed from: x, reason: collision with root package name */
    public static final Object[] f14805x;

    /* renamed from: y, reason: collision with root package name */
    public static final po f14806y;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f14807v;

    /* renamed from: w, reason: collision with root package name */
    public int f14808w;

    static {
        Object[] objArr = new Object[0];
        f14805x = objArr;
        f14806y = new po(objArr, 0, false);
    }

    public po(Object[] objArr, int i, boolean z3) {
        super(z3);
        this.f14807v = objArr;
        this.f14808w = i;
    }

    public final void a(int i) {
        if (i >= 0 && i < this.f14808w) {
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f14808w, ", Size:"));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        zza();
        if (i >= 0 && i <= (i10 = this.f14808w)) {
            int i11 = i + 1;
            Object[] objArr = this.f14807v;
            int length = objArr.length;
            if (i10 < length) {
                System.arraycopy(objArr, i, objArr, i11, i10 - i);
            } else {
                Object[] objArr2 = new Object[wd0.l(length, 3, 2, 1, 10)];
                System.arraycopy(this.f14807v, 0, objArr2, 0, i);
                System.arraycopy(this.f14807v, i, objArr2, i11, this.f14808w - i);
                this.f14807v = objArr2;
            }
            this.f14807v[i] = obj;
            this.f14808w++;
            ((AbstractList) this).modCount++;
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f14808w, ", Size:"));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.un
    public final /* bridge */ /* synthetic */ un f(int i) {
        Object[] copyOf;
        if (i >= this.f14808w) {
            if (i == 0) {
                copyOf = f14805x;
            } else {
                copyOf = Arrays.copyOf(this.f14807v, i);
            }
            return new po(copyOf, this.f14808w, true);
        }
        q.x.m();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        a(i);
        return this.f14807v[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.mm, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        a(i);
        Object[] objArr = this.f14807v;
        Object obj = objArr[i];
        if (i < this.f14808w - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f14808w--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        a(i);
        Object[] objArr = this.f14807v;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14808w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.f14808w;
        int length = this.f14807v.length;
        if (i == length) {
            this.f14807v = Arrays.copyOf(this.f14807v, wd0.l(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f14807v;
        int i10 = this.f14808w;
        this.f14808w = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

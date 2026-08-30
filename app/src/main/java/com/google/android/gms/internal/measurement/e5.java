package com.google.android.gms.internal.measurement;
import q.x;
import w7.i1;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class e5 extends o4 implements g5, w5, RandomAccess {

    /* renamed from: x, reason: collision with root package name */
    public static final e5 f13730x = new e5(new int[0], 0, false);

    /* renamed from: v, reason: collision with root package name */
    public int[] f13731v;

    /* renamed from: w, reason: collision with root package name */
    public int f13732w;

    public e5(int[] iArr, int i, boolean z3) {
        super(z3);
        this.f13731v = iArr;
        this.f13732w = i;
    }

    public final int a(int i) {
        d(i);
        return this.f13731v[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i >= 0 && i <= (i10 = this.f13732w)) {
            int[] iArr = this.f13731v;
            if (i10 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i10 - i);
            } else {
                int[] iArr2 = new int[((i10 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f13731v, i, iArr2, i + 1, this.f13732w - i);
                this.f13731v = iArr2;
            }
            this.f13731v[i] = intValue;
            this.f13732w++;
            ((AbstractList) this).modCount++;
            return;
        }
        x.l(i1.c("Index:", i, this.f13732w, ", Size:"));
    }

    @Override // com.google.android.gms.internal.measurement.o4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = d5.f13686a;
        collection.getClass();
        if (!(collection instanceof e5)) {
            return super.addAll(collection);
        }
        e5 e5Var = (e5) collection;
        int i = e5Var.f13732w;
        if (i == 0) {
            return false;
        }
        int i10 = this.f13732w;
        if (Integer.MAX_VALUE - i10 >= i) {
            int i11 = i10 + i;
            int[] iArr = this.f13731v;
            if (i11 > iArr.length) {
                this.f13731v = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(e5Var.f13731v, 0, this.f13731v, this.f13732w, e5Var.f13732w);
            this.f13732w = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(int i) {
        zza();
        int i10 = this.f13732w;
        int[] iArr = this.f13731v;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f13731v = iArr2;
        }
        int[] iArr3 = this.f13731v;
        int i11 = this.f13732w;
        this.f13732w = i11 + 1;
        iArr3[i11] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        if (i >= 0 && i < this.f13732w) {
            return;
        }
        x.l(i1.c("Index:", i, this.f13732w, ", Size:"));
    }

    @Override // com.google.android.gms.internal.measurement.i5
    public final i5 e(int i) {
        if (i >= this.f13732w) {
            return new e5(Arrays.copyOf(this.f13731v, i), this.f13732w, true);
        }
        x.m();
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.o4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return super.equals(obj);
        }
        e5 e5Var = (e5) obj;
        if (this.f13732w != e5Var.f13732w) {
            return false;
        }
        int[] iArr = e5Var.f13731v;
        for (int i = 0; i < this.f13732w; i++) {
            if (this.f13731v[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(a(i));
    }

    @Override // com.google.android.gms.internal.measurement.o4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f13732w; i10++) {
            i = (i * 31) + this.f13731v[i10];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f13732w;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f13731v[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o4, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        d(i);
        int[] iArr = this.f13731v;
        int i10 = iArr[i];
        if (i < this.f13732w - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f13732w--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        zza();
        if (i10 >= i) {
            int[] iArr = this.f13731v;
            System.arraycopy(iArr, i10, iArr, i, this.f13732w - i10);
            this.f13732w -= i10 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        x.l("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        d(i);
        int[] iArr = this.f13731v;
        int i10 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13732w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}

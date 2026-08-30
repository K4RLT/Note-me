package com.google.android.gms.internal.ads;
import g3.a;
import q.x;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class en1 extends dm1 implements RandomAccess, hn1, go1 {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f5734x;

    /* renamed from: y, reason: collision with root package name */
    public static final en1 f5735y;

    /* renamed from: v, reason: collision with root package name */
    public int[] f5736v;

    /* renamed from: w, reason: collision with root package name */
    public int f5737w;

    static {
        int[] iArr = new int[0];
        f5734x = iArr;
        f5735y = new en1(iArr, 0, false);
    }

    public en1(int[] iArr, int i, boolean z3) {
        super(z3);
        this.f5736v = iArr;
        this.f5737w = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i >= 0 && i <= (i10 = this.f5737w)) {
            int i11 = i + 1;
            int[] iArr = this.f5736v;
            int length = iArr.length;
            if (i10 < length) {
                System.arraycopy(iArr, i, iArr, i11, i10 - i);
            } else {
                int[] iArr2 = new int[wd0.l(length, 3, 2, 1, 10)];
                System.arraycopy(this.f5736v, 0, iArr2, 0, i);
                System.arraycopy(this.f5736v, i, iArr2, i11, this.f5737w - i);
                this.f5736v = iArr2;
            }
            this.f5736v[i] = intValue;
            this.f5737w++;
            ((AbstractList) this).modCount++;
            return;
        }
        x.l(n(i));
    }

    @Override // com.google.android.gms.internal.ads.dm1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        collection.getClass();
        if (!(collection instanceof en1)) {
            return super.addAll(collection);
        }
        en1 en1Var = (en1) collection;
        int i = en1Var.f5737w;
        if (i == 0) {
            return false;
        }
        int i10 = this.f5737w;
        if (Integer.MAX_VALUE - i10 >= i) {
            int i11 = i10 + i;
            int[] iArr = this.f5736v;
            if (i11 > iArr.length) {
                this.f5736v = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(en1Var.f5736v, 0, this.f5736v, this.f5737w, en1Var.f5737w);
            this.f5737w = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.ads.kn1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final en1 B(int i) {
        int[] copyOf;
        if (i >= this.f5737w) {
            if (i == 0) {
                copyOf = f5734x;
            } else {
                copyOf = Arrays.copyOf(this.f5736v, i);
            }
            return new en1(copyOf, this.f5737w, true);
        }
        x.m();
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i) {
        k(i);
        return this.f5736v[i];
    }

    @Override // com.google.android.gms.internal.ads.dm1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en1)) {
            return super.equals(obj);
        }
        en1 en1Var = (en1) obj;
        if (this.f5737w != en1Var.f5737w) {
            return false;
        }
        int[] iArr = en1Var.f5736v;
        for (int i = 0; i < this.f5737w; i++) {
            if (this.f5736v[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i) {
        a();
        int i10 = this.f5737w;
        int length = this.f5736v.length;
        if (i10 == length) {
            int[] iArr = new int[wd0.l(length, 3, 2, 1, 10)];
            System.arraycopy(this.f5736v, 0, iArr, 0, this.f5737w);
            this.f5736v = iArr;
        }
        int[] iArr2 = this.f5736v;
        int i11 = this.f5737w;
        this.f5737w = i11 + 1;
        iArr2[i11] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        k(i);
        return Integer.valueOf(this.f5736v[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f5737w; i10++) {
            i = (i * 31) + this.f5736v[i10];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f5737w;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f5736v[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void k(int i) {
        if (i >= 0 && i < this.f5737w) {
            return;
        }
        x.l(n(i));
    }

    public final String n(int i) {
        int i10 = this.f5737w;
        return a.f(i, i10, "Index:", ", Size:", new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i10).length()));
    }

    @Override // com.google.android.gms.internal.ads.dm1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        k(i);
        int[] iArr = this.f5736v;
        int i10 = iArr[i];
        if (i < this.f5737w - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f5737w--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        a();
        if (i10 >= i) {
            int[] iArr = this.f5736v;
            System.arraycopy(iArr, i10, iArr, i, this.f5737w - i10);
            this.f5737w -= i10 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        x.l("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        k(i);
        int[] iArr = this.f5736v;
        int i10 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5737w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}

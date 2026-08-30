package com.google.android.gms.internal.ads;
import g3.a;
import q.x;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class io1 extends dm1 implements RandomAccess {

    /* renamed from: x, reason: collision with root package name */
    public static final Object[] f7186x;

    /* renamed from: y, reason: collision with root package name */
    public static final io1 f7187y;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f7188v;

    /* renamed from: w, reason: collision with root package name */
    public int f7189w;

    static {
        Object[] objArr = new Object[0];
        f7186x = objArr;
        f7187y = new io1(objArr, 0, false);
    }

    public io1(Object[] objArr, int i, boolean z3) {
        super(z3);
        this.f7188v = objArr;
        this.f7189w = i;
    }

    @Override // com.google.android.gms.internal.ads.kn1
    public final /* bridge */ /* synthetic */ kn1 B(int i) {
        Object[] copyOf;
        if (i >= this.f7189w) {
            if (i == 0) {
                copyOf = f7186x;
            } else {
                copyOf = Arrays.copyOf(this.f7188v, i);
            }
            return new io1(copyOf, this.f7189w, true);
        }
        q.x.m();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        a();
        if (i >= 0 && i <= (i10 = this.f7189w)) {
            int i11 = i + 1;
            Object[] objArr = this.f7188v;
            int length = objArr.length;
            if (i10 < length) {
                System.arraycopy(objArr, i, objArr, i11, i10 - i);
            } else {
                Object[] objArr2 = new Object[wd0.l(length, 3, 2, 1, 10)];
                System.arraycopy(this.f7188v, 0, objArr2, 0, i);
                System.arraycopy(this.f7188v, i, objArr2, i11, this.f7189w - i);
                this.f7188v = objArr2;
            }
            this.f7188v[i] = obj;
            this.f7189w++;
            ((AbstractList) this).modCount++;
            return;
        }
        q.x.l(d(i));
    }

    public final void b(int i) {
        if (i >= 0 && i < this.f7189w) {
            return;
        }
        q.x.l(d(i));
    }

    public final String d(int i) {
        int i10 = this.f7189w;
        return g3.a.f(i, i10, "Index:", ", Size:", new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i10).length()));
    }

    @Override // com.google.android.gms.internal.ads.dm1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.f7189w;
        if (i != list.size()) {
            return false;
        }
        if (obj instanceof io1) {
            io1 io1Var = (io1) obj;
            for (int i10 = 0; i10 < i; i10++) {
                if (!this.f7188v[i10].equals(io1Var.f7188v[i10])) {
                    return false;
                }
            }
            return true;
        }
        for (int i11 = 0; i11 < i; i11++) {
            if (!this.f7188v[i11].equals(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.f7188v[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f7189w;
        int i10 = 1;
        for (int i11 = 0; i11 < i; i11++) {
            i10 = (i10 * 31) + this.f7188v[i11].hashCode();
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.dm1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.f7188v;
        Object obj = objArr[i];
        if (i < this.f7189w - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f7189w--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.f7188v;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7189w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f7189w;
        int length = this.f7188v.length;
        if (i == length) {
            this.f7188v = Arrays.copyOf(this.f7188v, wd0.l(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f7188v;
        int i10 = this.f7189w;
        this.f7189w = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

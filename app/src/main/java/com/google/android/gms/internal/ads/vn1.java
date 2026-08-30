package com.google.android.gms.internal.ads;
import g3.a;
import q.x;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class vn1 extends dm1 implements RandomAccess, jn1, go1 {

    /* renamed from: x, reason: collision with root package name */
    public static final long[] f11955x;

    /* renamed from: y, reason: collision with root package name */
    public static final vn1 f11956y;

    /* renamed from: v, reason: collision with root package name */
    public long[] f11957v;

    /* renamed from: w, reason: collision with root package name */
    public int f11958w;

    static {
        long[] jArr = new long[0];
        f11955x = jArr;
        f11956y = new vn1(jArr, 0, false);
    }

    public vn1(long[] jArr, int i, boolean z3) {
        super(z3);
        this.f11957v = jArr;
        this.f11958w = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        a();
        if (i >= 0 && i <= (i10 = this.f11958w)) {
            int i11 = i + 1;
            long[] jArr = this.f11957v;
            int length = jArr.length;
            if (i10 < length) {
                System.arraycopy(jArr, i, jArr, i11, i10 - i);
            } else {
                long[] jArr2 = new long[wd0.l(length, 3, 2, 1, 10)];
                System.arraycopy(this.f11957v, 0, jArr2, 0, i);
                System.arraycopy(this.f11957v, i, jArr2, i11, this.f11958w - i);
                this.f11957v = jArr2;
            }
            this.f11957v[i] = longValue;
            this.f11958w++;
            ((AbstractList) this).modCount++;
            return;
        }
        q.x.l(n(i));
    }

    @Override // com.google.android.gms.internal.ads.dm1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        collection.getClass();
        if (!(collection instanceof vn1)) {
            return super.addAll(collection);
        }
        vn1 vn1Var = (vn1) collection;
        int i = vn1Var.f11958w;
        if (i == 0) {
            return false;
        }
        int i10 = this.f11958w;
        if (Integer.MAX_VALUE - i10 >= i) {
            int i11 = i10 + i;
            long[] jArr = this.f11957v;
            if (i11 > jArr.length) {
                this.f11957v = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(vn1Var.f11957v, 0, this.f11957v, this.f11958w, vn1Var.f11958w);
            this.f11958w = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long b(int i) {
        k(i);
        return this.f11957v[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(long j10) {
        a();
        int i = this.f11958w;
        int length = this.f11957v.length;
        if (i == length) {
            long[] jArr = new long[wd0.l(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11957v, 0, jArr, 0, this.f11958w);
            this.f11957v = jArr;
        }
        long[] jArr2 = this.f11957v;
        int i10 = this.f11958w;
        this.f11958w = i10 + 1;
        jArr2[i10] = j10;
    }

    @Override // com.google.android.gms.internal.ads.dm1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn1)) {
            return super.equals(obj);
        }
        vn1 vn1Var = (vn1) obj;
        if (this.f11958w != vn1Var.f11958w) {
            return false;
        }
        long[] jArr = vn1Var.f11957v;
        for (int i = 0; i < this.f11958w; i++) {
            if (this.f11957v[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.kn1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final vn1 B(int i) {
        long[] copyOf;
        if (i >= this.f11958w) {
            if (i == 0) {
                copyOf = f11955x;
            } else {
                copyOf = Arrays.copyOf(this.f11957v, i);
            }
            return new vn1(copyOf, this.f11958w, true);
        }
        q.x.m();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        k(i);
        return Long.valueOf(this.f11957v[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f11958w; i10++) {
            long j10 = this.f11957v[i10];
            byte[] bArr = ln1.f8074a;
            i = (i * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f11958w;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f11957v[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void k(int i) {
        if (i >= 0 && i < this.f11958w) {
            return;
        }
        q.x.l(n(i));
    }

    public final String n(int i) {
        int i10 = this.f11958w;
        return g3.a.f(i, i10, "Index:", ", Size:", new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i10).length()));
    }

    @Override // com.google.android.gms.internal.ads.dm1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        k(i);
        long[] jArr = this.f11957v;
        long j10 = jArr[i];
        if (i < this.f11958w - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f11958w--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        a();
        if (i10 >= i) {
            long[] jArr = this.f11957v;
            System.arraycopy(jArr, i10, jArr, i, this.f11958w - i10);
            this.f11958w -= i10 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        q.x.l("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        k(i);
        long[] jArr = this.f11957v;
        long j10 = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11958w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}

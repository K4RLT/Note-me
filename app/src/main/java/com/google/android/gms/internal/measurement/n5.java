package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n5 extends o4 implements f5, w5, RandomAccess {

    /* renamed from: x, reason: collision with root package name */
    public static final n5 f13859x = new n5(new long[0], 0, false);

    /* renamed from: v, reason: collision with root package name */
    public long[] f13860v;

    /* renamed from: w, reason: collision with root package name */
    public int f13861w;

    public n5(long[] jArr, int i, boolean z3) {
        super(z3);
        this.f13860v = jArr;
        this.f13861w = i;
    }

    public final void a(long j10) {
        zza();
        int i = this.f13861w;
        long[] jArr = this.f13860v;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f13860v = jArr2;
        }
        long[] jArr3 = this.f13860v;
        int i10 = this.f13861w;
        this.f13861w = i10 + 1;
        jArr3[i10] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i >= 0 && i <= (i10 = this.f13861w)) {
            long[] jArr = this.f13860v;
            if (i10 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i10 - i);
            } else {
                long[] jArr2 = new long[((i10 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f13860v, i, jArr2, i + 1, this.f13861w - i);
                this.f13860v = jArr2;
            }
            this.f13860v[i] = longValue;
            this.f13861w++;
            ((AbstractList) this).modCount++;
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f13861w, ", Size:"));
    }

    @Override // com.google.android.gms.internal.measurement.o4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = d5.f13686a;
        collection.getClass();
        if (!(collection instanceof n5)) {
            return super.addAll(collection);
        }
        n5 n5Var = (n5) collection;
        int i = n5Var.f13861w;
        if (i == 0) {
            return false;
        }
        int i10 = this.f13861w;
        if (Integer.MAX_VALUE - i10 >= i) {
            int i11 = i10 + i;
            long[] jArr = this.f13860v;
            if (i11 > jArr.length) {
                this.f13860v = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(n5Var.f13860v, 0, this.f13860v, this.f13861w, n5Var.f13861w);
            this.f13861w = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long b(int i) {
        d(i);
        return this.f13860v[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        if (i >= 0 && i < this.f13861w) {
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f13861w, ", Size:"));
    }

    @Override // com.google.android.gms.internal.measurement.i5
    public final i5 e(int i) {
        if (i >= this.f13861w) {
            return new n5(Arrays.copyOf(this.f13860v, i), this.f13861w, true);
        }
        q.x.m();
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.o4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return super.equals(obj);
        }
        n5 n5Var = (n5) obj;
        if (this.f13861w != n5Var.f13861w) {
            return false;
        }
        long[] jArr = n5Var.f13860v;
        for (int i = 0; i < this.f13861w; i++) {
            if (this.f13860v[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(b(i));
    }

    @Override // com.google.android.gms.internal.measurement.o4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f13861w; i10++) {
            i = (i * 31) + d5.a(this.f13860v[i10]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f13861w;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f13860v[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o4, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        d(i);
        long[] jArr = this.f13860v;
        long j10 = jArr[i];
        if (i < this.f13861w - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f13861w--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        zza();
        if (i10 >= i) {
            long[] jArr = this.f13860v;
            System.arraycopy(jArr, i10, jArr, i, this.f13861w - i10);
            this.f13861w -= i10 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        q.x.l("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        d(i);
        long[] jArr = this.f13860v;
        long j10 = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13861w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        a(((Long) obj).longValue());
        return true;
    }
}

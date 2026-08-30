package com.google.android.gms.internal.play_billing;
import i1.c;
import q.x;

import com.google.android.gms.internal.ads.wd0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class s1 extends c1 implements RandomAccess, t1 {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f15523x;

    /* renamed from: y, reason: collision with root package name */
    public static final s1 f15524y;

    /* renamed from: v, reason: collision with root package name */
    public int[] f15525v;

    /* renamed from: w, reason: collision with root package name */
    public int f15526w;

    static {
        int[] iArr = new int[0];
        f15523x = iArr;
        f15524y = new s1(iArr, 0, false);
    }

    public s1(int[] iArr, int i, boolean z3) {
        super(z3);
        this.f15525v = iArr;
        this.f15526w = i;
    }

    public final int a(int i) {
        d(i);
        return this.f15525v[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i >= 0 && i <= (i10 = this.f15526w)) {
            int i11 = i + 1;
            int[] iArr = this.f15525v;
            int length = iArr.length;
            if (i10 < length) {
                System.arraycopy(iArr, i, iArr, i11, i10 - i);
            } else {
                int[] iArr2 = new int[wd0.l(length, 3, 2, 1, 10)];
                System.arraycopy(this.f15525v, 0, iArr2, 0, i);
                System.arraycopy(this.f15525v, i, iArr2, i11, this.f15526w - i);
                this.f15525v = iArr2;
            }
            this.f15525v[i] = intValue;
            this.f15526w++;
            ((AbstractList) this).modCount++;
            return;
        }
        x.l(w7.c("Index:", i, this.f15526w, ", Size:"));
    }

    @Override // com.google.android.gms.internal.play_billing.c1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = w1.f15539a;
        collection.getClass();
        if (!(collection instanceof s1)) {
            return super.addAll(collection);
        }
        s1 s1Var = (s1) collection;
        int i = s1Var.f15526w;
        if (i == 0) {
            return false;
        }
        int i10 = this.f15526w;
        if (Integer.MAX_VALUE - i10 >= i) {
            int i11 = i10 + i;
            int[] iArr = this.f15525v;
            if (i11 > iArr.length) {
                this.f15525v = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(s1Var.f15525v, 0, this.f15525v, this.f15526w, s1Var.f15526w);
            this.f15526w = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(int i) {
        zza();
        int i10 = this.f15526w;
        int length = this.f15525v.length;
        if (i10 == length) {
            int[] iArr = new int[wd0.l(length, 3, 2, 1, 10)];
            System.arraycopy(this.f15525v, 0, iArr, 0, this.f15526w);
            this.f15525v = iArr;
        }
        int[] iArr2 = this.f15525v;
        int i11 = this.f15526w;
        this.f15526w = i11 + 1;
        iArr2[i11] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        if (i >= 0 && i < this.f15526w) {
            return;
        }
        x.l(w7.c("Index:", i, this.f15526w, ", Size:"));
    }

    @Override // com.google.android.gms.internal.play_billing.c1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return super.equals(obj);
        }
        s1 s1Var = (s1) obj;
        if (this.f15526w != s1Var.f15526w) {
            return false;
        }
        int[] iArr = s1Var.f15525v;
        for (int i = 0; i < this.f15526w; i++) {
            if (this.f15525v[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final /* bridge */ /* synthetic */ v1 f(int i) {
        int[] copyOf;
        if (i >= this.f15526w) {
            if (i == 0) {
                copyOf = f15523x;
            } else {
                copyOf = Arrays.copyOf(this.f15525v, i);
            }
            return new s1(copyOf, this.f15526w, true);
        }
        x.m();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        d(i);
        return Integer.valueOf(this.f15525v[i]);
    }

    @Override // com.google.android.gms.internal.play_billing.c1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f15526w; i10++) {
            i = (i * 31) + this.f15525v[i10];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f15526w;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f15525v[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.c1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        d(i);
        int[] iArr = this.f15525v;
        int i10 = iArr[i];
        if (i < this.f15526w - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f15526w--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        zza();
        if (i10 >= i) {
            int[] iArr = this.f15525v;
            System.arraycopy(iArr, i10, iArr, i, this.f15526w - i10);
            this.f15526w -= i10 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        x.l("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        d(i);
        int[] iArr = this.f15525v;
        int i10 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15526w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}

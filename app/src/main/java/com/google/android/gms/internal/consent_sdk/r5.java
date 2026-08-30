package com.google.android.gms.internal.consent_sdk;
import i1.c;
import q.x;
import x.l;
import x.m;

import com.google.android.gms.internal.ads.wd0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class r5 extends d5 implements RandomAccess, s5 {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f13535x;

    /* renamed from: y, reason: collision with root package name */
    public static final r5 f13536y;

    /* renamed from: v, reason: collision with root package name */
    public int[] f13537v;

    /* renamed from: w, reason: collision with root package name */
    public int f13538w;

    static {
        int[] iArr = new int[0];
        f13535x = iArr;
        f13536y = new r5(iArr, 0, false);
    }

    public r5(int[] iArr, int i, boolean z3) {
        super(z3);
        this.f13537v = iArr;
        this.f13538w = i;
    }

    public final int a(int i) {
        b(i);
        return this.f13537v[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i >= 0 && i <= (i10 = this.f13538w)) {
            int i11 = i + 1;
            int[] iArr = this.f13537v;
            int length = iArr.length;
            if (i10 < length) {
                System.arraycopy(iArr, i, iArr, i11, i10 - i);
            } else {
                int[] iArr2 = new int[wd0.l(length, 3, 2, 1, 10)];
                System.arraycopy(this.f13537v, 0, iArr2, 0, i);
                System.arraycopy(this.f13537v, i, iArr2, i11, this.f13538w - i);
                this.f13537v = iArr2;
            }
            this.f13537v[i] = intValue;
            this.f13538w++;
            ((AbstractList) this).modCount++;
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f13538w, ", Size:"));
    }

    @Override // com.google.android.gms.internal.consent_sdk.d5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = u5.f13575a;
        collection.getClass();
        if (!(collection instanceof r5)) {
            return super.addAll(collection);
        }
        r5 r5Var = (r5) collection;
        int i = r5Var.f13538w;
        if (i == 0) {
            return false;
        }
        int i10 = this.f13538w;
        if (Integer.MAX_VALUE - i10 >= i) {
            int i11 = i10 + i;
            int[] iArr = this.f13537v;
            if (i11 > iArr.length) {
                this.f13537v = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(r5Var.f13537v, 0, this.f13537v, this.f13538w, r5Var.f13538w);
            this.f13538w = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(int i) {
        if (i >= 0 && i < this.f13538w) {
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f13538w, ", Size:"));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.consent_sdk.d5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5)) {
            return super.equals(obj);
        }
        r5 r5Var = (r5) obj;
        if (this.f13538w != r5Var.f13538w) {
            return false;
        }
        int[] iArr = r5Var.f13537v;
        for (int i = 0; i < this.f13538w; i++) {
            if (this.f13537v[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final /* bridge */ /* synthetic */ t5 f(int i) {
        int[] copyOf;
        if (i >= this.f13538w) {
            if (i == 0) {
                copyOf = f13535x;
            } else {
                copyOf = Arrays.copyOf(this.f13537v, i);
            }
            return new r5(copyOf, this.f13538w, true);
        }
        q.x.m();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Integer.valueOf(this.f13537v[i]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.d5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f13538w; i10++) {
            i = (i * 31) + this.f13537v[i10];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f13538w;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f13537v[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.d5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        b(i);
        int[] iArr = this.f13537v;
        int i10 = iArr[i];
        if (i < this.f13538w - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f13538w--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        zza();
        if (i10 >= i) {
            int[] iArr = this.f13537v;
            System.arraycopy(iArr, i10, iArr, i, this.f13538w - i10);
            this.f13538w -= i10 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        q.x.l("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        b(i);
        int[] iArr = this.f13537v;
        int i10 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13538w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        int i = this.f13538w;
        int length = this.f13537v.length;
        if (i == length) {
            int[] iArr = new int[wd0.l(length, 3, 2, 1, 10)];
            System.arraycopy(this.f13537v, 0, iArr, 0, this.f13538w);
            this.f13537v = iArr;
        }
        int[] iArr2 = this.f13537v;
        int i10 = this.f13538w;
        this.f13538w = i10 + 1;
        iArr2[i10] = intValue;
        return true;
    }
}

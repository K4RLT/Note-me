package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;
import w7.i1;
import x.l;
import x.m;

import com.google.android.gms.internal.ads.wd0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class pn extends mm implements RandomAccess, tn, no {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f14801x;

    /* renamed from: y, reason: collision with root package name */
    public static final pn f14802y;

    /* renamed from: v, reason: collision with root package name */
    public int[] f14803v;

    /* renamed from: w, reason: collision with root package name */
    public int f14804w;

    static {
        int[] iArr = new int[0];
        f14801x = iArr;
        f14802y = new pn(iArr, 0, false);
    }

    public pn(int[] iArr, int i, boolean z3) {
        super(z3);
        this.f14803v = iArr;
        this.f14804w = i;
    }

    public final int a(int i) {
        g(i);
        return this.f14803v[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i >= 0 && i <= (i10 = this.f14804w)) {
            int i11 = i + 1;
            int[] iArr = this.f14803v;
            int length = iArr.length;
            if (i10 < length) {
                System.arraycopy(iArr, i, iArr, i11, i10 - i);
            } else {
                int[] iArr2 = new int[wd0.l(length, 3, 2, 1, 10)];
                System.arraycopy(this.f14803v, 0, iArr2, 0, i);
                System.arraycopy(this.f14803v, i, iArr2, i11, this.f14804w - i);
                this.f14803v = iArr2;
            }
            this.f14803v[i] = intValue;
            this.f14804w++;
            ((AbstractList) this).modCount++;
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f14804w, ", Size:"));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.mm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = vn.f15137a;
        collection.getClass();
        if (!(collection instanceof pn)) {
            return super.addAll(collection);
        }
        pn pnVar = (pn) collection;
        int i = pnVar.f14804w;
        if (i == 0) {
            return false;
        }
        int i10 = this.f14804w;
        if (Integer.MAX_VALUE - i10 >= i) {
            int i11 = i10 + i;
            int[] iArr = this.f14803v;
            if (i11 > iArr.length) {
                this.f14803v = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(pnVar.f14803v, 0, this.f14803v, this.f14804w, pnVar.f14804w);
            this.f14804w = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.un
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pn f(int i) {
        int[] copyOf;
        if (i >= this.f14804w) {
            if (i == 0) {
                copyOf = f14801x;
            } else {
                copyOf = Arrays.copyOf(this.f14803v, i);
            }
            return new pn(copyOf, this.f14804w, true);
        }
        q.x.m();
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        zza();
        int i10 = this.f14804w;
        int length = this.f14803v.length;
        if (i10 == length) {
            int[] iArr = new int[wd0.l(length, 3, 2, 1, 10)];
            System.arraycopy(this.f14803v, 0, iArr, 0, this.f14804w);
            this.f14803v = iArr;
        }
        int[] iArr2 = this.f14803v;
        int i11 = this.f14804w;
        this.f14804w = i11 + 1;
        iArr2[i11] = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.mm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn)) {
            return super.equals(obj);
        }
        pn pnVar = (pn) obj;
        if (this.f14804w != pnVar.f14804w) {
            return false;
        }
        int[] iArr = pnVar.f14803v;
        for (int i = 0; i < this.f14804w; i++) {
            if (this.f14803v[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i) {
        if (i >= 0 && i < this.f14804w) {
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f14804w, ", Size:"));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        g(i);
        return Integer.valueOf(this.f14803v[i]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.mm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f14804w; i10++) {
            i = (i * 31) + this.f14803v[i10];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f14804w;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f14803v[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.mm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        g(i);
        int[] iArr = this.f14803v;
        int i10 = iArr[i];
        if (i < this.f14804w - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f14804w--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        zza();
        if (i10 >= i) {
            int[] iArr = this.f14803v;
            System.arraycopy(iArr, i10, iArr, i, this.f14804w - i10);
            this.f14804w -= i10 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        q.x.l("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        g(i);
        int[] iArr = this.f14803v;
        int i10 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14804w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}

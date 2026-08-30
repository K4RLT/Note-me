package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;
import w7.i1;

import com.google.android.gms.internal.ads.wd0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class fn extends mm implements RandomAccess, sn, no {

    /* renamed from: x, reason: collision with root package name */
    public static final float[] f14310x;

    /* renamed from: y, reason: collision with root package name */
    public static final fn f14311y;

    /* renamed from: v, reason: collision with root package name */
    public float[] f14312v;

    /* renamed from: w, reason: collision with root package name */
    public int f14313w;

    static {
        float[] fArr = new float[0];
        f14310x = fArr;
        f14311y = new fn(fArr, 0, false);
    }

    public fn(float[] fArr, int i, boolean z3) {
        super(z3);
        this.f14312v = fArr;
        this.f14313w = i;
    }

    public final void a(float f10) {
        zza();
        int i = this.f14313w;
        int length = this.f14312v.length;
        if (i == length) {
            float[] fArr = new float[wd0.l(length, 3, 2, 1, 10)];
            System.arraycopy(this.f14312v, 0, fArr, 0, this.f14313w);
            this.f14312v = fArr;
        }
        float[] fArr2 = this.f14312v;
        int i10 = this.f14313w;
        this.f14313w = i10 + 1;
        fArr2[i10] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i >= 0 && i <= (i10 = this.f14313w)) {
            int i11 = i + 1;
            float[] fArr = this.f14312v;
            int length = fArr.length;
            if (i10 < length) {
                System.arraycopy(fArr, i, fArr, i11, i10 - i);
            } else {
                float[] fArr2 = new float[wd0.l(length, 3, 2, 1, 10)];
                System.arraycopy(this.f14312v, 0, fArr2, 0, i);
                System.arraycopy(this.f14312v, i, fArr2, i11, this.f14313w - i);
                this.f14312v = fArr2;
            }
            this.f14312v[i] = floatValue;
            this.f14313w++;
            ((AbstractList) this).modCount++;
            return;
        }
        x.l(i1.c("Index:", i, this.f14313w, ", Size:"));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.mm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = vn.f15137a;
        collection.getClass();
        if (!(collection instanceof fn)) {
            return super.addAll(collection);
        }
        fn fnVar = (fn) collection;
        int i = fnVar.f14313w;
        if (i == 0) {
            return false;
        }
        int i10 = this.f14313w;
        if (Integer.MAX_VALUE - i10 >= i) {
            int i11 = i10 + i;
            float[] fArr = this.f14312v;
            if (i11 > fArr.length) {
                this.f14312v = Arrays.copyOf(fArr, i11);
            }
            System.arraycopy(fnVar.f14312v, 0, this.f14312v, this.f14313w, fnVar.f14313w);
            this.f14313w = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(int i) {
        if (i >= 0 && i < this.f14313w) {
            return;
        }
        x.l(i1.c("Index:", i, this.f14313w, ", Size:"));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.mm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn)) {
            return super.equals(obj);
        }
        fn fnVar = (fn) obj;
        if (this.f14313w != fnVar.f14313w) {
            return false;
        }
        float[] fArr = fnVar.f14312v;
        for (int i = 0; i < this.f14313w; i++) {
            if (Float.floatToIntBits(this.f14312v[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.un
    public final /* bridge */ /* synthetic */ un f(int i) {
        float[] copyOf;
        if (i >= this.f14313w) {
            if (i == 0) {
                copyOf = f14310x;
            } else {
                copyOf = Arrays.copyOf(this.f14312v, i);
            }
            return new fn(copyOf, this.f14313w, true);
        }
        x.m();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Float.valueOf(this.f14312v[i]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.mm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f14313w; i10++) {
            i = (i * 31) + Float.floatToIntBits(this.f14312v[i10]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f14313w;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f14312v[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.mm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        b(i);
        float[] fArr = this.f14312v;
        float f10 = fArr[i];
        if (i < this.f14313w - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f14313w--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        zza();
        if (i10 >= i) {
            float[] fArr = this.f14312v;
            System.arraycopy(fArr, i10, fArr, i, this.f14313w - i10);
            this.f14313w -= i10 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        x.l("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        b(i);
        float[] fArr = this.f14312v;
        float f10 = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14313w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        a(((Float) obj).floatValue());
        return true;
    }
}

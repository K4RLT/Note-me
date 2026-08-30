package com.google.android.gms.internal.play_billing;
import i1.c;
import q.x;
import x.l;
import x.m;

import com.google.android.gms.internal.ads.wd0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n2 extends c1 implements RandomAccess {

    /* renamed from: x, reason: collision with root package name */
    public static final Object[] f15492x;

    /* renamed from: y, reason: collision with root package name */
    public static final n2 f15493y;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f15494v;

    /* renamed from: w, reason: collision with root package name */
    public int f15495w;

    static {
        Object[] objArr = new Object[0];
        f15492x = objArr;
        f15493y = new n2(objArr, 0, false);
    }

    public n2(Object[] objArr, int i, boolean z3) {
        super(z3);
        this.f15494v = objArr;
        this.f15495w = i;
    }

    public final void a(int i) {
        if (i >= 0 && i < this.f15495w) {
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f15495w, ", Size:"));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        zza();
        if (i >= 0 && i <= (i10 = this.f15495w)) {
            int i11 = i + 1;
            Object[] objArr = this.f15494v;
            int length = objArr.length;
            if (i10 < length) {
                System.arraycopy(objArr, i, objArr, i11, i10 - i);
            } else {
                Object[] objArr2 = new Object[wd0.l(length, 3, 2, 1, 10)];
                System.arraycopy(this.f15494v, 0, objArr2, 0, i);
                System.arraycopy(this.f15494v, i, objArr2, i11, this.f15495w - i);
                this.f15494v = objArr2;
            }
            this.f15494v[i] = obj;
            this.f15495w++;
            ((AbstractList) this).modCount++;
            return;
        }
        q.x.l(w7.i1.c("Index:", i, this.f15495w, ", Size:"));
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final /* bridge */ /* synthetic */ v1 f(int i) {
        Object[] copyOf;
        if (i >= this.f15495w) {
            if (i == 0) {
                copyOf = f15492x;
            } else {
                copyOf = Arrays.copyOf(this.f15494v, i);
            }
            return new n2(copyOf, this.f15495w, true);
        }
        q.x.m();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        a(i);
        return this.f15494v[i];
    }

    @Override // com.google.android.gms.internal.play_billing.c1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        a(i);
        Object[] objArr = this.f15494v;
        Object obj = objArr[i];
        if (i < this.f15495w - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f15495w--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        a(i);
        Object[] objArr = this.f15494v;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15495w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.f15495w;
        int length = this.f15494v.length;
        if (i == length) {
            this.f15494v = Arrays.copyOf(this.f15494v, wd0.l(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f15494v;
        int i10 = this.f15495w;
        this.f15495w = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

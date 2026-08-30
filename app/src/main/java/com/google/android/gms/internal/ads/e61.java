package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class e61 extends j51 {
    public static final Object[] C;
    public static final e61 D;
    public final transient int A;
    public final transient int B;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f5603x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f5604y;

    /* renamed from: z, reason: collision with root package name */
    public final transient Object[] f5605z;

    static {
        Object[] objArr = new Object[0];
        C = objArr;
        D = new e61(0, 0, 0, objArr, objArr);
    }

    public e61(int i, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f5603x = objArr;
        this.f5604y = i;
        this.f5605z = objArr2;
        this.A = i10;
        this.B = i11;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final m61 a() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final Object[] b() {
        return this.f5603x;
    }

    @Override // com.google.android.gms.internal.ads.z41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f5605z;
            if (objArr.length != 0) {
                int q10 = b80.q(obj);
                while (true) {
                    int i = q10 & this.A;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    q10 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final int g() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.j51, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5604y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final int o(Object[] objArr, int i) {
        Object[] objArr2 = this.f5603x;
        int i10 = this.B;
        System.arraycopy(objArr2, 0, objArr, i, i10);
        return i + i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.j51
    public final d51 t() {
        return d51.w(this.f5603x, this.B);
    }
}

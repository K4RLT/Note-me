package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f5 extends n4 {
    public static final Object[] C;
    public static final f5 D;
    public final transient int A;
    public final transient int B;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f14297x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f14298y;

    /* renamed from: z, reason: collision with root package name */
    public final transient Object[] f14299z;

    static {
        Object[] objArr = new Object[0];
        C = objArr;
        D = new f5(0, 0, 0, objArr, objArr);
    }

    public f5(int i, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f14297x = objArr;
        this.f14298y = i;
        this.f14299z = objArr2;
        this.A = i10;
        this.B = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int a(Object[] objArr, int i) {
        Object[] objArr2 = this.f14297x;
        int i10 = this.B;
        System.arraycopy(objArr2, 0, objArr, i, i10);
        return i + i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int b() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f14299z;
            if (objArr.length != 0) {
                int j10 = tl.j(obj);
                while (true) {
                    int i = j10 & this.A;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    j10 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n4, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14298y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final k5 k() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final Object[] o() {
        return this.f14297x;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n4
    public final h4 q() {
        return h4.r(this.f14297x, this.B);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.B;
    }
}

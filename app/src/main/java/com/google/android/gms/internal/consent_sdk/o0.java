package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class o0 extends l0 {
    public static final Object[] B;
    public static final o0 C;
    public final transient int A;

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f13509w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f13510x;

    /* renamed from: y, reason: collision with root package name */
    public final transient Object[] f13511y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f13512z;

    static {
        Object[] objArr = new Object[0];
        B = objArr;
        C = new o0(0, 0, 0, objArr, objArr);
    }

    public o0(int i, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f13509w = objArr;
        this.f13510x = i;
        this.f13511y = objArr2;
        this.f13512z = i10;
        this.A = i11;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h0
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f13509w;
        int i = this.A;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h0
    public final int b() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f13511y;
            if (objArr.length != 0) {
                int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
                while (true) {
                    int i = rotateLeft & this.f13512z;
                    Object obj2 = objArr[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return true;
                        }
                        rotateLeft = i + 1;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.h0
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h0
    public final Object[] g() {
        return this.f13509w;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13510x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        k0 k0Var = this.f13481v;
        if (k0Var == null) {
            i0 i0Var = k0.f13473v;
            int i = this.A;
            if (i == 0) {
                k0Var = n0.f13498y;
            } else {
                k0Var = new n0(this.f13509w, i);
            }
            this.f13481v = k0Var;
        }
        return k0Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A;
    }
}

package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g3.a;
import g5.q;
import q.x;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class n4 extends c4 implements Set {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f14693w = 0;

    /* renamed from: v, reason: collision with root package name */
    public transient h4 f14694v;

    public static int p(int i) {
        boolean z3;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return 1073741824;
        }
        x.n("collection too large");
        return 0;
    }

    public static n4 r(Collection collection) {
        if ((collection instanceof n4) && !(collection instanceof SortedSet)) {
            n4 n4Var = (n4) collection;
            if (!n4Var.n()) {
                return n4Var;
            }
        }
        Object[] array = collection.toArray();
        return s(array, array.length);
    }

    public static n4 s(Object[] objArr, int i) {
        if (i != 0) {
            if (i != 1) {
                int p10 = p(i);
                Object[] objArr2 = new Object[p10];
                int i10 = p10 - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i; i13++) {
                    Object obj = objArr[i13];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int a10 = tl.a(hashCode);
                        while (true) {
                            int i14 = a10 & i10;
                            Object obj2 = objArr2[i14];
                            if (obj2 == null) {
                                objArr[i12] = obj;
                                objArr2[i14] = obj;
                                i11 += hashCode;
                                i12++;
                                break;
                            }
                            if (!obj2.equals(obj)) {
                                a10++;
                            }
                        }
                    } else {
                        q.h(a.g(i13, "at index "));
                        return null;
                    }
                }
                Arrays.fill(objArr, i12, i, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new h5(obj3);
                }
                if (p(i12) < p10 / 2) {
                    return s(objArr, i12);
                }
                int length = objArr.length;
                if (i12 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i12);
                }
                return new f5(i11, i10, i12, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new h5(obj4);
        }
        return f5.D;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof n4) && (this instanceof f5) && (((n4) obj) instanceof f5) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public h4 g() {
        h4 h4Var = this.f14694v;
        if (h4Var == null) {
            h4 q10 = q();
            this.f14694v = q10;
            return q10;
        }
        return h4Var;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i;
        int i10 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i10 += i;
        }
        return i10;
    }

    public h4 q() {
        Object[] array = toArray(c4.f14147u);
        e4 e4Var = h4.f14393v;
        return h4.r(array, array.length);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class j51 extends z41 implements Set {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f7334w = 0;

    /* renamed from: v, reason: collision with root package name */
    public transient d51 f7335v;

    public static j51 p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return v(objArr2, i);
    }

    public static int q(int i) {
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
        b80.w("collection too large", z3);
        return 1073741824;
    }

    public static j51 r(Set set) {
        if ((set instanceof j51) && !(set instanceof SortedSet)) {
            j51 j51Var = (j51) set;
            if (!j51Var.n()) {
                return j51Var;
            }
        }
        Object[] array = set.toArray();
        return v(array, array.length);
    }

    public static j51 s(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return v((Object[]) objArr.clone(), length);
            }
            return new k51(objArr[0]);
        }
        return e61.D;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.i51, com.google.android.gms.internal.ads.y41] */
    public static i51 u(int i) {
        ed1.u(i, "expectedSize");
        y41 y41Var = new y41(i);
        y41Var.f6998d = new Object[q(i)];
        return y41Var;
    }

    public static j51 v(Object[] objArr, int i) {
        if (i != 0) {
            if (i != 1) {
                int q10 = q(i);
                Object[] objArr2 = new Object[q10];
                int i10 = q10 - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i; i13++) {
                    Object obj = objArr[i13];
                    ct.n(i13, obj);
                    int hashCode = obj.hashCode();
                    int p10 = b80.p(hashCode);
                    while (true) {
                        int i14 = p10 & i10;
                        Object obj2 = objArr2[i14];
                        if (obj2 == null) {
                            objArr[i12] = obj;
                            objArr2[i14] = obj;
                            i11 += hashCode;
                            i12++;
                            break;
                        }
                        if (!obj2.equals(obj)) {
                            p10++;
                        }
                    }
                }
                Arrays.fill(objArr, i12, i, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new k51(obj3);
                }
                if (q(i12) < q10 / 2) {
                    return v(objArr, i12);
                }
                int length = objArr.length;
                if (i12 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i12);
                }
                return new e61(i11, i10, i12, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new k51(obj4);
        }
        return e61.D;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof j51) && (this instanceof e61) && (((j51) obj) instanceof e61) && hashCode() != obj.hashCode()) {
            return false;
        }
        return xy.P(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return xy.K(this);
    }

    @Override // com.google.android.gms.internal.ads.z41
    public d51 k() {
        d51 d51Var = this.f7335v;
        if (d51Var == null) {
            d51 t3 = t();
            this.f7335v = t3;
            return t3;
        }
        return d51Var;
    }

    public d51 t() {
        Object[] array = toArray(z41.f13076u);
        b51 b51Var = d51.f5314v;
        return d51.w(array, array.length);
    }
}
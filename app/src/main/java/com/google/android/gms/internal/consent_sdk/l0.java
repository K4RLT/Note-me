package com.google.android.gms.internal.consent_sdk;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class l0 extends h0 implements Set {

    /* renamed from: v, reason: collision with root package name */
    public transient k0 f13481v;

    public static int k(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        q.x.n("collection too large");
        return 0;
    }

    public static l0 n(Object[] objArr, int i) {
        if (i != 0) {
            if (i != 1) {
                int k3 = k(i);
                Object[] objArr2 = new Object[k3];
                int i10 = k3 - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i; i13++) {
                    Object obj = objArr[i13];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
                        while (true) {
                            int i14 = rotateLeft & i10;
                            Object obj2 = objArr2[i14];
                            if (obj2 == null) {
                                objArr[i12] = obj;
                                objArr2[i14] = obj;
                                i11 += hashCode;
                                i12++;
                                break;
                            }
                            if (!obj2.equals(obj)) {
                                rotateLeft++;
                            }
                        }
                    } else {
                        g5.q.h(g3.a.g(i13, "at index "));
                        return null;
                    }
                }
                Arrays.fill(objArr, i12, i, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new q0(obj3);
                }
                if (k(i12) >= k3 / 2) {
                    if (i12 < 3) {
                        objArr = Arrays.copyOf(objArr, i12);
                    }
                    return new o0(i11, i10, i12, objArr, objArr2);
                }
                return n(objArr, i12);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new q0(obj4);
        }
        return o0.C;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof l0) && (this instanceof o0) && (((l0) obj) instanceof o0) && hashCode() != obj.hashCode()) {
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

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();
}

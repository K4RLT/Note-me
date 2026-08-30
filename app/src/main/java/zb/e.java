package zb;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import q.x;
import ya.cf;

/* loaded from: classes.dex */
public abstract class e extends a implements Set {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f32030w = 0;

    /* renamed from: v, reason: collision with root package name */
    public transient d f32031v;

    public static int k(int i) {
        int max = Math.max(i, 2);
        boolean z3 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z3 = false;
        }
        if (z3) {
            return 1073741824;
        }
        x.n("collection too large");
        return 0;
    }

    public static e n(Object[] objArr, int i) {
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
                        int a10 = cf.a(hashCode);
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
                            if (obj2.equals(obj)) {
                                break;
                            }
                            a10++;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(20);
                        sb2.append("at index ");
                        sb2.append(i13);
                        throw new NullPointerException(sb2.toString());
                    }
                }
                Arrays.fill(objArr, i12, i, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new i(obj3);
                }
                if (k(i12) < k3 / 2) {
                    return n(objArr, i12);
                }
                int length = objArr.length;
                if (i12 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i12);
                }
                return new h(i11, i10, i12, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new i(obj4);
        }
        return h.D;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof e) && (this instanceof h) && (((e) obj) instanceof h) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();
}

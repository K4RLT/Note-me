package xa;
import x.n;
import q.h;
import q.x;
import u0.a;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class l extends f implements Set {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f30452w = 0;

    /* renamed from: v, reason: collision with root package name */
    public transient i f30453v;

    public static int n(int i) {
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
        x.n("collection too large");
        return 0;
    }

    public static l o(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return r((Object[]) objArr.clone(), length);
            }
            return new v(objArr[0]);
        }
        return u.D;
    }

    public static u p() {
        return u.D;
    }

    public static l q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
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
        return r(objArr2, i);
    }

    public static l r(Object[] objArr, int i) {
        if (i != 0) {
            if (i != 1) {
                int n10 = n(i);
                Object[] objArr2 = new Object[n10];
                int i10 = n10 - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i; i13++) {
                    Object obj = objArr[i13];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int a10 = a(hashCode);
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
                        g5.h(g3.a.g(i13, "at index "));
                        return null;
                    }
                }
                Arrays.fill(objArr, i12, i, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new v(obj3);
                }
                if (n(i12) < n10 / 2) {
                    return r(objArr, i12);
                }
                int length = objArr.length;
                if (i12 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i12);
                }
                return new u(i11, i10, i12, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new v(obj4);
        }
        return u.D;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof l) && (this instanceof u) && (((l) obj) instanceof u) && hashCode() != obj.hashCode()) {
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
}

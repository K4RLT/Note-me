package n;
import l.a;
import o.a;
import q.x;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public class r0 {

    /* renamed from: u, reason: collision with root package name */
    public int[] f20932u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f20933v;

    /* renamed from: w, reason: collision with root package name */
    public int f20934w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(r0 r0Var) {
        this(0);
        int i = r0Var.f20934w;
        b(this.f20934w + i);
        if (this.f20934w == 0) {
            if (i > 0) {
                qe.k.c(0, 0, i, r0Var.f20932u, this.f20932u);
                qe.k.d(0, 0, i << 1, r0Var.f20933v, this.f20933v);
                this.f20934w = i;
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < i; i10++) {
            put(r0Var.g(i10), r0Var.j(i10));
        }
    }

    public final int a(Object obj) {
        int i = this.f20934w * 2;
        Object[] objArr = this.f20933v;
        if (obj == null) {
            for (int i10 = 1; i10 < i; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i10 = this.f20934w;
        int[] iArr = this.f20932u;
        if (iArr.length < i) {
            this.f20932u = Arrays.copyOf(iArr, i);
            this.f20933v = Arrays.copyOf(this.f20933v, i * 2);
        }
        if (this.f20934w == i10) {
            return;
        }
        l4.a.m();
    }

    public final int c(int i, Object obj) {
        int i10 = this.f20934w;
        if (i10 == 0) {
            return -1;
        }
        int a10 = a.a(this.f20932u, i10, i);
        if (a10 < 0 || kotlin.jvm.internal.a(obj, this.f20933v[a10 << 1])) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f20932u[i11] == i) {
            if (kotlin.jvm.internal.a(obj, this.f20933v[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a10 - 1; i12 >= 0 && this.f20932u[i12] == i; i12--) {
            if (kotlin.jvm.internal.a(obj, this.f20933v[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void clear() {
        if (this.f20934w > 0) {
            this.f20932u = a.f21371a;
            this.f20933v = a.f21373c;
            this.f20934w = 0;
        }
        if (this.f20934w <= 0) {
            return;
        }
        l4.a.m();
    }

    public boolean containsKey(Object obj) {
        if (e(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int e(Object obj) {
        if (obj == null) {
            return f();
        }
        return c(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof r0) {
                int i = this.f20934w;
                if (i != ((r0) obj).f20934w) {
                    return false;
                }
                r0 r0Var = (r0) obj;
                for (int i10 = 0; i10 < i; i10++) {
                    Object g8 = g(i10);
                    Object j10 = j(i10);
                    Object obj2 = r0Var.get(g8);
                    if (j10 == null) {
                        if (obj2 != null || !r0Var.containsKey(g8)) {
                            return false;
                        }
                    } else if (!j10.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f20934w != ((Map) obj).size()) {
                return false;
            }
            int i11 = this.f20934w;
            for (int i12 = 0; i12 < i11; i12++) {
                Object g10 = g(i12);
                Object j11 = j(i12);
                Object obj3 = ((Map) obj).get(g10);
                if (j11 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(g10)) {
                        return false;
                    }
                } else if (!j11.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i = this.f20934w;
        if (i == 0) {
            return -1;
        }
        int a10 = a.a(this.f20932u, i, 0);
        if (a10 < 0 || this.f20933v[a10 << 1] == null) {
            return a10;
        }
        int i10 = a10 + 1;
        while (i10 < i && this.f20932u[i10] == 0) {
            if (this.f20933v[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a10 - 1; i11 >= 0 && this.f20932u[i11] == 0; i11--) {
            if (this.f20933v[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final Object g(int i) {
        boolean z3 = false;
        if (i >= 0 && i < this.f20934w) {
            z3 = true;
        }
        if (z3) {
            return this.f20933v[i << 1];
        }
        x.n(g3.a.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public Object get(Object obj) {
        int e = e(obj);
        if (e >= 0) {
            return this.f20933v[(e << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e = e(obj);
        if (e >= 0) {
            return this.f20933v[(e << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i) {
        int i10;
        if (i >= 0 && i < (i10 = this.f20934w)) {
            Object[] objArr = this.f20933v;
            int i11 = i << 1;
            Object obj = objArr[i11 + 1];
            if (i10 <= 1) {
                clear();
                return obj;
            }
            int i12 = i10 - 1;
            int[] iArr = this.f20932u;
            int i13 = 8;
            if (iArr.length > 8 && i10 < iArr.length / 3) {
                if (i10 > 8) {
                    i13 = i10 + (i10 >> 1);
                }
                this.f20932u = Arrays.copyOf(iArr, i13);
                this.f20933v = Arrays.copyOf(this.f20933v, i13 << 1);
                if (i10 == this.f20934w) {
                    if (i > 0) {
                        qe.k.c(0, 0, i, iArr, this.f20932u);
                        qe.k.d(0, 0, i11, objArr, this.f20933v);
                    }
                    if (i < i12) {
                        int i14 = i + 1;
                        qe.k.c(i, i14, i10, iArr, this.f20932u);
                        qe.k.d(i11, i14 << 1, i10 << 1, objArr, this.f20933v);
                    }
                } else {
                    l4.a.m();
                    return null;
                }
            } else {
                if (i < i12) {
                    int i15 = i + 1;
                    qe.k.c(i, i15, i10, iArr, iArr);
                    Object[] objArr2 = this.f20933v;
                    qe.k.d(i11, i15 << 1, i10 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f20933v;
                int i16 = i12 << 1;
                objArr3[i16] = null;
                objArr3[i16 + 1] = null;
            }
            if (i10 == this.f20934w) {
                this.f20934w = i12;
                return obj;
            }
            l4.a.m();
            return null;
        }
        x.n(g3.a.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.f20932u;
        Object[] objArr = this.f20933v;
        int i10 = this.f20934w;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            int i14 = iArr[i12];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i13 += i ^ i14;
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final Object i(int i, Object obj) {
        boolean z3 = false;
        if (i >= 0 && i < this.f20934w) {
            z3 = true;
        }
        if (z3) {
            int i10 = (i << 1) + 1;
            Object[] objArr = this.f20933v;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
            return obj2;
        }
        x.n(g3.a.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean isEmpty() {
        if (this.f20934w <= 0) {
            return true;
        }
        return false;
    }

    public final Object j(int i) {
        boolean z3 = false;
        if (i >= 0 && i < this.f20934w) {
            z3 = true;
        }
        if (z3) {
            return this.f20933v[(i << 1) + 1];
        }
        x.n(g3.a.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int f10;
        int i10 = this.f20934w;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj != null) {
            f10 = c(i, obj);
        } else {
            f10 = f();
        }
        if (f10 >= 0) {
            int i11 = (f10 << 1) + 1;
            Object[] objArr = this.f20933v;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~f10;
        int[] iArr = this.f20932u;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            this.f20932u = Arrays.copyOf(iArr, i13);
            this.f20933v = Arrays.copyOf(this.f20933v, i13 << 1);
            if (i10 != this.f20934w) {
                l4.a.m();
                return null;
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f20932u;
            int i14 = i12 + 1;
            qe.k.c(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f20933v;
            qe.k.d(i14 << 1, i12 << 1, this.f20934w << 1, objArr2, objArr2);
        }
        int i15 = this.f20934w;
        if (i10 == i15) {
            int[] iArr3 = this.f20932u;
            if (i12 < iArr3.length) {
                iArr3[i12] = i;
                Object[] objArr3 = this.f20933v;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f20934w = i15 + 1;
                return null;
            }
        }
        l4.a.m();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e = e(obj);
        if (e >= 0 && kotlin.jvm.internal.a(obj2, j(e))) {
            h(e);
            return true;
        }
        return false;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e = e(obj);
        if (e >= 0 && kotlin.jvm.internal.a(obj2, j(e))) {
            i(e, obj3);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f20934w;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f20934w * 28);
        sb2.append('{');
        int i = this.f20934w;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object g8 = g(i10);
            if (g8 != sb2) {
                sb2.append(g8);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object j10 = j(i10);
            if (j10 != sb2) {
                sb2.append(j10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public Object remove(Object obj) {
        int e = e(obj);
        if (e >= 0) {
            return h(e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e = e(obj);
        if (e >= 0) {
            return i(e, obj2);
        }
        return null;
    }

    public r0(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = a.f21371a;
        } else {
            iArr = new int[i];
        }
        this.f20932u = iArr;
        if (i == 0) {
            objArr = a.f21373c;
        } else {
            objArr = new Object[i << 1];
        }
        this.f20933v = objArr;
    }
}

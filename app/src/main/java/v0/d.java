package v0;

import b1.s;
import java.util.Arrays;
import java.util.ListIterator;
import qe.k;
import r0.n1;
import ya.od;
import ya.uc;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: u, reason: collision with root package name */
    public final Object[] f27265u;

    /* renamed from: v, reason: collision with root package name */
    public final Object[] f27266v;

    /* renamed from: w, reason: collision with root package name */
    public final int f27267w;

    /* renamed from: x, reason: collision with root package name */
    public final int f27268x;

    public d(Object[] objArr, Object[] objArr2, int i, int i10) {
        boolean z3;
        this.f27265u = objArr;
        this.f27266v = objArr2;
        this.f27267w = i;
        this.f27268x = i10;
        if (a() > 32) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            n1.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] r(Object[] objArr, int i, int i10, Object obj, p8.c cVar) {
        Object[] copyOf;
        int a10 = uc.a(i10, i);
        if (i == 0) {
            if (a10 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            k.d(a10 + 1, a10, 31, objArr, copyOf);
            cVar.f22619u = objArr[31];
            copyOf[a10] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i11 = i - 5;
        Object obj2 = objArr[a10];
        obj2.getClass();
        copyOf2[a10] = r((Object[]) obj2, i11, i10, obj, cVar);
        while (true) {
            a10++;
            if (a10 >= 32 || copyOf2[a10] == null) {
                break;
            }
            Object obj3 = objArr[a10];
            obj3.getClass();
            copyOf2[a10] = r((Object[]) obj3, i11, 0, cVar.f22619u, cVar);
        }
        return copyOf2;
    }

    public static Object[] t(Object[] objArr, int i, int i10, p8.c cVar) {
        Object[] t3;
        int a10 = uc.a(i10, i);
        if (i == 5) {
            cVar.f22619u = objArr[a10];
            t3 = null;
        } else {
            Object obj = objArr[a10];
            obj.getClass();
            t3 = t((Object[]) obj, i - 5, i10, cVar);
        }
        if (t3 == null && a10 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[a10] = t3;
        return copyOf;
    }

    public static Object[] z(int i, int i10, Object obj, Object[] objArr) {
        int a10 = uc.a(i10, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[a10] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[a10];
        obj2.getClass();
        copyOf[a10] = z(i - 5, i10, obj, (Object[]) obj2);
        return copyOf;
    }

    @Override // qe.a
    public final int a() {
        return this.f27267w;
    }

    @Override // v0.b
    public final b b(int i, Object obj) {
        int i10 = this.f27267w;
        od.b(i, i10);
        if (i == i10) {
            return g(obj);
        }
        int y10 = y();
        Object[] objArr = this.f27265u;
        if (i >= y10) {
            return s(i - y10, obj, objArr);
        }
        p8.c cVar = new p8.c(null);
        return s(0, cVar.f22619u, r(objArr, this.f27268x, i, obj, cVar));
    }

    @Override // v0.b
    public final b g(Object obj) {
        int y10 = y();
        int i = this.f27267w;
        int i10 = i - y10;
        Object[] objArr = this.f27265u;
        Object[] objArr2 = this.f27266v;
        if (i10 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i10] = obj;
            return new d(objArr, copyOf, i + 1, this.f27268x);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return u(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        od.a(i, a());
        if (y() <= i) {
            objArr = this.f27266v;
        } else {
            objArr = this.f27265u;
            for (int i10 = this.f27268x; i10 > 0; i10 -= 5) {
                Object obj = objArr[uc.a(i, i10)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // qe.e, java.util.List
    public final ListIterator listIterator(int i) {
        od.b(i, this.f27267w);
        return new f(i, this.f27267w, (this.f27268x / 5) + 1, this.f27265u, this.f27266v);
    }

    @Override // v0.b
    public final e n() {
        return new e(this, this.f27265u, this.f27266v, this.f27268x);
    }

    @Override // v0.b
    public final b o(s sVar) {
        e eVar = new e(this, this.f27265u, this.f27266v, this.f27268x);
        eVar.I(sVar);
        return eVar.g();
    }

    @Override // v0.b
    public final b p(int i) {
        od.a(i, a());
        int y10 = y();
        int i10 = this.f27268x;
        Object[] objArr = this.f27265u;
        if (i >= y10) {
            return x(objArr, y10, i10, i - y10);
        }
        return x(w(objArr, i10, i, new p8.c(this.f27266v[0])), y10, i10, 0);
    }

    @Override // v0.b
    public final b q(int i, Object obj) {
        int i10 = this.f27267w;
        od.a(i, i10);
        int y10 = y();
        Object[] objArr = this.f27265u;
        Object[] objArr2 = this.f27266v;
        int i11 = this.f27268x;
        if (y10 <= i) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i & 31] = obj;
            return new d(objArr, copyOf, i10, i11);
        }
        return new d(z(i11, i, obj, objArr), objArr2, i10, i11);
    }

    public final d s(int i, Object obj, Object[] objArr) {
        int y10 = y();
        int i10 = this.f27267w;
        int i11 = i10 - y10;
        Object[] objArr2 = this.f27266v;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i11 < 32) {
            k.d(i + 1, i, i11, objArr2, copyOf);
            copyOf[i] = obj;
            return new d(objArr, copyOf, i10 + 1, this.f27268x);
        }
        Object obj2 = objArr2[31];
        k.d(i + 1, i, i11 - 1, objArr2, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return u(objArr, copyOf, objArr3);
    }

    public final d u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f27267w;
        int i10 = i >> 5;
        int i11 = this.f27268x;
        if (i10 > (1 << i11)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i12 = i11 + 5;
            return new d(v(i12, objArr4, objArr2), objArr3, i + 1, i12);
        }
        return new d(v(i11, objArr, objArr2), objArr3, i + 1, i11);
    }

    public final Object[] v(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int a10 = uc.a(a() - 1, i);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[a10] = objArr2;
            return objArr3;
        }
        objArr3[a10] = v(i - 5, (Object[]) objArr3[a10], objArr2);
        return objArr3;
    }

    public final Object[] w(Object[] objArr, int i, int i10, p8.c cVar) {
        Object[] copyOf;
        int a10 = uc.a(i10, i);
        int i11 = 31;
        if (i == 0) {
            if (a10 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            k.d(a10, a10 + 1, 32, objArr, copyOf);
            copyOf[31] = cVar.f22619u;
            cVar.f22619u = objArr[a10];
            return copyOf;
        }
        if (objArr[31] == null) {
            i11 = uc.a(y() - 1, i);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i12 = i - 5;
        int i13 = a10 + 1;
        if (i13 <= i11) {
            while (true) {
                Object obj = copyOf2[i11];
                obj.getClass();
                copyOf2[i11] = w((Object[]) obj, i12, 0, cVar);
                if (i11 == i13) {
                    break;
                }
                i11--;
            }
        }
        Object obj2 = copyOf2[a10];
        obj2.getClass();
        copyOf2[a10] = w((Object[]) obj2, i12, i10, cVar);
        return copyOf2;
    }

    public final b x(Object[] objArr, int i, int i10, int i11) {
        int i12 = this.f27267w - i;
        if (i12 == 1) {
            if (i10 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                }
                return new h(objArr);
            }
            p8.c cVar = new p8.c(null);
            Object[] t3 = t(objArr, i10, i - 1, cVar);
            t3.getClass();
            Object obj = cVar.f22619u;
            obj.getClass();
            Object[] objArr2 = (Object[]) obj;
            if (t3[1] == null) {
                Object obj2 = t3[0];
                obj2.getClass();
                return new d((Object[]) obj2, objArr2, i, i10 - 5);
            }
            return new d(t3, objArr2, i, i10);
        }
        Object[] objArr3 = this.f27266v;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        int i13 = i12 - 1;
        if (i11 < i13) {
            k.d(i11, i11 + 1, i12, objArr3, copyOf);
        }
        copyOf[i13] = null;
        return new d(objArr, copyOf, (i + i12) - 1, i10);
    }

    public final int y() {
        return (this.f27267w - 1) & (-32);
    }
}

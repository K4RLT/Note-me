package n;
import a0.k0;
import l.a;

import java.util.List;
import wa.b9;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f20855a;

    /* renamed from: b, reason: collision with root package name */
    public int f20856b;

    public d0(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = n0.f20918a;
        } else {
            objArr = new Object[i];
        }
        this.f20855a = objArr;
    }

    public final void a(Object obj) {
        int i = this.f20856b + 1;
        Object[] objArr = this.f20855a;
        if (objArr.length < i) {
            l(objArr, i);
        }
        Object[] objArr2 = this.f20855a;
        int i10 = this.f20856b;
        objArr2[i10] = obj;
        this.f20856b = i10 + 1;
    }

    public final void b(List list) {
        if (!list.isEmpty()) {
            int i = this.f20856b;
            int size = list.size() + i;
            Object[] objArr = this.f20855a;
            if (objArr.length < size) {
                l(objArr, size);
            }
            Object[] objArr2 = this.f20855a;
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                objArr2[i10 + i] = list.get(i10);
            }
            this.f20856b = list.size() + this.f20856b;
        }
    }

    public final void c() {
        qe.k.j(0, this.f20856b, null, this.f20855a);
        this.f20856b = 0;
    }

    public final Object d() {
        if (!g()) {
            return this.f20855a[0];
        }
        l4.a.h("ObjectList is empty.");
        return null;
    }

    public final Object e(int i) {
        if (i >= 0 && i < this.f20856b) {
            return this.f20855a[i];
        }
        m(i);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            int i = d0Var.f20856b;
            int i10 = this.f20856b;
            if (i == i10) {
                Object[] objArr = this.f20855a;
                Object[] objArr2 = d0Var.f20855a;
                jf.d i11 = b9.i(0, i10);
                int i12 = i11.f19189u;
                int i13 = i11.f19190v;
                if (i12 <= i13) {
                    while (kotlin.jvm.internal.a(objArr[i12], objArr2[i12])) {
                        if (i12 != i13) {
                            i12++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int f(Object obj) {
        Object[] objArr = this.f20855a;
        int i = 0;
        if (obj == null) {
            int i10 = this.f20856b;
            while (i < i10) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i11 = this.f20856b;
        while (i < i11) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean g() {
        if (this.f20856b == 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.f20856b != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.f20855a;
        int i10 = this.f20856b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i11 += i * 31;
        }
        return i11;
    }

    public final boolean i(Object obj) {
        int f10 = f(obj);
        if (f10 >= 0) {
            j(f10);
            return true;
        }
        return false;
    }

    public final Object j(int i) {
        int i10;
        if (i >= 0 && i < (i10 = this.f20856b)) {
            Object[] objArr = this.f20855a;
            Object obj = objArr[i];
            if (i != i10 - 1) {
                qe.k.d(i, i + 1, i10, objArr, objArr);
            }
            int i11 = this.f20856b - 1;
            this.f20856b = i11;
            objArr[i11] = null;
            return obj;
        }
        m(i);
        throw null;
    }

    public final void k(int i, int i10) {
        int i11;
        if (i >= 0 && i <= (i11 = this.f20856b) && i10 >= 0 && i10 <= i11) {
            if (i10 >= i) {
                if (i10 != i) {
                    if (i10 < i11) {
                        Object[] objArr = this.f20855a;
                        qe.k.d(i, i10, i11, objArr, objArr);
                    }
                    int i12 = this.f20856b;
                    int i13 = i12 - (i10 - i);
                    qe.k.j(i13, i12, null, this.f20855a);
                    this.f20856b = i13;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i10 + ')');
        }
        l4.a.d(this.f20856b, g3.a.n("Start (", i, ") and end (", ") must be in 0..", i10));
    }

    public final void l(Object[] objArr, int i) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        qe.k.d(0, 0, length, objArr, objArr2);
        this.f20855a = objArr2;
    }

    public final void m(int i) {
        StringBuilder m4 = g3.a.m("Index ", i, " must be in 0..");
        m4.append(this.f20856b - 1);
        throw new IndexOutOfBoundsException(m4.toString());
    }

    public final String toString() {
        k0 k0Var = new k0(25, this);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f20855a;
        int i = this.f20856b;
        int i10 = 0;
        while (true) {
            if (i10 < i) {
                Object obj = objArr[i10];
                if (i10 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append((CharSequence) k0Var.invoke(obj));
                i10++;
            } else {
                sb2.append((CharSequence) "]");
                break;
            }
        }
        return sb2.toString();
    }

    public /* synthetic */ d0() {
        this(16);
    }
}

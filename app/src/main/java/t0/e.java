package t0;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;
import qe.m;

/* loaded from: classes.dex */
public final class e implements RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    public Object[] f25617u;

    /* renamed from: v, reason: collision with root package name */
    public b f25618v;

    /* renamed from: w, reason: collision with root package name */
    public int f25619w = 0;

    public e(Object[] objArr) {
        this.f25617u = objArr;
    }

    public final void a(int i, Object obj) {
        int i10 = this.f25619w + 1;
        if (this.f25617u.length < i10) {
            p(i10);
        }
        Object[] objArr = this.f25617u;
        int i11 = this.f25619w;
        if (i != i11) {
            System.arraycopy(objArr, i, objArr, i + 1, i11 - i);
        }
        objArr[i] = obj;
        this.f25619w++;
    }

    public final void b(Object obj) {
        int i = this.f25619w + 1;
        if (this.f25617u.length < i) {
            p(i);
        }
        Object[] objArr = this.f25617u;
        int i10 = this.f25619w;
        objArr[i10] = obj;
        this.f25619w = i10 + 1;
    }

    public final void c(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i10 = this.f25619w + size;
        if (this.f25617u.length < i10) {
            p(i10);
        }
        Object[] objArr = this.f25617u;
        int i11 = this.f25619w;
        if (i != i11) {
            System.arraycopy(objArr, i, objArr, i + size, i11 - i);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            objArr[i + i12] = list.get(i12);
        }
        this.f25619w += size;
    }

    public final void d(int i, e eVar) {
        int i10 = eVar.f25619w;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f25619w + i10;
        if (this.f25617u.length < i11) {
            p(i11);
        }
        Object[] objArr = this.f25617u;
        int i12 = this.f25619w;
        if (i != i12) {
            System.arraycopy(objArr, i, objArr, i + i10, i12 - i);
        }
        System.arraycopy(eVar.f25617u, 0, objArr, i, i10);
        this.f25619w += i10;
    }

    public final boolean g(int i, Collection collection) {
        int i10 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i11 = this.f25619w + size;
        if (this.f25617u.length < i11) {
            p(i11);
        }
        Object[] objArr = this.f25617u;
        int i12 = this.f25619w;
        if (i != i12) {
            System.arraycopy(objArr, i, objArr, i + size, i12 - i);
        }
        for (Object obj : collection) {
            int i13 = i10 + 1;
            if (i10 >= 0) {
                objArr[i10 + i] = obj;
                i10 = i13;
            } else {
                m.l();
                throw null;
            }
        }
        this.f25619w += size;
        return true;
    }

    public final List i() {
        b bVar = this.f25618v;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.f25618v = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final void j() {
        Object[] objArr = this.f25617u;
        int i = this.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = null;
        }
        this.f25619w = 0;
    }

    public final boolean k(Object obj) {
        int i = this.f25619w - 1;
        if (i >= 0) {
            for (int i10 = 0; !l.a(this.f25617u[i10], obj); i10++) {
                if (i10 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int l(Object obj) {
        Object[] objArr = this.f25617u;
        int i = this.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            if (l.a(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean m(Object obj) {
        int l10 = l(obj);
        if (l10 >= 0) {
            n(l10);
            return true;
        }
        return false;
    }

    public final Object n(int i) {
        Object[] objArr = this.f25617u;
        Object obj = objArr[i];
        int i10 = this.f25619w;
        if (i != i10 - 1) {
            int i11 = i + 1;
            System.arraycopy(objArr, i11, objArr, i, i10 - i11);
        }
        int i12 = this.f25619w - 1;
        this.f25619w = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void o(int i, int i10) {
        if (i10 > i) {
            int i11 = this.f25619w;
            if (i10 < i11) {
                Object[] objArr = this.f25617u;
                System.arraycopy(objArr, i10, objArr, i, i11 - i10);
            }
            int i12 = this.f25619w;
            int i13 = i12 - (i10 - i);
            int i14 = i12 - 1;
            if (i13 <= i14) {
                int i15 = i13;
                while (true) {
                    this.f25617u[i15] = null;
                    if (i15 == i14) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f25619w = i13;
        }
    }

    public final void p(int i) {
        Object[] objArr = this.f25617u;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f25617u = objArr2;
    }
}

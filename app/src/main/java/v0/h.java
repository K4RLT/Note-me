package v0;

import b1.s;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import qe.k;
import ya.od;

/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: v, reason: collision with root package name */
    public static final h f27281v = new h(new Object[0]);

    /* renamed from: u, reason: collision with root package name */
    public final Object[] f27282u;

    public h(Object[] objArr) {
        this.f27282u = objArr;
    }

    @Override // qe.a
    public final int a() {
        return this.f27282u.length;
    }

    @Override // v0.b
    public final b b(int i, Object obj) {
        Object[] objArr = this.f27282u;
        od.b(i, objArr.length);
        if (i == objArr.length) {
            return g(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            k.g(0, i, 6, objArr, objArr2);
            k.d(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new h(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        k.d(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new d(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // v0.b
    public final b g(Object obj) {
        Object[] objArr = this.f27282u;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new h(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new d(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.f27282u;
        od.a(i, objArr.length);
        return objArr[i];
    }

    @Override // qe.e, java.util.List
    public final int indexOf(Object obj) {
        return k.p(obj, this.f27282u);
    }

    @Override // v0.b
    public final b k(Collection collection) {
        Object[] objArr = this.f27282u;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            int length = objArr.length;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                copyOf[length] = it.next();
                length++;
            }
            return new h(copyOf);
        }
        e n10 = n();
        n10.addAll(collection);
        return n10.g();
    }

    @Override // qe.e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f27282u;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i10 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length2 = i10;
                }
            }
        }
        return -1;
    }

    @Override // qe.e, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f27282u;
        od.b(i, objArr.length);
        return new c(objArr, i, objArr.length);
    }

    @Override // v0.b
    public final e n() {
        return new e(this, null, this.f27282u, 0);
    }

    @Override // v0.b
    public final b o(s sVar) {
        Object[] objArr = this.f27282u;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z3 = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) sVar.invoke(obj)).booleanValue()) {
                if (!z3) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z3 = true;
                    length = i;
                }
            } else if (z3) {
                objArr2[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return f27281v;
        }
        return new h(k.i(objArr2, 0, length));
    }

    @Override // v0.b
    public final b p(int i) {
        Object[] objArr = this.f27282u;
        od.a(i, objArr.length);
        if (objArr.length == 1) {
            return f27281v;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        k.d(i, i + 1, objArr.length, objArr, copyOf);
        return new h(copyOf);
    }

    @Override // v0.b
    public final b q(int i, Object obj) {
        Object[] objArr = this.f27282u;
        od.a(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new h(copyOf);
    }
}

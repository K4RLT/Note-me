package n;
import o.a;
import r.a;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements Collection, Set, ef.b, ef.e {

    /* renamed from: u, reason: collision with root package name */
    public int[] f20865u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f20866v;

    /* renamed from: w, reason: collision with root package name */
    public int f20867w;

    public f(int i) {
        this.f20865u = a.f21371a;
        this.f20866v = a.f21373c;
        if (i > 0) {
            this.f20865u = new int[i];
            this.f20866v = new Object[i];
        }
    }

    public final Object a(int i) {
        int i10 = this.f20867w;
        Object[] objArr = this.f20866v;
        Object obj = objArr[i];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f20865u;
        int i12 = 8;
        if (iArr.length > 8 && i10 < iArr.length / 3) {
            if (i10 > 8) {
                i12 = i10 + (i10 >> 1);
            }
            int[] iArr2 = new int[i12];
            this.f20865u = iArr2;
            this.f20866v = new Object[i12];
            if (i > 0) {
                qe.k.f(0, i, 6, iArr, iArr2);
                qe.k.g(0, i, 6, objArr, this.f20866v);
            }
            if (i < i11) {
                int i13 = i + 1;
                qe.k.c(i, i13, i10, iArr, this.f20865u);
                qe.k.d(i, i13, i10, objArr, this.f20866v);
            }
        } else {
            if (i < i11) {
                int i14 = i + 1;
                qe.k.c(i, i14, i10, iArr, iArr);
                Object[] objArr2 = this.f20866v;
                qe.k.d(i, i14, i10, objArr2, objArr2);
            }
            this.f20866v[i11] = null;
        }
        if (i10 == this.f20867w) {
            this.f20867w = i11;
            return obj;
        }
        l4.a.m();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int a10;
        int i10 = this.f20867w;
        if (obj == null) {
            a10 = a(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            a10 = a(this, obj, hashCode);
        }
        if (a10 >= 0) {
            return false;
        }
        int i11 = ~a10;
        int[] iArr = this.f20865u;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f20866v;
            int[] iArr2 = new int[i12];
            this.f20865u = iArr2;
            this.f20866v = new Object[i12];
            if (i10 == this.f20867w) {
                if (iArr2.length != 0) {
                    qe.k.f(0, iArr.length, 6, iArr, iArr2);
                    qe.k.g(0, objArr.length, 6, objArr, this.f20866v);
                }
            } else {
                l4.a.m();
                return false;
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f20865u;
            int i13 = i11 + 1;
            qe.k.c(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.f20866v;
            qe.k.d(i13, i11, i10, objArr2, objArr2);
        }
        int i14 = this.f20867w;
        if (i10 == i14) {
            int[] iArr4 = this.f20865u;
            if (i11 < iArr4.length) {
                iArr4[i11] = i;
                this.f20866v[i11] = obj;
                this.f20867w = i14 + 1;
                return true;
            }
        }
        l4.a.m();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.f20867w;
        int i = this.f20867w;
        int[] iArr = this.f20865u;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f20866v;
            int[] iArr2 = new int[size];
            this.f20865u = iArr2;
            this.f20866v = new Object[size];
            if (i > 0) {
                qe.k.f(0, i, 6, iArr, iArr2);
                qe.k.g(0, this.f20867w, 6, objArr, this.f20866v);
            }
        }
        if (this.f20867w == i) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z3 |= add(it.next());
            }
            return z3;
        }
        l4.a.m();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f20867w != 0) {
            this.f20865u = a.f21371a;
            this.f20866v = a.f21373c;
            this.f20867w = 0;
        }
        if (this.f20867w == 0) {
            return;
        }
        l4.a.m();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int a10;
        if (obj == null) {
            a10 = a(this, null, 0);
        } else {
            a10 = a(this, obj, obj.hashCode());
        }
        if (a10 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f20867w != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f20867w;
            for (int i10 = 0; i10 < i; i10++) {
                if (!((Set) obj).contains(this.f20866v[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f20865u;
        int i = this.f20867w;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f20867w <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int a10;
        if (obj == null) {
            a10 = a(this, null, 0);
        } else {
            a10 = a(this, obj, obj.hashCode());
        }
        if (a10 < 0) {
            return false;
        }
        a(a10);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z3 = false;
        for (int i = this.f20867w - 1; -1 < i; i--) {
            if (!qe.l.s(collection, this.f20866v[i])) {
                a(i);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f20867w;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.f20867w;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        qe.k.d(0, 0, this.f20867w, this.f20866v, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f20867w * 14);
        sb2.append('{');
        int i = this.f20867w;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f20866v[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return qe.k.i(this.f20866v, 0, this.f20867w);
    }
}

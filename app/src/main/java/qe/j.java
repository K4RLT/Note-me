package qe;
import l.a;
import q.x;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import w7.i1;
import ya.pa;

/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: x, reason: collision with root package name */
    public static final Object[] f24018x = new Object[0];

    /* renamed from: u, reason: collision with root package name */
    public int f24019u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f24020v;

    /* renamed from: w, reason: collision with root package name */
    public int f24021w;

    public j(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f24018x;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            x.n(g3.a.g(i, "Illegal Capacity: "));
            throw null;
        }
        this.f24020v = objArr;
    }

    @Override // qe.f
    public final int a() {
        return this.f24021w;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        int i11 = this.f24021w;
        if (i >= 0 && i <= i11) {
            if (i == i11) {
                addLast(obj);
                return;
            }
            if (i == 0) {
                addFirst(obj);
                return;
            }
            s();
            k(this.f24021w + 1);
            int r8 = r(this.f24019u + i);
            int i12 = this.f24021w;
            if (i < ((i12 + 1) >> 1)) {
                if (r8 == 0) {
                    Object[] objArr = this.f24020v;
                    objArr.getClass();
                    i10 = objArr.length - 1;
                } else {
                    i10 = r8 - 1;
                }
                int i13 = this.f24019u;
                if (i13 == 0) {
                    Object[] objArr2 = this.f24020v;
                    objArr2.getClass();
                    i13 = objArr2.length;
                }
                int i14 = i13 - 1;
                int i15 = this.f24019u;
                Object[] objArr3 = this.f24020v;
                if (i10 >= i15) {
                    objArr3[i14] = objArr3[i15];
                    k.d(i15, i15 + 1, i10 + 1, objArr3, objArr3);
                } else {
                    k.d(i15 - 1, i15, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.f24020v;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    k.d(0, 1, i10 + 1, objArr4, objArr4);
                }
                this.f24020v[i10] = obj;
                this.f24019u = i14;
            } else {
                int r10 = r(i12 + this.f24019u);
                Object[] objArr5 = this.f24020v;
                if (r8 < r10) {
                    k.d(r8 + 1, r8, r10, objArr5, objArr5);
                } else {
                    k.d(1, 0, r10, objArr5, objArr5);
                    Object[] objArr6 = this.f24020v;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    k.d(r8 + 1, r8, objArr6.length - 1, objArr6, objArr6);
                }
                this.f24020v[r8] = obj;
            }
            this.f24021w++;
            return;
        }
        x.l(i1.c("index: ", i, i11, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i10 = this.f24021w;
        if (i >= 0 && i <= i10) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i == this.f24021w) {
                return addAll(collection);
            }
            s();
            k(collection.size() + this.f24021w);
            int r8 = r(this.f24021w + this.f24019u);
            int r10 = r(this.f24019u + i);
            int size = collection.size();
            if (i < ((this.f24021w + 1) >> 1)) {
                int i11 = this.f24019u;
                int i12 = i11 - size;
                Object[] objArr = this.f24020v;
                if (r10 >= i11) {
                    if (i12 >= 0) {
                        k.d(i12, i11, r10, objArr, objArr);
                    } else {
                        i12 += objArr.length;
                        int i13 = r10 - i11;
                        int length = objArr.length - i12;
                        if (length >= i13) {
                            k.d(i12, i11, r10, objArr, objArr);
                        } else {
                            k.d(i12, i11, i11 + length, objArr, objArr);
                            Object[] objArr2 = this.f24020v;
                            k.d(0, this.f24019u + length, r10, objArr2, objArr2);
                        }
                    }
                } else {
                    k.d(i12, i11, objArr.length, objArr, objArr);
                    Object[] objArr3 = this.f24020v;
                    if (size >= r10) {
                        k.d(objArr3.length - size, 0, r10, objArr3, objArr3);
                    } else {
                        k.d(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f24020v;
                        k.d(0, size, r10, objArr4, objArr4);
                    }
                }
                this.f24019u = i12;
                g(p(r10 - size), collection);
                return true;
            }
            int i14 = r10 + size;
            Object[] objArr5 = this.f24020v;
            if (r10 < r8) {
                int i15 = size + r8;
                if (i15 <= objArr5.length) {
                    k.d(i14, r10, r8, objArr5, objArr5);
                } else if (i14 >= objArr5.length) {
                    k.d(i14 - objArr5.length, r10, r8, objArr5, objArr5);
                } else {
                    int length2 = r8 - (i15 - objArr5.length);
                    k.d(0, length2, r8, objArr5, objArr5);
                    Object[] objArr6 = this.f24020v;
                    k.d(i14, r10, length2, objArr6, objArr6);
                }
            } else {
                k.d(size, 0, r8, objArr5, objArr5);
                Object[] objArr7 = this.f24020v;
                if (i14 >= objArr7.length) {
                    k.d(i14 - objArr7.length, r10, objArr7.length, objArr7, objArr7);
                } else {
                    k.d(0, objArr7.length - size, objArr7.length, objArr7, objArr7);
                    Object[] objArr8 = this.f24020v;
                    k.d(i14, r10, objArr8.length - size, objArr8, objArr8);
                }
            }
            g(r10, collection);
            return true;
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
        return false;
    }

    public final void addFirst(Object obj) {
        s();
        k(this.f24021w + 1);
        int i = this.f24019u;
        if (i == 0) {
            Object[] objArr = this.f24020v;
            objArr.getClass();
            i = objArr.length;
        }
        int i10 = i - 1;
        this.f24019u = i10;
        this.f24020v[i10] = obj;
        this.f24021w++;
    }

    public final void addLast(Object obj) {
        s();
        k(a() + 1);
        this.f24020v[r(a() + this.f24019u)] = obj;
        this.f24021w = a() + 1;
    }

    @Override // qe.f
    public final Object b(int i) {
        int i10 = this.f24021w;
        if (i >= 0 && i < i10) {
            if (i == a() - 1) {
                return removeLast();
            }
            if (i == 0) {
                return removeFirst();
            }
            s();
            int r8 = r(this.f24019u + i);
            Object[] objArr = this.f24020v;
            Object obj = objArr[r8];
            int i11 = this.f24021w >> 1;
            int i12 = this.f24019u;
            if (i < i11) {
                if (r8 >= i12) {
                    k.d(i12 + 1, i12, r8, objArr, objArr);
                } else {
                    k.d(1, 0, r8, objArr, objArr);
                    Object[] objArr2 = this.f24020v;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i13 = this.f24019u;
                    k.d(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f24020v;
                int i14 = this.f24019u;
                objArr3[i14] = null;
                this.f24019u = n(i14);
            } else {
                int r10 = r((a() - 1) + i12);
                Object[] objArr4 = this.f24020v;
                if (r8 <= r10) {
                    k.d(r8, r8 + 1, r10 + 1, objArr4, objArr4);
                } else {
                    k.d(r8, r8 + 1, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f24020v;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    k.d(0, 1, r10 + 1, objArr5, objArr5);
                }
                this.f24020v[r10] = null;
            }
            this.f24021w--;
            return obj;
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            s();
            q(this.f24019u, r(a() + this.f24019u));
        }
        this.f24019u = 0;
        this.f24021w = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f24020v[this.f24019u];
        }
        l4.a.h("ArrayDeque is empty.");
        return null;
    }

    public final void g(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f24020v.length;
        while (i < length && it.hasNext()) {
            this.f24020v[i] = it.next();
            i++;
        }
        int i10 = this.f24019u;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f24020v[i11] = it.next();
        }
        this.f24021w = collection.size() + this.f24021w;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int a10 = a();
        if (i >= 0 && i < a10) {
            return this.f24020v[r(this.f24019u + i)];
        }
        x.l(i1.c("index: ", i, a10, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int r8 = r(a() + this.f24019u);
        int i10 = this.f24019u;
        if (i10 < r8) {
            while (i10 < r8) {
                if (kotlin.jvm.internal.a(obj, this.f24020v[i10])) {
                    i = this.f24019u;
                } else {
                    i10++;
                }
            }
            return -1;
        }
        if (!isEmpty() && (i10 = this.f24019u) >= r8) {
            int length = this.f24020v.length;
            while (true) {
                if (i10 < length) {
                    if (kotlin.jvm.internal.a(obj, this.f24020v[i10])) {
                        i = this.f24019u;
                        break;
                    }
                    i10++;
                } else {
                    for (int i11 = 0; i11 < r8; i11++) {
                        if (kotlin.jvm.internal.a(obj, this.f24020v[i11])) {
                            i10 = i11 + this.f24020v.length;
                            i = this.f24019u;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i10 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    public final void k(int i) {
        if (i >= 0) {
            Object[] objArr = this.f24020v;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == f24018x) {
                if (i < 10) {
                    i = 10;
                }
                this.f24020v = new Object[i];
                return;
            }
            int length = objArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i < 0) {
                i10 = i;
            }
            if (i10 - 2147483639 > 0) {
                if (i > 2147483639) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i10];
            k.d(0, this.f24019u, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.f24020v;
            int length2 = objArr3.length;
            int i11 = this.f24019u;
            k.d(length2 - i11, 0, i11, objArr3, objArr2);
            this.f24019u = 0;
            this.f24020v = objArr2;
            return;
        }
        x.o("Deque is too big.");
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f24020v[r((size() - 1) + this.f24019u)];
        }
        l4.a.h("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int r8 = r(this.f24021w + this.f24019u);
        int i10 = this.f24019u;
        if (i10 < r8) {
            length = r8 - 1;
            if (i10 <= length) {
                while (!kotlin.jvm.internal.a(obj, this.f24020v[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i = this.f24019u;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f24019u >= r8) {
            while (true) {
                r8--;
                Object[] objArr = this.f24020v;
                if (-1 < r8) {
                    if (kotlin.jvm.internal.a(obj, objArr[r8])) {
                        length = r8 + this.f24020v.length;
                        i = this.f24019u;
                        break;
                    }
                } else {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i11 = this.f24019u;
                    if (i11 <= length) {
                        while (!kotlin.jvm.internal.a(obj, this.f24020v[length])) {
                            if (length != i11) {
                                length--;
                            }
                        }
                        i = this.f24019u;
                    }
                }
            }
            return length - i;
        }
        return -1;
    }

    public final int n(int i) {
        this.f24020v.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object o() {
        if (isEmpty()) {
            return null;
        }
        return this.f24020v[r((size() - 1) + this.f24019u)];
    }

    public final int p(int i) {
        if (i < 0) {
            return i + this.f24020v.length;
        }
        return i;
    }

    public final void q(int i, int i10) {
        Object[] objArr = this.f24020v;
        if (i < i10) {
            k.j(i, i10, null, objArr);
        } else {
            k.j(i, objArr.length, null, objArr);
            k.j(0, i10, null, this.f24020v);
        }
    }

    public final int r(int i) {
        Object[] objArr = this.f24020v;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int r8;
        Object[] objArr;
        collection.getClass();
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f24020v.length != 0) {
            int r10 = r(a() + this.f24019u);
            int i = this.f24019u;
            if (i < r10) {
                r8 = i;
                while (true) {
                    objArr = this.f24020v;
                    if (i >= r10) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (!collection.contains(obj)) {
                        this.f24020v[r8] = obj;
                        r8++;
                    } else {
                        z3 = true;
                    }
                    i++;
                }
                k.j(r8, r10, null, objArr);
            } else {
                int length = this.f24020v.length;
                boolean z9 = false;
                int i10 = i;
                while (i < length) {
                    Object[] objArr2 = this.f24020v;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (!collection.contains(obj2)) {
                        this.f24020v[i10] = obj2;
                        i10++;
                    } else {
                        z9 = true;
                    }
                    i++;
                }
                r8 = r(i10);
                for (int i11 = 0; i11 < r10; i11++) {
                    Object[] objArr3 = this.f24020v;
                    Object obj3 = objArr3[i11];
                    objArr3[i11] = null;
                    if (!collection.contains(obj3)) {
                        this.f24020v[r8] = obj3;
                        r8 = n(r8);
                    } else {
                        z9 = true;
                    }
                }
                z3 = z9;
            }
            if (z3) {
                s();
                this.f24021w = p(r8 - this.f24019u);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            s();
            Object[] objArr = this.f24020v;
            int i = this.f24019u;
            Object obj = objArr[i];
            objArr[i] = null;
            this.f24019u = n(i);
            this.f24021w = a() - 1;
            return obj;
        }
        l4.a.h("ArrayDeque is empty.");
        return null;
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            s();
            int r8 = r((size() - 1) + this.f24019u);
            Object[] objArr = this.f24020v;
            Object obj = objArr[r8];
            objArr[r8] = null;
            this.f24021w = a() - 1;
            return obj;
        }
        l4.a.h("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        pa.a(i, i10, this.f24021w);
        int i11 = i10 - i;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f24021w) {
            clear();
            return;
        }
        if (i11 == 1) {
            b(i);
            return;
        }
        s();
        int i12 = this.f24021w - i10;
        int i13 = this.f24019u;
        if (i < i12) {
            int r8 = r((i - 1) + i13);
            int r10 = r(this.f24019u + (i10 - 1));
            while (i > 0) {
                int i14 = r8 + 1;
                int min = Math.min(i, Math.min(i14, r10 + 1));
                Object[] objArr = this.f24020v;
                int i15 = r10 - min;
                int i16 = r8 - min;
                k.d(i15 + 1, i16 + 1, i14, objArr, objArr);
                r8 = p(i16);
                r10 = p(i15);
                i -= min;
            }
            int r11 = r(this.f24019u + i11);
            q(this.f24019u, r11);
            this.f24019u = r11;
        } else {
            int r12 = r(i13 + i10);
            int r13 = r(this.f24019u + i);
            int i17 = this.f24021w;
            while (true) {
                i17 -= i10;
                if (i17 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f24020v;
                i10 = Math.min(i17, Math.min(objArr2.length - r12, objArr2.length - r13));
                Object[] objArr3 = this.f24020v;
                int i18 = r12 + i10;
                k.d(r13, r12, i18, objArr3, objArr3);
                r12 = r(i18);
                r13 = r(r13 + i10);
            }
            int r14 = r(this.f24021w + this.f24019u);
            q(p(r14 - i11), r14);
        }
        this.f24021w -= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int r8;
        Object[] objArr;
        collection.getClass();
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f24020v.length != 0) {
            int r10 = r(a() + this.f24019u);
            int i = this.f24019u;
            if (i < r10) {
                r8 = i;
                while (true) {
                    objArr = this.f24020v;
                    if (i >= r10) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f24020v[r8] = obj;
                        r8++;
                    } else {
                        z3 = true;
                    }
                    i++;
                }
                k.j(r8, r10, null, objArr);
            } else {
                int length = this.f24020v.length;
                boolean z9 = false;
                int i10 = i;
                while (i < length) {
                    Object[] objArr2 = this.f24020v;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f24020v[i10] = obj2;
                        i10++;
                    } else {
                        z9 = true;
                    }
                    i++;
                }
                r8 = r(i10);
                for (int i11 = 0; i11 < r10; i11++) {
                    Object[] objArr3 = this.f24020v;
                    Object obj3 = objArr3[i11];
                    objArr3[i11] = null;
                    if (collection.contains(obj3)) {
                        this.f24020v[r8] = obj3;
                        r8 = n(r8);
                    } else {
                        z9 = true;
                    }
                }
                z3 = z9;
            }
            if (z3) {
                s();
                this.f24021w = p(r8 - this.f24019u);
            }
        }
        return z3;
    }

    public final void s() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int a10 = a();
        if (i >= 0 && i < a10) {
            int r8 = r(this.f24019u + i);
            Object[] objArr = this.f24020v;
            Object obj2 = objArr[r8];
            objArr[r8] = obj;
            return obj2;
        }
        x.l(i1.c("index: ", i, a10, ", size: "));
        return null;
    }

    public final Object t() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f24021w;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int r8 = r(this.f24021w + this.f24019u);
        int i10 = this.f24019u;
        if (i10 < r8) {
            k.g(i10, r8, 2, this.f24020v, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f24020v;
            k.d(0, this.f24019u, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f24020v;
            k.d(objArr3.length - this.f24019u, 0, r8, objArr3, objArr);
        }
        int i11 = this.f24021w;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    public j() {
        this.f24020v = f24018x;
    }

    public j(List list) {
        list.getClass();
        Object[] array = list.toArray(new Object[0]);
        this.f24020v = array;
        this.f24021w = array.length;
        if (array.length == 0) {
            this.f24020v = f24018x;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        s();
        k(collection.size() + a());
        g(r(a() + this.f24019u), collection);
        return true;
    }
}

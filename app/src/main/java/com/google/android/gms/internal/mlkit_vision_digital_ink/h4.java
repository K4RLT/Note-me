package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class h4 extends c4 implements List, RandomAccess {

    /* renamed from: v, reason: collision with root package name */
    public static final e4 f14393v = new e4(z4.f15325y, 0);

    public static z4 r(Object[] objArr, int i) {
        if (i == 0) {
            return z4.f15325y;
        }
        return new z4(objArr, i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.b4, com.google.android.gms.internal.mlkit_vision_digital_ink.d4] */
    public static h4 s(Iterable iterable) {
        if (iterable instanceof Collection) {
            return t((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return z4.f15325y;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return u(next);
        }
        ?? b4Var = new b4(4);
        b4Var.a(next);
        while (it.hasNext()) {
            b4Var.a(it.next());
        }
        return b4Var.d();
    }

    public static h4 t(Collection collection) {
        if (collection instanceof c4) {
            h4 g8 = ((c4) collection).g();
            if (g8.n()) {
                Object[] array = g8.toArray(c4.f14147u);
                return r(array, array.length);
            }
            return g8;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        n5.g(array2, length);
        return r(array2, length);
    }

    public static z4 u(Object obj) {
        Object[] objArr = {obj};
        n5.g(objArr, 1);
        return r(objArr, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i + i10] = get(i10);
        }
        return i + size;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i = 0; i < size; i++) {
                            if (Objects.equals(get(i), list.get(i))) {
                            }
                        }
                        return true;
                    }
                    e4 listIterator = listIterator(0);
                    Iterator it = list.iterator();
                    while (true) {
                        if (listIterator.hasNext()) {
                            if (!it.hasNext() || !Objects.equals(listIterator.next(), it.next())) {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final h4 g() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i = (i * 31) + get(i10).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final k5 k() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public h4 p() {
        if (size() <= 1) {
            return this;
        }
        return new f4(this);
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public h4 subList(int i, int i10) {
        pa.r(i, i10, size());
        int i11 = i10 - i;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return z4.f15325y;
        }
        return new g4(this, i, i11);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final e4 listIterator(int i) {
        pa.l(i, size());
        if (isEmpty()) {
            return f14393v;
        }
        return new e4(this, i);
    }
}

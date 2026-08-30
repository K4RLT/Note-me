package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class d51 extends z41 implements List, RandomAccess {

    /* renamed from: v, reason: collision with root package name */
    public static final b51 f5314v = new b51(y51.f12781y, 0);

    public static y51 q(Object obj) {
        Object[] objArr = {obj};
        ct.h(objArr, 1);
        return w(objArr, 1);
    }

    public static y51 r(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ct.h(objArr, 2);
        return w(objArr, 2);
    }

    public static y51 s(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        ct.h(objArr, 5);
        return w(objArr, 5);
    }

    public static y51 t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        ct.h(objArr2, i);
        return w(objArr2, i);
    }

    public static d51 u(Collection collection) {
        if (collection instanceof z41) {
            d51 k3 = ((z41) collection).k();
            if (k3.n()) {
                Object[] array = k3.toArray(z41.f13076u);
                return w(array, array.length);
            }
            return k3;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        ct.h(array2, length);
        return w(array2, length);
    }

    public static y51 v(Object[] objArr) {
        if (objArr.length == 0) {
            return y51.f12781y;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        ct.h(objArr2, length);
        return w(objArr2, length);
    }

    public static y51 w(Object[] objArr, int i) {
        if (i == 0) {
            return y51.f12781y;
        }
        return new y51(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final m61 a() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.z41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
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
                    b51 listIterator = listIterator(0);
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

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i = (i * 31) + get(i10).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
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

    @Override // com.google.android.gms.internal.ads.z41
    public final d51 k() {
        return this;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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

    @Override // com.google.android.gms.internal.ads.z41
    public int o(Object[] objArr, int i) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i + i10] = get(i10);
        }
        return i + size;
    }

    @Override // java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public d51 subList(int i, int i10) {
        b80.P(i, i10, size());
        int i11 = i10 - i;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return y51.f12781y;
        }
        return new c51(this, i, i11);
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
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final b51 listIterator(int i) {
        b80.O(i, size());
        if (isEmpty()) {
            return f5314v;
        }
        return new b51(this, i);
    }
}

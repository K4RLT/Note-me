package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements Collection {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f20854u;

    public d(e eVar) {
        this.f20854u = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f20854u.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f20854u.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f20854u.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f20854u, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f20854u;
        int a10 = eVar.a(obj);
        if (a10 >= 0) {
            eVar.h(a10);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f20854u;
        int i = eVar.f20934w;
        int i10 = 0;
        boolean z3 = false;
        while (i10 < i) {
            if (collection.contains(eVar.j(i10))) {
                eVar.h(i10);
                i10--;
                i--;
                z3 = true;
            }
            i10++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f20854u;
        int i = eVar.f20934w;
        int i10 = 0;
        boolean z3 = false;
        while (i10 < i) {
            if (!collection.contains(eVar.j(i10))) {
                eVar.h(i10);
                i10--;
                i--;
                z3 = true;
            }
            i10++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f20854u.f20934w;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f20854u;
        int i = eVar.f20934w;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = eVar.j(i10);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f20854u;
        int i = eVar.f20934w;
        Object[] objArr = new Object[i];
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = eVar.j(i10);
        }
        return objArr;
    }
}

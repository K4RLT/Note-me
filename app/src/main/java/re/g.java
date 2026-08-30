package re;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import w0.l;
import w0.m;

/* loaded from: classes.dex */
public final class g extends AbstractCollection implements Collection, ef.b {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24765u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f24766v;

    public /* synthetic */ g(int i, Object obj) {
        this.f24765u = i;
        this.f24766v = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f24765u) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f24765u) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f24765u) {
            case 0:
                ((e) this.f24766v).clear();
                return;
            default:
                ((w0.d) this.f24766v).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f24765u) {
            case 0:
                return ((e) this.f24766v).containsValue(obj);
            default:
                return ((w0.d) this.f24766v).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f24765u) {
            case 0:
                return ((e) this.f24766v).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f24765u) {
            case 0:
                e eVar = (e) this.f24766v;
                eVar.getClass();
                return new c(eVar, 2);
            default:
                w0.d dVar = (w0.d) this.f24766v;
                l[] lVarArr = new l[8];
                for (int i = 0; i < 8; i++) {
                    lVarArr[i] = new m(2);
                }
                return new w0.e(dVar, lVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f24765u) {
            case 0:
                e eVar = (e) this.f24766v;
                eVar.c();
                int i = eVar.i(obj);
                if (i < 0) {
                    return false;
                }
                eVar.l(i);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f24765u) {
            case 0:
                collection.getClass();
                ((e) this.f24766v).c();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f24765u) {
            case 0:
                collection.getClass();
                ((e) this.f24766v).c();
                return super.retainAll(collection);
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f24765u) {
            case 0:
                return ((e) this.f24766v).C;
            default:
                return ((w0.d) this.f24766v).f27670z;
        }
    }
}

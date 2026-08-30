package re;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class f extends qe.g {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24763u;

    /* renamed from: v, reason: collision with root package name */
    public final e f24764v;

    public /* synthetic */ f(e eVar, int i) {
        this.f24763u = i;
        this.f24764v = eVar;
    }

    @Override // qe.g
    public final int a() {
        switch (this.f24763u) {
            case 0:
                return this.f24764v.C;
            default:
                return this.f24764v.C;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f24763u) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.f24763u;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f24763u) {
            case 0:
                this.f24764v.clear();
                return;
            default:
                this.f24764v.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f24763u) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                e eVar = this.f24764v;
                eVar.getClass();
                int h3 = eVar.h(entry.getKey());
                if (h3 < 0) {
                    return false;
                }
                Object[] objArr = eVar.f24758v;
                objArr.getClass();
                return l.a(objArr[h3], entry.getValue());
            default:
                return this.f24764v.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f24763u) {
            case 0:
                collection.getClass();
                return this.f24764v.f(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f24763u) {
            case 0:
                return this.f24764v.isEmpty();
            default:
                return this.f24764v.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f24763u) {
            case 0:
                e eVar = this.f24764v;
                eVar.getClass();
                return new c(eVar, 0);
            default:
                e eVar2 = this.f24764v;
                eVar2.getClass();
                return new c(eVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f24763u) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                e eVar = this.f24764v;
                eVar.getClass();
                eVar.c();
                int h3 = eVar.h(entry.getKey());
                if (h3 < 0) {
                    return false;
                }
                Object[] objArr = eVar.f24758v;
                objArr.getClass();
                if (!l.a(objArr[h3], entry.getValue())) {
                    return false;
                }
                eVar.l(h3);
                return true;
            default:
                e eVar2 = this.f24764v;
                eVar2.c();
                int h10 = eVar2.h(obj);
                if (h10 < 0) {
                    return false;
                }
                eVar2.l(h10);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.f24763u;
        collection.getClass();
        switch (i) {
            case 0:
                this.f24764v.c();
                return super.removeAll(collection);
            default:
                this.f24764v.c();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.f24763u;
        collection.getClass();
        switch (i) {
            case 0:
                this.f24764v.c();
                return super.retainAll(collection);
            default:
                this.f24764v.c();
                return super.retainAll(collection);
        }
    }
}

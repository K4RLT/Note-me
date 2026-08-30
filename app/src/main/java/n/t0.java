package n;
import g.a;
import k.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class t0 implements Collection, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20945u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final Object f20946v;

    public t0() {
        int i = o0.f20921a;
        this.f20946v = new f0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f20945u) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.f20946v).a(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f20945u) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f20945u) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((f0) this.f20946v).b();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f20945u) {
            case 0:
                return ((i0) this.f20946v).d(obj);
            default:
                return ((f0) this.f20946v).c(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f20945u) {
            case 0:
                collection.getClass();
                Collection collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!((i0) this.f20946v).d(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((f0) this.f20946v).c(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f20945u) {
            case 0:
                return ((i0) this.f20946v).i();
            default:
                if (((f0) this.f20946v).f20873g == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f20945u) {
            case 0:
                return lf.a(new g(this, null, 2));
            default:
                f0 f0Var = (f0) this.f20946v;
                f0Var.getClass();
                return new lf.c(new h0(f0Var));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f20945u) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.f20946v).g(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f20945u) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.f20946v).g(collection);
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f20945u) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f20945u) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.f20946v).i(collection);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f20945u) {
            case 0:
                return ((i0) this.f20946v).e;
            default:
                return ((f0) this.f20946v).f20873g;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f20945u) {
            case 0:
                objArr.getClass();
                return kotlin.jvm.internal.b(this, objArr);
            default:
                return kotlin.jvm.internal.b(this, objArr);
        }
    }

    public t0(i0 i0Var) {
        i0Var.getClass();
        this.f20946v = i0Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f20945u) {
            case 0:
                return kotlin.jvm.internal.a(this);
            default:
                return kotlin.jvm.internal.a(this);
        }
    }
}

package xa;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class g extends w implements ListIterator {

    /* renamed from: u, reason: collision with root package name */
    public final int f30416u;

    /* renamed from: v, reason: collision with root package name */
    public int f30417v;

    /* renamed from: w, reason: collision with root package name */
    public final i f30418w;

    public g(i iVar, int i) {
        int size = iVar.size();
        u0.q(i, size);
        this.f30416u = size;
        this.f30417v = i;
        this.f30418w = iVar;
    }

    public final Object a(int i) {
        return this.f30418w.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f30417v < this.f30416u) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f30417v > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f30417v;
            this.f30417v = i + 1;
            return a(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f30417v;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f30417v - 1;
            this.f30417v = i;
            return a(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f30417v - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

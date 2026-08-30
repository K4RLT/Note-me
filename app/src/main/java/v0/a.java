package v0;

import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public int f27261u;

    /* renamed from: v, reason: collision with root package name */
    public int f27262v;

    public a(int i, int i10) {
        this.f27261u = i;
        this.f27262v = i10;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f27261u < this.f27262v) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f27261u > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27261u;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27261u - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

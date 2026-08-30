package qe;
import x.n;
import q.x;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class b implements Iterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public int f24004u;

    /* renamed from: v, reason: collision with root package name */
    public Object f24005v;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f24004u;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            x.n("hasNext called when the iterator is in the FAILED state.");
            return false;
        }
        this.f24004u = 3;
        a();
        if (this.f24004u != 1) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f24004u;
        if (i == 1) {
            this.f24004u = 0;
            return this.f24005v;
        }
        if (i != 2) {
            this.f24004u = 3;
            a();
            if (this.f24004u == 1) {
                this.f24004u = 0;
                return this.f24005v;
            }
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

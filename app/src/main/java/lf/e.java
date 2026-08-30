package lf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import pe.z;

/* loaded from: classes.dex */
public final class e implements Iterator, te.c, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public int f20360u;

    /* renamed from: v, reason: collision with root package name */
    public Object f20361v;

    /* renamed from: w, reason: collision with root package name */
    public te.c f20362w;

    public final RuntimeException a() {
        int i = this.f20360u;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f20360u);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void b(Object obj, te.c cVar) {
        this.f20361v = obj;
        this.f20360u = 3;
        this.f20362w = cVar;
        cVar.getClass();
    }

    @Override // te.c
    public final te.g getContext() {
        return te.h.f25707u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.f20360u;
            if (i != 0) {
                break;
            }
            this.f20360u = 5;
            te.c cVar = this.f20362w;
            cVar.getClass();
            this.f20362w = null;
            cVar.resumeWith(z.f22715a);
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                return true;
            }
            if (i == 4) {
                return false;
            }
            throw a();
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f20360u;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f20360u = 0;
                    Object obj = this.f20361v;
                    this.f20361v = null;
                    return obj;
                }
                throw a();
            }
            this.f20360u = 1;
            throw null;
        }
        if (hasNext()) {
            return next();
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // te.c
    public final void resumeWith(Object obj) {
        pe.a.e(obj);
        this.f20360u = 4;
    }
}

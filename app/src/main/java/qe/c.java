package qe;
import x.l;
import q.x;

import java.util.ListIterator;
import w7.i1;

/* loaded from: classes.dex */
public final class c extends cg.f implements ListIterator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f24006x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i) {
        super(7, eVar);
        this.f24006x = eVar;
        int a10 = eVar.a();
        if (i >= 0 && i <= a10) {
            this.f4128v = i;
        } else {
            x.l(i1.c("index: ", i, a10, ", size: "));
            throw null;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f4128v > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4128v;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f4128v - 1;
            this.f4128v = i;
            return this.f24006x.get(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4128v - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

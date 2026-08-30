package wa;
import x.l;
import l4.a;
import q.x;

import java.util.ListIterator;
import ya.hd;

/* loaded from: classes.dex */
public final class oa extends com.google.android.gms.internal.play_billing.b0 implements ListIterator {

    /* renamed from: v, reason: collision with root package name */
    public final int f29777v;

    /* renamed from: w, reason: collision with root package name */
    public int f29778w;

    /* renamed from: x, reason: collision with root package name */
    public final qa f29779x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(qa qaVar, int i) {
        super(3);
        int size = qaVar.size();
        if (i >= 0 && i <= size) {
            this.f29777v = size;
            this.f29778w = i;
            this.f29779x = qaVar;
            return;
        }
        x.l(hd.c("index", i, size));
        throw null;
    }

    public final Object a(int i) {
        return this.f29779x.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f29778w < this.f29777v) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f29778w > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f29778w;
            this.f29778w = i + 1;
            return a(i);
        }
        a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29778w;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f29778w - 1;
            this.f29778w = i;
            return a(i);
        }
        a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29778w - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

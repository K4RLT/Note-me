package ua;

import com.google.android.gms.internal.play_billing.b0;
import java.util.ListIterator;
import q.x;
import ya.pc;

/* loaded from: classes.dex */
public final class b extends b0 implements ListIterator {

    /* renamed from: v, reason: collision with root package name */
    public final int f27134v;

    /* renamed from: w, reason: collision with root package name */
    public int f27135w;

    /* renamed from: x, reason: collision with root package name */
    public final e f27136x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, int i) {
        super(1);
        int size = eVar.size();
        if (i >= 0 && i <= size) {
            this.f27134v = size;
            this.f27135w = i;
            this.f27136x = eVar;
            return;
        }
        x.l(pc.c("index", i, size));
        throw null;
    }

    public final Object a(int i) {
        return this.f27136x.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f27135w < this.f27134v) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f27135w > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f27135w;
            this.f27135w = i + 1;
            return a(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27135w;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f27135w - 1;
            this.f27135w = i;
            return a(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27135w - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

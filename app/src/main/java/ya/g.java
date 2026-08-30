package ya;
import l4.a;
import q.x;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class g extends com.google.android.gms.internal.play_billing.b0 implements ListIterator {

    /* renamed from: v, reason: collision with root package name */
    public final int f31297v;

    /* renamed from: w, reason: collision with root package name */
    public int f31298w;

    /* renamed from: x, reason: collision with root package name */
    public final i f31299x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, int i) {
        super(4);
        int size = iVar.size();
        if (i >= 0 && i <= size) {
            this.f31297v = size;
            this.f31298w = i;
            this.f31299x = iVar;
            return;
        }
        x.l(oe.c("index", i, size));
        throw null;
    }

    public final Object a(int i) {
        return this.f31299x.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f31298w < this.f31297v) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f31298w > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f31298w;
            this.f31298w = i + 1;
            return a(i);
        }
        a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f31298w;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f31298w - 1;
            this.f31298w = i;
            return a(i);
        }
        a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f31298w - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

package va;

import com.google.android.gms.internal.play_billing.b0;
import java.util.ListIterator;
import ya.xc;

/* loaded from: classes.dex */
public final class b extends b0 implements ListIterator {

    /* renamed from: v, reason: collision with root package name */
    public final int f27471v;

    /* renamed from: w, reason: collision with root package name */
    public int f27472w;

    /* renamed from: x, reason: collision with root package name */
    public final d f27473x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i) {
        super(2);
        int size = dVar.size();
        xc.b(i, size);
        this.f27471v = size;
        this.f27472w = i;
        this.f27473x = dVar;
    }

    public final Object a(int i) {
        return this.f27473x.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f27472w < this.f27471v) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f27472w > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f27472w;
            this.f27472w = i + 1;
            return a(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27472w;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f27472w - 1;
            this.f27472w = i;
            return a(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27472w - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

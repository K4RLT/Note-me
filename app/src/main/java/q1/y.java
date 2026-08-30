package q1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class y implements Iterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f23319u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Iterator f23320v;

    public y(w0.d dVar) {
        w0.l[] lVarArr = new w0.l[8];
        for (int i = 0; i < 8; i++) {
            lVarArr[i] = new w0.n(this);
        }
        this.f23320v = new w0.e(dVar, lVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f23319u) {
            case 0:
                return this.f23320v.hasNext();
            default:
                return ((w0.e) this.f23320v).f27664w;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f23319u) {
            case 0:
                return (b0) this.f23320v.next();
            default:
                return (Map.Entry) ((w0.e) this.f23320v).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f23319u) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((w0.e) this.f23320v).remove();
                return;
        }
    }

    public y(z zVar) {
        this.f23320v = zVar.f23322v.iterator();
    }
}

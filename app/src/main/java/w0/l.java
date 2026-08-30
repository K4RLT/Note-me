package w0;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class l implements Iterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public Object[] f27683u = k.e.f27682d;

    /* renamed from: v, reason: collision with root package name */
    public int f27684v;

    /* renamed from: w, reason: collision with root package name */
    public int f27685w;

    public final void a(Object[] objArr, int i, int i10) {
        this.f27683u = objArr;
        this.f27684v = i;
        this.f27685w = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f27685w < this.f27684v) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

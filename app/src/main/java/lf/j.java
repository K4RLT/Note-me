package lf;

import df.l;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements Iterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f20368u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ af.j f20369v;

    public j(af.j jVar) {
        this.f20369v = jVar;
        this.f20368u = ((d) jVar.f377b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20368u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((l) this.f20369v.f378c).invoke(this.f20368u.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

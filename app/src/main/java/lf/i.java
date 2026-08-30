package lf;

import df.l;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements Iterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f20364u;

    /* renamed from: v, reason: collision with root package name */
    public int f20365v = -1;

    /* renamed from: w, reason: collision with root package name */
    public Object f20366w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ af.j f20367x;

    public i(af.j jVar) {
        this.f20367x = jVar;
        this.f20364u = new j((af.j) jVar.f377b);
    }

    public final void a() {
        Iterator it = this.f20364u;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((l) this.f20367x.f378c).invoke(next)).booleanValue()) {
                this.f20365v = 1;
                this.f20366w = next;
                return;
            }
        }
        this.f20365v = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f20365v == -1) {
            a();
        }
        if (this.f20365v == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f20365v == -1) {
            a();
        }
        if (this.f20365v != 0) {
            Object obj = this.f20366w;
            this.f20366w = null;
            this.f20365v = -1;
            return obj;
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

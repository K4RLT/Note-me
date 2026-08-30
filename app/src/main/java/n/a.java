package n;
import q.x;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements Iterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public int f20830u;

    /* renamed from: v, reason: collision with root package name */
    public int f20831v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20832w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f20833x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f20834y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i) {
        this(eVar.f20934w);
        this.f20833x = i;
        switch (i) {
            case 1:
                this.f20834y = eVar;
                this(eVar.f20934w);
                return;
            default:
                this.f20834y = eVar;
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f20831v < this.f20830u) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object g8;
        if (hasNext()) {
            int i = this.f20831v;
            switch (this.f20833x) {
                case 0:
                    g8 = ((e) this.f20834y).g(i);
                    break;
                case 1:
                    g8 = ((e) this.f20834y).j(i);
                    break;
                default:
                    g8 = ((f) this.f20834y).f20866v[i];
                    break;
            }
            this.f20831v++;
            this.f20832w = true;
            return g8;
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f20832w) {
            int i = this.f20831v - 1;
            this.f20831v = i;
            switch (this.f20833x) {
                case 0:
                    ((e) this.f20834y).h(i);
                    break;
                case 1:
                    ((e) this.f20834y).h(i);
                    break;
                default:
                    ((f) this.f20834y).a(i);
                    break;
            }
            this.f20830u--;
            this.f20832w = false;
            return;
        }
        x.o("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f20867w);
        this.f20833x = 2;
        this.f20834y = fVar;
    }

    public a(int i) {
        this.f20830u = i;
    }
}

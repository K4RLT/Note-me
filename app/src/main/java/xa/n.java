package xa;

/* loaded from: classes.dex */
public final class n extends w {

    /* renamed from: u, reason: collision with root package name */
    public final Object f30473u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30474v;

    public n(Object obj) {
        this.f30473u = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f30474v) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f30474v) {
            this.f30474v = true;
            return this.f30473u;
        }
        l4.a.c();
        return null;
    }
}

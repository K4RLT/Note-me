package eb;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class s implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16363u = 0;

    /* renamed from: v, reason: collision with root package name */
    public Iterator f16364v;

    public s(Iterator it) {
        it.getClass();
        this.f16364v = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f16363u) {
            case 0:
                return this.f16364v.hasNext();
            default:
                return this.f16364v.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f16363u) {
            case 0:
                return (String) this.f16364v.next();
            default:
                return ((Map.Entry) this.f16364v.next()).getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f16363u) {
            case 0:
                throw new UnsupportedOperationException("Remove not supported");
            default:
                this.f16364v.remove();
                return;
        }
    }

    public /* synthetic */ s() {
    }
}

package xa;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a0 extends b0 implements Iterable {

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f30352u = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a0) && ((a0) obj).f30352u.equals(this.f30352u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30352u.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f30352u.iterator();
    }
}

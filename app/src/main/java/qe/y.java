package qe;
import m.f;

import b1.k0;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class y extends e {

    /* renamed from: u, reason: collision with root package name */
    public final List f24028u;

    public y(List list) {
        list.getClass();
        this.f24028u = list;
    }

    @Override // qe.a
    public final int a() {
        return this.f24028u.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= f(this)) {
            return this.f24028u.get(f(this) - i);
        }
        StringBuilder m4 = g3.a.m("Element index ", i, " must be in range [");
        m4.append(new jf.b(0, f(this), 1));
        m4.append("].");
        throw new IndexOutOfBoundsException(m4.toString());
    }

    @Override // qe.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new k0(this, 0);
    }

    @Override // qe.e, java.util.List
    public final ListIterator listIterator() {
        return new k0(this, 0);
    }

    @Override // qe.e, java.util.List
    public final ListIterator listIterator(int i) {
        return new k0(this, i);
    }
}

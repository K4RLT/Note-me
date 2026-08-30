package ya;
import wa.xa;
import ya.e;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class p extends j {

    /* renamed from: w, reason: collision with root package name */
    public final transient xa f31417w;

    /* renamed from: x, reason: collision with root package name */
    public final transient q f31418x;

    public p(xa xaVar, q qVar) {
        this.f31417w = xaVar;
        this.f31418x = qVar;
    }

    @Override // e
    public final int a(Object[] objArr) {
        return this.f31418x.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f31417w.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f31418x.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f31417w.getClass();
        return 1;
    }
}

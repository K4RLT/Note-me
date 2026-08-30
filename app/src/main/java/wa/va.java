package wa;
import wa.i9;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class va extends ra {

    /* renamed from: w, reason: collision with root package name */
    public final transient xa f29840w;

    /* renamed from: x, reason: collision with root package name */
    public final transient wa f29841x;

    public va(xa xaVar, wa waVar) {
        this.f29840w = xaVar;
        this.f29841x = waVar;
    }

    @Override // i9
    public final int a(Object[] objArr) {
        return this.f29841x.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f29840w.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f29841x.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f29840w.getClass();
        return 1;
    }
}

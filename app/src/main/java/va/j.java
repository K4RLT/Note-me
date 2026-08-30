package va;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: w, reason: collision with root package name */
    public final transient l f27489w;

    /* renamed from: x, reason: collision with root package name */
    public final transient k f27490x;

    public j(l lVar, k kVar) {
        this.f27489w = lVar;
        this.f27490x = kVar;
    }

    @Override // va.a
    public final int a(Object[] objArr) {
        return this.f27490x.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f27489w.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f27490x.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27489w.f27499z;
    }
}

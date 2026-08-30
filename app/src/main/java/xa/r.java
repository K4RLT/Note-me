package xa;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class r extends l {

    /* renamed from: x, reason: collision with root package name */
    public final transient t f30509x;

    /* renamed from: y, reason: collision with root package name */
    public final transient s f30510y;

    public r(t tVar, s sVar) {
        this.f30509x = tVar;
        this.f30510y = sVar;
    }

    @Override // xa.f
    public final int a(Object[] objArr) {
        return this.f30510y.a(objArr);
    }

    @Override // xa.f, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f30509x.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // xa.f
    public final boolean g() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f30510y.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30509x.f30534z;
    }
}

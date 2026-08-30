package xa;
import p.a;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class v extends l {

    /* renamed from: x, reason: collision with root package name */
    public final transient Object f30690x;

    public v(Object obj) {
        obj.getClass();
        this.f30690x = obj;
    }

    @Override // xa.f
    public final int a(Object[] objArr) {
        objArr[0] = this.f30690x;
        return 1;
    }

    @Override // xa.f, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f30690x.equals(obj);
    }

    @Override // xa.f
    public final boolean g() {
        return false;
    }

    @Override // xa.l, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f30690x.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new n(this.f30690x);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a.k("[", this.f30690x.toString(), "]");
    }
}

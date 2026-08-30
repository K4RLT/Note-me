package xa;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class q extends l {

    /* renamed from: x, reason: collision with root package name */
    public final transient t f30501x;

    /* renamed from: y, reason: collision with root package name */
    public final transient Object[] f30502y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f30503z;

    public q(t tVar, Object[] objArr, int i) {
        this.f30501x = tVar;
        this.f30502y = objArr;
        this.f30503z = i;
    }

    @Override // xa.f
    public final int a(Object[] objArr) {
        i iVar = this.f30453v;
        if (iVar == null) {
            iVar = s();
            this.f30453v = iVar;
        }
        return iVar.a(objArr);
    }

    @Override // xa.f, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f30501x.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // xa.f
    public final boolean g() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i iVar = this.f30453v;
        if (iVar == null) {
            iVar = s();
            this.f30453v = iVar;
        }
        return iVar.listIterator(0);
    }

    public final i s() {
        return new p(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30503z;
    }
}

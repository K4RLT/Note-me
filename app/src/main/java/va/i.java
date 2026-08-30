package va;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: w, reason: collision with root package name */
    public final transient l f27486w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f27487x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f27488y;

    public i(l lVar, Object[] objArr, int i) {
        this.f27486w = lVar;
        this.f27487x = objArr;
        this.f27488y = i;
    }

    @Override // va.a
    public final int a(Object[] objArr) {
        d dVar = this.f27481v;
        if (dVar == null) {
            dVar = new h(this);
            this.f27481v = dVar;
        }
        return dVar.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f27486w.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        d dVar = this.f27481v;
        if (dVar == null) {
            dVar = new h(this);
            this.f27481v = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27488y;
    }
}

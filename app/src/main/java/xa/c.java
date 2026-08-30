package xa;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c extends AbstractSet {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30370u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f30371v;

    public /* synthetic */ c(d dVar, int i) {
        this.f30370u = i;
        this.f30371v = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f30370u) {
            case 0:
                this.f30371v.clear();
                return;
            default:
                this.f30371v.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f30370u) {
            case 0:
                d dVar = this.f30371v;
                Map c10 = dVar.c();
                if (c10 != null) {
                    return c10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int h3 = dVar.h(entry.getKey());
                    if (h3 != -1 && Objects.equals(dVar.b()[h3], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f30371v.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f30370u) {
            case 0:
                d dVar = this.f30371v;
                Map c10 = dVar.c();
                if (c10 != null) {
                    return c10.entrySet().iterator();
                }
                return new b(dVar, 1);
            default:
                d dVar2 = this.f30371v;
                Map c11 = dVar2.c();
                if (c11 != null) {
                    return c11.keySet().iterator();
                }
                return new b(dVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f30370u) {
            case 0:
                d dVar = this.f30371v;
                Map c10 = dVar.c();
                if (c10 != null) {
                    return c10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!dVar.f()) {
                        int g8 = dVar.g();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = dVar.f30396u;
                        Objects.requireNonNull(obj2);
                        int m4 = u0.m(key, value, g8, obj2, dVar.k(), dVar.a(), dVar.b());
                        if (m4 != -1) {
                            dVar.e(m4, g8);
                            dVar.f30401z--;
                            dVar.f30400y += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                d dVar2 = this.f30371v;
                Map c11 = dVar2.c();
                if (c11 != null) {
                    return c11.keySet().remove(obj);
                }
                if (dVar2.j(obj) == d.D) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f30370u) {
            case 0:
                return this.f30371v.size();
            default:
                return this.f30371v.size();
        }
    }
}

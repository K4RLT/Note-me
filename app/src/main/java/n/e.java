package n;

import androidx.datastore.preferences.protobuf.h1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends r0 implements Map {

    /* renamed from: x, reason: collision with root package name */
    public h1 f20857x;

    /* renamed from: y, reason: collision with root package name */
    public b f20858y;

    /* renamed from: z, reason: collision with root package name */
    public d f20859z;

    @Override // java.util.Map
    public final Set entrySet() {
        h1 h1Var = this.f20857x;
        if (h1Var == null) {
            h1 h1Var2 = new h1(5, this);
            this.f20857x = h1Var2;
            return h1Var2;
        }
        return h1Var;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f20858y;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.f20858y = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final boolean l(Collection collection) {
        int i = this.f20934w;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        if (i != this.f20934w) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f20934w);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f20859z;
        if (dVar == null) {
            d dVar2 = new d(this);
            this.f20859z = dVar2;
            return dVar2;
        }
        return dVar;
    }
}

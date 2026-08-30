package w0;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class d extends AbstractMap implements Map, ef.d {

    /* renamed from: u, reason: collision with root package name */
    public b f27665u;

    /* renamed from: v, reason: collision with root package name */
    public y0.b f27666v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public k f27667w;

    /* renamed from: x, reason: collision with root package name */
    public Object f27668x;

    /* renamed from: y, reason: collision with root package name */
    public int f27669y;

    /* renamed from: z, reason: collision with root package name */
    public int f27670z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y0.b] */
    public d(b bVar) {
        this.f27665u = bVar;
        this.f27667w = bVar.f27660u;
        this.f27670z = bVar.f27661v;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, y0.b] */
    /* renamed from: a */
    public b b() {
        k kVar = this.f27667w;
        b bVar = this.f27665u;
        if (kVar != bVar.f27660u) {
            this.f27666v = new Object();
            bVar = new b(this.f27667w, this.f27670z);
        }
        this.f27665u = bVar;
        return bVar;
    }

    public /* bridge */ b b() {
        return b();
    }

    public final void c(int i) {
        this.f27670z = i;
        this.f27669y++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f27667w = k.e;
        c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        k kVar = this.f27667w;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return kVar.d(i, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new f(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int i;
        k kVar = this.f27667w;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return kVar.g(i, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new f(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        this.f27668x = null;
        k kVar = this.f27667w;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.f27667w = kVar.l(i, obj, obj2, 0, this);
        return this.f27668x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, y0.a] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b bVar;
        d dVar;
        b bVar2 = null;
        if (map instanceof b) {
            bVar = (b) map;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            if (map instanceof d) {
                dVar = (d) map;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                bVar2 = dVar.b();
            }
        } else {
            bVar2 = bVar;
        }
        if (bVar2 != null) {
            Object obj = new Object();
            obj.f30795a = 0;
            int i = this.f27670z;
            k kVar = this.f27667w;
            k kVar2 = bVar2.f27660u;
            kVar2.getClass();
            this.f27667w = kVar.m(kVar2, 0, obj, this);
            int i10 = (bVar2.f27661v + i) - obj.f30795a;
            if (i != i10) {
                c(i10);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i;
        int i10 = this.f27670z;
        k kVar = this.f27667w;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        k o10 = kVar.o(i, obj, obj2, 0, this);
        if (o10 == null) {
            o10 = k.e;
        }
        this.f27667w = o10;
        if (i10 == this.f27670z) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f27670z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new re.g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f27668x = null;
        k n10 = this.f27667w.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n10 == null) {
            n10 = k.e;
        }
        this.f27667w = n10;
        return this.f27668x;
    }
}
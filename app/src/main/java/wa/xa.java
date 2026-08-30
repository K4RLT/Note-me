package wa;
import wa.xa;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class xa implements Map, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29860u;

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f29861v;

    /* renamed from: w, reason: collision with root package name */
    public transient AbstractCollection f29862w;

    /* renamed from: x, reason: collision with root package name */
    public transient AbstractCollection f29863x;

    /* renamed from: y, reason: collision with root package name */
    public transient AbstractCollection f29864y;

    public /* synthetic */ xa(Object[] objArr, int i) {
        this.f29860u = i;
        this.f29861v = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f29860u) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f29860u) {
            case 0:
                if (get(obj) != null) {
                    return true;
                }
                return false;
            default:
                if (get(obj) != null) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f29860u) {
            case 0:
                wa waVar = (wa) this.f29864y;
                if (waVar == null) {
                    waVar = new wa(this.f29861v, 1);
                    this.f29864y = waVar;
                }
                return waVar.contains(obj);
            default:
                ya.q qVar = (ya.q) this.f29864y;
                if (qVar == null) {
                    qVar = new ya.q(this.f29861v, 1);
                    this.f29864y = qVar;
                }
                return qVar.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f29860u) {
            case 0:
                ua uaVar = (ua) this.f29862w;
                if (uaVar == null) {
                    ua uaVar2 = new ua(this, this.f29861v);
                    this.f29862w = uaVar2;
                    return uaVar2;
                }
                return uaVar;
            default:
                ya.o oVar = (ya.o) this.f29862w;
                if (oVar == null) {
                    ya.o oVar2 = new ya.o(this, this.f29861v);
                    this.f29862w = oVar2;
                    return oVar2;
                }
                return oVar;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f29860u) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Map)) {
                    return false;
                }
                return entrySet().equals(((Map) obj).entrySet());
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Map)) {
                    return false;
                }
                return entrySet().equals(((Map) obj).entrySet());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f29860u
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            r0 = 0
            if (r4 != 0) goto La
        L8:
            r4 = r0
            goto L1e
        La:
            r1 = 0
            java.lang.Object[] r2 = r3.f29861v
            r1 = r2[r1]
            r1.getClass()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L8
            r4 = 1
            r4 = r2[r4]
            r4.getClass()
        L1e:
            if (r4 != 0) goto L21
            goto L22
        L21:
            r0 = r4
        L22:
            return r0
        L23:
            r0 = 0
            if (r4 != 0) goto L28
        L26:
            r4 = r0
            goto L3c
        L28:
            r1 = 0
            java.lang.Object[] r2 = r3.f29861v
            r1 = r2[r1]
            r1.getClass()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L26
            r4 = 1
            r4 = r2[r4]
            r4.getClass()
        L3c:
            if (r4 != 0) goto L3f
            goto L40
        L3f:
            r0 = r4
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.xa.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f29860u) {
            case 0:
                Object obj3 = get(obj);
                if (obj3 != null) {
                    return obj3;
                }
                return obj2;
            default:
                Object obj4 = get(obj);
                if (obj4 != null) {
                    return obj4;
                }
                return obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int i10;
        switch (this.f29860u) {
            case 0:
                ua uaVar = (ua) this.f29862w;
                if (uaVar == null) {
                    uaVar = new ua(this, this.f29861v);
                    this.f29862w = uaVar;
                }
                int i11 = 0;
                for (Object obj : uaVar) {
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    i11 += i;
                }
                return i11;
            default:
                ya.o oVar = (ya.o) this.f29862w;
                if (oVar == null) {
                    oVar = new ya.o(this, this.f29861v);
                    this.f29862w = oVar;
                }
                int i12 = 0;
                for (Object obj2 : oVar) {
                    if (obj2 != null) {
                        i10 = obj2.hashCode();
                    } else {
                        i10 = 0;
                    }
                    i12 += i10;
                }
                return i12;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f29860u) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f29860u) {
            case 0:
                va vaVar = (va) this.f29863x;
                if (vaVar == null) {
                    va vaVar2 = new va(this, new wa(this.f29861v, 0));
                    this.f29863x = vaVar2;
                    return vaVar2;
                }
                return vaVar;
            default:
                ya.p pVar = (ya.p) this.f29863x;
                if (pVar == null) {
                    ya.p pVar2 = new ya.p(this, new ya.q(this.f29861v, 0));
                    this.f29863x = pVar2;
                    return pVar2;
                }
                return pVar;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f29860u) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.f29860u) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f29860u) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.f29860u) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    public final String toString() {
        switch (this.f29860u) {
            case 0:
                boolean z3 = true;
                StringBuilder sb2 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb2.append('{');
                Iterator it = ((ua) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z3) {
                        sb2.append(", ");
                    }
                    sb2.append(entry.getKey());
                    sb2.append('=');
                    sb2.append(entry.getValue());
                    z3 = false;
                }
                sb2.append('}');
                return sb2.toString();
            default:
                boolean z9 = true;
                StringBuilder sb3 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb3.append('{');
                Iterator it2 = ((ya.o) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z9) {
                        sb3.append(", ");
                    }
                    sb3.append(entry2.getKey());
                    sb3.append('=');
                    sb3.append(entry2.getValue());
                    z9 = false;
                }
                sb3.append('}');
                return sb3.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f29860u) {
            case 0:
                wa waVar = (wa) this.f29864y;
                if (waVar == null) {
                    wa waVar2 = new wa(this.f29861v, 1);
                    this.f29864y = waVar2;
                    return waVar2;
                }
                return waVar;
            default:
                ya.q qVar = (ya.q) this.f29864y;
                if (qVar == null) {
                    ya.q qVar2 = new ya.q(this.f29861v, 1);
                    this.f29864y = qVar2;
                    return qVar2;
                }
                return qVar;
        }
    }
}

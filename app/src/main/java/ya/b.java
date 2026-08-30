package ya;
import ie.a;
import me.a;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends AbstractSet {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31027u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f31028v;

    public /* synthetic */ b(d dVar, int i) {
        this.f31027u = i;
        this.f31028v = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f31027u) {
            case 0:
                this.f31028v.clear();
                return;
            default:
                this.f31028v.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f31027u) {
            case 0:
                d dVar = this.f31028v;
                Map a10 = dVar.a();
                if (a10 != null) {
                    return a10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f10 = dVar.f(entry.getKey());
                    if (f10 != -1) {
                        Object[] objArr = dVar.f31192x;
                        objArr.getClass();
                        if (a(objArr[f10], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f31028v.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f31027u) {
            case 0:
                d dVar = this.f31028v;
                Map a10 = dVar.a();
                if (a10 != null) {
                    return a10.entrySet().iterator();
                }
                return new a(dVar, 1);
            default:
                d dVar2 = this.f31028v;
                Map a11 = dVar2.a();
                if (a11 != null) {
                    return a11.keySet().iterator();
                }
                return new a(dVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f31027u) {
            case 0:
                d dVar = this.f31028v;
                Map a10 = dVar.a();
                if (a10 != null) {
                    return a10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!dVar.c()) {
                        int e = dVar.e();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = dVar.f31189u;
                        obj2.getClass();
                        int[] iArr = dVar.f31190v;
                        iArr.getClass();
                        Object[] objArr = dVar.f31191w;
                        objArr.getClass();
                        Object[] objArr2 = dVar.f31192x;
                        objArr2.getClass();
                        int a11 = a(key, value, e, obj2, iArr, objArr, objArr2);
                        if (a11 != -1) {
                            dVar.b(a11, e);
                            dVar.f31194z--;
                            dVar.f31193y += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                d dVar2 = this.f31028v;
                Map a12 = dVar2.a();
                if (a12 != null) {
                    return a12.keySet().remove(obj);
                }
                if (dVar2.h(obj) == d.D) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f31027u) {
            case 0:
                return this.f31028v.size();
            default:
                return this.f31028v.size();
        }
    }
}

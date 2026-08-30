package ya;
import wa.xa;
import ya.e;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class o extends j {

    /* renamed from: w, reason: collision with root package name */
    public final transient xa f31400w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f31401x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f31402y = 1;

    public o(xa xaVar, Object[] objArr) {
        this.f31400w = xaVar;
        this.f31401x = objArr;
    }

    @Override // e
    public final int a(Object[] objArr) {
        i iVar = this.f31340v;
        if (iVar == null) {
            iVar = new n(this);
            this.f31340v = iVar;
        }
        return iVar.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f31400w.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i iVar = this.f31340v;
        if (iVar == null) {
            iVar = new n(this);
            this.f31340v = iVar;
        }
        return iVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f31402y;
    }
}

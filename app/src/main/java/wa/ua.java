package wa;
import wa.i9;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ua extends ra {

    /* renamed from: w, reason: collision with root package name */
    public final transient xa f29831w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f29832x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f29833y = 1;

    public ua(xa xaVar, Object[] objArr) {
        this.f29831w = xaVar;
        this.f29832x = objArr;
    }

    @Override // i9
    public final int a(Object[] objArr) {
        qa qaVar = this.f29805v;
        if (qaVar == null) {
            qaVar = new ta(this);
            this.f29805v = qaVar;
        }
        return qaVar.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f29831w.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        qa qaVar = this.f29805v;
        if (qaVar == null) {
            qaVar = new ta(this);
            this.f29805v = qaVar;
        }
        return qaVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29833y;
    }
}

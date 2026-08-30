package w0;

import java.util.Iterator;
import java.util.Map;
import q1.y;

/* loaded from: classes.dex */
public final class f extends qe.g {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27674u;

    /* renamed from: v, reason: collision with root package name */
    public final d f27675v;

    public /* synthetic */ f(int i, d dVar) {
        this.f27674u = i;
        this.f27675v = dVar;
    }

    @Override // qe.g
    public final int a() {
        switch (this.f27674u) {
            case 0:
                return this.f27675v.f27670z;
            default:
                return this.f27675v.f27670z;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f27674u) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f27674u) {
            case 0:
                this.f27675v.clear();
                return;
            default:
                this.f27675v.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f27674u) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                d dVar = this.f27675v;
                Object obj2 = dVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !dVar.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return this.f27675v.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f27674u) {
            case 0:
                return new y(this.f27675v);
            default:
                l[] lVarArr = new l[8];
                for (int i = 0; i < 8; i++) {
                    lVarArr[i] = new m(1);
                }
                return new e(this.f27675v, lVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f27674u) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f27675v.remove(entry.getKey(), entry.getValue());
            default:
                d dVar = this.f27675v;
                if (dVar.containsKey(obj)) {
                    dVar.remove(obj);
                    return true;
                }
                return false;
        }
    }
}

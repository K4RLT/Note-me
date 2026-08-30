package n;
import l.a;
import q.l;
import q.x;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: u, reason: collision with root package name */
    public int f20845u;

    /* renamed from: v, reason: collision with root package name */
    public int f20846v = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20847w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f20848x;

    public c(e eVar) {
        this.f20848x = eVar;
        this.f20845u = eVar.f20934w - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.f20847w) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.f20846v;
                e eVar = this.f20848x;
                if (kotlin.jvm.internal.a(key, eVar.g(i)) && kotlin.jvm.internal.a(entry.getValue(), eVar.j(this.f20846v))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        x.o("This container does not support retaining Map.Entry objects");
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f20847w) {
            return this.f20848x.g(this.f20846v);
        }
        x.o("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f20847w) {
            return this.f20848x.j(this.f20846v);
        }
        x.o("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f20846v < this.f20845u) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.f20847w) {
            int i = this.f20846v;
            e eVar = this.f20848x;
            Object g8 = eVar.g(i);
            Object j10 = eVar.j(this.f20846v);
            int i10 = 0;
            if (g8 == null) {
                hashCode = 0;
            } else {
                hashCode = g8.hashCode();
            }
            if (j10 != null) {
                i10 = j10.hashCode();
            }
            return hashCode ^ i10;
        }
        x.o("This container does not support retaining Map.Entry objects");
        return 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f20846v++;
            this.f20847w = true;
            return this;
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f20847w) {
            this.f20848x.h(this.f20846v);
            this.f20846v--;
            this.f20845u--;
            this.f20847w = false;
            return;
        }
        g5.l();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f20847w) {
            return this.f20848x.i(this.f20846v, obj);
        }
        x.o("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}

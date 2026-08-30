package b1;
import l.a;
import p.i;
import p.k;
import p.n;
import p.t;
import p.w;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class y implements h0, Map, ef.d {

    /* renamed from: u, reason: collision with root package name */
    public x f1407u;

    /* renamed from: v, reason: collision with root package name */
    public final q f1408v;

    /* renamed from: w, reason: collision with root package name */
    public final q f1409w;

    /* renamed from: x, reason: collision with root package name */
    public final q f1410x;

    public y() {
        w0.b bVar = w0.b.f27659w;
        i k3 = k();
        x xVar = new x(k3.g(), bVar);
        if (!(k3 instanceof c)) {
            xVar.f1351b = new x(1, bVar);
        }
        this.f1407u = xVar;
        this.f1408v = new q(this, 0);
        this.f1409w = new q(this, 1);
        this.f1410x = new q(this, 2);
    }

    public static final boolean c(y yVar, x xVar, int i, w0.b bVar) {
        boolean z3;
        synchronized (w.f1404b) {
            int i10 = xVar.f1406d;
            if (i10 == i) {
                xVar.f1405c = bVar;
                z3 = true;
                xVar.f1406d = i10 + 1;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // b1.h0
    public final void a(j0 j0Var) {
        j0Var.getClass();
        this.f1407u = (x) j0Var;
    }

    @Override // b1.h0
    public final j0 b() {
        return this.f1407u;
    }

    @Override // java.util.Map
    public final void clear() {
        i k3;
        x xVar = this.f1407u;
        xVar.getClass();
        x xVar2 = (x) i(xVar);
        w0.b bVar = w0.b.f27659w;
        if (bVar != xVar2.f1405c) {
            x xVar3 = this.f1407u;
            xVar3.getClass();
            synchronized (p.f1387c) {
                k3 = k();
                x xVar4 = (x) w(xVar3, this, k3);
                synchronized (w.f1404b) {
                    xVar4.f1405c = bVar;
                    xVar4.f1406d++;
                }
            }
            n(k3, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e().f1405c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e().f1405c.containsValue(obj);
    }

    public final x e() {
        x xVar = this.f1407u;
        xVar.getClass();
        return (x) t(xVar, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f1408v;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return e().f1405c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return e().f1405c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f1409w;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        w0.b bVar;
        int i;
        Object put;
        i k3;
        boolean c10;
        do {
            synchronized (w.f1404b) {
                x xVar = this.f1407u;
                xVar.getClass();
                x xVar2 = (x) i(xVar);
                bVar = xVar2.f1405c;
                i = xVar2.f1406d;
            }
            bVar.getClass();
            w0.d b10 = bVar.b();
            put = b10.put(obj, obj2);
            w0.b b11 = b10.b();
            if (kotlin.jvm.internal.a(b11, bVar)) {
                break;
            }
            x xVar3 = this.f1407u;
            xVar3.getClass();
            synchronized (p.f1387c) {
                k3 = k();
                c10 = c(this, (x) w(xVar3, this, k3), i, b11);
            }
            n(k3, this);
        } while (!c10);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        w0.b bVar;
        int i;
        i k3;
        boolean c10;
        do {
            synchronized (w.f1404b) {
                x xVar = this.f1407u;
                xVar.getClass();
                x xVar2 = (x) i(xVar);
                bVar = xVar2.f1405c;
                i = xVar2.f1406d;
            }
            bVar.getClass();
            w0.d b10 = bVar.b();
            b10.putAll(map);
            w0.b b11 = b10.b();
            if (!kotlin.jvm.internal.a(b11, bVar)) {
                x xVar3 = this.f1407u;
                xVar3.getClass();
                synchronized (p.f1387c) {
                    k3 = k();
                    c10 = c(this, (x) w(xVar3, this, k3), i, b11);
                }
                n(k3, this);
            } else {
                return;
            }
        } while (!c10);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        w0.b bVar;
        int i;
        V remove;
        i k3;
        boolean c10;
        do {
            synchronized (w.f1404b) {
                x xVar = this.f1407u;
                xVar.getClass();
                x xVar2 = (x) i(xVar);
                bVar = xVar2.f1405c;
                i = xVar2.f1406d;
            }
            bVar.getClass();
            w0.d b10 = bVar.b();
            remove = b10.remove(obj);
            w0.b b11 = b10.b();
            if (kotlin.jvm.internal.a(b11, bVar)) {
                break;
            }
            x xVar3 = this.f1407u;
            xVar3.getClass();
            synchronized (p.f1387c) {
                k3 = k();
                c10 = c(this, (x) w(xVar3, this, k3), i, b11);
            }
            n(k3, this);
        } while (!c10);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return e().f1405c.size();
    }

    public final String toString() {
        x xVar = this.f1407u;
        xVar.getClass();
        return "SnapshotStateMap(value=" + ((x) i(xVar)).f1405c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f1410x;
    }
}

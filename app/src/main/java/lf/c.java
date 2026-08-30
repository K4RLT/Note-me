package lf;
import g.a;

import df.l;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import n.g0;
import n.h0;
import n.k0;
import n.l0;

/* loaded from: classes.dex */
public final class c implements Iterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20356u;

    /* renamed from: v, reason: collision with root package name */
    public int f20357v;

    /* renamed from: w, reason: collision with root package name */
    public Object f20358w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f20359x;

    public c(l0 l0Var) {
        this.f20356u = 2;
        this.f20359x = l0Var;
        this.f20357v = -1;
        this.f20358w = a(new k0(l0Var, this, null));
    }

    public void a() {
        Object invoke;
        int i;
        int i10 = this.f20357v;
        af.j jVar = (af.j) this.f20359x;
        if (i10 == -2) {
            invoke = ((df.a) jVar.f377b).invoke();
        } else {
            l lVar = (l) jVar.f378c;
            Object obj = this.f20358w;
            obj.getClass();
            invoke = lVar.invoke(obj);
        }
        this.f20358w = invoke;
        if (invoke == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.f20357v = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f20356u) {
            case 0:
                if (this.f20357v < 0) {
                    a();
                }
                if (this.f20357v == 1) {
                    return true;
                }
                return false;
            case 1:
                return ((e) this.f20358w).hasNext();
            case 2:
                return ((e) this.f20358w).hasNext();
            default:
                if (this.f20357v < ((Map) this.f20359x).size()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f20356u) {
            case 0:
                if (this.f20357v < 0) {
                    a();
                }
                if (this.f20357v != 0) {
                    Object obj = this.f20358w;
                    obj.getClass();
                    this.f20357v = -1;
                    return obj;
                }
                l4.a.c();
                return null;
            case 1:
                return ((e) this.f20358w).next();
            case 2:
                return ((e) this.f20358w).next();
            default:
                if (hasNext()) {
                    Object obj2 = this.f20358w;
                    this.f20357v++;
                    Object obj3 = ((Map) this.f20359x).get(obj2);
                    if (obj3 != null) {
                        this.f20358w = ((x0.a) obj3).f30037b;
                        return obj2;
                    }
                    throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                }
                l4.a.c();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f20356u) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.f20357v;
                if (i != -1) {
                    ((h0) this.f20359x).f20890v.h(i);
                    this.f20357v = -1;
                    return;
                }
                return;
            case 2:
                int i10 = this.f20357v;
                if (i10 != -1) {
                    ((l0) this.f20359x).f20914v.m(i10);
                    this.f20357v = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(af.j jVar) {
        this.f20356u = 0;
        this.f20359x = jVar;
        this.f20357v = -2;
    }

    public c(Object obj, Map map) {
        this.f20356u = 3;
        this.f20358w = obj;
        this.f20359x = map;
    }

    public c(h0 h0Var) {
        this.f20356u = 1;
        this.f20359x = h0Var;
        this.f20357v = -1;
        this.f20358w = a(new g0(h0Var, this, null));
    }
}

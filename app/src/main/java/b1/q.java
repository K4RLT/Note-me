package b1;
import k.a;
import k.b;
import m.d;
import p.i;
import p.k;
import p.n;
import p.w;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class q implements Set, ef.e {

    /* renamed from: u, reason: collision with root package name */
    public final y f1394u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1395v;

    public q(y yVar, int i) {
        this.f1395v = i;
        this.f1394u = yVar;
    }

    private final boolean a(Collection collection) {
        w0.b bVar;
        int i;
        i k3;
        boolean c10;
        Set U = qe.l.U(collection);
        y yVar = this.f1394u;
        boolean z3 = false;
        do {
            synchronized (w.f1404b) {
                x xVar = yVar.f1407u;
                xVar.getClass();
                x xVar2 = (x) i(xVar);
                bVar = xVar2.f1405c;
                i = xVar2.f1406d;
            }
            bVar.getClass();
            w0.d b10 = bVar.b();
            Object it = yVar.f1408v.iterator();
            while (((g0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((f0) it).next();
                if (!U.contains(entry.getKey())) {
                    b10.remove(entry.getKey());
                    z3 = true;
                }
            }
            w0.b b11 = b10.b();
            if (kotlin.jvm.internal.a(b11, bVar)) {
                break;
            }
            x xVar3 = yVar.f1407u;
            xVar3.getClass();
            synchronized (p.f1387c) {
                k3 = k();
                c10 = y.c(yVar, (x) w(xVar3, yVar, k3), i, b11);
            }
            n(k3, yVar);
        } while (!c10);
        return z3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f1395v) {
            case 0:
                w.k();
                throw null;
            case 1:
                w.k();
                throw null;
            default:
                w.k();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f1395v) {
            case 0:
                w.k();
                throw null;
            case 1:
                w.k();
                throw null;
            default:
                w.k();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f1394u.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f1395v) {
            case 0:
                if ((obj instanceof Map.Entry) && (!(obj instanceof ef.a) || (obj instanceof ef.c))) {
                    Map.Entry entry = (Map.Entry) obj;
                    return kotlin.jvm.internal.a(this.f1394u.get(entry.getKey()), entry.getValue());
                }
                return false;
            case 1:
                return this.f1394u.containsKey(obj);
            default:
                return this.f1394u.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f1395v) {
            case 0:
                Collection collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!contains((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!this.f1394u.containsKey(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!this.f1394u.containsValue(it3.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f1394u.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1395v) {
            case 0:
                y yVar = this.f1394u;
                return new f0(yVar, ((u0.b) yVar.e().f1405c.entrySet()).iterator(), 0);
            case 1:
                y yVar2 = this.f1394u;
                return new f0(yVar2, ((u0.b) yVar2.e().f1405c.entrySet()).iterator(), 1);
            default:
                y yVar3 = this.f1394u;
                return new f0(yVar3, ((u0.b) yVar3.e().f1405c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        switch (this.f1395v) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                if (((obj instanceof ef.a) && !(obj instanceof ef.c)) || this.f1394u.remove(((Map.Entry) obj).getKey()) == null) {
                    return false;
                }
                return true;
            case 1:
                if (this.f1394u.remove(obj) != null) {
                    return true;
                }
                return false;
            default:
                y yVar = this.f1394u;
                Object it = yVar.f1408v.iterator();
                while (true) {
                    if (((g0) it).hasNext()) {
                        obj2 = ((f0) it).next();
                        if (kotlin.jvm.internal.a(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry != null) {
                    yVar.remove(entry.getKey());
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        w0.b bVar;
        int i;
        i k3;
        boolean c10;
        switch (this.f1395v) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it.hasNext()) {
                        if (this.f1394u.remove(((Map.Entry) it.next()).getKey()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                    break;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z9 = false;
                    while (it2.hasNext()) {
                        if (this.f1394u.remove(it2.next()) != null || z9) {
                            z9 = true;
                        }
                    }
                    return z9;
                    break;
                }
                break;
            default:
                Set U = qe.l.U(collection);
                y yVar = this.f1394u;
                boolean z10 = false;
                do {
                    synchronized (w.f1404b) {
                        x xVar = yVar.f1407u;
                        xVar.getClass();
                        x xVar2 = (x) i(xVar);
                        bVar = xVar2.f1405c;
                        i = xVar2.f1406d;
                    }
                    bVar.getClass();
                    w0.d b10 = bVar.b();
                    Object it3 = yVar.f1408v.iterator();
                    while (((g0) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((f0) it3).next();
                        if (U.contains(entry.getValue())) {
                            b10.remove(entry.getKey());
                            z10 = true;
                        }
                    }
                    w0.b b11 = b10.b();
                    if (!kotlin.jvm.internal.a(b11, bVar)) {
                        x xVar3 = yVar.f1407u;
                        xVar3.getClass();
                        synchronized (p.f1387c) {
                            k3 = k();
                            c10 = y.c(yVar, (x) w(xVar3, yVar, k3), i, b11);
                        }
                        n(k3, yVar);
                    }
                    return z10;
                } while (!c10);
                return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        w0.b bVar;
        int i;
        i k3;
        boolean c10;
        w0.b bVar2;
        int i10;
        i k4;
        boolean c11;
        switch (this.f1395v) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int b10 = qe.b(qe.d(collection2, 10));
                if (b10 < 16) {
                    b10 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                y yVar = this.f1394u;
                boolean z3 = false;
                do {
                    synchronized (w.f1404b) {
                        x xVar = yVar.f1407u;
                        xVar.getClass();
                        x xVar2 = (x) i(xVar);
                        bVar = xVar2.f1405c;
                        i = xVar2.f1406d;
                    }
                    bVar.getClass();
                    w0.d b11 = bVar.b();
                    Object it = yVar.f1408v.iterator();
                    while (((g0) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((f0) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !kotlin.jvm.internal.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            b11.remove(entry2.getKey());
                            z3 = true;
                        }
                    }
                    w0.b b12 = b11.b();
                    if (!kotlin.jvm.internal.a(b12, bVar)) {
                        x xVar3 = yVar.f1407u;
                        xVar3.getClass();
                        synchronized (p.f1387c) {
                            k3 = k();
                            c10 = y.c(yVar, (x) w(xVar3, yVar, k3), i, b12);
                        }
                        n(k3, yVar);
                    }
                    return z3;
                } while (!c10);
                return z3;
            case 1:
                return a(collection);
            default:
                Set U = qe.l.U(collection);
                y yVar2 = this.f1394u;
                boolean z9 = false;
                do {
                    synchronized (w.f1404b) {
                        x xVar4 = yVar2.f1407u;
                        xVar4.getClass();
                        x xVar5 = (x) i(xVar4);
                        bVar2 = xVar5.f1405c;
                        i10 = xVar5.f1406d;
                    }
                    bVar2.getClass();
                    w0.d b13 = bVar2.b();
                    Object it2 = yVar2.f1408v.iterator();
                    while (((g0) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((f0) it2).next();
                        if (!U.contains(entry3.getValue())) {
                            b13.remove(entry3.getKey());
                            z9 = true;
                        }
                    }
                    w0.b b14 = b13.b();
                    if (!kotlin.jvm.internal.a(b14, bVar2)) {
                        x xVar6 = yVar2.f1407u;
                        xVar6.getClass();
                        synchronized (p.f1387c) {
                            k4 = k();
                            c11 = y.c(yVar2, (x) w(xVar6, yVar2, k4), i10, b14);
                        }
                        n(k4, yVar2);
                    }
                    return z9;
                } while (!c11);
                return z9;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f1394u.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.b(this, objArr);
    }
}

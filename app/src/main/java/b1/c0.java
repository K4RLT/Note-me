package b1;
import n.d0;
import q.x;
import w.a;

import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class c0 implements ListIterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1315u;

    /* renamed from: v, reason: collision with root package name */
    public int f1316v;

    /* renamed from: w, reason: collision with root package name */
    public int f1317w;

    /* renamed from: x, reason: collision with root package name */
    public int f1318x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f1319y;

    public c0(v vVar, int i) {
        this.f1315u = 0;
        this.f1319y = vVar;
        this.f1316v = i - 1;
        this.f1317w = -1;
        this.f1318x = w.f(vVar);
    }

    public void a() {
        int i;
        i = ((AbstractList) ((re.a) this.f1319y).f24748y).modCount;
        if (i == this.f1318x) {
            return;
        }
        l4.a.m();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        switch (this.f1315u) {
            case 0:
                c();
                v vVar = (v) this.f1319y;
                vVar.add(this.f1316v + 1, obj);
                this.f1317w = -1;
                this.f1316v++;
                this.f1318x = w.f(vVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                a();
                re.a aVar = (re.a) this.f1319y;
                int i10 = this.f1316v;
                this.f1316v = i10 + 1;
                aVar.add(i10, obj);
                this.f1317w = -1;
                this.f1318x = re.a.g(aVar);
                return;
            default:
                b();
                re.b bVar = (re.b) this.f1319y;
                int i11 = this.f1316v;
                this.f1316v = i11 + 1;
                bVar.add(i11, obj);
                this.f1317w = -1;
                i = ((AbstractList) bVar).modCount;
                this.f1318x = i;
                return;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((re.b) this.f1319y)).modCount;
        if (i == this.f1318x) {
            return;
        }
        l4.a.m();
    }

    public void c() {
        if (w.f((v) this.f1319y) == this.f1318x) {
            return;
        }
        l4.a.m();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1315u) {
            case 0:
                if (this.f1316v < ((v) this.f1319y).size() - 1) {
                    return true;
                }
                return false;
            case 1:
                if (this.f1316v < this.f1318x) {
                    return true;
                }
                return false;
            case 2:
                if (this.f1316v < ((re.a) this.f1319y).f24746w) {
                    return true;
                }
                return false;
            default:
                if (this.f1316v < ((re.b) this.f1319y).f24751v) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1315u) {
            case 0:
                if (this.f1316v >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f1316v > this.f1317w) {
                    return true;
                }
                return false;
            case 2:
                if (this.f1316v > 0) {
                    return true;
                }
                return false;
            default:
                if (this.f1316v > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1315u) {
            case 0:
                c();
                int i = this.f1316v + 1;
                this.f1317w = i;
                v vVar = (v) this.f1319y;
                a(i, vVar.size());
                Object obj = vVar.get(i);
                this.f1316v = i;
                return obj;
            case 1:
                d0 d0Var = ((b2.q) this.f1319y).f1578u;
                int i10 = this.f1316v;
                this.f1316v = i10 + 1;
                Object e = d0Var.e(i10);
                e.getClass();
                return (d1.q) e;
            case 2:
                a();
                int i11 = this.f1316v;
                re.a aVar = (re.a) this.f1319y;
                if (i11 < aVar.f24746w) {
                    this.f1316v = i11 + 1;
                    this.f1317w = i11;
                    return aVar.f24744u[aVar.f24745v + i11];
                }
                l4.a.c();
                return null;
            default:
                b();
                int i12 = this.f1316v;
                re.b bVar = (re.b) this.f1319y;
                if (i12 < bVar.f24751v) {
                    this.f1316v = i12 + 1;
                    this.f1317w = i12;
                    return bVar.f24750u[i12];
                }
                l4.a.c();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1315u) {
            case 0:
                return this.f1316v + 1;
            case 1:
                return this.f1316v - this.f1317w;
            case 2:
                return this.f1316v;
            default:
                return this.f1316v;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1315u) {
            case 0:
                c();
                int i = this.f1316v;
                v vVar = (v) this.f1319y;
                a(i, vVar.size());
                int i10 = this.f1316v;
                this.f1317w = i10;
                this.f1316v--;
                return vVar.get(i10);
            case 1:
                d0 d0Var = ((b2.q) this.f1319y).f1578u;
                int i11 = this.f1316v - 1;
                this.f1316v = i11;
                Object e = d0Var.e(i11);
                e.getClass();
                return (d1.q) e;
            case 2:
                a();
                int i12 = this.f1316v;
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    this.f1316v = i13;
                    this.f1317w = i13;
                    re.a aVar = (re.a) this.f1319y;
                    return aVar.f24744u[aVar.f24745v + i13];
                }
                l4.a.c();
                return null;
            default:
                b();
                int i14 = this.f1316v;
                if (i14 > 0) {
                    int i15 = i14 - 1;
                    this.f1316v = i15;
                    this.f1317w = i15;
                    return ((re.b) this.f1319y).f24750u[i15];
                }
                l4.a.c();
                return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f1315u) {
            case 0:
                return this.f1316v;
            case 1:
                i = this.f1316v - this.f1317w;
                return i - 1;
            case 2:
                i = this.f1316v;
                return i - 1;
            default:
                i = this.f1316v;
                return i - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        switch (this.f1315u) {
            case 0:
                c();
                v vVar = (v) this.f1319y;
                vVar.remove(this.f1317w);
                this.f1316v--;
                this.f1317w = -1;
                this.f1318x = w.f(vVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                re.a aVar = (re.a) this.f1319y;
                a();
                int i10 = this.f1317w;
                if (i10 != -1) {
                    aVar.b(i10);
                    this.f1316v = this.f1317w;
                    this.f1317w = -1;
                    this.f1318x = re.a.g(aVar);
                    return;
                }
                x.o("Call next() or previous() before removing element from the iterator.");
                return;
            default:
                re.b bVar = (re.b) this.f1319y;
                b();
                int i11 = this.f1317w;
                if (i11 != -1) {
                    bVar.b(i11);
                    this.f1316v = this.f1317w;
                    this.f1317w = -1;
                    i = ((AbstractList) bVar).modCount;
                    this.f1318x = i;
                    return;
                }
                x.o("Call next() or previous() before removing element from the iterator.");
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1315u) {
            case 0:
                v vVar = (v) this.f1319y;
                c();
                int i = this.f1317w;
                if (i >= 0) {
                    vVar.set(i, obj);
                    this.f1318x = w.f(vVar);
                    return;
                } else {
                    x.o("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                }
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                a();
                int i10 = this.f1317w;
                if (i10 != -1) {
                    ((re.a) this.f1319y).set(i10, obj);
                    return;
                } else {
                    x.o("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                b();
                int i11 = this.f1317w;
                if (i11 != -1) {
                    ((re.b) this.f1319y).set(i11, obj);
                    return;
                } else {
                    x.o("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
        }
    }

    public c0(re.b bVar, int i) {
        int i10;
        this.f1315u = 3;
        this.f1319y = bVar;
        this.f1316v = i;
        this.f1317w = -1;
        i10 = ((AbstractList) bVar).modCount;
        this.f1318x = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c0(b2.q qVar, int i, int i10) {
        this(qVar, (i10 & 1) != 0 ? 0 : i, 0, qVar.f1578u.f20856b);
        this.f1315u = 1;
    }

    public c0(b2.q qVar, int i, int i10, int i11) {
        this.f1315u = 1;
        this.f1319y = qVar;
        this.f1316v = i;
        this.f1317w = i10;
        this.f1318x = i11;
    }

    public c0(re.a aVar, int i) {
        this.f1315u = 2;
        this.f1319y = aVar;
        this.f1316v = i;
        this.f1317w = -1;
        this.f1318x = re.a.g(aVar);
    }
}

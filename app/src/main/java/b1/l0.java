package b1;
import k.a;
import k.b;
import l.a;
import p.i;
import p.k;
import p.n;
import p.w;
import w.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import r0.n1;
import wa.b9;

/* loaded from: classes.dex */
public final class l0 implements List, ef.b {

    /* renamed from: u, reason: collision with root package name */
    public final v f1362u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1363v;

    /* renamed from: w, reason: collision with root package name */
    public int f1364w;

    /* renamed from: x, reason: collision with root package name */
    public int f1365x;

    public l0(v vVar, int i, int i10) {
        this.f1362u = vVar;
        this.f1363v = i;
        this.f1364w = w.f(vVar);
        this.f1365x = i10 - i;
    }

    public final void a() {
        if (w.f(this.f1362u) == this.f1364w) {
            return;
        }
        l4.a.m();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.f1363v + this.f1365x;
        v vVar = this.f1362u;
        vVar.add(i, obj);
        this.f1365x++;
        this.f1364w = w.f(vVar);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i10 = i + this.f1363v;
        v vVar = this.f1362u;
        boolean addAll = vVar.addAll(i10, collection);
        if (addAll) {
            this.f1365x = collection.size() + this.f1365x;
            this.f1364w = w.f(vVar);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f1365x > 0) {
            a();
            int i = this.f1365x;
            int i10 = this.f1363v;
            v vVar = this.f1362u;
            vVar.k(i10, i + i10);
            this.f1365x = 0;
            this.f1364w = w.f(vVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        a(i, this.f1365x);
        return this.f1362u.get(this.f1363v + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int nextInt;
        a();
        int i = this.f1365x;
        int i10 = this.f1363v;
        Iterator it = b9.i(i10, i + i10).iterator();
        do {
            jf.c cVar = (jf.c) it;
            if (cVar.f19194w) {
                nextInt = cVar.nextInt();
            } else {
                return -1;
            }
        } while (!kotlin.jvm.internal.a(obj, this.f1362u.get(nextInt)));
        return nextInt - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.f1365x == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.f1365x;
        int i10 = this.f1363v;
        for (int i11 = (i + i10) - 1; i11 >= i10; i11--) {
            if (kotlin.jvm.internal.a(obj, this.f1362u.get(i11))) {
                return i11 - i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.w] */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        Object obj = new Object();
        obj.f19785u = i - 1;
        return new k0((kotlin.jvm.internal.w) obj, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i10 = this.f1363v + i;
        v vVar = this.f1362u;
        Object remove = vVar.remove(i10);
        this.f1365x--;
        this.f1364w = w.f(vVar);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z3 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z3) {
                    z3 = true;
                }
            }
            return z3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        v0.b bVar;
        i k3;
        boolean b10;
        a();
        v vVar = this.f1362u;
        int i10 = this.f1363v;
        int i11 = this.f1365x + i10;
        int size = vVar.size();
        do {
            synchronized (w.f1403a) {
                d0 d0Var = vVar.f1402u;
                d0Var.getClass();
                d0 d0Var2 = (d0) i(d0Var);
                i = d0Var2.f1329d;
                bVar = d0Var2.f1328c;
            }
            bVar.getClass();
            v0.e n10 = bVar.n();
            n10.subList(i10, i11).retainAll(collection);
            v0.b g8 = n10.g();
            if (kotlin.jvm.internal.a(g8, bVar)) {
                break;
            }
            d0 d0Var3 = vVar.f1402u;
            d0Var3.getClass();
            synchronized (p.f1387c) {
                k3 = k();
                b10 = w.b((d0) w(d0Var3, vVar, k3), i, g8, true);
            }
            n(k3, vVar);
        } while (!b10);
        int size2 = size - vVar.size();
        if (size2 > 0) {
            this.f1364w = w.f(this.f1362u);
            this.f1365x -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        a(i, this.f1365x);
        a();
        int i10 = i + this.f1363v;
        v vVar = this.f1362u;
        Object obj2 = vVar.set(i10, obj);
        this.f1364w = w.f(vVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f1365x;
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        if (i < 0 || i > i10 || i10 > this.f1365x) {
            n1.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i11 = this.f1363v;
        return new l0(this.f1362u, i + i11, i10 + i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.b(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i10 = this.f1363v + i;
        v vVar = this.f1362u;
        vVar.add(i10, obj);
        this.f1365x++;
        this.f1364w = w.f(vVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f1365x, collection);
    }
}
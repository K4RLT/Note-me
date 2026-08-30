package b1;
import k.a;
import k.b;
import l.a;
import p.i;
import p.k;
import p.n;
import p.w;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import r0.n1;

/* loaded from: classes.dex */
public final class v implements Parcelable, h0, List, RandomAccess, ef.b {
    public static final Parcelable.Creator<v> CREATOR = new u(0);

    /* renamed from: u, reason: collision with root package name */
    public d0 f1402u;

    public v(v0.b bVar) {
        i k3 = k();
        d0 d0Var = new d0(k3.g(), bVar);
        if (!(k3 instanceof c)) {
            d0Var.f1351b = new d0(1, bVar);
        }
        this.f1402u = d0Var;
    }

    @Override // b1.h0
    public final void a(j0 j0Var) {
        j0Var.f1351b = this.f1402u;
        this.f1402u = (d0) j0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        v0.b bVar;
        i k3;
        boolean b10;
        do {
            synchronized (w.f1403a) {
                d0 d0Var = this.f1402u;
                d0Var.getClass();
                d0 d0Var2 = (d0) i(d0Var);
                i = d0Var2.f1329d;
                bVar = d0Var2.f1328c;
            }
            bVar.getClass();
            v0.b g8 = bVar.g(obj);
            if (g8.equals(bVar)) {
                return false;
            }
            d0 d0Var3 = this.f1402u;
            d0Var3.getClass();
            synchronized (p.f1387c) {
                k3 = k();
                b10 = w.b((d0) w(d0Var3, this, k3), i, g8, true);
            }
            n(k3, this);
        } while (!b10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        v0.b bVar;
        i k3;
        boolean b10;
        do {
            synchronized (w.f1403a) {
                d0 d0Var = this.f1402u;
                d0Var.getClass();
                d0 d0Var2 = (d0) i(d0Var);
                i = d0Var2.f1329d;
                bVar = d0Var2.f1328c;
            }
            bVar.getClass();
            v0.b k4 = bVar.k(collection);
            if (kotlin.jvm.internal.a(k4, bVar)) {
                return false;
            }
            d0 d0Var3 = this.f1402u;
            d0Var3.getClass();
            synchronized (p.f1387c) {
                k3 = k();
                b10 = w.b((d0) w(d0Var3, this, k3), i, k4, true);
            }
            n(k3, this);
        } while (!b10);
        return true;
    }

    @Override // b1.h0
    public final j0 b() {
        return this.f1402u;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        i k3;
        d0 d0Var = this.f1402u;
        d0Var.getClass();
        synchronized (p.f1387c) {
            k3 = k();
            d0 d0Var2 = (d0) w(d0Var, this, k3);
            synchronized (w.f1403a) {
                d0Var2.f1328c = v0.h.f27281v;
                d0Var2.f1329d++;
                d0Var2.e++;
            }
        }
        n(k3, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return w.e(this).f1328c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return w.e(this).f1328c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return w.e(this).f1328c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return w.e(this).f1328c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return w.e(this).f1328c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    public final void k(int i, int i10) {
        int i11;
        v0.b bVar;
        i k3;
        boolean b10;
        do {
            synchronized (w.f1403a) {
                d0 d0Var = this.f1402u;
                d0Var.getClass();
                d0 d0Var2 = (d0) i(d0Var);
                i11 = d0Var2.f1329d;
                bVar = d0Var2.f1328c;
            }
            bVar.getClass();
            v0.e n10 = bVar.n();
            n10.subList(i, i10).clear();
            v0.b g8 = n10.g();
            if (!kotlin.jvm.internal.a(g8, bVar)) {
                d0 d0Var3 = this.f1402u;
                d0Var3.getClass();
                synchronized (p.f1387c) {
                    k3 = k();
                    b10 = w.b((d0) w(d0Var3, this, k3), i11, g8, true);
                }
                n(k3, this);
            } else {
                return;
            }
        } while (!b10);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return w.e(this).f1328c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c0(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        v0.b bVar;
        v0.b bVar2;
        i k3;
        boolean b10;
        do {
            synchronized (w.f1403a) {
                d0 d0Var = this.f1402u;
                d0Var.getClass();
                d0 d0Var2 = (d0) i(d0Var);
                i = d0Var2.f1329d;
                bVar = d0Var2.f1328c;
            }
            bVar.getClass();
            int indexOf = bVar.indexOf(obj);
            if (indexOf != -1) {
                bVar2 = bVar.p(indexOf);
            } else {
                bVar2 = bVar;
            }
            if (bVar2.equals(bVar)) {
                return false;
            }
            d0 d0Var3 = this.f1402u;
            d0Var3.getClass();
            synchronized (p.f1387c) {
                k3 = k();
                b10 = w.b((d0) w(d0Var3, this, k3), i, bVar2, true);
            }
            n(k3, this);
        } while (!b10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        v0.b bVar;
        i k3;
        boolean b10;
        do {
            synchronized (w.f1403a) {
                d0 d0Var = this.f1402u;
                d0Var.getClass();
                d0 d0Var2 = (d0) i(d0Var);
                i = d0Var2.f1329d;
                bVar = d0Var2.f1328c;
            }
            bVar.getClass();
            v0.b o10 = bVar.o(new s(1, collection));
            if (kotlin.jvm.internal.a(o10, bVar)) {
                return false;
            }
            d0 d0Var3 = this.f1402u;
            d0Var3.getClass();
            synchronized (p.f1387c) {
                k3 = k();
                b10 = w.b((d0) w(d0Var3, this, k3), i, o10, true);
            }
            n(k3, this);
        } while (!b10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return w.h(this, new s(0, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i10;
        v0.b bVar;
        i k3;
        boolean b10;
        Object obj2 = get(i);
        do {
            synchronized (w.f1403a) {
                d0 d0Var = this.f1402u;
                d0Var.getClass();
                d0 d0Var2 = (d0) i(d0Var);
                i10 = d0Var2.f1329d;
                bVar = d0Var2.f1328c;
            }
            bVar.getClass();
            v0.b q10 = bVar.q(i, obj);
            if (q10.equals(bVar)) {
                break;
            }
            d0 d0Var3 = this.f1402u;
            d0Var3.getClass();
            synchronized (p.f1387c) {
                k3 = k();
                b10 = w.b((d0) w(d0Var3, this, k3), i10, q10, false);
            }
            n(k3, this);
        } while (!b10);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return w.e(this).f1328c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        boolean z3;
        if (i >= 0 && i <= i10 && i10 <= size()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            n1.a("fromIndex or toIndex are out of bounds");
        }
        return new l0(this, i, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.a(this);
    }

    public final String toString() {
        d0 d0Var = this.f1402u;
        d0Var.getClass();
        return "SnapshotStateList(value=" + ((d0) i(d0Var)).f1328c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        v0.b bVar = w.e(this).f1328c;
        int a10 = bVar.a();
        parcel.writeInt(a10);
        for (int i10 = 0; i10 < a10; i10++) {
            parcel.writeValue(bVar.get(i10));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.b(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new c0(this, i);
    }

    public v() {
        this(v0.h.f27281v);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i10;
        v0.b bVar;
        i k3;
        boolean b10;
        do {
            synchronized (w.f1403a) {
                d0 d0Var = this.f1402u;
                d0Var.getClass();
                d0 d0Var2 = (d0) i(d0Var);
                i10 = d0Var2.f1329d;
                bVar = d0Var2.f1328c;
            }
            bVar.getClass();
            v0.b b11 = bVar.b(i, obj);
            if (b11.equals(bVar)) {
                return;
            }
            d0 d0Var3 = this.f1402u;
            d0Var3.getClass();
            synchronized (p.f1387c) {
                k3 = k();
                b10 = w.b((d0) w(d0Var3, this, k3), i10, b11, true);
            }
            n(k3, this);
        } while (!b10);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return w.h(this, new t(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i10;
        v0.b bVar;
        i k3;
        boolean b10;
        Object obj = get(i);
        do {
            synchronized (w.f1403a) {
                d0 d0Var = this.f1402u;
                d0Var.getClass();
                d0 d0Var2 = (d0) i(d0Var);
                i10 = d0Var2.f1329d;
                bVar = d0Var2.f1328c;
            }
            bVar.getClass();
            v0.b p10 = bVar.p(i);
            if (p10.equals(bVar)) {
                break;
            }
            d0 d0Var3 = this.f1402u;
            d0Var3.getClass();
            synchronized (p.f1387c) {
                k3 = k();
                b10 = w.b((d0) w(d0Var3, this, k3), i10, p10, true);
            }
            n(k3, this);
        } while (!b10);
        return obj;
    }
}

package com.google.android.gms.internal.mlkit_vision_digital_ink;
import l4.a;
import q.x;
import x.o;
import ya.eg;
import ya.f;
import ya.yc;

import com.google.android.gms.internal.ads.a41;
import com.google.android.gms.internal.ads.j41;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class e3 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14233u;

    /* renamed from: v, reason: collision with root package name */
    public final Iterator f14234v;

    /* renamed from: w, reason: collision with root package name */
    public Object f14235w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f14236x;

    public e3(j41 j41Var) {
        Iterator it;
        this.f14233u = 2;
        this.f14236x = j41Var;
        Collection collection = j41Var.f7318w;
        this.f14235w = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f14234v = it;
    }

    public void a() {
        switch (this.f14233u) {
            case 2:
                j41 j41Var = (j41) this.f14236x;
                j41Var.zzb();
                if (j41Var.f7318w != ((Collection) this.f14235w)) {
                    l4.a.m();
                    return;
                }
                return;
            default:
                j41 j41Var2 = (j41) this.f14236x;
                j41Var2.zzb();
                if (j41Var2.f7318w != ((Collection) this.f14235w)) {
                    l4.a.m();
                    return;
                }
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14233u) {
            case 0:
                return this.f14234v.hasNext();
            case 1:
                return this.f14234v.hasNext();
            case 2:
                a();
                return this.f14234v.hasNext();
            case 3:
                return this.f14234v.hasNext();
            case 4:
                return this.f14234v.hasNext();
            default:
                a();
                return this.f14234v.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        j41 j41Var;
        j41 j41Var2;
        switch (this.f14233u) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f14234v.next();
                this.f14235w = (Collection) entry.getValue();
                Object key = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                k3 k3Var = (k3) ((a41) this.f14236x).f4359y;
                k3Var.getClass();
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    j41Var = new j41(k3Var, key, list, (j41) null);
                } else {
                    j41Var = new j41(k3Var, key, list, (j41) null);
                }
                return new AbstractMap.SimpleImmutableEntry(key, j41Var);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f14234v.next();
                this.f14235w = entry2;
                return entry2.getKey();
            case 2:
                a();
                return this.f14234v.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.f14234v.next();
                this.f14235w = (Collection) entry3.getValue();
                Object key2 = entry3.getKey();
                Collection collection2 = (Collection) entry3.getValue();
                ya.eg egVar = (ya.eg) ((a41) this.f14236x).f4359y;
                egVar.getClass();
                List list2 = (List) collection2;
                if (list2 instanceof RandomAccess) {
                    j41Var2 = new j41(egVar, key2, list2, (j41) null);
                } else {
                    j41Var2 = new j41(egVar, key2, list2, (j41) null);
                }
                return new ya.f(key2, j41Var2);
            case 4:
                Map.Entry entry4 = (Map.Entry) this.f14234v.next();
                this.f14235w = entry4;
                return entry4.getKey();
            default:
                a();
                return this.f14234v.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f14233u) {
            case 0:
                if (((Collection) this.f14235w) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                pa.s("no calls to next() since the last call to remove()", z3);
                this.f14234v.remove();
                ((k3) ((a41) this.f14236x).f4359y).getClass();
                ((Collection) this.f14235w).size();
                ((Collection) this.f14235w).clear();
                this.f14235w = null;
                return;
            case 1:
                if (((Map.Entry) this.f14235w) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                pa.s("no calls to next() since the last call to remove()", z9);
                Collection collection = (Collection) ((Map.Entry) this.f14235w).getValue();
                this.f14234v.remove();
                ((f3) this.f14236x).f14295w.getClass();
                collection.size();
                collection.clear();
                this.f14235w = null;
                return;
            case 2:
                this.f14234v.remove();
                j41 j41Var = (j41) this.f14236x;
                ((k3) j41Var.f7321z).getClass();
                j41Var.a();
                return;
            case 3:
                if (((Collection) this.f14235w) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f14234v.remove();
                    ((ya.eg) ((a41) this.f14236x).f4359y).getClass();
                    ((Collection) this.f14235w).size();
                    ((Collection) this.f14235w).clear();
                    this.f14235w = null;
                    return;
                }
                q.x.o("no calls to next() since the last call to remove()");
                return;
            case 4:
                Map.Entry entry = (Map.Entry) this.f14235w;
                if (entry != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    Collection collection2 = (Collection) entry.getValue();
                    this.f14234v.remove();
                    ((ya.yc) this.f14236x).f31603w.getClass();
                    collection2.size();
                    collection2.clear();
                    this.f14235w = null;
                    return;
                }
                q.x.o("no calls to next() since the last call to remove()");
                return;
            default:
                this.f14234v.remove();
                ((j41) this.f14236x).a();
                return;
        }
    }

    public /* synthetic */ e3(AbstractSet abstractSet, Iterator it, int i) {
        this.f14233u = i;
        this.f14234v = it;
        this.f14236x = abstractSet;
    }

    public e3(a41 a41Var) {
        this.f14233u = 0;
        Objects.requireNonNull(a41Var);
        this.f14236x = a41Var;
        this.f14234v = a41Var.f4356v.entrySet().iterator();
    }

    public e3(a41 a41Var, byte b10) {
        this.f14233u = 3;
        this.f14236x = a41Var;
        this.f14234v = a41Var.f4356v.entrySet().iterator();
    }

    public e3(j41 j41Var, ListIterator listIterator, byte b10) {
        this.f14233u = 5;
        this.f14236x = j41Var;
        this.f14235w = j41Var.f7318w;
        this.f14234v = listIterator;
    }

    public e3(j41 j41Var, byte b10) {
        Iterator it;
        this.f14233u = 5;
        this.f14236x = j41Var;
        Collection collection = j41Var.f7318w;
        this.f14235w = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f14234v = it;
    }

    public e3(j41 j41Var, ListIterator listIterator) {
        this.f14233u = 2;
        this.f14236x = j41Var;
        this.f14235w = j41Var.f7318w;
        this.f14234v = listIterator;
    }
}

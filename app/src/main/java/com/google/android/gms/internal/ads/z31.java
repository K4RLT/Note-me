package com.google.android.gms.internal.ads;
import l4.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class z31 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13062u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Iterator f13063v;

    /* renamed from: w, reason: collision with root package name */
    public Object f13064w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f13065x;

    public z31(j41 j41Var) {
        Iterator it;
        this.f13065x = j41Var;
        Collection collection = j41Var.f7318w;
        this.f13064w = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f13063v = it;
    }

    public void a() {
        j41 j41Var = (j41) this.f13065x;
        j41Var.zza();
        if (j41Var.f7318w == ((Collection) this.f13064w)) {
            return;
        }
        l4.a.m();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13062u) {
            case 0:
                return this.f13063v.hasNext();
            case 1:
                return this.f13063v.hasNext();
            default:
                a();
                return this.f13063v.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13062u) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f13063v.next();
                this.f13064w = (Collection) entry.getValue();
                return ((a41) this.f13065x).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f13063v.next();
                this.f13064w = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f13063v.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z3;
        boolean z9;
        switch (this.f13062u) {
            case 0:
                if (((Collection) this.f13064w) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b80.L("no calls to next() since the last call to remove()", z3);
                this.f13063v.remove();
                ((u51) ((a41) this.f13065x).f4359y).f11553y -= ((Collection) this.f13064w).size();
                ((Collection) this.f13064w).clear();
                this.f13064w = null;
                return;
            case 1:
                if (((Map.Entry) this.f13064w) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                b80.L("no calls to next() since the last call to remove()", z9);
                Collection collection = (Collection) ((Map.Entry) this.f13064w).getValue();
                this.f13063v.remove();
                ((b41) this.f13065x).f4715w.f11553y -= collection.size();
                collection.clear();
                this.f13064w = null;
                return;
            default:
                this.f13063v.remove();
                j41 j41Var = (j41) this.f13065x;
                u51 u51Var = (u51) j41Var.f7321z;
                u51Var.f11553y--;
                j41Var.zzb();
                return;
        }
    }

    public z31(b41 b41Var, Iterator it) {
        this.f13063v = it;
        this.f13065x = b41Var;
    }

    public z31(a41 a41Var) {
        Objects.requireNonNull(a41Var);
        this.f13065x = a41Var;
        this.f13063v = a41Var.f4356v.entrySet().iterator();
    }

    public z31(j41 j41Var, ListIterator listIterator) {
        this.f13065x = j41Var;
        this.f13064w = j41Var.f7318w;
        this.f13063v = listIterator;
    }
}

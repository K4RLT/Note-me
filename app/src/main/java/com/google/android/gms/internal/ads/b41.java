package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class b41 extends j61 {

    /* renamed from: v, reason: collision with root package name */
    public final Map f4714v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u51 f4715w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(u51 u51Var, Map map) {
        super(0);
        Objects.requireNonNull(u51Var);
        this.f4715w = u51Var;
        map.getClass();
        this.f4714v = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            z31 z31Var = (z31) it;
            if (z31Var.hasNext()) {
                z31Var.next();
                z31Var.remove();
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4714v.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f4714v.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f4714v.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4714v.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4714v.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new z31(this, this.f4714v.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f4714v.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f4715w.f11553y -= size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4714v.size();
    }
}

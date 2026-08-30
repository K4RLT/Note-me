package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.j61;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f3 extends j61 {

    /* renamed from: v, reason: collision with root package name */
    public final Map f14294v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f14295w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(k3 k3Var, Map map) {
        super(1);
        this.f14295w = k3Var;
        this.f14294v = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            e3 e3Var = (e3) it;
            if (e3Var.hasNext()) {
                e3Var.next();
                e3Var.remove();
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14294v.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f14294v.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f14294v.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14294v.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f14294v.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new e3(this, this.f14294v.entrySet().iterator(), 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f14294v.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f14295w.getClass();
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14294v.size();
    }
}

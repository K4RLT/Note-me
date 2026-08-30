package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x31 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f12463u;

    /* renamed from: v, reason: collision with root package name */
    public Collection f12464v = null;

    /* renamed from: w, reason: collision with root package name */
    public Iterator f12465w = o51.f8987u;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u51 f12466x;

    public x31(u51 u51Var) {
        this.f12466x = u51Var;
        this.f12463u = u51Var.f11552x.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f12463u.hasNext() && !this.f12465w.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f12465w.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f12463u.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f12464v = collection;
            this.f12465w = collection.iterator();
        }
        return this.f12465w.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12465w.remove();
        Collection collection = this.f12464v;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f12463u.remove();
        }
        u51 u51Var = this.f12466x;
        u51Var.f11553y--;
    }
}

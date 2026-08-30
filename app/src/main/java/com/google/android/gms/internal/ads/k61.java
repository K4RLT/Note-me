package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class k61 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f7671u;

    public k61(Iterator it) {
        it.getClass();
        this.f7671u = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7671u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f7671u.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7671u.remove();
    }
}

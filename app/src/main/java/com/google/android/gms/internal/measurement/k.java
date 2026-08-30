package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Iterator f13795u;

    public k(Iterator it) {
        this.f13795u = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13795u.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new p((String) this.f13795u.next());
    }
}

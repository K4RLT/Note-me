package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class j5 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f14498u;

    public j5(Iterator it) {
        it.getClass();
        this.f14498u = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14498u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f14498u.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f14498u.remove();
    }
}

package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class p4 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f14785u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14786v;

    /* renamed from: w, reason: collision with root package name */
    public Object f14787w;

    public p4(Iterator it) {
        it.getClass();
        this.f14785u = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f14786v && !this.f14785u.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f14786v) {
            return this.f14785u.next();
        }
        Object obj = this.f14787w;
        this.f14786v = false;
        this.f14787w = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        pa.s("Can't remove after you've peeked at next", !this.f14786v);
        this.f14785u.remove();
    }
}

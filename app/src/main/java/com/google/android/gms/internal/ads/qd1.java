package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class qd1 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9825u;

    /* renamed from: v, reason: collision with root package name */
    public final Iterator f9826v;

    /* renamed from: w, reason: collision with root package name */
    public final Iterator f9827w;

    public /* synthetic */ qd1(Iterator it, Iterator it2, int i) {
        this.f9825u = i;
        this.f9826v = it;
        this.f9827w = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9825u) {
            case 0:
                if (!this.f9826v.hasNext() && !this.f9827w.hasNext()) {
                    return false;
                }
                return true;
            default:
                if (this.f9826v.hasNext()) {
                    return true;
                }
                return this.f9827w.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9825u) {
            case 0:
                Iterator it = this.f9826v;
                if (it.hasNext()) {
                    return it.next();
                }
                return this.f9827w.next();
            default:
                Iterator it2 = this.f9826v;
                if (it2.hasNext()) {
                    return new com.google.android.gms.internal.measurement.p(((Integer) it2.next()).toString());
                }
                Iterator it3 = this.f9827w;
                if (it3.hasNext()) {
                    return new com.google.android.gms.internal.measurement.p((String) it3.next());
                }
                l4.a.c();
                return null;
        }
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class p51 extends m61 {

    /* renamed from: v, reason: collision with root package name */
    public final Object f9407v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9408w;

    public p51(Object obj) {
        super(0);
        this.f9407v = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f9408w;
    }

    @Override // com.google.android.gms.internal.ads.m61, java.util.Iterator
    public final Object next() {
        if (!this.f9408w) {
            this.f9408w = true;
            return this.f9407v;
        }
        l4.a.c();
        return null;
    }
}

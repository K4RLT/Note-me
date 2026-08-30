package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class g51 extends m61 {

    /* renamed from: v, reason: collision with root package name */
    public final b51 f6307v;

    /* renamed from: w, reason: collision with root package name */
    public m61 f6308w;

    public g51(l51 l51Var) {
        super(0);
        Objects.requireNonNull(l51Var);
        this.f6307v = ((d51) l51Var.f7950x.values()).listIterator(0);
        this.f6308w = n51.f8548y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f6308w.hasNext() && !this.f6307v.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.m61, java.util.Iterator
    public final Object next() {
        if (!this.f6308w.hasNext()) {
            this.f6308w = ((z41) this.f6307v.next()).a();
        }
        return this.f6308w.next();
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ko1 extends m61 {

    /* renamed from: v, reason: collision with root package name */
    public final mo1 f7829v;

    /* renamed from: w, reason: collision with root package name */
    public m61 f7830w;

    public ko1(no1 no1Var) {
        super(1);
        this.f7829v = new mo1(no1Var);
        this.f7830w = b();
    }

    @Override // com.google.android.gms.internal.ads.m61
    public final byte a() {
        m61 m61Var = this.f7830w;
        if (m61Var != null) {
            byte a10 = m61Var.a();
            if (!this.f7830w.hasNext()) {
                this.f7830w = b();
            }
            return a10;
        }
        l4.a.c();
        return (byte) 0;
    }

    public final jm1 b() {
        mo1 mo1Var = this.f7829v;
        if (mo1Var.hasNext()) {
            return new jm1(mo1Var.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7830w != null;
    }
}

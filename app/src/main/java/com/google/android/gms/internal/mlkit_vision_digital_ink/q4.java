package com.google.android.gms.internal.mlkit_vision_digital_ink;
import l4.a;

/* loaded from: classes.dex */
public final class q4 extends k5 {

    /* renamed from: u, reason: collision with root package name */
    public final Object f14835u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14836v;

    public q4(Object obj) {
        this.f14835u = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f14836v;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f14836v) {
            this.f14836v = true;
            return this.f14835u;
        }
        a.c();
        return null;
    }
}

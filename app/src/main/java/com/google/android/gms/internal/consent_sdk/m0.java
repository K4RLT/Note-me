package com.google.android.gms.internal.consent_sdk;
import l4.a;

/* loaded from: classes.dex */
public final class m0 extends r0 {

    /* renamed from: u, reason: collision with root package name */
    public final Object f13489u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13490v;

    public m0(Object obj) {
        this.f13489u = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f13490v;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f13490v) {
            this.f13490v = true;
            return this.f13489u;
        }
        l4.a.c();
        return null;
    }
}

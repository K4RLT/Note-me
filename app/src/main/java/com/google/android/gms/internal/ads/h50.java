package com.google.android.gms.internal.ads;
import j9.m;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h50 implements m {

    /* renamed from: u, reason: collision with root package name */
    public final g70 f6601u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f6602v = new AtomicBoolean(false);

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f6603w = new AtomicBoolean(false);

    public h50(g70 g70Var) {
        this.f6601u = g70Var;
    }

    @Override // m
    public final void R0() {
    }

    @Override // m
    public final void T1() {
    }

    @Override // m
    public final void d() {
        this.f6601u.P1(f70.f5955w);
    }

    @Override // m
    public final void g2() {
    }

    @Override // m
    public final void i4(int i) {
        this.f6602v.set(true);
        AtomicBoolean atomicBoolean = this.f6603w;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f6601u.P1(f70.f5958z);
        }
    }

    @Override // m
    public final void o3() {
    }

    @Override // m
    public final void r0() {
    }

    @Override // m
    public final void t1() {
    }

    @Override // m
    public final void u2() {
        AtomicBoolean atomicBoolean = this.f6603w;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f6601u.P1(f70.f5958z);
        }
    }

    @Override // m
    public final void v2() {
    }

    @Override // m
    public final void z1() {
    }
}

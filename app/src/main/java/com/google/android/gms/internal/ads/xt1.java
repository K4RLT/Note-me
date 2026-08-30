package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes.dex */
public final class xt1 {

    /* renamed from: a, reason: collision with root package name */
    public final wt1 f12624a;

    /* renamed from: b, reason: collision with root package name */
    public final et1 f12625b;

    /* renamed from: c, reason: collision with root package name */
    public int f12626c;

    /* renamed from: d, reason: collision with root package name */
    public Object f12627d;
    public final Looper e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12628f;

    public xt1(et1 et1Var, wt1 wt1Var, Looper looper) {
        this.f12625b = et1Var;
        this.f12624a = wt1Var;
        this.e = looper;
    }

    public final void a() {
        b80.K(!this.f12628f);
        this.f12628f = true;
        et1 et1Var = this.f12625b;
        if (!et1Var.f5781c0 && et1Var.C.getThread().isAlive()) {
            et1Var.A.b(14, this).a();
        } else {
            x21.F("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }

    public final synchronized void b(boolean z3) {
        notifyAll();
    }
}

package com.google.android.gms.internal.ads;
import g9.d3;
import g9.r;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class s70 extends um1 implements b70, p70 {

    /* renamed from: w, reason: collision with root package name */
    public final qp0 f10544w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f10545x;

    /* renamed from: y, reason: collision with root package name */
    public final wp0 f10546y;

    public s70(Set set, qp0 qp0Var, wp0 wp0Var) {
        super(set);
        this.f10545x = new AtomicBoolean();
        this.f10544w = qp0Var;
        this.f10546y = wp0Var;
    }

    public final void U1() {
        d3 d3Var;
        if (((Boolean) r.e.f17698c.a(sl.U8)).booleanValue() && (d3Var = this.f10544w.f9932e0) != null && d3Var.f17608u == 3 && this.f10545x.compareAndSet(false, true)) {
            P1(new hx0(14, d3Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void h() {
        if (this.f10544w.f9926b == 1) {
            U1();
        }
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void y() {
        int i = this.f10544w.f9926b;
        if (i != 2 && i != 5 && i != 4 && i != 6 && i != 7) {
            return;
        }
        U1();
    }
}

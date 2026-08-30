package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class nj0 extends lj0 {

    /* renamed from: a, reason: collision with root package name */
    public final y10 f8727a;

    /* renamed from: b, reason: collision with root package name */
    public final yd1 f8728b;

    /* renamed from: c, reason: collision with root package name */
    public final jk0 f8729c;

    /* renamed from: d, reason: collision with root package name */
    public final p80 f8730d;
    public final x90 e;

    /* renamed from: f, reason: collision with root package name */
    public final x70 f8731f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f8732g;

    /* renamed from: h, reason: collision with root package name */
    public final i80 f8733h;
    public final qj0 i;

    /* renamed from: j, reason: collision with root package name */
    public final ii0 f8734j;

    public nj0(y10 y10Var, yd1 yd1Var, jk0 jk0Var, p80 p80Var, x90 x90Var, x70 x70Var, ViewGroup viewGroup, i80 i80Var, qj0 qj0Var, ii0 ii0Var) {
        this.f8727a = y10Var;
        this.f8728b = yd1Var;
        this.f8729c = jk0Var;
        this.f8730d = p80Var;
        this.e = x90Var;
        this.f8731f = x70Var;
        this.f8732g = viewGroup;
        this.f8733h = i80Var;
        this.i = qj0Var;
        this.f8734j = ii0Var;
    }

    @Override // com.google.android.gms.internal.ads.lj0
    public final hr0 c(aq0 aq0Var, Bundle bundle, qp0 qp0Var, wp0 wp0Var) {
        yd1 yd1Var = this.f8728b;
        yd1Var.f12856v = aq0Var;
        yd1Var.f12857w = bundle;
        yd1Var.f12859y = new zd1(9, wp0Var, qp0Var, this.i);
        if (((Boolean) g9.r.e.f17698c.a(sl.v4)).booleanValue()) {
            yd1Var.f12860z = this.f8734j;
        }
        y10 y10Var = this.f8727a.f12709b;
        k60 k60Var = new k60(yd1Var);
        j6.l lVar = new j6.l(this.f8731f, 5, this.f8733h);
        lx0 lx0Var = new lx0(16, this.f8732g);
        p80 p80Var = this.f8730d;
        lo1.c(p80Var, p80.class);
        jk0 jk0Var = this.f8729c;
        lo1.c(jk0Var, jk0.class);
        tf tfVar = new tf(28, false);
        x90 x90Var = this.e;
        lo1.c(x90Var, x90.class);
        i50 i50Var = (i50) new d20(y10Var, lx0Var, x90Var, new v80(16), p80Var, k60Var, tfVar, jk0Var, lVar, null, null).f5283t.zzb();
        return i50Var.c(i50Var.b());
    }
}

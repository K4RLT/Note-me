package com.google.android.gms.internal.ads;
import g9.r;
import r.e;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class mj0 extends lj0 {

    /* renamed from: a, reason: collision with root package name */
    public final y10 f8354a;

    /* renamed from: b, reason: collision with root package name */
    public final yd1 f8355b;

    /* renamed from: c, reason: collision with root package name */
    public final p80 f8356c;

    /* renamed from: d, reason: collision with root package name */
    public final qj0 f8357d;
    public final ii0 e;

    public mj0(y10 y10Var, yd1 yd1Var, p80 p80Var, qj0 qj0Var, ii0 ii0Var) {
        this.f8354a = y10Var;
        this.f8355b = yd1Var;
        this.f8356c = p80Var;
        this.f8357d = qj0Var;
        this.e = ii0Var;
    }

    @Override // com.google.android.gms.internal.ads.lj0
    public final hr0 c(aq0 aq0Var, Bundle bundle, qp0 qp0Var, wp0 wp0Var) {
        yd1 yd1Var = this.f8355b;
        yd1Var.f12856v = aq0Var;
        yd1Var.f12857w = bundle;
        yd1Var.f12859y = new zd1(9, wp0Var, qp0Var, this.f8357d);
        if (((Boolean) g9.r.e.f17698c.a(sl.v4)).booleanValue()) {
            yd1Var.f12860z = this.e;
        }
        y10 y10Var = this.f8354a.f12709b;
        k60 k60Var = new k60(yd1Var);
        p80 p80Var = this.f8356c;
        lo1.c(p80Var, p80.class);
        i50 zza = new b20(y10Var, new v80(16), p80Var, k60Var, new tf(28, false), null, null).zza();
        return zza.c(zza.b());
    }
}

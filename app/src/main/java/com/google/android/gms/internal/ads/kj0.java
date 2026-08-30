package com.google.android.gms.internal.ads;
import g9.r;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class kj0 extends lj0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7769a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final y10 f7770b;

    /* renamed from: c, reason: collision with root package name */
    public final yd1 f7771c;

    /* renamed from: d, reason: collision with root package name */
    public final p80 f7772d;
    public final qj0 e;

    /* renamed from: f, reason: collision with root package name */
    public final ii0 f7773f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7774g;

    public kj0(y10 y10Var, x90 x90Var, yd1 yd1Var, p80 p80Var, qj0 qj0Var, ii0 ii0Var) {
        this.f7770b = y10Var;
        this.f7774g = x90Var;
        this.f7771c = yd1Var;
        this.f7772d = p80Var;
        this.e = qj0Var;
        this.f7773f = ii0Var;
    }

    @Override // com.google.android.gms.internal.ads.lj0
    public final hr0 c(aq0 aq0Var, Bundle bundle, qp0 qp0Var, wp0 wp0Var) {
        xp0 xp0Var;
        switch (this.f7769a) {
            case 0:
                yd1 yd1Var = this.f7771c;
                yd1Var.f12856v = aq0Var;
                yd1Var.f12857w = bundle;
                yd1Var.f12859y = new zd1(9, wp0Var, qp0Var, this.e);
                if (((Boolean) r.e.f17698c.a(sl.v4)).booleanValue()) {
                    yd1Var.f12860z = this.f7773f;
                }
                y10 y10Var = this.f7770b.f12709b;
                k60 k60Var = new k60(yd1Var);
                x90 x90Var = (x90) this.f7774g;
                lx0 lx0Var = new lx0(16, (Object) null);
                p80 p80Var = this.f7772d;
                lo1.c(p80Var, p80.class);
                lo1.c(x90Var, x90.class);
                i50 i50Var = (i50) new x10(y10Var, lx0Var, x90Var, new v80(16), p80Var, k60Var, new tf(28, false), null, null).f12413p.zzb();
                return i50Var.c(i50Var.b());
            case 1:
                yd1 yd1Var2 = this.f7771c;
                yd1Var2.f12856v = aq0Var;
                yd1Var2.f12857w = bundle;
                yd1Var2.f12859y = new zd1(9, wp0Var, qp0Var, this.e);
                if (((Boolean) r.e.f17698c.a(sl.v4)).booleanValue()) {
                    yd1Var2.f12860z = this.f7773f;
                }
                y10 y10Var2 = this.f7770b.f12709b;
                k60 k60Var2 = new k60(yd1Var2);
                jk0 jk0Var = (jk0) this.f7774g;
                p80 p80Var2 = this.f7772d;
                lo1.c(p80Var2, p80.class);
                lo1.c(jk0Var, jk0.class);
                i50 i50Var2 = (i50) new h20(y10Var2, new v80(16), p80Var2, k60Var2, new tf(28, false), jk0Var, null, null).f6558o.zzb();
                return i50Var2.c(i50Var2.b());
            default:
                yd1 yd1Var3 = this.f7771c;
                yd1Var3.f12856v = aq0Var;
                yd1Var3.f12857w = bundle;
                yd1Var3.f12859y = new zd1(9, wp0Var, qp0Var, this.e);
                nl nlVar = sl.f10965u4;
                r rVar = r.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && (xp0Var = (xp0) this.f7774g) != null) {
                    yd1Var3.f12858x = xp0Var;
                }
                if (((Boolean) rVar.f17698c.a(sl.v4)).booleanValue()) {
                    yd1Var3.f12860z = this.f7773f;
                }
                y10 y10Var3 = this.f7770b.f12709b;
                k60 k60Var3 = new k60(yd1Var3);
                p80 p80Var3 = this.f7772d;
                lo1.c(p80Var3, p80.class);
                i50 zza = new k20(y10Var3, new v80(16), p80Var3, k60Var3, new tf(28, false), null, null).zza();
                return zza.c(zza.b());
        }
    }

    public kj0(y10 y10Var, yd1 yd1Var, p80 p80Var, xp0 xp0Var, qj0 qj0Var, ii0 ii0Var) {
        this.f7770b = y10Var;
        this.f7771c = yd1Var;
        this.f7772d = p80Var;
        this.f7774g = xp0Var;
        this.e = qj0Var;
        this.f7773f = ii0Var;
    }

    public kj0(y10 y10Var, yd1 yd1Var, jk0 jk0Var, p80 p80Var, qj0 qj0Var, ii0 ii0Var) {
        this.f7770b = y10Var;
        this.f7771c = yd1Var;
        this.f7774g = jk0Var;
        this.f7772d = p80Var;
        this.e = qj0Var;
        this.f7773f = ii0Var;
    }
}

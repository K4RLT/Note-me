package com.google.android.gms.internal.ads;
import k9.c0;
import la.a;
import r9.d;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class bb0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4750a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f4751b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f4752c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f4753d;
    public final wr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final wr1 f4754f;

    /* renamed from: g, reason: collision with root package name */
    public final wr1 f4755g;

    /* renamed from: h, reason: collision with root package name */
    public final wr1 f4756h;
    public final wr1 i;

    public bb0(l10 l10Var, o60 o60Var, wr1 wr1Var, z20 z20Var, sr1 sr1Var, sr1 sr1Var2, rr1 rr1Var, rr1 rr1Var2) {
        this.f4752c = l10Var;
        this.f4754f = o60Var;
        this.f4753d = wr1Var;
        this.f4755g = z20Var;
        this.f4756h = sr1Var;
        this.i = sr1Var2;
        this.e = rr1Var;
        this.f4751b = rr1Var2;
    }

    public ab0 a() {
        c0 zzb = ((l10) this.f4752c).zzb();
        aq0 a10 = ((o60) this.f4754f).a();
        ta0 ta0Var = (ta0) this.f4753d.zzb();
        ra0 a11 = ((z20) this.f4755g).a();
        ib0 ib0Var = (ib0) ((sr1) this.f4756h).zzb();
        lb0 lb0Var = (lb0) ((sr1) this.i).zzb();
        Executor executor = (Executor) this.e.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        return new ab0(zzb, a10, ta0Var, a11, ib0Var, lb0Var, executor, wxVar, (pa0) this.f4751b.zzb());
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f4750a) {
            case 0:
                return a();
            case 1:
                return new pc0((q60) this.f4751b.zzb(), (g70) ((rr1) this.e).zzb(), (n70) this.f4752c.zzb(), (r70) ((rr1) this.f4754f).zzb(), (h80) this.f4753d.zzb(), ((g50) this.f4755g).a(), ((g50) this.f4756h).f6306b.x(), (g30) ((rr1) this.i).zzb());
            case 2:
                return new zd0(((o10) this.f4752c).a(), (fe0) this.f4753d.zzb(), ((v10) this.e).zzb(), ((o60) this.f4754f).a(), (String) this.f4751b.zzb(), (String) this.f4755g.zzb(), (of) this.f4756h.zzb(), (d) this.i.zzb());
            case 3:
                return new nf0((qf0) this.f4751b.zzb(), (xf0) ((rr1) this.f4752c).zzb(), (ef0) ((rr1) this.f4753d).zzb(), ((o10) this.e).a(), ((u10) this.f4754f).a(), (jf0) ((rr1) this.f4755g).zzb(), (wf0) ((rr1) this.f4756h).zzb(), new xw(), new xw(), ((p10) this.i).zzb());
            case 4:
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new kn0(wxVar, (ScheduledExecutorService) this.f4752c.zzb(), (String) this.f4753d.zzb(), (ok0) this.e.zzb(), (Context) this.f4751b.zzb(), ((o60) this.f4754f).a(), (mk0) ((rr1) this.f4755g).zzb(), (od0) this.f4756h.zzb(), (cf0) this.i.zzb());
            case 5:
                return new mp0((String) ((tr1) this.f4754f).f11431a, (kp0) this.f4751b.zzb(), (Context) ((tr1) this.f4755g).f11431a, (hp0) ((rr1) this.f4756h).zzb(), (xp0) ((rr1) this.i).zzb(), ((u10) this.f4752c).a(), (of) this.f4753d.zzb(), (be0) this.e.zzb());
            default:
                return new pt0(((o10) this.f4752c).a(), ((u10) this.f4753d).a(), (ScheduledExecutorService) this.f4751b.zzb(), (fr0) ((rr1) this.e).zzb(), hq0.i(((n10) this.f4754f).f8511b.a()), (a) ((rr1) this.f4755g).zzb(), (at0) ((rr1) this.f4756h).zzb(), ((r10) this.i).a());
        }
    }

    public bb0(o10 o10Var, u10 u10Var, rr1 rr1Var, rr1 rr1Var2, n10 n10Var, rr1 rr1Var3, rr1 rr1Var4, r10 r10Var) {
        this.f4752c = o10Var;
        this.f4753d = u10Var;
        this.f4751b = rr1Var;
        this.e = rr1Var2;
        this.f4754f = n10Var;
        this.f4755g = rr1Var3;
        this.f4756h = rr1Var4;
        this.i = r10Var;
    }

    public bb0(o10 o10Var, rr1 rr1Var, v10 v10Var, o60 o60Var, rr1 rr1Var2, wr1 wr1Var, rr1 rr1Var3, rr1 rr1Var4) {
        this.f4752c = o10Var;
        this.f4753d = rr1Var;
        this.e = v10Var;
        this.f4754f = o60Var;
        this.f4751b = rr1Var2;
        this.f4755g = wr1Var;
        this.f4756h = rr1Var3;
        this.i = rr1Var4;
    }

    public bb0(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, o10 o10Var, u10 u10Var, rr1 rr1Var4, rr1 rr1Var5, p10 p10Var) {
        this.f4751b = rr1Var;
        this.f4752c = rr1Var2;
        this.f4753d = rr1Var3;
        this.e = o10Var;
        this.f4754f = u10Var;
        this.f4755g = rr1Var4;
        this.f4756h = rr1Var5;
        this.i = p10Var;
    }

    public bb0(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, rr1 rr1Var5, g50 g50Var, g50 g50Var2, rr1 rr1Var6) {
        this.f4751b = rr1Var;
        this.e = rr1Var2;
        this.f4752c = rr1Var3;
        this.f4754f = rr1Var4;
        this.f4753d = rr1Var5;
        this.f4755g = g50Var;
        this.f4756h = g50Var2;
        this.i = rr1Var6;
    }

    public bb0(tr1 tr1Var, rr1 rr1Var, tr1 tr1Var2, rr1 rr1Var2, rr1 rr1Var3, u10 u10Var, rr1 rr1Var4, rr1 rr1Var5) {
        this.f4754f = tr1Var;
        this.f4751b = rr1Var;
        this.f4755g = tr1Var2;
        this.f4756h = rr1Var2;
        this.i = rr1Var3;
        this.f4752c = u10Var;
        this.f4753d = rr1Var4;
        this.e = rr1Var5;
    }

    public bb0(wr1 wr1Var, wr1 wr1Var2, wr1 wr1Var3, rr1 rr1Var, o60 o60Var, rr1 rr1Var2, wr1 wr1Var4, wr1 wr1Var5) {
        this.f4752c = wr1Var;
        this.f4753d = wr1Var2;
        this.e = wr1Var3;
        this.f4751b = rr1Var;
        this.f4754f = o60Var;
        this.f4755g = rr1Var2;
        this.f4756h = wr1Var4;
        this.i = wr1Var5;
    }
}

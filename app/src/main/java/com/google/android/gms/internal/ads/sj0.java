package com.google.android.gms.internal.ads;
import g9.r;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class sj0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10623a;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f10624b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f10625c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f10626d;

    public /* synthetic */ sj0(wr1 wr1Var, wr1 wr1Var2, wr1 wr1Var3, int i) {
        this.f10623a = i;
        this.f10624b = wr1Var;
        this.f10625c = wr1Var2;
        this.f10626d = wr1Var3;
    }

    public ll0 a() {
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        return new ll0(wxVar, (od0) this.f10624b.zzb(), (af0) this.f10625c.zzb(), (xl0) this.f10626d.zzb(), 2);
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f10623a) {
            case 0:
                return new zd1(16, (gq0) this.f10624b.zzb(), (nd0) this.f10625c.zzb(), (be0) this.f10626d.zzb());
            case 1:
                return a();
            case 2:
                Context a10 = ((o10) this.f10624b).a();
                px pxVar = (px) this.f10625c.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f10626d.zzb();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new cm0(a10, pxVar, scheduledExecutorService, wxVar);
            case 3:
                qn0 hl0Var = new hl0(0, ((o10) ((kl0) this.f10624b).f7800a).a());
                qn0 qn0Var = (nm0) this.f10625c.zzb();
                if (true == ((List) this.f10626d.zzb()).contains("2")) {
                    hl0Var = qn0Var;
                }
                lo1.b(hl0Var);
                return hl0Var;
            case 4:
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                om0 om0Var = new om0(wxVar2, 2);
                nm0 nm0Var = (nm0) this.f10624b.zzb();
                List list = (List) this.f10625c.zzb();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f10626d.zzb();
                if (list.contains("24")) {
                    return new nl0(nm0Var, ((Integer) r.e.f17698c.a(sl.Fd)).intValue(), scheduledExecutorService2);
                }
                return new nl0(om0Var, ((Integer) r.e.f17698c.a(sl.Fd)).intValue(), scheduledExecutorService2);
            case 5:
                qn0 zzb = ((fn0) this.f10624b).zzb();
                qn0 qn0Var2 = (nm0) this.f10625c.zzb();
                if (true == ((List) this.f10626d.zzb()).contains("29")) {
                    zzb = qn0Var2;
                }
                lo1.b(zzb);
                return zzb;
            case 6:
                return new r01((Context) this.f10624b.zzb(), (rx0) this.f10625c.zzb(), (x11) this.f10626d.zzb());
            case 7:
                return new q01((Context) this.f10624b.zzb(), (ExecutorService) this.f10625c.zzb(), (ry0) this.f10626d.zzb());
            default:
                return new w11((h21) this.f10625c.zzb(), ((rx0) this.f10626d.zzb()).W().A());
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class l40 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7935a;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f7936b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f7937c;

    public /* synthetic */ l40(wr1 wr1Var, wr1 wr1Var2, int i) {
        this.f7935a = i;
        this.f7936b = wr1Var;
        this.f7937c = wr1Var2;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f7935a) {
            case 0:
                return new uw(((o10) this.f7936b).a(), ((o60) this.f7937c).a().f4583g);
            case 1:
                return new o50((q50) this.f7936b.zzb(), ((o60) this.f7937c).a());
            case 2:
                return new uw(((o10) this.f7936b).a(), ((o60) this.f7937c).a().f4583g);
            case 3:
                k9.r rVar = (k9.r) this.f7936b.zzb();
                la.a aVar = (la.a) this.f7937c.zzb();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new tb0(rVar, aVar, wxVar);
            case 4:
                return new ke0((he0) this.f7936b.zzb(), (y10) this.f7937c.zzb());
            case 5:
                return new dg0(((o10) this.f7936b).a(), (be0) this.f7937c.zzb());
            case 6:
                return new sg0(((o10) this.f7936b).a(), (ww) this.f7937c.zzb());
            case 7:
                return new nl0((nm0) this.f7936b.zzb(), ((Integer) g9.r.e.f17698c.a(sl.Ld)).intValue(), (ScheduledExecutorService) this.f7937c.zzb());
            case 8:
                return new nl0((nm0) this.f7936b.zzb(), ((Integer) g9.r.e.f17698c.a(sl.yd)).intValue(), (ScheduledExecutorService) this.f7937c.zzb());
            case 9:
                ww wwVar = (ww) this.f7936b.zzb();
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                return new rl0(3, wwVar, wxVar2, ((o10) this.f7937c).a());
            case 10:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f7936b.zzb();
                ((o10) this.f7937c).a();
                return new hl0(7, scheduledExecutorService);
            case 11:
                return new lq0(((o10) this.f7936b).a(), ((v10) this.f7937c).zzb());
            default:
                return new mr0(((o10) this.f7936b).a(), (ur0) this.f7937c.zzb());
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class tm0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11388a;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f11389b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f11390c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f11391d;
    public final wr1 e;

    public /* synthetic */ tm0(sr1 sr1Var, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, int i) {
        this.f11388a = i;
        this.f11389b = sr1Var;
        this.f11390c = rr1Var;
        this.f11391d = rr1Var2;
        this.e = rr1Var3;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f11388a) {
            case 0:
                am0 zzb = ((bm0) this.f11389b).zzb();
                nm0 nm0Var = (nm0) this.f11390c.zzb();
                List list = (List) this.f11391d.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.e.zzb();
                if (list.contains("10")) {
                    return new nl0(nm0Var, ((Integer) g9.r.e.f17698c.a(sl.Dd)).intValue(), scheduledExecutorService);
                }
                return new nl0(zzb, ((Integer) g9.r.e.f17698c.a(sl.Dd)).intValue(), scheduledExecutorService);
            case 1:
                am0 zzb2 = ((hm0) this.f11389b).zzb();
                nm0 nm0Var2 = (nm0) this.f11390c.zzb();
                List list2 = (List) this.f11391d.zzb();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.e.zzb();
                if (list2.contains("54")) {
                    return new nl0(nm0Var2, ((Integer) g9.r.e.f17698c.a(sl.Nd)).intValue(), scheduledExecutorService2);
                }
                return new nl0(zzb2, ((Integer) g9.r.e.f17698c.a(sl.Nd)).intValue(), scheduledExecutorService2);
            case 2:
                yl0 zzb3 = ((jm0) this.f11389b).zzb();
                nm0 nm0Var3 = (nm0) this.f11390c.zzb();
                List list3 = (List) this.f11391d.zzb();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.e.zzb();
                if (list3.contains("13")) {
                    return new nl0(nm0Var3, ((Integer) g9.r.e.f17698c.a(sl.Md)).intValue(), scheduledExecutorService3);
                }
                return new nl0(zzb3, ((Integer) g9.r.e.f17698c.a(sl.Md)).intValue(), scheduledExecutorService3);
            case 3:
                am0 zzb4 = ((ym0) this.f11389b).zzb();
                nm0 nm0Var4 = (nm0) this.f11390c.zzb();
                List list4 = (List) this.f11391d.zzb();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.e.zzb();
                if (list4.contains("60")) {
                    return new nl0(nm0Var4, ((Integer) g9.r.e.f17698c.a(sl.f10862ne)).intValue(), scheduledExecutorService4);
                }
                return new nl0(zzb4, ((Integer) g9.r.e.f17698c.a(sl.f10862ne)).intValue(), scheduledExecutorService4);
            case 4:
                ll0 zzb5 = ((nn0) this.f11389b).zzb();
                nm0 nm0Var5 = (nm0) this.f11390c.zzb();
                List list5 = (List) this.f11391d.zzb();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) this.e.zzb();
                if (list5.contains("35")) {
                    return new nl0(nm0Var5, ((Integer) g9.r.e.f17698c.a(sl.Ad)).intValue(), scheduledExecutorService5);
                }
                return new nl0(zzb5, ((Integer) g9.r.e.f17698c.a(sl.Ad)).intValue(), scheduledExecutorService5);
            default:
                yl0 zzb6 = ((un0) this.f11389b).zzb();
                nm0 nm0Var6 = (nm0) this.f11390c.zzb();
                List list6 = (List) this.f11391d.zzb();
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) this.e.zzb();
                if (list6.contains("39")) {
                    return new nl0(nm0Var6, ((Integer) g9.r.e.f17698c.a(sl.f11020xd)).intValue(), scheduledExecutorService6);
                }
                return new nl0(zzb6, ((Integer) g9.r.e.f17698c.a(sl.f11020xd)).intValue(), scheduledExecutorService6);
        }
    }
}

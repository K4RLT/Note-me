package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class je0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7424a;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f7425b;

    public /* synthetic */ je0(rr1 rr1Var, int i) {
        this.f7424a = i;
        this.f7425b = rr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f7424a) {
            case 0:
                ke0 ke0Var = (ke0) this.f7425b.zzb();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                Set j10 = v80.j(ke0Var, wxVar);
                lo1.b(j10);
                return j10;
            case 1:
                gf0 gf0Var = (gf0) this.f7425b.zzb();
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                return new c90(gf0Var, wxVar2);
            case 2:
                gf0 gf0Var2 = (gf0) this.f7425b.zzb();
                wx wxVar3 = xx.f12651a;
                lo1.b(wxVar3);
                return new c90(gf0Var2, wxVar3);
            case 3:
                gf0 gf0Var3 = (gf0) this.f7425b.zzb();
                wx wxVar4 = xx.f12651a;
                lo1.b(wxVar4);
                return new c90(gf0Var3, wxVar4);
            case 4:
                return new c90((dg0) this.f7425b.zzb(), xx.f12657h);
            case 5:
                return new c90((dg0) this.f7425b.zzb(), xx.f12657h);
            case 6:
                return new c90((dg0) this.f7425b.zzb(), xx.f12657h);
            case 7:
                Context context = (Context) this.f7425b.zzb();
                wx wxVar5 = xx.f12651a;
                lo1.b(wxVar5);
                return new lg0(context, wxVar5, 0);
            case 8:
                kh0 kh0Var = (kh0) this.f7425b.zzb();
                wx wxVar6 = xx.f12651a;
                lo1.b(wxVar6);
                return new c90(kh0Var, wxVar6);
            case 9:
                kh0 kh0Var2 = (kh0) this.f7425b.zzb();
                wx wxVar7 = xx.f12651a;
                lo1.b(wxVar7);
                return new c90(kh0Var2, wxVar7);
            case 10:
                return new hl0(6, (String) this.f7425b.zzb());
            case 11:
                return new cq0((of) this.f7425b.zzb());
            case 12:
                return new c90((lq0) this.f7425b.zzb(), xx.f12657h);
            case 13:
                ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.f7425b.zzb()));
                lo1.b(unconfigurableScheduledExecutorService);
                return unconfigurableScheduledExecutorService;
            case 14:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f7425b.zzb();
                wx wxVar8 = xx.f12651a;
                lo1.b(wxVar8);
                return new fr0(scheduledExecutorService, wxVar8);
            case 15:
                return new vs0((rh0) this.f7425b.zzb());
            case 16:
                return new hz0((h21) this.f7425b.zzb());
            default:
                return new d21();
        }
    }
}

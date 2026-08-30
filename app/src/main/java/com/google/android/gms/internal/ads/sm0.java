package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import k9.f0;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class sm0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11063a;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f11064b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f11065c;

    public sm0(rr1 rr1Var, r60 r60Var) {
        this.f11063a = 15;
        this.f11064b = rr1Var;
        this.f11065c = r60Var;
    }

    /* JADX WARN: Type inference failed for: r3v60, types: [com.google.android.gms.internal.ads.jr0, com.google.android.gms.internal.ads.um1] */
    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        Object obj;
        int i = this.f11063a;
        wr1 wr1Var = this.f11064b;
        wr1 wr1Var2 = this.f11065c;
        switch (i) {
            case 0:
                return new nl0(((hg0) wr1Var2).a(), ((Integer) r.e.f17698c.a(sl.Pd)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 1:
                return new nl0(((sj0) wr1Var2).a(), ((Integer) r.e.f17698c.a(sl.Rd)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 2:
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new nl0(new yl0(wxVar, ((o10) ((s20) wr1Var2).f10466b).a(), 0), ((Integer) r.e.f17698c.a(sl.Zd)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 3:
                return new nl0(new hl0(3, (qo0) ((pe0) wr1Var2).f9508b.f11431a), ((Integer) r.e.f17698c.a(sl.Kd)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 4:
                return new nl0(((k50) wr1Var2).a(), ((Integer) r.e.f17698c.a(sl.Sd)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 5:
                Context a10 = ((o10) ((um0) wr1Var2).f11686b).a();
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                return new nl0(new yl0(a10, wxVar2, 3), ((Integer) r.e.f17698c.a(sl.Jd)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 6:
                wx wxVar3 = xx.f12651a;
                lo1.b(wxVar3);
                yl0 yl0Var = new yl0(wxVar3, ((o10) ((um0) wr1Var2).f11686b).a(), 4);
                Context a11 = ((o10) wr1Var).a();
                if (((Boolean) r.e.f17698c.a(sl.Mc)).booleanValue()) {
                    f0 f0Var = k.C.f16813c;
                    if (f0.d(a11)) {
                        int i10 = j51.f7334w;
                        obj = new k51(yl0Var);
                        lo1.b(obj);
                        return obj;
                    }
                }
                int i11 = j51.f7334w;
                obj = e61.D;
                lo1.b(obj);
                return obj;
            case 7:
                wx wxVar4 = xx.f12651a;
                lo1.b(wxVar4);
                return new nl0(new pl0(wxVar4, ((ad0) wr1Var2).f4461b.a(), 1), ((Integer) r.e.f17698c.a(sl.Wd)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 8:
                wx wxVar5 = xx.f12651a;
                lo1.b(wxVar5);
                return new nl0(new am0(wxVar5, 3, (nf0) ((um0) wr1Var2).f11686b.zzb()), ((Integer) r.e.f17698c.a(sl.Hd)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 9:
                return new nl0(new hl0(4, (pp0) ((um0) wr1Var2).f11686b.zzb()), ((Integer) r.e.f17698c.a(sl.Xd)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 10:
                wx wxVar6 = xx.f12651a;
                lo1.b(wxVar6);
                return new nl0(new om0(((o10) ((um0) wr1Var2).f11686b).a(), wxVar6), ((Integer) r.e.f17698c.a(sl.Ed)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 11:
                wx wxVar7 = xx.f12651a;
                lo1.b(wxVar7);
                return new nl0(new am0(wxVar7, 4, (me0) ((um0) wr1Var2).f11686b.zzb()), ((Integer) r.e.f17698c.a(sl.Gd)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 12:
                return new nl0(((k50) wr1Var2).b(), ((Integer) r.e.f17698c.a(sl.Cd)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 13:
                l40 l40Var = (l40) wr1Var2;
                ww wwVar = (ww) l40Var.f7936b.zzb();
                wx wxVar8 = xx.f12651a;
                lo1.b(wxVar8);
                return new nl0(new rl0(3, wwVar, wxVar8, ((o10) l40Var.f7937c).a()), ((Integer) r.e.f17698c.a(sl.Bd)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 14:
                wx wxVar9 = xx.f12651a;
                lo1.b(wxVar9);
                return new nl0(new yl0(wxVar9, ((o10) ((um0) wr1Var2).f11686b).a(), 5), ((Integer) r.e.f17698c.a(sl.f11051zd)).intValue(), (ScheduledExecutorService) wr1Var.zzb());
            case 15:
                wx wxVar10 = xx.f12651a;
                lo1.b(wxVar10);
                return new kr0(wxVar10, (ScheduledExecutorService) wr1Var.zzb(), new um1(((r60) wr1Var2).f10128b.zzb()));
            default:
                return new x11((c21) ((rr1) wr1Var2).zzb(), ((xr1) wr1Var).zzb());
        }
    }

    public /* synthetic */ sm0(wr1 wr1Var, wr1 wr1Var2, int i) {
        this.f11063a = i;
        this.f11065c = wr1Var;
        this.f11064b = wr1Var2;
    }
}

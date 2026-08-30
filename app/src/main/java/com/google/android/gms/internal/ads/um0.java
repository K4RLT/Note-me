package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class um0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11685a;

    /* renamed from: b, reason: collision with root package name */
    public wr1 f11686b;

    public /* synthetic */ um0() {
        this.f11685a = 25;
    }

    public static void a(um0 um0Var, wr1 wr1Var) {
        if (um0Var.f11686b == null) {
            um0Var.f11686b = wr1Var;
        } else {
            g5.q.l();
        }
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        Object obj;
        switch (this.f11685a) {
            case 0:
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                om0 om0Var = new om0(wxVar, 0);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11686b.zzb();
                if (((Boolean) g9.r.e.f17698c.a(sl.X4)).booleanValue()) {
                    nl0 nl0Var = new nl0(om0Var, ((Integer) r3.f17698c.a(sl.Y4)).intValue(), scheduledExecutorService);
                    int i = j51.f7334w;
                    obj = new k51(nl0Var);
                } else {
                    int i10 = j51.f7334w;
                    obj = e61.D;
                }
                lo1.b(obj);
                return obj;
            case 1:
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                return new nl0(new om0(wxVar2, 1), ((Integer) g9.r.e.f17698c.a(sl.Id)).intValue(), (ScheduledExecutorService) this.f11686b.zzb());
            case 2:
                Context a10 = ((o10) this.f11686b).a();
                wx wxVar3 = xx.f12651a;
                lo1.b(wxVar3);
                return new yl0(a10, wxVar3, 3);
            case 3:
                wx wxVar4 = xx.f12651a;
                lo1.b(wxVar4);
                return new yl0(wxVar4, ((o10) this.f11686b).a(), 4);
            case 4:
                wx wxVar5 = xx.f12651a;
                lo1.b(wxVar5);
                return new am0(wxVar5, 3, (nf0) this.f11686b.zzb());
            case 5:
                return new hl0(4, (pp0) this.f11686b.zzb());
            case 6:
                wx wxVar6 = xx.f12651a;
                lo1.b(wxVar6);
                return new om0(((o10) this.f11686b).a(), wxVar6);
            case 7:
                wx wxVar7 = xx.f12651a;
                lo1.b(wxVar7);
                return new am0(wxVar7, 4, (me0) this.f11686b.zzb());
            case 8:
                wx wxVar8 = xx.f12651a;
                lo1.b(wxVar8);
                return new yl0(wxVar8, ((o10) this.f11686b).a(), 5);
            case 9:
                wx wxVar9 = xx.f12651a;
                lo1.b(wxVar9);
                ((o10) this.f11686b).a();
                return new om0(wxVar9, 4);
            case 10:
                return new jo0((mq0) this.f11686b.zzb());
            case 11:
                return new hp0((mq0) this.f11686b.zzb());
            case 12:
                return new ur0((vr0) this.f11686b.zzb());
            case 13:
                return new ur0((vr0) this.f11686b.zzb());
            case 14:
                return new File(new File((File) this.f11686b.zzb(), "drgd"), "pmtd.d");
            case 15:
                return new File(new File((File) this.f11686b.zzb(), "drgd"), "pcbc.d");
            case 16:
                return new File(new File((File) this.f11686b.zzb(), "drgd"), "pcam.jar.d");
            case 17:
                return new File(new File((File) this.f11686b.zzb(), "drgd"), "pmtd");
            case 18:
                return new File(new File(new File((File) this.f11686b.zzb(), "drgd"), "v"), "pcopt");
            case 19:
                return new File(new File((File) this.f11686b.zzb(), "drgd"), "pcbc");
            case 20:
                return new File(new File((File) this.f11686b.zzb(), "drgd"), "pcam.jar.tmp");
            case gl.zzm /* 21 */:
                return new File(new File(new File((File) this.f11686b.zzb(), "drgd"), "v"), "pcam.jar");
            case 22:
                return new File(new File((File) this.f11686b.zzb(), "ocs"), "pmtd");
            case 23:
                return new File(new File((File) this.f11686b.zzb(), "ocs"), "pcbc");
            case 24:
                return new File(new File((File) this.f11686b.zzb(), "ocs"), "pcam.jar");
            default:
                wr1 wr1Var = this.f11686b;
                if (wr1Var != null) {
                    return wr1Var.zzb();
                }
                g5.q.l();
                return null;
        }
    }

    public /* synthetic */ um0(wr1 wr1Var, int i) {
        this.f11685a = i;
        this.f11686b = wr1Var;
    }
}

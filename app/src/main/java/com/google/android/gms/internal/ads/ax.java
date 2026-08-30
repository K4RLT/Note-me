package com.google.android.gms.internal.ads;
import c2.b;
import g9.r;
import i0.m;
import la.a;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ax implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4621a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4622b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f4623c;

    public /* synthetic */ ax(Object obj, wr1 wr1Var, int i) {
        this.f4621a = i;
        this.f4622b = obj;
        this.f4623c = wr1Var;
    }

    public com.google.android.gms.internal.measurement.e4 a() {
        return new com.google.android.gms.internal.measurement.e4(7, new jh0(((o10) ((s20) this.f4622b).f10466b).a()), (wx) this.f4623c.zzb(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.u60, com.google.android.gms.internal.ads.um1] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.hc0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [com.google.android.gms.internal.ads.z70, com.google.android.gms.internal.ads.um1] */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.google.android.gms.internal.ads.mh0, b] */
    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        View view;
        switch (this.f4621a) {
            case 0:
                Context context = (Context) ((tr1) this.f4622b).f11431a;
                sw swVar = (sw) this.f4623c;
                return new zw(context, new x90((a) swVar.f11181c.f11431a, 5, (qw) swVar.f11180b.zzb()));
            case 1:
                return new m(5, ((ur1) this.f4622b).zzb(), ((ur1) this.f4623c).zzb(), false);
            case 2:
                return ((tw) this.f4622b).q(((xr1) this.f4623c).zzb());
            case 3:
                return new nl0(((rw) this.f4622b).c(), ((Integer) r.e.f17698c.a(sl.Td)).intValue(), (ScheduledExecutorService) this.f4623c.zzb());
            case 4:
                return new nl0(new hl0(2, ((ad0) this.f4622b).f4461b.a()), ((Integer) r.e.f17698c.a(sl.Yd)).intValue(), (ScheduledExecutorService) this.f4623c.zzb());
            case 5:
                return new nl0(((rw) this.f4622b).e(), ((Integer) r.e.f17698c.a(sl.Ud)).intValue(), (ScheduledExecutorService) this.f4623c.zzb());
            case 6:
                Boolean bool = (Boolean) r.e.f17698c.a(sl.B6);
                bool.booleanValue();
                boolean booleanValue = bool.booleanValue();
                nj0 c10 = ((g40) this.f4622b).c();
                fk0 b10 = ((gm) this.f4623c).b();
                if (true != booleanValue) {
                    return b10;
                }
                return c10;
            case 7:
                return new o40((h00) ((j40) this.f4622b).f7315b.f11473y, (Executor) this.f4623c.zzb());
            case 8:
                String str = (String) ((rr1) this.f4623c).zzb();
                ii0 ii0Var = (ii0) ((k60) this.f4622b).f7670f;
                if (ii0Var == null) {
                    return new ii0(str);
                }
                return ii0Var;
            case 9:
                ((o10) this.f4623c).a();
                Context context2 = (Context) ((k60) this.f4622b).f7666a;
                lo1.b(context2);
                return context2;
            case 10:
                Set zzb = ((xr1) this.f4623c).zzb();
                p80 p80Var = (p80) this.f4622b;
                if (p80Var.f9437p == null) {
                    p80Var.f9437p = new um1(zzb);
                }
                u60 u60Var = p80Var.f9437p;
                lo1.b(u60Var);
                return u60Var;
            case 11:
                return new m90((kd0) ((wr1) this.f4622b).zzb(), ((g50) this.f4623c).f6306b.x());
            case 12:
                Set p10 = ((com.google.android.gms.internal.measurement.e4) this.f4622b).p((a60) ((rr1) this.f4623c).zzb());
                lo1.b(p10);
                return p10;
            case 13:
                return new c90(new h40(1, (h00) ((com.google.android.gms.internal.measurement.e4) this.f4622b).f13729w), (Executor) this.f4623c.zzb());
            case 14:
                qp0 a10 = ((g50) this.f4622b).a();
                JSONObject jSONObject = (JSONObject) ((ea0) this.f4623c).f5627b.f11470v;
                lo1.b(jSONObject);
                return new sa0(a10, jSONObject);
            case 15:
                return new c90(new wc0(((ja0) this.f4622b).f7384b.a()), (Executor) this.f4623c.zzb());
            case 16:
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new hq0(wxVar, ((oa0) this.f4622b).a(), (zd0) ((rr1) this.f4623c).zzb(), 11, false);
            case 17:
                na0 na0Var = (na0) ((um0) this.f4622b).zzb();
                ra0 a11 = ((z20) this.f4623c).a();
                ph phVar = new ph("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                synchronized (a11) {
                    view = a11.f10177o;
                }
                phVar.f6667u = view;
                phVar.f6668v = a11.r();
                phVar.f6669w = na0Var;
                phVar.f6670x = false;
                phVar.f6671y = false;
                if (a11.h() != null) {
                    a11.h().n1(phVar);
                }
                return phVar;
            case 18:
                return new xc0((g70) ((rr1) this.f4622b).zzb(), ((g50) this.f4623c).a());
            case 19:
                return new od0(hq0.i(((n10) this.f4622b).f8511b.a()), (nd0) ((rr1) this.f4623c).zzb());
            case 20:
                return new td0((jj) ((rr1) this.f4622b).zzb(), ((ur1) this.f4623c).zzb());
            case gl.zzm /* 21 */:
                return new qe0((f20) ((tr1) this.f4622b).f11431a, new tf(23, (yp) ((pe0) this.f4623c).f9508b.f11431a));
            case 22:
                wx wxVar2 = xx.f12652b;
                lo1.b(wxVar2);
                wx wxVar3 = xx.f12651a;
                lo1.b(wxVar3);
                return new tw(wxVar2, wxVar3, new lg0((Context) ((je0) this.f4622b).f7425b.zzb(), wxVar3, 0), rr1.b((h30) this.f4623c), 16);
            case 23:
                Map map = ((vr1) this.f4622b).f9980a;
                wx wxVar4 = xx.f12651a;
                lo1.b(wxVar4);
                return new tg0(map, wxVar4, new um1(((r60) this.f4623c).f10128b.zzb()));
            case 24:
                wx wxVar5 = xx.f12651a;
                lo1.b(wxVar5);
                return new zd1(12, wxVar5, ((s20) this.f4622b).a(), rr1.b((h30) this.f4623c));
            case 25:
                return a();
            case 26:
                return new kh0(((r40) this.f4622b).b(), ((l10) this.f4623c).zzb());
            case 27:
                return new b(((ax) this.f4622b).a(), ((l10) this.f4623c).zzb());
            case 28:
                lh0 lh0Var = (lh0) ((rr1) this.f4622b).zzb();
                ax axVar = (ax) this.f4623c;
                return new td0(lh0Var, (mh0) new b(((ax) axVar.f4622b).a(), ((l10) axVar.f4623c).zzb()));
            default:
                xa0 xa0Var = (xa0) this.f4622b;
                wx wxVar6 = xx.f12651a;
                lo1.b(wxVar6);
                aq0 a12 = xa0Var.f12535b.a();
                return new nl0(new pl0(wxVar6, a12, 0), ((Integer) r.e.f17698c.a(sl.Qd)).intValue(), (ScheduledExecutorService) this.f4623c.zzb());
        }
    }
}
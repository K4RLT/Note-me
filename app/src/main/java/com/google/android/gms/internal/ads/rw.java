package com.google.android.gms.internal.ads;
import c7.a;
import f9.k;
import g9.r;
import k9.c0;
import k9.f0;
import l9.a;
import l9.l;
import la.a;
import t9.a;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rw implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10320a;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f10321b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f10322c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f10323d;

    public /* synthetic */ rw(wr1 wr1Var, wr1 wr1Var2, wr1 wr1Var3, int i) {
        this.f10320a = i;
        this.f10321b = wr1Var;
        this.f10322c = wr1Var2;
        this.f10323d = wr1Var3;
    }

    public p8 a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f10321b.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        wx wxVar2 = xx.f12652b;
        lo1.b(wxVar2);
        Context a10 = ((o10) ((s20) this.f10322c).f10466b).a();
        lo1.b(wxVar);
        return new p8(scheduledExecutorService, wxVar, wxVar2, new lg0(a10, wxVar, 1), rr1.b((h30) this.f10323d), 3);
    }

    public tw b() {
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        ac0 a10 = ((oa0) this.f10321b).a();
        ax axVar = (ax) this.f10322c;
        lo1.b(wxVar);
        return new tw(wxVar, a10, new hq0(wxVar, ((oa0) axVar.f4622b).a(), (zd0) ((rr1) axVar.f4623c).zzb(), 11, false), (zd0) ((rr1) this.f10323d).zzb(), 13);
    }

    public ll0 c() {
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        return new ll0(wxVar, ((o10) this.f10321b).a(), ((o60) this.f10322c).a(), (ViewGroup) ((lx0) ((z20) this.f10323d).f13051b).f8177v, 0);
    }

    public rl0 d() {
        lo1.b(((dv) ((do0) this.f10321b).f5468b.f4003w).f5529x);
        px pxVar = (px) this.f10322c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f10323d.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        return new rl0(pxVar, scheduledExecutorService, wxVar);
    }

    public ll0 e() {
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        return new ll0(wxVar, (ViewGroup) ((lx0) ((z20) this.f10321b).f13051b).f8177v, (Context) ((rr1) this.f10322c).zzb(), ((xr1) this.f10323d).zzb());
    }

    public ll0 f() {
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        return new ll0(wxVar, ((o10) this.f10321b).a(), (ag0) ((rr1) this.f10322c).zzb(), (String) ((rr1) this.f10323d).zzb(), 8);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [com.google.android.gms.internal.ads.x60, com.google.android.gms.internal.ads.um1] */
    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        Set set;
        switch (this.f10320a) {
            case 0:
                c0 c0Var = (c0) ((tr1) this.f10322c).f11431a;
                return new qw(c0Var);
            case 1:
                a a10 = ((u10) this.f10321b).a();
                JSONObject jSONObject = (JSONObject) ((rr1) this.f10322c).zzb();
                String str = (String) ((sr1) this.f10323d).zzb();
                boolean equals = "native".equals(str);
                f0 f0Var = k.C.f16813c;
                return new yh(UUID.randomUUID().toString(), a10, str, jSONObject, equals);
            case 2:
                return new n40((h00) ((j40) this.f10321b).f7315b.f11473y, (be0) this.f10322c.zzb(), ((g50) this.f10323d).a());
            case 3:
                Context context = (Context) this.f10321b.zzb();
                a a11 = ((u10) this.f10322c).a();
                qp0 a12 = ((g50) this.f10323d).a();
                nw nwVar = a12.A;
                String str2 = null;
                if (nwVar == null) {
                    return null;
                }
                up0 up0Var = a12.f9956s;
                if (up0Var != null) {
                    str2 = up0Var.f11696b;
                }
                return new mw(context, a11, nwVar, str2);
            case 4:
                um1 um1Var = new um1(((r60) this.f10321b).f10128b.zzb());
                Set zzb = ((xr1) this.f10322c).zzb();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new y60(um1Var, zzb, wxVar, (ScheduledExecutorService) this.f10323d.zzb());
            case 5:
                return new s70(((xr1) this.f10321b).zzb(), ((g50) this.f10322c).a(), ((g50) this.f10323d).b());
            case 6:
                return new d90((Context) this.f10321b.zzb(), ((xr1) this.f10322c).zzb(), ((g50) this.f10323d).a());
            case 7:
                ra0 a13 = ((z20) this.f10321b).a();
                sa0 sa0Var = (sa0) ((fa0) this.f10322c).f6000b.zzb();
                lo1.b(sa0Var);
                Executor executor = (Executor) this.f10323d.zzb();
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                return new nb0(a13, sa0Var, executor, wxVar2);
            case 8:
                return b();
            case 9:
                int i = ((o60) this.f10323d).a().f4591p.f2825v;
                if (i != 0) {
                    if (i - 1 != 0) {
                        return ((gm) this.f10322c).b();
                    }
                    return ((gm) this.f10321b).b();
                }
                throw null;
            case 10:
                String str3 = ((dv) ((do0) this.f10321b).f5468b.f4003w).B;
                lo1.b(str3);
                Context a14 = ((o10) this.f10322c).a();
                wx wxVar3 = xx.f12651a;
                lo1.b(wxVar3);
                Map zzb2 = ((ur1) this.f10323d).zzb();
                if (((Boolean) r.e.f17698c.a(sl.f10665b6)).booleanValue()) {
                    jj jjVar = new jj(new mf(a14, 3));
                    synchronized (jjVar) {
                        if (jjVar.f7452c) {
                            try {
                                fl flVar = jjVar.f7451b;
                                flVar.b();
                                ((gl) flVar.f4845v).A(str3);
                            } catch (NullPointerException e) {
                                k.C.f16817h.d("AdMobClearcutLogger.modify", e);
                            }
                        }
                    }
                    set = Collections.singleton(new c90(new td0(jjVar, zzb2), wxVar3));
                } else {
                    set = Collections.EMPTY_SET;
                }
                lo1.b(set);
                return set;
            case 11:
                wx wxVar4 = xx.f12651a;
                lo1.b(wxVar4);
                return new fe0(wxVar4, (l) this.f10321b.zzb(), ((a) this.f10322c).zzb(), new a(9), ((o10) this.f10323d).a());
            case 12:
                Context a15 = ((o10) this.f10321b).a();
                WeakReference weakReference = (WeakReference) ((m10) this.f10322c).f8202b.e;
                lo1.b(weakReference);
                qf0 qf0Var = (qf0) ((rr1) this.f10323d).zzb();
                wx wxVar5 = xx.f12651a;
                lo1.b(wxVar5);
                return new wf0(a15, weakReference, qf0Var, wxVar5);
            case 13:
                return a();
            case 14:
                return c();
            case 15:
                n10 n10Var = (n10) this.f10321b;
                wx wxVar6 = xx.f12651a;
                lo1.b(wxVar6);
                yl0 yl0Var = new yl0(wxVar6, n10Var.f8511b.a(), 2);
                a aVar = (a) ((rr1) this.f10322c).zzb();
                lo1.b(wxVar6);
                return new nm0(yl0Var, ((Long) nm.f8759c.p()).longValue(), aVar, wxVar6, (be0) ((rr1) this.f10323d).zzb());
            case 16:
                Context a16 = ((n10) this.f10321b).f8511b.a();
                wx wxVar7 = xx.f12651a;
                lo1.b(wxVar7);
                yl0 yl0Var2 = new yl0(a16, wxVar7, 6);
                a aVar2 = (a) ((rr1) this.f10322c).zzb();
                lo1.b(wxVar7);
                return new nm0(yl0Var2, 2147483647L, aVar2, wxVar7, (be0) ((rr1) this.f10323d).zzb());
            case 17:
                ll0 f10 = ((rw) this.f10321b).f();
                a aVar3 = (a) ((rr1) this.f10322c).zzb();
                wx wxVar8 = xx.f12651a;
                lo1.b(wxVar8);
                return new nm0(f10, ((Long) nm.f8760d.p()).longValue(), aVar3, wxVar8, (be0) ((rr1) this.f10323d).zzb());
            case 18:
                hl0 hl0Var = new hl0(0, ((o10) ((kl0) this.f10321b).f7800a).a());
                a aVar4 = (a) ((rr1) this.f10322c).zzb();
                wx wxVar9 = xx.f12651a;
                lo1.b(wxVar9);
                return new nm0(hl0Var, 2147483647L, aVar4, wxVar9, (be0) ((rr1) this.f10323d).zzb());
            case 19:
                am0 zzb3 = ((bm0) this.f10321b).zzb();
                a aVar5 = (a) ((rr1) this.f10322c).zzb();
                wx wxVar10 = xx.f12651a;
                lo1.b(wxVar10);
                return new nm0(zzb3, ((Long) nm.f8757a.p()).longValue(), aVar5, wxVar10, (be0) ((rr1) this.f10323d).zzb());
            case 20:
                am0 zzb4 = ((hm0) this.f10321b).zzb();
                a aVar6 = (a) ((rr1) this.f10322c).zzb();
                wx wxVar11 = xx.f12651a;
                lo1.b(wxVar11);
                return new nm0(zzb4, 2147483647L, aVar6, wxVar11, (be0) ((rr1) this.f10323d).zzb());
            case gl.zzm /* 21 */:
                yl0 zzb5 = ((jm0) this.f10321b).zzb();
                a aVar7 = (a) ((rr1) this.f10322c).zzb();
                wx wxVar12 = xx.f12651a;
                lo1.b(wxVar12);
                return new nm0(zzb5, ((Long) nm.f8758b.p()).longValue(), aVar7, wxVar12, (be0) ((rr1) this.f10323d).zzb());
            case 22:
                am0 zzb6 = ((ym0) this.f10321b).zzb();
                a aVar8 = (a) ((rr1) this.f10322c).zzb();
                wx wxVar13 = xx.f12651a;
                lo1.b(wxVar13);
                return new nm0(zzb6, ((Long) nm.e.p()).longValue(), aVar8, wxVar13, (be0) ((rr1) this.f10323d).zzb());
            case 23:
                rl0 zzb7 = ((fn0) this.f10321b).zzb();
                a aVar9 = (a) ((rr1) this.f10322c).zzb();
                wx wxVar14 = xx.f12651a;
                lo1.b(wxVar14);
                return new nm0(zzb7, 2147483647L, aVar9, wxVar14, (be0) ((rr1) this.f10323d).zzb());
            case 24:
                ll0 zzb8 = ((nn0) this.f10321b).zzb();
                a aVar10 = (a) ((rr1) this.f10322c).zzb();
                wx wxVar15 = xx.f12651a;
                lo1.b(wxVar15);
                return new nm0(zzb8, ((Long) nm.f8762g.p()).longValue(), aVar10, wxVar15, (be0) ((rr1) this.f10323d).zzb());
            case 25:
                yl0 zzb9 = ((un0) this.f10321b).zzb();
                a aVar11 = (a) ((rr1) this.f10322c).zzb();
                wx wxVar16 = xx.f12651a;
                lo1.b(wxVar16);
                return new nm0(zzb9, ((Long) nm.f8763h.p()).longValue(), aVar11, wxVar16, (be0) ((rr1) this.f10323d).zzb());
            case 26:
                return e();
            case 27:
                return f();
            case 28:
                return d();
            default:
                return new op0((kp0) ((rr1) this.f10321b).zzb(), (hp0) ((rr1) this.f10322c).zzb(), (xp0) ((rr1) this.f10323d).zzb());
        }
    }
}
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z20 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13050a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13051b;

    public /* synthetic */ z20(int i, Object obj) {
        this.f13050a = i;
        this.f13051b = obj;
    }

    public ra0 a() {
        ra0 ra0Var = (ra0) ((tf) this.f13051b).f11339v;
        lo1.b(ra0Var);
        return ra0Var;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [y3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [com.google.android.gms.internal.ads.pa0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.mh0, c2.b] */
    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        Object obj;
        Set set;
        Set set2;
        int i = this.f13050a;
        te.c cVar = null;
        int i10 = 5;
        int i11 = 3;
        int i12 = 23;
        int i13 = 8;
        Object obj2 = this.f13051b;
        switch (i) {
            case 0:
                return new y20(0, new ju0(((o10) ((s20) obj2).f10466b).a()));
            case 1:
                return (ViewGroup) ((lx0) obj2).f8177v;
            case 2:
                return ((g40) obj2).a();
            case 3:
                rw rwVar = (rw) obj2;
                return new c90(new n40((h00) ((j40) rwVar.f10321b).f7315b.f11473y, (be0) rwVar.f10322c.zzb(), ((g50) rwVar.f10323d).a()), xx.f12651a);
            case 4:
                ax axVar = (ax) obj2;
                o40 o40Var = new o40((h00) ((j40) axVar.f4622b).f7315b.f11473y, (Executor) axVar.f4623c.zzb());
                if (((Boolean) g9.r.e.f17698c.a(sl.f10673be)).booleanValue()) {
                    c90 c90Var = new c90(o40Var, xx.f12651a);
                    int i14 = j51.f7334w;
                    obj = new k51(c90Var);
                } else {
                    int i15 = j51.f7334w;
                    obj = e61.D;
                }
                lo1.b(obj);
                return obj;
            case 5:
                return ((w50) obj2).a();
            case 6:
                l40 l40Var = (l40) obj2;
                return new x40(new uw(((o10) l40Var.f7936b).a(), ((o60) l40Var.f7937c).a().f4583g));
            case 7:
                return new a50(((ur1) obj2).zzb());
            case 8:
                return new c60(((g50) obj2).b());
            case 9:
                return (x90) obj2;
            case 10:
                wa0 wa0Var = (wa0) ((z90) obj2).f13125a.f12502v;
                lo1.b(wa0Var);
                if (wa0Var.f12201d != null) {
                    set = Collections.singleton("banner");
                } else {
                    set = Collections.EMPTY_SET;
                }
                lo1.b(set);
                return set;
            case 11:
                sa0 sa0Var = (sa0) ((fa0) obj2).f6000b.zzb();
                lo1.b(sa0Var);
                JSONObject jSONObject = sa0Var.f10575b;
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject(sa0Var.f11300a.f9970z);
                    } catch (JSONException unused) {
                        return null;
                    }
                }
                return jSONObject;
            case 12:
                ha0 ha0Var = new ha0(((ja0) obj2).f7384b.a());
                Object obj3 = new Object();
                obj3.f9451a = ha0Var;
                return obj3;
            case 13:
                ra0 ra0Var = (ra0) ((tf) obj2).f11339v;
                lo1.b(ra0Var);
                return ra0Var;
            case 14:
                return new e30(1, (h00) ((sr1) obj2).zzb());
            case 15:
                return new c90(new e30(1, (h00) ((sr1) ((z20) obj2).f13051b).zzb()), xx.f12655f);
            case 16:
                g10 g10Var = (g10) obj2;
                y3.f fVar = (y3.f) g10Var.f6253b.zzb();
                ExecutorService executorService = xx.f12656g;
                lo1.b(executorService);
                return new kd0(new gx0(fVar, new to0(3, executorService), (ld0) g10Var.f6254c.zzb(), new ho0(9, (byte) 0)));
            case 17:
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                ax axVar2 = (ax) obj2;
                td0 td0Var = new td0((jj) ((rr1) axVar2.f4622b).zzb(), ((ur1) axVar2.f4623c).zzb());
                if (((Boolean) g9.r.e.f17698c.a(sl.f10665b6)).booleanValue()) {
                    set2 = Collections.singleton(new c90(td0Var, wxVar));
                } else {
                    set2 = Collections.EMPTY_SET;
                }
                lo1.b(set2);
                return set2;
            case 18:
                l40 l40Var2 = (l40) obj2;
                sg0 sg0Var = new sg0(((o10) l40Var2.f7936b).a(), (ww) l40Var2.f7937c.zzb());
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                return new c90(sg0Var, wxVar2);
            case 19:
                ax axVar3 = (ax) obj2;
                lh0 lh0Var = (lh0) ((rr1) axVar3.f4622b).zzb();
                ax axVar4 = (ax) axVar3.f4623c;
                td0 td0Var2 = new td0(lh0Var, (mh0) new c2.b(((ax) axVar4.f4622b).a(), ((l10) axVar4.f4623c).zzb()));
                wx wxVar3 = xx.f12651a;
                lo1.b(wxVar3);
                return new c90(td0Var2, wxVar3);
            case 20:
                return new hl0(5, (Bundle) ((m60) obj2).f8269b.f7668c);
            case gl.zzm /* 21 */:
                lo1.b(xx.f12651a);
                lo1.b(((dv) ((do0) obj2).f5468b.f4003w).f5529x);
                return new Object();
            case 22:
                final Context context = (Context) ((m10) obj2).f8202b.f7600c;
                lo1.b(context);
                ExecutorService executorService2 = xx.f12656g;
                lo1.b(executorService2);
                rw0 rw0Var = rw0.f10324a;
                uf.c b10 = pf.b0.b(new pf.x0(executorService2));
                return new y3.z(new df.a() { // from class: com.google.android.gms.internal.ads.sw0
                    @Override // df.a
                    public final Object invoke() {
                        Context context2 = context;
                        context2.getClass();
                        return new File(context2.getApplicationContext().getFilesDir(), kotlin.jvm.internal.l.f("ad_quality_data.pb", "datastore/"));
                    }
                }, rw0Var, qe.m.g(new l5.a(qe.s.f24023u, cVar, i12)), new Object(), b10);
            case 23:
                wy0 wy0Var = (wy0) ((rr1) new tw((o80) ((zq0) ((sx0) obj2).zzb()).f13255v).f11472x).zzb();
                lo1.b(wy0Var);
                return wy0Var;
            case 24:
                o80 o80Var = (o80) ((lt0) ((sx0) obj2).zzb()).f8135v;
                tr1 tr1Var = (tr1) o80Var.f9021b;
                tr1 tr1Var2 = (tr1) o80Var.f9023d;
                int i16 = 7;
                rr1 a10 = rr1.a(new sj0(tr1Var, tr1Var2, (rr1) o80Var.f9026h, i16));
                rr1 a11 = rr1.a(new s30(tr1Var, a10, 13));
                rr1 rr1Var = (rr1) o80Var.i;
                rr1 rr1Var2 = (rr1) o80Var.f9022c;
                tr1 tr1Var3 = (tr1) o80Var.e;
                rr1 a12 = rr1.a(new ga0(a11, rr1Var, rr1Var2, tr1Var3, 1));
                rr1 rr1Var3 = (rr1) o80Var.f9031n;
                rr1 a13 = rr1.a(new um0(rr1Var3, 17));
                rr1 rr1Var4 = (rr1) o80Var.f9032o;
                rr1 a14 = rr1.a(new s01(rr1.a(new bf0(rr1.a(new im(a13, rr1Var4, rr1Var, 6)), rr1.a(new im(rr1.a(new um0(rr1Var3, 19)), rr1Var4, rr1Var, i16)), rr1.a(new im(rr1.a(new um0(rr1Var3, 21)), rr1Var4, rr1Var, i13)), rr1.a(new im(rr1.a(new um0(rr1Var3, 14)), rr1Var4, rr1Var, i11)), rr1.a(new im(rr1.a(new um0(rr1Var3, 15)), rr1Var4, rr1Var, 4)), rr1.a(new im(rr1.a(new um0(rr1Var3, 16)), rr1Var4, rr1Var, i10)), rr1.a(new um0(rr1Var3, 18)), tr1Var2, rr1Var)), rr1.a(new im(rr1.a(new im(a11, rr1Var, tr1Var)), tr1Var2, rr1Var, 9)), tr1Var3, 1));
                rr1 a15 = rr1.a(new um0(rr1Var3, 20));
                rr1 a16 = rr1.a(ed1.J);
                wy0 wy0Var2 = (wy0) rr1.a(new gm(rr1.a(new h30(a12, rr1.a(new w50(tr1Var, a11, a14, rr1Var, tr1Var2, rr1.a(new s01(a15, a16, rr1Var, 0)), a10)), a14, rr1Var, (rr1) o80Var.f9024f, tr1Var3)), rr1.a(new v30(rr1.a(new v30(tr1Var, rr1.a(new sj0(tr1Var, tr1Var3, (rr1) o80Var.f9028k, 6)), a10, tr1Var3, a16)), a14, a12, rr1Var, tr1Var2, 2)), a14, tr1Var3, 18)).zzb();
                lo1.b(wy0Var2);
                return wy0Var2;
            default:
                o80 o80Var2 = (o80) ((to0) ((sx0) obj2).zzb()).f11406v;
                rr1 rr1Var5 = (rr1) o80Var2.f9022c;
                rr1 rr1Var6 = (rr1) o80Var2.i;
                tr1 tr1Var4 = (tr1) o80Var2.e;
                rr1 a17 = rr1.a(new sj0(rr1Var5, rr1Var6, tr1Var4, i13));
                rr1 a18 = rr1.a(an1.I);
                tr1 tr1Var5 = (tr1) o80Var2.f9021b;
                tr1 tr1Var6 = (tr1) o80Var2.f9023d;
                rr1 a19 = rr1.a(new h30(tr1Var5, tr1Var6, tr1Var4, (rr1) o80Var2.f9025g, rr1Var6, a18));
                rr1 rr1Var7 = (rr1) o80Var2.f9031n;
                rr1 a20 = rr1.a(new um0(rr1Var7, 22));
                rr1 rr1Var8 = (rr1) o80Var2.f9032o;
                rr1 a21 = rr1.a(new v30(rr1.a(new im(a20, rr1Var8, rr1Var6, 10)), rr1.a(new im(rr1.a(new um0(rr1Var7, i12)), rr1Var8, rr1Var6, 11)), rr1.a(new im(rr1.a(new um0(rr1Var7, 24)), rr1Var8, rr1Var6, 12)), tr1Var6, rr1Var6, 3));
                wy0 wy0Var3 = (wy0) rr1.a(new gm(rr1.a(new h30(a17, a19, a21, rr1Var6, (rr1) o80Var2.f9024f, tr1Var4)), rr1.a(new w50((rr1) o80Var2.f9026h, a17, a21, (rr1) o80Var2.f9028k, rr1Var6, tr1Var4, tr1Var6)), a21, tr1Var4, 18)).zzb();
                lo1.b(wy0Var3);
                return wy0Var3;
        }
    }
}

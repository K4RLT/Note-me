package com.google.android.gms.internal.ads;
import g9.r;
import i0.m;
import l9.a;
import r.e;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j50 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7324a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f7325b;

    /* renamed from: c, reason: collision with root package name */
    public final rr1 f7326c;

    /* renamed from: d, reason: collision with root package name */
    public final rr1 f7327d;
    public final wr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final wr1 f7328f;

    /* renamed from: g, reason: collision with root package name */
    public final wr1 f7329g;

    /* renamed from: h, reason: collision with root package name */
    public final wr1 f7330h;
    public final wr1 i;

    /* renamed from: j, reason: collision with root package name */
    public final wr1 f7331j;

    /* renamed from: k, reason: collision with root package name */
    public final wr1 f7332k;

    /* renamed from: l, reason: collision with root package name */
    public final wr1 f7333l;

    public j50(g40 g40Var, o60 o60Var, rr1 rr1Var, ax axVar, vj0 vj0Var, rr1 rr1Var2, tr1 tr1Var, ax axVar2, j50 j50Var, ax axVar3, rr1 rr1Var3) {
        this.e = g40Var;
        this.f7328f = o60Var;
        this.f7325b = rr1Var;
        this.f7329g = axVar;
        this.f7330h = vj0Var;
        this.f7326c = rr1Var2;
        this.i = tr1Var;
        this.f7331j = axVar2;
        this.f7332k = j50Var;
        this.f7333l = axVar3;
        this.f7327d = rr1Var3;
    }

    public hb a() {
        return new hb(((g50) this.e).b(), ((g50) this.f7328f).a(), (e70) this.f7325b.zzb(), (j70) this.f7329g.zzb(), ((r80) this.f7330h).f10147a.f9436o, ((r40) this.i).a(), (c80) this.f7326c.zzb(), new um1(((r60) this.f7331j).f10128b.zzb()), (a90) this.f7327d.zzb(), (c60) ((rr1) this.f7332k).zzb(), (me0) this.f7333l.zzb());
    }

    public i60 b() {
        kr0 kr0Var = (kr0) this.f7325b.zzb();
        l9.a a10 = ((u10) this.e).a();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f7329g.zzb();
        String packageName = ((o10) ((s20) this.f7330h).f10466b).a().getPackageName();
        lo1.b(packageName);
        nl nlVar = sl.f10642a;
        return new i60(kr0Var, a10, applicationInfo, packageName, g9.r.e.f17696a.F(), (PackageInfo) this.i.zzb(), rr1.b(this.f7326c), ((l10) this.f7331j).zzb(), (String) this.f7327d.zzb(), ((ee0) this.f7332k).a(), ((o60) this.f7328f).a(), (l80) ((rr1) this.f7333l).zzb());
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.android.gms.internal.ads.z70, com.google.android.gms.internal.ads.um1] */
    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f7324a) {
            case 0:
                kg0 b10 = ((g40) this.e).b();
                aq0 a10 = ((o60) this.f7328f).a();
                kr0 kr0Var = (kr0) this.f7325b.zzb();
                ax axVar = (ax) this.f7329g;
                i0.m mVar = new i0.m(5, ((ur1) axVar.f4622b).zzb(), ((ur1) axVar.f4623c).zzb(), false);
                uj0 a11 = ((vj0) this.f7330h).a();
                j80 j80Var = (j80) this.f7326c.zzb();
                wp0 wp0Var = (wp0) ((tr1) this.i).f11431a;
                ax axVar2 = (ax) this.f7331j;
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                zd1 zd1Var = new zd1(12, wxVar, ((s20) axVar2.f4622b).a(), rr1.b((h30) axVar2.f4623c));
                i60 b11 = ((j50) this.f7332k).b();
                lo1.b(wxVar);
                ax axVar3 = (ax) this.f7333l;
                Map map = ((vr1) axVar3.f4622b).f9980a;
                lo1.b(wxVar);
                return new i50(b10, a10, kr0Var, mVar, a11, j80Var, wp0Var, zd1Var, b11, wxVar, new tg0(map, wxVar, new um1(((r60) axVar3.f4623c).f10128b.zzb())), (ii0) this.f7327d.zzb());
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return new ob0((ds) ((pb0) this.e).f9456b.f13144x, (es) ((pb0) this.f7329g).f9456b.f13143w, (gs) ((pb0) this.f7330h).f9456b.f13142v, (a70) this.f7325b.zzb(), (u70) this.f7326c.zzb(), (q60) this.f7327d.zzb(), (e90) ((rr1) this.i).zzb(), (Context) this.f7331j.zzb(), ((g50) this.f7332k).a(), ((u10) this.f7333l).a(), ((o60) this.f7328f).a());
            case 4:
                return new fc0(((o60) this.f7328f).a(), (Executor) this.e.zzb(), (gd0) this.f7325b.zzb(), (Context) this.f7326c.zzb(), (be0) this.f7329g.zzb(), (xs0) this.f7330h.zzb(), (rh0) this.i.zzb(), (vc0) this.f7327d.zzb(), (zd0) ((rr1) this.f7331j).zzb(), (me0) this.f7332k.zzb(), (b60) this.f7333l.zzb());
            case 5:
                Context context = (Context) this.f7325b.zzb();
                of ofVar = (of) this.e.zzb();
                hm hmVar = (hm) this.f7326c.zzb();
                l9.a a12 = ((u10) this.f7328f).a();
                fp fpVar = ((m20) this.f7329g).f8210a;
                return new gd0(context, ofVar, hmVar, a12, m20.a(), (jj) this.f7327d.zzb(), (x70) ((sr1) this.f7330h).zzb(), (wh0) this.i.zzb(), (cq0) this.f7331j.zzb(), (be0) this.f7332k.zzb(), (c10) this.f7333l.zzb());
            default:
                return new yj0((q60) this.f7325b.zzb(), (e90) this.f7326c.zzb(), (a70) this.f7327d.zzb(), (g70) ((rr1) this.e).zzb(), (j70) ((rr1) this.f7328f).zzb(), (y60) ((rr1) this.f7329g).zzb(), (h80) this.f7330h.zzb(), (l90) ((rr1) this.i).zzb(), (r70) ((rr1) this.f7331j).zzb(), (i90) ((rr1) this.f7332k).zzb(), (f80) ((rr1) this.f7333l).zzb());
        }
    }

    public j50(g50 g50Var, g50 g50Var2, rr1 rr1Var, wr1 wr1Var, r80 r80Var, r40 r40Var, rr1 rr1Var2, r60 r60Var, rr1 rr1Var3, rr1 rr1Var4, rr1 rr1Var5) {
        this.e = g50Var;
        this.f7328f = g50Var2;
        this.f7325b = rr1Var;
        this.f7329g = wr1Var;
        this.f7330h = r80Var;
        this.i = r40Var;
        this.f7326c = rr1Var2;
        this.f7331j = r60Var;
        this.f7327d = rr1Var3;
        this.f7332k = rr1Var4;
        this.f7333l = rr1Var5;
    }

    public j50(o60 o60Var, wr1 wr1Var, rr1 rr1Var, rr1 rr1Var2, wr1 wr1Var2, wr1 wr1Var3, wr1 wr1Var4, rr1 rr1Var3, rr1 rr1Var4, wr1 wr1Var5, wr1 wr1Var6) {
        this.f7328f = o60Var;
        this.e = wr1Var;
        this.f7325b = rr1Var;
        this.f7326c = rr1Var2;
        this.f7329g = wr1Var2;
        this.f7330h = wr1Var3;
        this.i = wr1Var4;
        this.f7327d = rr1Var3;
        this.f7331j = rr1Var4;
        this.f7332k = wr1Var5;
        this.f7333l = wr1Var6;
    }

    public j50(pb0 pb0Var, pb0 pb0Var2, pb0 pb0Var3, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, rr1 rr1Var5, g50 g50Var, u10 u10Var, o60 o60Var) {
        this.e = pb0Var;
        this.f7329g = pb0Var2;
        this.f7330h = pb0Var3;
        this.f7325b = rr1Var;
        this.f7326c = rr1Var2;
        this.f7327d = rr1Var3;
        this.i = rr1Var4;
        this.f7331j = rr1Var5;
        this.f7332k = g50Var;
        this.f7333l = u10Var;
        this.f7328f = o60Var;
    }

    public j50(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, rr1 rr1Var5, rr1 rr1Var6, rr1 rr1Var7, rr1 rr1Var8, rr1 rr1Var9, rr1 rr1Var10, rr1 rr1Var11) {
        this.f7325b = rr1Var;
        this.f7326c = rr1Var2;
        this.f7327d = rr1Var3;
        this.e = rr1Var4;
        this.f7328f = rr1Var5;
        this.f7329g = rr1Var6;
        this.f7330h = rr1Var7;
        this.i = rr1Var8;
        this.f7331j = rr1Var9;
        this.f7332k = rr1Var10;
        this.f7333l = rr1Var11;
    }

    public j50(rr1 rr1Var, wr1 wr1Var, rr1 rr1Var2, wr1 wr1Var2, wr1 wr1Var3, rr1 rr1Var3, sr1 sr1Var, wr1 wr1Var4, wr1 wr1Var5, wr1 wr1Var6, wr1 wr1Var7) {
        this.f7325b = rr1Var;
        this.e = wr1Var;
        this.f7326c = rr1Var2;
        this.f7328f = wr1Var2;
        this.f7329g = wr1Var3;
        this.f7327d = rr1Var3;
        this.f7330h = sr1Var;
        this.i = wr1Var4;
        this.f7331j = wr1Var5;
        this.f7332k = wr1Var6;
        this.f7333l = wr1Var7;
    }

    public j50(rr1 rr1Var, wr1 wr1Var, wr1 wr1Var2, s20 s20Var, wr1 wr1Var3, rr1 rr1Var2, wr1 wr1Var4, rr1 rr1Var3, ee0 ee0Var, o60 o60Var, rr1 rr1Var4) {
        this.f7325b = rr1Var;
        this.e = wr1Var;
        this.f7329g = wr1Var2;
        this.f7330h = s20Var;
        this.i = wr1Var3;
        this.f7326c = rr1Var2;
        this.f7331j = wr1Var4;
        this.f7327d = rr1Var3;
        this.f7332k = ee0Var;
        this.f7328f = o60Var;
        this.f7333l = rr1Var4;
    }
}

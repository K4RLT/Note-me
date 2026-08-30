package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class oa0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9050a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f9051b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f9052c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f9053d;
    public final wr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final wr1 f9054f;

    /* renamed from: g, reason: collision with root package name */
    public final rr1 f9055g;

    /* renamed from: h, reason: collision with root package name */
    public final rr1 f9056h;
    public final rr1 i;

    /* renamed from: j, reason: collision with root package name */
    public final wr1 f9057j;

    /* renamed from: k, reason: collision with root package name */
    public final wr1 f9058k;

    /* renamed from: l, reason: collision with root package name */
    public final wr1 f9059l;

    /* renamed from: m, reason: collision with root package name */
    public final rr1 f9060m;

    /* renamed from: n, reason: collision with root package name */
    public final rr1 f9061n;

    /* renamed from: o, reason: collision with root package name */
    public final sr1 f9062o;

    /* renamed from: p, reason: collision with root package name */
    public final wr1 f9063p;

    /* renamed from: q, reason: collision with root package name */
    public final wr1 f9064q;

    /* renamed from: r, reason: collision with root package name */
    public final wr1 f9065r;

    /* renamed from: s, reason: collision with root package name */
    public final wr1 f9066s;

    /* renamed from: t, reason: collision with root package name */
    public final wr1 f9067t;

    public oa0(j50 j50Var, rr1 rr1Var, z20 z20Var, sr1 sr1Var, bb0 bb0Var, wr1 wr1Var, z90 z90Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, rr1 rr1Var5, rr1 rr1Var6, xa0 xa0Var, rr1 rr1Var7, u10 u10Var, o10 o10Var, rr1 rr1Var8, rr1 rr1Var9, rr1 rr1Var10) {
        this.f9062o = j50Var;
        this.f9052c = rr1Var;
        this.f9063p = z20Var;
        this.f9064q = sr1Var;
        this.f9065r = bb0Var;
        this.f9053d = wr1Var;
        this.e = z90Var;
        this.f9051b = rr1Var2;
        this.f9055g = rr1Var3;
        this.f9056h = rr1Var4;
        this.i = rr1Var5;
        this.f9060m = rr1Var6;
        this.f9067t = xa0Var;
        this.f9054f = rr1Var7;
        this.f9057j = u10Var;
        this.f9058k = o10Var;
        this.f9061n = rr1Var8;
        this.f9066s = rr1Var9;
        this.f9059l = rr1Var10;
    }

    public ac0 a() {
        Context context = (Context) this.f9051b.zzb();
        tb0 tb0Var = (tb0) this.f9052c.zzb();
        of ofVar = (of) this.f9053d.zzb();
        l9.a a10 = ((u10) this.e).a();
        fp fpVar = ((m20) this.f9054f).f8210a;
        j6.l a11 = m20.a();
        jj jjVar = (jj) this.f9055g.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        return new ac0(context, tb0Var, ofVar, a10, a11, jjVar, wxVar, ((o60) this.f9062o).a(), (fc0) this.f9056h.zzb(), (gd0) this.i.zzb(), (ScheduledExecutorService) this.f9057j.zzb(), (be0) this.f9058k.zzb(), (xs0) this.f9059l.zzb(), (rh0) this.f9063p.zzb(), (vc0) this.f9060m.zzb(), (wh0) this.f9064q.zzb(), (cq0) this.f9065r.zzb(), (zd0) this.f9061n.zzb(), (me0) this.f9066s.zzb(), (b60) this.f9067t.zzb());
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f9050a) {
            case 0:
                hb a10 = ((j50) this.f9062o).a();
                Executor executor = (Executor) this.f9052c.zzb();
                ra0 a11 = ((z20) this.f9063p).a();
                ua0 ua0Var = (ua0) ((sr1) this.f9064q).zzb();
                ab0 a12 = ((bb0) this.f9065r).a();
                ta0 ta0Var = (ta0) this.f9053d.zzb();
                wa0 wa0Var = (wa0) ((z90) this.e).f13125a.f12502v;
                lo1.b(wa0Var);
                pr1 b10 = rr1.b(this.f9051b);
                pr1 b11 = rr1.b(this.f9055g);
                pr1 b12 = rr1.b(this.f9056h);
                pr1 b13 = rr1.b(this.i);
                pr1 b14 = rr1.b(this.f9060m);
                xa0 xa0Var = (xa0) this.f9067t;
                uw uwVar = new uw(((o10) xa0Var.f12536c).a(), xa0Var.f12535b.a().f4583g);
                of ofVar = (of) this.f9054f.zzb();
                l9.a a13 = ((u10) this.f9057j).a();
                Context a14 = ((o10) this.f9058k).a();
                pa0 pa0Var = (pa0) this.f9061n.zzb();
                zk0 zk0Var = (zk0) ((rr1) this.f9066s).zzb();
                return new na0(a10, executor, a11, ua0Var, a12, ta0Var, wa0Var, b10, b11, b12, b13, b14, uwVar, ofVar, a13, a14, pa0Var, zk0Var);
            default:
                return a();
        }
    }

    public oa0(rr1 rr1Var, wr1 wr1Var, wr1 wr1Var2, wr1 wr1Var3, wr1 wr1Var4, rr1 rr1Var2, o60 o60Var, rr1 rr1Var3, rr1 rr1Var4, wr1 wr1Var5, wr1 wr1Var6, wr1 wr1Var7, wr1 wr1Var8, rr1 rr1Var5, wr1 wr1Var9, wr1 wr1Var10, rr1 rr1Var6, wr1 wr1Var11, wr1 wr1Var12) {
        this.f9051b = rr1Var;
        this.f9052c = wr1Var;
        this.f9053d = wr1Var2;
        this.e = wr1Var3;
        this.f9054f = wr1Var4;
        this.f9055g = rr1Var2;
        this.f9062o = o60Var;
        this.f9056h = rr1Var3;
        this.i = rr1Var4;
        this.f9057j = wr1Var5;
        this.f9058k = wr1Var6;
        this.f9059l = wr1Var7;
        this.f9063p = wr1Var8;
        this.f9060m = rr1Var5;
        this.f9064q = wr1Var9;
        this.f9065r = wr1Var10;
        this.f9061n = rr1Var6;
        this.f9066s = wr1Var11;
        this.f9067t = wr1Var12;
    }
}

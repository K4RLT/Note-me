package com.google.android.gms.internal.ads;
import g9.x;
import l9.a;
import la.a;

import android.content.Context;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class r40 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10078a;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f10079b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f10080c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f10081d;
    public final wr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f10082f;

    public /* synthetic */ r40(Object obj, rr1 rr1Var, Object obj2, Object obj3, Object obj4, int i) {
        this.f10078a = i;
        this.f10081d = (wr1) obj;
        this.f10079b = rr1Var;
        this.e = (wr1) obj2;
        this.f10082f = obj3;
        this.f10080c = (wr1) obj4;
    }

    public p60 a() {
        return new p60(((g50) this.f10080c).a(), (String) ((g50) this.f10082f).f6306b.f6874x, (ii0) this.f10081d.zzb(), ((g50) this.f10079b).f6306b.x(), (String) this.e.zzb());
    }

    public nh0 b() {
        return new nh0(((o10) this.f10081d).a(), ((j50) this.f10082f).b(), (lh0) ((rr1) this.f10079b).zzb(), ((ax) this.f10080c).a(), ((l10) this.e).zzb());
    }

    public yn0 c() {
        fp fpVar = new fp(15);
        Context a10 = ((o10) this.f10081d).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.e.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        return new yn0(fpVar, a10, scheduledExecutorService, wxVar, ((do0) this.f10082f).f5468b.f4002v, ((dv) ((do0) this.f10080c).f5468b.f4003w).F, ((dv) ((do0) this.f10079b).f5468b.f4003w).E);
    }

    public eo0 d() {
        px pxVar = (px) this.f10081d.zzb();
        boolean z3 = ((dv) ((do0) this.f10082f).f5468b.f4003w).E;
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        lo1.b(((dv) ((do0) this.f10080c).f5468b.f4003w).f5529x);
        return new eo0(pxVar, z3, wxVar, (ScheduledExecutorService) this.e.zzb(), ((do0) this.f10079b).a().intValue());
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        int i;
        switch (this.f10078a) {
            case 0:
                return new q40(((o10) this.f10081d).a(), (h00) ((j40) this.f10082f).f7315b.f11473y, ((g50) this.f10080c).a(), ((u10) this.e).a(), (ai0) ((rr1) this.f10079b).zzb());
            case 1:
                a70 a70Var = (a70) ((rr1) this.f10079b).zzb();
                qp0 a10 = ((g50) this.f10080c).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f10081d.zzb();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new a60(a70Var, a10, scheduledExecutorService, wxVar, (String) ((g50) this.e).f6306b.f6874x, (u70) ((rr1) this.f10082f).zzb());
            case 2:
                return new g60(((g50) this.f10082f).b(), ((g50) this.f10080c).a(), (a) this.f10081d.zzb(), (be0) this.e.zzb(), (ScheduledExecutorService) this.f10079b.zzb());
            case 3:
                return a();
            case 4:
                return new t90(((o10) this.f10081d).a(), (h00) ((o90) this.f10082f).f9046b.f13729w, ((g50) this.f10080c).a(), ((u10) this.e).a(), (ai0) ((rr1) this.f10079b).zzb());
            case 5:
                Map zzb = ((ur1) this.f10081d).zzb();
                Map zzb2 = ((ur1) this.e).zzb();
                Map zzb3 = ((ur1) this.f10082f).zzb();
                wa0 wa0Var = (wa0) ((z90) this.f10080c).f13125a.f12502v;
                lo1.b(wa0Var);
                return new w90(zzb, zzb2, zzb3, (rr1) this.f10079b, wa0Var);
            case 6:
                return new ec0((Executor) this.f10081d.zzb(), (x30) ((rr1) this.f10079b).zzb(), (d90) ((rr1) this.e).zzb(), (g30) ((rr1) this.f10082f).zzb(), (c60) ((rr1) this.f10080c).zzb());
            case 7:
                Context a11 = ((o10) this.f10081d).a();
                String packageName = ((o10) ((s20) this.f10082f).f10466b).a().getPackageName();
                lo1.b(packageName);
                a a12 = ((u10) this.e).a();
                kj kjVar = (kj) this.f10080c.zzb();
                String str = (String) ((rr1) this.f10079b).zzb();
                jj jjVar = new jj(new mf(a11, 3));
                ak A = bk.A();
                int i10 = a12.f20030v;
                A.b();
                ((bk) A.f4845v).B(i10);
                int i11 = a12.f20031w;
                A.b();
                ((bk) A.f4845v).C(i11);
                if (true != a12.f20032x) {
                    i = 2;
                } else {
                    i = 0;
                }
                A.b();
                ((bk) A.f4845v).z(i);
                jjVar.a(new tw(kjVar, packageName, (bk) A.c(), str, 15));
                return jjVar;
            case 8:
                return b();
            case 9:
                return new ai0(((o10) this.f10081d).a(), ((u10) this.e).a(), ((g50) this.f10080c).a(), (h00) ((sr1) this.f10082f).zzb(), (be0) this.f10079b.zzb());
            case 10:
                return new yi0((Context) ((rr1) this.f10079b).zzb(), (Executor) this.f10081d.zzb(), (h20) ((tr1) this.f10082f).f11431a, (pp0) this.e.zzb(), (be0) this.f10080c.zzb());
            case 11:
                return new mj0((y10) this.f10081d.zzb(), ((m60) this.e).f8269b.a(), ((q80) this.f10082f).f9774b, (qj0) ((rr1) this.f10079b).zzb(), (ii0) ((rr1) this.f10080c).zzb());
            case 12:
                a aVar = (a) this.f10081d.zzb();
                sj0 sj0Var = (sj0) this.f10080c;
                zd1 zd1Var = new zd1(16, (gq0) sj0Var.f10624b.zzb(), (nd0) sj0Var.f10625c.zzb(), (be0) sj0Var.f10626d.zzb());
                ii0 ii0Var = (ii0) ((rr1) this.f10079b).zzb();
                xs0 xs0Var = (xs0) this.e.zzb();
                qj0 qj0Var = (qj0) ((tf) this.f10082f).f11339v;
                if (qj0Var == null) {
                    return new qj0(aVar, zd1Var, ii0Var, xs0Var);
                }
                return qj0Var;
            case 13:
                return new yi0((Context) ((rr1) this.f10079b).zzb(), (d20) ((tr1) this.e).f11431a, (kr0) ((rr1) this.f10082f).zzb(), (wx) this.f10081d.zzb(), (yl) ((kk0) this.f10080c).f7786b.f7466v);
            case 14:
                return new sk0((Context) this.f10081d.zzb(), (x) ((y90) this.e).f12822a.f12503w, ((o60) ((wr1) this.f10082f)).a(), ((g40) ((z20) this.f10080c).f13051b).a(), (be0) this.f10079b.zzb());
            case 15:
                return c();
            case 16:
                return d();
            case 17:
                return new fp0((Context) ((tr1) this.f10082f).f11431a, (Executor) this.f10081d.zzb(), (y10) this.e.zzb(), (yk0) ((rr1) this.f10079b).zzb(), (hp0) ((rr1) this.f10080c).zzb(), new zp0());
            case 18:
                Context context = (Context) ((tr1) this.f10081d).f11431a;
                dy0 dy0Var = (dy0) ((rr1) this.f10079b).zzb();
                ExecutorService executorService = (ExecutorService) ((tr1) this.e).f11431a;
                cy0 cy0Var = (cy0) ((rr1) this.f10082f).zzb();
                rx0 rx0Var = (rx0) ((tr1) this.f10080c).f11431a;
                return new ry0(context, dy0Var, executorService, cy0Var, new Random(), rx0Var.S().z(), rx0Var.S().B(), rx0Var.S().C(), rx0Var.S().A(), rx0Var.Q(), rx0Var.K(), rx0Var.I() - 1);
            case 19:
                return new zy0((rx0) ((tr1) this.f10081d).f11431a, (yy0) ((rr1) this.f10079b).zzb(), (ry0) ((rr1) this.e).zzb(), (ExecutorService) ((tr1) this.f10082f).f11431a, (h21) ((rr1) this.f10080c).zzb());
            default:
                return new rz0((wd) ((tr1) this.f10082f).f11431a, (pz0) this.f10081d.zzb(), (Map) ((tr1) this.f10080c).f11431a, (Context) this.e.zzb(), (h21) this.f10079b.zzb());
        }
    }

    public r40(o10 o10Var, u10 u10Var, g50 g50Var, sr1 sr1Var, rr1 rr1Var) {
        this.f10078a = 9;
        this.f10081d = o10Var;
        this.e = u10Var;
        this.f10080c = g50Var;
        this.f10082f = sr1Var;
        this.f10079b = rr1Var;
    }

    public r40(o10 o10Var, s20 s20Var, u10 u10Var, wr1 wr1Var, rr1 rr1Var) {
        this.f10078a = 7;
        this.f10081d = o10Var;
        this.f10082f = s20Var;
        this.e = u10Var;
        this.f10080c = wr1Var;
        this.f10079b = rr1Var;
    }

    public r40(g50 g50Var, g50 g50Var2, rr1 rr1Var, g50 g50Var3, rr1 rr1Var2) {
        this.f10078a = 3;
        this.f10080c = g50Var;
        this.f10082f = g50Var2;
        this.f10081d = rr1Var;
        this.f10079b = g50Var3;
        this.e = rr1Var2;
    }

    public r40(g50 g50Var, g50 g50Var2, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3) {
        this.f10078a = 2;
        this.f10082f = g50Var;
        this.f10080c = g50Var2;
        this.f10081d = rr1Var;
        this.e = rr1Var2;
        this.f10079b = rr1Var3;
    }

    public r40(rr1 rr1Var, g50 g50Var, rr1 rr1Var2, g50 g50Var2, rr1 rr1Var3) {
        this.f10078a = 1;
        this.f10079b = rr1Var;
        this.f10080c = g50Var;
        this.f10081d = rr1Var2;
        this.e = g50Var2;
        this.f10082f = rr1Var3;
    }

    public r40(rr1 rr1Var, tr1 tr1Var, rr1 rr1Var2, wr1 wr1Var, kk0 kk0Var) {
        this.f10078a = 13;
        this.f10079b = rr1Var;
        this.e = tr1Var;
        this.f10082f = rr1Var2;
        this.f10081d = wr1Var;
        this.f10080c = kk0Var;
    }

    public r40(rr1 rr1Var, wr1 wr1Var, tr1 tr1Var, wr1 wr1Var2, wr1 wr1Var3) {
        this.f10078a = 10;
        this.f10079b = rr1Var;
        this.f10081d = wr1Var;
        this.f10082f = tr1Var;
        this.e = wr1Var2;
        this.f10080c = wr1Var3;
    }

    public /* synthetic */ r40(sr1 sr1Var, sr1 sr1Var2, sr1 sr1Var3, rr1 rr1Var, wr1 wr1Var, int i) {
        this.f10078a = i;
        this.f10081d = sr1Var;
        this.e = sr1Var2;
        this.f10082f = sr1Var3;
        this.f10079b = rr1Var;
        this.f10080c = wr1Var;
    }

    public r40(tr1 tr1Var, rr1 rr1Var, tr1 tr1Var2, rr1 rr1Var2, rr1 rr1Var3) {
        this.f10078a = 17;
        this.f10082f = tr1Var;
        this.f10081d = rr1Var;
        this.e = tr1Var2;
        this.f10079b = rr1Var2;
        this.f10080c = rr1Var3;
    }

    public r40(tr1 tr1Var, rr1 rr1Var, tr1 tr1Var2, tr1 tr1Var3, rr1 rr1Var2) {
        this.f10078a = 20;
        this.f10082f = tr1Var;
        this.f10081d = rr1Var;
        this.f10080c = tr1Var2;
        this.e = tr1Var3;
        this.f10079b = rr1Var2;
    }

    public r40(wr1 wr1Var, j50 j50Var, rr1 rr1Var, ax axVar, wr1 wr1Var2) {
        this.f10078a = 8;
        this.f10081d = wr1Var;
        this.f10082f = j50Var;
        this.f10079b = rr1Var;
        this.f10080c = axVar;
        this.e = wr1Var2;
    }

    public /* synthetic */ r40(wr1 wr1Var, sr1 sr1Var, sr1 sr1Var2, wr1 wr1Var2, wr1 wr1Var3, int i) {
        this.f10078a = i;
        this.f10081d = wr1Var;
        this.f10082f = sr1Var;
        this.f10080c = sr1Var2;
        this.e = wr1Var2;
        this.f10079b = wr1Var3;
    }

    public /* synthetic */ r40(wr1 wr1Var, wr1 wr1Var2, sr1 sr1Var, sr1 sr1Var2, wr1 wr1Var3, int i) {
        this.f10078a = i;
        this.f10081d = wr1Var;
        this.e = wr1Var2;
        this.f10082f = sr1Var;
        this.f10080c = sr1Var2;
        this.f10079b = wr1Var3;
    }

    public r40(tf tfVar, wr1 wr1Var, sj0 sj0Var, rr1 rr1Var, wr1 wr1Var2) {
        this.f10078a = 12;
        this.f10082f = tfVar;
        this.f10081d = wr1Var;
        this.f10080c = sj0Var;
        this.f10079b = rr1Var;
        this.e = wr1Var2;
    }
}

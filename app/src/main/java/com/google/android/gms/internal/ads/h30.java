package com.google.android.gms.internal.ads;
import g9.r;
import j6.l;
import k9.c0;
import l9.l;
import la.a;

import android.content.Context;
import android.webkit.WebView;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h30 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6575a;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f6576b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f6577c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f6578d;
    public final wr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final wr1 f6579f;

    /* renamed from: g, reason: collision with root package name */
    public final wr1 f6580g;

    public h30(o10 o10Var, rr1 rr1Var, wr1 wr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4) {
        this.f6575a = 13;
        this.f6577c = o10Var;
        this.f6579f = rr1Var;
        this.f6576b = wr1Var;
        this.f6580g = rr1Var2;
        this.f6578d = rr1Var3;
        this.e = rr1Var4;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, com.google.android.gms.internal.ads.hb] */
    public hb a() {
        Context a10 = ((o10) this.f6576b).a();
        ur0 ur0Var = (ur0) ((rr1) this.f6579f).zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f6577c.zzb();
        b50 b50Var = (b50) ((rr1) this.f6580g).zzb();
        qj0 qj0Var = (qj0) ((rr1) this.f6578d).zzb();
        ws0 ws0Var = (ws0) ((rr1) this.e).zzb();
        Object obj = new Object();
        obj.B = new Object();
        obj.C = new AtomicBoolean();
        obj.f6649u = a10;
        obj.f6650v = ur0Var;
        obj.f6651w = wxVar;
        obj.f6652x = scheduledExecutorService;
        obj.f6653y = b50Var;
        obj.f6654z = qj0Var;
        obj.A = ws0Var;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        WebView u9;
        switch (this.f6575a) {
            case 0:
                Context a10 = ((o10) this.f6576b).a();
                c0 zzb = ((l10) this.f6577c).zzb();
                ci0 ci0Var = (ci0) ((rr1) this.f6579f).zzb();
                jd0 jd0Var = (jd0) ((rr1) this.f6580g).zzb();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new g30(a10, zzb, ci0Var, jd0Var, wxVar, (wx) this.f6578d.zzb(), (ScheduledExecutorService) this.e.zzb());
            case 1:
                l40 l40Var = (l40) this.e;
                uw uwVar = new uw(((o10) l40Var.f7936b).a(), ((o60) l40Var.f7937c).a().f4583g);
                Context a11 = ((o10) this.f6576b).a();
                ww wwVar = (ww) this.f6577c.zzb();
                h00 h00Var = (h00) ((o90) this.f6579f).f9046b.f13729w;
                if (h00Var == null) {
                    u9 = null;
                } else {
                    u9 = h00Var.u();
                }
                return new v90(uwVar, a11, wwVar, u9, (kj) this.f6578d.zzb(), ((g50) this.f6580g).a());
            case 2:
                y10 y10Var = (y10) this.f6576b.zzb();
                yd1 a12 = ((m60) this.f6578d).f8269b.a();
                p80 p80Var = ((q80) this.e).f9774b;
                x90 x90Var = (x90) ((z20) this.f6580g).f13051b;
                x70 zzb2 = ((d40) this.f6577c).zzb();
                qj0 qj0Var = (qj0) ((rr1) this.f6579f).zzb();
                y10 y10Var2 = y10Var.f12709b;
                k60 k60Var = new k60(a12);
                tf tfVar = null;
                jk0 jk0Var = new jk0(0, tfVar);
                l lVar = new l(zzb2, 5, tfVar);
                lx0 lx0Var = new lx0(16, tfVar);
                if (((Boolean) r.e.f17698c.a(sl.f11028y4)).booleanValue()) {
                    tfVar = new tf(28, false);
                    tfVar.f11339v = qj0Var;
                }
                lo1.c(p80Var, p80.class);
                if (tfVar == null) {
                    tfVar = new tf(28, false);
                }
                lo1.c(x90Var, x90.class);
                b50 b50Var = (b50) new d20(y10Var2, lx0Var, x90Var, new v80(16), p80Var, k60Var, tfVar, jk0Var, lVar, null, null).f5282s.zzb();
                lo1.b(b50Var);
                return b50Var;
            case 3:
                Context a13 = ((o10) this.f6576b).a();
                aq0 a14 = ((o60) this.f6578d).a();
                ax axVar = (ax) this.e;
                wx wxVar2 = xx.f12652b;
                lo1.b(wxVar2);
                wx wxVar3 = xx.f12651a;
                lo1.b(wxVar3);
                tw twVar = new tw(wxVar2, wxVar3, new lg0((Context) ((je0) axVar.f4622b).f7425b.zzb(), wxVar3, 0), rr1.b((h30) axVar.f4623c), 16);
                lo1.b(wxVar3);
                return new jg0(a13, a14, twVar, wxVar3, (ScheduledExecutorService) this.f6577c.zzb(), (lh0) ((rr1) this.f6579f).zzb(), (ur0) ((rr1) this.f6580g).zzb());
            case 4:
                Context a15 = ((o10) this.f6576b).a();
                wx wxVar4 = xx.f12651a;
                lo1.b(wxVar4);
                fp fpVar = new fp(12);
                y10 y10Var3 = (y10) ((s10) this.f6577c).f10450a.f11431a;
                lo1.b(y10Var3);
                return new eh0(a15, wxVar4, fpVar, y10Var3, new hx0(22, ((w10) ((s20) this.f6579f).f10466b).zzb()), (ArrayDeque) this.f6578d.zzb(), (vr0) this.e.zzb(), (h10) this.f6580g.zzb());
            case 5:
                return a();
            case 6:
                return new kj0((y10) this.f6576b.zzb(), (x90) ((z20) this.f6577c).f13051b, ((m60) this.f6578d).f8269b.a(), ((q80) this.e).f9774b, (qj0) ((rr1) this.f6579f).zzb(), (ii0) ((rr1) this.f6580g).zzb());
            case 7:
                return new kj0((y10) this.f6576b.zzb(), ((m60) this.f6577c).f8269b.a(), ((kk0) this.f6578d).f7786b, ((q80) this.e).f9774b, (qj0) ((rr1) this.f6579f).zzb(), (ii0) ((rr1) this.f6580g).zzb());
            case 8:
                return new kj0((y10) this.f6576b.zzb(), ((m60) this.f6577c).f8269b.a(), ((q80) this.f6578d).f9774b, (xp0) ((m60) this.e).f8269b.f7669d, (qj0) ((rr1) this.f6579f).zzb(), (ii0) ((rr1) this.f6580g).zzb());
            case 9:
                c0 zzb3 = ((l10) this.f6576b).zzb();
                Context a16 = ((o10) this.f6577c).a();
                wx wxVar5 = xx.f12651a;
                lo1.b(wxVar5);
                return new wn0(zzb3, a16, wxVar5, (ScheduledExecutorService) this.f6578d.zzb(), new ju0(((o10) ((s20) this.f6579f).f10466b).a()), ((o60) this.f6580g).a(), ((u10) this.e).a());
            case 10:
                return new ko0((Context) ((tr1) this.e).f11431a, (Executor) this.f6576b.zzb(), (y10) this.f6577c.zzb(), ((ap0) this.f6580g).a(), (jo0) ((rr1) this.f6579f).zzb(), new zp0(), ((u10) this.f6578d).a());
            case 11:
                return new kp0((Context) ((tr1) this.f6578d).f11431a, (Executor) this.f6576b.zzb(), (y10) this.f6577c.zzb(), ((ap0) this.e).a(), (hp0) ((rr1) this.f6579f).zzb(), new zp0(), (xp0) ((rr1) this.f6580g).zzb());
            case 12:
                return new eq0((xs0) this.f6576b.zzb(), (vs0) this.f6577c.zzb(), ((g50) this.e).a(), ((g50) this.f6580g).f6306b.x(), (g30) ((rr1) this.f6579f).zzb(), (ur0) this.f6578d.zzb());
            case 13:
                Context a17 = ((o10) this.f6577c).a();
                wx wxVar6 = xx.f12651a;
                lo1.b(wxVar6);
                return new xs0(a17, wxVar6, (c91) ((rr1) this.f6579f).zzb(), (l) this.f6576b.zzb(), (vs0) ((rr1) this.f6580g).zzb(), (vr0) ((rr1) this.f6578d).zzb(), (h10) ((rr1) this.e).zzb());
            case 14:
                return new ct0((pt0) ((rr1) this.f6579f).zzb(), ((r10) this.f6576b).a(), ((o10) this.f6577c).a(), (a) ((rr1) this.f6580g).zzb(), (at0) ((rr1) this.f6578d).zzb(), ((l10) this.e).zzb());
            case 15:
                return new yy0(rr1.b((rr1) this.f6579f), rr1.b((rr1) this.f6580g), rr1.b((rr1) this.f6576b), (rx0) ((tr1) this.f6577c).f11431a, (ExecutorService) ((tr1) this.f6578d).f11431a, (h21) ((rr1) this.e).zzb());
            case 16:
                return new a01((wd) ((tr1) this.f6578d).f11431a, (pz0) this.f6576b.zzb(), (yx0) ((tr1) this.e).f11431a, (Context) ((tr1) this.f6579f).f11431a, (Map) ((tr1) this.f6580g).f11431a, (h21) this.f6577c.zzb());
            case 17:
                t11 t11Var = (t11) ((rr1) this.f6579f).zzb();
                d11 d11Var = (d11) ((rr1) this.f6580g).zzb();
                k11 k11Var = (k11) ((rr1) this.e).zzb();
                h21 h21Var = (h21) this.f6576b.zzb();
                dy0 dy0Var = (dy0) this.f6577c.zzb();
                rx0 rx0Var = (rx0) this.f6578d.zzb();
                return new p01(t11Var, d11Var, k11Var, h21Var, dy0Var, rx0Var.W().D(), rx0Var.W().E(), rx0Var.W().F());
            default:
                return new i11((Context) this.f6576b.zzb(), (ExecutorService) this.f6577c.zzb(), (rx0) this.f6578d.zzb(), (cy0) this.e.zzb(), (h21) this.f6580g.zzb(), (j11) ((rr1) this.f6579f).zzb());
        }
    }

    public h30(o10 o10Var, l10 l10Var, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4) {
        this.f6575a = 0;
        this.f6576b = o10Var;
        this.f6577c = l10Var;
        this.f6579f = rr1Var;
        this.f6580g = rr1Var2;
        this.f6578d = rr1Var3;
        this.e = rr1Var4;
    }

    public h30(l40 l40Var, o10 o10Var, rr1 rr1Var, o90 o90Var, sr1 sr1Var, g50 g50Var) {
        this.f6575a = 1;
        this.e = l40Var;
        this.f6576b = o10Var;
        this.f6577c = rr1Var;
        this.f6579f = o90Var;
        this.f6578d = sr1Var;
        this.f6580g = g50Var;
    }

    public h30(rr1 rr1Var, r10 r10Var, o10 o10Var, rr1 rr1Var2, rr1 rr1Var3, l10 l10Var) {
        this.f6575a = 14;
        this.f6579f = rr1Var;
        this.f6576b = r10Var;
        this.f6577c = o10Var;
        this.f6580g = rr1Var2;
        this.f6578d = rr1Var3;
        this.e = l10Var;
    }

    public h30(rr1 rr1Var, rr1 rr1Var2, g50 g50Var, g50 g50Var2, rr1 rr1Var3, rr1 rr1Var4) {
        this.f6575a = 12;
        this.f6576b = rr1Var;
        this.f6577c = rr1Var2;
        this.e = g50Var;
        this.f6580g = g50Var2;
        this.f6579f = rr1Var3;
        this.f6578d = rr1Var4;
    }

    public h30(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, rr1 rr1Var5, tr1 tr1Var) {
        this.f6575a = 17;
        this.f6579f = rr1Var;
        this.f6580g = rr1Var2;
        this.e = rr1Var3;
        this.f6576b = rr1Var4;
        this.f6577c = rr1Var5;
        this.f6578d = tr1Var;
    }

    public h30(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, tr1 tr1Var, tr1 tr1Var2, rr1 rr1Var4) {
        this.f6575a = 15;
        this.f6579f = rr1Var;
        this.f6580g = rr1Var2;
        this.f6576b = rr1Var3;
        this.f6577c = tr1Var;
        this.f6578d = tr1Var2;
        this.e = rr1Var4;
    }

    public h30(tr1 tr1Var, rr1 rr1Var, tr1 tr1Var2, ap0 ap0Var, rr1 rr1Var2, u10 u10Var) {
        this.f6575a = 10;
        this.e = tr1Var;
        this.f6576b = rr1Var;
        this.f6577c = tr1Var2;
        this.f6580g = ap0Var;
        this.f6579f = rr1Var2;
        this.f6578d = u10Var;
    }

    public h30(tr1 tr1Var, rr1 rr1Var, tr1 tr1Var2, ap0 ap0Var, rr1 rr1Var2, rr1 rr1Var3) {
        this.f6575a = 11;
        this.f6578d = tr1Var;
        this.f6576b = rr1Var;
        this.f6577c = tr1Var2;
        this.e = ap0Var;
        this.f6579f = rr1Var2;
        this.f6580g = rr1Var3;
    }

    public h30(tr1 tr1Var, rr1 rr1Var, tr1 tr1Var2, tr1 tr1Var3, tr1 tr1Var4, rr1 rr1Var2) {
        this.f6575a = 16;
        this.f6578d = tr1Var;
        this.f6576b = rr1Var;
        this.e = tr1Var2;
        this.f6579f = tr1Var3;
        this.f6580g = tr1Var4;
        this.f6577c = rr1Var2;
    }

    public h30(tr1 tr1Var, tr1 tr1Var2, tr1 tr1Var3, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3) {
        this.f6575a = 18;
        this.f6576b = tr1Var;
        this.f6577c = tr1Var2;
        this.f6578d = tr1Var3;
        this.e = rr1Var;
        this.f6580g = rr1Var2;
        this.f6579f = rr1Var3;
    }

    public h30(wr1 wr1Var, m60 m60Var, q80 q80Var, z20 z20Var, wr1 wr1Var2, rr1 rr1Var) {
        this.f6575a = 2;
        this.f6576b = wr1Var;
        this.f6578d = m60Var;
        this.e = q80Var;
        this.f6580g = z20Var;
        this.f6577c = wr1Var2;
        this.f6579f = rr1Var;
    }

    public h30(wr1 wr1Var, o60 o60Var, ax axVar, wr1 wr1Var2, rr1 rr1Var, rr1 rr1Var2) {
        this.f6575a = 3;
        this.f6576b = wr1Var;
        this.f6578d = o60Var;
        this.e = axVar;
        this.f6577c = wr1Var2;
        this.f6579f = rr1Var;
        this.f6580g = rr1Var2;
    }

    public h30(wr1 wr1Var, rr1 rr1Var, wr1 wr1Var2, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4) {
        this.f6575a = 5;
        this.f6576b = wr1Var;
        this.f6579f = rr1Var;
        this.f6577c = wr1Var2;
        this.f6580g = rr1Var2;
        this.f6578d = rr1Var3;
        this.e = rr1Var4;
    }

    public /* synthetic */ h30(wr1 wr1Var, sr1 sr1Var, sr1 sr1Var2, sr1 sr1Var3, rr1 rr1Var, rr1 rr1Var2, int i) {
        this.f6575a = i;
        this.f6576b = wr1Var;
        this.f6577c = sr1Var;
        this.f6578d = sr1Var2;
        this.e = sr1Var3;
        this.f6579f = rr1Var;
        this.f6580g = rr1Var2;
    }

    public h30(wr1 wr1Var, wr1 wr1Var2, s20 s20Var, wr1 wr1Var3, wr1 wr1Var4, wr1 wr1Var5) {
        this.f6575a = 4;
        this.f6576b = wr1Var;
        this.f6577c = wr1Var2;
        this.f6579f = s20Var;
        this.f6578d = wr1Var3;
        this.e = wr1Var4;
        this.f6580g = wr1Var5;
    }

    public h30(wr1 wr1Var, wr1 wr1Var2, wr1 wr1Var3, s20 s20Var, o60 o60Var, wr1 wr1Var4) {
        this.f6575a = 9;
        this.f6576b = wr1Var;
        this.f6577c = wr1Var2;
        this.f6578d = wr1Var3;
        this.f6579f = s20Var;
        this.f6580g = o60Var;
        this.e = wr1Var4;
    }
}
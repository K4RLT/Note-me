package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class w50 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12139a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f12140b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f12141c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f12142d;
    public final wr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final wr1 f12143f;

    /* renamed from: g, reason: collision with root package name */
    public final wr1 f12144g;

    /* renamed from: h, reason: collision with root package name */
    public final wr1 f12145h;

    public w50(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, rr1 rr1Var5, tr1 tr1Var, tr1 tr1Var2) {
        this.f12140b = rr1Var;
        this.f12145h = rr1Var2;
        this.f12141c = rr1Var3;
        this.f12142d = rr1Var4;
        this.e = rr1Var5;
        this.f12143f = tr1Var;
        this.f12144g = tr1Var2;
    }

    public si0 a() {
        return new si0((d20) ((tr1) this.f12142d).f11431a, (Context) ((rr1) this.e).zzb(), (Executor) this.f12140b.zzb(), (gd0) ((rr1) this.f12143f).zzb(), ((o60) this.f12141c).a(), (f31) ((rr1) this.f12144g).zzb(), (zd0) ((rr1) this.f12145h).zzb());
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f12139a) {
            case 0:
                return new v50(((o10) this.f12140b).a(), ((o60) this.f12141c).a(), ((u10) this.f12142d).a(), ((l10) this.e).zzb(), (af0) this.f12143f.zzb(), (vr0) this.f12144g.zzb(), (nf0) this.f12145h.zzb());
            case 1:
                return a();
            case 2:
                x10 x10Var = (x10) ((tr1) this.e).f11431a;
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new gj0(x10Var, wxVar, ((rw) this.f12143f).b(), (jq0) this.f12140b.zzb(), (vc0) ((rr1) this.f12144g).zzb(), (zd0) ((rr1) this.f12145h).zzb(), ((u10) this.f12142d).a(), (Context) ((rr1) this.f12141c).zzb(), new fp(14));
            case 3:
                return new no0((y10) this.f12140b.zzb(), (Context) ((tr1) this.f12143f).f11431a, (String) ((tr1) this.f12144g).f11431a, (ko0) ((rr1) this.f12145h).zzb(), (jo0) ((rr1) this.f12141c).zzb(), ((u10) this.f12142d).a(), (be0) this.e.zzb());
            case 4:
                return new oo0((Context) ((tr1) this.e).f11431a, (Executor) this.f12140b.zzb(), (g9.c3) ((tr1) this.f12143f).f11431a, (y10) this.f12142d.zzb(), (yk0) ((rr1) this.f12144g).zzb(), (al0) ((rr1) this.f12145h).zzb(), new zp0(), (i80) ((rr1) this.f12141c).zzb());
            case 5:
                return new px0((oy0) ((rr1) this.f12140b).zzb(), (zy0) ((rr1) this.f12142d).zzb(), (x11) ((rr1) this.e).zzb(), (h21) ((rr1) this.f12143f).zzb(), (dy0) ((rr1) this.f12144g).zzb(), rr1.b((rr1) this.f12145h), (rx0) ((tr1) this.f12141c).f11431a);
            case 6:
                return new az0((ExecutorService) this.f12140b.zzb(), rr1.b((rr1) this.f12144g), rr1.b(this.f12142d), (x11) this.e.zzb(), rr1.b((rr1) this.f12145h), (sx0) this.f12141c, (rx0) this.f12143f.zzb());
            case 7:
                Context context = (Context) this.f12140b.zzb();
                ExecutorService executorService = (ExecutorService) this.f12142d.zzb();
                hz0 hz0Var = (hz0) this.e.zzb();
                oz0 oz0Var = (oz0) ((rr1) this.f12141c).zzb();
                File file = (File) this.f12143f.zzb();
                h21 h21Var = (h21) this.f12144g.zzb();
                rx0 rx0Var = (rx0) this.f12145h.zzb();
                j51 p10 = j51.p(new qz0("uhXgNuGSyd8UZxNVLle6+R5FVDrGs3ztJxFRccM25tfzP1xuUPcwCU9TKSVvh2k9", "qKJ/azzJVrSI96ukKyGiETTBFTHn9OIRjLO/t8+zHyA=", Context.class), new qz0("yVK2BtjhkWiqPWfXVe7pCdqpfz2Ps9CcWbBtlKTt4FN37/tD76f0HDGVwAjTsvKH", "Fo5nkU2nfGSO+g2iGIxI5+P04k6pQ8lbcFZjpNOd5oc=", new Class[0]), new qz0("lgB22o3+xtO6b1PB1kHO8Agbi+6HbLXaRU20SARWIrq6m129Ofvaya/yhX25r56V", "Rqk2tq5zRAYapYluu1wAppyX64RE9M13E2H+pIaATIY=", NetworkCapabilities.class, Long.class, Long.class), new qz0("Sg9wh/uRZZt11trI0/ArQR457JKvhvXPZq07aU70olp83YOM+BSyiAIXktC8LJHR", "EzsZPxHde//8PaxXqjETRoZ/+tCf60bKZdwrCpNCQLk=", String.class), new qz0("1lfY2PujDI83L37TUM18aHWHBqDSAahgyhidgEksUB/zDEol7S6B03Ggb0FWJZjW", "FoX2EoxLxkVC+ircfmZ3nlw9JLpL8iQtQvisY+wPqkA=", View.class, Activity.class), new qz0("1WgZ3mEd4p+W8SVE9tx/naUqatZo+XVfLsKM/o+CSVYyRyaBWFiQiHaYs+1ib01V", "yEc5jsed/vAVK/yCIwJWSyA9BW0RHK/xnzaQgPM8Vgw=", DisplayMetrics.class, View.class), new qz0("FRbH3YSkWLoeHfFsbLmVPzOa63aS7qRNcxlL25CUBAPaDEl/9m5xoZHvOSUnXb3F", "n3MzKzWgNLpU97/XE2w+GCw7DhFJXqnLmao7nSZ1jSU=", Long[].class, Integer.class), new qz0("50+sX4d44jerXZ0t37Z07Ss5Y2LVKA0u1WWlTsyrM+njWBpcjf8xU2ZOd5yoshWp", "IaakTOOFGOw3T0IOJ/LBUMRFnsvXDEiR+LxXdy42JcU=", new Class[0]), new qz0("+PCjsR8uUrE+ODYObgFJ15LzzbP31PRWxMEYlQ7sSRGBdHPl6GvLcY6T0RM0sryv", "LK6oYs0YHGkrF/9CgiECppIXTefV1s/9lm3/dqGO06I=", Context.class, Integer.class), new qz0("VfejF6jLqZSis5lDsrO62jUDAXJqP6cPz4mgjtZND5tZ2P5VWHtedQvP3pauMLAi", "2mDHoFGLT7ybGaRwjjkTGPAVzRPlkIteOrAkiSTAkLw=", Integer.class, Context.class, Boolean.class), new qz0("SZhD94EfxCH1aUaqL3kliCVXsuzYhOJtOn/V0ec5JepY8dU6lMpt78s7q3QiFI+n", "9JUJL19Ne/lezLGl66/0Sq/KunPDyKseh4J4ncxdc50=", Context.class), new qz0("H0YdM17mgrrozxD0WVa3M40/jGgbp6xsWEqC8q+HAngxqz5clYs9XrZGt0ruoMVC", "vTRbdp+bvCvcqmoB2mkwDXNuKnz+mZ0QzFSaQEl2hgg=", Context.class), new qz0("yEN9KgeW2ShR+kJNMVm4gRcjBaCiP+NkfaG+4w0YdiFdjOQUuGzxN01qjMkIt53T", "+ZwABUDFslQ7udw7VsU5AeCjEmTqogfLUUw0gHzd544=", MotionEvent.class, DisplayMetrics.class), new qz0("ha9rMPg9+yg7CQJd8hulZYYnWyvcb9rIbXzM+WEcFYbGtaIOAjDJnYEoauGRuKjN", "nl2mD60ZrulhoIB3vhnGQRCpmcQlp+xDYCmCtO11lLQ=", MotionEvent.class, DisplayMetrics.class));
                lo1.b(p10);
                return new pz0(context, executorService, hz0Var, oz0Var, file, h21Var, rx0Var.c0(), p10);
            case 8:
                return new vz0((wd) ((tr1) this.f12144g).f11431a, (pz0) this.f12140b.zzb(), (Map) ((tr1) this.f12145h).f11431a, (Context) this.f12142d.zzb(), (yx0) ((tr1) this.f12141c).f11431a, (rx0) this.e.zzb(), (h21) this.f12143f.zzb());
            case 9:
                return new c11((ry0) this.f12140b.zzb(), (t11) ((rr1) this.f12145h).zzb(), (s11) ((rr1) this.f12141c).zzb(), (x11) this.f12142d.zzb(), (h21) this.e.zzb(), (rx0) this.f12143f.zzb(), (ExecutorService) this.f12144g.zzb());
            default:
                return new g11((Context) this.f12140b.zzb(), rr1.b((rr1) this.f12143f), (k11) ((rr1) this.f12144g).zzb(), (h21) this.f12142d.zzb(), (ExecutorService) this.e.zzb(), (v01) ((rr1) this.f12145h).zzb(), (cv0) ((rr1) this.f12141c).zzb());
        }
    }

    public w50(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, rr1 rr1Var5, rr1 rr1Var6, tr1 tr1Var) {
        this.f12140b = rr1Var;
        this.f12142d = rr1Var2;
        this.e = rr1Var3;
        this.f12143f = rr1Var4;
        this.f12144g = rr1Var5;
        this.f12145h = rr1Var6;
        this.f12141c = tr1Var;
    }

    public w50(tr1 tr1Var, rw rwVar, wr1 wr1Var, rr1 rr1Var, rr1 rr1Var2, wr1 wr1Var2, rr1 rr1Var3) {
        this.e = tr1Var;
        this.f12143f = rwVar;
        this.f12140b = wr1Var;
        this.f12144g = rr1Var;
        this.f12145h = rr1Var2;
        this.f12142d = wr1Var2;
        this.f12141c = rr1Var3;
    }

    public w50(tr1 tr1Var, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, sx0 sx0Var, tr1 tr1Var2) {
        this.f12140b = tr1Var;
        this.f12144g = rr1Var;
        this.f12142d = rr1Var2;
        this.e = rr1Var3;
        this.f12145h = rr1Var4;
        this.f12141c = sx0Var;
        this.f12143f = tr1Var2;
    }

    public w50(tr1 tr1Var, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, tr1 tr1Var2, rr1 rr1Var4, rr1 rr1Var5) {
        this.f12140b = tr1Var;
        this.f12143f = rr1Var;
        this.f12144g = rr1Var2;
        this.f12142d = rr1Var3;
        this.e = tr1Var2;
        this.f12145h = rr1Var4;
        this.f12141c = rr1Var5;
    }

    public w50(tr1 tr1Var, rr1 rr1Var, tr1 tr1Var2, tr1 tr1Var3, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4) {
        this.e = tr1Var;
        this.f12140b = rr1Var;
        this.f12143f = tr1Var2;
        this.f12142d = tr1Var3;
        this.f12144g = rr1Var2;
        this.f12145h = rr1Var3;
        this.f12141c = rr1Var4;
    }

    public w50(tr1 tr1Var, rr1 rr1Var, tr1 tr1Var2, tr1 tr1Var3, tr1 tr1Var4, tr1 tr1Var5, rr1 rr1Var2) {
        this.f12144g = tr1Var;
        this.f12140b = rr1Var;
        this.f12145h = tr1Var2;
        this.f12142d = tr1Var3;
        this.f12141c = tr1Var4;
        this.e = tr1Var5;
        this.f12143f = rr1Var2;
    }

    public w50(tr1 tr1Var, rr1 rr1Var, wr1 wr1Var, rr1 rr1Var2, o60 o60Var, rr1 rr1Var3, rr1 rr1Var4) {
        this.f12142d = tr1Var;
        this.e = rr1Var;
        this.f12140b = wr1Var;
        this.f12143f = rr1Var2;
        this.f12141c = o60Var;
        this.f12144g = rr1Var3;
        this.f12145h = rr1Var4;
    }

    public w50(tr1 tr1Var, tr1 tr1Var2, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, tr1 tr1Var3) {
        this.f12140b = tr1Var;
        this.f12142d = tr1Var2;
        this.e = rr1Var;
        this.f12141c = rr1Var2;
        this.f12143f = rr1Var3;
        this.f12144g = rr1Var4;
        this.f12145h = tr1Var3;
    }

    public w50(tr1 tr1Var, tr1 tr1Var2, tr1 tr1Var3, rr1 rr1Var, rr1 rr1Var2, u10 u10Var, rr1 rr1Var3) {
        this.f12140b = tr1Var;
        this.f12143f = tr1Var2;
        this.f12144g = tr1Var3;
        this.f12145h = rr1Var;
        this.f12141c = rr1Var2;
        this.f12142d = u10Var;
        this.e = rr1Var3;
    }

    public w50(wr1 wr1Var, o60 o60Var, wr1 wr1Var2, wr1 wr1Var3, wr1 wr1Var4, wr1 wr1Var5, wr1 wr1Var6) {
        this.f12140b = wr1Var;
        this.f12141c = o60Var;
        this.f12142d = wr1Var2;
        this.e = wr1Var3;
        this.f12143f = wr1Var4;
        this.f12144g = wr1Var5;
        this.f12145h = wr1Var6;
    }
}

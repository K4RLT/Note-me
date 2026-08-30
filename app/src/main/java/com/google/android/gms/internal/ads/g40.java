package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class g40 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6294a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f6295b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f6296c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f6297d;
    public final wr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final wr1 f6298f;

    /* renamed from: g, reason: collision with root package name */
    public final wr1 f6299g;

    /* renamed from: h, reason: collision with root package name */
    public final wr1 f6300h;
    public final wr1 i;

    /* renamed from: j, reason: collision with root package name */
    public final wr1 f6301j;

    /* renamed from: k, reason: collision with root package name */
    public final wr1 f6302k;

    public g40(o10 o10Var, rr1 rr1Var, rr1 rr1Var2, u10 u10Var, m20 m20Var, rr1 rr1Var3, rr1 rr1Var4, rr1 rr1Var5, rr1 rr1Var6, rr1 rr1Var7, wr1 wr1Var) {
        this.f6297d = o10Var;
        this.f6295b = rr1Var;
        this.e = rr1Var2;
        this.f6298f = u10Var;
        this.f6299g = rr1Var3;
        this.f6300h = rr1Var4;
        this.i = rr1Var5;
        this.f6301j = rr1Var6;
        this.f6302k = rr1Var7;
        this.f6296c = wr1Var;
    }

    public f40 a() {
        hb a10 = ((j50) this.f6297d).a();
        Context context = (Context) this.f6296c.zzb();
        rp0 rp0Var = (rp0) ((j40) this.f6299g).f7315b.f11472x;
        lo1.b(rp0Var);
        View view = (View) ((j40) this.f6300h).f7315b.f11471w;
        lo1.b(view);
        h00 h00Var = (h00) ((j40) this.i).f7315b.f11473y;
        y40 y40Var = (y40) ((j40) this.f6301j).f7315b.f11470v;
        wa0 wa0Var = (wa0) ((z90) this.e).f13125a.f12502v;
        lo1.b(wa0Var);
        return new f40(a10, context, rp0Var, view, h00Var, y40Var, wa0Var, (g90) ((rr1) this.f6295b).zzb(), rr1.b((um0) this.f6302k), (Executor) this.f6298f.zzb());
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [com.google.android.gms.internal.ads.z70, com.google.android.gms.internal.ads.um1] */
    public kg0 b() {
        y10 y10Var = (y10) this.f6296c.zzb();
        Context a10 = ((o10) this.e).a();
        l9.a a11 = ((u10) this.f6298f).a();
        aq0 a12 = ((o60) this.f6297d).a();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        return new kg0(y10Var, a10, a11, a12, wxVar, (String) ((sr1) this.f6299g).zzb(), (ur0) ((rr1) this.f6295b).zzb(), (zd0) ((rr1) this.f6300h).zzb(), new fp(12), (ScheduledExecutorService) this.i.zzb(), (xs0) this.f6301j.zzb(), new um1(((r60) this.f6302k).f10128b.zzb()));
    }

    public nj0 c() {
        return new nj0((y10) this.f6296c.zzb(), ((m60) this.f6297d).f8269b.a(), ((kk0) this.e).f7786b, ((q80) this.f6298f).f9774b, (x90) ((z20) this.f6299g).f13051b, (x70) ((w40) this.f6300h).f12132a.f18933v, (ViewGroup) ((lx0) ((z20) this.i).f13051b).f8177v, (i80) ((rr1) this.f6295b).zzb(), (qj0) ((rr1) this.f6301j).zzb(), (ii0) ((rr1) this.f6302k).zzb());
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f6294a) {
            case 0:
                return a();
            case 1:
                return new qc0(((o10) this.f6297d).a(), (Executor) ((rr1) this.f6295b).zzb(), (of) ((rr1) this.e).zzb(), ((u10) this.f6298f).a(), m20.a(), (rh0) ((rr1) this.f6299g).zzb(), (xs0) ((rr1) this.f6300h).zzb(), (be0) ((rr1) this.i).zzb(), (wh0) ((rr1) this.f6301j).zzb(), (cq0) ((rr1) this.f6302k).zzb(), (b60) this.f6296c.zzb());
            case 2:
                return new uc0((q60) ((rr1) this.f6295b).zzb(), (g70) ((rr1) this.f6297d).zzb(), (n70) this.f6296c.zzb(), (r70) ((rr1) this.f6299g).zzb(), (h80) this.e.zzb(), (e90) ((rr1) this.f6300h).zzb(), (be0) this.f6298f.zzb(), (xs0) this.i.zzb(), (rh0) this.f6301j.zzb(), (g30) ((rr1) this.f6302k).zzb());
            case 3:
                return b();
            case 4:
                return c();
            default:
                return new fz0((wx) this.f6296c.zzb(), (hz0) this.e.zzb(), (pz0) this.f6298f.zzb(), (yx0) ((tr1) this.f6297d).f11431a, (String) ((tr1) this.f6299g).f11431a, (wd) ((tr1) this.f6300h).f11431a, (xr1) this.i, (xr1) this.f6301j, (xr1) this.f6295b, (h21) this.f6302k.zzb());
        }
    }

    public g40(j50 j50Var, rr1 rr1Var, j40 j40Var, j40 j40Var2, j40 j40Var3, j40 j40Var4, z90 z90Var, rr1 rr1Var2, um0 um0Var, rr1 rr1Var3) {
        this.f6297d = j50Var;
        this.f6296c = rr1Var;
        this.f6299g = j40Var;
        this.f6300h = j40Var2;
        this.i = j40Var3;
        this.f6301j = j40Var4;
        this.e = z90Var;
        this.f6295b = rr1Var2;
        this.f6302k = um0Var;
        this.f6298f = rr1Var3;
    }

    public g40(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, rr1 rr1Var5, rr1 rr1Var6, rr1 rr1Var7, rr1 rr1Var8, rr1 rr1Var9, rr1 rr1Var10) {
        this.f6295b = rr1Var;
        this.f6297d = rr1Var2;
        this.f6296c = rr1Var3;
        this.f6299g = rr1Var4;
        this.e = rr1Var5;
        this.f6300h = rr1Var6;
        this.f6298f = rr1Var7;
        this.i = rr1Var8;
        this.f6301j = rr1Var9;
        this.f6302k = rr1Var10;
    }

    public g40(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, tr1 tr1Var, tr1 tr1Var2, tr1 tr1Var3, xr1 xr1Var, xr1 xr1Var2, xr1 xr1Var3, rr1 rr1Var4) {
        this.f6296c = rr1Var;
        this.e = rr1Var2;
        this.f6298f = rr1Var3;
        this.f6297d = tr1Var;
        this.f6299g = tr1Var2;
        this.f6300h = tr1Var3;
        this.i = xr1Var;
        this.f6301j = xr1Var2;
        this.f6295b = xr1Var3;
        this.f6302k = rr1Var4;
    }

    public g40(wr1 wr1Var, m60 m60Var, kk0 kk0Var, q80 q80Var, z20 z20Var, w40 w40Var, z20 z20Var2, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3) {
        this.f6296c = wr1Var;
        this.f6297d = m60Var;
        this.e = kk0Var;
        this.f6298f = q80Var;
        this.f6299g = z20Var;
        this.f6300h = w40Var;
        this.i = z20Var2;
        this.f6295b = rr1Var;
        this.f6301j = rr1Var2;
        this.f6302k = rr1Var3;
    }

    public g40(wr1 wr1Var, wr1 wr1Var2, wr1 wr1Var3, o60 o60Var, sr1 sr1Var, rr1 rr1Var, rr1 rr1Var2, wr1 wr1Var4, wr1 wr1Var5, r60 r60Var) {
        this.f6296c = wr1Var;
        this.e = wr1Var2;
        this.f6298f = wr1Var3;
        this.f6297d = o60Var;
        this.f6299g = sr1Var;
        this.f6295b = rr1Var;
        this.f6300h = rr1Var2;
        this.i = wr1Var4;
        this.f6301j = wr1Var5;
        this.f6302k = r60Var;
    }
}

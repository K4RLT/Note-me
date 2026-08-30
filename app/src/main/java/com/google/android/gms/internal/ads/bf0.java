package com.google.android.gms.internal.ads;
import la.a;
import g9.c3;
import l9.a;

import android.content.Context;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class bf0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4777a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f4778b;

    /* renamed from: c, reason: collision with root package name */
    public final rr1 f4779c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f4780d;
    public final wr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final wr1 f4781f;

    /* renamed from: g, reason: collision with root package name */
    public final wr1 f4782g;

    /* renamed from: h, reason: collision with root package name */
    public final wr1 f4783h;
    public final wr1 i;

    /* renamed from: j, reason: collision with root package name */
    public final wr1 f4784j;

    public bf0(rr1 rr1Var, o10 o10Var, m10 m10Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, u10 u10Var, r60 r60Var, rr1 rr1Var5) {
        this.f4778b = rr1Var;
        this.f4782g = o10Var;
        this.f4783h = m10Var;
        this.f4779c = rr1Var2;
        this.f4780d = rr1Var3;
        this.e = rr1Var4;
        this.i = u10Var;
        this.f4784j = r60Var;
        this.f4781f = rr1Var5;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.um1, com.google.android.gms.internal.ads.t80] */
    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f4777a) {
            case 0:
                Executor executor = (Executor) this.f4778b.zzb();
                Context a10 = ((o10) this.f4782g).a();
                WeakReference weakReference = (WeakReference) ((m10) this.f4783h).f8202b.e;
                lo1.b(weakReference);
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new af0(executor, a10, weakReference, wxVar, (od0) this.f4779c.zzb(), (ScheduledExecutorService) ((rr1) this.f4780d).zzb(), (ge0) ((rr1) this.e).zzb(), ((u10) this.i).a(), new um1(((r60) this.f4784j).f10128b.zzb()), (vr0) ((rr1) this.f4781f).zzb());
            case 1:
                return new cl0((Context) ((tr1) this.e).f11431a, (g9.c3) ((tr1) this.f4781f).f11431a, (String) ((tr1) this.f4782g).f11431a, (fp0) this.f4778b.zzb(), (yk0) this.f4779c.zzb(), (hp0) ((rr1) this.f4780d).zzb(), ((u10) this.f4783h).a(), (of) this.i.zzb(), (be0) this.f4784j.zzb());
            case 2:
                Context a11 = ((o10) this.e).a();
                String str = ((n50) ((u50) this.f4781f).f11551b.zzb()).f8547v.e;
                lo1.b(str);
                return new em0(a11, str, (String) this.f4782g.zzb(), (n50) this.f4778b.zzb(), (lq0) this.f4779c.zzb(), ((o60) this.f4783h).a(), (zd0) ((rr1) this.f4780d).zzb(), (q50) this.i.zzb(), ((Long) this.f4784j.zzb()).longValue());
            case 3:
                qj0 qj0Var = (qj0) this.f4778b.zzb();
                l9.a a12 = ((u10) this.f4780d).a();
                String str2 = ((n50) ((u50) this.e).f11551b.zzb()).f8547v.e;
                lo1.b(str2);
                return new ws0(qj0Var, a12, str2, (String) this.f4781f.zzb(), ((o10) this.f4782g).a(), (xp0) ((m60) this.f4783h).f8269b.f7669d, (yp0) this.f4779c.zzb(), (la.a) this.i.zzb(), (of) this.f4784j.zzb());
            default:
                return new n11((ly0) this.f4778b.zzb(), (ly0) this.f4779c.zzb(), rr1.b((rr1) this.f4780d), (ly0) ((rr1) this.e).zzb(), (ly0) ((rr1) this.f4781f).zzb(), rr1.b((rr1) this.f4782g), (File) ((rr1) this.f4783h).zzb(), (ExecutorService) this.i.zzb(), (h21) this.f4784j.zzb());
        }
    }

    public bf0(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, rr1 rr1Var5, rr1 rr1Var6, rr1 rr1Var7, tr1 tr1Var, rr1 rr1Var8) {
        this.f4778b = rr1Var;
        this.f4779c = rr1Var2;
        this.f4780d = rr1Var3;
        this.e = rr1Var4;
        this.f4781f = rr1Var5;
        this.f4782g = rr1Var6;
        this.f4783h = rr1Var7;
        this.i = tr1Var;
        this.f4784j = rr1Var8;
    }

    public bf0(rr1 rr1Var, wr1 wr1Var, u50 u50Var, wr1 wr1Var2, wr1 wr1Var3, m60 m60Var, rr1 rr1Var2, wr1 wr1Var4, wr1 wr1Var5) {
        this.f4778b = rr1Var;
        this.f4780d = wr1Var;
        this.e = u50Var;
        this.f4781f = wr1Var2;
        this.f4782g = wr1Var3;
        this.f4783h = m60Var;
        this.f4779c = rr1Var2;
        this.i = wr1Var4;
        this.f4784j = wr1Var5;
    }

    public bf0(tr1 tr1Var, tr1 tr1Var2, tr1 tr1Var3, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, u10 u10Var, rr1 rr1Var4, rr1 rr1Var5) {
        this.e = tr1Var;
        this.f4781f = tr1Var2;
        this.f4782g = tr1Var3;
        this.f4778b = rr1Var;
        this.f4779c = rr1Var2;
        this.f4780d = rr1Var3;
        this.f4783h = u10Var;
        this.i = rr1Var4;
        this.f4784j = rr1Var5;
    }

    public bf0(wr1 wr1Var, u50 u50Var, wr1 wr1Var2, rr1 rr1Var, rr1 rr1Var2, o60 o60Var, rr1 rr1Var3, wr1 wr1Var3, wr1 wr1Var4) {
        this.e = wr1Var;
        this.f4781f = u50Var;
        this.f4782g = wr1Var2;
        this.f4778b = rr1Var;
        this.f4779c = rr1Var2;
        this.f4783h = o60Var;
        this.f4780d = rr1Var3;
        this.i = wr1Var3;
        this.f4784j = wr1Var4;
    }
}

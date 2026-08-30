package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class gm implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6428a;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f6429b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f6430c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f6431d;
    public final wr1 e;

    public gm(o10 o10Var, u10 u10Var, rr1 rr1Var, rr1 rr1Var2) {
        this.f6428a = 15;
        this.f6431d = o10Var;
        this.e = u10Var;
        this.f6429b = rr1Var;
        this.f6430c = rr1Var2;
    }

    public fm a() {
        return new fm((ScheduledExecutorService) ((rr1) this.f6429b).zzb(), (s9.p) ((rr1) this.f6430c).zzb(), (s9.b) ((rr1) this.f6431d).zzb(), (fe0) ((rr1) this.e).zzb());
    }

    public fk0 b() {
        return new fk0((kr0) ((rr1) this.f6429b).zzb(), (wx) this.f6430c.zzb(), (fi0) this.f6431d.zzb(), (ji0) ((sr1) this.e).zzb(), 0);
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f6428a) {
            case 0:
                return a();
            case 1:
                k9.c0 zzb = ((l10) this.f6431d).zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((rr1) this.f6429b).zzb();
                bl0 a10 = ((r10) this.e).a();
                la.a aVar = (la.a) ((rr1) this.f6430c).zzb();
                if (((Boolean) g9.r.e.f17698c.a(sl.R)).booleanValue()) {
                    return new at0(zzb, scheduledExecutorService, a10, aVar);
                }
                return null;
            case 2:
                kr0 kr0Var = (kr0) ((rr1) this.f6429b).zzb();
                wx wxVar = (wx) this.f6430c.zzb();
                sw swVar = (sw) this.f6431d;
                return new fk0(kr0Var, wxVar, ((s30) this.e).a(), new qi0((Context) swVar.f11180b.zzb(), (b20) swVar.f11181c.f11431a, 0), 0);
            case 3:
                kr0 kr0Var2 = (kr0) ((rr1) this.f6429b).zzb();
                wx wxVar2 = (wx) this.f6430c.zzb();
                sw swVar2 = (sw) this.f6431d;
                return new fk0(kr0Var2, wxVar2, ((s30) this.e).a(), new vi0((Context) swVar2.f11180b.zzb(), (d20) swVar2.f11181c.f11431a), 0);
            case 4:
                return new t40(((g50) this.e).a(), (a70) ((rr1) this.f6429b).zzb(), (o70) ((rr1) this.f6430c).zzb(), (u70) ((rr1) this.f6431d).zzb());
            case 5:
                return new p50((la.a) this.f6430c.zzb(), (q50) this.f6431d.zzb(), ((o60) this.e).a(), (String) ((rr1) this.f6429b).zzb());
            case 6:
                kr0 kr0Var3 = (kr0) ((rr1) this.f6429b).zzb();
                wx wxVar3 = (wx) this.f6430c.zzb();
                sw swVar3 = (sw) this.f6431d;
                return new fk0(kr0Var3, wxVar3, ((s30) this.e).a(), new qi0((Context) swVar3.f11180b.zzb(), (h20) swVar3.f11181c.f11431a, 1), 0);
            case 7:
                gd0 gd0Var = (gd0) this.f6430c.zzb();
                rc0 rc0Var = (rc0) ((ea0) this.f6431d).f5627b.f11471w;
                lo1.b(rc0Var);
                x30 x30Var = (x30) ((rr1) this.f6429b).zzb();
                ca0 ca0Var = (ca0) ((fa0) this.e).f6000b.zzb();
                lo1.b(ca0Var);
                return new ib0(gd0Var, rc0Var, x30Var, ca0Var);
            case 8:
                return new lc0(((o10) this.f6429b).a(), ((z20) this.f6430c).a(), ((bb0) this.f6431d).a(), (na0) ((um0) this.e).zzb());
            case 9:
                return new mc0((String) ((g50) this.f6429b).f6306b.f6874x, (na0) ((um0) this.f6430c).zzb(), ((z20) this.f6431d).a(), (be0) this.e.zzb());
            case 10:
                kr0 kr0Var4 = (kr0) ((rr1) this.f6429b).zzb();
                wx wxVar4 = (wx) this.f6430c.zzb();
                sw swVar4 = (sw) this.f6431d;
                return new fk0(kr0Var4, wxVar4, ((s30) this.e).a(), new qi0((Context) swVar4.f11180b.zzb(), (k20) swVar4.f11181c.f11431a, 2), 0);
            case 11:
                return new zf0((yf0) ((rr1) this.f6429b).zzb(), (be0) ((rr1) this.f6430c).zzb(), ((o10) this.f6431d).a(), ((l10) this.e).zzb());
            case 12:
                return new wh0(((o10) this.f6431d).a(), (rh0) ((rr1) this.f6429b).zzb(), (l9.l) this.e.zzb(), (be0) ((rr1) this.f6430c).zzb());
            case 13:
                return b();
            case 14:
                return new fk0((kr0) ((rr1) this.f6429b).zzb(), (wx) this.f6430c.zzb(), (yl) ((kk0) this.f6431d).f7786b.f7466v, new hx0(26, (h20) ((pe0) this.e).f9508b.f11431a), 1);
            case 15:
                return new vr0(((o10) this.f6431d).a(), ((u10) this.e).a(), (nd0) ((rr1) this.f6429b).zzb(), new fp(12), (h10) ((rr1) this.f6430c).zzb());
            case 16:
                return new it0((pt0) ((rr1) this.f6429b).zzb(), ((r10) this.f6431d).a(), ((o10) this.e).a(), (la.a) ((rr1) this.f6430c).zzb());
            case 17:
                return new oy0(rr1.b((xr1) this.f6430c), rr1.b((xr1) this.f6431d), (ExecutorService) ((tr1) this.e).f11431a, rr1.b((rr1) this.f6429b));
            default:
                rr1 rr1Var = (rr1) this.f6431d;
                rr1 rr1Var2 = (rr1) this.f6430c;
                pr1 b10 = rr1.b((rr1) this.f6429b);
                pr1 b11 = rr1.b(rr1Var2);
                pr1 b12 = rr1.b(rr1Var);
                rx0 rx0Var = (rx0) this.e.zzb();
                return new i01(b10, b11, b12, rx0Var.W().z(), rx0Var.W().C());
        }
    }

    public gm(g50 g50Var, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3) {
        this.f6428a = 4;
        this.e = g50Var;
        this.f6429b = rr1Var;
        this.f6430c = rr1Var2;
        this.f6431d = rr1Var3;
    }

    public gm(rr1 rr1Var, r10 r10Var, o10 o10Var, rr1 rr1Var2) {
        this.f6428a = 16;
        this.f6429b = rr1Var;
        this.f6431d = r10Var;
        this.e = o10Var;
        this.f6430c = rr1Var2;
    }

    public gm(rr1 rr1Var, ea0 ea0Var, rr1 rr1Var2, fa0 fa0Var) {
        this.f6428a = 7;
        this.f6430c = rr1Var;
        this.f6431d = ea0Var;
        this.f6429b = rr1Var2;
        this.e = fa0Var;
    }

    public /* synthetic */ gm(sr1 sr1Var, rr1 rr1Var, wr1 wr1Var, rr1 rr1Var2, int i) {
        this.f6428a = i;
        this.f6431d = sr1Var;
        this.f6429b = rr1Var;
        this.e = wr1Var;
        this.f6430c = rr1Var2;
    }

    public /* synthetic */ gm(wr1 wr1Var, wr1 wr1Var2, sr1 sr1Var, rr1 rr1Var, int i) {
        this.f6428a = i;
        this.f6430c = wr1Var;
        this.f6431d = wr1Var2;
        this.e = sr1Var;
        this.f6429b = rr1Var;
    }

    public /* synthetic */ gm(wr1 wr1Var, wr1 wr1Var2, wr1 wr1Var3, wr1 wr1Var4, int i) {
        this.f6428a = i;
        this.f6429b = wr1Var;
        this.f6430c = wr1Var2;
        this.f6431d = wr1Var3;
        this.e = wr1Var4;
    }
}

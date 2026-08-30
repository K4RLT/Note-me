package com.google.android.gms.internal.ads;
import s9.b;
import s9.i;
import s9.p;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class vj0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11911a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f11912b;

    /* renamed from: c, reason: collision with root package name */
    public final rr1 f11913c;

    /* renamed from: d, reason: collision with root package name */
    public final rr1 f11914d;
    public final rr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final rr1 f11915f;

    /* renamed from: g, reason: collision with root package name */
    public final rr1 f11916g;

    /* renamed from: h, reason: collision with root package name */
    public final rr1 f11917h;
    public final rr1 i;

    /* renamed from: j, reason: collision with root package name */
    public final wr1 f11918j;

    /* renamed from: k, reason: collision with root package name */
    public final wr1 f11919k;

    /* renamed from: l, reason: collision with root package name */
    public final wr1 f11920l;

    /* renamed from: m, reason: collision with root package name */
    public final sr1 f11921m;

    public vj0(tr1 tr1Var, o10 o10Var, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, rr1 rr1Var5, u10 u10Var, gm gmVar, rr1 rr1Var6, rr1 rr1Var7, rr1 rr1Var8) {
        this.f11918j = tr1Var;
        this.f11919k = o10Var;
        this.f11912b = rr1Var;
        this.f11913c = rr1Var2;
        this.f11914d = rr1Var3;
        this.e = rr1Var4;
        this.f11915f = rr1Var5;
        this.f11920l = u10Var;
        this.f11921m = gmVar;
        this.f11916g = rr1Var6;
        this.f11917h = rr1Var7;
        this.i = rr1Var8;
    }

    public uj0 a() {
        Context a10 = ((o10) this.f11918j).a();
        kr0 kr0Var = (kr0) this.f11912b.zzb();
        qj0 qj0Var = (qj0) this.f11913c.zzb();
        u60 u60Var = (u60) this.f11914d.zzb();
        ws0 ws0Var = (ws0) this.e.zzb();
        xs0 xs0Var = (xs0) this.f11919k.zzb();
        b50 b50Var = (b50) this.f11915f.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        return new uj0(a10, kr0Var, qj0Var, u60Var, ws0Var, xs0Var, b50Var, wxVar, (ScheduledExecutorService) this.f11920l.zzb(), (ii0) this.f11916g.zzb(), (ur0) this.f11917h.zzb(), ((h30) this.f11921m).a(), (zd0) this.i.zzb());
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f11911a) {
            case 0:
                return a();
            default:
                y10 y10Var = (y10) ((tr1) this.f11918j).f11431a;
                Context a10 = ((o10) this.f11919k).a();
                of ofVar = (of) this.f11912b.zzb();
                jq0 jq0Var = (jq0) this.f11913c.zzb();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new s9.i(y10Var, a10, ofVar, jq0Var, wxVar, (ScheduledExecutorService) this.f11914d.zzb(), (fe0) this.e.zzb(), (xs0) this.f11915f.zzb(), ((u10) this.f11920l).a(), ((gm) this.f11921m).a(), (cq0) this.f11916g.zzb(), (s9.p) this.f11917h.zzb(), (s9.b) this.i.zzb());
        }
    }

    public vj0(wr1 wr1Var, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, wr1 wr1Var2, rr1 rr1Var5, wr1 wr1Var3, rr1 rr1Var6, rr1 rr1Var7, h30 h30Var, rr1 rr1Var8) {
        this.f11918j = wr1Var;
        this.f11912b = rr1Var;
        this.f11913c = rr1Var2;
        this.f11914d = rr1Var3;
        this.e = rr1Var4;
        this.f11919k = wr1Var2;
        this.f11915f = rr1Var5;
        this.f11920l = wr1Var3;
        this.f11916g = rr1Var6;
        this.f11917h = rr1Var7;
        this.f11921m = h30Var;
        this.i = rr1Var8;
    }
}

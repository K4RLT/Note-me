package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class s30 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10483a;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f10484b;

    /* renamed from: c, reason: collision with root package name */
    public final rr1 f10485c;

    public /* synthetic */ s30(rr1 rr1Var, wr1 wr1Var, int i) {
        this.f10483a = i;
        this.f10485c = rr1Var;
        this.f10484b = wr1Var;
    }

    public zj0 a() {
        return new zj0((mk0) this.f10485c.zzb(), (od0) this.f10484b.zzb());
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f10483a) {
            case 0:
                return new r30(((o10) this.f10484b).a(), (yh) this.f10485c.zzb());
            case 1:
                return new n50((la.a) this.f10484b.zzb(), (lx) this.f10485c.zzb());
            case 2:
                return new f9.a((Context) this.f10484b.zzb(), (mw) this.f10485c.zzb());
            case 3:
                return new c90((c80) this.f10485c.zzb(), (Executor) this.f10484b.zzb());
            case 4:
                return new c90((c80) this.f10485c.zzb(), (Executor) this.f10484b.zzb());
            case 5:
                return new c90((c80) this.f10485c.zzb(), (Executor) this.f10484b.zzb());
            case 6:
                return new c90((c80) this.f10485c.zzb(), (Executor) this.f10484b.zzb());
            case 7:
                return new c90((c80) this.f10485c.zzb(), (Executor) this.f10484b.zzb());
            case 8:
                return new c90((c80) this.f10485c.zzb(), (Executor) this.f10484b.zzb());
            case 9:
                return new c90((c80) this.f10485c.zzb(), (Executor) this.f10484b.zzb());
            case 10:
                return new c90((c80) this.f10485c.zzb(), (Executor) this.f10484b.zzb());
            case 11:
                return a();
            case 12:
                ac.b bVar = (ac.b) this.f10485c.zzb();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new rl0(0, bVar, wxVar, (ScheduledExecutorService) this.f10484b.zzb());
            default:
                return an1.q((Context) this.f10484b.zzb(), (cv0) this.f10485c.zzb());
        }
    }

    public /* synthetic */ s30(wr1 wr1Var, rr1 rr1Var, int i) {
        this.f10483a = i;
        this.f10484b = wr1Var;
        this.f10485c = rr1Var;
    }
}

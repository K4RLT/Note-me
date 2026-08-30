package com.google.android.gms.internal.ads;
import ac.b;
import g9.r;
import la.a;
import r.e;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class nl0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8752a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final long f8753b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8754c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8755d;

    public nl0(qn0 qn0Var, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.f8754c = qn0Var;
        this.f8753b = j10;
        this.f8755d = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final ac.b zza() {
        TimeUnit timeUnit;
        switch (this.f8752a) {
            case 0:
                la.a aVar = (la.a) this.f8754c;
                aq0 aq0Var = (aq0) this.f8755d;
                aVar.getClass();
                return ed1.e(new ol0(aq0Var, System.currentTimeMillis(), this.f8753b));
            default:
                ac.b zza = ((qn0) this.f8754c).zza();
                if (((Boolean) g9.r.e.f17698c.a(sl.f10646a3)).booleanValue()) {
                    timeUnit = TimeUnit.MICROSECONDS;
                } else {
                    timeUnit = TimeUnit.MILLISECONDS;
                }
                long j10 = this.f8753b;
                if (j10 > 0) {
                    zza = ed1.Y(zza, j10, timeUnit, (ScheduledExecutorService) this.f8755d);
                }
                return ed1.U(zza, Throwable.class, new dq(8, this), xx.f12657h);
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        switch (this.f8752a) {
            case 0:
                return 4;
            default:
                return ((qn0) this.f8754c).zzb();
        }
    }

    public nl0(la.a aVar, aq0 aq0Var, long j10) {
        this.f8754c = aVar;
        this.f8755d = aq0Var;
        this.f8753b = j10;
    }
}

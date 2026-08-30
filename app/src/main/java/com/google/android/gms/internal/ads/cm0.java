package com.google.android.gms.internal.ads;
import ac.b;
import g9.r;
import ib.o;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class cm0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final px f5122a;

    /* renamed from: b, reason: collision with root package name */
    public final x90 f5123b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f5124c;

    /* renamed from: d, reason: collision with root package name */
    public final wx f5125d;
    public final Context e;

    public cm0(Context context, px pxVar, ScheduledExecutorService scheduledExecutorService, wx wxVar) {
        if (!((Boolean) r.e.f17698c.a(sl.R3)).booleanValue()) {
            this.f5123b = new x90(context, 19);
        }
        this.e = context;
        this.f5122a = pxVar;
        this.f5124c = scheduledExecutorService;
        this.f5125d = wxVar;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final b zza() {
        o a10;
        nl nlVar = sl.N3;
        r rVar = r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            if (!((Boolean) rVar.f17698c.a(sl.S3)).booleanValue()) {
                if (!((Boolean) rVar.f17698c.a(sl.O3)).booleanValue()) {
                    return ed1.d0(xy.q(this.f5123b.a()), i6.f7008m, xx.f12657h);
                }
                if (((Boolean) rVar.f17698c.a(sl.R3)).booleanValue()) {
                    an1.h(this.e, false);
                    synchronized (an1.G) {
                        a10 = an1.E;
                    }
                } else {
                    a10 = this.f5123b.a();
                }
                if (a10 == null) {
                    return ed1.e(new dm0(null, -1, 0));
                }
                b c02 = ed1.c0(xy.q(a10), x20.f12435j, xx.f12657h);
                if (((Boolean) rVar.f17698c.a(sl.P3)).booleanValue()) {
                    c02 = ed1.Y(c02, ((Long) rVar.f17698c.a(sl.Q3)).longValue(), TimeUnit.MILLISECONDS, this.f5124c);
                }
                return ed1.S(c02, Exception.class, new cv(4, this), this.f5125d);
            }
        }
        return ed1.e(new dm0(null, -1, 0));
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        return 11;
    }
}

package com.google.android.gms.internal.ads;
import g9.r;
import g9.y1;
import r.e;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class y60 extends um1 implements w60 {

    /* renamed from: w, reason: collision with root package name */
    public final ScheduledExecutorService f12799w;

    /* renamed from: x, reason: collision with root package name */
    public ScheduledFuture f12800x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12801y;

    public y60(x60 x60Var, Set set, wx wxVar, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f12801y = false;
        this.f12799w = scheduledExecutorService;
        L1(x60Var, wxVar);
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void F(g9.y1 y1Var) {
        P1(new t60(1, y1Var));
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void N(r90 r90Var) {
        if (this.f12801y) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f12800x;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        P1(new lx0(18, r90Var));
    }

    public final void U1() {
        this.f12800x = this.f12799w.schedule(new e40(5, this), ((Integer) g9.r.e.f17698c.a(sl.f10702dc)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void a() {
        P1(fp.A);
    }
}

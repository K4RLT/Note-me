package com.google.android.gms.internal.ads;
import ac.b;
import g9.r;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class eo0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final px f5738a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5739b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f5740c;

    /* renamed from: d, reason: collision with root package name */
    public final wx f5741d;
    public final int e;

    public eo0(px pxVar, boolean z3, wx wxVar, ScheduledExecutorService scheduledExecutorService, int i) {
        this.f5738a = pxVar;
        this.f5739b = z3;
        this.f5741d = wxVar;
        this.f5740c = scheduledExecutorService;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final b zza() {
        nl nlVar = sl.U7;
        r rVar = r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && this.f5739b) {
            return ed1.e(new ql0(null, 6));
        }
        if (!Arrays.asList(((String) rVar.f17698c.a(sl.W7)).split(",")).contains(String.valueOf(this.e))) {
            return ed1.e(new ql0(null, 6));
        }
        v81 v81Var = v81.f11836v;
        i6 i6Var = i6.f7011p;
        wx wxVar = this.f5741d;
        return ed1.S(ed1.Y(ed1.d0(v81Var, i6Var, wxVar), ((Long) jn.f7486b.p()).longValue(), TimeUnit.MILLISECONDS, this.f5740c), Exception.class, new cv(6, this), wxVar);
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        return 50;
    }
}

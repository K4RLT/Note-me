package com.google.android.gms.internal.ads;
import ac.b;
import f9.k;
import g9.r;
import k9.f0;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class jg0 implements ug0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f7439h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    public final tw f7440a;

    /* renamed from: b, reason: collision with root package name */
    public final wx f7441b;

    /* renamed from: c, reason: collision with root package name */
    public final aq0 f7442c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f7443d;
    public final lh0 e;

    /* renamed from: f, reason: collision with root package name */
    public final ur0 f7444f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f7445g;

    public jg0(Context context, aq0 aq0Var, tw twVar, wx wxVar, ScheduledExecutorService scheduledExecutorService, lh0 lh0Var, ur0 ur0Var) {
        this.f7445g = context;
        this.f7442c = aq0Var;
        this.f7440a = twVar;
        this.f7441b = wxVar;
        this.f7443d = scheduledExecutorService;
        this.e = lh0Var;
        this.f7444f = ur0Var;
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final b a(dv dvVar) {
        b U;
        tw twVar = this.f7440a;
        wx wxVar = (wx) twVar.f11471w;
        String str = dvVar.f5529x;
        f0 f0Var = k.C.f16813c;
        if (f0.e(str)) {
            U = ed1.A(new cg0(1));
        } else {
            U = ed1.U(((wx) twVar.f11470v).j(new xe(twVar, 5, dvVar)), ExecutionException.class, x20.f12430c, wxVar);
        }
        h71 U2 = ed1.U(U, vg0.class, new eg0(twVar, dvVar, Binder.getCallingUid(), 0), wxVar);
        rr0 d2 = rr0.d(this.f7445g, 11);
        ed1.v(U2, d2);
        b c02 = ed1.c0(U2, new dq(5, this), this.f7441b);
        if (((Boolean) r.e.f17698c.a(sl.f11045z6)).booleanValue()) {
            c02 = ed1.U(ed1.Y(c02, ((Integer) r2.f17698c.a(sl.A6)).intValue(), TimeUnit.SECONDS, this.f7443d), TimeoutException.class, x20.f12431d, xx.f12657h);
        }
        ed1.V(c02, this.f7444f, d2, false);
        c02.a(new t81(c02, 0, new jk0(21, this)), xx.f12657h);
        return c02;
    }
}

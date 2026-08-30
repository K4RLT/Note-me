package com.google.android.gms.internal.ads;
import g9.b3;
import g9.c3;
import g9.d2;
import g9.i;
import g9.k0;
import g9.n;
import g9.p;
import g9.y2;
import l9.i;
import m9.a;
import oa.b;
import z8.l;
import z8.u;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class pq extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9581a;

    /* renamed from: b, reason: collision with root package name */
    public final b3 f9582b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f9583c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9584d;

    public pq(Context context, String str) {
        tr trVar = new tr();
        this.f9584d = System.currentTimeMillis();
        new AtomicLong();
        this.f9581a = context;
        new AtomicReference(str);
        this.f9582b = b3.f17575u;
        n nVar = p.f17688g.f17690b;
        c3 c3Var = new c3();
        nVar.getClass();
        this.f9583c = (k0) new i(nVar, context, c3Var, str, trVar).d(context, false);
    }

    @Override // a
    public final void b(Activity activity) {
        if (activity == null) {
            i.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            k0 k0Var = this.f9583c;
            if (k0Var != null) {
                k0Var.r4(new b(activity));
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    public final void c(d2 d2Var, u uVar) {
        try {
            k0 k0Var = this.f9583c;
            if (k0Var != null) {
                d2Var.f17607m = this.f9584d;
                b3 b3Var = this.f9582b;
                Context context = this.f9581a;
                b3Var.getClass();
                k0Var.P0(b3.a(context, d2Var), new y2(uVar, this));
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
            uVar.a(new l(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}

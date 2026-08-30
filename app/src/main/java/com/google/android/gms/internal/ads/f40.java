package com.google.android.gms.internal.ads;
import g9.c3;
import g9.r;
import r.e;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f40 extends z40 {

    /* renamed from: l, reason: collision with root package name */
    public final Context f5920l;

    /* renamed from: m, reason: collision with root package name */
    public final View f5921m;

    /* renamed from: n, reason: collision with root package name */
    public final h00 f5922n;

    /* renamed from: o, reason: collision with root package name */
    public final rp0 f5923o;

    /* renamed from: p, reason: collision with root package name */
    public final y40 f5924p;

    /* renamed from: q, reason: collision with root package name */
    public final wa0 f5925q;

    /* renamed from: r, reason: collision with root package name */
    public final g90 f5926r;

    /* renamed from: s, reason: collision with root package name */
    public final pr1 f5927s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f5928t;

    /* renamed from: u, reason: collision with root package name */
    public g9.c3 f5929u;

    public f40(hb hbVar, Context context, rp0 rp0Var, View view, h00 h00Var, y40 y40Var, wa0 wa0Var, g90 g90Var, pr1 pr1Var, Executor executor) {
        super(hbVar);
        this.f5920l = context;
        this.f5921m = view;
        this.f5922n = h00Var;
        this.f5923o = rp0Var;
        this.f5924p = y40Var;
        this.f5925q = wa0Var;
        this.f5926r = g90Var;
        this.f5927s = pr1Var;
        this.f5928t = executor;
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final void a() {
        this.f5928t.execute(new e40(0, this));
        super.a();
    }

    public final rp0 c() {
        g9.c3 c3Var = this.f5929u;
        if (c3Var != null) {
            if (c3Var.C) {
                return new rp0(-3, 0, true);
            }
            return new rp0(c3Var.f17593y, c3Var.f17590v, false);
        }
        qp0 qp0Var = this.f13068b;
        if (qp0Var.f9929c0) {
            for (String str : qp0Var.f9924a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f5921m;
            return new rp0(view.getWidth(), view.getHeight(), false);
        }
        return (rp0) qp0Var.f9954r.get(0);
    }

    public final int d() {
        nl nlVar = sl.W8;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && this.f13068b.f9936g0) {
            if (!((Boolean) rVar.f17698c.a(sl.X8)).booleanValue()) {
                return 0;
            }
        }
        return ((sp0) this.f13067a.f12313b.f11471w).f11092c;
    }
}

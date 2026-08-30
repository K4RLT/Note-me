package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes.dex */
public final class a40 extends z40 {

    /* renamed from: l, reason: collision with root package name */
    public final h00 f4344l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4345m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f4346n;

    /* renamed from: o, reason: collision with root package name */
    public final j6.e f4347o;

    /* renamed from: p, reason: collision with root package name */
    public final s90 f4348p;

    /* renamed from: q, reason: collision with root package name */
    public final jr0 f4349q;

    /* renamed from: r, reason: collision with root package name */
    public final y60 f4350r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f4351s;

    /* renamed from: t, reason: collision with root package name */
    public final sx f4352t;

    /* renamed from: u, reason: collision with root package name */
    public final be0 f4353u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4354v;

    public a40(hb hbVar, Context context, h00 h00Var, int i, j6.e eVar, s90 s90Var, jr0 jr0Var, y60 y60Var, sx sxVar, be0 be0Var) {
        super(hbVar);
        this.f4354v = false;
        this.f4344l = h00Var;
        this.f4346n = context;
        this.f4345m = i;
        this.f4347o = eVar;
        this.f4348p = s90Var;
        this.f4349q = jr0Var;
        this.f4350r = y60Var;
        this.f4351s = ((Boolean) g9.r.e.f17698c.a(sl.f10937s6)).booleanValue();
        this.f4352t = sxVar;
        this.f4353u = be0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [android.content.Context] */
    public final void c(Activity activity, boolean z3) {
        h00 h00Var;
        qp0 J;
        int i;
        jr0 jr0Var = this.f4349q;
        y60 y60Var = this.f4350r;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f4346n;
        }
        boolean z9 = this.f4351s;
        if (z9) {
            jr0Var.P1(v80.f11830v);
        }
        f9.k kVar = f9.k.C;
        k9.f0 f0Var = kVar.f16813c;
        s90 s90Var = this.f4348p;
        if (!k9.f0.m(s90Var.zzb())) {
            nl nlVar = sl.f10769hf;
            g9.r rVar = g9.r.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                k9.f0.l(activity2, this.f13068b, this.f4353u);
            }
            if (((Boolean) rVar.f17698c.a(sl.f10787j1)).booleanValue() && k9.f0.g(activity2)) {
                int i10 = k9.a0.f19634b;
                l9.i.f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                y60Var.a();
                if (((Boolean) rVar.f17698c.a(sl.f10804k1)).booleanValue()) {
                    new gv0(activity2.getApplicationContext(), kVar.f16828t.a()).a(((sp0) this.f13067a.f12313b.f11471w).f11091b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) g9.r.e.f17698c.a(sl.f10912qd)).booleanValue() && (h00Var = this.f4344l) != null && (J = h00Var.J()) != null && J.f9955r0) {
            int i11 = J.f9957s0;
            sx sxVar = this.f4352t;
            synchronized (sxVar.f11183u) {
                qx qxVar = sxVar.f11186x;
                synchronized (qxVar.f10015f) {
                    i = qxVar.f10020l;
                }
            }
            if (i11 != i) {
                int i12 = k9.a0.f19634b;
                l9.i.f("The app open consent form has been shown.");
                y60Var.F(x21.J(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f4354v) {
            int i13 = k9.a0.f19634b;
            l9.i.f("App open interstitial ad is already visible.");
            y60Var.F(x21.J(10, null, null));
        }
        if (!this.f4354v) {
            try {
                s90Var.e(z3, activity2, y60Var);
                if (z9) {
                    jr0Var.U1();
                }
                this.f4354v = true;
            } catch (r90 e) {
                y60Var.N(e);
            }
        }
    }

    public final void d() {
        e70 e70Var = this.f13069c;
        e70Var.getClass();
        e70Var.P1(new ll(null, 2));
        h00 h00Var = this.f4344l;
        if (h00Var != null) {
            h00Var.destroy();
        }
    }

    public final void e(int i, long j10) {
        String str;
        j6.e eVar = this.f4347o;
        j6.s a10 = ((be0) eVar.f18918u).a();
        a10.k("gqi", ((sp0) ((wp0) eVar.f18919v).f12313b.f11471w).f11091b);
        a10.k("action", "ad_closed");
        a10.k("show_time", String.valueOf(j10));
        a10.k("ad_format", "app_open_ad");
        int i10 = i - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            str = "u";
                        } else {
                            str = "ac";
                        }
                    } else {
                        str = "cb";
                    }
                } else {
                    str = "cc";
                }
            } else {
                str = "bb";
            }
        } else {
            str = "h";
        }
        a10.k("acr", str);
        a10.l();
    }
}

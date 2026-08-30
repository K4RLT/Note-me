package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class n90 extends z40 {

    /* renamed from: l, reason: collision with root package name */
    public final Context f8600l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f8601m;

    /* renamed from: n, reason: collision with root package name */
    public final jr0 f8602n;

    /* renamed from: o, reason: collision with root package name */
    public final s90 f8603o;

    /* renamed from: p, reason: collision with root package name */
    public final h50 f8604p;

    /* renamed from: q, reason: collision with root package name */
    public final gv0 f8605q;

    /* renamed from: r, reason: collision with root package name */
    public final y60 f8606r;

    /* renamed from: s, reason: collision with root package name */
    public final sx f8607s;

    /* renamed from: t, reason: collision with root package name */
    public final be0 f8608t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8609u;

    public n90(hb hbVar, Context context, h00 h00Var, jr0 jr0Var, s90 s90Var, h50 h50Var, gv0 gv0Var, y60 y60Var, sx sxVar, be0 be0Var) {
        super(hbVar);
        this.f8609u = false;
        this.f8600l = context;
        this.f8601m = new WeakReference(h00Var);
        this.f8602n = jr0Var;
        this.f8603o = s90Var;
        this.f8604p = h50Var;
        this.f8605q = gv0Var;
        this.f8606r = y60Var;
        this.f8607s = sxVar;
        this.f8608t = be0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z3) {
        qp0 J;
        int i;
        Context context = this.f8600l;
        y60 y60Var = this.f8606r;
        jr0 jr0Var = this.f8602n;
        jr0Var.P1(v80.f11830v);
        k9.f0 f0Var = f9.k.C.f16813c;
        s90 s90Var = this.f8603o;
        if (!k9.f0.m(s90Var.zzb())) {
            nl nlVar = sl.f10769hf;
            g9.r rVar = g9.r.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                k9.f0.l(context, this.f13068b, this.f8608t);
            }
            if (((Boolean) rVar.f17698c.a(sl.f10787j1)).booleanValue() && k9.f0.g(context)) {
                int i10 = k9.a0.f19634b;
                l9.i.f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                y60Var.a();
                if (((Boolean) rVar.f17698c.a(sl.f10804k1)).booleanValue()) {
                    this.f8605q.a(((sp0) this.f13067a.f12313b.f11471w).f11091b);
                    return;
                }
                return;
            }
        }
        h00 h00Var = (h00) this.f8601m.get();
        if (((Boolean) g9.r.e.f17698c.a(sl.f10912qd)).booleanValue() && h00Var != null && (J = h00Var.J()) != null && J.f9955r0) {
            int i11 = J.f9957s0;
            sx sxVar = this.f8607s;
            synchronized (sxVar.f11183u) {
                qx qxVar = sxVar.f11186x;
                synchronized (qxVar.f10015f) {
                    i = qxVar.f10020l;
                }
            }
            if (i11 != i) {
                int i12 = k9.a0.f19634b;
                l9.i.f("The interstitial consent form has been shown.");
                y60Var.F(x21.J(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f8609u) {
            int i13 = k9.a0.f19634b;
            l9.i.f("The interstitial ad has been shown.");
            y60Var.F(x21.J(10, null, null));
        }
        if (!this.f8609u) {
            if (activity == null) {
                activity = context;
            }
            try {
                s90Var.e(z3, activity, y60Var);
                jr0Var.U1();
                this.f8609u = true;
            } catch (r90 e) {
                y60Var.N(e);
            }
        }
    }

    public final void finalize() {
        try {
            h00 h00Var = (h00) this.f8601m.get();
            if (((Boolean) g9.r.e.f17698c.a(sl.D7)).booleanValue()) {
                if (!this.f8609u && h00Var != null) {
                    xx.f12655f.execute(new p00(h00Var, 4));
                }
            } else if (h00Var != null) {
                h00Var.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}

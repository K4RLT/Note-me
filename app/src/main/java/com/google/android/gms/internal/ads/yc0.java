package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import k9.a0;
import k9.f0;
import l9.i;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class yc0 extends z40 {

    /* renamed from: l, reason: collision with root package name */
    public final Context f12841l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f12842m;

    /* renamed from: n, reason: collision with root package name */
    public final s90 f12843n;

    /* renamed from: o, reason: collision with root package name */
    public final jr0 f12844o;

    /* renamed from: p, reason: collision with root package name */
    public final y60 f12845p;

    /* renamed from: q, reason: collision with root package name */
    public final n70 f12846q;

    /* renamed from: r, reason: collision with root package name */
    public final h50 f12847r;

    /* renamed from: s, reason: collision with root package name */
    public final jw f12848s;

    /* renamed from: t, reason: collision with root package name */
    public final gv0 f12849t;

    /* renamed from: u, reason: collision with root package name */
    public final yp0 f12850u;

    /* renamed from: v, reason: collision with root package name */
    public final be0 f12851v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12852w;

    public yc0(hb hbVar, Context context, h00 h00Var, s90 s90Var, jr0 jr0Var, y60 y60Var, n70 n70Var, h50 h50Var, qp0 qp0Var, gv0 gv0Var, yp0 yp0Var, be0 be0Var) {
        super(hbVar);
        String str;
        int i;
        this.f12852w = false;
        this.f12841l = context;
        this.f12843n = s90Var;
        this.f12842m = new WeakReference(h00Var);
        this.f12844o = jr0Var;
        this.f12845p = y60Var;
        this.f12846q = n70Var;
        this.f12847r = h50Var;
        this.f12849t = gv0Var;
        qv qvVar = qp0Var.f9944l;
        if (qvVar != null) {
            str = qvVar.f9994u;
        } else {
            str = "";
        }
        if (qvVar != null) {
            i = qvVar.f9995v;
        } else {
            i = 1;
        }
        this.f12848s = new jw(str, i);
        this.f12850u = yp0Var;
        this.f12851v = be0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z3) {
        f0 f0Var = k.C.f16813c;
        s90 s90Var = this.f12843n;
        boolean m4 = f0.m(s90Var.zzb());
        Context context = this.f12841l;
        y60 y60Var = this.f12845p;
        if (!m4) {
            nl nlVar = sl.f10769hf;
            r rVar = r.e;
            ql qlVar = rVar.f17698c;
            ql qlVar2 = rVar.f17698c;
            if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
                f0.l(context, this.f13068b, this.f12851v);
            }
            if (((Boolean) qlVar2.a(sl.f10787j1)).booleanValue() && f0.g(context)) {
                int i = a0.f19634b;
                i.f("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                y60Var.a();
                if (((Boolean) qlVar2.a(sl.f10804k1)).booleanValue()) {
                    this.f12849t.a(((sp0) this.f13067a.f12313b.f11471w).f11091b);
                    return;
                }
                return;
            }
        }
        if (this.f12852w) {
            int i10 = a0.f19634b;
            i.f("The rewarded ad have been showed.");
            y60Var.F(x21.J(10, null, null));
            return;
        }
        this.f12852w = true;
        v80 v80Var = v80.f11830v;
        jr0 jr0Var = this.f12844o;
        jr0Var.P1(v80Var);
        if (activity == null) {
            activity = context;
        }
        try {
            s90Var.e(z3, activity, y60Var);
            jr0Var.U1();
        } catch (r90 e) {
            y60Var.N(e);
        }
    }

    public final void finalize() {
        try {
            h00 h00Var = (h00) this.f12842m.get();
            if (((Boolean) r.e.f17698c.a(sl.D7)).booleanValue()) {
                if (!this.f12852w && h00Var != null) {
                    xx.f12655f.execute(new p00(h00Var, 6));
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

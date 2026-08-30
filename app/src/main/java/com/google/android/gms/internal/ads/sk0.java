package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* loaded from: classes.dex */
public final class sk0 extends g9.j0 {

    /* renamed from: u, reason: collision with root package name */
    public final Context f10632u;

    /* renamed from: v, reason: collision with root package name */
    public final g9.x f10633v;

    /* renamed from: w, reason: collision with root package name */
    public final aq0 f10634w;

    /* renamed from: x, reason: collision with root package name */
    public final f40 f10635x;

    /* renamed from: y, reason: collision with root package name */
    public final FrameLayout f10636y;

    /* renamed from: z, reason: collision with root package name */
    public final be0 f10637z;

    public sk0(Context context, g9.x xVar, aq0 aq0Var, f40 f40Var, be0 be0Var) {
        this.f10632u = context;
        this.f10633v = xVar;
        this.f10634w = aq0Var;
        this.f10635x = f40Var;
        this.f10637z = be0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View view = f40Var.f5921m;
        k9.f0 f0Var = f9.k.C.f16813c;
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(m().f17591w);
        frameLayout.setMinimumWidth(m().f17594z);
        this.f10636y = frameLayout;
    }

    @Override // g9.k0
    public final g9.v1 A() {
        return this.f10635x.f13071f;
    }

    @Override // g9.k0
    public final void B0(long j10) {
        c60 c60Var = this.f10635x.f13074j;
        if (c60Var != null) {
            c60Var.a(j10);
        }
    }

    @Override // g9.k0
    public final void F1(g9.q1 q1Var) {
        if (((Boolean) g9.r.e.f17698c.a(sl.Yc)).booleanValue()) {
            yk0 yk0Var = this.f10634w.f4580c;
            if (yk0Var != null) {
                try {
                    if (!q1Var.b()) {
                        this.f10637z.b();
                    }
                } catch (RemoteException e) {
                    int i = k9.a0.f19634b;
                    l9.i.b("Error in making CSI ping for reporting paid event callback", e);
                }
                yk0Var.f12896w.set(q1Var);
                return;
            }
            return;
        }
        int i10 = k9.a0.f19634b;
        l9.i.e("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // g9.k0
    public final void G2(boolean z3) {
        int i = k9.a0.f19634b;
        l9.i.e("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // g9.k0
    public final void G3(g9.x xVar) {
        int i = k9.a0.f19634b;
        l9.i.e("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // g9.k0
    public final boolean L() {
        return false;
    }

    @Override // g9.k0
    public final void L2() {
        int i = k9.a0.f19634b;
        l9.i.e("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // g9.k0
    public final String M() {
        return this.f10634w.f4583g;
    }

    @Override // g9.k0
    public final void O0(g9.u0 u0Var) {
        yk0 yk0Var = this.f10634w.f4580c;
        if (yk0Var != null) {
            yk0Var.l(u0Var);
        }
    }

    @Override // g9.k0
    public final void S2(yl ylVar) {
        int i = k9.a0.f19634b;
        l9.i.e("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // g9.k0
    public final g9.z1 U() {
        f40 f40Var = this.f10635x;
        f40Var.getClass();
        try {
            return f40Var.f5924p.mo208zza();
        } catch (dq0 unused) {
            return null;
        }
    }

    @Override // g9.k0
    public final void V0(g9.x0 x0Var) {
        int i = k9.a0.f19634b;
        l9.i.e("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // g9.k0
    public final void a() {
        fa.y.d("destroy must be called on the main UI thread.");
        e70 e70Var = this.f10635x.f13069c;
        e70Var.getClass();
        e70Var.P1(new rl(null, 1));
    }

    @Override // g9.k0
    public final void b() {
        fa.y.d("destroy must be called on the main UI thread.");
        e70 e70Var = this.f10635x.f13069c;
        e70Var.getClass();
        e70Var.P1(new d70(null));
    }

    @Override // g9.k0
    public final boolean c() {
        return false;
    }

    @Override // g9.k0
    public final void d3(g9.w2 w2Var) {
        int i = k9.a0.f19634b;
        l9.i.e("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // g9.k0
    public final Bundle f() {
        int i = k9.a0.f19634b;
        l9.i.e("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // g9.k0
    public final void h() {
        g90 g90Var = this.f10635x.f5926r;
        synchronized (g90Var) {
            g90Var.P1(v80.B);
        }
    }

    @Override // g9.k0
    public final void i() {
    }

    @Override // g9.k0
    public final long i0() {
        c60 c60Var;
        f40 f40Var = this.f10635x;
        if (f40Var != null && (c60Var = f40Var.f13074j) != null) {
            return c60Var.f5014a.get();
        }
        return 0L;
    }

    @Override // g9.k0
    public final String j() {
        return this.f10635x.f13071f.f9412u;
    }

    @Override // g9.k0
    public final g9.c3 m() {
        fa.y.d("getAdSize must be called on the main UI thread.");
        return xy.t(this.f10632u, Collections.singletonList(this.f10635x.c()));
    }

    @Override // g9.k0
    public final boolean n1(g9.z2 z2Var) {
        int i = k9.a0.f19634b;
        l9.i.e("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // g9.k0
    public final void n3(String str) {
    }

    @Override // g9.k0
    public final void p2(g9.u uVar) {
        int i = k9.a0.f19634b;
        l9.i.e("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // g9.k0
    public final void q2(g9.c3 c3Var) {
        FrameLayout frameLayout;
        h00 h00Var;
        fa.y.d("setAdSize must be called on the main UI thread.");
        f40 f40Var = this.f10635x;
        if (f40Var != null && (frameLayout = this.f10636y) != null && (h00Var = f40Var.f5922n) != null) {
            h00Var.C0(x0.a(c3Var));
            frameLayout.setMinimumHeight(c3Var.f17591w);
            frameLayout.setMinimumWidth(c3Var.f17594z);
            f40Var.f5929u = c3Var;
        }
    }

    @Override // g9.k0
    public final void q4(vi viVar) {
    }

    @Override // g9.k0
    public final boolean s() {
        f40 f40Var = this.f10635x;
        if (f40Var != null && f40Var.f13068b.f9953q0) {
            return true;
        }
        return false;
    }

    @Override // g9.k0
    public final void t0(boolean z3) {
    }

    @Override // g9.k0
    public final String v() {
        return this.f10635x.f13071f.f9412u;
    }

    @Override // g9.k0
    public final g9.u0 x() {
        return this.f10634w.f4590o;
    }

    @Override // g9.k0
    public final void y() {
        fa.y.d("destroy must be called on the main UI thread.");
        e70 e70Var = this.f10635x.f13069c;
        e70Var.getClass();
        e70Var.P1(new ll(null, 2));
    }

    @Override // g9.k0
    public final g9.x z() {
        return this.f10633v;
    }

    @Override // g9.k0
    public final oa.a zza() {
        return new oa.b(this.f10636y);
    }

    @Override // g9.k0
    public final void J() {
    }

    @Override // g9.k0
    public final void p() {
    }

    @Override // g9.k0
    public final void q() {
    }

    @Override // g9.k0
    public final void s1() {
    }

    @Override // g9.k0
    public final void H0(lv lvVar) {
    }

    @Override // g9.k0
    public final void l1(g9.f3 f3Var) {
    }

    @Override // g9.k0
    public final void r4(oa.a aVar) {
    }

    @Override // g9.k0
    public final void z3(g9.z0 z0Var) {
    }

    @Override // g9.k0
    public final void P0(g9.z2 z2Var, g9.a0 a0Var) {
    }
}

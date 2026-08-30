package com.google.android.gms.internal.ads;
import f9.k;
import fa.y;
import g9.a0;
import g9.c3;
import g9.f3;
import g9.j0;
import g9.k0;
import g9.q1;
import g9.r;
import g9.u;
import g9.u0;
import g9.v1;
import g9.w2;
import g9.x;
import g9.x0;
import g9.z0;
import g9.z1;
import g9.z2;
import k9.a0;
import k9.f0;
import l9.a;
import l9.i;
import oa.a;
import oa.b;
import r.e;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class cl0 extends g9.j0 {
    public final hp0 A;
    public final of B;
    public final be0 C;
    public n90 D;
    public boolean E;

    /* renamed from: u, reason: collision with root package name */
    public final g9.c3 f5109u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f5110v;

    /* renamed from: w, reason: collision with root package name */
    public final fp0 f5111w;

    /* renamed from: x, reason: collision with root package name */
    public final String f5112x;

    /* renamed from: y, reason: collision with root package name */
    public final l9.a f5113y;

    /* renamed from: z, reason: collision with root package name */
    public final yk0 f5114z;

    public cl0(Context context, g9.c3 c3Var, String str, fp0 fp0Var, yk0 yk0Var, hp0 hp0Var, l9.a aVar, of ofVar, be0 be0Var) {
        this.f5109u = c3Var;
        this.f5112x = str;
        this.f5110v = context;
        this.f5111w = fp0Var;
        this.f5114z = yk0Var;
        this.A = hp0Var;
        this.f5113y = aVar;
        nl nlVar = sl.f10833m1;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.E = true;
        } else {
            this.E = ((Boolean) rVar.f17698c.a(sl.f10817l1)).booleanValue();
        }
        this.B = ofVar;
        this.C = be0Var;
    }

    @Override // g9.k0
    public final synchronized g9.v1 A() {
        n90 n90Var;
        if (((Boolean) g9.r.e.f17698c.a(sl.F7)).booleanValue() && (n90Var = this.D) != null) {
            return n90Var.f13071f;
        }
        return null;
    }

    @Override // g9.k0
    public final synchronized void B0(long j10) {
        c60 c60Var;
        n90 n90Var = this.D;
        if (n90Var != null && (c60Var = n90Var.f13074j) != null) {
            c60Var.a(j10);
        }
    }

    @Override // g9.k0
    public final void F1(g9.q1 q1Var) {
        fa.y.d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!q1Var.b()) {
                this.C.b();
            }
        } catch (RemoteException e) {
            int i = k9.a0.f19634b;
            l9.i.b("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f5114z.f12896w.set(q1Var);
    }

    @Override // g9.k0
    public final void G2(boolean z3) {
    }

    @Override // g9.k0
    public final void G3(g9.x xVar) {
        fa.y.d("setAdListener must be called on the main UI thread.");
        this.f5114z.f12894u.set(xVar);
    }

    @Override // g9.k0
    public final void H0(lv lvVar) {
        this.A.f6867y.set(lvVar);
    }

    @Override // g9.k0
    public final synchronized boolean L() {
        return this.f5111w.b();
    }

    @Override // g9.k0
    public final void L2() {
        fa.y.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // g9.k0
    public final synchronized String M() {
        return this.f5112x;
    }

    @Override // g9.k0
    public final void O0(g9.u0 u0Var) {
        fa.y.d("setAppEventListener must be called on the main UI thread.");
        this.f5114z.l(u0Var);
    }

    @Override // g9.k0
    public final void P0(g9.z2 z2Var, g9.a0 a0Var) {
        this.f5114z.f12897x.set(a0Var);
        n1(z2Var);
    }

    @Override // g9.k0
    public final synchronized void S2(yl ylVar) {
        fa.y.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f5111w.f6148f = ylVar;
    }

    @Override // g9.k0
    public final g9.z1 U() {
        return null;
    }

    @Override // g9.k0
    public final synchronized void a() {
        fa.y.d("pause must be called on the main UI thread.");
        n90 n90Var = this.D;
        if (n90Var != null) {
            e70 e70Var = n90Var.f13069c;
            e70Var.getClass();
            e70Var.P1(new rl(null, 1));
        }
    }

    @Override // g9.k0
    public final synchronized void b() {
        fa.y.d("resume must be called on the main UI thread.");
        n90 n90Var = this.D;
        if (n90Var != null) {
            e70 e70Var = n90Var.f13069c;
            e70Var.getClass();
            e70Var.P1(new d70(null));
        }
    }

    @Override // g9.k0
    public final synchronized boolean c() {
        fa.y.d("isLoaded must be called on the main UI thread.");
        return v4();
    }

    @Override // g9.k0
    public final Bundle f() {
        fa.y.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // g9.k0
    public final void h() {
    }

    @Override // g9.k0
    public final synchronized void i() {
        fa.y.d("showInterstitial must be called on the main UI thread.");
        if (this.D == null) {
            int i = k9.a0.f19634b;
            l9.i.f("Interstitial can not be shown before loaded.");
            this.f5114z.o(x21.J(9, null, null));
        } else {
            if (((Boolean) g9.r.e.f17698c.a(sl.C3)).booleanValue()) {
                this.B.f9103b.e(new Throwable().getStackTrace());
            }
            this.D.c(null, this.E);
        }
    }

    @Override // g9.k0
    public final synchronized long i0() {
        c60 c60Var;
        n90 n90Var = this.D;
        if (n90Var != null && (c60Var = n90Var.f13074j) != null) {
            return c60Var.f5014a.get();
        }
        return 0L;
    }

    @Override // g9.k0
    public final synchronized String j() {
        n90 n90Var = this.D;
        if (n90Var != null) {
            return n90Var.f13071f.f9412u;
        }
        return null;
    }

    @Override // g9.k0
    public final g9.c3 m() {
        return null;
    }

    @Override // g9.k0
    public final synchronized boolean n1(g9.z2 z2Var) {
        boolean z3;
        try {
            if (!z2Var.b()) {
                if (((Boolean) um.i.p()).booleanValue()) {
                    if (((Boolean) g9.r.e.f17698c.a(sl.Cc)).booleanValue()) {
                        z3 = true;
                        if (this.f5113y.f20031w >= ((Integer) g9.r.e.f17698c.a(sl.Dc)).intValue() || !z3) {
                            fa.y.d("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z3 = false;
                if (this.f5113y.f20031w >= ((Integer) g9.r.e.f17698c.a(sl.Dc)).intValue()) {
                }
                fa.y.d("loadAd must be called on the main UI thread.");
            }
            k9.f0 f0Var = f9.k.C.f16813c;
            Context context = this.f5110v;
            if (k9.f0.h(context) && z2Var.M == null) {
                int i = k9.a0.f19634b;
                l9.i.c("Failed to load the ad because app ID is missing.");
                yk0 yk0Var = this.f5114z;
                if (yk0Var != null) {
                    yk0Var.x(x21.J(4, null, null));
                }
            } else if (!v4()) {
                ay0.p(context, z2Var.f17726z);
                this.D = null;
                return this.f5111w.a(z2Var, this.f5112x, new cp0(this.f5109u), new bl0(0, this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g9.k0
    public final void n3(String str) {
    }

    @Override // g9.k0
    public final void q4(vi viVar) {
    }

    @Override // g9.k0
    public final synchronized void r4(oa.a aVar) {
        if (this.D == null) {
            int i = k9.a0.f19634b;
            l9.i.f("Interstitial can not be shown before loaded.");
            this.f5114z.o(x21.J(9, null, null));
        } else {
            if (((Boolean) g9.r.e.f17698c.a(sl.C3)).booleanValue()) {
                this.B.f9103b.e(new Throwable().getStackTrace());
            }
            this.D.c((Activity) oa.b.z1(aVar), this.E);
        }
    }

    @Override // g9.k0
    public final synchronized boolean s() {
        return false;
    }

    @Override // g9.k0
    public final synchronized void t0(boolean z3) {
        fa.y.d("setImmersiveMode must be called on the main UI thread.");
        this.E = z3;
    }

    @Override // g9.k0
    public final synchronized String v() {
        n90 n90Var = this.D;
        if (n90Var != null) {
            return n90Var.f13071f.f9412u;
        }
        return null;
    }

    public final synchronized boolean v4() {
        n90 n90Var = this.D;
        if (n90Var != null) {
            if (!n90Var.f8604p.f6602v.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // g9.k0
    public final g9.u0 x() {
        g9.u0 u0Var;
        yk0 yk0Var = this.f5114z;
        synchronized (yk0Var) {
            u0Var = (g9.u0) yk0Var.f12895v.get();
        }
        return u0Var;
    }

    @Override // g9.k0
    public final synchronized void y() {
        fa.y.d("destroy must be called on the main UI thread.");
        n90 n90Var = this.D;
        if (n90Var != null) {
            e70 e70Var = n90Var.f13069c;
            e70Var.getClass();
            e70Var.P1(new ll(null, 2));
        }
    }

    @Override // g9.k0
    public final g9.x z() {
        return this.f5114z.k();
    }

    @Override // g9.k0
    public final void z3(g9.z0 z0Var) {
        this.f5114z.f12898y.set(z0Var);
    }

    @Override // g9.k0
    public final oa.a zza() {
        return null;
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
    public final void V0(g9.x0 x0Var) {
    }

    @Override // g9.k0
    public final void d3(g9.w2 w2Var) {
    }

    @Override // g9.k0
    public final void l1(g9.f3 f3Var) {
    }

    @Override // g9.k0
    public final void p2(g9.u uVar) {
    }

    @Override // g9.k0
    public final void q2(g9.c3 c3Var) {
    }
}

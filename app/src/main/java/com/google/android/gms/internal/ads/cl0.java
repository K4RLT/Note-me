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
import g9.u0;
import g9.u;
import g9.v1;
import g9.w2;
import g9.x0;
import g9.x;
import g9.z0;
import g9.z1;
import g9.z2;
import k9.a0;
import k9.f0;
import l9.a;
import l9.i;
import oa.a;
import oa.b;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class cl0 extends j0 {
    public final hp0 A;
    public final of B;
    public final be0 C;
    public n90 D;
    public boolean E;

    /* renamed from: u, reason: collision with root package name */
    public final c3 f5109u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f5110v;

    /* renamed from: w, reason: collision with root package name */
    public final fp0 f5111w;

    /* renamed from: x, reason: collision with root package name */
    public final String f5112x;

    /* renamed from: y, reason: collision with root package name */
    public final a f5113y;

    /* renamed from: z, reason: collision with root package name */
    public final yk0 f5114z;

    public cl0(Context context, c3 c3Var, String str, fp0 fp0Var, yk0 yk0Var, hp0 hp0Var, a aVar, of ofVar, be0 be0Var) {
        this.f5109u = c3Var;
        this.f5112x = str;
        this.f5110v = context;
        this.f5111w = fp0Var;
        this.f5114z = yk0Var;
        this.A = hp0Var;
        this.f5113y = aVar;
        nl nlVar = sl.f10833m1;
        r rVar = r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.E = true;
        } else {
            this.E = ((Boolean) rVar.f17698c.a(sl.f10817l1)).booleanValue();
        }
        this.B = ofVar;
        this.C = be0Var;
    }

    @Override // k0
    public final synchronized v1 A() {
        n90 n90Var;
        if (((Boolean) r.e.f17698c.a(sl.F7)).booleanValue() && (n90Var = this.D) != null) {
            return n90Var.f13071f;
        }
        return null;
    }

    @Override // k0
    public final synchronized void B0(long j10) {
        c60 c60Var;
        n90 n90Var = this.D;
        if (n90Var != null && (c60Var = n90Var.f13074j) != null) {
            c60Var.a(j10);
        }
    }

    @Override // k0
    public final void F1(q1 q1Var) {
        y.d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!q1Var.b()) {
                this.C.b();
            }
        } catch (RemoteException e) {
            int i = a0.f19634b;
            i.b("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f5114z.f12896w.set(q1Var);
    }

    @Override // k0
    public final void G2(boolean z3) {
    }

    @Override // k0
    public final void G3(x xVar) {
        y.d("setAdListener must be called on the main UI thread.");
        this.f5114z.f12894u.set(xVar);
    }

    @Override // k0
    public final void H0(lv lvVar) {
        this.A.f6867y.set(lvVar);
    }

    @Override // k0
    public final synchronized boolean L() {
        return this.f5111w.b();
    }

    @Override // k0
    public final void L2() {
        y.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // k0
    public final synchronized String M() {
        return this.f5112x;
    }

    @Override // k0
    public final void O0(u0 u0Var) {
        y.d("setAppEventListener must be called on the main UI thread.");
        this.f5114z.l(u0Var);
    }

    @Override // k0
    public final void P0(z2 z2Var, a0 a0Var) {
        this.f5114z.f12897x.set(a0Var);
        n1(z2Var);
    }

    @Override // k0
    public final synchronized void S2(yl ylVar) {
        y.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f5111w.f6148f = ylVar;
    }

    @Override // k0
    public final z1 U() {
        return null;
    }

    @Override // k0
    public final synchronized void a() {
        y.d("pause must be called on the main UI thread.");
        n90 n90Var = this.D;
        if (n90Var != null) {
            e70 e70Var = n90Var.f13069c;
            e70Var.getClass();
            e70Var.P1(new rl(null, 1));
        }
    }

    @Override // k0
    public final synchronized void b() {
        y.d("resume must be called on the main UI thread.");
        n90 n90Var = this.D;
        if (n90Var != null) {
            e70 e70Var = n90Var.f13069c;
            e70Var.getClass();
            e70Var.P1(new d70(null));
        }
    }

    @Override // k0
    public final synchronized boolean c() {
        y.d("isLoaded must be called on the main UI thread.");
        return v4();
    }

    @Override // k0
    public final Bundle f() {
        y.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // k0
    public final void h() {
    }

    @Override // k0
    public final synchronized void i() {
        y.d("showInterstitial must be called on the main UI thread.");
        if (this.D == null) {
            int i = a0.f19634b;
            i.f("Interstitial can not be shown before loaded.");
            this.f5114z.o(x21.J(9, null, null));
        } else {
            if (((Boolean) r.e.f17698c.a(sl.C3)).booleanValue()) {
                this.B.f9103b.e(new Throwable().getStackTrace());
            }
            this.D.c(null, this.E);
        }
    }

    @Override // k0
    public final synchronized long i0() {
        c60 c60Var;
        n90 n90Var = this.D;
        if (n90Var != null && (c60Var = n90Var.f13074j) != null) {
            return c60Var.f5014a.get();
        }
        return 0L;
    }

    @Override // k0
    public final synchronized String j() {
        n90 n90Var = this.D;
        if (n90Var != null) {
            return n90Var.f13071f.f9412u;
        }
        return null;
    }

    @Override // k0
    public final c3 m() {
        return null;
    }

    @Override // k0
    public final synchronized boolean n1(z2 z2Var) {
        boolean z3;
        try {
            if (!z2Var.b()) {
                if (((Boolean) um.i.p()).booleanValue()) {
                    if (((Boolean) r.e.f17698c.a(sl.Cc)).booleanValue()) {
                        z3 = true;
                        if (this.f5113y.f20031w >= ((Integer) r.e.f17698c.a(sl.Dc)).intValue() || !z3) {
                            y.d("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z3 = false;
                if (this.f5113y.f20031w >= ((Integer) r.e.f17698c.a(sl.Dc)).intValue()) {
                }
                y.d("loadAd must be called on the main UI thread.");
            }
            f0 f0Var = k.C.f16813c;
            Context context = this.f5110v;
            if (f0.h(context) && z2Var.M == null) {
                int i = a0.f19634b;
                i.c("Failed to load the ad because app ID is missing.");
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

    @Override // k0
    public final void n3(String str) {
    }

    @Override // k0
    public final void q4(vi viVar) {
    }

    @Override // k0
    public final synchronized void r4(a aVar) {
        if (this.D == null) {
            int i = a0.f19634b;
            i.f("Interstitial can not be shown before loaded.");
            this.f5114z.o(x21.J(9, null, null));
        } else {
            if (((Boolean) r.e.f17698c.a(sl.C3)).booleanValue()) {
                this.B.f9103b.e(new Throwable().getStackTrace());
            }
            this.D.c((Activity) b.z1(aVar), this.E);
        }
    }

    @Override // k0
    public final synchronized boolean s() {
        return false;
    }

    @Override // k0
    public final synchronized void t0(boolean z3) {
        y.d("setImmersiveMode must be called on the main UI thread.");
        this.E = z3;
    }

    @Override // k0
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

    @Override // k0
    public final u0 x() {
        u0 u0Var;
        yk0 yk0Var = this.f5114z;
        synchronized (yk0Var) {
            u0Var = (u0) yk0Var.f12895v.get();
        }
        return u0Var;
    }

    @Override // k0
    public final synchronized void y() {
        y.d("destroy must be called on the main UI thread.");
        n90 n90Var = this.D;
        if (n90Var != null) {
            e70 e70Var = n90Var.f13069c;
            e70Var.getClass();
            e70Var.P1(new ll(null, 2));
        }
    }

    @Override // k0
    public final x z() {
        return this.f5114z.k();
    }

    @Override // k0
    public final void z3(z0 z0Var) {
        this.f5114z.f12898y.set(z0Var);
    }

    @Override // k0
    public final a zza() {
        return null;
    }

    @Override // k0
    public final void J() {
    }

    @Override // k0
    public final void p() {
    }

    @Override // k0
    public final void q() {
    }

    @Override // k0
    public final void s1() {
    }

    @Override // k0
    public final void V0(x0 x0Var) {
    }

    @Override // k0
    public final void d3(w2 w2Var) {
    }

    @Override // k0
    public final void l1(f3 f3Var) {
    }

    @Override // k0
    public final void p2(u uVar) {
    }

    @Override // k0
    public final void q2(c3 c3Var) {
    }
}

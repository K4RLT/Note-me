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
import k9.f0;
import l9.a;
import l9.i;
import oa.b;
import r.e;
import r0.p;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
import java.util.Collections;

/* loaded from: classes.dex */
public final class wk0 extends g9.j0 {
    public final l9.a A;
    public final be0 B;
    public f40 C;

    /* renamed from: u, reason: collision with root package name */
    public final Context f12260u;

    /* renamed from: v, reason: collision with root package name */
    public final oo0 f12261v;

    /* renamed from: w, reason: collision with root package name */
    public final String f12262w;

    /* renamed from: x, reason: collision with root package name */
    public final yk0 f12263x;

    /* renamed from: y, reason: collision with root package name */
    public g9.c3 f12264y;

    /* renamed from: z, reason: collision with root package name */
    public final zp0 f12265z;

    public wk0(Context context, g9.c3 c3Var, String str, oo0 oo0Var, yk0 yk0Var, l9.a aVar, be0 be0Var) {
        this.f12260u = context;
        this.f12261v = oo0Var;
        this.f12264y = c3Var;
        this.f12262w = str;
        this.f12263x = yk0Var;
        this.f12265z = oo0Var.f9180k;
        this.A = aVar;
        this.B = be0Var;
        oo0Var.f9178h.L1(this, oo0Var.f9173b);
    }

    @Override // g9.k0
    public final synchronized g9.v1 A() {
        f40 f40Var;
        if (((Boolean) g9.r.e.f17698c.a(sl.F7)).booleanValue() && (f40Var = this.C) != null) {
            return f40Var.f13071f;
        }
        return null;
    }

    @Override // g9.k0
    public final synchronized void B0(long j10) {
        c60 c60Var;
        this.f12265z.f13244u.set(j10);
        f40 f40Var = this.C;
        if (f40Var != null && (c60Var = f40Var.f13074j) != null) {
            c60Var.a(j10);
        }
    }

    @Override // g9.k0
    public final void F1(g9.q1 q1Var) {
        if (w4()) {
            fa.y.d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!q1Var.b()) {
                this.B.b();
            }
        } catch (RemoteException e) {
            int i = k9.a0.f19634b;
            l9.i.b("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f12263x.f12896w.set(q1Var);
    }

    @Override // g9.k0
    public final synchronized void G2(boolean z3) {
        try {
            if (w4()) {
                fa.y.d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f12265z.e = z3;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g9.k0
    public final void G3(g9.x xVar) {
        if (w4()) {
            fa.y.d("setAdListener must be called on the main UI thread.");
        }
        this.f12263x.f12894u.set(xVar);
    }

    @Override // g9.k0
    public final synchronized boolean L() {
        return this.f12261v.b();
    }

    @Override // g9.k0
    public final void L2() {
        fa.y.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // g9.k0
    public final synchronized String M() {
        return this.f12262w;
    }

    @Override // g9.k0
    public final void O0(g9.u0 u0Var) {
        if (w4()) {
            fa.y.d("setAppEventListener must be called on the main UI thread.");
        }
        this.f12263x.l(u0Var);
    }

    @Override // g9.k0
    public final synchronized void S2(yl ylVar) {
        fa.y.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f12261v.f9177g = ylVar;
    }

    @Override // g9.k0
    public final synchronized g9.z1 U() {
        fa.y.d("getVideoController must be called from the main thread.");
        f40 f40Var = this.C;
        g9.z1 z1Var = null;
        if (f40Var == null) {
            return null;
        }
        try {
            z1Var = f40Var.f5924p.mo208zza();
        } catch (dq0 unused) {
        }
        return z1Var;
    }

    @Override // g9.k0
    public final synchronized void V0(g9.x0 x0Var) {
        fa.y.d("setCorrelationIdProvider must be called on the main UI thread");
        this.f12265z.f13247x = x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // g9.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.nb r0 = com.google.android.gms.internal.ads.um.f11681g     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.p()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.Ac     // Catch: java.lang.Throwable -> L36
            g9.r r1 = g9.r.e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.ql r2 = r1.f17698c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            l9.a r0 = r4.A     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f20031w     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.nl r2 = com.google.android.gms.internal.ads.sl.Ec     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.ql r1 = r1.f17698c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L54
        L38:
            java.lang.String r0 = "pause must be called on the main UI thread."
            fa.y.d(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.f40 r0 = r4.C     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.e70 r0 = r0.f13069c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.rl r1 = new com.google.android.gms.internal.ads.rl     // Catch: java.lang.Throwable -> L36
            r2 = 1
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.P1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wk0.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[DONT_GENERATE] */
    @Override // g9.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.nb r0 = com.google.android.gms.internal.ads.um.f11682h     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.p()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.f11036yc     // Catch: java.lang.Throwable -> L36
            g9.r r1 = g9.r.e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.ql r2 = r1.f17698c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            l9.a r0 = r3.A     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f20031w     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.nl r2 = com.google.android.gms.internal.ads.sl.Ec     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.ql r1 = r1.f17698c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L53
        L38:
            java.lang.String r0 = "resume must be called on the main UI thread."
            fa.y.d(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.f40 r0 = r3.C     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L51
            com.google.android.gms.internal.ads.e70 r0 = r0.f13069c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.d70 r1 = new com.google.android.gms.internal.ads.d70     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r0.P1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            return
        L51:
            monitor-exit(r3)
            return
        L53:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wk0.b():void");
    }

    @Override // g9.k0
    public final boolean c() {
        return false;
    }

    @Override // g9.k0
    public final synchronized void d3(g9.w2 w2Var) {
        try {
            if (w4()) {
                fa.y.d("setVideoOptions must be called on the main UI thread.");
            }
            this.f12265z.f13229d = w2Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g9.k0
    public final Bundle f() {
        fa.y.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // g9.k0
    public final synchronized void h() {
        fa.y.d("recordManualImpression must be called on the main UI thread.");
        f40 f40Var = this.C;
        if (f40Var != null) {
            g90 g90Var = f40Var.f5926r;
            synchronized (g90Var) {
                g90Var.P1(v80.B);
            }
        }
    }

    @Override // g9.k0
    public final void i() {
    }

    @Override // g9.k0
    public final synchronized long i0() {
        c60 c60Var;
        f40 f40Var = this.C;
        if (f40Var != null && (c60Var = f40Var.f13074j) != null) {
            return c60Var.f5014a.get();
        }
        return this.f12265z.f13244u.get();
    }

    @Override // g9.k0
    public final synchronized String j() {
        f40 f40Var = this.C;
        if (f40Var != null) {
            return f40Var.f13071f.f9412u;
        }
        return null;
    }

    @Override // g9.k0
    public final synchronized g9.c3 m() {
        fa.y.d("getAdSize must be called on the main UI thread.");
        f40 f40Var = this.C;
        if (f40Var != null) {
            return xy.t(this.f12260u, Collections.singletonList(f40Var.c()));
        }
        return this.f12265z.f13227b;
    }

    @Override // g9.k0
    public final synchronized boolean n1(g9.z2 z2Var) {
        g9.c3 c3Var = this.f12264y;
        synchronized (this) {
            zp0 zp0Var = this.f12265z;
            zp0Var.f13227b = c3Var;
            zp0Var.f13240q = this.f12264y.H;
        }
        return v4(z2Var);
        return v4(z2Var);
    }

    @Override // g9.k0
    public final void n3(String str) {
    }

    @Override // g9.k0
    public final void p2(g9.u uVar) {
        if (w4()) {
            fa.y.d("setAdListener must be called on the main UI thread.");
        }
        al0 al0Var = this.f12261v.e;
        synchronized (al0Var) {
            al0Var.f4535u = uVar;
        }
    }

    @Override // g9.k0
    public final synchronized void q2(g9.c3 c3Var) {
        h00 h00Var;
        fa.y.d("setAdSize must be called on the main UI thread.");
        this.f12265z.f13227b = c3Var;
        this.f12264y = c3Var;
        f40 f40Var = this.C;
        if (f40Var != null) {
            FrameLayout frameLayout = this.f12261v.f9176f;
            if (frameLayout != null && (h00Var = f40Var.f5922n) != null) {
                h00Var.C0(x0.a(c3Var));
                frameLayout.setMinimumHeight(c3Var.f17591w);
                frameLayout.setMinimumWidth(c3Var.f17594z);
                f40Var.f5929u = c3Var;
            }
        }
    }

    @Override // g9.k0
    public final void q4(vi viVar) {
    }

    @Override // g9.k0
    public final synchronized boolean s() {
        f40 f40Var = this.C;
        if (f40Var != null) {
            if (f40Var.f13068b.f9953q0) {
                return true;
            }
        }
        return false;
    }

    @Override // g9.k0
    public final void t0(boolean z3) {
    }

    @Override // g9.k0
    public final synchronized String v() {
        f40 f40Var = this.C;
        if (f40Var != null) {
            return f40Var.f13071f.f9412u;
        }
        return null;
    }

    public final synchronized boolean v4(g9.z2 z2Var) {
        try {
            if (w4()) {
                fa.y.d("loadAd must be called on the main UI thread.");
            }
            k9.f0 f0Var = f9.k.C.f16813c;
            Context context = this.f12260u;
            if (k9.f0.h(context) && z2Var.M == null) {
                int i = k9.a0.f19634b;
                l9.i.c("Failed to load the ad because app ID is missing.");
                yk0 yk0Var = this.f12263x;
                if (yk0Var != null) {
                    yk0Var.x(x21.J(4, null, null));
                }
                return false;
            }
            ay0.p(context, z2Var.f17726z);
            return this.f12261v.a(z2Var, this.f12262w, null, new lx0(28, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean w4() {
        boolean z3;
        if (((Boolean) um.f11680f.p()).booleanValue()) {
            if (((Boolean) g9.r.e.f17698c.a(sl.Cc)).booleanValue()) {
                z3 = true;
                if (this.A.f20031w >= ((Integer) g9.r.e.f17698c.a(sl.Dc)).intValue() || !z3) {
                    return true;
                }
                return false;
            }
        }
        z3 = false;
        if (this.A.f20031w >= ((Integer) g9.r.e.f17698c.a(sl.Dc)).intValue()) {
        }
        return true;
    }

    @Override // g9.k0
    public final g9.u0 x() {
        g9.u0 u0Var;
        yk0 yk0Var = this.f12263x;
        synchronized (yk0Var) {
            u0Var = (g9.u0) yk0Var.f12895v.get();
        }
        return u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // g9.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void y() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.nb r0 = com.google.android.gms.internal.ads.um.e     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.p()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.f11050zc     // Catch: java.lang.Throwable -> L36
            g9.r r1 = g9.r.e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.ql r2 = r1.f17698c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            l9.a r0 = r4.A     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f20031w     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.nl r2 = com.google.android.gms.internal.ads.sl.Ec     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.ql r1 = r1.f17698c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L54
        L38:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            fa.y.d(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.f40 r0 = r4.C     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.e70 r0 = r0.f13069c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.ll r1 = new com.google.android.gms.internal.ads.ll     // Catch: java.lang.Throwable -> L36
            r2 = 2
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.P1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wk0.y():void");
    }

    @Override // g9.k0
    public final g9.x z() {
        return this.f12263x.k();
    }

    @Override // g9.k0
    public final oa.a zza() {
        if (w4()) {
            fa.y.d("getAdFrame must be called on the main UI thread.");
        }
        return new oa.b(this.f12261v.f9176f);
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

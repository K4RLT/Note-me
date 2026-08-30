package com.google.android.gms.internal.ads;
import k9.a0;
import la.a;
import oa.a;
import ac.b;
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
import j9.m;
import k9.f0;
import l9.a;
import l9.i;
import r.e;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class no0 extends g9.j0 implements j9.m {
    public final l9.a A;
    public final be0 B;
    public z30 D;
    public a40 E;

    /* renamed from: u, reason: collision with root package name */
    public final y10 f8785u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f8786v;

    /* renamed from: x, reason: collision with root package name */
    public final String f8788x;

    /* renamed from: y, reason: collision with root package name */
    public final ko0 f8789y;

    /* renamed from: z, reason: collision with root package name */
    public final jo0 f8790z;

    /* renamed from: w, reason: collision with root package name */
    public AtomicBoolean f8787w = new AtomicBoolean();
    public long C = -1;

    public no0(y10 y10Var, Context context, String str, ko0 ko0Var, jo0 jo0Var, l9.a aVar, be0 be0Var) {
        this.f8785u = y10Var;
        this.f8786v = context;
        this.f8788x = str;
        this.f8789y = ko0Var;
        this.f8790z = jo0Var;
        this.A = aVar;
        this.B = be0Var;
        jo0Var.f7498z.set(this);
    }

    @Override // g9.k0
    public final synchronized g9.v1 A() {
        return null;
    }

    @Override // g9.k0
    public final void B0(long j10) {
    }

    @Override // g9.k0
    public final synchronized void G2(boolean z3) {
    }

    @Override // g9.k0
    public final synchronized boolean L() {
        boolean z3;
        ac.b bVar = this.f8789y.f7828j;
        if (bVar != null) {
            if (!bVar.isDone()) {
                z3 = true;
            }
        }
        z3 = false;
        return z3;
    }

    @Override // g9.k0
    public final synchronized String M() {
        return this.f8788x;
    }

    @Override // j9.m
    public final void R0() {
    }

    @Override // g9.k0
    public final synchronized void S2(yl ylVar) {
    }

    @Override // j9.m
    public final void T1() {
    }

    @Override // g9.k0
    public final synchronized g9.z1 U() {
        return null;
    }

    @Override // g9.k0
    public final synchronized void V0(g9.x0 x0Var) {
    }

    @Override // g9.k0
    public final synchronized void a() {
        fa.y.d("pause must be called on the main UI thread.");
    }

    @Override // g9.k0
    public final synchronized void b() {
        fa.y.d("resume must be called on the main UI thread.");
    }

    @Override // g9.k0
    public final boolean c() {
        return false;
    }

    @Override // j9.m
    public final synchronized void d() {
        if (this.E != null) {
            f9.k kVar = f9.k.C;
            kVar.f16819k.getClass();
            this.C = SystemClock.elapsedRealtime();
            int i = this.E.f4345m;
            if (i > 0) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f8785u.f12713d.zzb();
                la.a aVar = kVar.f16819k;
                z30 z30Var = new z30(scheduledExecutorService, aVar);
                this.D = z30Var;
                mo0 mo0Var = new mo0(this, 0);
                synchronized (z30Var) {
                    z30Var.f13061z = mo0Var;
                    aVar.getClass();
                    long j10 = i;
                    z30Var.f13059x = SystemClock.elapsedRealtime() + j10;
                    z30Var.f13058w = scheduledExecutorService.schedule(mo0Var, j10, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // g9.k0
    public final synchronized void d3(g9.w2 w2Var) {
    }

    @Override // g9.k0
    public final Bundle f() {
        return new Bundle();
    }

    @Override // j9.m
    public final void g2() {
    }

    @Override // g9.k0
    public final synchronized void h() {
    }

    @Override // g9.k0
    public final synchronized void i() {
    }

    @Override // g9.k0
    public final long i0() {
        return 0L;
    }

    @Override // j9.m
    public final void i4(int i) {
        if (i != 0) {
            int i10 = i - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        v4(6);
                        return;
                    } else {
                        v4(3);
                        return;
                    }
                }
                v4(4);
                return;
            }
            v4(2);
            return;
        }
        throw null;
    }

    @Override // g9.k0
    public final synchronized String j() {
        return null;
    }

    @Override // g9.k0
    public final void l1(g9.f3 f3Var) {
        this.f8789y.i.i = f3Var;
    }

    @Override // g9.k0
    public final synchronized g9.c3 m() {
        return null;
    }

    @Override // g9.k0
    public final synchronized boolean n1(g9.z2 z2Var) {
        boolean z3;
        try {
            int i = 1;
            if (!z2Var.b()) {
                if (((Boolean) um.f11679d.p()).booleanValue()) {
                    if (((Boolean) g9.r.e.f17698c.a(sl.Cc)).booleanValue()) {
                        z3 = true;
                        if (this.A.f20031w >= ((Integer) g9.r.e.f17698c.a(sl.Dc)).intValue() || !z3) {
                            fa.y.d("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z3 = false;
                if (this.A.f20031w >= ((Integer) g9.r.e.f17698c.a(sl.Dc)).intValue()) {
                }
                fa.y.d("loadAd must be called on the main UI thread.");
            }
            k9.f0 f0Var = f9.k.C.f16813c;
            if (k9.f0.h(this.f8786v) && z2Var.M == null) {
                int i10 = k9.a0.f19634b;
                l9.i.c("Failed to load the ad because app ID is missing.");
                this.f8790z.x(x21.J(4, null, null));
                return false;
            }
            if (L()) {
                return false;
            }
            this.f8787w = new AtomicBoolean();
            return this.f8789y.a(z2Var, this.f8788x, new an1(19), new bl0(i, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g9.k0
    public final void n3(String str) {
    }

    @Override // j9.m
    public final synchronized void o3() {
        a40 a40Var = this.E;
        if (a40Var != null) {
            f9.k.C.f16819k.getClass();
            a40Var.e(1, SystemClock.elapsedRealtime() - this.C);
        }
    }

    @Override // g9.k0
    public final synchronized void q2(g9.c3 c3Var) {
        fa.y.d("setAdSize must be called on the main UI thread.");
    }

    @Override // g9.k0
    public final void q4(vi viVar) {
        this.f8790z.f7494v.set(viVar);
    }

    @Override // j9.m
    public final void r0() {
    }

    @Override // g9.k0
    public final synchronized boolean s() {
        return false;
    }

    @Override // g9.k0
    public final void t0(boolean z3) {
    }

    @Override // j9.m
    public final void t1() {
    }

    @Override // j9.m
    public final void u2() {
    }

    @Override // g9.k0
    public final synchronized String v() {
        return null;
    }

    @Override // j9.m
    public final void v2() {
    }

    public final synchronized void v4(int i) {
        try {
            if (this.f8787w.compareAndSet(false, true)) {
                this.f8790z.b();
                z30 z30Var = this.D;
                if (z30Var != null) {
                    f9.k.C.f16816g.i(z30Var);
                }
                if (this.E != null) {
                    long j10 = -1;
                    if (this.C != -1) {
                        f9.k.C.f16819k.getClass();
                        j10 = SystemClock.elapsedRealtime() - this.C;
                    }
                    this.E.e(i, j10);
                }
                y();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g9.k0
    public final g9.u0 x() {
        return null;
    }

    @Override // g9.k0
    public final synchronized void y() {
        fa.y.d("destroy must be called on the main UI thread.");
        a40 a40Var = this.E;
        if (a40Var != null) {
            a40Var.d();
        }
    }

    @Override // g9.k0
    public final g9.x z() {
        return null;
    }

    @Override // j9.m
    public final void z1() {
    }

    @Override // g9.k0
    public final oa.a zza() {
        return null;
    }

    @Override // g9.k0
    public final void J() {
    }

    @Override // g9.k0
    public final void L2() {
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
    public final void F1(g9.q1 q1Var) {
    }

    @Override // g9.k0
    public final void G3(g9.x xVar) {
    }

    @Override // g9.k0
    public final void H0(lv lvVar) {
    }

    @Override // g9.k0
    public final void O0(g9.u0 u0Var) {
    }

    @Override // g9.k0
    public final void p2(g9.u uVar) {
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

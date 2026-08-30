package com.google.android.gms.internal.ads;
import i0.m;

import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class oy1 extends hx1 {
    public final xe1 i;

    /* renamed from: j, reason: collision with root package name */
    public final zq0 f9274j;

    /* renamed from: k, reason: collision with root package name */
    public final s6 f9275k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9276l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9277m;

    /* renamed from: n, reason: collision with root package name */
    public long f9278n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9279o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9280p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9281q;

    /* renamed from: r, reason: collision with root package name */
    public as1 f9282r;

    /* renamed from: s, reason: collision with root package name */
    public y4 f9283s;

    public /* synthetic */ oy1(y4 y4Var, xe1 xe1Var, zq0 zq0Var, s6 s6Var, int i) {
        s6 s6Var2 = s6.E;
        this.f9283s = y4Var;
        this.i = xe1Var;
        this.f9274j = zq0Var;
        this.f9275k = s6Var2;
        this.f9276l = i;
        this.f9277m = true;
        this.f9278n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final synchronized void a(y4 y4Var) {
        this.f9283s = y4Var;
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final void b(xx1 xx1Var) {
        my1 my1Var = (my1) xx1Var;
        if (my1Var.P) {
            for (ry1 ry1Var : my1Var.M) {
                ry1Var.o();
                if (ry1Var.f10376g != null) {
                    ry1Var.f10376g = null;
                    ry1Var.f10375f = null;
                }
            }
        }
        hq0 hq0Var = my1Var.D;
        d0 d0Var = (d0) hq0Var.f6873w;
        if (d0Var != null) {
            d0Var.a(true);
        }
        i0 i0Var = (i0) hq0Var.f6872v;
        i0Var.execute(new e0(my1Var, 0));
        ((ExecutorService) ((Executor) i0Var.f6945v)).shutdown();
        my1Var.I.removeCallbacksAndMessages(null);
        my1Var.J = null;
        my1Var.f8491h0 = true;
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final xx1 c(yx1 yx1Var, w wVar, long j10) {
        pf1 mo210zza = this.i.mo210zza();
        as1 as1Var = this.f9282r;
        if (as1Var != null) {
            mo210zza.b(as1Var);
        }
        j2 j2Var = f().f12771b;
        j2Var.getClass();
        Uri uri = j2Var.f7285a;
        this.f6920g.getClass();
        return new my1(uri, mo210zza, new zd1((q2) this.f9274j.f13255v), this.f9275k, new z11(10, this.f6918d.f13047w, (Object) yx1Var, false), new i0.m((CopyOnWriteArrayList) this.f6917c.f18054v, 11, yx1Var), this, wVar, this.f9276l, bq0.u(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final synchronized y4 f() {
        return this.f9283s;
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final void h(as1 as1Var) {
        this.f9282r = as1Var;
        Looper.myLooper().getClass();
        this.f6920g.getClass();
        t();
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final void r() {
    }

    public final void s(long j10, a3 a3Var, boolean z3) {
        if (!this.f9281q || !a3Var.f()) {
            this.f9281q = !a3Var.f();
            if (j10 == -9223372036854775807L) {
                j10 = this.f9278n;
            }
            boolean zzb = a3Var.zzb();
            if (!this.f9277m && this.f9278n == j10 && this.f9279o == zzb && this.f9280p == z3) {
                return;
            }
            this.f9278n = j10;
            this.f9279o = zzb;
            this.f9280p = z3;
            this.f9277m = false;
            t();
        }
    }

    public final void t() {
        v1 v1Var;
        long j10 = this.f9278n;
        boolean z3 = this.f9279o;
        boolean z9 = this.f9280p;
        y4 f10 = f();
        if (z9) {
            v1Var = f10.f12772c;
        } else {
            v1Var = null;
        }
        uh vy1Var = new vy1(j10, j10, z3, f10, v1Var);
        if (this.f9277m) {
            vy1Var = new px1(vy1Var);
        }
        k(vy1Var);
    }
}

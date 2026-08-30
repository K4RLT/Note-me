package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c1 implements y1 {

    /* renamed from: a, reason: collision with root package name */
    public d51 f4937a;

    /* renamed from: b, reason: collision with root package name */
    public mw1 f4938b;

    /* renamed from: c, reason: collision with root package name */
    public long f4939c;

    /* renamed from: d, reason: collision with root package name */
    public long f4940d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f4941f;

    public c1(g1 g1Var, Context context) {
        this.f4941f = g1Var;
        bq0.l(context);
        b51 b51Var = d51.f5314v;
        this.f4937a = y51.f12781y;
        this.f4940d = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void A0(mw1 mw1Var, long j10, int i, List list) {
        b80.K(false);
        this.f4937a = d51.u(list);
        this.f4938b = mw1Var;
        this.f4941f.getClass();
        rv1 rv1Var = new rv1(mw1Var);
        mk1 mk1Var = mw1Var.F;
        if (mk1Var == null || !mk1Var.d()) {
            mk1Var = mk1.f8362h;
        }
        rv1Var.E = mk1Var;
        rv1Var.b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final boolean B0(mw1 mw1Var) {
        boolean z3;
        boolean z9;
        g1 g1Var = this.f4941f;
        boolean z10 = false;
        boolean z11 = true;
        if (g1Var.f6249n == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        mk1 mk1Var = mw1Var.F;
        if (mk1Var == null || !mk1Var.d()) {
            mk1Var = mk1.f8362h;
        }
        try {
            int i = mk1Var.f8365c;
            if (i == 7) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 34) {
                    if (i10 >= 33 && ct.D("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        s6 s6Var = g1Var.f6242f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        g1Var.f6246k = s6Var.x(myLooper, null);
                        g1Var.f6239b.a();
                        throw null;
                    }
                }
                i = 7;
            }
            if (i == 6) {
                if (Build.VERSION.SDK_INT >= 33 && ct.D("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    z10 = true;
                }
                z11 = z10;
            } else if (i == 7) {
                z11 = ct.D("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (!z11 && Build.VERSION.SDK_INT >= 29) {
                String str = bq0.f4860a;
                Locale locale = Locale.US;
                x21.F("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                mk1 mk1Var2 = mk1.f8362h;
                s6 s6Var2 = g1Var.f6242f;
                Looper myLooper2 = Looper.myLooper();
                myLooper2.getClass();
                g1Var.f6246k = s6Var2.x(myLooper2, null);
                g1Var.f6239b.a();
                throw null;
            }
            if (i == 2 || i == 10) {
                mk1 mk1Var3 = mk1.f8362h;
            }
            s6 s6Var22 = g1Var.f6242f;
            Looper myLooper22 = Looper.myLooper();
            myLooper22.getClass();
            g1Var.f6246k = s6Var22.x(myLooper22, null);
            g1Var.f6239b.a();
            throw null;
        } catch (dd0 e) {
            throw new x1(e, mw1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void I() {
        g1 g1Var = this.f4941f;
        if (g1Var.f6249n == 2) {
            return;
        }
        io0 io0Var = g1Var.f6246k;
        if (io0Var != null) {
            io0Var.f7185a.removeCallbacksAndMessages(null);
        }
        g1Var.f6247l = null;
        g1Var.f6249n = 2;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void M() {
        g1 g1Var = this.f4941f;
        if (g1Var.f6245j.s() == 0) {
            g1Var.e.M();
            return;
        }
        l3 l3Var = new l3(3, (byte) 0);
        if (g1Var.f6245j.s() <= 0) {
            g1Var.f6245j = l3Var;
        } else {
            ((f1) g1Var.f6245j.t()).getClass();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final boolean Z(boolean z3) {
        this.f4941f.e.f9687a.getClass();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final boolean a() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void g() {
        long j10 = this.f4940d;
        g1 g1Var = this.f4941f;
        g1Var.getClass();
        if (g1Var.f6250o >= j10) {
            g1Var.e.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final Surface i() {
        b80.K(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void j() {
        g1 g1Var = this.f4941f;
        g1Var.getClass();
        jl0.f7473c.getClass();
        g1Var.f6247l = null;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void p0(boolean z3) {
        l3 l3Var;
        this.f4940d = -9223372036854775807L;
        g1 g1Var = this.f4941f;
        if (g1Var.f6249n == 1) {
            g1Var.f6248m++;
            g1Var.e.p0(z3);
            while (true) {
                int s10 = g1Var.f6245j.s();
                l3Var = g1Var.f6245j;
                if (s10 <= 1) {
                    break;
                } else {
                    l3Var.t();
                }
            }
            if (l3Var.s() != 1) {
                g1Var.f6250o = -9223372036854775807L;
                io0 io0Var = g1Var.f6246k;
                io0Var.getClass();
                io0Var.e(new f(2, g1Var));
                return;
            }
            ((f1) g1Var.f6245j.t()).getClass();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void q0(float f10) {
        g1 g1Var = this.f4941f;
        g1Var.i.b(f10);
        g1Var.e.q0(f10);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void r0(Surface surface, jl0 jl0Var) {
        g1 g1Var = this.f4941f;
        Pair pair = g1Var.f6247l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((jl0) g1Var.f6247l.second).equals(jl0Var)) {
            return;
        }
        g1Var.f6247l = Pair.create(surface, jl0Var);
        jl0Var.getClass();
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void t0(long j10, long j11) {
        this.f4941f.e.t0(j10 + this.f4939c, j11);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void u0(int i) {
        this.f4941f.e.u0(i);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void v0(h1 h1Var) {
        this.f4941f.e.f9695k = h1Var;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void w0(List list) {
        if (!this.f4937a.equals(list)) {
            this.f4937a = d51.u(list);
            mw1 mw1Var = this.f4938b;
            if (mw1Var == null) {
                return;
            }
            rv1 rv1Var = new rv1(mw1Var);
            mk1 mk1Var = mw1Var.F;
            if (mk1Var == null || !mk1Var.d()) {
                mk1Var = mk1.f8362h;
            }
            rv1Var.E = mk1Var;
            rv1Var.b();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final boolean x0(long j10, w0 w0Var) {
        long j11;
        int i;
        b80.K(false);
        long j12 = j10 + this.f4939c;
        g1 g1Var = this.f4941f;
        k1 k1Var = g1Var.i;
        if (k1Var.f7594a == -9223372036854775807L) {
            j11 = -9223372036854775807L;
        } else {
            j11 = (long) (((j12 - r3) * k1Var.f7596c) + k1Var.f7595b);
        }
        if (j11 != -9223372036854775807L && j11 < g1Var.f6244h && (i = this.e) < 2) {
            this.e = i + 1;
            w0Var.a();
            return true;
        }
        int i10 = g1Var.f6251p;
        if (i10 == -1 || i10 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void y0(boolean z3) {
        g1 g1Var = this.f4941f;
        if (g1Var.f6241d) {
            g1Var.e.f9687a.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void z0(long j10) {
        this.f4939c = j10;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void zza() {
        g1 g1Var = this.f4941f;
        if (g1Var.f6241d) {
            g1Var.e.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void zzb() {
        g1 g1Var = this.f4941f;
        if (g1Var.f6241d) {
            g1Var.e.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void s0(v0 v0Var) {
    }
}

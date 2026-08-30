package com.google.android.gms.internal.ads;
import g5.q;
import j6.l;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q0 implements y1 {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f9687a;

    /* renamed from: b, reason: collision with root package name */
    public final k1 f9688b;

    /* renamed from: c, reason: collision with root package name */
    public final p1 f9689c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f9690d;
    public final t0 e;

    /* renamed from: f, reason: collision with root package name */
    public Surface f9691f;

    /* renamed from: g, reason: collision with root package name */
    public mw1 f9692g;

    /* renamed from: h, reason: collision with root package name */
    public long f9693h;
    public w1 i;

    /* renamed from: j, reason: collision with root package name */
    public Executor f9694j;

    /* renamed from: k, reason: collision with root package name */
    public h1 f9695k;

    public q0(j1 j1Var, k1 k1Var, s6 s6Var) {
        this.f9687a = j1Var;
        this.f9688b = k1Var;
        j1Var.f7278h = s6Var;
        t0 t0Var = new t0(new lx0(1, j1Var));
        this.e = t0Var;
        this.f9689c = new p1(new l(2, this), j1Var, k1Var, t0Var);
        this.f9690d = new ArrayDeque();
        this.f9692g = new mw1(new rv1());
        this.f9693h = -9223372036854775807L;
        this.i = w1.f12091a;
        this.f9694j = n0.f8503u;
        this.f9695k = o0.f8899v;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void A0(mw1 mw1Var, long j10, int i, List list) {
        long j11;
        long j12;
        b80.K(list.isEmpty());
        int i10 = mw1Var.f8466v;
        int i11 = mw1Var.f8467w;
        mw1 mw1Var2 = this.f9692g;
        int i12 = mw1Var2.f8466v;
        p1 p1Var = this.f9689c;
        if (i10 != i12 || i11 != mw1Var2.f8467w) {
            long j13 = p1Var.f9317h;
            if (j13 == -9223372036854775807L) {
                j11 = 0;
            } else {
                j11 = j13 + 1;
            }
            p1Var.f9313c.q(j11, new ir(i10, i11, 1.0f));
        }
        float f10 = mw1Var.f8470z;
        if (f10 != this.f9692g.f8470z) {
            t0 t0Var = this.e;
            t0Var.f11213f = f10;
            t0Var.f11209a.a();
            t0Var.f11210b.a();
            t0Var.f11211c = false;
            t0Var.f11212d = -9223372036854775807L;
            t0Var.e = 0;
            t0Var.c();
        }
        this.f9692g = mw1Var;
        if (j10 != this.f9693h) {
            if (p1Var.e.f4316x == 0) {
                p1Var.f9311a.a(i);
                p1Var.f9320l = j10;
            } else {
                l3 l3Var = p1Var.f9314d;
                long j14 = p1Var.f9317h;
                if (j14 == -9223372036854775807L) {
                    j12 = -4611686018427387904L;
                } else {
                    j12 = j14 + 1;
                }
                l3Var.q(j12, Long.valueOf(j10));
            }
            this.f9693h = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final boolean B0(mw1 mw1Var) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void I() {
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void M() {
        j1 j1Var = this.f9687a;
        if (j1Var.f7275d == 0) {
            j1Var.f7275d = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final boolean Z(boolean z3) {
        return this.f9687a.d(z3);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final boolean f() {
        p1 p1Var = this.f9689c;
        long j10 = p1Var.f9318j;
        if (j10 != -9223372036854775807L && p1Var.i == j10) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void g() {
        p1 p1Var = this.f9689c;
        long j10 = p1Var.f9317h;
        if (j10 == -9223372036854775807L) {
            j10 = Long.MIN_VALUE;
            p1Var.f9317h = Long.MIN_VALUE;
            p1Var.i = Long.MIN_VALUE;
        }
        p1Var.f9318j = j10;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final Surface i() {
        Surface surface = this.f9691f;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void j() {
        this.f9691f = null;
        this.f9687a.c(null);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void p0(boolean z3) {
        boolean z9;
        boolean z10 = false;
        if (z3) {
            j1 j1Var = this.f9687a;
            j1Var.f7273b.a();
            j1Var.e = -9223372036854775807L;
            j1Var.f7275d = Math.min(j1Var.f7275d, 1);
            j1Var.f7279j = false;
        }
        this.f9688b.c();
        p1 p1Var = this.f9689c;
        a2 a2Var = p1Var.e;
        a2Var.f4314v = 0;
        a2Var.f4315w = -1;
        a2Var.f4316x = 0;
        p1Var.f9317h = -9223372036854775807L;
        p1Var.i = -9223372036854775807L;
        p1Var.f9318j = -9223372036854775807L;
        l3 l3Var = p1Var.f9314d;
        if (l3Var.s() > 0) {
            if (l3Var.s() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            b80.l(z9);
            while (l3Var.s() > 1) {
                l3Var.t();
            }
            Object t3 = l3Var.t();
            t3.getClass();
            p1Var.f9320l = ((Long) t3).longValue();
        }
        l3 l3Var2 = p1Var.f9313c;
        if (l3Var2.s() > 0) {
            if (l3Var2.s() > 0) {
                z10 = true;
            }
            b80.l(z10);
            while (l3Var2.s() > 1) {
                l3Var2.t();
            }
            Object t10 = l3Var2.t();
            t10.getClass();
            l3Var2.q(0L, (ir) t10);
        }
        this.f9690d.clear();
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void q0(float f10) {
        this.f9687a.f(f10);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void r0(Surface surface, jl0 jl0Var) {
        this.f9691f = surface;
        this.f9687a.c(surface);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void s0(v0 v0Var) {
        this.i = v0Var;
        this.f9694j = o81.f9033u;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void t0(long j10, long j11) {
        try {
            this.f9689c.a(j10, j11);
        } catch (ns1 e) {
            throw new x1(e, this.f9692g);
        }
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void u0(int i) {
        o1 o1Var = this.f9687a.f7273b;
        if (o1Var.f8913h == i) {
            return;
        }
        o1Var.f8913h = i;
        o1Var.b(true);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void v0(h1 h1Var) {
        this.f9695k = h1Var;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void w0(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final boolean x0(long j10, w0 w0Var) {
        this.f9690d.add(w0Var);
        p1 p1Var = this.f9689c;
        a2 a2Var = p1Var.e;
        int i = a2Var.f4316x;
        long[] jArr = (long[]) a2Var.f4318z;
        int length = jArr.length;
        if (i == length) {
            int i10 = length + length;
            if (i10 >= 0) {
                long[] jArr2 = new long[i10];
                int i11 = a2Var.f4314v;
                int i12 = length - i11;
                System.arraycopy(jArr, i11, jArr2, 0, i12);
                System.arraycopy((long[]) a2Var.f4318z, 0, jArr2, i12, i11);
                a2Var.f4314v = 0;
                a2Var.f4315w = a2Var.f4316x - 1;
                a2Var.f4318z = jArr2;
                a2Var.f4317y = i10 - 1;
                jArr = jArr2;
            } else {
                q.l();
                return false;
            }
        }
        int i13 = (a2Var.f4315w + 1) & a2Var.f4317y;
        a2Var.f4315w = i13;
        jArr[i13] = j10;
        a2Var.f4316x++;
        p1Var.f9317h = j10;
        p1Var.f9318j = -9223372036854775807L;
        this.f9694j.execute(new f(1, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void y0(boolean z3) {
        this.f9687a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void z0(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void zza() {
        this.f9688b.c();
        this.f9687a.b();
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void zzb() {
        this.f9688b.c();
        j1 j1Var = this.f9687a;
        j1Var.f7274c = false;
        o1 o1Var = j1Var.f7273b;
        o1Var.f8909c = false;
        l1 l1Var = o1Var.f8908b;
        if (l1Var != null) {
            l1Var.b();
        }
        o1Var.c();
    }
}

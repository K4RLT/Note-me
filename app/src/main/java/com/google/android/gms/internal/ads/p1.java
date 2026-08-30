package com.google.android.gms.internal.ads;
import j6.l;
import l4.a;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f9311a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f9312b = new i1();

    /* renamed from: c, reason: collision with root package name */
    public final l3 f9313c = new l3(3, (byte) 0);

    /* renamed from: d, reason: collision with root package name */
    public final l3 f9314d = new l3(3, (byte) 0);
    public final a2 e;

    /* renamed from: f, reason: collision with root package name */
    public final k1 f9315f;

    /* renamed from: g, reason: collision with root package name */
    public final t0 f9316g;

    /* renamed from: h, reason: collision with root package name */
    public long f9317h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f9318j;

    /* renamed from: k, reason: collision with root package name */
    public ir f9319k;

    /* renamed from: l, reason: collision with root package name */
    public long f9320l;

    /* renamed from: m, reason: collision with root package name */
    public final j6.l f9321m;

    public p1(j6.l lVar, j1 j1Var, k1 k1Var, t0 t0Var) {
        this.f9321m = lVar;
        this.f9311a = j1Var;
        this.f9315f = k1Var;
        this.f9316g = t0Var;
        a2 a2Var = new a2();
        int i = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i = highestOneBit + highestOneBit;
        }
        a2Var.f4314v = 0;
        a2Var.f4315w = -1;
        a2Var.f4316x = 0;
        a2Var.f4318z = new long[i];
        a2Var.f4317y = i - 1;
        this.e = a2Var;
        this.f9317h = -9223372036854775807L;
        this.f9319k = ir.f7193d;
        this.i = -9223372036854775807L;
        this.f9318j = -9223372036854775807L;
    }

    public final void a(long j10, long j11) {
        long j12;
        mw1 mw1Var;
        j6.l lVar = this.f9321m;
        q0 q0Var = (q0) lVar.f18934w;
        while (true) {
            a2 a2Var = this.e;
            int i = a2Var.f4316x;
            if (i == 0) {
                return;
            }
            if (i != 0) {
                long j13 = ((long[]) a2Var.f4318z)[a2Var.f4314v];
                Long l10 = (Long) this.f9314d.u(j13);
                if (l10 != null && l10.longValue() != this.f9320l) {
                    this.f9320l = l10.longValue();
                    this.f9311a.a(2);
                }
                t0 t0Var = this.f9316g;
                t0Var.a(1000 * j13);
                long j14 = this.f9320l;
                long b10 = t0Var.b();
                long j15 = t0Var.f11215h;
                j1 j1Var = this.f9311a;
                i1 i1Var = this.f9312b;
                int e = j1Var.e(j13, j10, j11, j14, false, false, b10, j15, i1Var);
                if (e != 5 && e != 4) {
                    this.f9315f.a(j13, i1Var.f6953a);
                }
                boolean z3 = true;
                if (e != 0 && e != 1) {
                    if (e != 2 && e != 3) {
                        if (e != 4) {
                            return;
                        } else {
                            this.i = j13;
                        }
                    } else {
                        this.i = j13;
                        a2Var.l();
                        q0Var.f9694j.execute(new p0(lVar, 1));
                        ((w0) q0Var.f9690d.remove()).a();
                    }
                } else {
                    this.i = j13;
                    long l11 = a2Var.l();
                    ir irVar = (ir) this.f9313c.u(l11);
                    if (irVar != null && !irVar.equals(ir.f7193d) && !irVar.equals(this.f9319k)) {
                        this.f9319k = irVar;
                        rv1 rv1Var = new rv1();
                        rv1Var.f10314u = irVar.f7194a;
                        rv1Var.f10315v = irVar.f7195b;
                        rv1Var.e("video/raw");
                        lVar.f18933v = new mw1(rv1Var);
                        q0Var.f9694j.execute(new p0(lVar, irVar));
                    }
                    if (e == 0) {
                        j12 = System.nanoTime();
                    } else {
                        j12 = i1Var.f6954b;
                    }
                    int i10 = j1Var.f7275d;
                    j1Var.f7275d = 3;
                    j1Var.f7278h.getClass();
                    j1Var.f7276f = bq0.u(SystemClock.elapsedRealtime());
                    if (i10 == 3) {
                        z3 = false;
                    }
                    if (z3 && q0Var.f9691f != null) {
                        q0Var.f9694j.execute(new p0(lVar, 0));
                    }
                    mw1 mw1Var2 = (mw1) lVar.f18933v;
                    if (mw1Var2 == null) {
                        mw1Var = new mw1(new rv1());
                    } else {
                        mw1Var = mw1Var2;
                    }
                    long j16 = j12;
                    q0Var.f9695k.a(l11, j16, mw1Var, null);
                    w0 w0Var = (w0) q0Var.f9690d.remove();
                    w0Var.f12086c.y0(w0Var.f12084a, w0Var.f12085b, j16);
                }
            } else {
                l4.a.c();
                return;
            }
        }
    }
}

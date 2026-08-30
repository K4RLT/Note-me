package com.google.android.gms.internal.ads;
import r0.b;
import r0.m;

/* loaded from: classes.dex */
public final class ux1 extends lx1 {

    /* renamed from: k, reason: collision with root package name */
    public final hx1 f11742k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11743l;

    /* renamed from: m, reason: collision with root package name */
    public final ah f11744m;

    /* renamed from: n, reason: collision with root package name */
    public final qg f11745n;

    /* renamed from: o, reason: collision with root package name */
    public sx1 f11746o;

    /* renamed from: p, reason: collision with root package name */
    public rx1 f11747p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11748q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11749r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11750s;

    public ux1(hx1 hx1Var, boolean z3) {
        boolean z9;
        this.f11742k = hx1Var;
        if (z3) {
            hx1Var.e();
            z9 = true;
        } else {
            z9 = false;
        }
        this.f11743l = z9;
        this.f11744m = new ah();
        this.f11745n = new qg();
        hx1Var.d();
        this.f11746o = new sx1(new tx1(hx1Var.f()), ah.f4496m, sx1.e);
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final void a(y4 y4Var) {
        yy1 yy1Var;
        if (this.f11750s) {
            sx1 sx1Var = this.f11746o;
            uh uhVar = sx1Var.f9656b;
            if (uhVar instanceof yy1) {
                yy1Var = new yy1(((yy1) uhVar).f9656b, y4Var);
            } else {
                yy1Var = new yy1(uhVar, y4Var);
            }
            this.f11746o = new sx1(yy1Var, sx1Var.f11191c, sx1Var.f11192d);
        } else {
            this.f11746o = new sx1(new tx1(y4Var), ah.f4496m, sx1.e);
        }
        this.f11742k.a(y4Var);
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final void b(xx1 xx1Var) {
        rx1 rx1Var = (rx1) xx1Var;
        xx1 xx1Var2 = rx1Var.f10334y;
        if (xx1Var2 != null) {
            hx1 hx1Var = rx1Var.f10333x;
            hx1Var.getClass();
            hx1Var.b(xx1Var2);
        }
        if (xx1Var == this.f11747p) {
            this.f11747p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final void d() {
        this.f11742k.d();
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final void e() {
        this.f11742k.e();
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final y4 f() {
        return this.f11742k.f();
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final void h(as1 as1Var) {
        this.f8178j = bq0.p();
        if (!this.f11743l) {
            this.f11748q = true;
            t(null, this.f11742k);
        }
    }

    @Override // com.google.android.gms.internal.ads.lx1, com.google.android.gms.internal.ads.hx1
    public final void j() {
        this.f11749r = false;
        this.f11748q = false;
        super.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r4 != 0) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.lx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.Object r10, com.google.android.gms.internal.ads.hx1 r11, com.google.android.gms.internal.ads.uh r12) {
        /*
            r9 = this;
            java.lang.Void r10 = (java.lang.Void) r10
            boolean r10 = r9.f11749r
            r11 = 0
            if (r10 == 0) goto L1f
            com.google.android.gms.internal.ads.sx1 r10 = r9.f11746o
            java.lang.Object r0 = r10.f11191c
            java.lang.Object r10 = r10.f11192d
            com.google.android.gms.internal.ads.sx1 r1 = new com.google.android.gms.internal.ads.sx1
            r1.<init>(r12, r0, r10)
            r9.f11746o = r1
            com.google.android.gms.internal.ads.rx1 r10 = r9.f11747p
            if (r10 == 0) goto Lb5
            long r0 = r10.A
            r9.y(r0)
            goto Lb5
        L1f:
            boolean r10 = r12.g()
            if (r10 == 0) goto L42
            boolean r10 = r9.f11750s
            if (r10 == 0) goto L35
            com.google.android.gms.internal.ads.sx1 r10 = r9.f11746o
            java.lang.Object r0 = r10.f11191c
            java.lang.Object r10 = r10.f11192d
            com.google.android.gms.internal.ads.sx1 r1 = new com.google.android.gms.internal.ads.sx1
            r1.<init>(r12, r0, r10)
            goto L3e
        L35:
            java.lang.Object r10 = com.google.android.gms.internal.ads.ah.f4496m
            java.lang.Object r0 = com.google.android.gms.internal.ads.sx1.e
            com.google.android.gms.internal.ads.sx1 r1 = new com.google.android.gms.internal.ads.sx1
            r1.<init>(r12, r10, r0)
        L3e:
            r9.f11746o = r1
            goto Lb5
        L42:
            r10 = 0
            com.google.android.gms.internal.ads.ah r1 = r9.f11744m
            r2 = 0
            r12.b(r10, r1, r2)
            java.lang.Object r6 = r1.f4498a
            com.google.android.gms.internal.ads.rx1 r0 = r9.f11747p
            if (r0 == 0) goto L67
            long r4 = r0.f10331v
            com.google.android.gms.internal.ads.sx1 r7 = r9.f11746o
            com.google.android.gms.internal.ads.yx1 r0 = r0.f10330u
            java.lang.Object r0 = r0.f13003a
            com.google.android.gms.internal.ads.qg r8 = r9.f11745n
            r7.o(r0, r8)
            com.google.android.gms.internal.ads.sx1 r0 = r9.f11746o
            b(r10, r1, r2)
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 == 0) goto L67
            goto L68
        L67:
            r4 = r2
        L68:
            com.google.android.gms.internal.ads.qg r2 = r9.f11745n
            r3 = 0
            r0 = r12
            android.util.Pair r10 = m(r1, r2, r3, r4)
            java.lang.Object r12 = r10.first
            java.lang.Object r10 = r10.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r1 = r10.longValue()
            boolean r10 = r9.f11750s
            if (r10 == 0) goto L8a
            com.google.android.gms.internal.ads.sx1 r10 = r9.f11746o
            java.lang.Object r12 = r10.f11191c
            java.lang.Object r10 = r10.f11192d
            com.google.android.gms.internal.ads.sx1 r3 = new com.google.android.gms.internal.ads.sx1
            r3.<init>(r0, r12, r10)
            goto L8f
        L8a:
            com.google.android.gms.internal.ads.sx1 r3 = new com.google.android.gms.internal.ads.sx1
            r3.<init>(r0, r6, r12)
        L8f:
            r9.f11746o = r3
            com.google.android.gms.internal.ads.rx1 r10 = r9.f11747p
            if (r10 == 0) goto Lb5
            boolean r12 = r9.y(r1)
            if (r12 == 0) goto Lb5
            com.google.android.gms.internal.ads.yx1 r10 = r10.f10330u
            java.lang.Object r11 = r10.f13003a
            com.google.android.gms.internal.ads.sx1 r12 = r9.f11746o
            java.lang.Object r12 = r12.f11192d
            if (r12 == 0) goto Lb1
            java.lang.Object r12 = com.google.android.gms.internal.ads.sx1.e
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto Lb1
            com.google.android.gms.internal.ads.sx1 r11 = r9.f11746o
            java.lang.Object r11 = r11.f11192d
        Lb1:
            com.google.android.gms.internal.ads.yx1 r11 = r10.a(r11)
        Lb5:
            r10 = 1
            r9.f11750s = r10
            r9.f11749r = r10
            com.google.android.gms.internal.ads.sx1 r10 = r9.f11746o
            r9.k(r10)
            if (r11 == 0) goto Lc9
            com.google.android.gms.internal.ads.rx1 r10 = r9.f11747p
            r10.getClass()
            r10.k(r11)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ux1.s(java.lang.Object, com.google.android.gms.internal.ads.hx1, com.google.android.gms.internal.ads.uh):void");
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public final /* bridge */ /* synthetic */ void u(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public final yx1 v(Object obj, yx1 yx1Var) {
        Object obj2 = this.f11746o.f11192d;
        Object obj3 = yx1Var.f13003a;
        if (obj2 != null && obj2.equals(obj3)) {
            obj3 = sx1.e;
        }
        return yx1Var.a(obj3);
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public final /* synthetic */ void w(long j10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.hx1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final rx1 c(yx1 yx1Var, w wVar, long j10) {
        boolean z3;
        rx1 rx1Var = new rx1(yx1Var, wVar, j10);
        if (rx1Var.f10333x == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        hx1 hx1Var = this.f11742k;
        rx1Var.f10333x = hx1Var;
        if (this.f11749r) {
            Object obj = yx1Var.f13003a;
            if (this.f11746o.f11192d != null && obj.equals(sx1.e)) {
                obj = this.f11746o.f11192d;
            }
            rx1Var.k(yx1Var.a(obj));
            return rx1Var;
        }
        this.f11747p = rx1Var;
        if (!this.f11748q) {
            this.f11748q = true;
            t(null, hx1Var);
        }
        return rx1Var;
    }

    public final boolean y(long j10) {
        rx1 rx1Var = this.f11747p;
        int e = this.f11746o.e(rx1Var.f10330u.f13003a);
        if (e == -1) {
            return false;
        }
        sx1 sx1Var = this.f11746o;
        qg qgVar = this.f11745n;
        sx1Var.d(e, qgVar, false);
        long j11 = qgVar.f9842d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        rx1Var.A = j10;
        return true;
    }
}

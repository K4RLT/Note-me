package com.google.android.gms.internal.ads;
import b0.a;

/* loaded from: classes.dex */
public final class g4 implements n2 {

    /* renamed from: b, reason: collision with root package name */
    public p2 f6287b;

    /* renamed from: c, reason: collision with root package name */
    public o2 f6288c;

    /* renamed from: d, reason: collision with root package name */
    public f3 f6289d;
    public r6 e;

    /* renamed from: g, reason: collision with root package name */
    public int f6291g;

    /* renamed from: h, reason: collision with root package name */
    public long f6292h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final xk0 f6286a = new xk0(16);

    /* renamed from: j, reason: collision with root package name */
    public long f6293j = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f6290f = 0;

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
        if (this.e != null) {
            this.e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        return b80.n(o2Var, true);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.f6287b = p2Var;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f6290f = 0;
            this.i = 0;
            this.f6293j = -1L;
            if (this.e != null) {
                this.e = null;
                return;
            }
            return;
        }
        if (this.f6290f == 3) {
            r6 r6Var = this.e;
            r6Var.getClass();
            r6Var.g(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int h(o2 o2Var, a aVar) {
        while (true) {
            int i = this.f6290f;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return -1;
                        }
                        if (this.f6289d == null || o2Var != this.f6288c) {
                            this.f6288c = o2Var;
                            this.f6289d = new f3(o2Var, this.f6293j);
                        }
                        r6 r6Var = this.e;
                        r6Var.getClass();
                        int h3 = r6Var.h(this.f6289d, aVar);
                        if (h3 == 1) {
                            aVar.f1139v += this.f6293j;
                        }
                        return h3;
                    }
                    if (this.e == null) {
                        this.e = new r6(o7.f8995g, 8);
                    }
                    f3 f3Var = new f3(o2Var, this.f6293j);
                    this.f6289d = f3Var;
                    if (this.e.e(f3Var)) {
                        r6 r6Var2 = this.e;
                        long j10 = this.f6293j;
                        p2 p2Var = this.f6287b;
                        p2Var.getClass();
                        r6Var2.f(new f3(j10, p2Var, 1));
                        this.f6290f = 3;
                    } else {
                        p2 p2Var2 = this.f6287b;
                        p2Var2.getClass();
                        p2Var2.z();
                        this.f6287b.B(new r2(-9223372036854775807L, 0L));
                        this.f6290f = 4;
                    }
                } else {
                    o2Var.u((int) (this.f6292h - this.i));
                    this.i = 0;
                    this.f6290f = 0;
                }
            } else {
                int i10 = this.i;
                xk0 xk0Var = this.f6286a;
                if (i10 == 0) {
                    if (!o2Var.C(xk0Var.f12580a, 0, 8, true)) {
                        p2 p2Var3 = this.f6287b;
                        p2Var3.getClass();
                        p2Var3.z();
                        this.f6287b.B(new r2(-9223372036854775807L, 0L));
                        this.f6290f = 4;
                        return -1;
                    }
                    this.i = 8;
                    xk0Var.E(0);
                    this.f6292h = xk0Var.P();
                    this.f6291g = xk0Var.b();
                }
                long j11 = this.f6292h;
                if (j11 == 1) {
                    o2Var.v(xk0Var.f12580a, 8, 8);
                    this.i += 8;
                    j11 = xk0Var.j();
                    this.f6292h = j11;
                }
                if (this.f6291g == 1836086884) {
                    long n10 = o2Var.n();
                    this.f6293j = n10;
                    long j12 = this.i;
                    m4 m4Var = new m4(0L, n10 - j12, -9223372036854775807L, n10, j11 - j12);
                    p2 p2Var4 = this.f6287b;
                    p2Var4.getClass();
                    i3 A = p2Var4.A(1024, 4);
                    rv1 rv1Var = new rv1();
                    rv1Var.d("image/heic");
                    rv1Var.f10304k = new m8(m4Var);
                    A.e(new mw1(rv1Var));
                    this.f6290f = 2;
                } else {
                    this.f6290f = 1;
                }
            }
        }
    }
}

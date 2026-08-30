package com.google.android.gms.internal.ads;
import b2.d2;

import java.util.Collections;

/* loaded from: classes.dex */
public final class s9 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final hq0 f10554a;

    /* renamed from: b, reason: collision with root package name */
    public String f10555b;

    /* renamed from: c, reason: collision with root package name */
    public i3 f10556c;

    /* renamed from: d, reason: collision with root package name */
    public r9 f10557d;
    public boolean e;

    /* renamed from: l, reason: collision with root package name */
    public long f10563l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f10558f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final w9 f10559g = new w9(32);

    /* renamed from: h, reason: collision with root package name */
    public final w9 f10560h = new w9(33);
    public final w9 i = new w9(34);

    /* renamed from: j, reason: collision with root package name */
    public final w9 f10561j = new w9(39);

    /* renamed from: k, reason: collision with root package name */
    public final w9 f10562k = new w9(40);

    /* renamed from: m, reason: collision with root package name */
    public long f10564m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final xk0 f10565n = new xk0();

    public s9(hq0 hq0Var) {
        this.f10554a = hq0Var;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(p2 p2Var, fa faVar) {
        faVar.a();
        faVar.b();
        this.f10555b = faVar.e;
        faVar.b();
        i3 A = p2Var.A(faVar.f5998d, 2);
        this.f10556c = A;
        this.f10557d = new r9(A);
        this.f10554a.q(p2Var, faVar);
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void c(xk0 xk0Var) {
        int i;
        this.f10556c.getClass();
        String str = bq0.f4860a;
        while (xk0Var.B() > 0) {
            int i10 = xk0Var.f12581b;
            int i11 = xk0Var.f12582c;
            byte[] bArr = xk0Var.f12580a;
            this.f10563l += xk0Var.B();
            this.f10556c.a(xk0Var.B(), xk0Var);
            while (i10 < i11) {
                int Z = xy.Z(bArr, i10, i11, this.f10558f);
                if (Z != i11) {
                    int i12 = bArr[Z + 3] & 126;
                    int i13 = 3;
                    if (Z > 0) {
                        int i14 = Z - 1;
                        if (bArr[i14] == 0) {
                            i13 = 4;
                            Z = i14;
                        }
                    }
                    int i15 = Z - i10;
                    if (i15 > 0) {
                        f(bArr, i10, Z);
                    }
                    int i16 = i11 - Z;
                    long j10 = this.f10563l - i16;
                    if (i15 < 0) {
                        i = -i15;
                    } else {
                        i = 0;
                    }
                    g(j10, this.f10564m, i16, i);
                    e(j10, this.f10564m, i16, i12 >> 1);
                    i10 = Z + i13;
                } else {
                    f(bArr, i10, i11);
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void d(int i, long j10) {
        this.f10564m = j10;
    }

    public final void e(long j10, long j11, int i, int i10) {
        boolean z3;
        r9 r9Var = this.f10557d;
        boolean z9 = this.e;
        boolean z10 = false;
        r9Var.f10153g = false;
        r9Var.f10154h = false;
        r9Var.e = j11;
        r9Var.f10151d = 0;
        r9Var.f10149b = j10;
        if (i10 >= 32 && i10 != 40) {
            if (r9Var.i && !r9Var.f10155j) {
                if (z9) {
                    r9Var.a(i);
                }
                r9Var.i = false;
            }
            if (i10 <= 35 || i10 == 39) {
                r9Var.f10154h = !r9Var.f10155j;
                r9Var.f10155j = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z3 = true;
        } else {
            z3 = false;
        }
        r9Var.f10150c = z3;
        if (z3 || i10 <= 9) {
            z10 = true;
        }
        r9Var.f10152f = z10;
        if (!this.e) {
            this.f10559g.c(i10);
            this.f10560h.c(i10);
            this.i.c(i10);
        }
        this.f10561j.c(i10);
        this.f10562k.c(i10);
    }

    public final void f(byte[] bArr, int i, int i10) {
        boolean z3;
        r9 r9Var = this.f10557d;
        if (r9Var.f10152f) {
            int i11 = r9Var.f10151d;
            int i12 = (i + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r9Var.f10153g = z3;
                r9Var.f10152f = false;
            } else {
                r9Var.f10151d = (i10 - i) + i11;
            }
        }
        if (!this.e) {
            this.f10559g.d(bArr, i, i10);
            this.f10560h.d(bArr, i, i10);
            this.i.d(bArr, i, i10);
        }
        this.f10561j.d(bArr, i, i10);
        this.f10562k.d(bArr, i, i10);
    }

    public final void g(long j10, long j11, int i, int i10) {
        d2 d2Var = (d2) this.f10554a.f6874x;
        r9 r9Var = this.f10557d;
        boolean z3 = this.e;
        boolean z9 = false;
        if (r9Var.f10155j && r9Var.f10153g) {
            r9Var.f10158m = r9Var.f10150c;
            r9Var.f10155j = false;
        } else if (r9Var.f10154h || r9Var.f10153g) {
            if (z3 && r9Var.i) {
                r9Var.a(i + ((int) (j10 - r9Var.f10149b)));
            }
            r9Var.f10156k = r9Var.f10149b;
            r9Var.f10157l = r9Var.e;
            r9Var.f10158m = r9Var.f10150c;
            r9Var.i = true;
        }
        if (!this.e) {
            w9 w9Var = this.f10559g;
            w9Var.e(i10);
            w9 w9Var2 = this.f10560h;
            w9Var2.e(i10);
            w9 w9Var3 = this.i;
            w9Var3.e(i10);
            if (w9Var.f12172c && w9Var2.f12172c && w9Var3.f12172c) {
                String str = this.f10555b;
                int i11 = w9Var.f12173d;
                byte[] bArr = new byte[w9Var2.f12173d + i11 + w9Var3.f12173d];
                System.arraycopy((byte[]) w9Var.e, 0, bArr, 0, i11);
                System.arraycopy((byte[]) w9Var2.e, 0, bArr, w9Var.f12173d, w9Var2.f12173d);
                System.arraycopy((byte[]) w9Var3.e, 0, bArr, w9Var.f12173d + w9Var2.f12173d, w9Var3.f12173d);
                String str2 = null;
                h01 Y = xy.Y((byte[]) w9Var2.e, 3, w9Var2.f12173d, null);
                jy0 jy0Var = Y.f6525b;
                if (jy0Var != null) {
                    int i12 = jy0Var.f7571f;
                    int[] iArr = jy0Var.e;
                    int i13 = jy0Var.f7570d;
                    str2 = va0.a(jy0Var.f7567a, jy0Var.f7568b, jy0Var.f7569c, i13, iArr, i12);
                }
                rv1 rv1Var = new rv1();
                rv1Var.f10296a = str;
                rv1Var.d("video/mp2t");
                rv1Var.e("video/hevc");
                rv1Var.f10303j = str2;
                rv1Var.f10314u = Y.e;
                rv1Var.f10315v = Y.f6528f;
                rv1Var.f10316w = Y.f6529g;
                rv1Var.f10317x = Y.f6530h;
                rv1Var.E = new mk1(Y.f6532k, Y.f6533l, Y.f6534m, null, Y.f6526c + 8, Y.f6527d + 8);
                rv1Var.B = Y.i;
                rv1Var.f10309p = Y.f6531j;
                rv1Var.F = Y.f6524a + 1;
                rv1Var.f10310q = Collections.singletonList(bArr);
                mw1 mw1Var = new mw1(rv1Var);
                this.f10556c.e(mw1Var);
                int i14 = mw1Var.f8461q;
                if (i14 != -1) {
                    z9 = true;
                }
                b80.K(z9);
                d2Var.c(i14);
                this.e = true;
            }
        }
        w9 w9Var4 = this.f10561j;
        boolean e = w9Var4.e(i10);
        xk0 xk0Var = this.f10565n;
        if (e) {
            xk0Var.z((byte[]) w9Var4.e, xy.o((byte[]) w9Var4.e, w9Var4.f12173d));
            xk0Var.G(5);
            d2Var.d(j11, xk0Var);
        }
        w9 w9Var5 = this.f10562k;
        if (w9Var5.e(i10)) {
            xk0Var.z((byte[]) w9Var5.e, xy.o((byte[]) w9Var5.e, w9Var5.f12173d));
            xk0Var.G(5);
            d2Var.d(j11, xk0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void n() {
        this.f10556c.getClass();
        String str = bq0.f4860a;
        ((d2) this.f10554a.f6874x).e(0);
        g(this.f10563l, this.f10564m, 0, 0);
        e(this.f10563l, this.f10564m, 0, 48);
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        this.f10563l = 0L;
        this.f10564m = -9223372036854775807L;
        xy.a0(this.f10558f);
        this.f10559g.a();
        this.f10560h.a();
        this.i.a();
        this.f10561j.a();
        this.f10562k.a();
        ((d2) this.f10554a.f6874x).e(0);
        r9 r9Var = this.f10557d;
        if (r9Var != null) {
            r9Var.f10152f = false;
            r9Var.f10153g = false;
            r9Var.f10154h = false;
            r9Var.i = false;
            r9Var.f10155j = false;
        }
    }
}

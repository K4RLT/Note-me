package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class h9 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final xk0 f6615a;

    /* renamed from: c, reason: collision with root package name */
    public final String f6617c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6618d;

    /* renamed from: f, reason: collision with root package name */
    public String f6619f;

    /* renamed from: g, reason: collision with root package name */
    public i3 f6620g;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f6622j;

    /* renamed from: k, reason: collision with root package name */
    public int f6623k;

    /* renamed from: l, reason: collision with root package name */
    public long f6624l;

    /* renamed from: m, reason: collision with root package name */
    public mw1 f6625m;

    /* renamed from: n, reason: collision with root package name */
    public int f6626n;

    /* renamed from: o, reason: collision with root package name */
    public int f6627o;

    /* renamed from: p, reason: collision with root package name */
    public int f6628p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6631s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6634v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6635w;

    /* renamed from: h, reason: collision with root package name */
    public int f6621h = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f6632t = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public long f6633u = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f6616b = new AtomicInteger();

    /* renamed from: q, reason: collision with root package name */
    public int f6629q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f6630r = -1;
    public final String e = "video/mp2t";

    public h9(String str, int i, int i10) {
        this.f6615a = new xk0(new byte[i10]);
        this.f6617c = str;
        this.f6618d = i;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(p2 p2Var, fa faVar) {
        faVar.a();
        faVar.b();
        this.f6619f = faVar.e;
        faVar.b();
        this.f6620g = p2Var.A(faVar.f5998d, 1);
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void c(xk0 xk0Var) {
        boolean z3;
        int i;
        char c10;
        char c11;
        int i10;
        byte b10;
        int i11;
        byte b11;
        int i12;
        int i13;
        int i14;
        char c12;
        int i15;
        long j10;
        int i16;
        int i17;
        int i18;
        boolean z9;
        int i19;
        int i20;
        this.f6620g.getClass();
        while (xk0Var.B() > 0) {
            int i21 = this.f6621h;
            xk0 xk0Var2 = this.f6615a;
            int i22 = 2;
            switch (i21) {
                case 0:
                    while (true) {
                        if (xk0Var.B() > 0) {
                            int i23 = this.f6623k << 8;
                            this.f6623k = i23;
                            int K = i23 | xk0Var.K();
                            this.f6623k = K;
                            int t3 = x21.t(K);
                            this.f6628p = t3;
                            if (t3 != 0) {
                                f(this.f6623k);
                                this.f6623k = 0;
                                if (this.f6635w && this.f6628p == 2) {
                                    this.i = 0;
                                    break;
                                } else {
                                    int i24 = this.f6628p;
                                    if (i24 == 1) {
                                        this.f6635w = false;
                                        i = 1;
                                        i24 = 1;
                                    } else {
                                        i = i24;
                                    }
                                    if (i24 != 3 && i24 != 4) {
                                        if (i == 1) {
                                            this.f6621h = 1;
                                            break;
                                        } else {
                                            this.f6621h = 2;
                                            break;
                                        }
                                    } else {
                                        this.f6621h = 4;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!e(xk0Var, xk0Var2.f12580a, 18)) {
                        break;
                    } else {
                        this.f6634v = true;
                        byte[] bArr = xk0Var2.f12580a;
                        if (this.f6625m == null) {
                            String str = this.f6619f;
                            tk0 U = x21.U(bArr);
                            U.f(60);
                            int i25 = x21.f12449u[U.h(6)];
                            int i26 = x21.f12450v[U.h(4)];
                            c11 = 7;
                            int h3 = U.h(5);
                            c10 = 5;
                            if (h3 >= 29) {
                                i12 = -1;
                            } else {
                                i12 = (x21.f12451w[h3] * AdError.NETWORK_ERROR_CODE) / 2;
                            }
                            U.f(10);
                            if (U.h(2) > 0) {
                                i13 = 1;
                            } else {
                                i13 = 0;
                            }
                            int i27 = i25 + i13;
                            rv1 rv1Var = new rv1();
                            rv1Var.f10296a = str;
                            rv1Var.d("video/mp2t");
                            rv1Var.e("audio/vnd.dts");
                            rv1Var.f10302h = i12;
                            rv1Var.G = i27;
                            rv1Var.I = i26;
                            rv1Var.f10311r = null;
                            rv1Var.f10299d = this.f6617c;
                            rv1Var.f10300f = this.f6618d;
                            this.f6625m = new mw1(rv1Var);
                            this.f6631s = true;
                        } else {
                            c10 = 5;
                            c11 = 7;
                        }
                        this.f6626n = x21.I(bArr);
                        byte b12 = bArr[0];
                        if (b12 != -2) {
                            if (b12 != -1) {
                                if (b12 != 31) {
                                    i10 = (bArr[4] & 1) << 6;
                                    b10 = bArr[c10];
                                } else {
                                    i10 = (bArr[c10] & 7) << 4;
                                    b11 = bArr[6];
                                }
                            } else {
                                i10 = (bArr[4] & 7) << 4;
                                b11 = bArr[c11];
                            }
                            i11 = b11 & 60;
                            this.f6624l = ct.a(bq0.v(this.f6625m.J, (((i11 >> 2) | i10) + 1) * 32));
                            xk0Var2.E(0);
                            this.f6620g.a(18, xk0Var2);
                            this.f6621h = 6;
                            break;
                        } else {
                            i10 = (bArr[c10] & 1) << 6;
                            b10 = bArr[4];
                        }
                        i11 = b10 & 252;
                        this.f6624l = ct.a(bq0.v(this.f6625m.J, (((i11 >> 2) | i10) + 1) * 32));
                        xk0Var2.E(0);
                        this.f6620g.a(18, xk0Var2);
                        this.f6621h = 6;
                    }
                case 2:
                    if (e(xk0Var, xk0Var2.f12580a, 7)) {
                        tk0 U2 = x21.U(xk0Var2.f12580a);
                        U2.f(42);
                        if (true != U2.g()) {
                            i14 = 8;
                        } else {
                            i14 = 12;
                        }
                        this.f6629q = U2.h(i14) + 1;
                        this.f6621h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (e(xk0Var, xk0Var2.f12580a, this.f6629q)) {
                        m2 M = x21.M(xk0Var2.f12580a);
                        g(M);
                        this.f6626n = M.f8209d;
                        long j11 = M.e;
                        if (j11 != -9223372036854775807L) {
                            this.f6624l = j11;
                        }
                        xk0Var2.E(0);
                        this.f6620g.a(this.f6629q, xk0Var2);
                        this.f6621h = 6;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (e(xk0Var, xk0Var2.f12580a, 6)) {
                        tk0 U3 = x21.U(xk0Var2.f12580a);
                        U3.f(32);
                        int T = x21.T(U3, x21.C) + 1;
                        this.f6630r = T;
                        int i28 = this.i;
                        if (i28 > T) {
                            int i29 = i28 - T;
                            this.i = i28 - i29;
                            xk0Var.E(xk0Var.f12581b - i29);
                        }
                        this.f6621h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (e(xk0Var, xk0Var2.f12580a, this.f6630r)) {
                        byte[] bArr2 = xk0Var2.f12580a;
                        tk0 U4 = x21.U(bArr2);
                        int h10 = U4.h(32);
                        int T2 = x21.T(U4, x21.f12453y);
                        int i30 = T2 + 1;
                        if (h10 == 1078008818) {
                            c12 = 1;
                        } else {
                            c12 = 0;
                        }
                        if (c12 != 0) {
                            if (U4.g()) {
                                int i31 = T2 - 1;
                                int i32 = bArr2[i31] << 8;
                                int i33 = bArr2[T2] & 255;
                                String str2 = bq0.f4860a;
                                char c13 = 65535;
                                for (int i34 = 0; i34 < i31; i34++) {
                                    byte b13 = bArr2[i34];
                                    int[] iArr = bq0.f4866h;
                                    char c14 = (char) (iArr[((c13 >> '\f') ^ ((b13 & 255) >> 4)) & 255] ^ ((char) (c13 << 4)));
                                    c13 = (char) (iArr[((b13 & 15) ^ (c14 >> '\f')) & 255] ^ ((char) (c14 << 4)));
                                }
                                if ((((char) i32) | i33) == c13) {
                                    int h11 = U4.h(2);
                                    if (h11 != 0) {
                                        if (h11 != 1) {
                                            if (h11 == 2) {
                                                i17 = 384;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(h11).length() + 51);
                                                sb2.append("Unsupported base duration index in DTS UHD header: ");
                                                sb2.append(h11);
                                                throw va.a(null, sb2.toString());
                                            }
                                        } else {
                                            i17 = 480;
                                        }
                                    } else {
                                        i17 = 512;
                                    }
                                    int h12 = U4.h(3) + 1;
                                    int h13 = U4.h(2);
                                    if (h13 != 0) {
                                        if (h13 != 1) {
                                            if (h13 == 2) {
                                                i18 = 48000;
                                            } else {
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(h13).length() + 48);
                                                sb3.append("Unsupported clock rate index in DTS UHD header: ");
                                                sb3.append(h13);
                                                throw va.a(null, sb3.toString());
                                            }
                                        } else {
                                            i18 = 44100;
                                        }
                                    } else {
                                        i18 = 32000;
                                    }
                                    if (U4.g()) {
                                        U4.f(36);
                                    }
                                    i15 = (1 << U4.h(2)) * i18;
                                    j10 = bq0.w(i17 * h12, 1000000L, i18, RoundingMode.DOWN);
                                } else {
                                    throw va.a(null, "CRC check failed");
                                }
                            } else {
                                throw va.b("Only supports full channel mask-based audio presentation");
                            }
                        } else {
                            i15 = -2147483647;
                            j10 = -9223372036854775807L;
                        }
                        int i35 = i15;
                        int i36 = 0;
                        for (char c15 = 0; c15 < c12; c15 = 1) {
                            i36 += x21.T(U4, x21.f12454z);
                        }
                        for (int i37 = 0; i37 <= 0; i37++) {
                            AtomicInteger atomicInteger = this.f6616b;
                            if (c12 != 0) {
                                atomicInteger.set(x21.T(U4, x21.A));
                            }
                            if (atomicInteger.get() != 0) {
                                i16 = x21.T(U4, x21.B);
                            } else {
                                i16 = 0;
                            }
                            i36 += i16;
                        }
                        int i38 = i30 + i36;
                        m2 m2Var = new m2(2, i35, i38, j10, "audio/vnd.dts.uhd;profile=p2");
                        if (this.f6628p == 3) {
                            g(m2Var);
                        }
                        this.f6626n = i38;
                        if (j10 == -9223372036854775807L) {
                            j10 = 0;
                        }
                        this.f6624l = j10;
                        xk0Var2.E(0);
                        this.f6620g.a(this.f6630r, xk0Var2);
                        this.f6621h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(xk0Var.B(), this.f6626n - this.i);
                    this.f6620g.a(min, xk0Var);
                    int i39 = this.i + min;
                    this.i = i39;
                    int i40 = this.f6626n;
                    if (i39 != i40) {
                        break;
                    } else if (this.f6628p == 1) {
                        this.f6627o = i40;
                        this.i = 0;
                        this.f6622j = 0;
                        this.f6621h = 7;
                        break;
                    } else {
                        if (this.f6632t != -9223372036854775807L) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        b80.K(z9);
                        int i41 = this.f6626n;
                        int i42 = this.f6628p;
                        if (i42 == 2) {
                            i19 = this.f6627o;
                        } else {
                            i22 = i42;
                            i19 = 0;
                        }
                        int i43 = i41 + i19;
                        long j12 = this.f6632t;
                        i3 i3Var = this.f6620g;
                        if (i22 == 4) {
                            i20 = 0;
                        } else {
                            i20 = 1;
                        }
                        i3Var.c(j12, i20, i43, 0, null);
                        this.f6632t += this.f6624l;
                        long j13 = this.f6633u;
                        if (j13 != -9223372036854775807L) {
                            if (j13 != j12) {
                                this.f6632t = j13;
                            }
                            this.f6633u = -9223372036854775807L;
                        }
                        this.f6627o = 0;
                        this.f6621h = 0;
                        break;
                    }
                default:
                    while (xk0Var.B() > 0 && this.i < 4) {
                        int i44 = this.f6622j << 8;
                        this.f6622j = i44;
                        this.f6622j = i44 | xk0Var.K();
                        this.i++;
                    }
                    if (this.i != 4) {
                        break;
                    } else if (x21.t(this.f6622j) == 2) {
                        f(this.f6622j);
                        this.f6628p = 2;
                        this.f6622j = 0;
                        this.f6621h = 2;
                        break;
                    } else {
                        if (this.f6631s) {
                            i3 i3Var2 = this.f6620g;
                            mw1 mw1Var = this.f6625m;
                            mw1Var.getClass();
                            i3Var2.e(mw1Var);
                            this.f6631s = false;
                        }
                        if (this.f6632t != -9223372036854775807L) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        b80.K(z3);
                        long j14 = this.f6632t;
                        this.f6620g.c(j14, 1, this.f6627o, 0, null);
                        this.f6632t += this.f6624l;
                        long j15 = this.f6633u;
                        if (j15 != -9223372036854775807L) {
                            if (j15 != j14) {
                                this.f6632t = j15;
                            }
                            this.f6633u = -9223372036854775807L;
                        }
                        this.f6627o = 0;
                        int i45 = this.f6622j;
                        this.f6623k = i45;
                        this.f6622j = 0;
                        int t10 = x21.t(i45);
                        this.f6628p = t10;
                        if (t10 != 3 && t10 != 4) {
                            if (t10 == 1) {
                                f(i45);
                                this.f6623k = 0;
                                this.f6621h = 1;
                                break;
                            } else {
                                this.i = 0;
                                this.f6621h = 0;
                                break;
                            }
                        } else {
                            f(i45);
                            this.f6623k = 0;
                            this.f6621h = 4;
                            break;
                        }
                    }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void d(int i, long j10) {
        if (j10 != -9223372036854775807L) {
            if (this.f6621h != 0) {
                this.f6633u = j10;
            } else {
                this.f6632t = j10;
                this.f6633u = -9223372036854775807L;
            }
        }
    }

    public final boolean e(xk0 xk0Var, byte[] bArr, int i) {
        int min = Math.min(xk0Var.B(), i - this.i);
        xk0Var.H(bArr, this.i, min);
        int i10 = this.i + min;
        this.i = i10;
        if (i10 == i) {
            return true;
        }
        return false;
    }

    public final void f(int i) {
        byte[] bArr = this.f6615a.f12580a;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.i = 4;
    }

    public final void g(m2 m2Var) {
        int i;
        rv1 rv1Var;
        int i10 = m2Var.f8207b;
        if (i10 != -2147483647 && (i = m2Var.f8208c) != -1) {
            String str = m2Var.f8206a;
            if (str == null) {
                mw1 mw1Var = this.f6625m;
                if (mw1Var != null) {
                    str = mw1Var.f8459o;
                } else {
                    str = null;
                }
            }
            mw1 mw1Var2 = this.f6625m;
            if (mw1Var2 == null || this.f6631s || i != mw1Var2.H || i10 != mw1Var2.J || !Objects.equals(str, mw1Var2.f8459o)) {
                mw1 mw1Var3 = this.f6625m;
                if (mw1Var3 == null) {
                    rv1Var = new rv1();
                } else {
                    rv1Var = new rv1(mw1Var3);
                }
                rv1Var.f10296a = this.f6619f;
                rv1Var.d(this.e);
                rv1Var.e(str);
                rv1Var.G = i;
                rv1Var.I = i10;
                rv1Var.f10299d = this.f6617c;
                rv1Var.f10300f = this.f6618d;
                mw1 mw1Var4 = new mw1(rv1Var);
                this.f6625m = mw1Var4;
                this.f6620g.e(mw1Var4);
                this.f6631s = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void n() {
        if (this.f6621h == 7) {
            i3 i3Var = this.f6620g;
            i3Var.getClass();
            if (this.f6631s) {
                mw1 mw1Var = this.f6625m;
                mw1Var.getClass();
                i3Var.e(mw1Var);
                this.f6631s = false;
            }
            long j10 = this.f6632t;
            if (j10 != -9223372036854775807L) {
                this.f6620g.c(j10, 1, this.f6627o, 0, null);
                this.f6632t += this.f6624l;
            }
            this.f6627o = 0;
            this.i = 0;
            this.f6623k = 0;
            this.f6622j = 0;
            this.f6621h = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        this.f6621h = 0;
        this.i = 0;
        this.f6623k = 0;
        this.f6622j = 0;
        this.f6627o = 0;
        this.f6632t = -9223372036854775807L;
        this.f6633u = -9223372036854775807L;
        this.f6616b.set(0);
        this.f6631s = false;
        this.f6635w = this.f6634v;
    }
}

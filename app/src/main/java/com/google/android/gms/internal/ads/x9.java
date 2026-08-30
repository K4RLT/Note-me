package com.google.android.gms.internal.ads;
import a5.a;

/* loaded from: classes.dex */
public final class x9 implements ga {

    /* renamed from: a, reason: collision with root package name */
    public final j9 f12492a;

    /* renamed from: b, reason: collision with root package name */
    public final tk0 f12493b = new tk0(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f12494c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f12495d;
    public dp0 e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12496f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12497g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12498h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f12499j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12500k;

    public x9(j9 j9Var) {
        this.f12492a = j9Var;
    }

    @Override // com.google.android.gms.internal.ads.ga
    public final void a(int i, xk0 xk0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        int i15;
        long j11;
        this.e.getClass();
        int i16 = i & 1;
        j9 j9Var = this.f12492a;
        int i17 = 0;
        int i18 = -1;
        int i19 = 2;
        int i20 = 1;
        if (i16 != 0) {
            int i21 = this.f12494c;
            if (i21 != 0 && i21 != 1) {
                if (i21 != 2) {
                    int i22 = this.f12499j;
                    if (i22 != -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i22).length() + 48);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i22);
                        sb2.append(" more bytes");
                        x21.F("PesReader", sb2.toString());
                    }
                    j9Var.b();
                } else {
                    x21.F("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            if (xk0Var.f12582c == 0) {
                j9Var.n();
            }
            this.f12494c = 1;
            this.f12495d = 0;
        }
        int i23 = i;
        while (xk0Var.B() > 0) {
            int i24 = this.f12494c;
            if (i24 != 0) {
                tk0 tk0Var = this.f12493b;
                if (i24 != i20) {
                    if (i24 != i19) {
                        int B = xk0Var.B();
                        int i25 = this.f12499j;
                        if (i25 == i18) {
                            i14 = i17;
                        } else {
                            i14 = B - i25;
                        }
                        if (i14 > 0) {
                            B -= i14;
                            xk0Var.C(xk0Var.f12581b + B);
                        }
                        j9Var.c(xk0Var);
                        int i26 = this.f12499j;
                        if (i26 != i18) {
                            int i27 = i26 - B;
                            this.f12499j = i27;
                            if (i27 == 0) {
                                j9Var.b();
                                this.f12494c = i20;
                                this.f12495d = i17;
                            }
                        }
                    } else {
                        if (c(xk0Var, tk0Var.f11365a, Math.min(10, this.i)) && c(xk0Var, null, this.i)) {
                            tk0Var.d(i17);
                            if (this.f12496f) {
                                tk0Var.f(4);
                                long h3 = tk0Var.h(3);
                                tk0Var.f(i20);
                                int h10 = tk0Var.h(15) << 15;
                                tk0Var.f(i20);
                                long h11 = tk0Var.h(15);
                                tk0Var.f(i20);
                                if (!this.f12498h && this.f12497g) {
                                    tk0Var.f(4);
                                    j11 = h3;
                                    tk0Var.f(i20);
                                    int h12 = tk0Var.h(15) << 15;
                                    tk0Var.f(i20);
                                    long h13 = tk0Var.h(15);
                                    tk0Var.f(i20);
                                    this.e.c((tk0Var.h(3) << 30) | h12 | h13);
                                    this.f12498h = true;
                                } else {
                                    j11 = h3;
                                }
                                j10 = this.e.c((j11 << 30) | h10 | h11);
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            if (true != this.f12500k) {
                                i15 = 0;
                            } else {
                                i15 = 4;
                            }
                            i23 |= i15;
                            j9Var.d(i23, j10);
                            this.f12494c = 3;
                            i17 = 0;
                            this.f12495d = 0;
                            i18 = -1;
                            i19 = 2;
                            i20 = 1;
                        }
                    }
                    int i28 = i18;
                    i10 = i17;
                    i11 = i28;
                    i12 = i20;
                } else if (c(xk0Var, tk0Var.f11365a, 9)) {
                    tk0Var.d(i17);
                    int h14 = tk0Var.h(24);
                    i12 = 1;
                    if (h14 != 1) {
                        a5.a.t(new StringBuilder(String.valueOf(h14).length() + 30), "Unexpected start code prefix: ", h14, "PesReader");
                        i11 = -1;
                        this.f12499j = -1;
                        i13 = 0;
                        i19 = 2;
                    } else {
                        tk0Var.f(8);
                        int h15 = tk0Var.h(16);
                        tk0Var.f(5);
                        this.f12500k = tk0Var.g();
                        i19 = 2;
                        tk0Var.f(2);
                        this.f12496f = tk0Var.g();
                        this.f12497g = tk0Var.g();
                        tk0Var.f(6);
                        int h16 = tk0Var.h(8);
                        this.i = h16;
                        if (h15 == 0) {
                            this.f12499j = -1;
                            i13 = 2;
                            i11 = -1;
                        } else {
                            int i29 = (h15 - 3) - h16;
                            this.f12499j = i29;
                            if (i29 < 0) {
                                a5.a.t(new StringBuilder(String.valueOf(i29).length() + 36), "Found negative packet payload size: ", i29, "PesReader");
                                i11 = -1;
                                this.f12499j = -1;
                            } else {
                                i11 = -1;
                            }
                            i13 = 2;
                        }
                    }
                    this.f12494c = i13;
                    i10 = 0;
                    this.f12495d = 0;
                } else {
                    i10 = i17;
                    i11 = -1;
                    i19 = 2;
                    i12 = 1;
                }
            } else {
                int i30 = i18;
                i10 = i17;
                i11 = i30;
                i12 = i20;
                xk0Var.G(xk0Var.B());
            }
            int i31 = i10;
            i18 = i11;
            i17 = i31;
            i20 = i12;
        }
    }

    @Override // com.google.android.gms.internal.ads.ga
    public final void b(dp0 dp0Var, p2 p2Var, fa faVar) {
        this.e = dp0Var;
        this.f12492a.a(p2Var, faVar);
    }

    public final boolean c(xk0 xk0Var, byte[] bArr, int i) {
        int min = Math.min(xk0Var.B(), i - this.f12495d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            xk0Var.G(min);
        } else {
            xk0Var.H(bArr, this.f12495d, min);
        }
        int i10 = this.f12495d + min;
        this.f12495d = i10;
        if (i10 == i) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ga
    public final void zzb() {
        this.f12494c = 0;
        this.f12495d = 0;
        this.f12498h = false;
        this.f12492a.zza();
    }
}

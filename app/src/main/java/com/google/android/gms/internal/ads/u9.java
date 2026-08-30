package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class u9 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final xk0 f11580a;

    /* renamed from: b, reason: collision with root package name */
    public final y2 f11581b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11582c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11583d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public i3 f11584f;

    /* renamed from: g, reason: collision with root package name */
    public String f11585g;

    /* renamed from: h, reason: collision with root package name */
    public int f11586h = 0;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11587j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11588k;

    /* renamed from: l, reason: collision with root package name */
    public long f11589l;

    /* renamed from: m, reason: collision with root package name */
    public int f11590m;

    /* renamed from: n, reason: collision with root package name */
    public long f11591n;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.ads.y2] */
    public u9(String str, int i, String str2) {
        xk0 xk0Var = new xk0(4);
        this.f11580a = xk0Var;
        xk0Var.f12580a[0] = -1;
        this.f11581b = new Object();
        this.f11591n = -9223372036854775807L;
        this.f11582c = str;
        this.f11583d = i;
        this.e = str2;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(p2 p2Var, fa faVar) {
        faVar.a();
        faVar.b();
        this.f11585g = faVar.e;
        faVar.b();
        this.f11584f = p2Var.A(faVar.f5998d, 1);
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void c(xk0 xk0Var) {
        boolean z3;
        boolean z9;
        this.f11584f.getClass();
        while (xk0Var.B() > 0) {
            int i = this.f11586h;
            xk0 xk0Var2 = this.f11580a;
            boolean z10 = true;
            if (i != 0) {
                if (i != 1) {
                    int min = Math.min(xk0Var.B(), this.f11590m - this.i);
                    this.f11584f.a(min, xk0Var);
                    int i10 = this.i + min;
                    this.i = i10;
                    if (i10 >= this.f11590m) {
                        if (this.f11591n == -9223372036854775807L) {
                            z10 = false;
                        }
                        b80.K(z10);
                        this.f11584f.c(this.f11591n, 1, this.f11590m, 0, null);
                        this.f11591n += this.f11589l;
                        this.i = 0;
                        this.f11586h = 0;
                    }
                } else {
                    int min2 = Math.min(xk0Var.B(), 4 - this.i);
                    xk0Var.H(xk0Var2.f12580a, this.i, min2);
                    int i11 = this.i + min2;
                    this.i = i11;
                    if (i11 >= 4) {
                        xk0Var2.E(0);
                        int b10 = xk0Var2.b();
                        y2 y2Var = this.f11581b;
                        if (!y2Var.a(b10)) {
                            this.i = 0;
                            this.f11586h = 1;
                        } else {
                            this.f11590m = y2Var.f12756b;
                            if (!this.f11587j) {
                                this.f11589l = (y2Var.f12759f * 1000000) / y2Var.f12757c;
                                rv1 rv1Var = new rv1();
                                rv1Var.f10296a = this.f11585g;
                                rv1Var.d(this.e);
                                rv1Var.e((String) y2Var.f12760g);
                                rv1Var.f10308o = 4096;
                                rv1Var.G = y2Var.f12758d;
                                rv1Var.I = y2Var.f12757c;
                                rv1Var.f10299d = this.f11582c;
                                rv1Var.f10300f = this.f11583d;
                                this.f11584f.e(new mw1(rv1Var));
                                this.f11587j = true;
                            }
                            xk0Var2.E(0);
                            this.f11584f.a(4, xk0Var2);
                            this.f11586h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xk0Var.f12580a;
                int i12 = xk0Var.f12581b;
                int i13 = xk0Var.f12582c;
                while (true) {
                    if (i12 < i13) {
                        int i14 = i12 + 1;
                        byte b11 = bArr[i12];
                        if ((b11 & 255) == 255) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (this.f11588k && (b11 & 224) == 224) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        this.f11588k = z3;
                        if (z9) {
                            xk0Var.E(i14);
                            this.f11588k = false;
                            xk0Var2.f12580a[1] = bArr[i12];
                            this.i = 2;
                            this.f11586h = 1;
                            break;
                        }
                        i12 = i14;
                    } else {
                        xk0Var.E(i13);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void d(int i, long j10) {
        this.f11591n = j10;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        this.f11586h = 0;
        this.i = 0;
        this.f11588k = false;
        this.f11591n = -9223372036854775807L;
    }
}

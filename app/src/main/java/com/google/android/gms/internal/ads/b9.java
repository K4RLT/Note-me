package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class b9 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final c9 f4742a = new c9(null, 0, 0, "audio/ac3");

    /* renamed from: b, reason: collision with root package name */
    public final xk0 f4743b = new xk0(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f4744c;

    static {
        int i = ed1.O;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        i2 i2Var;
        int I;
        xk0 xk0Var = new xk0(10);
        int i = 0;
        while (true) {
            i2Var = (i2) o2Var;
            i2Var.E(xk0Var.f12580a, 0, 10, false);
            xk0Var.E(0);
            if (xk0Var.O() != 4801587) {
                break;
            }
            xk0Var.G(3);
            int g8 = xk0Var.g();
            i += g8 + 10;
            i2Var.d(g8, false);
        }
        i2Var.f6967z = 0;
        i2Var.d(i, false);
        int i10 = 0;
        int i11 = i;
        while (true) {
            i2Var.E(xk0Var.f12580a, 0, 6, false);
            xk0Var.E(0);
            if (xk0Var.L() != 2935) {
                i2Var.f6967z = 0;
                i11++;
                if (i11 - i >= 8192) {
                    break;
                }
                i2Var.d(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] bArr = xk0Var.f12580a;
                if (bArr.length < 6) {
                    I = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i12 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    I = i12 + i12;
                } else {
                    byte b10 = bArr[4];
                    I = b80.I((b10 & 192) >> 6, b10 & 63);
                }
                if (I == -1) {
                    break;
                }
                i2Var.d(I - 6, false);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.f4742a.a(p2Var, new fa(Integer.MIN_VALUE, 0, 1));
        p2Var.z();
        p2Var.B(new r2(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        this.f4744c = false;
        this.f4742a.zza();
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int h(o2 o2Var, b0.a aVar) {
        xk0 xk0Var = this.f4743b;
        int e = o2Var.e(xk0Var.f12580a, 0, 2786);
        if (e == -1) {
            return -1;
        }
        xk0Var.E(0);
        xk0Var.C(e);
        boolean z3 = this.f4744c;
        c9 c9Var = this.f4742a;
        if (!z3) {
            c9Var.f5048o = 0L;
            this.f4744c = true;
        }
        c9Var.c(xk0Var);
        return 0;
    }
}

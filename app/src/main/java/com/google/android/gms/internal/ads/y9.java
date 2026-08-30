package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class y9 {

    /* renamed from: a, reason: collision with root package name */
    public final dp0 f12815a;

    /* renamed from: b, reason: collision with root package name */
    public final xk0 f12816b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12817c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12818d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public long f12819f;

    /* renamed from: g, reason: collision with root package name */
    public long f12820g;

    /* renamed from: h, reason: collision with root package name */
    public long f12821h;

    public y9(int i) {
        switch (i) {
            case 1:
                this.f12815a = new dp0();
                this.f12819f = -9223372036854775807L;
                this.f12820g = -9223372036854775807L;
                this.f12821h = -9223372036854775807L;
                this.f12816b = new xk0();
                return;
            default:
                this.f12815a = new dp0();
                this.f12819f = -9223372036854775807L;
                this.f12820g = -9223372036854775807L;
                this.f12821h = -9223372036854775807L;
                this.f12816b = new xk0();
                return;
        }
    }

    public static long a(xk0 xk0Var) {
        int i = xk0Var.f12581b;
        if (xk0Var.B() >= 9) {
            byte[] bArr = new byte[9];
            xk0Var.H(bArr, 0, 9);
            xk0Var.E(i);
            byte b10 = bArr[0];
            if ((b10 & 196) == 68) {
                byte b11 = bArr[2];
                if ((b11 & 4) == 4) {
                    byte b12 = bArr[4];
                    if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j10 = b10;
                        long j11 = b11;
                        long j12 = (248 & j11) >> 3;
                        long j13 = (j11 & 3) << 13;
                        return j13 | ((bArr[1] & 255) << 20) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (j12 << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
                    }
                    return -9223372036854775807L;
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public static final int c(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public void b(o2 o2Var) {
        byte[] bArr = bq0.f4861b;
        int length = bArr.length;
        this.f12816b.z(bArr, 0);
        this.f12817c = true;
        o2Var.h();
    }
}

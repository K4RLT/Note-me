package com.google.android.gms.internal.ads;
import b0.a;

/* loaded from: classes.dex */
public final class e9 implements n2 {

    /* renamed from: c, reason: collision with root package name */
    public final xk0 f5618c;

    /* renamed from: d, reason: collision with root package name */
    public final tk0 f5619d;
    public p2 e;

    /* renamed from: f, reason: collision with root package name */
    public long f5620f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5622h;
    public boolean i;

    /* renamed from: a, reason: collision with root package name */
    public final f9 f5616a = new f9(null, 0, "audio/mp4a-latm", true);

    /* renamed from: b, reason: collision with root package name */
    public final xk0 f5617b = new xk0(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f5621g = -1;

    static {
        int i = ct.G;
    }

    public e9() {
        xk0 xk0Var = new xk0(10);
        this.f5618c = xk0Var;
        byte[] bArr = xk0Var.f12580a;
        this.f5619d = new tk0(bArr, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        xk0 xk0Var;
        i2 i2Var;
        int i = 0;
        while (true) {
            xk0Var = this.f5618c;
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
        if (this.f5621g == -1) {
            this.f5621g = i;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = i;
        do {
            i2Var.E(xk0Var.f12580a, 0, 2, false);
            xk0Var.E(0);
            if ((xk0Var.L() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                i2Var.E(xk0Var.f12580a, 0, 4, false);
                tk0 tk0Var = this.f5619d;
                tk0Var.d(14);
                int h3 = tk0Var.h(13);
                if (h3 <= 6) {
                    i12++;
                    i2Var.f6967z = 0;
                    i2Var.d(i12, false);
                } else {
                    i2Var.d(h3 - 6, false);
                    i11 += h3;
                }
            } else {
                i12++;
                i2Var.f6967z = 0;
                i2Var.d(i12, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i12 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.e = p2Var;
        this.f5616a.a(p2Var, new fa(Integer.MIN_VALUE, 0, 1));
        p2Var.z();
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        this.f5622h = false;
        this.f5616a.zza();
        this.f5620f = j11;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int h(o2 o2Var, a aVar) {
        this.e.getClass();
        xk0 xk0Var = this.f5617b;
        int e = o2Var.e(xk0Var.f12580a, 0, 2048);
        if (!this.i) {
            this.e.B(new r2(-9223372036854775807L, 0L));
            this.i = true;
        }
        if (e == -1) {
            return -1;
        }
        xk0Var.E(0);
        xk0Var.C(e);
        boolean z3 = this.f5622h;
        f9 f9Var = this.f5616a;
        if (!z3) {
            f9Var.f5992u = this.f5620f;
            this.f5622h = true;
        }
        f9Var.c(xk0Var);
        return 0;
    }
}

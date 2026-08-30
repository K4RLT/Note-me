package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ca implements ga {

    /* renamed from: a, reason: collision with root package name */
    public final ba f5052a;

    /* renamed from: b, reason: collision with root package name */
    public final xk0 f5053b = new xk0(32);

    /* renamed from: c, reason: collision with root package name */
    public int f5054c;

    /* renamed from: d, reason: collision with root package name */
    public int f5055d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5056f;

    public ca(ba baVar) {
        this.f5052a = baVar;
    }

    @Override // com.google.android.gms.internal.ads.ga
    public final void a(int i, xk0 xk0Var) {
        int i10;
        boolean z3;
        int i11 = i & 1;
        if (i11 != 0) {
            i10 = xk0Var.f12581b + xk0Var.K();
        } else {
            i10 = -1;
        }
        if (this.f5056f) {
            if (i11 != 0) {
                this.f5056f = false;
                xk0Var.E(i10);
                this.f5055d = 0;
            } else {
                return;
            }
        }
        while (xk0Var.B() > 0) {
            int i12 = this.f5055d;
            xk0 xk0Var2 = this.f5053b;
            if (i12 < 3) {
                if (i12 == 0) {
                    int K = xk0Var.K();
                    xk0Var.E(xk0Var.f12581b - 1);
                    if (K == 255) {
                        this.f5056f = true;
                        return;
                    }
                }
                int min = Math.min(xk0Var.B(), 3 - this.f5055d);
                xk0Var.H(xk0Var2.f12580a, this.f5055d, min);
                int i13 = this.f5055d + min;
                this.f5055d = i13;
                if (i13 == 3) {
                    xk0Var2.E(0);
                    xk0Var2.C(3);
                    xk0Var2.G(1);
                    int K2 = xk0Var2.K();
                    if ((K2 & 128) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int K3 = xk0Var2.K();
                    this.e = z3;
                    int i14 = (((K2 & 15) << 8) | K3) + 3;
                    this.f5054c = i14;
                    byte[] bArr = xk0Var2.f12580a;
                    if (bArr.length < i14) {
                        int length = bArr.length;
                        xk0Var2.A(Math.min(4098, Math.max(i14, length + length)));
                    }
                }
            } else {
                int min2 = Math.min(xk0Var.B(), this.f5054c - this.f5055d);
                xk0Var.H(xk0Var2.f12580a, this.f5055d, min2);
                int i15 = this.f5055d + min2;
                this.f5055d = i15;
                int i16 = this.f5054c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.e) {
                        if (bq0.h(0, i16, -1, xk0Var2.f12580a) == 0) {
                            xk0Var2.C(this.f5054c - 4);
                        } else {
                            this.f5056f = true;
                            return;
                        }
                    } else {
                        xk0Var2.C(i16);
                    }
                    xk0Var2.E(0);
                    this.f5052a.f(xk0Var2);
                    this.f5055d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ga
    public final void b(dp0 dp0Var, p2 p2Var, fa faVar) {
        this.f5052a.b(dp0Var, p2Var, faVar);
        this.f5056f = true;
    }

    @Override // com.google.android.gms.internal.ads.ga
    public final void zzb() {
        this.f5056f = true;
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12755a;

    /* renamed from: b, reason: collision with root package name */
    public int f12756b;

    /* renamed from: c, reason: collision with root package name */
    public int f12757c;

    /* renamed from: d, reason: collision with root package name */
    public int f12758d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f12759f;

    /* renamed from: g, reason: collision with root package name */
    public Object f12760g;

    public /* synthetic */ y2(gv1 gv1Var) {
        this.f12755a = gv1Var.f6481a;
        this.f12756b = gv1Var.f6482b;
        this.f12757c = gv1Var.f6483c;
        this.f12758d = gv1Var.f6484d;
        this.f12760g = gv1Var.e;
        this.e = gv1Var.f6485f;
        this.f12759f = gv1Var.f6486g;
    }

    public boolean a(int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i & (-2097152)) == -2097152 && (i10 = (i >>> 19) & 3) != 1 && (i11 = (i >>> 17) & 3) != 0 && (i12 = (i >>> 12) & 15) != 0 && i12 != 15 && (i13 = (i >>> 10) & 3) != 3) {
            int i16 = i12 - 1;
            this.f12755a = i10;
            this.f12760g = ed1.f5659u[3 - i11];
            int i17 = ed1.f5660v[i13];
            this.f12757c = i17;
            int i18 = 2;
            if (i10 == 2) {
                i17 /= 2;
                this.f12757c = i17;
            } else if (i10 == 0) {
                i17 /= 4;
                this.f12757c = i17;
            }
            int i19 = (i >>> 9) & 1;
            int i20 = 1152;
            if (i11 != 1) {
                if (i11 != 2) {
                    i20 = 384;
                }
            } else if (i10 != 3) {
                i20 = 576;
            }
            this.f12759f = i20;
            if (i11 == 3) {
                if (i10 == 3) {
                    i15 = ed1.f5661w[i16];
                } else {
                    i15 = ed1.f5662x[i16];
                }
                this.e = i15;
                this.f12756b = (((i15 * 12) / i17) + i19) * 4;
            } else {
                int i21 = 144;
                if (i10 == 3) {
                    if (i11 == 2) {
                        i14 = ed1.f5663y[i16];
                    } else {
                        i14 = ed1.f5664z[i16];
                    }
                    this.e = i14;
                    this.f12756b = ((i14 * 144) / i17) + i19;
                } else {
                    int i22 = ed1.A[i16];
                    this.e = i22;
                    if (i11 == 1) {
                        i21 = 72;
                    }
                    this.f12756b = ((i21 * i22) / i17) + i19;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i18 = 1;
            }
            this.f12758d = i18;
            return true;
        }
        return false;
    }
}

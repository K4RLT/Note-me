package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class m6 {

    /* renamed from: a, reason: collision with root package name */
    public final i3 f8256a;

    /* renamed from: d, reason: collision with root package name */
    public z6 f8259d;
    public h6 e;

    /* renamed from: f, reason: collision with root package name */
    public int f8260f;

    /* renamed from: g, reason: collision with root package name */
    public int f8261g;

    /* renamed from: h, reason: collision with root package name */
    public int f8262h;
    public int i;

    /* renamed from: l, reason: collision with root package name */
    public mw1 f8265l;

    /* renamed from: m, reason: collision with root package name */
    public mw1 f8266m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8267n;

    /* renamed from: b, reason: collision with root package name */
    public final y6 f8257b = new y6();

    /* renamed from: c, reason: collision with root package name */
    public final xk0 f8258c = new xk0();

    /* renamed from: j, reason: collision with root package name */
    public final xk0 f8263j = new xk0(1);

    /* renamed from: k, reason: collision with root package name */
    public final xk0 f8264k = new xk0();

    public m6(i3 i3Var, z6 z6Var, h6 h6Var, mw1 mw1Var) {
        this.f8256a = i3Var;
        this.f8259d = z6Var;
        this.e = h6Var;
        this.f8266m = mw1Var;
        if (x21.o(mw1Var.f8459o)) {
            this.f8265l = mw1Var;
        }
        this.f8259d = z6Var;
        this.e = h6Var;
        if (this.f8265l == null) {
            i3Var.e(this.f8266m);
        }
        a();
    }

    public final void a() {
        y6 y6Var = this.f8257b;
        y6Var.f12787d = 0;
        y6Var.f12797p = 0L;
        y6Var.f12798q = false;
        y6Var.f12792k = false;
        y6Var.f12796o = false;
        y6Var.f12794m = null;
        this.f8260f = 0;
        this.f8262h = 0;
        this.f8261g = 0;
        this.i = 0;
        this.f8267n = false;
    }

    public final int b() {
        int i;
        if (!this.f8267n) {
            i = this.f8259d.f13091g[this.f8260f];
        } else if (this.f8257b.f12791j[this.f8260f]) {
            i = 1;
        } else {
            i = 0;
        }
        if (e() != null) {
            return i | 1073741824;
        }
        return i;
    }

    public final boolean c() {
        this.f8260f++;
        if (!this.f8267n) {
            return false;
        }
        int i = this.f8261g + 1;
        this.f8261g = i;
        int[] iArr = this.f8257b.f12789g;
        int i10 = this.f8262h;
        if (i != iArr[i10]) {
            return true;
        }
        this.f8262h = i10 + 1;
        this.f8261g = 0;
        return false;
    }

    public final int d(int i, int i10) {
        xk0 xk0Var;
        boolean z3;
        boolean z9;
        int i11;
        x6 e = e();
        if (e == null) {
            return 0;
        }
        int i12 = e.f12472d;
        y6 y6Var = this.f8257b;
        if (i12 != 0) {
            xk0Var = y6Var.f12795n;
        } else {
            byte[] bArr = e.e;
            String str = bq0.f4860a;
            i12 = bArr.length;
            xk0 xk0Var2 = this.f8264k;
            xk0Var2.z(bArr, i12);
            xk0Var = xk0Var2;
        }
        int i13 = this.f8260f;
        if (y6Var.f12792k && y6Var.f12793l[i13]) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || i10 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (true != z9) {
            i11 = 0;
        } else {
            i11 = 128;
        }
        xk0 xk0Var3 = this.f8263j;
        xk0Var3.f12580a[0] = (byte) (i11 | i12);
        xk0Var3.E(0);
        i3 i3Var = this.f8256a;
        i3Var.f(xk0Var3, 1, 1);
        i3Var.f(xk0Var, i12, 1);
        if (!z9) {
            return i12 + 1;
        }
        xk0 xk0Var4 = this.f8258c;
        if (!z3) {
            xk0Var4.y(8);
            byte[] bArr2 = xk0Var4.f12580a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i10;
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            i3Var.f(xk0Var4, 8, 1);
            return i12 + 9;
        }
        int i14 = i12 + 1;
        xk0 xk0Var5 = y6Var.f12795n;
        int L = xk0Var5.L();
        xk0Var5.G(-2);
        int i15 = (L * 6) + 2;
        if (i10 != 0) {
            xk0Var4.y(i15);
            byte[] bArr3 = xk0Var4.f12580a;
            xk0Var5.H(bArr3, 0, i15);
            int i16 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i10;
            bArr3[2] = (byte) ((i16 >> 8) & 255);
            bArr3[3] = (byte) (i16 & 255);
        } else {
            xk0Var4 = xk0Var5;
        }
        i3Var.f(xk0Var4, i15, 1);
        return i14 + i15;
    }

    public final x6 e() {
        if (this.f8267n) {
            y6 y6Var = this.f8257b;
            h6 h6Var = y6Var.f12784a;
            String str = bq0.f4860a;
            int i = h6Var.f6605a;
            x6 x6Var = y6Var.f12794m;
            if (x6Var == null) {
                x6[] x6VarArr = this.f8259d.f13086a.f12160n;
                if (x6VarArr == null) {
                    x6Var = null;
                } else {
                    x6Var = x6VarArr[i];
                }
            }
            if (x6Var != null && x6Var.f12469a) {
                return x6Var;
            }
        }
        return null;
    }
}

package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class s7 implements i3 {

    /* renamed from: a, reason: collision with root package name */
    public final i3 f10537a;

    /* renamed from: b, reason: collision with root package name */
    public final o7 f10538b;

    /* renamed from: g, reason: collision with root package name */
    public p7 f10542g;

    /* renamed from: h, reason: collision with root package name */
    public mw1 f10543h;
    public boolean i;

    /* renamed from: d, reason: collision with root package name */
    public int f10540d = 0;
    public int e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f10541f = bq0.f4861b;

    /* renamed from: c, reason: collision with root package name */
    public final xk0 f10539c = new xk0();

    public s7(i3 i3Var, o7 o7Var) {
        this.f10537a = i3Var;
        this.f10538b = o7Var;
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final int b(fs1 fs1Var, int i, boolean z3) {
        if (this.f10542g == null) {
            return this.f10537a.b(fs1Var, i, z3);
        }
        g(i);
        int e = fs1Var.e(this.f10541f, this.e, i);
        if (e == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        this.e += e;
        return e;
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final void c(long j10, int i, int i10, int i11, h3 h3Var) {
        boolean z3;
        if (this.f10542g == null) {
            this.f10537a.c(j10, i, i10, i11, h3Var);
            return;
        }
        if (h3Var == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.w("DRM on subtitles is not supported", z3);
        int i12 = (this.e - i11) - i10;
        try {
            this.f10542g.w(i12, i10, new r7(this, j10, i), this.f10541f);
        } catch (RuntimeException e) {
            if (this.i) {
                x21.K("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
            } else {
                throw e;
            }
        }
        int i13 = i12 + i10;
        this.f10540d = i13;
        if (i13 == this.e) {
            this.f10540d = 0;
            this.e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final void e(mw1 mw1Var) {
        boolean z3;
        p7 p7Var;
        String str = mw1Var.f8459o;
        str.getClass();
        if (ha.f(str) == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        boolean equals = mw1Var.equals(this.f10543h);
        o7 o7Var = this.f10538b;
        if (!equals) {
            this.f10543h = mw1Var;
            if (o7Var.f(mw1Var)) {
                p7Var = o7Var.j(mw1Var);
            } else {
                p7Var = null;
            }
            this.f10542g = p7Var;
        }
        p7 p7Var2 = this.f10542g;
        i3 i3Var = this.f10537a;
        if (p7Var2 == null) {
            i3Var.e(mw1Var);
            return;
        }
        rv1 rv1Var = new rv1(mw1Var);
        rv1Var.e("application/x-media3-cues");
        rv1Var.f10303j = str;
        rv1Var.f10312s = Long.MAX_VALUE;
        rv1Var.N = o7Var.i(mw1Var);
        i3Var.e(new mw1(rv1Var));
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final void f(xk0 xk0Var, int i, int i10) {
        if (this.f10542g == null) {
            this.f10537a.f(xk0Var, i, i10);
            return;
        }
        g(i);
        xk0Var.H(this.f10541f, this.e, i);
        this.e += i;
    }

    public final void g(int i) {
        byte[] bArr;
        int length = this.f10541f.length;
        int i10 = this.e;
        if (length - i10 >= i) {
            return;
        }
        int i11 = i10 - this.f10540d;
        int max = Math.max(i11 + i11, i + i11);
        byte[] bArr2 = this.f10541f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.f10540d, bArr, 0, i11);
        this.f10540d = 0;
        this.e = i11;
        this.f10541f = bArr;
    }
}

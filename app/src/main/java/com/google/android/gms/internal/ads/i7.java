package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i7 extends j7 {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f7033o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f7034p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f7035n;

    public static boolean e(xk0 xk0Var, byte[] bArr) {
        if (xk0Var.B() < 8) {
            return false;
        }
        int i = xk0Var.f12581b;
        byte[] bArr2 = new byte[8];
        xk0Var.H(bArr2, 0, 8);
        xk0Var.E(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final void a(boolean z3) {
        super.a(z3);
        if (z3) {
            this.f7035n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final long b(xk0 xk0Var) {
        byte[] bArr = xk0Var.f12580a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.i * ay0.R(b11, b10)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final boolean c(xk0 xk0Var, long j10, com.google.android.gms.internal.measurement.e4 e4Var) {
        if (e(xk0Var, f7033o)) {
            byte[] copyOf = Arrays.copyOf(xk0Var.f12580a, xk0Var.f12582c);
            int i = copyOf[9] & 255;
            ArrayList g8 = ay0.g(copyOf);
            if (((mw1) e4Var.f13728v) == null) {
                rv1 rv1Var = new rv1();
                rv1Var.d("audio/ogg");
                rv1Var.e("audio/opus");
                rv1Var.G = i;
                rv1Var.I = 48000;
                rv1Var.f10310q = g8;
                e4Var.f13728v = new mw1(rv1Var);
                return true;
            }
        } else if (e(xk0Var, f7034p)) {
            ((mw1) e4Var.f13728v).getClass();
            if (!this.f7035n) {
                this.f7035n = true;
                xk0Var.G(8);
                m8 a10 = k3.a(d51.v((String[]) x21.x(xk0Var, false, false).f8135v));
                if (a10 != null) {
                    mw1 mw1Var = (mw1) e4Var.f13728v;
                    mw1Var.getClass();
                    rv1 rv1Var2 = new rv1(mw1Var);
                    rv1Var2.f10304k = a10.b(((mw1) e4Var.f13728v).f8456l);
                    e4Var.f13728v = new mw1(rv1Var2);
                    return true;
                }
            }
        } else {
            ((mw1) e4Var.f13728v).getClass();
            return false;
        }
        return true;
    }
}

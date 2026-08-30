package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d7 extends j7 {

    /* renamed from: n, reason: collision with root package name */
    public s2 f5328n;

    /* renamed from: o, reason: collision with root package name */
    public d6 f5329o;

    @Override // com.google.android.gms.internal.ads.j7
    public final void a(boolean z3) {
        super.a(z3);
        if (z3) {
            this.f5328n = null;
            this.f5329o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final long b(xk0 xk0Var) {
        byte[] bArr = xk0Var.f12580a;
        if (bArr[0] == -1) {
            int i = (bArr[2] & 255) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int x9 = ed1.x(i, xk0Var);
                xk0Var.E(0);
                return x9;
            }
            xk0Var.G(4);
            xk0Var.o();
            int x92 = ed1.x(i, xk0Var);
            xk0Var.E(0);
            return x92;
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.d6, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.j7
    public final boolean c(xk0 xk0Var, long j10, com.google.android.gms.internal.measurement.e4 e4Var) {
        byte[] bArr = xk0Var.f12580a;
        s2 s2Var = this.f5328n;
        if (s2Var == null) {
            s2 s2Var2 = new s2(bArr, 17);
            this.f5328n = s2Var2;
            rv1 rv1Var = new rv1(s2Var2.b(Arrays.copyOfRange(bArr, 9, xk0Var.f12582c), null));
            rv1Var.d("audio/ogg");
            e4Var.f13728v = new mw1(rv1Var);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            x90 z3 = an1.z(xk0Var);
            s2 s2Var3 = new s2(s2Var.f10455a, s2Var.f10456b, s2Var.f10457c, s2Var.f10458d, s2Var.e, s2Var.f10460g, s2Var.f10461h, s2Var.f10462j, z3, s2Var.f10464l);
            this.f5328n = s2Var3;
            Object obj = new Object();
            obj.f5317w = s2Var3;
            obj.f5318x = z3;
            obj.f5315u = -1L;
            obj.f5316v = -1L;
            this.f5329o = obj;
            return true;
        }
        if (b10 != -1) {
            return true;
        }
        d6 d6Var = this.f5329o;
        if (d6Var != null) {
            d6Var.f5315u = j10;
            e4Var.f13729w = d6Var;
        }
        ((mw1) e4Var.f13728v).getClass();
        return false;
    }
}

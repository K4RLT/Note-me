package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class y3 implements g2 {

    /* renamed from: u, reason: collision with root package name */
    public final s2 f12764u;

    /* renamed from: v, reason: collision with root package name */
    public final int f12765v;

    /* renamed from: w, reason: collision with root package name */
    public final b0.a f12766w = new b0.a(9);

    public y3(s2 s2Var, int i) {
        this.f12764u = s2Var;
        this.f12765v = i;
    }

    public final long a(o2 o2Var) {
        b0.a aVar;
        s2 s2Var;
        int D;
        while (true) {
            long m4 = o2Var.m();
            long p10 = o2Var.p() - 6;
            aVar = this.f12766w;
            s2Var = this.f12764u;
            if (m4 >= p10) {
                break;
            }
            long m10 = o2Var.m();
            xk0 xk0Var = new xk0(17);
            int i = 0;
            o2Var.y(xk0Var.f12580a, 0, 2);
            char r8 = xk0Var.r(0, ByteOrder.BIG_ENDIAN);
            int i10 = this.f12765v;
            if (r8 != i10) {
                o2Var.h();
                o2Var.s((int) (m10 - o2Var.n()));
            } else {
                byte[] bArr = xk0Var.f12580a;
                while (i < 15 && (D = o2Var.D(bArr, 2 + i, 15 - i)) != -1) {
                    i += D;
                }
                xk0Var.C(i + 2);
                o2Var.h();
                o2Var.s((int) (m10 - o2Var.n()));
                if (ed1.l(xk0Var, s2Var, i10, aVar)) {
                    break;
                }
            }
            o2Var.s(1);
        }
        if (o2Var.m() >= o2Var.p() - 6) {
            o2Var.s((int) (o2Var.p() - o2Var.m()));
            return s2Var.f10462j;
        }
        return aVar.f1139v;
    }

    @Override // com.google.android.gms.internal.ads.g2
    public final f2 t(o2 o2Var, long j10) {
        long n10 = o2Var.n();
        long a10 = a(o2Var);
        long m4 = o2Var.m();
        o2Var.s(Math.max(6, this.f12764u.f10457c));
        long a11 = a(o2Var);
        long m10 = o2Var.m();
        if (a10 <= j10 && a11 > j10) {
            return new f2(-9223372036854775807L, 0, m4);
        }
        if (a11 <= j10) {
            return new f2(a11, -2, m10);
        }
        return new f2(a10, -1, n10);
    }
}

package com.google.android.gms.internal.ads;
import va.b;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class g7 {

    /* renamed from: a, reason: collision with root package name */
    public int f6318a;

    /* renamed from: b, reason: collision with root package name */
    public long f6319b;

    /* renamed from: c, reason: collision with root package name */
    public int f6320c;

    /* renamed from: d, reason: collision with root package name */
    public int f6321d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f6322f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final xk0 f6323g = new xk0(255);

    public final boolean a(o2 o2Var, long j10) {
        boolean z3;
        boolean z9;
        if (o2Var.n() == o2Var.m()) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        xk0 xk0Var = this.f6323g;
        xk0Var.y(4);
        while (true) {
            if (j10 != -1 && o2Var.n() + 4 >= j10) {
                break;
            }
            try {
                z9 = o2Var.E(xk0Var.f12580a, 0, 4, true);
            } catch (EOFException unused) {
                z9 = false;
            }
            if (!z9) {
                break;
            }
            xk0Var.E(0);
            if (xk0Var.P() == 1332176723) {
                o2Var.h();
                return true;
            }
            o2Var.u(1);
        }
        do {
            if (j10 != -1 && o2Var.n() >= j10) {
                break;
            }
        } while (o2Var.k() != -1);
        return false;
    }

    public final boolean b(o2 o2Var, boolean z3) {
        boolean z9;
        boolean z10;
        this.f6318a = 0;
        this.f6319b = 0L;
        this.f6320c = 0;
        this.f6321d = 0;
        this.e = 0;
        xk0 xk0Var = this.f6323g;
        xk0Var.y(27);
        try {
            z9 = o2Var.E(xk0Var.f12580a, 0, 27, z3);
        } catch (EOFException e) {
            if (z3) {
                z9 = false;
            } else {
                throw e;
            }
        }
        if (z9 && xk0Var.P() == 1332176723) {
            if (xk0Var.K() != 0) {
                if (!z3) {
                    throw b("unsupported bit stream revision");
                }
            } else {
                this.f6318a = xk0Var.K();
                this.f6319b = xk0Var.e();
                xk0Var.a();
                xk0Var.a();
                xk0Var.a();
                int K = xk0Var.K();
                this.f6320c = K;
                this.f6321d = K + 27;
                xk0Var.y(K);
                try {
                    z10 = o2Var.E(xk0Var.f12580a, 0, this.f6320c, z3);
                } catch (EOFException e8) {
                    if (z3) {
                        z10 = false;
                    } else {
                        throw e8;
                    }
                }
                if (z10) {
                    for (int i = 0; i < this.f6320c; i++) {
                        int K2 = xk0Var.K();
                        this.f6322f[i] = K2;
                        this.e += K2;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}

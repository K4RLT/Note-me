package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class f7 {

    /* renamed from: a, reason: collision with root package name */
    public final g7 f5950a = new g7();

    /* renamed from: b, reason: collision with root package name */
    public final xk0 f5951b = new xk0(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f5952c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f5953d;
    public boolean e;

    public final boolean a(o2 o2Var) {
        int i;
        boolean z3 = this.e;
        xk0 xk0Var = this.f5951b;
        if (z3) {
            this.e = false;
            xk0Var.y(0);
        }
        while (true) {
            boolean z9 = true;
            if (this.e) {
                return true;
            }
            int i10 = this.f5952c;
            g7 g7Var = this.f5950a;
            if (i10 < 0) {
                if (!g7Var.a(o2Var, -1L) || !g7Var.b(o2Var, true)) {
                    break;
                }
                int i11 = g7Var.f6321d;
                if ((g7Var.f6318a & 1) == 1 && xk0Var.f12582c == 0) {
                    i11 += b(0);
                    i = this.f5953d;
                } else {
                    i = 0;
                }
                try {
                    o2Var.u(i11);
                    this.f5952c = i;
                    i10 = i;
                } catch (EOFException unused) {
                }
            }
            int b10 = b(i10);
            int i12 = this.f5952c + this.f5953d;
            if (b10 > 0) {
                xk0Var.A(xk0Var.f12582c + b10);
                try {
                    o2Var.v(xk0Var.f12580a, xk0Var.f12582c, b10);
                    xk0Var.C(xk0Var.f12582c + b10);
                    if (g7Var.f6322f[i12 - 1] == 255) {
                        z9 = false;
                    }
                    this.e = z9;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == g7Var.f6320c) {
                i12 = -1;
            }
            this.f5952c = i12;
        }
        return false;
    }

    public final int b(int i) {
        int i10;
        int i11 = 0;
        this.f5953d = 0;
        do {
            int i12 = this.f5953d;
            int i13 = i + i12;
            g7 g7Var = this.f5950a;
            if (i13 >= g7Var.f6320c) {
                break;
            }
            this.f5953d = i12 + 1;
            i10 = g7Var.f6322f[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }
}

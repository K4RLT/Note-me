package com.google.android.gms.internal.ads;
import b0.a;
import e7.h;

/* loaded from: classes.dex */
public final class e7 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public p2 f5606a;

    /* renamed from: b, reason: collision with root package name */
    public j7 f5607b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5608c;

    static {
        int i = xy.O;
    }

    public final boolean a(o2 o2Var) {
        g7 g7Var = new g7();
        if (g7Var.b(o2Var, true) && (g7Var.f6318a & 2) == 2) {
            int min = Math.min(g7Var.e, 8);
            xk0 xk0Var = new xk0(min);
            o2Var.y(xk0Var.f12580a, 0, min);
            xk0Var.E(0);
            if (xk0Var.B() >= 5 && xk0Var.K() == 127 && xk0Var.P() == 1179402563) {
                this.f5607b = new j7();
                return true;
            }
            xk0Var.E(0);
            try {
                if (x21.H(1, xk0Var, true)) {
                    this.f5607b = new j7();
                    return true;
                }
            } catch (va unused) {
            }
            xk0Var.E(0);
            if (i7.e(xk0Var, i7.f7033o)) {
                this.f5607b = new j7();
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        try {
            return a(o2Var);
        } catch (va unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.f5606a = p2Var;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        j7 j7Var = this.f5607b;
        if (j7Var != null) {
            f7 f7Var = j7Var.f7361a;
            g7 g7Var = f7Var.f5950a;
            g7Var.f6318a = 0;
            g7Var.f6319b = 0L;
            g7Var.f6320c = 0;
            g7Var.f6321d = 0;
            g7Var.e = 0;
            f7Var.f5951b.y(0);
            f7Var.f5952c = -1;
            f7Var.e = false;
            if (j10 == 0) {
                j7Var.a(!j7Var.f7370l);
                return;
            }
            if (j7Var.f7367h != 0) {
                long j12 = (j7Var.i * j11) / 1000000;
                j7Var.e = j12;
                h7 h7Var = j7Var.f7364d;
                String str = bq0.f4860a;
                h7Var.g(j12);
                j7Var.f7367h = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f  */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.o2 r21, b0.a r22) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e7.h(com.google.android.gms.internal.ads.o2, b0.a):int");
    }
}

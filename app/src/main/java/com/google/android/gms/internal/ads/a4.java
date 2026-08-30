package com.google.android.gms.internal.ads;
import a4.h;
import b0.a;

import androidx.ink.storage.DecompressedBytes;

/* loaded from: classes.dex */
public final class a4 implements n2 {

    /* renamed from: d, reason: collision with root package name */
    public p2 f4336d;
    public i3 e;

    /* renamed from: g, reason: collision with root package name */
    public m8 f4338g;

    /* renamed from: h, reason: collision with root package name */
    public s2 f4339h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4340j;

    /* renamed from: k, reason: collision with root package name */
    public z3 f4341k;

    /* renamed from: l, reason: collision with root package name */
    public int f4342l;

    /* renamed from: m, reason: collision with root package name */
    public long f4343m;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4333a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final xk0 f4334b = new xk0(new byte[DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY], 0);

    /* renamed from: c, reason: collision with root package name */
    public final b0.a f4335c = new b0.a(9);

    /* renamed from: f, reason: collision with root package name */
    public int f4337f = 0;

    static {
        int i = ct.G;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        m8 c10 = new hx0(2).c(o2Var, s6.I, 0);
        if (c10 != null) {
            int length = c10.f8272a.length;
        }
        xk0 xk0Var = new xk0(4);
        ((i2) o2Var).E(xk0Var.f12580a, 0, 4, false);
        if (xk0Var.P() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.f4336d = p2Var;
        this.e = p2Var.A(0, 1);
        p2Var.z();
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f4337f = 0;
        } else {
            z3 z3Var = this.f4341k;
            if (z3Var != null) {
                z3Var.a(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f4343m = j12;
        this.f4342l = 0;
        this.f4334b.y(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.o2 r30, b0.a r31) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a4.h(com.google.android.gms.internal.ads.o2, b0.a):int");
    }
}

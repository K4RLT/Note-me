package com.google.android.gms.internal.ads;
import b0.a;
import r0.g;

/* loaded from: classes.dex */
public final class d9 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final c9 f5343a = new c9(null, 0, 1, "audio/ac4");

    /* renamed from: b, reason: collision with root package name */
    public final xk0 f5344b = new xk0(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f5345c;

    static {
        int i = an1.N;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(com.google.android.gms.internal.ads.o2 r15) {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.xk0 r0 = new com.google.android.gms.internal.ads.xk0
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = r2
        L9:
            byte[] r4 = r0.f12580a
            r5 = r15
            com.google.android.gms.internal.ads.i2 r5 = (com.google.android.gms.internal.ads.i2) r5
            r5.E(r4, r2, r1, r2)
            r0.E(r2)
            int r4 = r0.O()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L90
            r5.f6967z = r2
            r5.d(r3, r2)
            r15 = r2
            r1 = r3
        L25:
            byte[] r4 = r0.f12580a
            r6 = 7
            r5.E(r4, r2, r6, r2)
            r0.E(r2)
            int r4 = r0.L()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r4 == r8) goto L4c
            if (r4 == r9) goto L4c
            r5.f6967z = r2
            int r1 = r1 + 1
            int r15 = r1 - r3
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r15 < r4) goto L47
            goto L89
        L47:
            r5.d(r1, r2)
            r15 = r2
            goto L25
        L4c:
            r8 = 1
            int r15 = r15 + r8
            r10 = 4
            if (r15 < r10) goto L52
            return r8
        L52:
            byte[] r8 = r0.f12580a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r6) goto L5a
            r11 = r12
            goto L87
        L5a:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r13 = r8[r7]
            int r11 = r11 << 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L81
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            int r11 = r11 << 8
            r13 = 6
            r8 = r8[r13]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r10 = r10 | r11
            r11 = r10 | r8
            goto L82
        L81:
            r6 = r10
        L82:
            if (r4 != r9) goto L86
            int r6 = r6 + 2
        L86:
            int r11 = r11 + r6
        L87:
            if (r11 != r12) goto L8a
        L89:
            return r2
        L8a:
            int r11 = r11 + (-7)
            r5.d(r11, r2)
            goto L25
        L90:
            r0.G(r7)
            int r4 = r0.g()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.d(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d9.e(com.google.android.gms.internal.ads.o2):boolean");
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.f5343a.a(p2Var, new fa(Integer.MIN_VALUE, 0, 1));
        p2Var.z();
        p2Var.B(new r2(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        this.f5345c = false;
        this.f5343a.zza();
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int h(o2 o2Var, b0.a aVar) {
        xk0 xk0Var = this.f5344b;
        int e = o2Var.e(xk0Var.f12580a, 0, 16384);
        if (e == -1) {
            return -1;
        }
        xk0Var.E(0);
        xk0Var.C(e);
        boolean z3 = this.f5345c;
        c9 c9Var = this.f5343a;
        if (!z3) {
            c9Var.f5048o = 0L;
            this.f5345c = true;
        }
        c9Var.c(xk0Var);
        return 0;
    }
}

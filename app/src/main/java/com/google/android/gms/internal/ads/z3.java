package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class z3 {

    /* renamed from: a, reason: collision with root package name */
    public final c2 f13052a;

    /* renamed from: b, reason: collision with root package name */
    public final g2 f13053b;

    /* renamed from: c, reason: collision with root package name */
    public d2 f13054c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13055d;

    public z3(e2 e2Var, g2 g2Var, long j10, long j11, long j12, long j13, long j14, int i) {
        this.f13053b = g2Var;
        this.f13055d = i;
        this.f13052a = new c2(e2Var, j10, j11, j12, j13, j14);
    }

    public static final int c(o2 o2Var, long j10, b0.a aVar) {
        if (j10 == o2Var.n()) {
            return 0;
        }
        aVar.f1139v = j10;
        return 1;
    }

    public static /* synthetic */ int d(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, com.google.android.gms.internal.ads.d2] */
    public final void a(long j10) {
        d2 d2Var = this.f13054c;
        if (d2Var != null && d2Var.f5250a == j10) {
            return;
        }
        c2 c2Var = this.f13052a;
        long d2 = c2Var.f4954a.d(j10);
        long j11 = c2Var.f4956c;
        long j12 = c2Var.f4957d;
        long j13 = c2Var.e;
        long j14 = c2Var.f4958f;
        Object obj = new Object();
        obj.f5250a = j10;
        obj.f5251b = d2;
        obj.f5253d = 0L;
        obj.e = j11;
        obj.f5254f = j12;
        obj.f5255g = j13;
        obj.f5252c = j14;
        obj.f5256h = d2.a(d2, 0L, j11, j12, j13, j14);
        this.f13054c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.ads.o2 r28, b0.a r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            com.google.android.gms.internal.ads.d2 r3 = r0.f13054c
            r3.getClass()
            long r4 = r3.f5254f
            long r6 = r3.f5255g
            long r8 = r3.f5256h
            long r6 = r6 - r4
            int r10 = r0.f13055d
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            com.google.android.gms.internal.ads.g2 r10 = r0.f13053b
            if (r6 > 0) goto L26
            r0.f13054c = r7
            r10.zzb()
            int r1 = c(r1, r4, r2)
            return r1
        L26:
            long r4 = r1.n()
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lbe
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lbe
            int r4 = (int) r4
            r1.u(r4)
            r1.h()
            long r4 = r3.f5251b
            com.google.android.gms.internal.ads.f2 r4 = r10.t(r1, r4)
            int r5 = r4.f5885a
            r15 = r11
            long r11 = r4.f5886b
            r17 = r13
            long r13 = r4.f5887c
            r4 = -3
            if (r5 == r4) goto Lb4
            r4 = -2
            if (r5 == r4) goto L93
            r4 = -1
            if (r5 == r4) goto L74
            long r3 = r1.n()
            long r3 = r13 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L6a
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 > 0) goto L6a
            int r3 = (int) r3
            r1.u(r3)
        L6a:
            r0.f13054c = r7
            r10.zzb()
            int r1 = c(r1, r13, r2)
            return r1
        L74:
            r3.e = r11
            r3.f5255g = r13
            long r4 = r3.f5251b
            long r6 = r3.f5253d
            long r8 = r3.f5254f
            r15 = r4
            long r4 = r3.f5252c
            r25 = r4
            r17 = r6
            r21 = r8
            r19 = r11
            r23 = r13
            long r4 = com.google.android.gms.internal.ads.d2.a(r15, r17, r19, r21, r23, r25)
            r3.f5256h = r4
            goto L6
        L93:
            r4 = r11
            r6 = r13
            r3.f5253d = r4
            r3.f5254f = r6
            long r8 = r3.f5251b
            long r10 = r3.e
            long r12 = r3.f5255g
            long r14 = r3.f5252c
            r17 = r4
            r21 = r6
            r19 = r10
            r23 = r12
            r25 = r14
            r15 = r8
            long r4 = com.google.android.gms.internal.ads.d2.a(r15, r17, r19, r21, r23, r25)
            r3.f5256h = r4
            goto L6
        Lb4:
            r0.f13054c = r7
            r10.zzb()
            int r1 = c(r1, r8, r2)
            return r1
        Lbe:
            int r1 = c(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z3.b(com.google.android.gms.internal.ads.o2, b0.a):int");
    }
}

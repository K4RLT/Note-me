package com.google.android.gms.internal.ads;
import b0.a;
import r5.a;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class aa implements n2 {
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4420f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4421g;

    /* renamed from: h, reason: collision with root package name */
    public long f4422h;
    public z3 i;

    /* renamed from: j, reason: collision with root package name */
    public p2 f4423j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4424k;

    /* renamed from: a, reason: collision with root package name */
    public final dp0 f4416a = new dp0();

    /* renamed from: c, reason: collision with root package name */
    public final xk0 f4418c = new xk0(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f4417b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final y9 f4419d = new y9(0);

    static {
        int i = b80.L;
    }

    public final void a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f4417b;
            if (i < sparseArray.size()) {
                ((z9) sparseArray.valueAt(i)).f13120a.n();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        byte[] bArr = new byte[14];
        i2 i2Var = (i2) o2Var;
        i2Var.E(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            i2Var.d(bArr[13] & 7, false);
            i2Var.E(bArr, 0, 3, false);
            if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.f4423j = p2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r0 != r7) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[LOOP:0: B:18:0x002d->B:20:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.dp0 r5 = r4.f4416a
            monitor-enter(r5)
            long r0 = r5.f5471b     // Catch: java.lang.Throwable -> L46
            monitor-exit(r5)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = a()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.b(r7)
        L24:
            com.google.android.gms.internal.ads.z3 r5 = r4.i
            r6 = 0
            if (r5 == 0) goto L2c
            a(r7)
        L2c:
            r5 = r6
        L2d:
            android.util.SparseArray r7 = r4.f4417b
            int r8 = r7.size()
            if (r5 >= r8) goto L45
            java.lang.Object r7 = r7.valueAt(r5)
            com.google.android.gms.internal.ads.z9 r7 = (com.google.android.gms.internal.ads.z9) r7
            r7.f13124f = r6
            com.google.android.gms.internal.ads.j9 r7 = r7.f13120a
            r7.zza()
            int r5 = r5 + 1
            goto L2d
        L45:
            return
        L46:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aa.g(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x022c  */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.o2 r27, a r28) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aa.h(com.google.android.gms.internal.ads.o2, a):int");
    }
}

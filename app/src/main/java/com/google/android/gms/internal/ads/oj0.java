package com.google.android.gms.internal.ads;
import la.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class oj0 implements s81 {
    public final /* synthetic */ qj0 A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f9132u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ sp0 f9133v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qp0 f9134w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f9135x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ws0 f9136y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ wp0 f9137z;

    public oj0(qj0 qj0Var, long j10, sp0 sp0Var, qp0 qp0Var, String str, ws0 ws0Var, wp0 wp0Var) {
        this.f9132u = j10;
        this.f9133v = sp0Var;
        this.f9134w = qp0Var;
        this.f9135x = str;
        this.f9136y = ws0Var;
        this.f9137z = wp0Var;
        Objects.requireNonNull(qj0Var);
        this.A = qj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0010, B:6:0x0014, B:7:0x0026, B:9:0x002a, B:12:0x002c, B:13:0x002e, B:18:0x003a, B:21:0x0048, B:22:0x005f, B:23:0x0069, B:25:0x0051, B:29:0x0042, B:34:0x006d, B:15:0x002f, B:26:0x003c), top: B:3:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0010, B:6:0x0014, B:7:0x0026, B:9:0x002a, B:12:0x002c, B:13:0x002e, B:18:0x003a, B:21:0x0048, B:22:0x005f, B:23:0x0069, B:25:0x0051, B:29:0x0042, B:34:0x006d, B:15:0x002f, B:26:0x003c), top: B:3:0x0010, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo202r(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.qj0 r12 = r11.A
            a r0 = r12.f9853a
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r11.f9132u
            long r6 = r0 - r2
            monitor-enter(r12)
            boolean r0 = r12.e     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L25
            com.google.android.gms.internal.ads.zd1 r4 = r12.f9854b     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.sp0 r5 = r11.f9133v     // Catch: java.lang.Throwable -> L23
            r8 = r6
            com.google.android.gms.internal.ads.qp0 r6 = r11.f9134w     // Catch: java.lang.Throwable -> L23
            r7 = 0
            r9 = r8
            r8 = 0
            r4.g(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L23
            r8 = r9
            goto L26
        L23:
            r0 = move-exception
            goto L6e
        L25:
            r8 = r6
        L26:
            boolean r0 = r12.f9858g     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L2c
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L23
            return
        L2c:
            com.google.android.gms.internal.ads.qp0 r0 = r11.f9134w     // Catch: java.lang.Throwable -> L23
            monitor-enter(r12)     // Catch: java.lang.Throwable -> L23
            java.util.LinkedHashMap r1 = r12.f9856d     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.pj0 r1 = (com.google.android.gms.internal.ads.pj0) r1     // Catch: java.lang.Throwable -> L6b
            r2 = 0
            if (r1 != 0) goto L3c
        L3a:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L23
            goto L44
        L3c:
            int r1 = r1.f9531c     // Catch: java.lang.Throwable -> L6b
            r3 = 8
            if (r1 != r3) goto L3a
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L23
            r2 = 1
        L44:
            java.util.LinkedHashMap r1 = r12.f9856d
            if (r2 == 0) goto L51
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.pj0 r1 = (com.google.android.gms.internal.ads.pj0) r1     // Catch: java.lang.Throwable -> L23
            r1.f9532d = r8     // Catch: java.lang.Throwable -> L23
            goto L5f
        L51:
            com.google.android.gms.internal.ads.pj0 r4 = new com.google.android.gms.internal.ads.pj0     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = r11.f9135x     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r0.f9934f0     // Catch: java.lang.Throwable -> L23
            r7 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L23
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> L23
        L5f:
            com.google.android.gms.internal.ads.ii0 r4 = r12.f9857f     // Catch: java.lang.Throwable -> L23
            r9 = r8
            r8 = 0
            r6 = r9
            r9 = 1
            r5 = r0
            r4.c(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L23
            return
        L6b:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L6b
            throw r0     // Catch: java.lang.Throwable -> L23
        L6e:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L23
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oj0.mo202r(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.s81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.lang.Throwable r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oj0.t(java.lang.Throwable):void");
    }
}

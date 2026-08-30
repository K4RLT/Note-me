package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class gx0 {

    /* renamed from: a, reason: collision with root package name */
    public final uf.c f6491a;

    /* renamed from: b, reason: collision with root package name */
    public final bl0 f6492b;

    /* renamed from: c, reason: collision with root package name */
    public final yf.c f6493c;

    /* renamed from: d, reason: collision with root package name */
    public final yf.c f6494d;
    public final yf.c e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6495f;

    /* renamed from: g, reason: collision with root package name */
    public lw0 f6496g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6497h;
    public final y3.f i;

    /* renamed from: j, reason: collision with root package name */
    public final ld0 f6498j;

    public gx0(y3.f fVar, to0 to0Var, ld0 ld0Var, ho0 ho0Var) {
        fVar.getClass();
        ld0Var.getClass();
        this.f6498j = ld0Var;
        this.f6491a = pf.b0.b(new pf.x0((ExecutorService) to0Var.f11406v));
        this.f6492b = new bl0(9);
        this.f6493c = yf.d.a();
        this.f6494d = yf.d.a();
        this.e = yf.d.a();
        this.i = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x006b, code lost:
    
        if (r1 == r9) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.google.android.gms.internal.ads.gx0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [yf.a] */
    /* JADX WARN: Type inference failed for: r3v16, types: [yf.a] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v5, types: [yf.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.google.android.gms.internal.ads.gx0 r18, ve.c r19) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx0.d(com.google.android.gms.internal.ads.gx0, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0081, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:12:0x0051, B:18:0x005b), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.google.android.gms.internal.ads.gx0 r6, java.lang.String r7, ve.c r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zw0
            if (r0 == 0) goto L16
            r0 = r8
            com.google.android.gms.internal.ads.zw0 r0 = (com.google.android.gms.internal.ads.zw0) r0
            int r1 = r0.f13292y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f13292y = r1
            goto L1b
        L16:
            com.google.android.gms.internal.ads.zw0 r0 = new com.google.android.gms.internal.ads.zw0
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f13290w
            int r1 = r0.f13292y
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            long r3 = r0.f13289v
            yf.c r7 = r0.f13288u
            java.lang.String r0 = r0.f13293z
            pe.a.e(r8)
            goto L50
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r6)
            r6 = 0
            return r6
        L35:
            pe.a.e(r8)
            yf.c r8 = r6.f6493c
            long r3 = java.lang.System.currentTimeMillis()
            r0.f13293z = r7
            r0.f13288u = r8
            r0.f13289v = r3
            r0.f13292y = r2
            java.lang.Object r0 = r8.f(r0)
            ue.a r1 = ue.a.f27192u
            if (r0 == r1) goto L86
            r0 = r7
            r7 = r8
        L50:
            r8 = 0
            boolean r1 = r6.f6495f     // Catch: java.lang.Throwable -> L81
            pe.z r5 = pe.z.f22715a
            if (r1 == 0) goto L5b
            r7.j(r8)
            return r5
        L5b:
            r6.f6495f = r2     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.mw0 r1 = com.google.android.gms.internal.ads.mw0.Q()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.bn1 r1 = r1.r()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.lw0 r1 = (com.google.android.gms.internal.ads.lw0) r1     // Catch: java.lang.Throwable -> L81
            r6.f6496g = r1     // Catch: java.lang.Throwable -> L81
            r1.b()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.dn1 r6 = r1.f4845v     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.mw0 r6 = (com.google.android.gms.internal.ads.mw0) r6     // Catch: java.lang.Throwable -> L81
            r6.R(r0)     // Catch: java.lang.Throwable -> L81
            r1.b()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.dn1 r6 = r1.f4845v     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.mw0 r6 = (com.google.android.gms.internal.ads.mw0) r6     // Catch: java.lang.Throwable -> L81
            r6.X(r3)     // Catch: java.lang.Throwable -> L81
            r7.j(r8)
            return r5
        L81:
            r6 = move-exception
            r7.j(r8)
            throw r6
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx0.e(com.google.android.gms.internal.ads.gx0, java.lang.String, ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (r11.b(r5, r0) == r8) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005c, code lost:
    
        if (r1.f(r0) != r8) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #0 {all -> 0x00a9, blocks: (B:24:0x007e, B:26:0x0082, B:29:0x00a3, B:30:0x00a8), top: B:23:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3 A[Catch: all -> 0x00a9, TRY_ENTER, TryCatch #0 {all -> 0x00a9, blocks: (B:24:0x007e, B:26:0x0082, B:29:0x00a3, B:30:0x00a8), top: B:23:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0066 A[Catch: all -> 0x00ae, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00ae, blocks: (B:36:0x005e, B:40:0x0066), top: B:35:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(com.google.android.gms.internal.ads.gx0 r11, ve.c r12) {
        /*
            r11.getClass()
            boolean r0 = r12 instanceof com.google.android.gms.internal.ads.xw0
            if (r0 == 0) goto L16
            r0 = r12
            com.google.android.gms.internal.ads.xw0 r0 = (com.google.android.gms.internal.ads.xw0) r0
            int r1 = r0.f12647y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f12647y = r1
            goto L1b
        L16:
            com.google.android.gms.internal.ads.xw0 r0 = new com.google.android.gms.internal.ads.xw0
            r0.<init>(r11, r12)
        L1b:
            java.lang.Object r12 = r0.f12645w
            int r1 = r0.f12647y
            pe.z r2 = pe.z.f22715a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            ue.a r8 = ue.a.f27192u
            if (r1 == 0) goto L4f
            if (r1 == r6) goto L49
            if (r1 == r5) goto L41
            if (r1 == r4) goto L3d
            if (r1 != r3) goto L36
            pe.a.e(r12)
            return r2
        L36:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r11)
            r11 = 0
            return r11
        L3d:
            pe.a.e(r12)
            goto L9a
        L41:
            long r5 = r0.f12644v
            yf.c r1 = r0.f12643u
            pe.a.e(r12)
            goto L7e
        L49:
            yf.c r1 = r0.f12643u
            pe.a.e(r12)
            goto L5e
        L4f:
            pe.a.e(r12)
            yf.c r1 = r11.f6494d
            r0.f12643u = r1
            r0.f12647y = r6
            java.lang.Object r12 = r1.f(r0)
            if (r12 == r8) goto Lb3
        L5e:
            boolean r12 = r11.f6497h     // Catch: java.lang.Throwable -> Lae
            if (r12 == 0) goto L66
            r1.j(r7)
            return r2
        L66:
            r11.f6497h = r6     // Catch: java.lang.Throwable -> Lae
            r1.j(r7)
            yf.c r1 = r11.f6493c
            long r9 = java.lang.System.currentTimeMillis()
            r0.f12643u = r1
            r0.f12644v = r9
            r0.f12647y = r5
            java.lang.Object r12 = r1.f(r0)
            if (r12 == r8) goto Lb3
            r5 = r9
        L7e:
            com.google.android.gms.internal.ads.lw0 r12 = r11.f6496g     // Catch: java.lang.Throwable -> La9
            if (r12 == 0) goto La3
            r12.b()     // Catch: java.lang.Throwable -> La9
            com.google.android.gms.internal.ads.dn1 r12 = r12.f4845v     // Catch: java.lang.Throwable -> La9
            com.google.android.gms.internal.ads.mw0 r12 = (com.google.android.gms.internal.ads.mw0) r12     // Catch: java.lang.Throwable -> La9
            r12.a0(r5)     // Catch: java.lang.Throwable -> La9
            r1.j(r7)
            r0.f12643u = r7
            r0.f12647y = r4
            java.lang.Object r12 = r11.b(r5, r0)
            if (r12 != r8) goto L9a
            goto Lb3
        L9a:
            r0.f12647y = r3
            java.lang.Object r11 = r11.c(r0)
            if (r11 == r8) goto Lb3
            return r2
        La3:
            java.lang.String r11 = "adQualityDataBuilder"
            kotlin.jvm.internal.l.h(r11)     // Catch: java.lang.Throwable -> La9
            throw r7     // Catch: java.lang.Throwable -> La9
        La9:
            r11 = move-exception
            r1.j(r7)
            throw r11
        Lae:
            r11 = move-exception
            r1.j(r7)
            throw r11
        Lb3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx0.f(com.google.android.gms.internal.ads.gx0, ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x004e, code lost:
    
        if (r1.f(r0) != r6) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #1 {all -> 0x00d4, blocks: (B:12:0x0072, B:15:0x0078, B:17:0x0082, B:19:0x0086, B:21:0x00a8, B:23:0x00b8, B:25:0x00bc, B:26:0x00d0, B:27:0x00d3, B:29:0x00d7, B:30:0x00da, B:31:0x00db, B:32:0x00de, B:33:0x00df, B:35:0x00e3, B:37:0x00ed, B:39:0x00f1, B:41:0x0113, B:42:0x0127, B:43:0x012a, B:44:0x012b, B:45:0x012e, B:46:0x012f, B:48:0x0133, B:51:0x0141, B:52:0x0144, B:53:0x0145, B:54:0x0148, B:55:0x0149, B:56:0x014c), top: B:11:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149 A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:12:0x0072, B:15:0x0078, B:17:0x0082, B:19:0x0086, B:21:0x00a8, B:23:0x00b8, B:25:0x00bc, B:26:0x00d0, B:27:0x00d3, B:29:0x00d7, B:30:0x00da, B:31:0x00db, B:32:0x00de, B:33:0x00df, B:35:0x00e3, B:37:0x00ed, B:39:0x00f1, B:41:0x0113, B:42:0x0127, B:43:0x012a, B:44:0x012b, B:45:0x012e, B:46:0x012f, B:48:0x0133, B:51:0x0141, B:52:0x0144, B:53:0x0145, B:54:0x0148, B:55:0x0149, B:56:0x014c), top: B:11:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0054 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(com.google.android.gms.internal.ads.gx0 r12, ve.c r13) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx0.g(com.google.android.gms.internal.ads.gx0, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[Catch: all -> 0x00ec, TRY_ENTER, TryCatch #1 {all -> 0x00ec, blocks: (B:26:0x0084, B:29:0x008a, B:31:0x0098, B:33:0x00af, B:35:0x00bd, B:39:0x00ee, B:40:0x00f1, B:41:0x00f2, B:42:0x00f5, B:43:0x00f6, B:44:0x00f9, B:45:0x00fa, B:46:0x00fd), top: B:25:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa A[Catch: all -> 0x00ec, TryCatch #1 {all -> 0x00ec, blocks: (B:26:0x0084, B:29:0x008a, B:31:0x0098, B:33:0x00af, B:35:0x00bd, B:39:0x00ee, B:40:0x00f1, B:41:0x00f2, B:42:0x00f5, B:43:0x00f6, B:44:0x00f9, B:45:0x00fa, B:46:0x00fd), top: B:25:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0069 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(com.google.android.gms.internal.ads.gx0 r14, ve.c r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx0.h(com.google.android.gms.internal.ads.gx0, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[Catch: all -> 0x00fa, TRY_ENTER, TryCatch #1 {all -> 0x00fa, blocks: (B:26:0x0084, B:29:0x008a, B:31:0x0098, B:33:0x00af, B:35:0x00bd, B:37:0x00cb, B:41:0x00fc, B:42:0x00ff, B:43:0x0100, B:44:0x0103, B:45:0x0104, B:46:0x0107, B:47:0x0108, B:48:0x010b, B:49:0x010c, B:50:0x010f), top: B:25:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c A[Catch: all -> 0x00fa, TryCatch #1 {all -> 0x00fa, blocks: (B:26:0x0084, B:29:0x008a, B:31:0x0098, B:33:0x00af, B:35:0x00bd, B:37:0x00cb, B:41:0x00fc, B:42:0x00ff, B:43:0x0100, B:44:0x0103, B:45:0x0104, B:46:0x0107, B:47:0x0108, B:48:0x010b, B:49:0x010c, B:50:0x010f), top: B:25:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0069 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(com.google.android.gms.internal.ads.gx0 r14, ve.c r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx0.i(com.google.android.gms.internal.ads.gx0, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x004d, B:14:0x0051, B:18:0x0061, B:19:0x0066), top: B:11:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x004d, B:14:0x0051, B:18:0x0061, B:19:0x0066), top: B:11:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(com.google.android.gms.internal.ads.gx0 r5, ve.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.ax0
            if (r0 == 0) goto L16
            r0 = r6
            com.google.android.gms.internal.ads.ax0 r0 = (com.google.android.gms.internal.ads.ax0) r0
            int r1 = r0.f4628y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f4628y = r1
            goto L1b
        L16:
            com.google.android.gms.internal.ads.ax0 r0 = new com.google.android.gms.internal.ads.ax0
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f4626w
            int r1 = r0.f4628y
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            long r1 = r0.f4624u
            yf.c r0 = r0.f4625v
            pe.a.e(r6)
            goto L4c
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r5)
            r5 = 0
            return r5
        L33:
            pe.a.e(r6)
            yf.c r6 = r5.f6493c
            long r3 = java.lang.System.currentTimeMillis()
            r0.f4625v = r6
            r0.f4624u = r3
            r0.f4628y = r2
            java.lang.Object r0 = r6.f(r0)
            ue.a r1 = ue.a.f27192u
            if (r0 == r1) goto L6c
            r0 = r6
            r1 = r3
        L4c:
            r6 = 0
            com.google.android.gms.internal.ads.lw0 r5 = r5.f6496g     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L61
            r5.b()     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.internal.ads.dn1 r5 = r5.f4845v     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.internal.ads.mw0 r5 = (com.google.android.gms.internal.ads.mw0) r5     // Catch: java.lang.Throwable -> L67
            r5.A(r1)     // Catch: java.lang.Throwable -> L67
            r0.j(r6)
            pe.z r5 = pe.z.f22715a
            return r5
        L61:
            java.lang.String r5 = "adQualityDataBuilder"
            kotlin.jvm.internal.l.h(r5)     // Catch: java.lang.Throwable -> L67
            throw r6     // Catch: java.lang.Throwable -> L67
        L67:
            r5 = move-exception
            r0.j(r6)
            throw r5
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx0.j(com.google.android.gms.internal.ads.gx0, ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004a, code lost:
    
        if (r9.f(r0) != r5) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r1v3, types: [yf.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ve.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.vw0
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.vw0 r0 = (com.google.android.gms.internal.ads.vw0) r0
            int r1 = r0.f12058x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12058x = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.vw0 r0 = new com.google.android.gms.internal.ads.vw0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f12056v
            int r1 = r0.f12058x
            r2 = 1
            r3 = 2
            r4 = 0
            ue.a r5 = ue.a.f27192u
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L36
            if (r1 != r3) goto L2f
            yf.a r0 = r0.f12055u
            pe.a.e(r9)     // Catch: java.lang.Throwable -> L2d
            goto L61
        L2d:
            r9 = move-exception
            goto L6d
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r9)
            r9 = 0
            return r9
        L36:
            yf.a r1 = r0.f12055u
            pe.a.e(r9)
            r9 = r1
            goto L4c
        L3d:
            pe.a.e(r9)
            yf.c r9 = r8.e
            r0.f12055u = r9
            r0.f12058x = r2
            java.lang.Object r1 = r9.f(r0)
            if (r1 == r5) goto L71
        L4c:
            y3.f r1 = r8.i     // Catch: java.lang.Throwable -> L69
            c2.w0 r2 = new c2.w0     // Catch: java.lang.Throwable -> L69
            r6 = 1
            r2.<init>(r3, r4, r6)     // Catch: java.lang.Throwable -> L69
            r0.f12055u = r9     // Catch: java.lang.Throwable -> L69
            r0.f12058x = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r1.a(r2, r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == r5) goto L71
            r7 = r0
            r0 = r9
            r9 = r7
        L61:
            com.google.android.gms.internal.ads.qw0 r9 = (com.google.android.gms.internal.ads.qw0) r9     // Catch: java.lang.Throwable -> L2d
            r0.j(r4)
            pe.z r9 = pe.z.f22715a
            return r9
        L69:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L6d:
            r0.j(r4)
            throw r9
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx0.a(ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #0 {all -> 0x0075, blocks: (B:12:0x0045, B:15:0x004b, B:17:0x0058, B:21:0x0071, B:22:0x0074, B:23:0x0077, B:24:0x007a), top: B:11:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:12:0x0045, B:15:0x004b, B:17:0x0058, B:21:0x0071, B:22:0x0074, B:23:0x0077, B:24:0x007a), top: B:11:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r6, ve.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.uw0
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.uw0 r0 = (com.google.android.gms.internal.ads.uw0) r0
            int r1 = r0.f11741y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11741y = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.uw0 r0 = new com.google.android.gms.internal.ads.uw0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f11739w
            int r1 = r0.f11741y
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            long r6 = r0.f11737u
            yf.c r0 = r0.f11738v
            pe.a.e(r8)
            goto L44
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r6)
            r6 = 0
            return r6
        L30:
            pe.a.e(r8)
            yf.c r8 = r5.f6493c
            r0.f11738v = r8
            r0.f11737u = r6
            r0.f11741y = r2
            java.lang.Object r0 = r8.f(r0)
            ue.a r1 = ue.a.f27192u
            if (r0 == r1) goto L7f
            r0 = r8
        L44:
            r8 = 0
            com.google.android.gms.internal.ads.lw0 r1 = r5.f6496g     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "adQualityDataBuilder"
            if (r1 == 0) goto L77
            com.google.android.gms.internal.ads.dn1 r3 = r1.f4845v     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.mw0 r3 = (com.google.android.gms.internal.ads.mw0) r3     // Catch: java.lang.Throwable -> L75
            long r3 = r3.I()     // Catch: java.lang.Throwable -> L75
            long r6 = r6 - r3
            com.google.android.gms.internal.ads.lw0 r3 = r5.f6496g     // Catch: java.lang.Throwable -> L75
            if (r3 == 0) goto L71
            com.google.android.gms.internal.ads.dn1 r2 = r3.f4845v     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.mw0 r2 = (com.google.android.gms.internal.ads.mw0) r2     // Catch: java.lang.Throwable -> L75
            long r2 = r2.H()     // Catch: java.lang.Throwable -> L75
            long r6 = r6 - r2
            r1.b()     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.dn1 r1 = r1.f4845v     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.mw0 r1 = (com.google.android.gms.internal.ads.mw0) r1     // Catch: java.lang.Throwable -> L75
            r1.S(r6)     // Catch: java.lang.Throwable -> L75
            r0.j(r8)
            pe.z r6 = pe.z.f22715a
            return r6
        L71:
            kotlin.jvm.internal.l.h(r2)     // Catch: java.lang.Throwable -> L75
            throw r8     // Catch: java.lang.Throwable -> L75
        L75:
            r6 = move-exception
            goto L7b
        L77:
            kotlin.jvm.internal.l.h(r2)     // Catch: java.lang.Throwable -> L75
            throw r8     // Catch: java.lang.Throwable -> L75
        L7b:
            r0.j(r8)
            throw r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx0.b(long, ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x005a, code lost:
    
        if (r1.f(r0) != r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #2 {all -> 0x009b, blocks: (B:35:0x005c, B:37:0x0060, B:41:0x009d, B:42:0x00a2), top: B:34:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d A[Catch: all -> 0x009b, TRY_ENTER, TryCatch #2 {all -> 0x009b, blocks: (B:35:0x005c, B:37:0x0060, B:41:0x009d, B:42:0x00a2), top: B:34:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ve.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.yw0
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.yw0 r0 = (com.google.android.gms.internal.ads.yw0) r0
            int r1 = r0.f12991y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12991y = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.yw0 r0 = new com.google.android.gms.internal.ads.yw0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f12989w
            int r1 = r0.f12991y
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            ue.a r6 = ue.a.f27192u
            if (r1 == 0) goto L4d
            if (r1 == r4) goto L45
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L34
            java.lang.Object r0 = r0.f12987u
            yf.a r0 = (yf.a) r0
            pe.a.e(r9)     // Catch: java.lang.Throwable -> L32
            goto L8d
        L32:
            r9 = move-exception
            goto L97
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r9)
            r9 = 0
            return r9
        L3b:
            yf.c r1 = r0.f12988v
            java.lang.Object r3 = r0.f12987u
            com.google.android.gms.internal.ads.mw0 r3 = (com.google.android.gms.internal.ads.mw0) r3
            pe.a.e(r9)
            goto L78
        L45:
            java.lang.Object r1 = r0.f12987u
            yf.a r1 = (yf.a) r1
            pe.a.e(r9)
            goto L5c
        L4d:
            pe.a.e(r9)
            yf.c r1 = r8.f6493c
            r0.f12987u = r1
            r0.f12991y = r4
            java.lang.Object r9 = r1.f(r0)
            if (r9 == r6) goto La7
        L5c:
            com.google.android.gms.internal.ads.lw0 r9 = r8.f6496g     // Catch: java.lang.Throwable -> L9b
            if (r9 == 0) goto L9d
            com.google.android.gms.internal.ads.dn1 r9 = r9.c()     // Catch: java.lang.Throwable -> L9b
            com.google.android.gms.internal.ads.mw0 r9 = (com.google.android.gms.internal.ads.mw0) r9     // Catch: java.lang.Throwable -> L9b
            r1.j(r5)
            r0.f12987u = r9
            yf.c r1 = r8.e
            r0.f12988v = r1
            r0.f12991y = r3
            java.lang.Object r3 = r1.f(r0)
            if (r3 == r6) goto La7
            r3 = r9
        L78:
            y3.f r9 = r8.i     // Catch: java.lang.Throwable -> L95
            androidx.lifecycle.q r4 = new androidx.lifecycle.q     // Catch: java.lang.Throwable -> L95
            r7 = 7
            r4.<init>(r3, r5, r7)     // Catch: java.lang.Throwable -> L95
            r0.f12987u = r1     // Catch: java.lang.Throwable -> L95
            r0.f12988v = r5     // Catch: java.lang.Throwable -> L95
            r0.f12991y = r2     // Catch: java.lang.Throwable -> L95
            java.lang.Object r9 = r9.a(r4, r0)     // Catch: java.lang.Throwable -> L95
            if (r9 == r6) goto La7
            r0 = r1
        L8d:
            com.google.android.gms.internal.ads.qw0 r9 = (com.google.android.gms.internal.ads.qw0) r9     // Catch: java.lang.Throwable -> L32
            r0.j(r5)
            pe.z r9 = pe.z.f22715a
            return r9
        L95:
            r9 = move-exception
            r0 = r1
        L97:
            r0.j(r5)
            throw r9
        L9b:
            r9 = move-exception
            goto La3
        L9d:
            java.lang.String r9 = "adQualityDataBuilder"
            kotlin.jvm.internal.l.h(r9)     // Catch: java.lang.Throwable -> L9b
            throw r5     // Catch: java.lang.Throwable -> L9b
        La3:
            r1.j(r5)
            throw r9
        La7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx0.c(ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (r10.f(r0) != r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r9, ve.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.gms.internal.ads.tw0
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.gms.internal.ads.tw0 r0 = (com.google.android.gms.internal.ads.tw0) r0
            int r1 = r0.f11478y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11478y = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.tw0 r0 = new com.google.android.gms.internal.ads.tw0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f11476w
            int r1 = r0.f11478y
            r2 = 2
            r3 = 1
            r4 = 0
            ue.a r5 = ue.a.f27192u
            if (r1 == 0) goto L44
            if (r1 == r3) goto L38
            if (r1 != r2) goto L31
            java.lang.Object r9 = r0.f11474u
            yf.a r9 = (yf.a) r9
            pe.a.e(r10)     // Catch: java.lang.Throwable -> L2f
            goto L6c
        L2f:
            r10 = move-exception
            goto L78
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r9)
            r9 = 0
            return r9
        L38:
            yf.c r9 = r0.f11475v
            java.lang.Object r1 = r0.f11474u
            java.lang.String r1 = (java.lang.String) r1
            pe.a.e(r10)
            r10 = r9
            r9 = r1
            goto L55
        L44:
            pe.a.e(r10)
            r0.f11474u = r9
            yf.c r10 = r8.e
            r0.f11475v = r10
            r0.f11478y = r3
            java.lang.Object r1 = r10.f(r0)
            if (r1 == r5) goto L7c
        L55:
            y3.f r1 = r8.i     // Catch: java.lang.Throwable -> L74
            b8.d0 r3 = new b8.d0     // Catch: java.lang.Throwable -> L74
            r6 = 1
            r3.<init>(r6, r9, r4)     // Catch: java.lang.Throwable -> L74
            r0.f11474u = r10     // Catch: java.lang.Throwable -> L74
            r0.f11475v = r4     // Catch: java.lang.Throwable -> L74
            r0.f11478y = r2     // Catch: java.lang.Throwable -> L74
            java.lang.Object r9 = r1.a(r3, r0)     // Catch: java.lang.Throwable -> L74
            if (r9 == r5) goto L7c
            r7 = r10
            r10 = r9
            r9 = r7
        L6c:
            com.google.android.gms.internal.ads.qw0 r10 = (com.google.android.gms.internal.ads.qw0) r10     // Catch: java.lang.Throwable -> L2f
            r9.j(r4)
            pe.z r9 = pe.z.f22715a
            return r9
        L74:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L78:
            r9.j(r4)
            throw r10
        L7c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx0.k(java.lang.String, ve.c):java.lang.Object");
    }
}

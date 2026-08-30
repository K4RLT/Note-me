package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q40 implements k70, b70 {
    public final ai0 A;

    /* renamed from: u, reason: collision with root package name */
    public final Context f9737u;

    /* renamed from: v, reason: collision with root package name */
    public final h00 f9738v;

    /* renamed from: w, reason: collision with root package name */
    public final qp0 f9739w;

    /* renamed from: x, reason: collision with root package name */
    public final l9.a f9740x;

    /* renamed from: y, reason: collision with root package name */
    public bi0 f9741y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9742z;

    public q40(Context context, h00 h00Var, qp0 qp0Var, l9.a aVar, ai0 ai0Var) {
        this.f9737u = context;
        this.f9738v = h00Var;
        this.f9739w = qp0Var;
        this.f9740x = aVar;
        this.A = ai0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, n.r0] */
    public final synchronized void a() {
        h00 h00Var;
        String str;
        int i;
        int i10;
        try {
            qp0 qp0Var = this.f9739w;
            if (qp0Var.T && (h00Var = this.f9738v) != 0) {
                Context context = this.f9737u;
                f9.k kVar = f9.k.C;
                kVar.f16832x.getClass();
                if (v80.d(context)) {
                    l9.a aVar = this.f9740x;
                    int i11 = aVar.f20030v;
                    int i12 = aVar.f20031w;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 1 + String.valueOf(i12).length());
                    sb2.append(i11);
                    sb2.append(".");
                    sb2.append(i12);
                    String sb3 = sb2.toString();
                    jk0 jk0Var = qp0Var.V;
                    if (jk0Var.G() - 1 != 1) {
                        str = "javascript";
                    } else {
                        str = null;
                    }
                    String str2 = str;
                    if (jk0Var.G() == 1) {
                        i = 2;
                        i10 = 3;
                    } else if (qp0Var.e == 1) {
                        i = 3;
                        i10 = 1;
                    } else {
                        i = 1;
                        i10 = 1;
                    }
                    String str3 = qp0Var.l0;
                    v80 v80Var = kVar.f16832x;
                    WebView u9 = h00Var.u();
                    v80Var.getClass();
                    bi0 f10 = v80.f(i, i10, u9, sb3, str2, str3);
                    this.f9741y = f10;
                    if (f10 != null) {
                        tt0 tt0Var = f10.f4801a;
                        if (((Boolean) g9.r.e.f17698c.a(sl.f10792j6)).booleanValue()) {
                            v80 v80Var2 = kVar.f16832x;
                            WebView u10 = h00Var.u();
                            v80Var2.getClass();
                            v80.i(tt0Var, u10);
                            ArrayList p02 = h00Var.p0();
                            int size = p02.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = p02.get(i13);
                                i13++;
                                f9.k.C.f16832x.getClass();
                                v80.p(new ac.a(tt0Var, 18, (View) obj));
                            }
                        } else {
                            View U = h00Var.U();
                            kVar.f16832x.getClass();
                            v80.i(tt0Var, U);
                        }
                        h00Var.S0(this.f9741y);
                        f9.k.C.f16832x.getClass();
                        v80.g(tt0Var);
                        this.f9742z = true;
                        h00Var.b("onSdkLoaded", new n.r0(0));
                    }
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:21:0x0034, B:24:0x001d, B:28:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: all -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:21:0x0034, B:24:0x001d, B:28:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.k70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.f10807k6     // Catch: java.lang.Throwable -> L2c
            g9.r r1 = g9.r.e     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.ql r1 = r1.f17698c     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L22
            com.google.android.gms.internal.ads.ai0 r0 = r2.A     // Catch: java.lang.Throwable -> L2c
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.xt0 r1 = r0.f4516f     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            r0 = 1
            goto L23
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            goto L22
        L1f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1     // Catch: java.lang.Throwable -> L2c
        L22:
            r0 = 0
        L23:
            if (r0 == 0) goto L2e
            com.google.android.gms.internal.ads.ai0 r0 = r2.A     // Catch: java.lang.Throwable -> L2c
            r0.b()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            return
        L2c:
            r0 = move-exception
            goto L39
        L2e:
            boolean r0 = r2.f9742z     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L34
            monitor-exit(r2)
            return
        L34:
            r2.a()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            return
        L39:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q40.e():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0014, B:6:0x0016, B:10:0x001b, B:13:0x0026, B:17:0x002f, B:19:0x0033, B:20:0x0036, B:22:0x003c, B:24:0x0040, B:26:0x0044, B:31:0x001e, B:35:0x0022, B:8:0x0017), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0014, B:6:0x0016, B:10:0x001b, B:13:0x0026, B:17:0x002f, B:19:0x0033, B:20:0x0036, B:22:0x003c, B:24:0x0040, B:26:0x0044, B:31:0x001e, B:35:0x0022, B:8:0x0017), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, n.r0] */
    @Override // com.google.android.gms.internal.ads.b70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void y() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.f10807k6     // Catch: java.lang.Throwable -> L2d
            g9.r r1 = g9.r.e     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.ql r1 = r1.f17698c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L23
            com.google.android.gms.internal.ads.ai0 r0 = r3.A     // Catch: java.lang.Throwable -> L2d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.xt0 r2 = r0.f4516f     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            r0 = 1
            goto L24
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            goto L23
        L20:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L2d
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L2f
            com.google.android.gms.internal.ads.ai0 r0 = r3.A     // Catch: java.lang.Throwable -> L2d
            r0.c()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)
            return
        L2d:
            r0 = move-exception
            goto L52
        L2f:
            boolean r0 = r3.f9742z     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L36
            r3.a()     // Catch: java.lang.Throwable -> L2d
        L36:
            com.google.android.gms.internal.ads.qp0 r0 = r3.f9739w     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.T     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L50
            com.google.android.gms.internal.ads.bi0 r0 = r3.f9741y     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L50
            com.google.android.gms.internal.ads.h00 r0 = r3.f9738v     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L50
            n.e r2 = new n.e     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "onSdkImpression"
            r0.b(r1, r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)
            return
        L50:
            monitor-exit(r3)
            return
        L52:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q40.y():void");
    }
}

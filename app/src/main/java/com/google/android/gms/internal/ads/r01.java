package com.google.android.gms.internal.ads;
import ac.b;
import r5.e;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class r01 implements cw0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10047a;

    /* renamed from: b, reason: collision with root package name */
    public final x11 f10048b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10049c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10050d;
    public final long e;

    public r01(Context context, rx0 rx0Var, x11 x11Var) {
        this.f10047a = context;
        this.f10049c = rx0Var.Q();
        this.f10050d = rx0Var.X();
        this.e = rx0Var.Y();
        this.f10048b = x11Var;
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.HashMap r6) {
        /*
            r5 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r1 = "v"
            java.lang.String r2 = r5.f10049c
            r6.put(r1, r2)
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r2 = "t"
            r6.put(r2, r1)
            java.lang.String r1 = "E"
            java.lang.String r2 = "gs"
            java.lang.Object r2 = r6.get(r2)     // Catch: java.lang.Throwable -> L45
            ac.b r2 = (ac.b) r2     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L45
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L45
            r4 = 31
            if (r3 < r4) goto L2b
            boolean r3 = r2.isDone()     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L45
        L2b:
            long r3 = r5.f10050d     // Catch: java.lang.Throwable -> L45
            java.lang.Object r2 = r2.get(r3, r0)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.je r2 = (com.google.android.gms.internal.ads.je) r2     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L45
            java.lang.String r3 = r2.u0()     // Catch: java.lang.Throwable -> L45
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L45
            r4 = 1
            if (r3 <= r4) goto L45
            java.lang.String r2 = r2.u0()     // Catch: java.lang.Throwable -> L45
            goto L46
        L45:
            r2 = r1
        L46:
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L65
            java.lang.String r1 = "ai"
            java.lang.Object r1 = r6.get(r1)     // Catch: java.lang.Throwable -> L65
            ac.b r1 = (ac.b) r1     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L65
            long r3 = r5.e     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r1.get(r3, r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L65
            boolean r1 = com.google.android.gms.internal.ads.xy.y(r0)     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L65
            r2 = r0
        L65:
            java.lang.String r0 = "int"
            r6.put(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r01.b(java.util.HashMap):void");
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap c() {
        HashMap b10 = this.f10048b.b(this.f10047a, null);
        b(b10);
        return b10;
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap k() {
        HashMap c10 = this.f10048b.c();
        b(c10);
        return c10;
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap zzb() {
        HashMap a10 = this.f10048b.a();
        b(a10);
        return a10;
    }
}

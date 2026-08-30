package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d21 implements y11 {

    /* renamed from: a, reason: collision with root package name */
    public long f5290a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f5291b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f5292c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f5293d = -1;
    public long e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f5294f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f5295g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f5296h = -1;
    public final long i = SystemClock.uptimeMillis();

    public static boolean d(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object invoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) invoke.getClass().getField("adType").get(invoke);
            num.intValue();
            String str = (String) invoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                if (!str.contains("REWARDED")) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final synchronized void a(HashMap hashMap) {
        this.f5296h = this.f5295g;
        this.f5295g = SystemClock.uptimeMillis();
        e(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final synchronized void b(HashMap hashMap) {
        this.f5291b = this.f5290a;
        this.f5290a = SystemClock.uptimeMillis();
        e(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (d(r8) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0018, B:8:0x001f, B:13:0x0072, B:14:0x0074, B:19:0x0044, B:21:0x004b, B:24:0x006d, B:26:0x0067, B:28:0x0026, B:31:0x0031, B:33:0x003a, B:35:0x003e), top: B:2:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.y11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(java.util.HashMap r6, android.content.Context r7, android.view.View r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f5292c     // Catch: java.lang.Throwable -> L16
            r5.f5293d = r0     // Catch: java.lang.Throwable -> L16
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L16
            r5.f5292c = r0     // Catch: java.lang.Throwable -> L16
            long r0 = r5.e     // Catch: java.lang.Throwable -> L16
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            r5.f5294f = r0     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r6 = move-exception
            goto L79
        L18:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L16
            r1 = 33
            r4 = 0
            if (r0 < r1) goto L26
            boolean r0 = a7.i.A(r7)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L26
            goto L41
        L26:
            java.lang.String r0 = "window"
            java.lang.Object r7 = r7.getSystemService(r0)     // Catch: java.lang.Throwable -> L16
            android.view.WindowManager r7 = (android.view.WindowManager) r7     // Catch: java.lang.Throwable -> L16
            if (r7 != 0) goto L31
            goto L41
        L31:
            android.view.Display r7 = r7.getDefaultDisplay()     // Catch: java.lang.Throwable -> L16
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L16
            r4.<init>()     // Catch: java.lang.Throwable -> L16
            r7.getRealMetrics(r4)     // Catch: java.lang.Throwable -> L16 java.lang.NoSuchMethodError -> L3e
            goto L41
        L3e:
            r7.getMetrics(r4)     // Catch: java.lang.Throwable -> L16
        L41:
            if (r4 != 0) goto L44
            goto L72
        L44:
            int r7 = r4.widthPixels     // Catch: java.lang.Throwable -> L16
            int r0 = r4.heightPixels     // Catch: java.lang.Throwable -> L16
            int r7 = r7 * r0
            if (r8 == 0) goto L72
            int r0 = r8.getWidth()     // Catch: java.lang.Throwable -> L16
            int r1 = r4.widthPixels     // Catch: java.lang.Throwable -> L16
            int r0 = java.lang.Math.min(r0, r1)     // Catch: java.lang.Throwable -> L16
            int r1 = r8.getHeight()     // Catch: java.lang.Throwable -> L16
            int r4 = r4.heightPixels     // Catch: java.lang.Throwable -> L16
            int r1 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L16
            int r0 = r0 * r1
            int r1 = r0 + r0
            if (r1 < r7) goto L65
            goto L6d
        L65:
            if (r0 != 0) goto L72
            boolean r7 = d(r8)     // Catch: java.lang.Throwable -> L16
            if (r7 == 0) goto L72
        L6d:
            long r7 = r5.f5292c     // Catch: java.lang.Throwable -> L16
            r5.e = r7     // Catch: java.lang.Throwable -> L16
            goto L74
        L72:
            r5.e = r2     // Catch: java.lang.Throwable -> L16
        L74:
            r5.e(r6)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r5)
            return
        L79:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L16
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d21.c(java.util.HashMap, android.content.Context, android.view.View):void");
    }

    public final void e(HashMap hashMap) {
        hashMap.put("tcq", Long.valueOf(this.f5290a));
        hashMap.put("tpq", Long.valueOf(this.f5291b));
        hashMap.put("tcc", Long.valueOf(this.f5295g));
        hashMap.put("tpc", Long.valueOf(this.f5296h));
        hashMap.put("tpv", Long.valueOf(this.f5293d));
        hashMap.put("tcv", Long.valueOf(this.f5292c));
        hashMap.put("tchv", Long.valueOf(this.e));
        hashMap.put("tphv", Long.valueOf(this.f5294f));
        hashMap.put("tst", Long.valueOf(this.i));
    }
}

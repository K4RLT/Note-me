package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;

/* loaded from: classes.dex */
public final class fv {

    /* renamed from: a, reason: collision with root package name */
    public int f6171a;

    /* renamed from: b, reason: collision with root package name */
    public int f6172b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6173c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6174d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6175f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6176g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6177h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6178j;

    /* renamed from: k, reason: collision with root package name */
    public final float f6179k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6180l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6181m;

    /* renamed from: n, reason: collision with root package name */
    public final String f6182n;

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(1:35)|4|(1:6)(1:34)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:20|21)(1:23)))|9|10|11|12|(0)|16|(1:24)(3:18|20|21)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af A[Catch: Exception -> 0x00d7, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d7, blocks: (B:12:0x00a1, B:14:0x00af), top: B:11:0x00a1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fv(android.content.Context r8) {
        /*
            r7 = this;
            r7.<init>()
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            com.google.android.gms.internal.ads.sl.a(r8)
            r7.b(r8)
            r7.c(r8)
            r7.d(r8)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = e(r0, r2)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L23
            r2 = r4
            goto L24
        L23:
            r2 = r3
        L24:
            r7.f6173c = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = e(r0, r2)
            if (r2 == 0) goto L30
            r2 = r4
            goto L31
        L30:
            r2 = r3
        L31:
            r7.f6174d = r2
            java.lang.String r2 = r1.getCountry()
            r7.e = r2
            f9.k r2 = f9.k.C
            k9.f0 r2 = r2.f16813c
            g9.p r2 = g9.p.f17688g
            l9.d r2 = r2.f17689a
            boolean r2 = l9.d.q()
            r7.f6175f = r2
            boolean r2 = la.b.k(r8)
            r7.f6176g = r2
            boolean r2 = la.b.o(r8)
            r7.f6177h = r2
            java.lang.String r1 = r1.getLanguage()
            r7.i = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = e(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L66
        L64:
            r0 = r2
            goto L9f
        L66:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L6b
            goto L64
        L6b:
            c4.n r5 = na.b.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r6 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            android.content.pm.PackageInfo r3 = r5.c(r3, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            if (r3 == 0) goto L64
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            int r5 = r5.length()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            int r5 = r5 + r4
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            int r6 = r6.length()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r6.<init>(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r6.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r6.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r6.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r0 = r6.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
        L9f:
            r7.f6178j = r0
            c4.n r0 = na.b.a(r8)     // Catch: java.lang.Exception -> Ld7
            java.lang.String r3 = "com.android.vending"
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r0.c(r5, r3)     // Catch: java.lang.Exception -> Ld7
            if (r0 == 0) goto Ld7
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Ld7
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Ld7
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> Ld7
            int r5 = r5.length()     // Catch: java.lang.Exception -> Ld7
            int r5 = r5 + r4
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Ld7
            int r4 = r4.length()     // Catch: java.lang.Exception -> Ld7
            int r5 = r5 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld7
            r4.<init>(r5)     // Catch: java.lang.Exception -> Ld7
            r4.append(r3)     // Catch: java.lang.Exception -> Ld7
            r4.append(r1)     // Catch: java.lang.Exception -> Ld7
            r4.append(r0)     // Catch: java.lang.Exception -> Ld7
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Ld7
        Ld7:
            r7.f6182n = r2
            android.content.res.Resources r8 = r8.getResources()
            if (r8 != 0) goto Le0
            goto Lf2
        Le0:
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            if (r8 == 0) goto Lf2
            float r0 = r8.density
            r7.f6179k = r0
            int r0 = r8.widthPixels
            r7.f6180l = r0
            int r8 = r8.heightPixels
            r7.f6181m = r8
        Lf2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fv.<init>(android.content.Context):void");
    }

    public static ResolveInfo e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            f9.k.C.f16817h.d("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final gv a() {
        return new gv(this.f6173c, this.f6174d, this.e, this.f6175f, this.f6176g, this.f6177h, this.i, this.f6178j, this.f6182n, this.f6171a, this.f6172b, this.f6179k, this.f6180l, this.f6181m);
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                f9.k.C.f16817h.d("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r5.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r0.getNetworkOperator()
            boolean r2 = la.b.i()
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.nl r2 = com.google.android.gms.internal.ads.sl.O9
            g9.r r3 = g9.r.e
            com.google.android.gms.internal.ads.ql r3 = r3.f17698c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2d
            r2 = 0
            goto L31
        L2d:
            int r2 = r0.getNetworkType()
        L31:
            r4.f6172b = r2
            r0.getPhoneType()
            r0 = -2
            r4.f6171a = r0
            f9.k r0 = f9.k.C
            k9.f0 r0 = r0.f16813c
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r5 = k9.f0.c(r5, r0)
            if (r5 == 0) goto L5f
            android.net.NetworkInfo r5 = r1.getActiveNetworkInfo()
            if (r5 == 0) goto L59
            int r0 = r5.getType()
            r4.f6171a = r0
            android.net.NetworkInfo$DetailedState r5 = r5.getDetailedState()
            r5.ordinal()
            goto L5c
        L59:
            r5 = -1
            r4.f6171a = r5
        L5c:
            r1.isActiveNetworkMetered()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fv.c(android.content.Context):void");
    }

    public final void d(Context context) {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (((Boolean) g9.r.e.f17698c.a(sl.f10956tc)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            registerReceiver = context.registerReceiver(null, intentFilter, 4);
        } else {
            registerReceiver = context.registerReceiver(null, intentFilter);
        }
        if (registerReceiver != null) {
            registerReceiver.getIntExtra("status", -1);
            registerReceiver.getIntExtra("level", -1);
            registerReceiver.getIntExtra("scale", -1);
        }
    }

    public fv(Context context, gv gvVar) {
        sl.a(context);
        b(context);
        c(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        cm.a(context);
        this.f6173c = gvVar.f6467a;
        this.f6174d = gvVar.f6468b;
        this.e = gvVar.f6469c;
        this.f6175f = gvVar.f6470d;
        this.f6176g = gvVar.e;
        this.f6177h = gvVar.f6471f;
        this.i = gvVar.f6472g;
        this.f6178j = gvVar.f6473h;
        this.f6182n = gvVar.i;
        this.f6179k = gvVar.f6476l;
        this.f6180l = gvVar.f6477m;
        this.f6181m = gvVar.f6478n;
    }
}

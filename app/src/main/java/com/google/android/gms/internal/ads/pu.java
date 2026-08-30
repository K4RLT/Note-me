package com.google.android.gms.internal.ads;
import ac.a;
import bb.a;
import c4.n;
import ca.f;
import g9.p;
import g9.r;
import l9.a;
import l9.d;
import l9.i;
import l9.l;
import na.b;
import p.a;
import r0.a;
import r1.a;
import r5.a;
import r5.c;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioDeviceInfo;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class pu implements qu {
    public static final Object F = new Object();
    public static qu G;
    public static qu H;
    public static qu I;
    public static Boolean J;
    public final Object A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;

    /* renamed from: u, reason: collision with root package name */
    public final Context f9606u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9607v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f9608w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f9609x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f9610y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f9611z;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pu(android.content.Context r4, a r5) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f9608w = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r3.f9609x = r0
            com.google.android.gms.internal.ads.np0 r0 = new com.google.android.gms.internal.ads.np0
            r0.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool(r0)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r3.f9610y = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r3.D = r0
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto L31
            android.content.Context r4 = r4.getApplicationContext()
        L31:
            r3.f9606u = r4
            r3.f9611z = r5
            com.google.android.gms.internal.ads.nl r5 = com.google.android.gms.internal.ads.sl.S8
            r r0 = r.e
            com.google.android.gms.internal.ads.ql r0 = r0.f17698c
            java.lang.Object r5 = a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0 = 0
            if (r5 == 0) goto L52
            a r5 = d.f20036b
            if (r4 == 0) goto L52
            android.content.pm.ApplicationInfo r5 = r4.getApplicationInfo()
            if (r5 != 0) goto L54
        L52:
            r4 = r0
            goto L63
        L54:
            n r5 = b.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            r1 = 0
            android.content.pm.PackageInfo r4 = c(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
        L63:
            r3.A = r4
            com.google.android.gms.internal.ads.nl r4 = com.google.android.gms.internal.ads.sl.F8
            r r5 = r.e
            com.google.android.gms.internal.ads.ql r1 = r5.f17698c
            java.lang.Object r1 = a(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "unknown"
            if (r1 == 0) goto L84
            a r1 = d.f20036b
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getCountry()
            goto L85
        L84:
            r1 = r2
        L85:
            r3.B = r1
            com.google.android.gms.internal.ads.ql r5 = r5.f17698c
            java.lang.Object r4 = a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Lb2
            android.content.Context r4 = r3.f9606u
            a r5 = d.f20036b
            if (r4 != 0) goto L9c
            goto Lb3
        L9c:
            n r4 = b.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            java.lang.String r5 = "com.android.vending"
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r4 = r4.c(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            if (r4 != 0) goto Lab
            goto Lb3
        Lab:
            int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            java.lang.String r0 = java.lang.Integer.toString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            goto Lb3
        Lb2:
            r0 = r2
        Lb3:
            r3.C = r0
            com.google.android.gms.internal.ads.nl r4 = com.google.android.gms.internal.ads.sl.B8
            r r5 = r.e
            com.google.android.gms.internal.ads.ql r5 = r5.f17698c
            java.lang.Object r4 = a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= 0) goto Lce
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r3.E = r4
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pu.<init>(android.content.Context, a):void");
    }

    public static qu a(Context context) {
        synchronized (F) {
            try {
                if (G == null) {
                    if (h(context)) {
                        G = new pu(context, a.a());
                    } else {
                        G = new fp(11);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return G;
    }

    public static qu b(Context context, a aVar) {
        synchronized (F) {
            try {
                if (I == null) {
                    boolean z3 = false;
                    if (((Boolean) pm.f9547c.p()).booleanValue()) {
                        if (!((Boolean) r.e.f17698c.a(sl.f11047z8)).booleanValue() || ((Boolean) pm.f9545a.p()).booleanValue()) {
                            z3 = true;
                        }
                    }
                    if (h(context)) {
                        pu puVar = new pu(context, aVar);
                        puVar.i();
                        Thread.setDefaultUncaughtExceptionHandler(new ou(puVar, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        I = puVar;
                    } else if (z3 && context != null) {
                        pu puVar2 = new pu(context, aVar);
                        puVar2.f9607v = true;
                        puVar2.i();
                        Thread.setDefaultUncaughtExceptionHandler(new ou(puVar2, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        I = puVar2;
                    } else {
                        I = new fp(11);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return I;
    }

    public static qu e(Context context) {
        synchronized (F) {
            try {
                if (H == null) {
                    nl nlVar = sl.A8;
                    r rVar = r.e;
                    if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                        if (!((Boolean) rVar.f17698c.a(sl.f11047z8)).booleanValue() && context != null) {
                            H = new pu(context, a.a());
                        }
                    }
                    H = new fp(11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return H;
    }

    public static String f(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean h(Context context) {
        boolean z3;
        if (context != null) {
            synchronized (F) {
                try {
                    if (J == null) {
                        if (p.f17688g.e.nextInt(100) < ((Integer) r.e.f17698c.a(sl.f10768he)).intValue()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        J = Boolean.valueOf(z3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (J.booleanValue()) {
                if (!((Boolean) r.e.f17698c.a(sl.f11047z8)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.qu
    public void c(String str, Throwable th) {
        if (this.f9607v) {
            return;
        }
        d(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.qu
    public void d(Throwable th, String str, float f10) {
        Throwable th2;
        boolean z3;
        Throwable th3;
        String str2;
        int i;
        boolean z9;
        String str3;
        String str4;
        PackageInfo c10;
        ActivityManager.MemoryInfo i10;
        Context context = this.f9606u;
        if (!this.f9607v) {
            a aVar = d.f20036b;
            if (((Boolean) fn.e.p()).booleanValue()) {
                th2 = th;
            } else {
                LinkedList linkedList = new LinkedList();
                for (Throwable th4 = th; th4 != null; th4 = th4.getCause()) {
                    linkedList.push(th4);
                }
                th2 = null;
                while (!linkedList.isEmpty()) {
                    Throwable th5 = (Throwable) linkedList.pop();
                    StackTraceElement[] stackTrace = th5.getStackTrace();
                    if (((Boolean) r.e.f17698c.a(sl.f10662b3)).booleanValue() && stackTrace != null && stackTrace.length == 0 && d.o(th5.getClass().getName())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        if (d.o(stackTraceElement.getClassName())) {
                            arrayList.add(stackTraceElement);
                            z3 = true;
                        } else {
                            String className = stackTraceElement.getClassName();
                            if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                                arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                            } else {
                                arrayList.add(stackTraceElement);
                            }
                        }
                    }
                    if (z3) {
                        if (th2 == null) {
                            th3 = new Throwable(th5.getMessage());
                        } else {
                            th3 = new Throwable(th5.getMessage(), th2);
                        }
                        th2 = th3;
                        th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    }
                }
            }
            if (th2 != null) {
                String name = th.getClass().getName();
                String f11 = f(th);
                String str5 = "";
                if (!((Boolean) r.e.f17698c.a(sl.Y9)).booleanValue() || (str2 = d.d(f(th), "SHA-256")) == null) {
                    str2 = "";
                }
                double d2 = f10;
                double random = Math.random();
                if (f10 > 0.0f) {
                    i = (int) (1.0f / f10);
                } else {
                    i = 1;
                }
                if (random < d2) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        z9 = b.a(context).d();
                    } catch (Throwable th6) {
                        i.d("Error fetching instant app info", th6);
                        z9 = false;
                    }
                    try {
                        str3 = context.getPackageName();
                    } catch (Throwable unused) {
                        i.f("Cannot obtain package name, proceeding.");
                        str3 = "unknown";
                    }
                    Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z9)).appendQueryParameter(FacebookMediationAdapter.KEY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                    int i11 = Build.VERSION.SDK_INT;
                    Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i11));
                    String str6 = Build.MANUFACTURER;
                    String str7 = Build.MODEL;
                    if (!str7.startsWith(str6)) {
                        str7 = a.o(new StringBuilder(String.valueOf(str6).length() + 1 + str7.length()), str6, " ", str7);
                    }
                    Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str7);
                    a aVar2 = (a) this.f9611z;
                    Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("js", aVar2.f20029u).appendQueryParameter("appid", str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", f11);
                    r rVar = r.e;
                    hq0 hq0Var = rVar.f17696a;
                    ql qlVar = rVar.f17698c;
                    Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("eids", TextUtils.join(",", hq0Var.F())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "919173219").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(fn.f6129c.p()));
                    f.f4036b.getClass();
                    Uri.Builder appendQueryParameter6 = appendQueryParameter5.appendQueryParameter("gmscv", String.valueOf(f.a(context)));
                    String str8 = "1";
                    if (true == aVar2.f20033y) {
                        str4 = "1";
                    } else {
                        str4 = "0";
                    }
                    Uri.Builder appendQueryParameter7 = appendQueryParameter6.appendQueryParameter("lite", str4);
                    if (!TextUtils.isEmpty(str2)) {
                        appendQueryParameter7.appendQueryParameter("hash", str2);
                    }
                    if (((Boolean) qlVar.a(sl.G8)).booleanValue() && (i10 = d.i(context)) != null) {
                        appendQueryParameter7.appendQueryParameter("available_memory", Long.toString(i10.availMem));
                        appendQueryParameter7.appendQueryParameter("total_memory", Long.toString(i10.totalMem));
                        if (true != i10.lowMemory) {
                            str8 = "0";
                        }
                        appendQueryParameter7.appendQueryParameter("is_low_memory", str8);
                    }
                    if (((Boolean) qlVar.a(sl.F8)).booleanValue()) {
                        String str9 = (String) this.B;
                        if (!TextUtils.isEmpty(str9)) {
                            appendQueryParameter7.appendQueryParameter("countrycode", str9);
                        }
                        String str10 = (String) this.C;
                        if (!TextUtils.isEmpty(str10)) {
                            appendQueryParameter7.appendQueryParameter("psv", str10);
                        }
                        if (i11 >= 26) {
                            c10 = WebView.getCurrentWebViewPackage();
                        } else {
                            if (context != null) {
                                try {
                                    c10 = b.a(context).c(128, "com.android.webview");
                                } catch (PackageManager.NameNotFoundException unused2) {
                                }
                            }
                            c10 = null;
                        }
                        if (c10 != null) {
                            appendQueryParameter7.appendQueryParameter("wvvc", Integer.toString(c10.versionCode));
                            appendQueryParameter7.appendQueryParameter("wvvn", c10.versionName);
                            appendQueryParameter7.appendQueryParameter("wvpn", c10.packageName);
                        }
                    }
                    PackageInfo packageInfo = (PackageInfo) this.A;
                    if (packageInfo != null) {
                        appendQueryParameter7.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                        appendQueryParameter7.appendQueryParameter("appvn", packageInfo.versionName);
                    }
                    if (((Boolean) r.e.f17698c.a(sl.Tc)).booleanValue()) {
                        String j10 = d.j(context);
                        if (j10 != null) {
                            str5 = j10;
                        }
                        appendQueryParameter7.appendQueryParameter("uev", str5);
                    }
                    arrayList2.add(appendQueryParameter7.toString());
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        ((ExecutorService) this.f9610y).execute(new a(new l(context, null), 7, (String) obj));
                    }
                }
            }
        }
    }

    public void g(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        HashSet hashSet = (HashSet) this.E;
        if (th != null) {
            boolean z3 = false;
            boolean z9 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z3 |= d.o(stackTraceElement.getClassName());
                    z9 |= pu.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int intValue = ((Integer) r.e.f17698c.a(sl.B8)).intValue();
            if (intValue > 0) {
                if (hashSet.size() < intValue) {
                    String d2 = d.d(f(th), "SHA-256");
                    if (d2 == null) {
                        d2 = "";
                    }
                    if (!hashSet.contains(d2)) {
                        hashSet.add(d2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (z3 && !z9) {
                if (!this.f9607v) {
                    c("", th);
                }
                if (!((AtomicBoolean) this.D).getAndSet(true) && ((Boolean) pm.f9547c.p()).booleanValue() && (sharedPreferences = (context = this.f9606u).getSharedPreferences("admob", 0)) != null) {
                    sharedPreferences.edit().putInt("crash_without_write", ay0.M(context, "crash_without_write") + 1).commit();
                }
            }
        }
    }

    public void i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f9608w) {
            ((WeakHashMap) this.f9609x).put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new ou(this, thread.getUncaughtExceptionHandler(), 1));
    }

    public List j() {
        d dVar;
        boolean isAvailable;
        Spatializer spatializer;
        boolean isEnabled;
        List spatializedChannelMasks;
        int i = Build.VERSION.SDK_INT;
        if (i >= 32 && (dVar = (d) this.B) != null) {
            Spatializer spatializer2 = (Spatializer) dVar.f5230v;
            if (spatializer2 != null && dVar.f5229u) {
                isAvailable = spatializer2.isAvailable();
                if (isAvailable && (spatializer = (Spatializer) dVar.f5230v) != null) {
                    isEnabled = spatializer.isEnabled();
                    if (isEnabled) {
                        if (i >= 36) {
                            Spatializer spatializer3 = (Spatializer) dVar.f5230v;
                            spatializer3.getClass();
                            spatializedChannelMasks = l0.d(spatializer3).getSpatializedChannelMasks();
                            return spatializedChannelMasks;
                        }
                        return d51.q(252);
                    }
                }
            }
            b51 b51Var = d51.f5314v;
            return y51.f12781y;
        }
        b51 b51Var2 = d51.f5314v;
        return y51.f12781y;
    }

    public void k(vu1 vu1Var) {
        if (this.f9607v && !vu1Var.equals((vu1) this.C)) {
            this.C = vu1Var;
            com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.lw) ((to0) this.f9608w).f11406v;
            lwVar.j();
            vu1 vu1Var2 = (vu1) lwVar.f14647y;
            if (vu1Var2 != null && !vu1Var.equals(vu1Var2)) {
                lwVar.f14647y = vu1Var;
                ig0 ig0Var = (ig0) lwVar.f14645w;
                if (ig0Var != null) {
                    ig0Var.c(-1, iu1.A);
                    ig0Var.d();
                }
            }
        }
    }

    public void l() {
        List j10 = j();
        l50 l50Var = (l50) this.E;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.D;
        y51 y51Var = vu1.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f9606u;
        k(vu1.a(context, context.registerReceiver(null, intentFilter), l50Var, audioDeviceInfo, j10));
    }

    public pu(Context context, to0 to0Var, l50 l50Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f9606u = applicationContext;
        this.f9608w = to0Var;
        this.E = l50Var;
        this.D = audioDeviceInfo;
        String str = bq0.f4860a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f9609x = handler;
        this.f9610y = new wu1(this);
        this.f9611z = new hg(5, this);
        y51 y51Var = vu1.e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.A = uriFor != null ? new xu1(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }
}

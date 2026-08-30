package c7;
import c.c;
import c0.a;
import c0.b;
import c0.z;
import i0.m;
import t.g;
import t.h;
import t.i;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.s1;
import b0.e1;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.fu1;
import com.google.android.gms.internal.ads.t81;
import com.google.android.gms.internal.mlkit_vision_digital_ink.iw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ra;
import com.google.android.gms.internal.play_billing.a3;
import com.google.android.gms.internal.play_billing.b3;
import com.google.android.gms.internal.play_billing.c3;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.e4;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.q0;
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.internal.play_billing.y3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c {
    public volatile d A;
    public ExecutorService B;
    public final Long C;
    public final com.google.android.gms.internal.play_billing.j D;

    /* renamed from: c, reason: collision with root package name */
    public final String f3905c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3906d;

    /* renamed from: f, reason: collision with root package name */
    public volatile z f3907f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f3908g;

    /* renamed from: h, reason: collision with root package name */
    public final pw f3909h;
    public volatile com.google.android.gms.internal.play_billing.c i;

    /* renamed from: j, reason: collision with root package name */
    public volatile u f3910j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3911k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3913m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3914n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3915o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3916p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3917q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3918r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3919s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3920t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3921u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3922v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3923w;

    /* renamed from: x, reason: collision with root package name */
    public final va.t f3924x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f3925y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f3926z;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3903a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile int f3904b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());

    /* renamed from: l, reason: collision with root package name */
    public int f3912l = 0;

    public c(va.t tVar, Context context, l lVar, b bVar) {
        long nextLong = new Random().nextLong();
        this.C = Long.valueOf(nextLong);
        this.D = com.google.android.gms.internal.play_billing.k.f15469a;
        this.f3905c = "8.2.0";
        String i = i();
        this.f3906d = i;
        this.f3908g = context.getApplicationContext();
        k3 z3 = l3.z();
        z3.b();
        l3.x((l3) z3.f15516v);
        if (i != null) {
            z3.b();
            l3.y((l3) z3.f15516v, i);
        }
        String packageName = this.f3908g.getPackageName();
        z3.b();
        l3.q((l3) z3.f15516v, packageName);
        z3.b();
        l3.D((l3) z3.f15516v, nextLong);
        boolean z9 = bVar.f3902d;
        z3.b();
        l3.w((l3) z3.f15516v, z9);
        int i10 = Build.VERSION.SDK_INT;
        z3.b();
        l3.A((l3) z3.f15516v, i10);
        z3.c();
        z(z3, context);
        try {
            int i11 = this.f3908g.getPackageManager().getPackageInfo(this.f3908g.getPackageName(), 0).versionCode;
            z3.b();
            l3.B((l3) z3.f15516v, i11);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Error getting app version code.", th);
        }
        this.f3909h = new pw(this.f3908g, (l3) z3.a());
        if (lVar == null) {
            com.google.android.gms.internal.play_billing.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f3907f = new z(this.f3908g, lVar, this.f3909h);
        this.f3924x = tVar;
        this.f3926z = false;
        this.f3908g.getPackageName();
        this.f3925y = bVar.f3902d;
    }

    public static Future g(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new t81(submit, 3, runnable), (long) (j10 * 0.95d));
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static String i() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void l(c cVar, int i) {
        z zVar;
        if (i == 0) {
            synchronized (cVar.f3903a) {
                try {
                    if (cVar.f3904b == 3) {
                        return;
                    }
                    int i10 = 2;
                    cVar.u(2);
                    if (cVar.f3907f != null) {
                        zVar = cVar.f3907f;
                    } else {
                        zVar = null;
                    }
                    if (zVar != null) {
                        boolean z3 = cVar.f3921u;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        zVar.f3436u = z3;
                        i0 i0Var = (i0) zVar.f3441z;
                        Context context = (Context) zVar.f3437v;
                        i0Var.a(context, intentFilter2);
                        boolean z9 = zVar.f3436u;
                        i0 i0Var2 = (i0) zVar.f3440y;
                        if (z9) {
                            synchronized (i0Var2) {
                                try {
                                    if (i0Var2.f3969b) {
                                        return;
                                    }
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        if (true != i0Var2.f3970c) {
                                            i10 = 4;
                                        }
                                        context.registerReceiver(i0Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i10);
                                    } else {
                                        context.registerReceiver(i0Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                                    }
                                    i0Var2.f3969b = true;
                                    return;
                                } finally {
                                }
                            }
                        }
                        i0Var2.a(context, intentFilter);
                        return;
                    }
                    return;
                } finally {
                }
            }
        }
        cVar.u(0);
    }

    public static final void z(k3 k3Var, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i = (int) (memoryInfo.totalMem / 1048576);
                k3Var.b();
                l3.v((l3) k3Var.f15516v, i);
                String str = Build.BRAND;
                k3Var.b();
                l3.r((l3) k3Var.f15516v);
                String str2 = Build.MODEL;
                k3Var.b();
                l3.u((l3) k3Var.f15516v);
                String str3 = Build.MANUFACTURER;
                k3Var.b();
                l3.t((l3) k3Var.f15516v);
                String str4 = Build.FINGERPRINT;
                k3Var.b();
                l3.s((l3) k3Var.f15516v);
            }
        } catch (RuntimeException e) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Runtime error while populating device info.", e);
        }
    }

    public final m A(f fVar, int i, String str, Exception exc) {
        D(i, 9, fVar, a(exc));
        com.google.android.gms.internal.play_billing.i("BillingClient", str, exc);
        return new m(fVar, 2, (Object) null);
    }

    public final void B(int i, int i10, f fVar) {
        try {
            int i11 = c0.f3927a;
            r(b(i, i10, fVar, null, i3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void C(int i, f fVar, long j10) {
        try {
            int i10 = c0.f3927a;
            try {
                this.f3909h.u(b(i, 2, fVar, null, i3.BROADCAST_ACTION_UNSPECIFIED), this.f3912l, j10);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(int i, int i10, f fVar, String str) {
        try {
            int i11 = c0.f3927a;
            r(b(i, i10, fVar, str, i3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void E(int i, f fVar, long j10, boolean z3) {
        try {
            int i10 = c0.f3927a;
            try {
                this.f3909h.w(b(i, 2, fVar, null, i3.BROADCAST_ACTION_UNSPECIFIED), this.f3912l, j10, z3);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void F(int i, f fVar, String str, long j10, boolean z3) {
        try {
            int i10 = c0.f3927a;
            try {
                this.f3909h.w(b(i, 2, fVar, str, i3.BROADCAST_ACTION_UNSPECIFIED), this.f3912l, j10, z3);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void G(f fVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new ac.a(this, 3, fVar));
    }

    public void a(c4.s sVar, s1 s1Var) {
        if (g(new r(1, this, s1Var, sVar), 30000L, new a6.x(this, 3, s1Var), m(), f()) == null) {
            f p10 = p();
            B(25, 3, p10);
            p10.getClass();
        }
    }

    public void b(a aVar, g gVar) {
        if (g(new r(2, this, gVar, aVar), 30000L, new ba.j(1, this, gVar, aVar), m(), f()) == null) {
            f p10 = p();
            B(25, 4, p10);
            gVar.a(p10, aVar.f3896v);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0737 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x030e  */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [c7.h] */
    /* JADX WARN: Type inference failed for: r5v7, types: [c7.h] */
    /* JADX WARN: Type inference failed for: r6v24, types: [android.os.Bundle, android.os.BaseBundle] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c7.f c(android.app.Activity r31, final z r32) {
        /*
            Method dump skipped, instructions count: 1999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.c.c(android.app.Activity, z):c7.f");
    }

    public void d(pd.c cVar, j jVar) {
        int i = 3;
        if (g(new r(i, this, jVar, cVar), 30000L, new ra(this, i, jVar), m(), f()) == null) {
            f p10 = p();
            B(25, 7, p10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f15518v;
            jVar.b(p10, new n(com.google.android.gms.internal.play_billing.v.f15535y));
        }
    }

    public void e(d dVar) {
        v(dVar, 0);
    }

    public final synchronized ExecutorService f() {
        try {
            if (this.B == null) {
                this.B = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.t.f15532a, new s(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.B;
    }

    public final void h() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.f3908g.getPackageName();
    }

    public final void j(s1 s1Var, f fVar, int i, Exception exc) {
        com.google.android.gms.internal.play_billing.i("BillingClient", "Error in acknowledge purchase!", exc);
        D(i, 3, fVar, a(exc));
        fVar.getClass();
    }

    public final void k(g gVar, String str, f fVar, int i, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.i("BillingClient", str2, exc);
        D(i, 4, fVar, a(exc));
        gVar.a(fVar, str);
    }

    public final Handler m() {
        if (Looper.myLooper() == null) {
            return this.e;
        }
        return new Handler(Looper.myLooper());
    }

    public final e1 n(f fVar, int i, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.i("BillingClient", str, exc);
        D(i, 7, fVar, a(exc));
        return new e1(fVar.f3946a, fVar.f3948c, new ArrayList(), new ArrayList());
    }

    public final f o(int i) {
        boolean z3;
        com.google.android.gms.internal.play_billing.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        c3 q10 = e3.q();
        q10.b();
        e3.p((e3) q10.f15516v, 6);
        x3 p10 = y3.p();
        p10.b();
        y3.t((y3) p10.f15516v);
        if (i > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        p10.c(z3);
        p10.d(i);
        q10.b();
        e3.u((e3) q10.f15516v, (y3) p10.a());
        s((e3) q10.a());
        return e0.i;
    }

    public final f p() {
        int[] iArr = {0, 3};
        synchronized (this.f3903a) {
            for (int i = 0; i < 2; i++) {
                if (this.f3904b == iArr[i]) {
                    return e0.f3937j;
                }
            }
            return e0.f3936h;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.play_billing.c4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.play_billing.f4, java.lang.Object] */
    public final r0 q(int i) {
        if (this.f3925y && !y()) {
            Object obj = new Object();
            obj.f15397c = new Object();
            e4 e4Var = new e4(obj);
            obj.f15396b = e4Var;
            obj.f15395a = p.class;
            try {
                v(new iw(2, this, obj, false), i);
                obj.f15395a = "reconnectIfNeeded";
                return e4Var;
            } catch (Exception e) {
                e4Var.b(e);
                return e4Var;
            }
        }
        com.google.android.gms.internal.play_billing.g("BillingClient", "Already connected or not opted into auto reconnection.");
        return new q0(e0.i);
    }

    public final void r(b3 b3Var) {
        try {
            pw pwVar = this.f3909h;
            int i = this.f3912l;
            pwVar.getClass();
            try {
                k3 k3Var = (k3) ((l3) pwVar.f14821v).l();
                k3Var.b();
                l3.C((l3) k3Var.f15516v, i);
                pwVar.f14821v = (l3) k3Var.a();
                pwVar.m(b3Var);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.i("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void s(e3 e3Var) {
        try {
            pw pwVar = this.f3909h;
            int i = this.f3912l;
            pwVar.getClass();
            try {
                k3 k3Var = (k3) ((l3) pwVar.f14821v).l();
                k3Var.b();
                l3.C((l3) k3Var.f15516v, i);
                l3 l3Var = (l3) k3Var.a();
                pwVar.f14821v = l3Var;
                try {
                    pwVar.C(e3Var, l3Var);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.i("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void t(int i, int i10, f fVar) {
        boolean z3;
        try {
            int i11 = c0.f3927a;
            a3 a3Var = (a3) b(i, 6, fVar, null, i3.BROADCAST_ACTION_UNSPECIFIED).l();
            x3 p10 = y3.p();
            if (i10 > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            p10.c(z3);
            p10.d(i10);
            a3Var.d(p10);
            r((b3) a3Var.a());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void u(int i) {
        String str;
        String str2;
        synchronized (this.f3903a) {
            try {
                if (this.f3904b == 3) {
                    return;
                }
                int i10 = this.f3904b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            str = "CLOSED";
                        } else {
                            str = "CONNECTED";
                        }
                    } else {
                        str = "CONNECTING";
                    }
                } else {
                    str = "DISCONNECTED";
                }
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            str2 = "CLOSED";
                        } else {
                            str2 = "CONNECTED";
                        }
                    } else {
                        str2 = "CONNECTING";
                    }
                } else {
                    str2 = "DISCONNECTED";
                }
                com.google.android.gms.internal.play_billing.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f3904b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(d dVar, int i) {
        int i10;
        f fVar;
        boolean bindService;
        f fVar2;
        synchronized (this.f3903a) {
            try {
                if (y()) {
                    fVar = o(i);
                } else {
                    if (this.f3904b == 1) {
                        com.google.android.gms.internal.play_billing.h("BillingClient", "Client is already in the process of connecting to billing service.");
                        fVar2 = e0.f3933d;
                        t(37, i, fVar2);
                    } else if (this.f3904b == 3) {
                        com.google.android.gms.internal.play_billing.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        fVar2 = e0.f3937j;
                        t(38, i, fVar2);
                    } else {
                        u(1);
                        if (i == 0) {
                            this.A = dVar;
                            i = 0;
                        }
                        w();
                        com.google.android.gms.internal.play_billing.g("BillingClient", "Starting in-app billing setup.");
                        this.f3910j = new u(this, dVar, i);
                        u uVar = this.f3910j;
                        synchronized (uVar.f3996y.f3903a) {
                            fu1 fu1Var = uVar.f3993v;
                            fu1Var.f6168w = 0L;
                            fu1Var.f6167v = false;
                            fu1Var.c();
                        }
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> queryIntentServices = this.f3908g.getPackageManager().queryIntentServices(intent, 0);
                        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            i10 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (Objects.equals(str, "com.android.vending") && str2 != null) {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f3905c);
                                    synchronized (this.f3903a) {
                                        try {
                                            if (this.f3904b == 2) {
                                                fVar = o(i);
                                            } else if (this.f3904b != 1) {
                                                com.google.android.gms.internal.play_billing.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                fVar2 = e0.f3937j;
                                                t(FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS, i, fVar2);
                                            } else {
                                                u uVar2 = this.f3910j;
                                                if (i > 0 && Build.VERSION.SDK_INT >= 29) {
                                                    bindService = this.f3908g.bindService(intent2, 1, f(), uVar2);
                                                } else {
                                                    bindService = this.f3908g.bindService(intent2, uVar2, 1);
                                                }
                                                if (bindService) {
                                                    com.google.android.gms.internal.play_billing.g("BillingClient", "Service was bonded successfully.");
                                                    fVar = null;
                                                } else {
                                                    com.google.android.gms.internal.play_billing.h("BillingClient", "Connection to Billing service is blocked.");
                                                    i10 = 39;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                } else {
                                    com.google.android.gms.internal.play_billing.h("BillingClient", "The device doesn't have valid Play Store.");
                                }
                            } else {
                                com.google.android.gms.internal.play_billing.h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        } else {
                            i10 = 41;
                        }
                        u(0);
                        com.google.android.gms.internal.play_billing.g("BillingClient", "Billing service unavailable on device.");
                        f fVar3 = e0.f3931b;
                        t(i10, i, fVar3);
                        fVar = fVar3;
                    }
                    fVar = fVar2;
                }
            } finally {
            }
        }
        if (fVar != null) {
            dVar.u(fVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w() {
        synchronized (this.f3903a) {
            if (this.f3910j != null) {
                try {
                    this.f3908g.unbindService(this.f3910j);
                } catch (Throwable th) {
                    try {
                        com.google.android.gms.internal.play_billing.i("BillingClient", "There was an exception while unbinding service!", th);
                        this.i = null;
                        this.f3910j = null;
                    } finally {
                        this.i = null;
                        this.f3910j = null;
                    }
                }
            }
        }
    }

    public final boolean x() {
        long max;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.google.android.gms.internal.play_billing.j jVar = this.D;
        if (jVar != null) {
            long a10 = jVar.a();
            long j10 = 30000;
            int i = 1;
            long j11 = 30000;
            while (i <= 3) {
                try {
                    max = Math.max(0L, j11);
                } catch (Exception e) {
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    com.google.android.gms.internal.play_billing.i("BillingClient", "Error during reconnection attempt: ", e);
                }
                if (max <= 0) {
                    com.google.android.gms.internal.play_billing.h("BillingClient", "No time remaining for reconnection attempt.");
                    return y();
                }
                int i10 = ((f) q(i).get(max, timeUnit)).f3946a;
                if (i10 == 0) {
                    com.google.android.gms.internal.play_billing.g("BillingClient", "Reconnection succeeded with result: " + i10);
                    return y();
                }
                com.google.android.gms.internal.play_billing.h("BillingClient", "Reconnection failed with result: " + i10);
                j11 = j10 - (((jVar.a() - a10) + 0) / 1000000);
                long j12 = j10;
                long pow = ((long) Math.pow(2.0d, i - 1)) * 1000;
                if (j11 < pow) {
                    com.google.android.gms.internal.play_billing.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return y();
                }
                if (i < 3 && pow > 0) {
                    try {
                        Thread.sleep(pow);
                        j11 = j12 - (((jVar.a() - a10) + 0) / 1000000);
                    } catch (InterruptedException e8) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.i("BillingClient", "Error sleeping during reconnection attempt: ", e8);
                    }
                }
                i++;
                j10 = j12;
            }
            com.google.android.gms.internal.play_billing.h("BillingClient", "Max retries reached.");
            return y();
        }
        g5.q.h("ticker");
        return false;
    }

    public final boolean y() {
        boolean z3;
        synchronized (this.f3903a) {
            try {
                z3 = false;
                if (this.f3904b == 2 && this.i != null && this.f3910j != null) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    public c(va.t tVar, Context context, b bVar) {
        long nextLong = new Random().nextLong();
        this.C = Long.valueOf(nextLong);
        this.D = com.google.android.gms.internal.play_billing.k.f15469a;
        this.f3905c = "8.2.0";
        String i = i();
        this.f3906d = i;
        this.f3908g = context.getApplicationContext();
        k3 z3 = l3.z();
        z3.b();
        l3.x((l3) z3.f15516v);
        if (i != null) {
            z3.b();
            l3.y((l3) z3.f15516v, i);
        }
        String packageName = this.f3908g.getPackageName();
        z3.b();
        l3.q((l3) z3.f15516v, packageName);
        z3.b();
        l3.D((l3) z3.f15516v, nextLong);
        boolean z9 = bVar.f3902d;
        z3.b();
        l3.w((l3) z3.f15516v, z9);
        int i10 = Build.VERSION.SDK_INT;
        z3.b();
        l3.A((l3) z3.f15516v, i10);
        z3.c();
        z(z3, context);
        try {
            int i11 = this.f3908g.getPackageManager().getPackageInfo(this.f3908g.getPackageName(), 0).versionCode;
            z3.b();
            l3.B((l3) z3.f15516v, i11);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Error getting app version code.", th);
        }
        this.f3909h = new pw(this.f3908g, (l3) z3.a());
        com.google.android.gms.internal.play_billing.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f3907f = new z(this.f3908g, null, this.f3909h);
        this.f3924x = tVar;
        this.f3908g.getPackageName();
        this.f3925y = bVar.f3902d;
    }
}
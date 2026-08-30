package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b0.g1;
import ba.h;
import ba.q;
import bc.g;
import com.google.android.gms.internal.ads.d;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.mlkit_vision_digital_ink.r;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import com.google.firebase.messaging.FirebaseMessaging;
import dd.c;
import eb.h2;
import fa.y;
import g9.n;
import gd.b;
import hd.e;
import ib.o;
import ic.f;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k6.i;
import ma.a;
import nd.v;
import wa.h8;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: k, reason: collision with root package name */
    public static i f15595k;

    /* renamed from: l, reason: collision with root package name */
    public static b f15596l = new f(1);

    /* renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f15597m;

    /* renamed from: a, reason: collision with root package name */
    public final g f15598a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15599b;

    /* renamed from: c, reason: collision with root package name */
    public final n f15600c;

    /* renamed from: d, reason: collision with root package name */
    public final nd.g f15601d;
    public final d e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f15602f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f15603g;

    /* renamed from: h, reason: collision with root package name */
    public final o f15604h;
    public final g1 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15605j;

    public FirebaseMessaging(g gVar, b bVar, b bVar2, e eVar, b bVar3, c cVar) {
        gVar.a();
        Context context = gVar.f3177a;
        final g1 g1Var = new g1(context, 4);
        final n nVar = new n(gVar, g1Var, bVar, bVar2, eVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Firebase-Messaging-File-Io"));
        this.f15605j = false;
        f15596l = bVar3;
        this.f15598a = gVar;
        this.e = new d(this, cVar);
        gVar.a();
        final Context context2 = gVar.f3177a;
        this.f15599b = context2;
        h2 h2Var = new h2();
        this.i = g1Var;
        this.f15600c = nVar;
        this.f15601d = new nd.g(newSingleThreadExecutor);
        this.f15602f = scheduledThreadPoolExecutor;
        this.f15603g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(h2Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        final int i = 0;
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: nd.h

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f21255v;

            {
                this.f21255v = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ib.o d2;
                int i10;
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f21255v;
                        if (firebaseMessaging.e.c() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f15605j) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f21255v;
                        Context context3 = firebaseMessaging2.f15599b;
                        v.f(context3);
                        g9.n nVar2 = firebaseMessaging2.f15600c;
                        boolean f10 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences e = v.e(context3);
                            if (!e.contains("proxy_retention") || e.getBoolean("proxy_retention", false) != f10) {
                                ba.b bVar4 = (ba.b) nVar2.f17680x;
                                if (bVar4.f3118c.t() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f10);
                                    ba.q c10 = ba.q.c(bVar4.f3117b);
                                    synchronized (c10) {
                                        i10 = c10.f3157u;
                                        c10.f3157u = i10 + 1;
                                    }
                                    d2 = c10.d(new ba.o(i10, 4, bundle, 0));
                                } else {
                                    d2 = h8.d(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                d2.f(new d5.c(0), new m(context3, f10));
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Topics-Io"));
        o c10 = h8.c(new Callable() { // from class: nd.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                q qVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                g1 g1Var2 = g1Var;
                g9.n nVar2 = nVar;
                synchronized (q.class) {
                    try {
                        WeakReference weakReference = q.f21279c;
                        if (weakReference != null) {
                            qVar = (q) weakReference.get();
                        } else {
                            qVar = null;
                        }
                        if (qVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            q qVar2 = new q(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (qVar2) {
                                qVar2.f21280a = u0.g(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            q.f21279c = new WeakReference(qVar2);
                            qVar = qVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new s(firebaseMessaging, g1Var2, qVar, nVar2, context3, scheduledThreadPoolExecutor3);
            }
        }, scheduledThreadPoolExecutor2);
        this.f15604h = c10;
        c10.f(scheduledThreadPoolExecutor, new nd.i(this, 0));
        final int i10 = 1;
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: nd.h

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f21255v;

            {
                this.f21255v = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ib.o d2;
                int i102;
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f21255v;
                        if (firebaseMessaging.e.c() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f15605j) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f21255v;
                        Context context3 = firebaseMessaging2.f15599b;
                        v.f(context3);
                        g9.n nVar2 = firebaseMessaging2.f15600c;
                        boolean f10 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences e = v.e(context3);
                            if (!e.contains("proxy_retention") || e.getBoolean("proxy_retention", false) != f10) {
                                ba.b bVar4 = (ba.b) nVar2.f17680x;
                                if (bVar4.f3118c.t() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f10);
                                    ba.q c102 = ba.q.c(bVar4.f3117b);
                                    synchronized (c102) {
                                        i102 = c102.f3157u;
                                        c102.f3157u = i102 + 1;
                                    }
                                    d2 = c102.d(new ba.o(i102, 4, bundle, 0));
                                } else {
                                    d2 = h8.d(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                d2.f(new d5.c(0), new m(context3, f10));
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f15597m == null) {
                    f15597m = new ScheduledThreadPoolExecutor(1, new a("TAG"));
                }
                f15597m.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized i c(Context context) {
        i iVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f15595k == null) {
                    f15595k = new i(context);
                }
                iVar = f15595k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            y.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        o oVar;
        r d2 = d();
        if (!h(d2)) {
            return d2.f14879a;
        }
        String i = g1.i(this.f15598a);
        nd.g gVar = this.f15601d;
        synchronized (gVar) {
            oVar = (o) ((n.e) gVar.f21253b).get(i);
            if (oVar != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + i);
                }
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + i);
                }
                n nVar = this.f15600c;
                oVar = nVar.o(nVar.x(g1.i((g) nVar.f17678v), new Bundle(), "*")).n(this.f15603g, new e7.c(1, this, i, d2)).h((Executor) gVar.f21252a, new e7.d(gVar, 5, i));
                ((n.e) gVar.f21253b).put(i, oVar);
            }
        }
        try {
            return (String) h8.a(oVar);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final r d() {
        String d2;
        r b10;
        i c10 = c(this.f15599b);
        g gVar = this.f15598a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f3178b)) {
            d2 = "";
        } else {
            d2 = gVar.d();
        }
        String i = g1.i(this.f15598a);
        synchronized (c10) {
            b10 = r.b(((SharedPreferences) c10.f19569v).getString(d2 + "|T|" + i + "|*", null));
        }
        return b10;
    }

    public final void e() {
        o d2;
        int i;
        ba.b bVar = (ba.b) this.f15600c.f17680x;
        if (bVar.f3118c.t() >= 241100000) {
            q c10 = q.c(bVar.f3117b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (c10) {
                i = c10.f3157u;
                c10.f3157u = i + 1;
            }
            d2 = c10.d(new ba.o(i, 5, bundle, 1)).g(h.f3130w, ba.d.f3124w);
        } else {
            d2 = h8.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        d2.f(this.f15602f, new nd.i(this, 1));
    }

    public final boolean f() {
        String notificationDelegate;
        Context context = this.f15599b;
        v.f(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "GMS core is set for proxying");
                    }
                    if (this.f15598a.b(fc.b.class) == null) {
                        if (v.d() && f15596l != null) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            } else {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public final synchronized void g(long j10) {
        b(new hz(this, Math.min(Math.max(30L, 2 * j10), 28800L)), j10);
        this.f15605j = true;
    }

    public final boolean h(r rVar) {
        if (rVar != null) {
            String g8 = this.i.g();
            if (System.currentTimeMillis() <= rVar.f14881c + 604800000 && g8.equals(rVar.f14880b)) {
                return false;
            }
            return true;
        }
        return true;
    }
}

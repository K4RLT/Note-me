package oc;
import x.o;
import q.x;

import android.content.Context;
import android.util.Log;
import c0.z;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import wa.h8;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21917a;

    /* renamed from: b, reason: collision with root package name */
    public final z f21918b;

    /* renamed from: c, reason: collision with root package name */
    public final j6.c f21919c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21920d;
    public i0.m e;

    /* renamed from: f, reason: collision with root package name */
    public i0.m f21921f;

    /* renamed from: g, reason: collision with root package name */
    public n f21922g;

    /* renamed from: h, reason: collision with root package name */
    public final w f21923h;
    public final tc.c i;

    /* renamed from: j, reason: collision with root package name */
    public final kc.a f21924j;

    /* renamed from: k, reason: collision with root package name */
    public final kc.a f21925k;

    /* renamed from: l, reason: collision with root package name */
    public final ExecutorService f21926l;

    /* renamed from: m, reason: collision with root package name */
    public final nd.o f21927m;

    /* renamed from: n, reason: collision with root package name */
    public final j f21928n;

    /* renamed from: o, reason: collision with root package name */
    public final lc.b f21929o;

    /* renamed from: p, reason: collision with root package name */
    public final ic.c f21930p;

    public q(bc.g gVar, w wVar, lc.b bVar, z zVar, kc.a aVar, kc.a aVar2, tc.c cVar, ExecutorService executorService, j jVar, ic.c cVar2) {
        this.f21918b = zVar;
        gVar.a();
        this.f21917a = gVar.f3177a;
        this.f21923h = wVar;
        this.f21929o = bVar;
        this.f21924j = aVar;
        this.f21925k = aVar2;
        this.f21926l = executorService;
        this.i = cVar;
        this.f21927m = new nd.o(executorService, 7);
        this.f21928n = jVar;
        this.f21930p = cVar2;
        this.f21920d = System.currentTimeMillis();
        this.f21919c = new j6.c(17);
    }

    public static ib.o a(q qVar, lw lwVar) {
        ib.o d2;
        p pVar;
        nd.o oVar = qVar.f21927m;
        if (Boolean.TRUE.equals(((ThreadLocal) oVar.f21274x).get())) {
            qVar.e.g();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    qVar.f21924j.c(new o(qVar));
                    qVar.f21922g.g();
                    if (!lwVar.c().f27534b.f5940a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        d2 = h8.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        pVar = new p(qVar, 0);
                    } else {
                        if (!qVar.f21922g.d(lwVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        d2 = qVar.f21922g.h(((ib.h) ((AtomicReference) lwVar.C).get()).f18363a);
                        pVar = new p(qVar, 0);
                    }
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                    d2 = h8.d(e);
                    pVar = new p(qVar, 0);
                }
                oVar.t(pVar);
                return d2;
            } catch (Throwable th) {
                oVar.t(new p(qVar, 0));
                throw th;
            }
        }
        x.o("Not running on background worker thread as intended.");
        return null;
    }

    public final void b(lw lwVar) {
        Future<?> submit = this.f21926l.submit(new iv1(23, this, lwVar, false));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e8) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e8);
        } catch (TimeoutException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e10);
        }
    }
}

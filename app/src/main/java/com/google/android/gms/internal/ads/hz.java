package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class hz implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6931u;

    /* renamed from: v, reason: collision with root package name */
    public final long f6932v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f6933w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f6934x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f6935y;

    public hz(FirebaseMessaging firebaseMessaging, long j10) {
        this.f6931u = 2;
        this.f6935y = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ma.a("firebase-iid-executor"));
        this.f6934x = firebaseMessaging;
        this.f6932v = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f15599b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f6933w = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f6934x).f15599b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public boolean b() {
        try {
            if (((FirebaseMessaging) this.f6934x).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() == null) {
                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                throw e;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6931u) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put("src", (String) this.f6933w);
                hashMap.put("cachedSrc", (String) this.f6934x);
                hashMap.put("totalDuration", Long.toString(this.f6932v));
                ((jz) this.f6935y).n(hashMap);
                return;
            case 1:
                f9.k.C.f16819k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6932v;
                boolean booleanValue = ((Boolean) ym.f12911a.p()).booleanValue();
                Bundle bundle = (Bundle) this.f6935y;
                qn0 qn0Var = (qn0) this.f6934x;
                if (booleanValue) {
                    String canonicalName = qn0Var.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = "";
                    }
                    StringBuilder sb2 = new StringBuilder(canonicalName.length() + 25 + String.valueOf(elapsedRealtime).length());
                    sb2.append("Signal runtime (ms) : ");
                    sb2.append(canonicalName);
                    sb2.append(" = ");
                    sb2.append(elapsedRealtime);
                    k9.a0.k(sb2.toString());
                }
                nl nlVar = sl.J2;
                g9.r rVar = g9.r.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    if (((Boolean) rVar.f17698c.a(sl.P2)).booleanValue()) {
                        synchronized (((tw) this.f6933w)) {
                            int zzb = qn0Var.zzb();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(zzb).length() + 3);
                            sb3.append("sig");
                            sb3.append(zzb);
                            bundle.putLong(sb3.toString(), elapsedRealtime);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f6933w;
                nd.o j10 = nd.o.j();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f6934x;
                if (j10.l(firebaseMessaging.f15599b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f15605j = true;
                        }
                        if (!firebaseMessaging.i.l()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.f15605j = false;
                            }
                            if (!nd.o.j().l(firebaseMessaging.f15599b)) {
                                return;
                            }
                        } else if (nd.o.j().k(firebaseMessaging.f15599b) && !a()) {
                            hg hgVar = new hg(12);
                            hgVar.f6806b = this;
                            hgVar.a();
                            if (!nd.o.j().l(firebaseMessaging.f15599b)) {
                                return;
                            }
                        } else {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.f15605j = false;
                                }
                            } else {
                                firebaseMessaging.g(this.f6932v);
                            }
                            if (!nd.o.j().l(firebaseMessaging.f15599b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f15605j = false;
                            if (!nd.o.j().l(firebaseMessaging.f15599b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (nd.o.j().l(firebaseMessaging.f15599b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            default:
                oc.n nVar = (oc.n) this.f6935y;
                oc.s sVar = nVar.f21910n;
                if (sVar == null || !sVar.e.get()) {
                    long j11 = this.f6932v / 1000;
                    String e8 = nVar.e();
                    if (e8 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    g9.n nVar2 = nVar.f21909m;
                    Throwable th2 = (Throwable) this.f6933w;
                    Thread thread = (Thread) this.f6934x;
                    nVar2.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(e8);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    nVar2.t(th2, thread, e8, "error", j11, false);
                    return;
                }
                return;
        }
    }

    public hz(jz jzVar, String str, String str2, long j10) {
        this.f6931u = 0;
        this.f6933w = str;
        this.f6934x = str2;
        this.f6932v = j10;
        this.f6935y = jzVar;
    }

    public /* synthetic */ hz(tw twVar, long j10, qn0 qn0Var, Bundle bundle) {
        this.f6931u = 1;
        this.f6933w = twVar;
        this.f6932v = j10;
        this.f6934x = qn0Var;
        this.f6935y = bundle;
    }

    public hz(oc.n nVar, long j10, Throwable th, Thread thread) {
        this.f6931u = 3;
        this.f6935y = nVar;
        this.f6932v = j10;
        this.f6933w = th;
        this.f6934x = thread;
    }
}

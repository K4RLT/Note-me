package nd;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import b0.g1;
import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements Runnable {
    public static Boolean A;
    public static Boolean B;

    /* renamed from: z, reason: collision with root package name */
    public static final Object f21295z = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final Context f21296u;

    /* renamed from: v, reason: collision with root package name */
    public final g1 f21297v;

    /* renamed from: w, reason: collision with root package name */
    public final PowerManager.WakeLock f21298w;

    /* renamed from: x, reason: collision with root package name */
    public final s f21299x;

    /* renamed from: y, reason: collision with root package name */
    public final long f21300y;

    public u(s sVar, Context context, g1 g1Var, long j10) {
        this.f21299x = sVar;
        this.f21296u = context;
        this.f21300y = j10;
        this.f21297v = g1Var;
        this.f21298w = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f21295z) {
            try {
                Boolean bool = B;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                B = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z3;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z3;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f21295z) {
            try {
                Boolean bool = A;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                A = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public final synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z3;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f21296u.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z3 = true;
                }
            }
            z3 = false;
        } catch (Throwable th) {
            throw th;
        }
        return z3;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f21299x;
        Context context = this.f21296u;
        boolean c10 = c(context);
        PowerManager.WakeLock wakeLock = this.f21298w;
        if (c10) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    sVar.e(true);
                    if (!this.f21297v.l()) {
                        sVar.e(false);
                        if (c(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (a(context) && !d()) {
                        new t(this, this).a();
                        if (c(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused2) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (sVar.g()) {
                        sVar.e(false);
                    } else {
                        sVar.h(this.f21300y);
                    }
                    if (c(context)) {
                        wakeLock.release();
                    }
                } catch (RuntimeException unused3) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                sVar.e(false);
                if (c(context)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}

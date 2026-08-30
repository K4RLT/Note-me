package ba;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.lt0;
import com.google.android.gms.internal.ads.su1;
import com.google.android.gms.internal.ads.tu1;
import com.google.android.gms.internal.ads.x21;
import com.google.android.gms.internal.ads.ys1;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import eb.d0;
import eb.k3;
import eb.n2;
import eb.o3;
import eb.u;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import wa.h8;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3137u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3138v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f3139w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3140x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3141y;

    public /* synthetic */ k(Context context, boolean z3, ys1 ys1Var, tu1 tu1Var) {
        this.f3137u = 1;
        this.f3138v = context;
        this.f3139w = z3;
        this.f3140x = ys1Var;
        this.f3141y = tu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent;
        int i;
        su1 su1Var;
        PlaybackSession createPlaybackSession;
        LogSessionId sessionId;
        boolean equals;
        k3 k3Var;
        eb.d dVar;
        LogSessionId unused;
        switch (this.f3137u) {
            case 0:
                Intent intent2 = (Intent) this.f3140x;
                Context context = (Context) this.f3138v;
                boolean z3 = this.f3139w;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f3141y;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Executor executor = null;
                    if (parcelableExtra instanceof Intent) {
                        intent = (Intent) parcelableExtra;
                    } else {
                        intent = null;
                    }
                    if (intent != null) {
                        i = FirebaseInstanceIdReceiver.a(intent);
                    } else {
                        int i10 = 500;
                        if (intent2.getExtras() != null) {
                            a aVar = new a(intent2);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f15594b;
                                    if (softReference != null) {
                                        executor = (Executor) softReference.get();
                                    }
                                    if (executor == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ma.a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f15594b = new SoftReference(executor);
                                    }
                                } finally {
                                }
                            }
                            executor.execute(new j(0, context, aVar, countDownLatch));
                            try {
                                i10 = ((Integer) h8.a(new nd.g(context).b(intent2))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e8) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e8.toString()));
                            }
                        }
                        i = i10;
                    }
                    if (z3 && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
            case 1:
                Context context2 = (Context) this.f3138v;
                MediaMetricsManager g8 = a7.i.g(context2.getSystemService("media_metrics"));
                if (g8 != null) {
                    createPlaybackSession = g8.createPlaybackSession();
                    su1Var = new su1(context2, createPlaybackSession);
                } else {
                    su1Var = null;
                }
                if (su1Var == null) {
                    x21.F("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (this.f3139w) {
                    ((ys1) this.f3140x).V1(su1Var);
                }
                tu1 tu1Var = (tu1) this.f3141y;
                sessionId = su1Var.f11172x.getSessionId();
                synchronized (tu1Var) {
                    lt0 lt0Var = tu1Var.f11452b;
                    if (lt0Var != null) {
                        LogSessionId logSessionId = (LogSessionId) lt0Var.f8135v;
                        unused = LogSessionId.LOG_SESSION_ID_NONE;
                        equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                        b80.K(equals);
                        lt0Var.f8135v = sessionId;
                    } else {
                        throw null;
                    }
                }
                return;
            case 2:
                o3 o3Var = (o3) this.f3140x;
                n2 n2Var = (n2) this.f3141y;
                d0 d0Var = n2Var.f16280y;
                if (d0Var == null) {
                    n2Var.f().A.g("Discarding data. Failed to set user property");
                    return;
                }
                if (this.f3139w) {
                    k3Var = null;
                } else {
                    k3Var = (k3) this.f3138v;
                }
                n2Var.C(d0Var, k3Var, o3Var);
                n2Var.O();
                return;
            case 3:
                u uVar = (u) this.f3138v;
                o3 o3Var2 = (o3) this.f3140x;
                n2 n2Var2 = (n2) this.f3141y;
                d0 d0Var2 = n2Var2.f16280y;
                if (d0Var2 == null) {
                    n2Var2.f().A.g("Discarding data. Failed to send event to service");
                    return;
                }
                if (this.f3139w) {
                    uVar = null;
                }
                n2Var2.C(d0Var2, uVar, o3Var2);
                n2Var2.O();
                return;
            default:
                o3 o3Var3 = (o3) this.f3140x;
                n2 n2Var3 = (n2) this.f3141y;
                d0 d0Var3 = n2Var3.f16280y;
                if (d0Var3 == null) {
                    n2Var3.f().A.g("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                if (this.f3139w) {
                    dVar = null;
                } else {
                    dVar = (eb.d) this.f3138v;
                }
                n2Var3.C(d0Var3, dVar, o3Var3);
                n2Var3.O();
                return;
        }
    }

    public /* synthetic */ k(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z3, BroadcastReceiver.PendingResult pendingResult) {
        this.f3137u = 0;
        this.f3140x = intent;
        this.f3138v = context;
        this.f3139w = z3;
        this.f3141y = pendingResult;
    }

    public /* synthetic */ k(n2 n2Var, o3 o3Var, boolean z3, ga.a aVar, int i) {
        this.f3137u = i;
        this.f3140x = o3Var;
        this.f3139w = z3;
        this.f3138v = aVar;
        this.f3141y = n2Var;
    }

    public k(n2 n2Var, o3 o3Var, boolean z3, eb.d dVar, eb.d dVar2) {
        this.f3137u = 4;
        this.f3140x = o3Var;
        this.f3139w = z3;
        this.f3138v = dVar;
        this.f3141y = n2Var;
    }
}

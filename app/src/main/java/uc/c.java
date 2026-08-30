package uc;

import android.os.SystemClock;
import android.util.Log;
import ib.h;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k8.d;
import k8.g;
import n8.p;
import oc.y;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f27167a;

    /* renamed from: b, reason: collision with root package name */
    public final double f27168b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27169c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27170d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f27171f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f27172g;

    /* renamed from: h, reason: collision with root package name */
    public final p f27173h;
    public final j6.c i;

    /* renamed from: j, reason: collision with root package name */
    public int f27174j;

    /* renamed from: k, reason: collision with root package name */
    public long f27175k;

    public c(p pVar, vc.a aVar, j6.c cVar) {
        double d2 = aVar.f27536d;
        double d10 = aVar.e;
        this.f27167a = d2;
        this.f27168b = d10;
        this.f27169c = aVar.f27537f * 1000;
        this.f27173h = pVar;
        this.i = cVar;
        this.f27170d = SystemClock.elapsedRealtime();
        int i = (int) d2;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f27171f = arrayBlockingQueue;
        this.f27172g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f27174j = 0;
        this.f27175k = 0L;
    }

    public final int a() {
        int max;
        if (this.f27175k == 0) {
            this.f27175k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f27175k) / this.f27169c);
        int size = this.f27171f.size();
        int i = this.f27174j;
        if (size == this.e) {
            max = Math.min(100, i + currentTimeMillis);
        } else {
            max = Math.max(0, i - currentTimeMillis);
        }
        if (this.f27174j != max) {
            this.f27174j = max;
            this.f27175k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(final oc.a aVar, final h hVar) {
        final boolean z3;
        String str = "Sending report through Google DataTransport: " + aVar.f21868b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.f27170d < 2000) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f27173h.a(new k8.a(aVar.f21867a, d.f19628w, null), new g() { // from class: uc.b
            @Override // k8.g
            public final void a(Exception exc) {
                h hVar2 = hVar;
                if (exc != null) {
                    hVar2.c(exc);
                    return;
                }
                if (z3) {
                    boolean z9 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new b6.g(c.this, 20, countDownLatch)).start();
                    ExecutorService executorService = y.f21955a;
                    boolean z10 = false;
                    try {
                        long j10 = 2000000000;
                        long nanoTime = System.nanoTime() + 2000000000;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(j10, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    j10 = nanoTime - System.nanoTime();
                                    z10 = true;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (z9) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z9 = z10;
                    }
                }
                hVar2.d(aVar);
            }
        });
    }
}

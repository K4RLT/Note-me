package b6;
import c.h;
import c.o;
import f.a;
import p.e;
import q.a;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.graphics.RenderQueue;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b8.b7;
import c.g0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.ads.l3;
import g5.d0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import p7.y;
import q.x;
import wa.k6;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1734u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1735v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1736w;

    public /* synthetic */ g(Object obj, int i, Object obj2) {
        this.f1734u = i;
        this.f1735v = obj;
        this.f1736w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        gd.a aVar;
        List historicalProcessExitReasons;
        long timestamp;
        long timestamp2;
        int reason;
        boolean z3;
        String str;
        InputStream traceInputStream;
        int i = 0;
        boolean z9 = true;
        switch (this.f1734u) {
            case 0:
                h hVar = (h) this.f1735v;
                j6.j jVar = (j6.j) this.f1736w;
                synchronized (hVar.f1746k) {
                    try {
                        ArrayList arrayList = hVar.f1745j;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList.get(i10);
                            i10++;
                            ((c) obj2).e(jVar, false);
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                v vVar = (v) this.f1735v;
                ac.b bVar = (ac.b) this.f1736w;
                if (vVar.K.f19962u instanceof l6.a) {
                    bVar.cancel(true);
                    return;
                }
                return;
            case 2:
                o oVar = (o) this.f1735v;
                g0 g0Var = (g0) this.f1736w;
                int i11 = o.N;
                oVar.f16650u.a(new h(g0Var, i, oVar));
                return;
            case 3:
                ((j6.c) ((nd.o) this.f1735v).f21272v).j((n) this.f1736w, 3);
                return;
            case 4:
                Handler handler = (Handler) this.f1735v;
                Thread thread = (Thread) this.f1736w;
                while (true) {
                    try {
                        d7.d.f15769b = false;
                        handler.post(new c2.m(1));
                        long j10 = 250;
                        Thread.sleep(250L);
                        if (!d7.d.f15769b) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            int i12 = 0;
                            while (!d7.d.f15769b && i12 < 4) {
                                i12++;
                                StackTraceElement[] stackTrace = thread.getStackTrace();
                                stackTrace.getClass();
                                String q10 = qe.k.q(stackTrace, new b7(14), 30);
                                Log.w("PERF_STALL", "main bloqueado " + ((SystemClock.uptimeMillis() - uptimeMillis) + j10) + " ms (foto " + i12 + "):\n" + q10);
                                Thread.sleep(400L);
                                j10 = j10;
                            }
                            long j11 = j10;
                            while (!d7.d.f15769b) {
                                Thread.sleep(100L);
                            }
                            Log.w("PERF_STALL", "main liberado tras ~" + ((SystemClock.uptimeMillis() - uptimeMillis) + j11) + " ms");
                        }
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            case 5:
                k6.a((f1.d) this.f1735v, (LongSparseArray) this.f1736w);
                return;
            case 6:
                RenderQueue.b((RenderQueue.Request) this.f1735v, (RenderQueue) this.f1736w);
                return;
            case 7:
                RenderQueue.a((RenderQueue) this.f1735v, (df.a) this.f1736w);
                return;
            case 8:
                Runnable runnable = (Runnable) this.f1735v;
                d0 d0Var = (d0) this.f1736w;
                try {
                    runnable.run();
                    return;
                } finally {
                    d0Var.a();
                }
            case 9:
                List<g6.b> list = (List) this.f1735v;
                h6.e eVar = (h6.e) this.f1736w;
                for (g6.b bVar2 : list) {
                    Object obj3 = eVar.e;
                    g6.c cVar = bVar2.f17553a;
                    if (cVar.c(obj3)) {
                        obj = new f6.b(cVar.a());
                    } else {
                        obj = f6.a.f16757a;
                    }
                    rf.t tVar = bVar2.f17554b;
                    tVar.getClass();
                    tVar.e(obj);
                }
                return;
            case 10:
                ((l3) this.f1735v).l((Typeface) this.f1736w);
                return;
            case 11:
                ic.p pVar = (ic.p) this.f1735v;
                gd.b bVar3 = (gd.b) this.f1736w;
                if (pVar.f18421b == ic.p.f18419d) {
                    synchronized (pVar) {
                        aVar = pVar.f18420a;
                        pVar.f18420a = null;
                        pVar.f18421b = bVar3;
                    }
                    aVar.i(bVar3);
                    return;
                }
                x.o("provide() can be called only once.");
                return;
            case 12:
                ic.o oVar2 = (ic.o) this.f1735v;
                gd.b bVar4 = (gd.b) this.f1736w;
                synchronized (oVar2) {
                    try {
                        if (oVar2.f18417b == null) {
                            oVar2.f18416a.add(bVar4);
                        } else {
                            oVar2.f18417b.add(bVar4.get());
                        }
                    } finally {
                    }
                }
                return;
            case 13:
                jc.a aVar2 = (jc.a) this.f1735v;
                Runnable runnable2 = (Runnable) this.f1736w;
                Process.setThreadPriority(aVar2.f19125c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f19126d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 14:
                Callable callable = (Callable) this.f1735v;
                jc.h hVar2 = (jc.h) ((ic.c) this.f1736w).f18393v;
                try {
                    hVar2.l(callable.call());
                    return;
                } catch (Exception e) {
                    hVar2.m(e);
                    return;
                }
            case 15:
                k6.q qVar = (k6.q) this.f1735v;
                l6.j jVar2 = (l6.j) this.f1736w;
                if (!(qVar.f19575u.f19962u instanceof l6.a)) {
                    jVar2.m(qVar.f19578x.getForegroundInfoAsync());
                    return;
                } else {
                    jVar2.cancel(true);
                    return;
                }
            case 16:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f1735v;
                ac.b bVar5 = (ac.b) this.f1736w;
                synchronized (constraintTrackingWorker.f1134z) {
                    try {
                        boolean z10 = constraintTrackingWorker.A;
                        l6.j jVar3 = constraintTrackingWorker.B;
                        if (z10) {
                            jVar3.getClass();
                            String str2 = n6.a.f21151a;
                            jVar3.j(new Object());
                        } else {
                            jVar3.m(bVar5);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 17:
                nd.j jVar4 = (nd.j) this.f1735v;
                ib.h hVar3 = (ib.h) this.f1736w;
                try {
                    hVar3.b(jVar4.f());
                    return;
                } catch (Exception e8) {
                    hVar3.a(e8);
                    return;
                }
            case 18:
                Context context = (Context) this.f1735v;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f1736w;
                String str3 = "";
                try {
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(context.getPackageName(), 0, 5);
                    historicalProcessExitReasons.getClass();
                    long j12 = sharedPreferences.getLong("last_native_exit_ts", 0L);
                    Iterator it = historicalProcessExitReasons.iterator();
                    int i13 = 0;
                    long j13 = j12;
                    while (it.hasNext()) {
                        ApplicationExitInfo e10 = com.google.android.gms.internal.mlkit_vision_digital_ink.e(it.next());
                        timestamp = e10.getTimestamp();
                        if (timestamp > j12) {
                            timestamp2 = e10.getTimestamp();
                            if (timestamp2 > j13) {
                                j13 = e10.getTimestamp();
                            }
                            reason = e10.getReason();
                            if (reason == 5) {
                                try {
                                    traceInputStream = e10.getTraceInputStream();
                                } catch (Throwable unused2) {
                                }
                                if (traceInputStream != null) {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream, mf.a.f20798a), 8192);
                                    try {
                                        char[] cArr = new char[65536];
                                        int read = bufferedReader.read(cArr);
                                        if (read > 0) {
                                            z3 = z9;
                                            try {
                                                str = new String(cArr, 0, read);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                Throwable th3 = th;
                                                try {
                                                    throw th3;
                                                    break;
                                                } catch (Throwable th4) {
                                                    pa.a(bufferedReader, th3);
                                                    throw th4;
                                                    break;
                                                }
                                            }
                                        } else {
                                            z3 = z9;
                                            str = "";
                                        }
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable unused3) {
                                        }
                                        if (str != null && mf.f.n(str, "libink")) {
                                            i13++;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        z3 = z9;
                                    }
                                }
                                z3 = z9;
                                str = null;
                                if (str != null) {
                                    i13++;
                                }
                            } else {
                                z3 = z9;
                            }
                            z9 = z3;
                        }
                    }
                    boolean z11 = z9;
                    if (j13 > j12) {
                        sharedPreferences.edit().putLong("last_native_exit_ts", j13).apply();
                    }
                    if (i13 > 0) {
                        int i14 = sharedPreferences.getInt("ink_fatal_count", 0) + i13;
                        sharedPreferences.edit().putInt("ink_fatal_count", i14).apply();
                        if (i14 >= 2) {
                            y.f22609b = z11;
                        }
                        if (y.f22609b) {
                            str3 = " — Ink VETADO";
                        }
                        Log.w("InkCrashGuard", "muerte(s) NATIVA(s) previas por libink: +" + i13 + " → " + i14 + str3);
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
            case 19:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f1735v;
                JobParameters jobParameters = (JobParameters) this.f1736w;
                int i15 = JobInfoSchedulerService.f4210u;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            default:
                uc.c cVar2 = (uc.c) this.f1735v;
                CountDownLatch countDownLatch = (CountDownLatch) this.f1736w;
                try {
                    n8.a().f21204d.a(cVar2.f27173h.f21197a.b(k8.d.f19628w), 1);
                } catch (Exception unused5) {
                }
                countDownLatch.countDown();
                return;
        }
    }
}

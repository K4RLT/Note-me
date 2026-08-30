package com.google.android.gms.internal.ads;
import g9.r;
import r.e;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class xx {

    /* renamed from: a, reason: collision with root package name */
    public static final wx f12651a;

    /* renamed from: b, reason: collision with root package name */
    public static final wx f12652b;

    /* renamed from: c, reason: collision with root package name */
    public static final wx f12653c;

    /* renamed from: d, reason: collision with root package name */
    public static final ux f12654d;
    public static final c91 e;

    /* renamed from: f, reason: collision with root package name */
    public static final wx f12655f;

    /* renamed from: g, reason: collision with root package name */
    public static final ExecutorService f12656g;

    /* renamed from: h, reason: collision with root package name */
    public static final wx f12657h;

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.ux, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor] */
    static {
        ThreadPoolExecutor threadPoolExecutor;
        nl nlVar = sl.Hc;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (qlVar.b(nlVar) != null && ((Boolean) qlVar2.b(nlVar)).booleanValue()) {
            nl nlVar2 = sl.Ic;
            if (qlVar2.b(nlVar2) != null) {
                nl nlVar3 = sl.Jc;
                if (qlVar2.b(nlVar3) != null) {
                    threadPoolExecutor = new ThreadPoolExecutor(((Integer) qlVar2.b(nlVar2)).intValue(), ((Integer) qlVar2.b(nlVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new vx("Default", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) qlVar2.b(nlVar3)).booleanValue());
                    f12651a = new wx((Executor) threadPoolExecutor);
                    LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                    vx vxVar = new vx("Loader", 0);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, linkedBlockingQueue, vxVar);
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    f12652b = new wx((Executor) threadPoolExecutor2);
                    ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new vx("Activeview", 0));
                    threadPoolExecutor3.allowCoreThreadTimeOut(true);
                    f12653c = new wx((Executor) threadPoolExecutor3);
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(3, new vx("Schedule", 0));
                    f12654d = scheduledThreadPoolExecutor;
                    e = new c91(scheduledThreadPoolExecutor);
                    f12655f = new wx(new i0());
                    f12656g = Executors.newSingleThreadExecutor(new vx("AdQualityMetrics", 0));
                    f12657h = new wx(o81.f9033u);
                }
            }
        }
        threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new vx("Default", 0));
        f12651a = new wx((Executor) threadPoolExecutor);
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        vx vxVar2 = new vx("Loader", 0);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor22 = new ThreadPoolExecutor(5, 5, 10L, timeUnit2, linkedBlockingQueue2, vxVar2);
        threadPoolExecutor22.allowCoreThreadTimeOut(true);
        f12652b = new wx((Executor) threadPoolExecutor22);
        ThreadPoolExecutor threadPoolExecutor32 = new ThreadPoolExecutor(1, 1, 10L, timeUnit2, new LinkedBlockingQueue(), new vx("Activeview", 0));
        threadPoolExecutor32.allowCoreThreadTimeOut(true);
        f12653c = new wx((Executor) threadPoolExecutor32);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(3, new vx("Schedule", 0));
        f12654d = scheduledThreadPoolExecutor2;
        e = new c91(scheduledThreadPoolExecutor2);
        f12655f = new wx(new i0());
        f12656g = Executors.newSingleThreadExecutor(new vx("AdQualityMetrics", 0));
        f12657h = new wx(o81.f9033u);
    }
}

package com.google.android.gms.internal.consent_sdk;
import g3.a;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c0 implements Executor {

    /* renamed from: v, reason: collision with root package name */
    public final ThreadPoolExecutor f13377v;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicInteger f13376u = new AtomicInteger(1);

    /* renamed from: w, reason: collision with root package name */
    public WeakReference f13378w = new WeakReference(null);

    public c0() {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.google.android.gms.internal.consent_sdk.b0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                c0 c0Var = c0.this;
                Thread thread = new Thread(runnable, g3.a.g(c0Var.f13376u.getAndIncrement(), "Google consent worker #"));
                c0Var.f13378w = new WeakReference(thread);
                return thread;
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        this.f13377v = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f13378w.get()) {
            runnable.run();
        } else {
            this.f13377v.execute(runnable);
        }
    }
}

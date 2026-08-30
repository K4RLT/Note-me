package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class vw implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12053a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f12054b = new AtomicInteger(1);

    public vw() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f12053a) {
            case 0:
                int andIncrement = this.f12054b.getAndIncrement();
                return new Thread(runnable, a5.a.f(andIncrement, "AdWorker(SCION_TASK_EXECUTOR) #", new StringBuilder(String.valueOf(andIncrement).length() + 31)));
            default:
                int andIncrement2 = this.f12054b.getAndIncrement();
                return new Thread(runnable, a5.a.f(andIncrement2, "AdWorker(NG) #", new StringBuilder(String.valueOf(andIncrement2).length() + 14)));
        }
    }

    public vw(ww wwVar) {
    }
}

package com.google.android.gms.internal.ads;
import a5.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e10 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f5575a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final int f5576b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f5575a.getAndIncrement();
        return new com.facebook.ads.internal.dynamicloading.a(this, runnable, a5.a.f(andIncrement, "AdWorker(WebViewStartup) #", new StringBuilder(String.valueOf(andIncrement).length() + 26)), runnable);
    }
}

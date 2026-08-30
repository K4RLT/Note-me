package com.google.android.gms.internal.measurement;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class k1 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public ThreadFactory f13796a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f13796a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}

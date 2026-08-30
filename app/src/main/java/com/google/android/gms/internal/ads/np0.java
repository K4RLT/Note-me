package com.google.android.gms.internal.ads;
import g5.q;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class np0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8797a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8798b;

    public /* synthetic */ np0() {
        this.f8797a = 1;
        this.f8798b = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f8797a;
        Object obj = this.f8798b;
        switch (i) {
            case 0:
                String str = bq0.f4860a;
                return new Thread(runnable, (String) obj);
            default:
                Thread newThread = ((ThreadFactory) obj).newThread(runnable);
                if (newThread != null) {
                    newThread.setName("punch".concat(String.valueOf(newThread.getName())));
                    return newThread;
                }
                q.h("Default ThreadFactory returned null thread");
                return null;
        }
    }

    public /* synthetic */ np0(String str) {
        this.f8797a = 0;
        this.f8798b = str;
    }
}

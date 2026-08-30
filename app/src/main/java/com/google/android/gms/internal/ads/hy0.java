package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class hy0 implements dy0 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f6926a = Executors.newSingleThreadScheduledExecutor();

    @Override // com.google.android.gms.internal.ads.dy0
    public final void a(Runnable runnable, long j10) {
        this.f6926a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.dy0
    public final void zzb() {
    }
}

package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class px implements Runnable, Delayed {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ox f14823u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f14824v;

    public px(c cVar, ox oxVar) {
        this.f14823u = oxVar;
        this.f14824v = cVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return 0;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return 0L;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.g(this.f14824v, this.f14823u);
    }
}

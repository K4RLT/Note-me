package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class f50 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5934a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f5935b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f5936c = true;

    public f50(wx wxVar, ScheduledExecutorService scheduledExecutorService, hr0 hr0Var) {
        this.f5934a = wxVar;
        this.f5935b = scheduledExecutorService;
    }
}

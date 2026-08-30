package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class hm {

    /* renamed from: a, reason: collision with root package name */
    public MotionEvent f6837a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    public MotionEvent f6838b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f6839c;

    public hm(ScheduledExecutorService scheduledExecutorService) {
        this.f6839c = scheduledExecutorService;
    }
}

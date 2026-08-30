package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* loaded from: classes.dex */
public final class n1 extends l1 implements Choreographer$VsyncCallback {

    /* renamed from: y, reason: collision with root package name */
    public final Handler f8509y;

    public /* synthetic */ n1(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f8509y = bq0.p();
    }

    @Override // com.google.android.gms.internal.ads.l1
    public final void a() {
        this.f7917v.registerDisplayListener(this, bq0.p());
        this.f7916u.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.l1
    public final void b() {
        this.f7917v.unregisterDisplayListener(this);
        this.f8509y.removeCallbacksAndMessages(null);
        this.f7916u.removeVsyncCallback(this);
        this.f7918w = -9223372036854775807L;
        this.f7919x = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f7916u.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        long frameTimeNanos;
        Choreographer.FrameTimeline[] frameTimelines;
        long expectedPresentationTimeNanos;
        long expectedPresentationTimeNanos2;
        frameTimeNanos = frameData.getFrameTimeNanos();
        this.f7918w = frameTimeNanos;
        frameTimelines = frameData.getFrameTimelines();
        long j10 = -9223372036854775807L;
        if (frameTimelines.length >= 2) {
            expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos();
            expectedPresentationTimeNanos2 = frameTimelines[0].getExpectedPresentationTimeNanos();
            long j11 = expectedPresentationTimeNanos - expectedPresentationTimeNanos2;
            if (j11 != 0) {
                j10 = j11;
            }
            this.f7919x = j10;
        } else {
            this.f7919x = -9223372036854775807L;
        }
        this.f8509y.postDelayed(new f(3, this), 500L);
    }
}

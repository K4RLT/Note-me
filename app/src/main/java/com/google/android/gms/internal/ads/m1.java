package com.google.android.gms.internal.ads;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class m1 extends l1 implements Choreographer.FrameCallback {
    @Override // com.google.android.gms.internal.ads.l1
    public final void a() {
        long j10;
        this.f7917v.registerDisplayListener(this, bq0.p());
        this.f7916u.postFrameCallback(this);
        if (this.f7917v.getDisplay(0) != null) {
            j10 = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            x21.F("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
        }
        this.f7919x = j10;
    }

    @Override // com.google.android.gms.internal.ads.l1
    public final void b() {
        this.f7917v.unregisterDisplayListener(this);
        this.f7916u.removeFrameCallback(this);
        this.f7918w = -9223372036854775807L;
        this.f7919x = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f7918w = j10;
        this.f7916u.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long j10;
        if (i == 0) {
            this.f7916u.postFrameCallback(this);
            if (this.f7917v.getDisplay(0) != null) {
                j10 = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                x21.F("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j10 = -9223372036854775807L;
            }
            this.f7919x = j10;
        }
    }
}

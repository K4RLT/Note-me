package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class h2 extends nw {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14391c;

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.nw
    public final long c() {
        switch (this.f14391c) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}

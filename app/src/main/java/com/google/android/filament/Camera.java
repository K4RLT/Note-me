package com.google.android.filament;
import d.b;

import q.x;

/* loaded from: classes.dex */
public class Camera {

    /* renamed from: a, reason: collision with root package name */
    public long f4211a;

    private static native void nLookAt(long j10, double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17);

    private static native void nSetExposure(long j10, float f10, float f11, float f12);

    private static native void nSetProjectionFov(long j10, double d2, double d10, double d11, double d12, int i);

    public final long a() {
        long j10 = this.f4211a;
        if (j10 != 0) {
            return j10;
        }
        x.o("Calling method on destroyed Camera");
        return 0L;
    }

    public final void b(double d2, double d10) {
        nLookAt(a(), 0.0d, d2, d10, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d);
    }

    public final void c() {
        nSetExposure(a(), 16.0f, 0.008f, 100.0f);
    }

    public final void d(double d2, double d10) {
        nSetProjectionFov(a(), d2, d10, 0.1d, 100.0d, q0.b(1));
    }
}

package com.google.android.filament;

import q.x;

/* loaded from: classes.dex */
public class IndirectLight {

    /* renamed from: a */
    public long f4220a;

    public static /* bridge */ /* synthetic */ void c(long j10) {
        nDestroyBuilder(j10);
    }

    public static native long nBuilderBuild(long j10, long j11);

    public static native long nCreateBuilder();

    public static native void nDestroyBuilder(long j10);

    public static native void nIntensity(long j10, float f10);

    public static native void nIrradiance(long j10, int i, float[] fArr);

    private static native void nSetIntensity(long j10, float f10);

    public final long f() {
        long j10 = this.f4220a;
        if (j10 != 0) {
            return j10;
        }
        x.o("Calling method on destroyed IndirectLight");
        return 0L;
    }

    public final void g(float f10) {
        nSetIntensity(f(), f10);
    }
}

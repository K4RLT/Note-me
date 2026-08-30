package com.google.android.filament;
import d.c;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import q.x;

/* loaded from: classes.dex */
public class Texture {

    /* renamed from: a, reason: collision with root package name */
    public long f4233a;

    static {
        q0.c(5);
        q0.c(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFormat(long j10, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHeight(long j10, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLevels(long j10, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSampler(long j10, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWidth(long j10, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nGenerateMipmaps(long j10, long j11);

    private static native int nGetHeight(long j10, int i);

    private static native int nGetWidth(long j10, int i);

    public long getNativeObject() {
        long j10 = this.f4233a;
        if (j10 != 0) {
            return j10;
        }
        x.o("Calling method on destroyed Texture");
        return 0L;
    }

    public final void i(Engine engine) {
        nGenerateMipmaps(getNativeObject(), engine.getNativeObject());
    }

    public final int j() {
        return nGetHeight(getNativeObject(), 0);
    }

    public final int k() {
        return nGetWidth(getNativeObject(), 0);
    }
}

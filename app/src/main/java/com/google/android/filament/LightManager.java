package com.google.android.filament;
import d.c;

/* loaded from: classes.dex */
public class LightManager {

    /* renamed from: a, reason: collision with root package name */
    public long f4221a;

    static {
        q0.c(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nBuilderBuild(long j10, long j11, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCastShadows(long j10, boolean z3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderColor(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderDirection(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensity(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderShadowOptions(long j10, int i, int i10, float[] fArr, float f10, float f11, float f12, float f13, float f14, boolean z3, boolean z9, float f15, float f16, boolean z10, int i11, float f17, boolean z11, float f18, float f19, float[] fArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetInstance(long j10, int i);

    private static native void nSetIntensity(long j10, int i, float f10);

    public final int i(int i) {
        return nGetInstance(this.f4221a, i);
    }

    public final void j(int i, float f10) {
        nSetIntensity(this.f4221a, i, f10);
    }
}

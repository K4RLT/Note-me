package com.google.android.filament;
import d.b;
import d.c;

import q.x;

/* loaded from: classes.dex */
public class View {

    /* renamed from: a, reason: collision with root package name */
    public long f4238a;

    /* renamed from: b, reason: collision with root package name */
    public k f4239b;

    /* loaded from: classes.dex */
    public static class InternalOnPickCallback implements Runnable {
        float mDepth;
        float mFragCoordsX;
        float mFragCoordsY;
        float mFragCoordsZ;
        int mRenderable;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    static {
        q0.c(2);
        q0.c(2);
        q0.c(2);
    }

    private static native void nSetAmbientOcclusionOptions(long j10, float f10, float f11, float f12, float f13, float f14, float f15, int i, int i10, int i11, boolean z3, boolean z9, float f16);

    private static native void nSetAntiAliasing(long j10, int i);

    private static native void nSetCamera(long j10, long j11);

    private static native void nSetColorGrading(long j10, long j11);

    private static native void nSetDynamicResolutionOptions(long j10, boolean z3, boolean z9, float f10, float f11, float f12, int i);

    private static native void nSetMultiSampleAntiAliasingOptions(long j10, boolean z3, int i, boolean z9);

    private static native void nSetSSCTOptions(long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i, int i10, boolean z3);

    private static native void nSetScene(long j10, long j11);

    private static native void nSetShadowType(long j10, int i);

    private static native void nSetShadowingEnabled(long j10, boolean z3);

    private static native void nSetViewport(long j10, int i, int i10, int i11, int i12);

    public final long a() {
        long j10 = this.f4238a;
        if (j10 != 0) {
            return j10;
        }
        x.o("Calling method on destroyed View");
        return 0L;
    }

    public final void b(f fVar) {
        nSetAmbientOcclusionOptions(a(), 0.3f, 5.0E-4f, 1.0f, 0.5f, 1.0f, 0.05f, 0, 1, 0, fVar.f4244a, false, 0.0f);
        long a10 = a();
        float[] fArr = fVar.f4245b;
        nSetSSCTOptions(a10, 1.0f, 0.3f, 1.0f, 0.8f, fArr[0], fArr[1], fArr[2], 0.01f, 0.01f, 4, 1, false);
    }

    public final void c(int i) {
        nSetAntiAliasing(a(), q0.b(i));
    }

    public final void d(Camera camera) {
        nSetCamera(a(), camera.a());
    }

    public final void e(ColorGrading colorGrading) {
        long a10 = a();
        long j10 = colorGrading.f4212a;
        if (j10 != 0) {
            nSetColorGrading(a10, j10);
        } else {
            x.o("Calling method on destroyed ColorGrading");
        }
    }

    public final void f(i iVar) {
        nSetDynamicResolutionOptions(a(), iVar.f4249b, iVar.f4250c, iVar.f4248a, 1.0f, 0.9f, q0.b(iVar.f4251d));
    }

    public final void g(j jVar) {
        nSetMultiSampleAntiAliasingOptions(a(), jVar.f4252u, jVar.f4253v, false);
    }

    public final void h(Scene scene) {
        nSetScene(a(), scene.b());
    }

    public final void i() {
        nSetShadowType(a(), q0.b(1));
    }

    public final void j() {
        nSetShadowingEnabled(a(), true);
    }

    public final void k(k kVar) {
        this.f4239b = kVar;
        long a10 = a();
        k kVar2 = this.f4239b;
        kVar2.getClass();
        nSetViewport(a10, 0, 0, kVar2.f4254a, kVar2.f4255b);
    }
}

package com.google.android.filament;

import q.x;

/* loaded from: classes.dex */
public class Renderer {

    /* renamed from: a, reason: collision with root package name */
    public long f4226a;

    /* renamed from: b, reason: collision with root package name */
    public g f4227b;

    /* renamed from: c, reason: collision with root package name */
    public f f4228c;

    private static native boolean nBeginFrame(long j10, long j11, long j12);

    private static native void nEndFrame(long j10);

    private static native void nRender(long j10, long j11);

    private static native void nSetClearOptions(long j10, float f10, float f11, float f12, float f13, boolean z3, boolean z9);

    private static native void nSetDisplayInfo(long j10, float f10);

    public final boolean a(SwapChain swapChain, long j10) {
        long c10 = c();
        long j11 = swapChain.f4232b;
        if (j11 != 0) {
            return nBeginFrame(c10, j11, j10);
        }
        x.o("Calling method on destroyed SwapChain");
        return false;
    }

    public final void b() {
        nEndFrame(c());
    }

    public final long c() {
        long j10 = this.f4226a;
        if (j10 != 0) {
            return j10;
        }
        x.o("Calling method on destroyed Renderer");
        return 0L;
    }

    public final void d(View view) {
        nRender(c(), view.a());
    }

    public final void e(f fVar) {
        this.f4228c = fVar;
        long c10 = c();
        float[] fArr = fVar.f4245b;
        nSetClearOptions(c10, fArr[0], fArr[1], fArr[2], fArr[3], fVar.f4244a, true);
    }

    public final void f(g gVar) {
        this.f4227b = gVar;
        nSetDisplayInfo(c(), gVar.f4247b);
    }
}

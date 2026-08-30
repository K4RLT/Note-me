package com.google.android.filament;

import q.x;

/* loaded from: classes.dex */
public class Scene {

    /* renamed from: a, reason: collision with root package name */
    public long f4229a;

    /* renamed from: b, reason: collision with root package name */
    public IndirectLight f4230b;

    private static native void nAddEntity(long j10, int i);

    private static native void nRemove(long j10, int i);

    private static native void nSetIndirectLight(long j10, long j11);

    public final void a(int i) {
        nAddEntity(b(), i);
    }

    public final long b() {
        long j10 = this.f4229a;
        if (j10 != 0) {
            return j10;
        }
        x.o("Calling method on destroyed Scene");
        return 0L;
    }

    public final void c(int i) {
        nRemove(b(), i);
    }

    public final void d(IndirectLight indirectLight) {
        long j10;
        this.f4230b = indirectLight;
        long b10 = b();
        IndirectLight indirectLight2 = this.f4230b;
        if (indirectLight2 != null) {
            j10 = indirectLight2.f();
        } else {
            j10 = 0;
        }
        nSetIndirectLight(b10, j10);
    }
}

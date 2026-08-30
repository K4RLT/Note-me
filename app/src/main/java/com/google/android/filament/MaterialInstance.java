package com.google.android.filament;
import d.c;

import q.x;

/* loaded from: classes.dex */
public class MaterialInstance {

    /* renamed from: a, reason: collision with root package name */
    public long f4224a;

    static {
        q0.c(4);
    }

    public MaterialInstance(long j10) {
        this.f4224a = j10;
        nGetMaterial(j10);
    }

    private static native long nGetMaterial(long j10);

    private static native void nSetParameterFloat(long j10, String str, float f10);

    private static native void nSetParameterFloat4(long j10, String str, float f10, float f11, float f12, float f13);

    private static native void nSetParameterTexture(long j10, String str, long j11, long j12);

    public final long a() {
        long j10 = this.f4224a;
        if (j10 != 0) {
            return j10;
        }
        x.o("Calling method on destroyed MaterialInstance");
        return 0L;
    }

    public final void b(float f10, float f11, float f12) {
        nSetParameterFloat4(a(), "baseColor", f10, f11, f12, 1.0f);
    }

    public final void c(String str, float f10) {
        nSetParameterFloat(a(), str, f10);
    }

    public final void d(String str, Texture texture, TextureSampler textureSampler) {
        nSetParameterTexture(a(), str, texture.getNativeObject(), textureSampler.f4234a);
    }
}

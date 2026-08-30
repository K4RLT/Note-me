package com.google.android.filament;

/* loaded from: classes.dex */
public class TransformManager {

    /* renamed from: a, reason: collision with root package name */
    public long f4236a;

    private static native int nCreate(long j10, int i);

    private static native int nGetInstance(long j10, int i);

    private static native void nGetTransform(long j10, int i, float[] fArr);

    private static native void nSetTransform(long j10, int i, float[] fArr);

    public final int a(int i) {
        return nCreate(this.f4236a, i);
    }

    public final int b(int i) {
        return nGetInstance(this.f4236a, i);
    }

    public final void c(int i, float[] fArr) {
        if (fArr == null) {
            fArr = new float[16];
        } else if (fArr.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
        nGetTransform(this.f4236a, i, fArr);
    }

    public final void d(int i, float[] fArr) {
        if (fArr.length >= 16) {
            nSetTransform(this.f4236a, i, fArr);
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }
}

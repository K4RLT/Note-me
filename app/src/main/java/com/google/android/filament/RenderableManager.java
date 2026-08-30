package com.google.android.filament;
import d.c;

/* loaded from: classes.dex */
public class RenderableManager {

    /* renamed from: a */
    public long f4225a;

    static {
        q0.c(16);
    }

    public static native void nBuilderBoundingBox(long j10, float f10, float f11, float f12, float f13, float f14, float f15);

    public static native boolean nBuilderBuild(long j10, long j11, int i);

    public static native void nBuilderCastShadows(long j10, boolean z3);

    public static native void nBuilderGeometry(long j10, int i, int i10, long j11, long j12, int i11, int i12);

    public static native void nBuilderMaterial(long j10, int i, long j11);

    public static native void nBuilderReceiveShadows(long j10, boolean z3);

    public static native long nCreateBuilder(int i);

    public static native void nDestroyBuilder(long j10);

    private static native int nGetInstance(long j10, int i);

    private static native long nGetMaterialInstanceAt(long j10, int i, int i10);

    private static native void nSetAxisAlignedBoundingBox(long j10, int i, float f10, float f11, float f12, float f13, float f14, float f15);

    private static native void nSetGeometryAt(long j10, int i, int i10, int i11, long j11, long j12, int i12, int i13);

    public final int i(int i) {
        return nGetInstance(this.f4225a, i);
    }

    public final MaterialInstance j(int i) {
        return new MaterialInstance(nGetMaterialInstanceAt(this.f4225a, i, 0));
    }

    public final void k(int i, j6.c cVar) {
        long j10 = this.f4225a;
        float[] fArr = (float[]) cVar.f18914v;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float[] fArr2 = (float[]) cVar.f18915w;
        nSetAxisAlignedBoundingBox(j10, i, f10, f11, f12, fArr2[0], fArr2[1], fArr2[2]);
    }

    public final void l(int i, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, int i10) {
        nSetGeometryAt(this.f4225a, i, 0, 4, vertexBuffer.g(), indexBuffer.f(), 0, i10);
    }
}

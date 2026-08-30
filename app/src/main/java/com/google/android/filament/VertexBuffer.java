package com.google.android.filament;

import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import q.x;

/* loaded from: classes.dex */
public class VertexBuffer {

    /* renamed from: a */
    public long f4237a;

    public static native void nBuilderAttribute(long j10, int i, int i10, int i11, int i12, int i13);

    public static native void nBuilderBufferCount(long j10, int i);

    public static native long nBuilderBuild(long j10, long j11);

    public static native void nBuilderVertexCount(long j10, int i);

    public static native long nCreateBuilder();

    public static native void nDestroyBuilder(long j10);

    private static native int nSetBufferAt(long j10, long j11, int i, Buffer buffer, int i10, int i11, int i12, Object obj, Runnable runnable);

    public final long g() {
        long j10 = this.f4237a;
        if (j10 != 0) {
            return j10;
        }
        x.o("Calling method on destroyed VertexBuffer");
        return 0L;
    }

    public final void h(Engine engine, ByteBuffer byteBuffer) {
        if (nSetBufferAt(g(), engine.getNativeObject(), 0, byteBuffer, byteBuffer.remaining(), 0, byteBuffer.remaining(), null, null) >= 0) {
        } else {
            throw new BufferOverflowException();
        }
    }
}

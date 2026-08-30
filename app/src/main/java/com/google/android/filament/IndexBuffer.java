package com.google.android.filament;

import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ShortBuffer;
import q.x;

/* loaded from: classes.dex */
public class IndexBuffer {

    /* renamed from: a */
    public long f4219a;

    public static native void nBuilderBufferType(long j10, int i);

    public static native long nBuilderBuild(long j10, long j11);

    public static native void nBuilderIndexCount(long j10, int i);

    public static native long nCreateBuilder();

    public static native void nDestroyBuilder(long j10);

    private static native int nSetBuffer(long j10, long j11, Buffer buffer, int i, int i10, int i11, Object obj, Runnable runnable);

    public final long f() {
        long j10 = this.f4219a;
        if (j10 != 0) {
            return j10;
        }
        x.o("Calling method on destroyed IndexBuffer");
        return 0L;
    }

    public final void g(Engine engine, ShortBuffer shortBuffer) {
        if (nSetBuffer(f(), engine.getNativeObject(), shortBuffer, shortBuffer.remaining(), 0, shortBuffer.remaining(), null, null) >= 0) {
        } else {
            throw new BufferOverflowException();
        }
    }
}

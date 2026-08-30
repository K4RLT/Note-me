package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class yy implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    public final ByteBuffer f13007u;

    public yy(ByteBuffer byteBuffer) {
        this.f13007u = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final int f(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f13007u;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[min];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    public final long j() {
        return this.f13007u.position();
    }
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class es1 {

    /* renamed from: a, reason: collision with root package name */
    public int f5764a;

    /* renamed from: b, reason: collision with root package name */
    public mw1 f5765b;

    /* renamed from: c, reason: collision with root package name */
    public final cs1 f5766c = new cs1();

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f5767d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f5768f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5769g;

    static {
        t5.a("media3.decoder");
    }

    public es1(int i) {
        this.f5769g = i;
    }

    public void a() {
        this.f5764a = 0;
        ByteBuffer byteBuffer = this.f5767d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f5768f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    public final boolean b() {
        return c(1);
    }

    public final boolean c(int i) {
        if ((this.f5764a & i) == i) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        ByteBuffer byteBuffer = this.f5767d;
        if (byteBuffer == null) {
            this.f5767d = g(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i10 = i + position;
        if (capacity >= i10) {
            this.f5767d = byteBuffer;
            return;
        }
        ByteBuffer g8 = g(i10);
        g8.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            g8.put(byteBuffer);
        }
        this.f5767d = g8;
    }

    public final boolean e() {
        return c(1073741824);
    }

    public final void f() {
        ByteBuffer byteBuffer = this.f5767d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f5768f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer g(int i) {
        int capacity;
        int i10 = this.f5769g;
        if (i10 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f5767d;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(capacity).length() + 21 + String.valueOf(i).length() + 1);
        g3.a.r(capacity, i, "Buffer too small (", " < ", sb2);
        sb2.append(")");
        throw new IllegalStateException(sb2.toString());
    }
}

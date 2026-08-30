package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class rw1 extends es1 {

    /* renamed from: h, reason: collision with root package name */
    public long f10326h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f10327j;

    @Override // com.google.android.gms.internal.ads.es1
    public final void a() {
        super.a();
        this.i = 0;
    }

    public final int h() {
        return this.i;
    }

    public final boolean i() {
        return this.i > 0;
    }

    public final boolean j(es1 es1Var) {
        ByteBuffer byteBuffer;
        b80.l(!es1Var.c(1073741824));
        b80.l(!es1Var.c(268435456));
        b80.l(!es1Var.c(4));
        if (i()) {
            if (this.i < this.f10327j) {
                ByteBuffer byteBuffer2 = es1Var.f5767d;
                if (byteBuffer2 != null && (byteBuffer = this.f5767d) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i = this.i;
        this.i = i + 1;
        if (i == 0) {
            this.e = es1Var.e;
            if (es1Var.c(1)) {
                this.f5764a = 1;
            }
        }
        ByteBuffer byteBuffer3 = es1Var.f5767d;
        if (byteBuffer3 != null) {
            d(byteBuffer3.remaining());
            this.f5767d.put(byteBuffer3);
        }
        this.f10326h = es1Var.e;
        return true;
    }
}

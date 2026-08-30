package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class jr1 implements xb {
    public static final lr1 B = lr1.c(jr1.class);
    public yy A;

    /* renamed from: u, reason: collision with root package name */
    public final String f7514u;

    /* renamed from: x, reason: collision with root package name */
    public ByteBuffer f7517x;

    /* renamed from: y, reason: collision with root package name */
    public long f7518y;

    /* renamed from: z, reason: collision with root package name */
    public long f7519z = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7516w = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7515v = true;

    public jr1(String str) {
        this.f7514u = str;
    }

    public final synchronized void a() {
        String str;
        try {
            if (!this.f7516w) {
                try {
                    lr1 lr1Var = B;
                    String str2 = this.f7514u;
                    if (str2.length() != 0) {
                        str = "mem mapping ".concat(str2);
                    } else {
                        str = new String("mem mapping ");
                    }
                    lr1Var.b(str);
                    yy yyVar = this.A;
                    long j10 = this.f7518y;
                    long j11 = this.f7519z;
                    ByteBuffer byteBuffer = yyVar.f13007u;
                    int position = byteBuffer.position();
                    byteBuffer.position((int) j10);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.limit((int) j11);
                    byteBuffer.position(position);
                    this.f7517x = slice;
                    this.f7516w = true;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void b(ByteBuffer byteBuffer);

    public final synchronized void c() {
        String str;
        try {
            a();
            lr1 lr1Var = B;
            String str2 = this.f7514u;
            if (str2.length() != 0) {
                str = "parsing details of ".concat(str2);
            } else {
                str = new String("parsing details of ");
            }
            lr1Var.b(str);
            ByteBuffer byteBuffer = this.f7517x;
            if (byteBuffer != null) {
                this.f7515v = true;
                byteBuffer.rewind();
                b(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f7517x = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.xb
    public final void f(yy yyVar, ByteBuffer byteBuffer, long j10, ub ubVar) {
        this.f7518y = yyVar.j();
        byteBuffer.remaining();
        this.f7519z = j10;
        this.A = yyVar;
        yyVar.f13007u.position((int) (yyVar.j() + j10));
        this.f7516w = false;
        this.f7515v = false;
        c();
    }
}

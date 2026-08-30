package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class dr extends OutputStream {

    /* renamed from: u, reason: collision with root package name */
    public long f14203u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f14204v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sg.g f14205w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ er f14206x;

    public dr(er erVar, long j10, sg.g gVar) {
        this.f14204v = j10;
        this.f14205w = gVar;
        this.f14206x = erVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14206x.f14271d = true;
        long j10 = this.f14204v;
        if (j10 != -1 && this.f14203u < j10) {
            throw new ProtocolException("expected " + j10 + " bytes but received " + this.f14203u);
        }
        this.f14205w.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (this.f14206x.f14271d) {
            return;
        }
        this.f14205w.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) {
        if (!this.f14206x.f14271d) {
            long j10 = i10;
            long j11 = this.f14204v;
            if (j11 != -1 && this.f14203u + j10 > j11) {
                throw new ProtocolException("expected " + j11 + " bytes but received " + this.f14203u + i10);
            }
            this.f14203u += j10;
            try {
                this.f14205w.write(bArr, i, i10);
                return;
            } catch (InterruptedIOException e) {
                throw new SocketTimeoutException(e.getMessage());
            }
        }
        q.x.p("closed");
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }
}

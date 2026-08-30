package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class pw1 implements uw1 {
    public static final ArrayDeque A = new ArrayDeque();
    public static final Object B = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final MediaCodec f9626u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerThread f9627v;

    /* renamed from: w, reason: collision with root package name */
    public nw1 f9628w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f9629x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final qb0 f9630y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9631z;

    public pw1(MediaCodec mediaCodec, HandlerThread handlerThread, qb0 qb0Var) {
        this.f9626u = mediaCodec;
        this.f9627v = handlerThread;
        this.f9630y = qb0Var;
    }

    public static ow1 g() {
        ArrayDeque arrayDeque = A;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new ow1();
                }
                return (ow1) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.uw1
    public final void a() {
        if (this.f9631z) {
            try {
                nw1 nw1Var = this.f9628w;
                if (nw1Var != null) {
                    nw1Var.removeCallbacksAndMessages(null);
                    qb0 qb0Var = this.f9630y;
                    synchronized (qb0Var) {
                        qb0Var.f9800a = false;
                    }
                    nw1 nw1Var2 = this.f9628w;
                    if (nw1Var2 != null) {
                        nw1Var2.obtainMessage(3).sendToTarget();
                        synchronized (qb0Var) {
                            while (!qb0Var.f9800a) {
                                qb0Var.wait();
                            }
                        }
                        return;
                    }
                    throw null;
                }
                throw null;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                androidx.datastore.preferences.protobuf.s1.r(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.uw1
    public final void b() {
        if (this.f9631z) {
            a();
            this.f9627v.quit();
        }
        this.f9631z = false;
    }

    @Override // com.google.android.gms.internal.ads.uw1
    public final void c(int i, cs1 cs1Var, long j10, int i10) {
        int length;
        int length2;
        int length3;
        int length4;
        e();
        ow1 g8 = g();
        g8.f9252a = i;
        g8.f9253b = 0;
        g8.f9255d = j10;
        g8.e = i10;
        MediaCodec.CryptoInfo cryptoInfo = g8.f9254c;
        cryptoInfo.numSubSamples = cs1Var.f5149f;
        int[] iArr = cs1Var.f5148d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= (length4 = iArr.length)) {
                System.arraycopy(iArr, 0, iArr2, 0, length4);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = cs1Var.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= (length3 = iArr3.length)) {
                System.arraycopy(iArr3, 0, iArr4, 0, length3);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = cs1Var.f5146b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 != null && bArr2.length >= (length2 = bArr.length)) {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            } else {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = cs1Var.f5145a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 != null && bArr4.length >= (length = bArr3.length)) {
                System.arraycopy(bArr3, 0, bArr4, 0, length);
            } else {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = cs1Var.f5147c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cs1Var.f5150g, cs1Var.f5151h));
        nw1 nw1Var = this.f9628w;
        String str = bq0.f4860a;
        nw1Var.obtainMessage(2, g8).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.uw1
    public final void d(Bundle bundle) {
        e();
        nw1 nw1Var = this.f9628w;
        String str = bq0.f4860a;
        nw1Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.uw1
    public final void e() {
        RuntimeException runtimeException = (RuntimeException) this.f9629x.getAndSet(null);
        if (runtimeException == null) {
        } else {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.uw1
    public final void f(int i, int i10, int i11, long j10) {
        e();
        ow1 g8 = g();
        g8.f9252a = i;
        g8.f9253b = i10;
        g8.f9255d = j10;
        g8.e = i11;
        nw1 nw1Var = this.f9628w;
        String str = bq0.f4860a;
        nw1Var.obtainMessage(1, g8).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.uw1
    /* renamed from: zza */
    public final void mo209zza() {
        if (!this.f9631z) {
            HandlerThread handlerThread = this.f9627v;
            handlerThread.start();
            this.f9628w = new nw1(this, handlerThread.getLooper());
            this.f9631z = true;
        }
    }
}

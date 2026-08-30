package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class qw1 extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f9999b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f10000c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f10004h;
    public MediaFormat i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f10005j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f10006k;

    /* renamed from: l, reason: collision with root package name */
    public long f10007l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10008m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f10009n;

    /* renamed from: o, reason: collision with root package name */
    public bl0 f10010o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f9998a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.i f10001d = new androidx.datastore.preferences.protobuf.i(2);
    public final androidx.datastore.preferences.protobuf.i e = new androidx.datastore.preferences.protobuf.i(2);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f10002f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f10003g = new ArrayDeque();

    public qw1(HandlerThread handlerThread) {
        this.f9999b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f10003g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        androidx.datastore.preferences.protobuf.i iVar = this.f10001d;
        iVar.f735w = iVar.f734v;
        androidx.datastore.preferences.protobuf.i iVar2 = this.e;
        iVar2.f735w = iVar2.f734v;
        this.f10002f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f10009n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f10005j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f10006k;
                if (cryptoException == null) {
                    return;
                }
                this.f10006k = null;
                throw cryptoException;
            }
            this.f10005j = null;
            throw codecException;
        }
        this.f10009n = null;
        throw illegalStateException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f9998a) {
            this.f10006k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f9998a) {
            this.f10005j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        zs1 zs1Var;
        synchronized (this.f9998a) {
            try {
                this.f10001d.U0(i);
                bl0 bl0Var = this.f10010o;
                if (bl0Var != null && (zs1Var = ((zw1) bl0Var.f4819v).f13296c0) != null) {
                    zs1Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        zs1 zs1Var;
        synchronized (this.f9998a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.U0(-2);
                    this.f10003g.add(mediaFormat);
                    this.i = null;
                }
                this.e.U0(i);
                this.f10002f.add(bufferInfo);
                bl0 bl0Var = this.f10010o;
                if (bl0Var != null && (zs1Var = ((zw1) bl0Var.f4819v).f13296c0) != null) {
                    zs1Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f9998a) {
            this.e.U0(-2);
            this.f10003g.add(mediaFormat);
            this.i = null;
        }
    }
}

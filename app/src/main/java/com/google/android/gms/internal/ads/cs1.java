package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class cs1 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5145a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f5146b;

    /* renamed from: c, reason: collision with root package name */
    public int f5147c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f5148d;
    public int[] e;

    /* renamed from: f, reason: collision with root package name */
    public int f5149f;

    /* renamed from: g, reason: collision with root package name */
    public int f5150g;

    /* renamed from: h, reason: collision with root package name */
    public int f5151h;
    public final MediaCodec.CryptoInfo i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.gms.internal.mlkit_vision_digital_ink.iw f5152j;

    public cs1() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.f5152j = new com.google.android.gms.internal.mlkit_vision_digital_ink.iw(cryptoInfo);
    }

    public final void a(int i) {
        if (i == 0) {
            return;
        }
        if (this.f5148d == null) {
            int[] iArr = new int[1];
            this.f5148d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f5148d;
        iArr2[0] = iArr2[0] + i;
    }
}

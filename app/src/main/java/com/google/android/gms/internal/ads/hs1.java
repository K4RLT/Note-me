package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes.dex */
public final class hs1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6880a;

    /* renamed from: b, reason: collision with root package name */
    public int f6881b;

    /* renamed from: c, reason: collision with root package name */
    public int f6882c;

    /* renamed from: d, reason: collision with root package name */
    public int f6883d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f6884f;

    /* renamed from: g, reason: collision with root package name */
    public int f6885g;

    /* renamed from: h, reason: collision with root package name */
    public int f6886h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f6887j;

    /* renamed from: k, reason: collision with root package name */
    public long f6888k;

    /* renamed from: l, reason: collision with root package name */
    public int f6889l;

    public final synchronized void a() {
    }

    public final String toString() {
        int i = this.f6880a;
        int i10 = this.f6881b;
        int i11 = this.f6882c;
        int i12 = this.f6883d;
        int i13 = this.e;
        int i14 = this.f6884f;
        int i15 = this.f6885g;
        int i16 = this.f6886h;
        int i17 = this.i;
        int i18 = this.f6887j;
        long j10 = this.f6888k;
        int i19 = this.f6889l;
        String str = bq0.f4860a;
        Locale locale = Locale.US;
        StringBuilder n10 = g3.a.n("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", "\n queuedInputBuffers=", i10);
        a5.a.n(i11, i12, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", n10);
        a5.a.n(i13, i14, "\n skippedOutputBuffers=", "\n droppedBuffers=", n10);
        a5.a.n(i15, i16, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", n10);
        a5.a.n(i17, i18, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", n10);
        n10.append(j10);
        n10.append("\n videoFrameProcessingOffsetCount=");
        n10.append(i19);
        n10.append("\n}");
        return n10.toString();
    }
}

package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class sa {

    /* renamed from: a, reason: collision with root package name */
    public long f10571a;

    /* renamed from: b, reason: collision with root package name */
    public long f10572b;

    /* renamed from: c, reason: collision with root package name */
    public long f10573c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10574d;
    public final Object e;

    public /* synthetic */ sa(ByteBuffer byteBuffer, long j10, long j11, long j12, ByteBuffer byteBuffer2) {
        this.f10574d = byteBuffer;
        this.f10571a = j10;
        this.f10572b = j11;
        this.f10573c = j12;
        this.e = byteBuffer2;
    }

    public sa(AudioTrack audioTrack) {
        this.f10574d = audioTrack;
        this.e = new AudioTimestamp();
    }
}

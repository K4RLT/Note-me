package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class ov1 {

    /* renamed from: a, reason: collision with root package name */
    public final sa f9240a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9241b;

    /* renamed from: c, reason: collision with root package name */
    public final zq0 f9242c;

    /* renamed from: d, reason: collision with root package name */
    public int f9243d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f9244f;

    /* renamed from: g, reason: collision with root package name */
    public long f9245g;

    /* renamed from: h, reason: collision with root package name */
    public long f9246h;
    public long i;

    public ov1(AudioTrack audioTrack, zq0 zq0Var) {
        this.f9240a = new sa(audioTrack);
        this.f9241b = audioTrack.getSampleRate();
        this.f9242c = zq0Var;
        a(0);
    }

    public final void a(int i) {
        this.f9243d = i;
        long j10 = 10000;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    j10 = 500000;
                } else {
                    j10 = 10000000;
                }
            } else {
                this.f9244f = 10000L;
                return;
            }
        } else {
            this.f9245g = 0L;
            this.f9246h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
        }
        this.f9244f = j10;
    }
}

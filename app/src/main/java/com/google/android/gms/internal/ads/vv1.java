package com.google.android.gms.internal.ads;
import b0.a;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class vv1 {

    /* renamed from: a, reason: collision with root package name */
    public final zq0 f12029a;

    /* renamed from: b, reason: collision with root package name */
    public final s6 f12030b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f12031c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioTrack f12032d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12033f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12034g;

    /* renamed from: h, reason: collision with root package name */
    public final ov1 f12035h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public long f12036j;

    /* renamed from: k, reason: collision with root package name */
    public long f12037k;

    /* renamed from: l, reason: collision with root package name */
    public long f12038l;

    /* renamed from: m, reason: collision with root package name */
    public Method f12039m;

    /* renamed from: n, reason: collision with root package name */
    public long f12040n;

    /* renamed from: o, reason: collision with root package name */
    public long f12041o;

    /* renamed from: p, reason: collision with root package name */
    public long f12042p;

    /* renamed from: q, reason: collision with root package name */
    public long f12043q;

    /* renamed from: r, reason: collision with root package name */
    public long f12044r;

    /* renamed from: s, reason: collision with root package name */
    public int f12045s;

    /* renamed from: t, reason: collision with root package name */
    public int f12046t;

    /* renamed from: u, reason: collision with root package name */
    public long f12047u;

    /* renamed from: v, reason: collision with root package name */
    public long f12048v;

    /* renamed from: w, reason: collision with root package name */
    public long f12049w;

    /* renamed from: x, reason: collision with root package name */
    public long f12050x;

    /* renamed from: y, reason: collision with root package name */
    public long f12051y;

    /* renamed from: z, reason: collision with root package name */
    public long f12052z;

    public vv1(zq0 zq0Var, s6 s6Var, AudioTrack audioTrack, int i, int i10, int i11) {
        long j10;
        this.f12029a = zq0Var;
        this.f12030b = s6Var;
        this.f12032d = audioTrack;
        try {
            this.f12039m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f12031c = new long[10];
        this.f12052z = -9223372036854775807L;
        this.f12051y = -9223372036854775807L;
        this.f12035h = new ov1(audioTrack, zq0Var);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean d2 = bq0.d(i);
        this.f12034g = d2;
        if (d2) {
            j10 = bq0.v(sampleRate, i11 / i10);
        } else {
            j10 = -9223372036854775807L;
        }
        this.f12033f = j10;
        this.f12043q = 0L;
        this.f12044r = 0L;
        this.f12047u = -9223372036854775807L;
        this.f12048v = -9223372036854775807L;
        this.f12041o = 0L;
        this.f12040n = 0L;
        this.i = 1.0f;
        this.f12036j = -9223372036854775807L;
    }

    public final void a(long j10) {
        long j11 = this.f12036j;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            long j12 = j10 - j11;
            String str = bq0.f4860a;
            float f10 = this.i;
            if (f10 != 1.0f) {
                j12 = Math.round(j12 / f10);
            }
            long t3 = bq0.t(j12);
            this.f12030b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - t3;
            this.f12036j = -9223372036854775807L;
            tv1 tv1Var = (tv1) this.f12029a.f13255v;
            ig0 ig0Var = tv1Var.i;
            ig0Var.getClass();
            if (Thread.currentThread() == ig0Var.f7131a) {
                ig0 ig0Var2 = tv1Var.i;
                ig0Var2.c(-1, new b0.a(currentTimeMillis, 12));
                ig0Var2.d();
            }
        }
    }

    public final long b(long j10) {
        long y10;
        int i = this.f12046t;
        int i10 = this.e;
        if (i == 0) {
            if (this.f12047u != -9223372036854775807L) {
                y10 = bq0.v(i10, d());
            } else {
                y10 = bq0.v(i10, c());
            }
        } else {
            y10 = bq0.y(j10 + this.f12037k, this.i);
        }
        long max = Math.max(0L, y10 - this.f12040n);
        if (this.f12047u != -9223372036854775807L) {
            return Math.min(bq0.v(i10, this.f12050x), max);
        }
        return max;
    }

    public final long c() {
        if (this.f12047u != -9223372036854775807L) {
            return Math.min(this.f12050x, d());
        }
        this.f12030b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f12042p >= 5) {
            int playState = this.f12032d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = r4.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f12043q > 0 && playState == 3) {
                        if (this.f12048v == -9223372036854775807L) {
                            this.f12048v = elapsedRealtime;
                        }
                    } else {
                        this.f12048v = -9223372036854775807L;
                    }
                }
                if (this.f12043q > playbackHeadPosition) {
                    this.f12044r++;
                }
                this.f12043q = playbackHeadPosition;
            }
            this.f12042p = elapsedRealtime;
        }
        return this.f12043q + (this.f12044r << 32);
    }

    public final long d() {
        if (this.f12032d.getPlayState() == 2) {
            return this.f12049w;
        }
        this.f12030b.getClass();
        return this.f12049w + bq0.w(bq0.y(bq0.u(SystemClock.elapsedRealtime()) - this.f12047u, this.i), this.e, 1000000L, RoundingMode.UP);
    }
}

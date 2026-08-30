package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class js1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f7524a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7525b;

    /* renamed from: c, reason: collision with root package name */
    public long f7526c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f7527d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f7528f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f7529g = -9223372036854775807L;
    public float i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public long f7531j = -9223372036854775807L;
    public long e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f7530h = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public long f7532k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public long f7533l = -9223372036854775807L;

    public /* synthetic */ js1(long j10, long j11) {
        this.f7524a = j10;
        this.f7525b = j11;
    }

    public final void a() {
        long j10 = this.f7530h;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f7525b;
        this.f7530h = j11;
        long j12 = this.f7529g;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f7530h = j12;
        }
        this.f7531j = -9223372036854775807L;
    }

    public final long b() {
        return this.f7530h;
    }

    public final void c() {
        long j10;
        long j11 = this.f7526c;
        if (j11 != -9223372036854775807L) {
            j10 = this.f7527d;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f7528f;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f7529g;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.e == j10) {
            return;
        }
        this.e = j10;
        this.f7530h = j10;
        this.f7532k = -9223372036854775807L;
        this.f7533l = -9223372036854775807L;
        this.f7531j = -9223372036854775807L;
    }
}

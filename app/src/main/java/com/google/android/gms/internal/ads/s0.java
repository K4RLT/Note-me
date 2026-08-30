package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public long f10408a;

    /* renamed from: b, reason: collision with root package name */
    public long f10409b;

    /* renamed from: c, reason: collision with root package name */
    public long f10410c;

    /* renamed from: d, reason: collision with root package name */
    public long f10411d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f10412f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f10413g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f10414h;

    public final void a() {
        this.f10411d = 0L;
        this.e = 0L;
        this.f10412f = 0L;
        this.f10414h = 0;
        Arrays.fill(this.f10413g, false);
    }

    public final boolean b() {
        return this.f10411d > 15 && this.f10414h == 0;
    }

    public final void c(long j10) {
        long j11 = this.f10411d;
        if (j11 == 0) {
            this.f10408a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f10408a;
            this.f10409b = j12;
            this.f10412f = j12;
            this.e = 1L;
        } else {
            long j13 = j10 - this.f10410c;
            long abs = Math.abs(j13 - this.f10409b);
            int i = (int) (j11 % 15);
            boolean[] zArr = this.f10413g;
            if (abs <= 1000000) {
                this.e++;
                this.f10412f += j13;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f10414h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f10414h++;
            }
        }
        this.f10411d++;
        this.f10410c = j10;
    }
}

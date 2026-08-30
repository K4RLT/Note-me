package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class dp0 {

    /* renamed from: a, reason: collision with root package name */
    public long f5470a;

    /* renamed from: b, reason: collision with root package name */
    public long f5471b;

    /* renamed from: c, reason: collision with root package name */
    public long f5472c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f5473d = new ThreadLocal();

    public dp0() {
        b(0L);
    }

    public final synchronized long a() {
        long j10 = this.f5470a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized void b(long j10) {
        this.f5470a = j10;
        this.f5471b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f5472c = -9223372036854775807L;
    }

    public final synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f5472c;
            if (j11 != -9223372036854775807L) {
                long w10 = bq0.w(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = (4294967296L + w10) / 8589934592L;
                long j13 = (((-1) + j12) * 8589934592L) + j10;
                long j14 = (j12 * 8589934592L) + j10;
                if (Math.abs(j13 - w10) < Math.abs(j14 - w10)) {
                    j10 = j13;
                } else {
                    j10 = j14;
                }
            }
            return e(bq0.w(j10, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f5472c;
            if (j11 != -9223372036854775807L) {
                long w10 = bq0.w(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = w10 / 8589934592L;
                long j13 = (j12 * 8589934592L) + j10;
                long j14 = ((j12 + 1) * 8589934592L) + j10;
                if (j13 >= w10) {
                    j10 = j13;
                } else {
                    j10 = j14;
                }
            }
            return e(bq0.w(j10, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long e(long j10) {
        boolean z3;
        long j11;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (this.f5471b != -9223372036854775807L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    long j12 = this.f5470a;
                    if (j12 == 9223372036854775806L) {
                        Long l10 = (Long) this.f5473d.get();
                        if (l10 != null) {
                            j12 = l10.longValue();
                        } else {
                            throw null;
                        }
                    }
                    this.f5471b = j12 - j10;
                    notifyAll();
                }
                this.f5472c = j10;
                j11 = j10 + this.f5471b;
            }
            return j11;
        } catch (Throwable th) {
            throw th;
        }
    }
}

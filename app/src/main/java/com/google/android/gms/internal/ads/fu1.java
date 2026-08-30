package com.google.android.gms.internal.ads;
import g5.q;
import q.x;

import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class fu1 implements kt1 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6166u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6167v;

    /* renamed from: w, reason: collision with root package name */
    public long f6168w;

    /* renamed from: x, reason: collision with root package name */
    public long f6169x;

    /* renamed from: y, reason: collision with root package name */
    public Object f6170y;

    public fu1(com.google.android.gms.internal.play_billing.j jVar) {
        if (jVar != null) {
            this.f6170y = jVar;
        } else {
            q.h("ticker");
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public void a(vb vbVar) {
        if (this.f6167v) {
            b(e());
        }
        this.f6170y = vbVar;
    }

    public void b(long j10) {
        this.f6168w = j10;
        if (this.f6167v) {
            this.f6169x = SystemClock.elapsedRealtime();
        }
    }

    public void c() {
        if (!this.f6167v) {
            this.f6167v = true;
            this.f6169x = ((com.google.android.gms.internal.play_billing.j) this.f6170y).a();
        } else {
            x.o("This stopwatch is already running.");
        }
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public long e() {
        long j10;
        long j11 = this.f6168w;
        if (this.f6167v) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6169x;
            if (((vb) this.f6170y).f11870a == 1.0f) {
                j10 = bq0.u(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * r4.f11872c;
            }
            return j10 + j11;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public vb f() {
        return (vb) this.f6170y;
    }

    public String toString() {
        long j10;
        TimeUnit timeUnit;
        String str;
        switch (this.f6166u) {
            case 1:
                if (this.f6167v) {
                    j10 = (((com.google.android.gms.internal.play_billing.j) this.f6170y).a() - this.f6169x) + this.f6168w;
                } else {
                    j10 = this.f6168w;
                }
                long j11 = j10 / 86400000000000L;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                if (j11 > 0) {
                    timeUnit = TimeUnit.DAYS;
                } else if (j10 / 3600000000000L > 0) {
                    timeUnit = TimeUnit.HOURS;
                } else if (j10 / 60000000000L > 0) {
                    timeUnit = TimeUnit.MINUTES;
                } else if (j10 / 1000000000 > 0) {
                    timeUnit = TimeUnit.SECONDS;
                } else if (j10 / 1000000 > 0) {
                    timeUnit = TimeUnit.MILLISECONDS;
                } else if (j10 / 1000 > 0) {
                    timeUnit = TimeUnit.MICROSECONDS;
                } else {
                    timeUnit = timeUnit2;
                }
                String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(j10 / timeUnit2.convert(1L, timeUnit)));
                switch (com.google.android.gms.internal.play_billing.m.f15483a[timeUnit.ordinal()]) {
                    case 1:
                        str = "ns";
                        break;
                    case 2:
                        str = "μs";
                        break;
                    case 3:
                        str = "ms";
                        break;
                    case 4:
                        str = "s";
                        break;
                    case 5:
                        str = "min";
                        break;
                    case 6:
                        str = "h";
                        break;
                    case 7:
                        str = "d";
                        break;
                    default:
                        throw new AssertionError();
                }
                return wd0.n(format, " ", str);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ fu1() {
    }
}

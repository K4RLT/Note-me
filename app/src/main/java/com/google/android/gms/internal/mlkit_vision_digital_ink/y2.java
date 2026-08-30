package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g5.q;
import q.h;

import com.google.android.gms.internal.ads.wd0;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final nw f15268a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15269b;

    /* renamed from: c, reason: collision with root package name */
    public long f15270c;

    public y2(nw nwVar) {
        if (nwVar != null) {
            this.f15268a = nwVar;
        } else {
            g5.q.h("ticker");
            throw null;
        }
    }

    public static y2 b(nw nwVar) {
        y2 y2Var = new y2(nwVar);
        pa.s("This stopwatch is already running.", !y2Var.f15269b);
        y2Var.f15269b = true;
        y2Var.f15270c = nwVar.c();
        return y2Var;
    }

    public final long a(TimeUnit timeUnit) {
        long j10;
        if (this.f15269b) {
            j10 = this.f15268a.c() - this.f15270c;
        } else {
            j10 = 0;
        }
        return timeUnit.convert(j10, TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        long j10;
        TimeUnit timeUnit;
        String str;
        if (this.f15269b) {
            j10 = this.f15268a.c() - this.f15270c;
        } else {
            j10 = 0;
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
        switch (x2.f15226a[timeUnit.ordinal()]) {
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
    }
}

package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5931a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5933c;

    public f5(long j10, int i, long j11) {
        boolean z3;
        if (j10 < j11) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        this.f5931a = j10;
        this.f5932b = j11;
        this.f5933c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f5.class == obj.getClass()) {
            f5 f5Var = (f5) obj;
            if (this.f5931a == f5Var.f5931a && this.f5932b == f5Var.f5932b && this.f5933c == f5Var.f5933c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f5931a), Long.valueOf(this.f5932b), Integer.valueOf(this.f5933c));
    }

    public final String toString() {
        String str = bq0.f4860a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f5931a + ", endTimeMs=" + this.f5932b + ", speedDivisor=" + this.f5933c;
    }
}

package com.google.android.gms.internal.ads;
import g3.a;

/* loaded from: classes.dex */
public final class b3 {

    /* renamed from: c, reason: collision with root package name */
    public static final b3 f4701c = new b3(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f4702a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4703b;

    public b3(long j10, long j11) {
        this.f4702a = j10;
        this.f4703b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b3.class == obj.getClass()) {
            b3 b3Var = (b3) obj;
            if (this.f4702a == b3Var.f4702a && this.f4703b == b3Var.f4703b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4702a) * 31) + ((int) this.f4703b);
    }

    public final String toString() {
        long j10 = this.f4702a;
        int length = String.valueOf(j10).length();
        long j11 = this.f4703b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(j11).length() + 1);
        a.s(sb2, "[timeUs=", j10, ", position=");
        sb2.append(j11);
        sb2.append("]");
        return sb2.toString();
    }
}

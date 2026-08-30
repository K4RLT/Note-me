package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bx0 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f4900a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4901b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4902c;

    public bx0(long j10, long j11, long j12) {
        this.f4900a = j10;
        this.f4901b = j11;
        this.f4902c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx0)) {
            return false;
        }
        bx0 bx0Var = (bx0) obj;
        if (this.f4900a == bx0Var.f4900a && this.f4901b == bx0Var.f4901b && this.f4902c == bx0Var.f4902c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4902c) + ((Long.hashCode(this.f4901b) + ((Long.hashCode(this.f4900a) + 527) * 31)) * 31);
    }

    public final String toString() {
        long j10 = this.f4900a;
        int length = String.valueOf(j10).length();
        long j11 = this.f4901b;
        int length2 = String.valueOf(j11).length();
        long j12 = this.f4902c;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j12).length());
        g3.a.s(sb2, "Mp4Timestamp: creation time=", j10, ", modification time=");
        sb2.append(j11);
        sb2.append(", timescale=");
        sb2.append(j12);
        return sb2.toString();
    }
}

package com.google.android.gms.internal.ads;
import g3.a;

/* loaded from: classes.dex */
public final class m4 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f8230a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8231b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8232c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8233d;
    public final long e;

    public m4(long j10, long j11, long j12, long j13, long j14) {
        this.f8230a = j10;
        this.f8231b = j11;
        this.f8232c = j12;
        this.f8233d = j13;
        this.e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m4.class == obj.getClass()) {
            m4 m4Var = (m4) obj;
            if (this.f8230a == m4Var.f8230a && this.f8231b == m4Var.f8231b && this.f8232c == m4Var.f8232c && this.f8233d == m4Var.f8233d && this.e == m4Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((Long.hashCode(this.f8233d) + ((Long.hashCode(this.f8232c) + ((Long.hashCode(this.f8231b) + ((Long.hashCode(this.f8230a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        long j10 = this.f8230a;
        int length = String.valueOf(j10).length();
        long j11 = this.f8231b;
        int length2 = String.valueOf(j11).length();
        long j12 = this.f8232c;
        int length3 = String.valueOf(j12).length();
        long j13 = this.f8233d;
        int length4 = String.valueOf(j13).length();
        long j14 = this.e;
        StringBuilder sb2 = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j14).length());
        g3.a.s(sb2, "Motion photo metadata: photoStartPosition=", j10, ", photoSize=");
        sb2.append(j11);
        g3.a.s(sb2, ", photoPresentationTimestampUs=", j12, ", videoStartPosition=");
        sb2.append(j13);
        sb2.append(", videoSize=");
        sb2.append(j14);
        return sb2.toString();
    }
}

package com.google.android.gms.internal.ads;
import g3.a;
import p.a;

/* loaded from: classes.dex */
public final class le0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f8016a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8017b;

    public le0(long j10, int i) {
        this.f8016a = j10;
        this.f8017b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof le0) {
            le0 le0Var = (le0) obj;
            if (this.f8016a == le0Var.f8016a && this.f8017b == le0Var.f8017b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8016a;
        return ((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f8017b;
    }

    public final String toString() {
        long j10 = this.f8016a;
        int length = String.valueOf(j10).length();
        int i = this.f8017b;
        StringBuilder sb2 = new StringBuilder(length + 34 + String.valueOf(i).length() + 1);
        a.s(sb2, "OnDeviceStorageKey{id=", j10, ", eventType=");
        return a.j(i, "}", sb2);
    }
}

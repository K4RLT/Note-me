package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bz1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f4921a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4922b;

    public bz1(long j10, long j11) {
        this.f4921a = j10;
        this.f4922b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz1)) {
            return false;
        }
        bz1 bz1Var = (bz1) obj;
        if (this.f4921a == bz1Var.f4921a && this.f4922b == bz1Var.f4922b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4921a) * 31) + ((int) this.f4922b);
    }
}

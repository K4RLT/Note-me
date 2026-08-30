package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n4 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f8538a;

    public n4(long j10) {
        this.f8538a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n4.class == obj.getClass() && this.f8538a == ((n4) obj).f8538a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8538a) + 527;
    }

    public final String toString() {
        long j10 = this.f8538a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 38);
        sb2.append("ThumbnailMetadata: presentationTimeUs=");
        sb2.append(j10);
        return sb2.toString();
    }
}

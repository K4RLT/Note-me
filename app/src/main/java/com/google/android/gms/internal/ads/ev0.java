package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ev0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5826a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5827b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5828c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5829d;
    public final long e;

    public ev0(String str, boolean z3, boolean z9, long j10, long j11) {
        this.f5826a = str;
        this.f5827b = z3;
        this.f5828c = z9;
        this.f5829d = j10;
        this.e = j11;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ev0) {
                ev0 ev0Var = (ev0) obj;
                if (this.f5826a.equals(ev0Var.f5826a) && this.f5827b == ev0Var.f5827b && this.f5828c == ev0Var.f5828c && this.f5829d == ev0Var.f5829d && this.e == ev0Var.e) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f5826a.hashCode() ^ 1000003;
        int i10 = 1231;
        if (true != this.f5827b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i11 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true != this.f5828c) {
            i10 = 1237;
        }
        return ((((((((i11 ^ i10) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f5829d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.e);
    }

    public final String toString() {
        boolean z3 = this.f5827b;
        int length = String.valueOf(z3).length();
        boolean z9 = this.f5828c;
        int length2 = String.valueOf(z9).length();
        long j10 = this.f5829d;
        int length3 = String.valueOf(j10).length();
        long j11 = this.e;
        int length4 = String.valueOf(j11).length();
        String str = this.f5826a;
        StringBuilder sb2 = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb2.append("AdShield2Options{clientVersion=");
        sb2.append(str);
        sb2.append(", shouldGetAdvertisingId=");
        sb2.append(z3);
        sb2.append(", isGooglePlayServicesAvailable=");
        sb2.append(z9);
        sb2.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb2.append(j10);
        sb2.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb2.append(j11);
        sb2.append("}");
        return sb2.toString();
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ni {

    /* renamed from: a, reason: collision with root package name */
    public final long f8718a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8719b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8720c;

    public ni(String str, long j10, int i) {
        this.f8718a = j10;
        this.f8719b = str;
        this.f8720c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ni)) {
            return false;
        }
        ni niVar = (ni) obj;
        if (niVar.f8718a != this.f8718a || niVar.f8720c != this.f8720c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (int) this.f8718a;
    }
}

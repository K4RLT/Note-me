package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class m5 implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public final long f8247u;

    /* renamed from: v, reason: collision with root package name */
    public final long f8248v;

    /* renamed from: w, reason: collision with root package name */
    public final long f8249w;

    public /* synthetic */ m5(long j10, long j11, long j12) {
        this.f8247u = j10;
        this.f8248v = j11;
        this.f8249w = j12;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f8247u, ((m5) obj).f8247u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        if (this.f8247u == m5Var.f8247u && this.f8248v == m5Var.f8248v && this.f8249w == m5Var.f8249w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f8247u), Long.valueOf(this.f8248v), Long.valueOf(this.f8249w));
    }
}

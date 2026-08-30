package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class du1 {

    /* renamed from: b, reason: collision with root package name */
    public static final du1 f5523b;

    /* renamed from: c, reason: collision with root package name */
    public static final du1 f5524c;

    /* renamed from: a, reason: collision with root package name */
    public final long f5525a;

    static {
        du1 du1Var = new du1(0L);
        f5523b = new du1(Long.MAX_VALUE);
        f5524c = du1Var;
    }

    public du1(long j10) {
        this.f5525a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && du1.class == obj.getClass() && this.f5525a == ((du1) obj).f5525a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((int) this.f5525a) * 31;
    }
}

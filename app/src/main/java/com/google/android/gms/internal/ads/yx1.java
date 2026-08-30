package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yx1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13005c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13006d;
    public final int e;

    public yx1(Object obj, int i, int i10, long j10, int i11) {
        this.f13003a = obj;
        this.f13004b = i;
        this.f13005c = i10;
        this.f13006d = j10;
        this.e = i11;
    }

    public final yx1 a(Object obj) {
        if (this.f13003a.equals(obj)) {
            return this;
        }
        return new yx1(obj, this.f13004b, this.f13005c, this.f13006d, this.e);
    }

    public final boolean b() {
        return this.f13004b != -1;
    }

    public final boolean c(yx1 yx1Var) {
        if (yx1Var == null) {
            return false;
        }
        if (this == yx1Var) {
            return true;
        }
        if (!this.f13003a.equals(yx1Var.f13003a) || this.f13004b != yx1Var.f13004b || this.f13005c != yx1Var.f13005c || this.f13006d != yx1Var.f13006d) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx1)) {
            return false;
        }
        yx1 yx1Var = (yx1) obj;
        if (c(yx1Var) && this.e == yx1Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f13003a.hashCode() + 527) * 31) + this.f13004b) * 31) + this.f13005c) * 31) + ((int) this.f13006d)) * 31) + this.e;
    }

    public yx1(long j10, Object obj) {
        this(obj, -1, -1, j10, -1);
    }

    public yx1(Object obj, long j10, int i) {
        this(obj, -1, -1, j10, i);
    }
}

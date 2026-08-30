package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class mt1 {

    /* renamed from: a, reason: collision with root package name */
    public final yx1 f8413a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8414b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8415c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8416d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8417f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8418g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8419h;

    public mt1(yx1 yx1Var, long j10, long j11, long j12, long j13, boolean z3, boolean z9, boolean z10) {
        boolean z11;
        if (!z10 || z3) {
            z11 = true;
        } else {
            z11 = false;
        }
        b80.l(z11);
        b80.l(!z9 || z3);
        this.f8413a = yx1Var;
        this.f8414b = j10;
        this.f8415c = j11;
        this.f8416d = j12;
        this.e = j13;
        this.f8417f = z3;
        this.f8418g = z9;
        this.f8419h = z10;
    }

    public final mt1 a(long j10, long j11) {
        if (j10 == this.f8414b && j11 == this.f8415c) {
            return this;
        }
        return new mt1(this.f8413a, j10, j11, this.f8416d, this.e, this.f8417f, this.f8418g, this.f8419h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mt1.class == obj.getClass()) {
            mt1 mt1Var = (mt1) obj;
            if (this.f8414b == mt1Var.f8414b && this.f8416d == mt1Var.f8416d && this.e == mt1Var.e && this.f8417f == mt1Var.f8417f && this.f8418g == mt1Var.f8418g && this.f8419h == mt1Var.f8419h && Objects.equals(this.f8413a, mt1Var.f8413a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f8413a.hashCode() + 527) * 31) + ((int) this.f8414b)) * 31) + ((int) this.f8416d)) * 31) + ((int) this.e)) * 961) + (this.f8417f ? 1 : 0)) * 31) + (this.f8418g ? 1 : 0)) * 31) + (this.f8419h ? 1 : 0);
    }
}

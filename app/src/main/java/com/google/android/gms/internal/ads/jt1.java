package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class jt1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f7539a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7540b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7541c;

    public /* synthetic */ jt1(it1 it1Var) {
        this.f7539a = it1Var.f7220a;
        this.f7540b = it1Var.f7221b;
        this.f7541c = it1Var.f7222c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt1)) {
            return false;
        }
        jt1 jt1Var = (jt1) obj;
        if (this.f7539a == jt1Var.f7539a && this.f7540b == jt1Var.f7540b && this.f7541c == jt1Var.f7541c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f7539a), Float.valueOf(this.f7540b), Long.valueOf(this.f7541c));
    }
}

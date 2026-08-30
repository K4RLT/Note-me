package com.google.android.gms.internal.ads;
import p.a;

/* loaded from: classes.dex */
public final class l31 extends h31 {

    /* renamed from: u, reason: collision with root package name */
    public final Object f7930u;

    public l31(Object obj) {
        this.f7930u = obj;
    }

    @Override // com.google.android.gms.internal.ads.h31
    public final Object a() {
        return this.f7930u;
    }

    @Override // com.google.android.gms.internal.ads.h31
    public final h31 b(f31 f31Var) {
        Object apply = f31Var.apply(this.f7930u);
        b80.M(apply, "the Function passed to Optional.transform() must not return null.");
        return new l31(apply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l31) {
            return this.f7930u.equals(((l31) obj).f7930u);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7930u.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f7930u.toString();
        return a.o(new StringBuilder(obj.length() + 13), "Optional.of(", obj, ")");
    }
}

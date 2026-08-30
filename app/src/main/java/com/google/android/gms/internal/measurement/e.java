package com.google.android.gms.internal.measurement;
import j6.n;
import q.x;
import w7.i1;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements n {

    /* renamed from: u, reason: collision with root package name */
    public final boolean f13694u;

    public e(Boolean bool) {
        if (bool == null) {
            this.f13694u = false;
        } else {
            this.f13694u = bool.booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double a() {
        double d2;
        if (this.f13694u) {
            d2 = 1.0d;
        } else {
            d2 = 0.0d;
        }
        return Double.valueOf(d2);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String b() {
        return Boolean.toString(this.f13694u);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n c() {
        return new e(Boolean.valueOf(this.f13694u));
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && this.f13694u == ((e) obj).f13694u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f13694u).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean k() {
        return Boolean.valueOf(this.f13694u);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n n(String str, n nVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z3 = this.f13694u;
        if (equals) {
            return new p(Boolean.toString(z3));
        }
        x.n(i1.d(Boolean.toString(z3), ".", str, " is not a function."));
        return null;
    }

    public final String toString() {
        return String.valueOf(this.f13694u);
    }
}

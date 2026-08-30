package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jl0 {

    /* renamed from: c, reason: collision with root package name */
    public static final jl0 f7473c = new jl0(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f7474a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7475b;

    static {
        new jl0(0, 0);
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public jl0(int i, int i10) {
        boolean z3 = false;
        if ((i == -1 || i >= 0) && (i10 == -1 || i10 >= 0)) {
            z3 = true;
        }
        b80.l(z3);
        this.f7474a = i;
        this.f7475b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof jl0) {
            jl0 jl0Var = (jl0) obj;
            if (this.f7474a == jl0Var.f7474a && this.f7475b == jl0Var.f7475b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f7474a;
        return ((i >>> 16) | (i << 16)) ^ this.f7475b;
    }

    public final String toString() {
        int i = this.f7474a;
        int length = String.valueOf(i).length();
        int i10 = this.f7475b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(i10).length());
        sb2.append(i);
        sb2.append("x");
        sb2.append(i10);
        return sb2.toString();
    }
}

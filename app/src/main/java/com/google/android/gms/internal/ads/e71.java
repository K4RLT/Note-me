package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class e71 implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final e71 f5609w = new e71(new long[0], 0);

    /* renamed from: u, reason: collision with root package name */
    public final long[] f5610u;

    /* renamed from: v, reason: collision with root package name */
    public final int f5611v;

    public e71(long[] jArr, int i) {
        this.f5610u = jArr;
        this.f5611v = i;
    }

    public final long a(int i) {
        b80.N(i, this.f5611v);
        return this.f5610u[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e71)) {
            return false;
        }
        e71 e71Var = (e71) obj;
        int i = e71Var.f5611v;
        int i10 = this.f5611v;
        if (i10 != i) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (a(i11) != e71Var.a(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f5611v; i10++) {
            i = (i * 31) + Long.hashCode(this.f5610u[i10]);
        }
        return i;
    }

    public final String toString() {
        int i = this.f5611v;
        if (i != 0) {
            StringBuilder sb2 = new StringBuilder(i * 5);
            sb2.append('[');
            long[] jArr = this.f5610u;
            sb2.append(jArr[0]);
            for (int i10 = 1; i10 < i; i10++) {
                sb2.append(", ");
                sb2.append(jArr[i10]);
            }
            sb2.append(']');
            return sb2.toString();
        }
        return "[]";
    }
}

package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d71 implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final d71 f5331w = new d71(0, new int[0]);

    /* renamed from: u, reason: collision with root package name */
    public final int[] f5332u;

    /* renamed from: v, reason: collision with root package name */
    public final int f5333v;

    public d71(int i, int[] iArr) {
        this.f5332u = iArr;
        this.f5333v = i;
    }

    public final int a(int i) {
        b80.N(i, this.f5333v);
        return this.f5332u[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d71)) {
            return false;
        }
        d71 d71Var = (d71) obj;
        int i = d71Var.f5333v;
        int i10 = this.f5333v;
        if (i10 != i) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (a(i11) != d71Var.a(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f5333v; i10++) {
            i = (i * 31) + Integer.hashCode(this.f5332u[i10]);
        }
        return i;
    }

    public final String toString() {
        int i = this.f5333v;
        if (i != 0) {
            StringBuilder sb2 = new StringBuilder(i * 5);
            sb2.append('[');
            int[] iArr = this.f5332u;
            sb2.append(iArr[0]);
            for (int i10 = 1; i10 < i; i10++) {
                sb2.append(", ");
                sb2.append(iArr[i10]);
            }
            sb2.append(']');
            return sb2.toString();
        }
        return "[]";
    }
}

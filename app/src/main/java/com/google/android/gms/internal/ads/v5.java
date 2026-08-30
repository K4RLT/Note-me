package com.google.android.gms.internal.ads;
import g3.a;

/* loaded from: classes.dex */
public final class v5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11800a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11801b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11802c;

    public v5(int i, int i10, float f10) {
        this.f11800a = i;
        this.f11801b = i10;
        this.f11802c = f10;
    }

    public static /* synthetic */ v5 a(int i) {
        int i10 = i >> 13;
        if (i10 == 0) {
            return null;
        }
        return new v5(i10, (i >> 10) & 7, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj;
        if (this.f11800a != v5Var.f11800a || this.f11801b != v5Var.f11801b || Float.compare(this.f11802c, v5Var.f11802c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11802c) + (((this.f11800a * 31) + this.f11801b) * 31);
    }

    public final String toString() {
        int i = this.f11800a;
        int length = String.valueOf(i).length();
        int i10 = this.f11801b;
        int length2 = String.valueOf(i10).length();
        float f10 = this.f11802c;
        StringBuilder sb2 = new StringBuilder(length + 28 + length2 + 7 + String.valueOf(f10).length() + 1);
        a.r(i, i10, "GainField{name=", ", originator=", sb2);
        sb2.append(", gain=");
        sb2.append(f10);
        sb2.append("}");
        return sb2.toString();
    }
}

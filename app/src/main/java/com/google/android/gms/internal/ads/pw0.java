package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pw0 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f9624a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9625b;

    public pw0(float f10, float f11) {
        boolean z3 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z3 = true;
        }
        b80.w("Invalid latitude or longitude", z3);
        this.f9624a = f10;
        this.f9625b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pw0.class == obj.getClass()) {
            pw0 pw0Var = (pw0) obj;
            if (this.f9624a == pw0Var.f9624a && this.f9625b == pw0Var.f9625b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9625b) + ((Float.hashCode(this.f9624a) + 527) * 31);
    }

    public final String toString() {
        float f10 = this.f9624a;
        int length = String.valueOf(f10).length();
        float f11 = this.f9625b;
        StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(f11).length());
        sb2.append("xyz: latitude=");
        sb2.append(f10);
        sb2.append(", longitude=");
        sb2.append(f11);
        return sb2.toString();
    }
}

package com.google.android.gms.internal.ads;
import g3.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ka1 extends da1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7697a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7698b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7699c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7700d;
    public final q91 e;

    /* renamed from: f, reason: collision with root package name */
    public final ja1 f7701f;

    public ka1(int i, int i10, int i11, int i12, q91 q91Var, ja1 ja1Var) {
        this.f7697a = i;
        this.f7698b = i10;
        this.f7699c = i11;
        this.f7700d = i12;
        this.e = q91Var;
        this.f7701f = ja1Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.e != q91.B;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ka1) {
            ka1 ka1Var = (ka1) obj;
            if (ka1Var.f7697a == this.f7697a && ka1Var.f7698b == this.f7698b && ka1Var.f7699c == this.f7699c && ka1Var.f7700d == this.f7700d && ka1Var.e == this.e && ka1Var.f7701f == this.f7701f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(ka1.class, Integer.valueOf(this.f7697a), Integer.valueOf(this.f7698b), Integer.valueOf(this.f7699c), Integer.valueOf(this.f7700d), this.e, this.f7701f);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f7701f);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i = this.f7699c;
        int length3 = String.valueOf(i).length();
        int i10 = this.f7700d;
        int length4 = String.valueOf(i10).length();
        int i11 = this.f7697a;
        int length5 = String.valueOf(i11).length();
        int i12 = this.f7698b;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i12).length() + 15);
        g3.a.t(sb2, "AesCtrHmacAead Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        g3.a.r(i, i10, ", ", "-byte IV, and ", sb2);
        g3.a.r(i11, i12, "-byte tags, and ", "-byte AES key, and ", sb2);
        sb2.append("-byte HMAC key)");
        return sb2.toString();
    }
}

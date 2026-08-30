package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ne1 extends qe1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8678a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8679b;

    /* renamed from: c, reason: collision with root package name */
    public final ja1 f8680c;

    /* renamed from: d, reason: collision with root package name */
    public final me1 f8681d;

    public ne1(int i, int i10, ja1 ja1Var, me1 me1Var) {
        this.f8678a = i;
        this.f8679b = i10;
        this.f8680c = ja1Var;
        this.f8681d = me1Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f8680c != ja1.J;
    }

    public final int b() {
        ja1 ja1Var = ja1.J;
        int i = this.f8679b;
        ja1 ja1Var2 = this.f8680c;
        if (ja1Var2 == ja1Var) {
            return i;
        }
        if (ja1Var2 == ja1.G || ja1Var2 == ja1.H || ja1Var2 == ja1.I) {
            return i + 5;
        }
        q.x.o("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ne1) {
            ne1 ne1Var = (ne1) obj;
            if (ne1Var.f8678a == this.f8678a && ne1Var.b() == b() && ne1Var.f8680c == this.f8680c && ne1Var.f8681d == this.f8681d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(ne1.class, Integer.valueOf(this.f8678a), Integer.valueOf(this.f8679b), this.f8680c, this.f8681d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8680c);
        String valueOf2 = String.valueOf(this.f8681d);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i = this.f8679b;
        int length3 = String.valueOf(i).length();
        int i10 = this.f8678a;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i10).length() + 10);
        g3.a.t(sb2, "HMAC Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        g3.a.r(i, i10, ", ", "-byte tags, and ", sb2);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}

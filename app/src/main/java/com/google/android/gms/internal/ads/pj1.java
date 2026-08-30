package com.google.android.gms.internal.ads;
import g3.a;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes.dex */
public final class pj1 extends qe1 {
    public static final BigInteger e = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f9533a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f9534b;

    /* renamed from: c, reason: collision with root package name */
    public final q91 f9535c;

    /* renamed from: d, reason: collision with root package name */
    public final oj1 f9536d;

    public pj1(int i, BigInteger bigInteger, q91 q91Var, oj1 oj1Var) {
        this.f9533a = i;
        this.f9534b = bigInteger;
        this.f9535c = q91Var;
        this.f9536d = oj1Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f9535c != q91.N;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pj1)) {
            return false;
        }
        pj1 pj1Var = (pj1) obj;
        if (pj1Var.f9533a != this.f9533a || !Objects.equals(pj1Var.f9534b, this.f9534b) || pj1Var.f9535c != this.f9535c || pj1Var.f9536d != this.f9536d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(pj1.class, Integer.valueOf(this.f9533a), this.f9534b, this.f9535c, this.f9536d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9535c);
        String valueOf2 = String.valueOf(this.f9536d);
        String valueOf3 = String.valueOf(this.f9534b);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int i = this.f9533a;
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        g3.a.t(sb2, "RSA SSA PKCS1 Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        sb2.append(", publicExponent: ");
        sb2.append(valueOf3);
        sb2.append(", and ");
        sb2.append(i);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }
}

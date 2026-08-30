package com.google.android.gms.internal.ads;
import g3.a;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vj1 extends qe1 {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f11922g = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f11923a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f11924b;

    /* renamed from: c, reason: collision with root package name */
    public final w91 f11925c;

    /* renamed from: d, reason: collision with root package name */
    public final uj1 f11926d;
    public final uj1 e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11927f;

    public vj1(int i, BigInteger bigInteger, w91 w91Var, uj1 uj1Var, uj1 uj1Var2, int i10) {
        this.f11923a = i;
        this.f11924b = bigInteger;
        this.f11925c = w91Var;
        this.f11926d = uj1Var;
        this.e = uj1Var2;
        this.f11927f = i10;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f11925c != w91.f12194u;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vj1)) {
            return false;
        }
        vj1 vj1Var = (vj1) obj;
        if (vj1Var.f11923a != this.f11923a || !Objects.equals(vj1Var.f11924b, this.f11924b) || !Objects.equals(vj1Var.f11925c, this.f11925c) || !Objects.equals(vj1Var.f11926d, this.f11926d) || !Objects.equals(vj1Var.e, this.e) || vj1Var.f11927f != this.f11927f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(vj1.class, Integer.valueOf(this.f11923a), this.f11924b, this.f11925c, this.f11926d, this.e, Integer.valueOf(this.f11927f));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11925c);
        String valueOf2 = String.valueOf(this.f11926d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f11924b);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int i = this.f11927f;
        int length4 = String.valueOf(i).length();
        int length5 = valueOf4.length();
        int i10 = this.f11923a;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i10).length() + 13);
        g3.a.t(sb2, "RSA SSA PSS Parameters (variant: ", valueOf, ", signature hashType: ", valueOf2);
        sb2.append(", mgf1 hashType: ");
        sb2.append(valueOf3);
        sb2.append(", saltLengthBytes: ");
        sb2.append(i);
        sb2.append(", publicExponent: ");
        sb2.append(valueOf4);
        sb2.append(", and ");
        sb2.append(i10);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }
}

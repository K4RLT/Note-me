package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class bj1 extends qe1 {

    /* renamed from: a, reason: collision with root package name */
    public final w91 f4810a;

    /* renamed from: b, reason: collision with root package name */
    public final aj1 f4811b;

    /* renamed from: c, reason: collision with root package name */
    public final q91 f4812c;

    /* renamed from: d, reason: collision with root package name */
    public final x91 f4813d;

    public bj1(w91 w91Var, aj1 aj1Var, q91 q91Var, x91 x91Var) {
        this.f4810a = w91Var;
        this.f4811b = aj1Var;
        this.f4812c = q91Var;
        this.f4813d = x91Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f4813d != x91.f12524y;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bj1) {
            bj1 bj1Var = (bj1) obj;
            if (bj1Var.f4810a == this.f4810a && bj1Var.f4811b == this.f4811b && bj1Var.f4812c == this.f4812c && bj1Var.f4813d == this.f4813d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(bj1.class, this.f4810a, this.f4811b, this.f4812c, this.f4813d);
    }

    public final String toString() {
        String str = this.f4813d.f12526b;
        int length = str.length();
        String str2 = this.f4812c.f9792v;
        int length2 = str2.length();
        String str3 = this.f4810a.f12196b;
        int length3 = str3.length();
        String str4 = this.f4811b.f4527a;
        StringBuilder sb2 = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        g3.a.t(sb2, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        g3.a.t(sb2, ", encoding: ", str3, ", curve: ", str4);
        sb2.append(")");
        return sb2.toString();
    }
}

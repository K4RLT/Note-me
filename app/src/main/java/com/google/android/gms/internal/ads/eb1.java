package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class eb1 extends da1 {

    /* renamed from: a, reason: collision with root package name */
    public final ja1 f5640a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5641b;

    /* renamed from: c, reason: collision with root package name */
    public final x91 f5642c;

    /* renamed from: d, reason: collision with root package name */
    public final da1 f5643d;

    public eb1(ja1 ja1Var, String str, x91 x91Var, da1 da1Var) {
        this.f5640a = ja1Var;
        this.f5641b = str;
        this.f5642c = x91Var;
        this.f5643d = da1Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f5640a != ja1.F;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eb1) {
            eb1 eb1Var = (eb1) obj;
            if (eb1Var.f5642c.equals(this.f5642c) && eb1Var.f5643d.equals(this.f5643d) && eb1Var.f5641b.equals(this.f5641b) && eb1Var.f5640a.equals(this.f5640a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(eb1.class, this.f5641b, this.f5642c, this.f5643d, this.f5640a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5642c);
        String valueOf2 = String.valueOf(this.f5643d);
        String valueOf3 = String.valueOf(this.f5640a);
        String str = this.f5641b;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 64 + length2 + 27 + valueOf2.length() + 11 + valueOf3.length() + 1);
        g3.a.t(sb2, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", valueOf);
        g3.a.t(sb2, ", dekParametersForNewKeys: ", valueOf2, ", variant: ", valueOf3);
        sb2.append(")");
        return sb2.toString();
    }
}

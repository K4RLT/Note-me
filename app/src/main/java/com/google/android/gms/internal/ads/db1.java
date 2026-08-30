package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class db1 extends ca1 {
    public final eb1 P;
    public final gl1 Q;
    public final Integer R;

    public db1(eb1 eb1Var, gl1 gl1Var, Integer num) {
        super(27);
        this.P = eb1Var;
        this.Q = gl1Var;
        this.R = num;
    }

    public static db1 h0(eb1 eb1Var, Integer num) {
        gl1 b10;
        ja1 ja1Var = eb1Var.f5640a;
        if (ja1Var == ja1.F) {
            if (num == null) {
                b10 = kd1.f7721a;
            } else {
                androidx.datastore.preferences.protobuf.s1.q("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
        } else if (ja1Var == ja1.E) {
            if (num != null) {
                b10 = kd1.b(num.intValue());
            } else {
                androidx.datastore.preferences.protobuf.s1.q("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(ja1Var)));
        }
        return new db1(eb1Var, b10, num);
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final Integer E() {
        return this.R;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final gl1 g0() {
        return this.Q;
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final /* synthetic */ v91 s() {
        return this.P;
    }
}

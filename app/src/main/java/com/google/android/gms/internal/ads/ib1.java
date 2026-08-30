package com.google.android.gms.internal.ads;
import a5.a;
import p.a;
import q.x;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class ib1 extends ca1 {
    public final kb1 P;
    public final bl0 Q;
    public final gl1 R;
    public final Integer S;

    public ib1(kb1 kb1Var, bl0 bl0Var, gl1 gl1Var, Integer num) {
        super(27);
        this.P = kb1Var;
        this.Q = bl0Var;
        this.R = gl1Var;
        this.S = num;
    }

    public static ib1 h0(kb1 kb1Var, bl0 bl0Var, Integer num) {
        gl1 b10;
        gl1 gl1Var = (gl1) bl0Var.f4819v;
        q91 q91Var = kb1Var.f7711a;
        q91 q91Var2 = q91.G;
        if (q91Var != q91Var2 && num == null) {
            String str = q91Var.f9792v;
            throw new GeneralSecurityException(a.o(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (q91Var == q91Var2 && num != null) {
            androidx.datastore.preferences.protobuf.s1.q("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (gl1Var.f6427a.length == 32) {
            if (q91Var == q91Var2) {
                b10 = kd1.f7721a;
            } else if (q91Var == q91.F) {
                b10 = kd1.b(num.intValue());
            } else {
                x.o("Unknown Variant: ".concat(q91Var.f9792v));
                return null;
            }
            return new ib1(kb1Var, bl0Var, b10, num);
        }
        int length = gl1Var.f6427a.length;
        throw new GeneralSecurityException(a.f(length, "XAesGcmKey key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 68)));
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final Integer E() {
        return this.S;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final gl1 g0() {
        return this.R;
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final /* synthetic */ v91 s() {
        return this.P;
    }
}

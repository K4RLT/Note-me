package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class lb1 extends ca1 {
    public final nb1 P;
    public final bl0 Q;
    public final gl1 R;
    public final Integer S;

    public lb1(nb1 nb1Var, bl0 bl0Var, gl1 gl1Var, Integer num) {
        super(27);
        this.P = nb1Var;
        this.Q = bl0Var;
        this.R = gl1Var;
        this.S = num;
    }

    public static lb1 h0(w91 w91Var, bl0 bl0Var, Integer num) {
        gl1 b10;
        String str = w91Var.f12196b;
        gl1 gl1Var = (gl1) bl0Var.f4819v;
        w91 w91Var2 = w91.f12188o;
        if (w91Var != w91Var2 && num == null) {
            throw new GeneralSecurityException(p.a.o(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (w91Var == w91Var2 && num != null) {
            androidx.datastore.preferences.protobuf.s1.q("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (gl1Var.f6427a.length == 32) {
            nb1 nb1Var = new nb1(w91Var);
            if (w91Var == w91Var2) {
                b10 = kd1.f7721a;
            } else if (w91Var == w91.f12187n) {
                b10 = kd1.a(num.intValue());
            } else if (w91Var == w91.f12186m) {
                b10 = kd1.b(num.intValue());
            } else {
                q.x.o("Unknown Variant: ".concat(str));
                return null;
            }
            return new lb1(nb1Var, bl0Var, b10, num);
        }
        int length = gl1Var.f6427a.length;
        throw new GeneralSecurityException(a5.a.f(length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 75)));
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

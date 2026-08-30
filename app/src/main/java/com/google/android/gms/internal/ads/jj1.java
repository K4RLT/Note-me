package com.google.android.gms.internal.ads;
import a5.a;
import p.a;
import q.x;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class jj1 extends bk1 {
    public final gj1 P;
    public final gl1 Q;
    public final gl1 R;
    public final Integer S;

    public jj1(gj1 gj1Var, gl1 gl1Var, gl1 gl1Var2, Integer num) {
        super(27);
        this.P = gj1Var;
        this.Q = gl1Var;
        this.R = gl1Var2;
        this.S = num;
    }

    public static jj1 h0(ja1 ja1Var, gl1 gl1Var, Integer num) {
        gl1 a10;
        String str = ja1Var.f7390v;
        byte[] bArr = gl1Var.f6427a;
        gj1 gj1Var = new gj1(ja1Var);
        ja1 ja1Var2 = ja1.N;
        if (!ja1Var.equals(ja1Var2) && num == null) {
            throw new GeneralSecurityException(p.a.o(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (ja1Var.equals(ja1Var2) && num != null) {
            androidx.datastore.preferences.protobuf.s1.q("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (bArr.length == 32) {
            if (ja1Var == ja1Var2) {
                a10 = kd1.f7721a;
            } else if (ja1Var != ja1.L && ja1Var != ja1.M) {
                if (ja1Var == ja1.K) {
                    a10 = kd1.b(num.intValue());
                } else {
                    q.x.o("Unknown Variant: ".concat(str));
                    return null;
                }
            } else {
                a10 = kd1.a(num.intValue());
            }
            return new jj1(gj1Var, gl1Var, a10, num);
        }
        int length = bArr.length;
        throw new GeneralSecurityException(a5.a.f(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final Integer E() {
        return this.S;
    }

    @Override // com.google.android.gms.internal.ads.bk1
    public final gl1 g0() {
        return this.R;
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final /* synthetic */ v91 s() {
        return this.P;
    }
}

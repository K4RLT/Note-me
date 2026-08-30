package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hj1 extends ak1 {
    public final jj1 P;
    public final bl0 Q;

    public hj1(jj1 jj1Var, bl0 bl0Var) {
        super(27);
        this.P = jj1Var;
        this.Q = bl0Var;
    }

    public static hj1 h0(jj1 jj1Var, bl0 bl0Var) {
        gl1 gl1Var = (gl1) bl0Var.f4819v;
        if (gl1Var.f6427a.length == 32) {
            if (Arrays.equals(jj1Var.Q.b(), ed1.m(ed1.w(gl1Var.b())))) {
                return new hj1(jj1Var, bl0Var);
            }
            androidx.datastore.preferences.protobuf.s1.q("Ed25519 keys mismatch");
            return null;
        }
        int length = gl1Var.f6427a.length;
        throw new GeneralSecurityException(a5.a.f(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
    }

    @Override // com.google.android.gms.internal.ads.ak1
    public final /* synthetic */ bk1 g0() {
        return this.P;
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final v91 s() {
        return this.P.P;
    }
}

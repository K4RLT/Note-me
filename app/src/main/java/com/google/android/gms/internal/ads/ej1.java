package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* loaded from: classes.dex */
public final class ej1 extends bk1 {
    public final bj1 P;
    public final ECPoint Q;
    public final gl1 R;
    public final Integer S;

    public ej1(bj1 bj1Var, ECPoint eCPoint, gl1 gl1Var, Integer num) {
        super(27);
        this.P = bj1Var;
        this.Q = eCPoint;
        this.R = gl1Var;
        this.S = num;
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

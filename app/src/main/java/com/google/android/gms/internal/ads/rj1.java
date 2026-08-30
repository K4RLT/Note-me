package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class rj1 extends bk1 {
    public final pj1 P;
    public final BigInteger Q;
    public final gl1 R;
    public final Integer S;

    public rj1(pj1 pj1Var, BigInteger bigInteger, gl1 gl1Var, Integer num) {
        super(27);
        this.P = pj1Var;
        this.Q = bigInteger;
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

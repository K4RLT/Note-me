package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ye1 extends xy {
    public final ze1 P;
    public final bl0 Q;

    public ye1(ze1 ze1Var, bl0 bl0Var) {
        super(27);
        this.P = ze1Var;
        this.Q = bl0Var;
    }

    public static ye1 g0(ze1 ze1Var, bl0 bl0Var) {
        if (ze1Var.f13158a == ((gl1) bl0Var.f4819v).f6427a.length) {
            return new ye1(ze1Var, bl0Var);
        }
        androidx.datastore.preferences.protobuf.s1.q("Key size mismatch");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final Integer E() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final /* synthetic */ v91 s() {
        return this.P;
    }
}

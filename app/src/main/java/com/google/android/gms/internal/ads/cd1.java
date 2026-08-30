package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cd1 extends xy {
    public final yd1 P;

    public cd1(yd1 yd1Var) {
        super(27);
        this.P = yd1Var;
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final Integer E() {
        return (Integer) this.P.f12860z;
    }

    public final gl1 g0() {
        yd1 yd1Var = this.P;
        x91 x91Var = (x91) yd1Var.f12859y;
        Integer num = (Integer) yd1Var.f12860z;
        if (x91Var.equals(x91.f12506f)) {
            return gl1.a(new byte[0]);
        }
        if (x91Var.equals(x91.f12505d)) {
            return kd1.b(num.intValue());
        }
        if (!x91Var.equals(x91.e) && !x91Var.equals(x91.f12507g)) {
            androidx.datastore.preferences.protobuf.s1.q("Unknown output prefix type");
            return null;
        }
        return kd1.a(num.intValue());
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final v91 s() {
        yd1 yd1Var = this.P;
        return new bd1((String) yd1Var.f12855u, (x91) yd1Var.f12859y);
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class yj0 extends gk0 {
    public final i90 E;

    public yj0(q60 q60Var, e90 e90Var, a70 a70Var, g70 g70Var, j70 j70Var, y60 y60Var, h80 h80Var, l90 l90Var, r70 r70Var, i90 i90Var, f80 f80Var) {
        super(q60Var, e90Var, a70Var, g70Var, j70Var, h80Var, r70Var, l90Var, f80Var, y60Var);
        this.E = i90Var;
    }

    @Override // com.google.android.gms.internal.ads.gk0, com.google.android.gms.internal.ads.as
    public final void D() {
        this.E.l();
    }

    @Override // com.google.android.gms.internal.ads.gk0, com.google.android.gms.internal.ads.as
    public final void N3(qv qvVar) {
        this.E.K(qvVar);
    }

    @Override // com.google.android.gms.internal.ads.gk0, com.google.android.gms.internal.ads.as
    public final void d4() {
        this.E.E();
    }

    @Override // com.google.android.gms.internal.ads.gk0, com.google.android.gms.internal.ads.as
    public final void n() {
        this.E.E();
    }

    @Override // com.google.android.gms.internal.ads.gk0, com.google.android.gms.internal.ads.as
    public final void s() {
        this.E.K(null);
    }

    @Override // com.google.android.gms.internal.ads.gk0, com.google.android.gms.internal.ads.as
    public final void z0(sv svVar) {
        this.E.K(new qv(svVar.a(), svVar.b()));
    }
}

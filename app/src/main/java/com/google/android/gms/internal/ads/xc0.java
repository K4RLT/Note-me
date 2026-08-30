package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xc0 implements xp {

    /* renamed from: u, reason: collision with root package name */
    public final g70 f12546u;

    /* renamed from: v, reason: collision with root package name */
    public final qv f12547v;

    /* renamed from: w, reason: collision with root package name */
    public final String f12548w;

    /* renamed from: x, reason: collision with root package name */
    public final String f12549x;

    public xc0(g70 g70Var, qp0 qp0Var) {
        this.f12546u = g70Var;
        this.f12547v = qp0Var.f9944l;
        this.f12548w = qp0Var.f9940j;
        this.f12549x = qp0Var.f9942k;
    }

    @Override // com.google.android.gms.internal.ads.xp
    public final void E() {
        this.f12546u.P1(f70.f5957y);
    }

    @Override // com.google.android.gms.internal.ads.xp
    public final void K(qv qvVar) {
        int i;
        String str;
        qv qvVar2 = this.f12547v;
        if (qvVar2 != null) {
            qvVar = qvVar2;
        }
        if (qvVar != null) {
            str = qvVar.f9994u;
            i = qvVar.f9995v;
        } else {
            i = 1;
            str = "";
        }
        iv ivVar = new iv(str, i);
        g70 g70Var = this.f12546u;
        g70Var.getClass();
        g70Var.P1(new hq0(ivVar, this.f12548w, this.f12549x, 10, false));
    }

    @Override // com.google.android.gms.internal.ads.xp
    public final void l() {
        this.f12546u.P1(f70.f5956x);
    }
}

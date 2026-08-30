package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class m01 implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p01 f8200b;

    public /* synthetic */ m01(p01 p01Var, int i) {
        this.f8199a = i;
        this.f8200b = p01Var;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final /* synthetic */ ac.b l(Object obj) {
        switch (this.f8199a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                p01 p01Var = this.f8200b;
                if (!booleanValue) {
                    p01Var.f9307d.b(1003);
                    return ed1.e(o01.f8902v);
                }
                return p01Var.b(0);
            default:
                ty0 ty0Var = (ty0) obj;
                k11 k11Var = this.f8200b.f9306c;
                if (ty0Var.G() == 2) {
                    return k11Var.b(ty0Var.z(), ty0Var.A().a());
                }
                if (ty0Var.G() == 3) {
                    return k11Var.c(ty0Var.z(), ty0Var.B().a(), ty0Var.A().a());
                }
                g5.q.f("Unreachable");
                return null;
        }
    }
}

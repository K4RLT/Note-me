package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class e0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5565u;

    /* renamed from: v, reason: collision with root package name */
    public final my1 f5566v;

    public /* synthetic */ e0(my1 my1Var, int i) {
        this.f5565u = i;
        this.f5566v = my1Var;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.wx1, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5565u) {
            case 0:
                my1 my1Var = this.f5566v;
                for (ry1 ry1Var : my1Var.M) {
                    ry1Var.k(true);
                    if (ry1Var.f10376g != null) {
                        ry1Var.f10376g = null;
                        ry1Var.f10375f = null;
                    }
                }
                zd1 zd1Var = my1Var.E;
                n2 n2Var = (n2) zd1Var.f13143w;
                if (n2Var != null) {
                    n2Var.b();
                    zd1Var.f13143w = null;
                }
                zd1Var.f13144x = null;
                return;
            case 1:
                my1 my1Var2 = this.f5566v;
                if (!my1Var2.f8491h0) {
                    Object r12 = my1Var2.J;
                    r12.getClass();
                    r12.j(my1Var2);
                    return;
                }
                return;
            case 2:
                this.f5566v.f8485b0 = true;
                return;
            default:
                this.f5566v.q();
                return;
        }
    }
}
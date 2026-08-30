package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gw extends cw {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6487u;

    /* renamed from: v, reason: collision with root package name */
    public final z8.u f6488v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f6489w;

    public /* synthetic */ gw(z8.u uVar, Object obj, int i) {
        this.f6487u = i;
        this.f6488v = uVar;
        this.f6489w = obj;
    }

    @Override // com.google.android.gms.internal.ads.dw
    public final void a() {
        lw lwVar;
        switch (this.f6487u) {
            case 0:
                m9.b bVar = (m9.b) this.f6488v;
                if (bVar != null) {
                    bVar.b((fw) this.f6489w);
                    return;
                }
                return;
            default:
                rf0 rf0Var = (rf0) this.f6488v;
                if (rf0Var != null && (lwVar = (lw) this.f6489w) != null) {
                    rf0Var.b(lwVar);
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.dw
    public final void r(g9.y1 y1Var) {
        switch (this.f6487u) {
            case 0:
                m9.b bVar = (m9.b) this.f6488v;
                if (bVar != null) {
                    bVar.a(y1Var.b());
                    return;
                }
                return;
            default:
                rf0 rf0Var = (rf0) this.f6488v;
                if (rf0Var != null) {
                    rf0Var.a(y1Var.b());
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.dw
    public final void u(int i) {
        int i10 = this.f6487u;
    }

    private final void v4(int i) {
    }

    private final void w4(int i) {
    }
}

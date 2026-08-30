package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rt0 extends cw {

    /* renamed from: u, reason: collision with root package name */
    public mp0 f10286u;

    /* renamed from: v, reason: collision with root package name */
    public i0.m f10287v;

    /* renamed from: w, reason: collision with root package name */
    public String f10288w;

    @Override // com.google.android.gms.internal.ads.dw
    public final void a() {
        i0.m mVar = this.f10287v;
        mp0 mp0Var = this.f10286u;
        if (mp0Var != null && mVar != null) {
            ((d91) mVar.f18055w).d(mp0Var);
            this.f10286u = null;
            this.f10287v = null;
            this.f10288w = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.dw
    public final void r(g9.y1 y1Var) {
        i0.m mVar = this.f10287v;
        if (this.f10286u != null && mVar != null) {
            String lVar = y1Var.b().toString();
            String str = this.f10288w;
            StringBuilder sb2 = new StringBuilder(String.valueOf(lVar).length() + 51 + String.valueOf(str).length());
            sb2.append("Failed to load rewarded ad with error: ");
            sb2.append(lVar);
            sb2.append(", adUnitId: ");
            sb2.append(str);
            l9.i.f(sb2.toString());
            ((dt0) mVar.f18054v).c(y1Var);
            this.f10286u = null;
            this.f10287v = null;
            this.f10288w = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.dw
    public final void u(int i) {
        this.f10286u = null;
        this.f10287v = null;
        this.f10288w = null;
    }
}

package com.google.android.gms.internal.ads;
import g9.a0;
import g9.y1;
import g9.z;
import i0.m;
import l9.i;

/* loaded from: classes.dex */
public final class gt0 extends z {

    /* renamed from: u, reason: collision with root package name */
    public cl0 f6447u;

    /* renamed from: v, reason: collision with root package name */
    public m f6448v;

    /* renamed from: w, reason: collision with root package name */
    public String f6449w;

    @Override // a0
    public final void X0(y1 y1Var) {
        m mVar = this.f6448v;
        if (this.f6447u != null && mVar != null) {
            String lVar = y1Var.b().toString();
            String str = this.f6449w;
            StringBuilder sb2 = new StringBuilder(lVar.length() + 57 + String.valueOf(str).length());
            sb2.append("Failed to load interstitial ad with error: ");
            sb2.append(lVar);
            sb2.append(" for ad unit: ");
            sb2.append(str);
            i.f(sb2.toString());
            ((dt0) mVar.f18054v).c(y1Var);
            this.f6447u = null;
            this.f6448v = null;
            this.f6449w = null;
        }
    }

    @Override // a0
    public final void l() {
        m mVar = this.f6448v;
        cl0 cl0Var = this.f6447u;
        if (cl0Var != null && mVar != null) {
            ((d91) mVar.f18055w).d(cl0Var);
            this.f6447u = null;
            this.f6448v = null;
            this.f6449w = null;
        }
    }
}

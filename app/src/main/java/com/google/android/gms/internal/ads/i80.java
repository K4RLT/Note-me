package com.google.android.gms.internal.ads;
import g9.r;

/* loaded from: classes.dex */
public final class i80 implements a80 {

    /* renamed from: u, reason: collision with root package name */
    public int f7048u;

    /* renamed from: v, reason: collision with root package name */
    public int f7049v;

    @Override // com.google.android.gms.internal.ads.a80
    public final synchronized void S(wp0 wp0Var) {
        if (((Boolean) r.e.f17698c.a(sl.P1)).booleanValue()) {
            try {
                sp0 sp0Var = (sp0) wp0Var.f12313b.f11471w;
                this.f7048u = sp0Var.f11092c;
                this.f7049v = sp0Var.f11093d;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void r(dv dvVar) {
    }
}

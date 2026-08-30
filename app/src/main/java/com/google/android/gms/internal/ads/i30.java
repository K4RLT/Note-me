package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class i30 implements s60 {

    /* renamed from: u, reason: collision with root package name */
    public final qp0 f6970u;

    /* renamed from: v, reason: collision with root package name */
    public final sx f6971v;

    public i30(qp0 qp0Var, sx sxVar) {
        this.f6970u = qp0Var;
        this.f6971v = sxVar;
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void C() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void E() {
        if (this.f6970u.f9955r0) {
            sx sxVar = this.f6971v;
            synchronized (sxVar.f11183u) {
                qx qxVar = sxVar.f11186x;
                synchronized (qxVar.f10015f) {
                    qxVar.f10020l++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void F() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void v(iv ivVar, String str, String str2) {
    }
}

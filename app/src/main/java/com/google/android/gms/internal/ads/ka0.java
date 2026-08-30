package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ka0 implements ai {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f7695u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ na0 f7696v;

    public ka0(na0 na0Var, String str) {
        this.f7695u = str;
        this.f7696v = na0Var;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    @Override // com.google.android.gms.internal.ads.ai
    public final void k(zh zhVar) {
        if (((Boolean) g9.r.e.f17698c.a(sl.f10901q2)).booleanValue()) {
            synchronized (this) {
                try {
                    if (zhVar.f13171j) {
                        na0 na0Var = this.f7696v;
                        if (na0Var.f8625w != null) {
                            na0Var.H.put(this.f7695u, Boolean.TRUE);
                            Object r02 = na0Var.f8625w;
                            if (r02 == 0) {
                                return;
                            } else {
                                na0Var.t(r02.M0(), na0Var.f8625w.d(), na0Var.f8625w.g(), true);
                            }
                        }
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zhVar.f13171j) {
            na0 na0Var2 = this.f7696v;
            if (na0Var2.f8625w != null) {
                na0Var2.H.put(this.f7695u, Boolean.TRUE);
                Object r03 = na0Var2.f8625w;
                if (r03 != 0) {
                    na0Var2.t(r03.M0(), r03.d(), r03.g(), true);
                }
            }
        }
    }
}

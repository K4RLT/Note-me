package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes.dex */
public final class f implements e7 {

    /* renamed from: u, reason: collision with root package name */
    public final a6 f13400u;

    /* renamed from: v, reason: collision with root package name */
    public final d7 f13401v;

    /* renamed from: w, reason: collision with root package name */
    public final d7 f13402w;

    public f(a6 a6Var, d7 d7Var, d7 d7Var2) {
        this.f13400u = a6Var;
        this.f13401v = d7Var;
        this.f13402w = d7Var2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.f7
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nd.o zzb() {
        Application application = (Application) this.f13400u.f13354v;
        g gVar = (g) this.f13401v.zzb();
        q3 q3Var = (q3) this.f13402w.zzb();
        c0 c0Var = d0.f13388b;
        f0.c(c0Var);
        return new nd.o(application, gVar, q3Var, c0Var);
    }
}

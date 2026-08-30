package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes.dex */
public final class e4 implements e7 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13396u;

    /* renamed from: v, reason: collision with root package name */
    public final a6 f13397v;

    /* renamed from: w, reason: collision with root package name */
    public final d7 f13398w;

    public /* synthetic */ e4(a6 a6Var, d7 d7Var, int i) {
        this.f13396u = i;
        this.f13397v = a6Var;
        this.f13398w = d7Var;
    }

    public m a() {
        return new m((Application) this.f13397v.f13354v, (g) this.f13398w.zzb());
    }

    @Override // com.google.android.gms.internal.consent_sdk.f7
    public final Object zzb() {
        switch (this.f13396u) {
            case 0:
                return new q3((Application) this.f13397v.f13354v, (d) this.f13398w.zzb());
            default:
                return a();
        }
    }
}

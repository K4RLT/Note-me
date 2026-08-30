package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes.dex */
public final class e implements e7 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13394u;

    /* renamed from: v, reason: collision with root package name */
    public final a6 f13395v;

    public /* synthetic */ e(a6 a6Var, int i) {
        this.f13394u = i;
        this.f13395v = a6Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.f7
    public final Object zzb() {
        switch (this.f13394u) {
            case 0:
                return new d((Application) this.f13395v.f13354v);
            case 1:
                return new g((Application) this.f13395v.f13354v);
            default:
                return new x((Application) this.f13395v.f13354v);
        }
    }
}

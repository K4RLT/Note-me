package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class sx0 implements wr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11190b;

    public /* synthetic */ sx0(int i, Object obj) {
        this.f11189a = i;
        this.f11190b = obj;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final /* synthetic */ Object zzb() {
        switch (this.f11189a) {
            case 0:
                return new zq0(4, (o80) ((o80) this.f11190b).f9020a);
            case 1:
                return new lt0(2, (o80) ((o80) this.f11190b).f9020a);
            case 2:
                return new to0(4, (o80) ((o80) this.f11190b).f9020a);
            default:
                tw twVar = (tw) this.f11190b;
                return new com.google.android.gms.internal.consent_sdk.c((o80) twVar.f11470v, (tw) twVar.f11473y);
        }
    }
}

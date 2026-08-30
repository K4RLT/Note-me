package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum wk implements fn1 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* renamed from: u, reason: collision with root package name */
    public final int f12259u;

    wk(int i) {
        this.f12259u = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12259u);
    }

    @Override // com.google.android.gms.internal.ads.fn1
    public final int zza() {
        return this.f12259u;
    }
}

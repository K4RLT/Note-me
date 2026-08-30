package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum kj implements fn1 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);


    /* renamed from: u, reason: collision with root package name */
    public final int f7768u;

    kj(int i) {
        this.f7768u = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7768u);
    }

    @Override // com.google.android.gms.internal.ads.fn1
    public final int zza() {
        return this.f7768u;
    }
}

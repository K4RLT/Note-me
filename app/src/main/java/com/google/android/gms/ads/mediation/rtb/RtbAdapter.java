package com.google.android.gms.ads.mediation.rtb;

import n9.a;
import n9.e;
import n9.j;
import n9.m;
import n9.r;
import n9.u;
import n9.y;
import p9.b;

/* loaded from: classes.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(p9.a aVar, b bVar);

    public void loadRtbAppOpenAd(j jVar, e eVar) {
        loadAppOpenAd(jVar, eVar);
    }

    public void loadRtbBannerAd(m mVar, e eVar) {
        loadBannerAd(mVar, eVar);
    }

    public void loadRtbInterstitialAd(r rVar, e eVar) {
        loadInterstitialAd(rVar, eVar);
    }

    @Deprecated
    public void loadRtbNativeAd(u uVar, e eVar) {
        loadNativeAd(uVar, eVar);
    }

    public void loadRtbNativeAdMapper(u uVar, e eVar) {
        loadNativeAdMapper(uVar, eVar);
    }

    public void loadRtbRewardedAd(y yVar, e eVar) {
        loadRewardedAd(yVar, eVar);
    }

    public void loadRtbRewardedInterstitialAd(y yVar, e eVar) {
        loadRewardedInterstitialAd(yVar, eVar);
    }
}

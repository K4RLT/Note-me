package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import n9.f;
import n9.g;
import n9.s;

@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends g {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, s sVar, Bundle bundle, f fVar, Bundle bundle2);

    void showInterstitial();
}

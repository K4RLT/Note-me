package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import n9.f;
import o9.a;
import o9.c;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, c cVar, String str, f fVar, Bundle bundle);

    void showInterstitial();
}

package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import n9.f;
import o9.a;
import o9.b;
import z8.h;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBanner extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, b bVar, String str, h hVar, f fVar, Bundle bundle);
}

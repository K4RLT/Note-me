package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import n9.a0;
import o9.a;
import o9.d;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, a0 a0Var, Bundle bundle);
}

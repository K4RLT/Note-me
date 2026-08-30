package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import n9.a0;
import n9.g;
import n9.v;

@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends g {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, v vVar, Bundle bundle, a0 a0Var, Bundle bundle2);
}

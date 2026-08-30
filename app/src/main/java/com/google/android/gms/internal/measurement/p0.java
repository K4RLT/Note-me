package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: classes.dex */
public interface p0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(t0 t0Var);

    void getAppInstanceId(t0 t0Var);

    void getCachedAppInstanceId(t0 t0Var);

    void getConditionalUserProperties(String str, String str2, t0 t0Var);

    void getCurrentScreenClass(t0 t0Var);

    void getCurrentScreenName(t0 t0Var);

    void getGmpAppId(t0 t0Var);

    void getMaxUserProperties(String str, t0 t0Var);

    void getSessionId(t0 t0Var);

    void getTestFlag(t0 t0Var, int i);

    void getUserProperties(String str, String str2, boolean z3, t0 t0Var);

    void initForTests(Map map);

    void initialize(oa.a aVar, a1 a1Var, long j10);

    void isDataCollectionEnabled(t0 t0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z9, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, t0 t0Var, long j10);

    void logHealthData(int i, String str, oa.a aVar, oa.a aVar2, oa.a aVar3);

    void onActivityCreated(oa.a aVar, Bundle bundle, long j10);

    void onActivityDestroyed(oa.a aVar, long j10);

    void onActivityPaused(oa.a aVar, long j10);

    void onActivityResumed(oa.a aVar, long j10);

    void onActivitySaveInstanceState(oa.a aVar, t0 t0Var, long j10);

    void onActivityStarted(oa.a aVar, long j10);

    void onActivityStopped(oa.a aVar, long j10);

    void performAction(Bundle bundle, t0 t0Var, long j10);

    void registerOnMeasurementEventListener(u0 u0Var);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(oa.a aVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z3);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(u0 u0Var);

    void setInstanceIdProvider(y0 y0Var);

    void setMeasurementEnabled(boolean z3, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, oa.a aVar, boolean z3, long j10);

    void unregisterOnMeasurementEventListener(u0 u0Var);
}

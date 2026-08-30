package com.google.android.gms.internal.measurement;
import f0.b;
import f0.c;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;

/* loaded from: classes.dex */
public final class r0 extends oh implements p0 {
    @Override // com.google.android.gms.internal.measurement.p0
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel g02 = g0();
        g02.writeString(str);
        g02.writeLong(j10);
        z1(g02, 23);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel g02 = g0();
        g02.writeString(str);
        g02.writeString(str2);
        f0.c(g02, bundle);
        z1(g02, 9);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void clearMeasurementEnabled(long j10) {
        Parcel g02 = g0();
        g02.writeLong(j10);
        z1(g02, 43);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void endAdUnitExposure(String str, long j10) {
        Parcel g02 = g0();
        g02.writeString(str);
        g02.writeLong(j10);
        z1(g02, 24);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void generateEventId(t0 t0Var) {
        Parcel g02 = g0();
        f0.b(g02, t0Var);
        z1(g02, 22);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void getCachedAppInstanceId(t0 t0Var) {
        Parcel g02 = g0();
        f0.b(g02, t0Var);
        z1(g02, 19);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void getConditionalUserProperties(String str, String str2, t0 t0Var) {
        Parcel g02 = g0();
        g02.writeString(str);
        g02.writeString(str2);
        f0.b(g02, t0Var);
        z1(g02, 10);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void getCurrentScreenClass(t0 t0Var) {
        Parcel g02 = g0();
        f0.b(g02, t0Var);
        z1(g02, 17);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void getCurrentScreenName(t0 t0Var) {
        Parcel g02 = g0();
        f0.b(g02, t0Var);
        z1(g02, 16);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void getGmpAppId(t0 t0Var) {
        Parcel g02 = g0();
        f0.b(g02, t0Var);
        z1(g02, 21);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void getMaxUserProperties(String str, t0 t0Var) {
        Parcel g02 = g0();
        g02.writeString(str);
        f0.b(g02, t0Var);
        z1(g02, 6);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void getUserProperties(String str, String str2, boolean z3, t0 t0Var) {
        Parcel g02 = g0();
        g02.writeString(str);
        g02.writeString(str2);
        ClassLoader classLoader = f0.f13745a;
        g02.writeInt(z3 ? 1 : 0);
        f0.b(g02, t0Var);
        z1(g02, 5);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void initialize(oa.a aVar, a1 a1Var, long j10) {
        Parcel g02 = g0();
        f0.b(g02, aVar);
        f0.c(g02, a1Var);
        g02.writeLong(j10);
        z1(g02, 1);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z9, long j10) {
        Parcel g02 = g0();
        g02.writeString(str);
        g02.writeString(str2);
        f0.c(g02, bundle);
        g02.writeInt(z3 ? 1 : 0);
        g02.writeInt(1);
        g02.writeLong(j10);
        z1(g02, 2);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void logHealthData(int i, String str, oa.a aVar, oa.a aVar2, oa.a aVar3) {
        Parcel g02 = g0();
        g02.writeInt(5);
        g02.writeString("Error with data collection. Data lost.");
        f0.b(g02, aVar);
        f0.b(g02, aVar2);
        f0.b(g02, aVar3);
        z1(g02, 33);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void onActivityCreated(oa.a aVar, Bundle bundle, long j10) {
        Parcel g02 = g0();
        f0.b(g02, aVar);
        f0.c(g02, bundle);
        g02.writeLong(j10);
        z1(g02, 27);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void onActivityDestroyed(oa.a aVar, long j10) {
        Parcel g02 = g0();
        f0.b(g02, aVar);
        g02.writeLong(j10);
        z1(g02, 28);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void onActivityPaused(oa.a aVar, long j10) {
        Parcel g02 = g0();
        f0.b(g02, aVar);
        g02.writeLong(j10);
        z1(g02, 29);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void onActivityResumed(oa.a aVar, long j10) {
        Parcel g02 = g0();
        f0.b(g02, aVar);
        g02.writeLong(j10);
        z1(g02, 30);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void onActivitySaveInstanceState(oa.a aVar, t0 t0Var, long j10) {
        Parcel g02 = g0();
        f0.b(g02, aVar);
        f0.b(g02, t0Var);
        g02.writeLong(j10);
        z1(g02, 31);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void onActivityStarted(oa.a aVar, long j10) {
        Parcel g02 = g0();
        f0.b(g02, aVar);
        g02.writeLong(j10);
        z1(g02, 25);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void onActivityStopped(oa.a aVar, long j10) {
        Parcel g02 = g0();
        f0.b(g02, aVar);
        g02.writeLong(j10);
        z1(g02, 26);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void registerOnMeasurementEventListener(u0 u0Var) {
        Parcel g02 = g0();
        f0.b(g02, u0Var);
        z1(g02, 35);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel g02 = g0();
        f0.c(g02, bundle);
        g02.writeLong(j10);
        z1(g02, 8);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void setCurrentScreen(oa.a aVar, String str, String str2, long j10) {
        Parcel g02 = g0();
        f0.b(g02, aVar);
        g02.writeString(str);
        g02.writeString(str2);
        g02.writeLong(j10);
        z1(g02, 15);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void setDataCollectionEnabled(boolean z3) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void setMeasurementEnabled(boolean z3, long j10) {
        Parcel g02 = g0();
        ClassLoader classLoader = f0.f13745a;
        g02.writeInt(z3 ? 1 : 0);
        g02.writeLong(j10);
        z1(g02, 11);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void setUserProperty(String str, String str2, oa.a aVar, boolean z3, long j10) {
        Parcel g02 = g0();
        g02.writeString(str);
        g02.writeString(str2);
        f0.b(g02, aVar);
        g02.writeInt(z3 ? 1 : 0);
        g02.writeLong(j10);
        z1(g02, 4);
    }
}

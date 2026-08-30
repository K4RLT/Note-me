package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes.dex */
public final class j0 implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f7267a;

    public j0(d dVar, Runnable runnable) {
        this.f7267a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z3) {
        this.f7267a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z3) {
        this.f7267a.run();
    }
}

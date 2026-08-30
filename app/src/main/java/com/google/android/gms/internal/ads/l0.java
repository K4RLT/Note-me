package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.media.Spatializer;
import android.view.AttachedSurfaceControl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l0 {
    public static /* bridge */ /* synthetic */ int a(Spatializer spatializer) {
        return spatializer.getImmersiveAudioLevel();
    }

    public static /* bridge */ /* synthetic */ int b(AttachedSurfaceControl attachedSurfaceControl) {
        return attachedSurfaceControl.getBufferTransformHint();
    }

    public static /* bridge */ /* synthetic */ Spatializer c(AudioManager audioManager) {
        return audioManager.getSpatializer();
    }

    public static /* bridge */ /* synthetic */ Spatializer d(Object obj) {
        return (Spatializer) obj;
    }

    public static /* bridge */ /* synthetic */ void h(Spatializer spatializer, k0 k0Var, j0 j0Var) {
        spatializer.addOnSpatializerStateChangedListener(k0Var, j0Var);
    }
}

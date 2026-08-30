package com.google.android.filament.utils;

import java.nio.Buffer;

/* loaded from: classes.dex */
public final class KTX1Loader {
    private final native long nCreateIndirectLight(long j10, Buffer buffer, int i, boolean z3);

    private final native long nCreateKTXTexture(long j10, Buffer buffer, int i, boolean z3);

    private final native long nCreateSkybox(long j10, Buffer buffer, int i, boolean z3);

    private final native boolean nGetSphericalHarmonics(Buffer buffer, int i, float[] fArr);
}

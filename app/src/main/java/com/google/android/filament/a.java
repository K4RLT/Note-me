package com.google.android.filament;

import android.opengl.EGL14;
import android.view.Surface;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4240b = 0;

    static {
        EGL14.eglGetDisplay(0);
    }

    @Override // com.google.android.filament.e
    public final boolean b(Object obj) {
        return obj instanceof Surface;
    }
}

package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class l1 implements DisplayManager.DisplayListener {

    /* renamed from: u, reason: collision with root package name */
    public final Choreographer f7916u;

    /* renamed from: v, reason: collision with root package name */
    public final DisplayManager f7917v;

    /* renamed from: w, reason: collision with root package name */
    public volatile long f7918w = -9223372036854775807L;

    /* renamed from: x, reason: collision with root package name */
    public volatile long f7919x = -9223372036854775807L;

    public /* synthetic */ l1(Choreographer choreographer, DisplayManager displayManager) {
        this.f7916u = choreographer;
        this.f7917v = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class gp0 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        String str = bq0.f4860a;
        return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
    }
}

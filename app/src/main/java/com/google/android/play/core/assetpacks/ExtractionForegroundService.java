package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import lb.h0;

/* loaded from: classes.dex */
public class ExtractionForegroundService extends Service {

    /* renamed from: u, reason: collision with root package name */
    public final h0 f15574u = new h0(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f15574u;
    }
}

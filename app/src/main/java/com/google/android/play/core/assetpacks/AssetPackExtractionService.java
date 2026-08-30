package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import lb.p0;
import lb.r;
import mb.e;

/* loaded from: classes.dex */
public class AssetPackExtractionService extends Service {

    /* renamed from: u, reason: collision with root package name */
    public r f15573u;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f15573u;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f15573u = (r) ((e) p0.b(getApplicationContext()).f18915w).b();
    }
}

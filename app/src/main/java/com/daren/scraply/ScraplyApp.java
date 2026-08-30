package com.daren.scraply;

import android.app.Application;
import b8.m7;
import pf.b0;
import pf.l0;
import pf.y0;

/* loaded from: classes.dex */
public class ScraplyApp extends Application {
    public ScraplyApp() {
        System.setProperty("kotlinx.coroutines.DefaultExecutor.keepAlive", "86400000");
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        try {
            b0.x(y0.f22811u, l0.f22767a, new m7(2, null, 2), 2);
        } catch (Throwable unused) {
        }
    }
}

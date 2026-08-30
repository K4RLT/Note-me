package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public class gu0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: u, reason: collision with root package name */
    public boolean f6456u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6457v;

    /* renamed from: w, reason: collision with root package name */
    public fu0 f6458w;

    public boolean a() {
        return false;
    }

    public void b(boolean z3) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f6457v) {
            this.f6457v = true;
            if (this.f6456u) {
                b(true);
                fu0 fu0Var = this.f6458w;
                if (fu0Var != null) {
                    fu0Var.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        boolean z3;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance != 100 && !a()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f6457v != z3) {
            this.f6457v = z3;
            if (this.f6456u) {
                b(z3);
                fu0 fu0Var = this.f6458w;
                if (fu0Var != null) {
                    fu0Var.a(z3);
                }
            }
        }
    }
}

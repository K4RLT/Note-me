package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class e1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f1 f13725u;

    public e1(f1 f1Var) {
        this.f13725u = f1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f13725u.e(new b1(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f13725u.e(new n1(this, activity, 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f13725u.e(new n1(this, activity, 3));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f13725u.e(new n1(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        q0 q0Var = new q0();
        this.f13725u.e(new b1(this, activity, q0Var));
        Bundle g02 = q0Var.g0(50L);
        if (g02 != null) {
            bundle.putAll(g02);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f13725u.e(new n1(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f13725u.e(new n1(this, activity, 2));
    }
}

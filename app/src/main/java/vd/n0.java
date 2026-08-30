package vd;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class n0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: u, reason: collision with root package name */
    public static final n0 f27623u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static boolean f27624v;

    /* renamed from: w, reason: collision with root package name */
    public static j6.i f27625w;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        j6.i iVar = f27625w;
        if (iVar != null) {
            iVar.l(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        pe.z zVar;
        activity.getClass();
        j6.i iVar = f27625w;
        if (iVar != null) {
            iVar.l(1);
            zVar = pe.z.f22715a;
        } else {
            zVar = null;
        }
        if (zVar == null) {
            f27624v = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}

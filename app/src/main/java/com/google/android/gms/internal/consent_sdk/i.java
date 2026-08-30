package com.google.android.gms.internal.consent_sdk;
import e7.e;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: u, reason: collision with root package name */
    public final Activity f13435u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f13436v;

    public i(k kVar, Activity activity) {
        Objects.requireNonNull(kVar);
        this.f13436v = kVar;
        this.f13435u = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        k kVar = this.f13436v;
        Dialog dialog = kVar.f13466g;
        AtomicReference atomicReference = kVar.f13470l;
        if (dialog != null && kVar.f13471m) {
            dialog.setOwnerActivity(activity);
            r rVar = kVar.f13462b;
            if (rVar != null) {
                rVar.f13534a = activity;
            }
            i iVar = (i) atomicReference.getAndSet(null);
            if (iVar != null) {
                iVar.f13436v.f13461a.unregisterActivityLifecycleCallbacks(iVar);
                i iVar2 = new i(kVar, activity);
                kVar.f13461a.registerActivityLifecycleCallbacks(iVar2);
                atomicReference.set(iVar2);
            }
            Dialog dialog2 = kVar.f13466g;
            if (dialog2 != null) {
                dialog2.show();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity == this.f13435u) {
            boolean isChangingConfigurations = activity.isChangingConfigurations();
            k kVar = this.f13436v;
            if (isChangingConfigurations && kVar.f13471m && (dialog = kVar.f13466g) != null) {
                dialog.dismiss();
                return;
            }
            l1 l1Var = new l1(3, "Activity is destroyed.");
            Dialog dialog2 = kVar.f13466g;
            if (dialog2 != null) {
                dialog2.dismiss();
                kVar.f13466g = null;
            }
            kVar.f13462b.f13534a = null;
            i iVar = (i) kVar.f13470l.getAndSet(null);
            if (iVar != null) {
                iVar.f13436v.f13461a.unregisterActivityLifecycleCallbacks(iVar);
            }
            e eVar = (e) kVar.f13469k.getAndSet(null);
            if (eVar == null) {
                return;
            }
            kVar.c(l1Var);
            eVar.a(l1Var.a());
        }
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

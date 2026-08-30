package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class gi implements Application.ActivityLifecycleCallbacks {
    public f B;
    public long D;

    /* renamed from: u, reason: collision with root package name */
    public Activity f6400u;

    /* renamed from: v, reason: collision with root package name */
    public Application f6401v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f6402w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f6403x = new AtomicBoolean(true);

    /* renamed from: y, reason: collision with root package name */
    public boolean f6404y = false;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f6405z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public boolean C = false;

    public final void a(Activity activity) {
        synchronized (this.f6402w) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f6400u = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f6402w) {
            try {
                Activity activity2 = this.f6400u;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f6400u = null;
                }
                ArrayList arrayList = this.A;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    try {
                        ((kd0) obj).d();
                    } catch (Exception e) {
                        f9.k.C.f16817h.d("AppActivityTracker.ActivityListener.onActivityDestroyed", e);
                        int i10 = k9.a0.f19634b;
                        l9.i.d("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.f6402w) {
            ArrayList arrayList = this.A;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                try {
                    ((kd0) obj).c();
                } catch (Exception e) {
                    f9.k.C.f16817h.d("AppActivityTracker.ActivityListener.onActivityPaused", e);
                    int i10 = k9.a0.f19634b;
                    l9.i.d("", e);
                }
            }
        }
        this.f6404y = true;
        f fVar = this.B;
        if (fVar != null) {
            k9.f0.f19676l.removeCallbacks(fVar);
        }
        k9.b0 b0Var = k9.f0.f19676l;
        f fVar2 = new f(9, this);
        this.B = fVar2;
        b0Var.postDelayed(fVar2, this.D);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        int i = 0;
        this.f6404y = false;
        boolean andSet = this.f6403x.getAndSet(true);
        f fVar = this.B;
        if (fVar != null) {
            k9.f0.f19676l.removeCallbacks(fVar);
        }
        synchronized (this.f6402w) {
            ArrayList arrayList = this.A;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                try {
                    ((kd0) obj).b();
                } catch (Exception e) {
                    f9.k.C.f16817h.d("AppActivityTracker.ActivityListener.onActivityResumed", e);
                    int i11 = k9.a0.f19634b;
                    l9.i.d("", e);
                }
            }
            if (!andSet) {
                ArrayList arrayList2 = this.f6405z;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    try {
                        ((ii) obj2).g0(true);
                    } catch (Exception e8) {
                        int i12 = k9.a0.f19634b;
                        l9.i.d("", e8);
                    }
                }
            } else {
                int i13 = k9.a0.f19634b;
                l9.i.a("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class wf implements Application.ActivityLifecycleCallbacks {

    /* renamed from: v, reason: collision with root package name */
    public final Application f12223v;

    /* renamed from: w, reason: collision with root package name */
    public final WeakReference f12224w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12222u = 1;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12225x = false;

    public wf(Application application, bi biVar) {
        this.f12224w = new WeakReference(biVar);
        this.f12223v = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.f12222u;
        Application application = this.f12223v;
        WeakReference weakReference = this.f12224w;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception e) {
                    int i10 = k9.a0.f19634b;
                    l9.i.d("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.f12222u;
        Application application = this.f12223v;
        WeakReference weakReference = this.f12224w;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception e) {
                    int i10 = k9.a0.f19634b;
                    l9.i.d("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.f12222u;
        Application application = this.f12223v;
        WeakReference weakReference = this.f12224w;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception e) {
                    int i10 = k9.a0.f19634b;
                    l9.i.d("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = this.f12222u;
        Application application = this.f12223v;
        WeakReference weakReference = this.f12224w;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception e) {
                    int i10 = k9.a0.f19634b;
                    l9.i.d("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.f12222u;
        Application application = this.f12223v;
        WeakReference weakReference = this.f12224w;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception e) {
                    int i10 = k9.a0.f19634b;
                    l9.i.d("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.f12222u;
        Application application = this.f12223v;
        WeakReference weakReference = this.f12224w;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception e) {
                    int i10 = k9.a0.f19634b;
                    l9.i.d("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.f12222u;
        Application application = this.f12223v;
        WeakReference weakReference = this.f12224w;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.f12225x) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f12225x = true;
                    }
                    return;
                } catch (Exception e) {
                    int i10 = k9.a0.f19634b;
                    l9.i.d("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    public wf(Application application, ig igVar) {
        this.f12224w = new WeakReference(igVar);
        this.f12223v = application;
    }
}

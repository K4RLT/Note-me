package eb;
import c.a;
import v.h;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.i00;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16165u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f16166v;

    public h2() {
        this.f16165u = 1;
        this.f16166v = Collections.newSetFromMap(new WeakHashMap());
    }

    public static void a(Intent intent) {
        boolean equals;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null) {
            equals = false;
        } else {
            equals = "1".equals(bundle.getString("google.a.e"));
        }
        if (equals) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.a.tc"))) {
                    fc.b bVar = (fc.b) bc.g.c().b(fc.b.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (bVar != null) {
                        String string = bundle.getString("google.a.c_id");
                        fc.c cVar = (fc.c) bVar;
                        if (gc.a.d("fcm") && gc.a.b("fcm", "_ln")) {
                            com.google.android.gms.internal.measurement.f1 f1Var = (com.google.android.gms.internal.measurement.f1) cVar.f16949a.f31922v;
                            f1Var.e(new com.google.android.gms.internal.measurement.h1(f1Var, "fcm", "_ln", string, true, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string);
                        cVar.a("fcm", bundle2, "_cmp");
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            nd.h("_no", bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        boolean z3;
        switch (this.f16165u) {
            case 0:
                t1 t1Var = (t1) this.f16166v;
                try {
                    try {
                        t1Var.f().I.g("onActivityCreated");
                        Intent intent = activity.getIntent();
                        if (intent == null) {
                            t1Var.w().D(activity, bundle);
                            return;
                        }
                        Uri data = intent.getData();
                        if (data == null || !data.isHierarchical()) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                String string = extras.getString("com.android.vending.referral_url");
                                if (!TextUtils.isEmpty(string)) {
                                    data = Uri.parse(string);
                                }
                            }
                            data = null;
                        }
                        Uri uri = data;
                        if (uri != null && uri.isHierarchical()) {
                            t1Var.t();
                            if (l3.e0(intent)) {
                                str = "gs";
                            } else {
                                str = "auto";
                            }
                            String str2 = str;
                            String queryParameter = uri.getQueryParameter("referrer");
                            if (bundle == null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            t1Var.h().D(new e2(this, z3, uri, str2, queryParameter));
                            t1Var.w().D(activity, bundle);
                            return;
                        }
                        return;
                    } catch (RuntimeException e) {
                        t1Var.f().A.f(e, "Throwable caught in onActivityCreated");
                        t1Var.w().D(activity, bundle);
                        return;
                    }
                } finally {
                    t1Var.w().D(activity, bundle);
                }
            default:
                Intent intent2 = activity.getIntent();
                if (intent2 != null && ((Set) this.f16166v).add(intent2)) {
                    if (Build.VERSION.SDK_INT <= 25) {
                        new Handler(Looper.getMainLooper()).post(new a6.e(this, intent2));
                        return;
                    } else {
                        a(intent2);
                        return;
                    }
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f16165u) {
            case 0:
                l2 w10 = ((t1) this.f16166v).w();
                synchronized (w10.G) {
                    try {
                        if (activity == w10.B) {
                            w10.B = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (((d1) w10.f3443v).A.I()) {
                    w10.A.remove(activity);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f16165u) {
            case 0:
                l2 w10 = ((t1) this.f16166v).w();
                synchronized (w10.G) {
                    w10.F = false;
                    w10.C = true;
                }
                ((d1) w10.f3443v).H.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (!((d1) w10.f3443v).A.I()) {
                    w10.f16222x = null;
                    w10.h().D(new i00(w10, elapsedRealtime, 2));
                } else {
                    k2 H = w10.H(activity);
                    w10.f16223y = w10.f16222x;
                    w10.f16222x = null;
                    w10.h().D(new com.google.android.gms.internal.ads.t1(w10, H, elapsedRealtime, 4));
                }
                v2 x9 = ((t1) this.f16166v).x();
                ((d1) x9.f3443v).H.getClass();
                x9.h().D(new x2(x9, SystemClock.elapsedRealtime(), 0));
                return;
            default:
                if (activity.isFinishing()) {
                    ((Set) this.f16166v).remove(activity.getIntent());
                    return;
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f16165u) {
            case 0:
                v2 x9 = ((t1) this.f16166v).x();
                ((d1) x9.f3443v).H.getClass();
                x9.h().D(new x2(x9, SystemClock.elapsedRealtime(), 1));
                l2 w10 = ((t1) this.f16166v).w();
                synchronized (w10.G) {
                    w10.F = true;
                    if (activity != w10.B) {
                        synchronized (w10.G) {
                            w10.B = activity;
                            w10.C = false;
                        }
                        if (((d1) w10.f3443v).A.I()) {
                            w10.D = null;
                            w10.h().D(new m2(w10, 1));
                        }
                    }
                }
                if (!((d1) w10.f3443v).A.I()) {
                    w10.f16222x = w10.D;
                    w10.h().D(new m2(w10, 0));
                    return;
                }
                w10.E(activity, w10.H(activity), false);
                q j10 = ((d1) w10.f3443v).j();
                ((d1) j10.f3443v).H.getClass();
                j10.h().D(new i00(j10, SystemClock.elapsedRealtime(), 1));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        k2 k2Var;
        switch (this.f16165u) {
            case 0:
                l2 w10 = ((t1) this.f16166v).w();
                if (((d1) w10.f3443v).A.I() && bundle != null && (k2Var = (k2) w10.A.get(activity)) != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong(FacebookMediationAdapter.KEY_ID, k2Var.f16208c);
                    bundle2.putString("name", k2Var.f16206a);
                    bundle2.putString("referrer_name", k2Var.f16207b);
                    bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.f16165u;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.f16165u;
    }

    public h2(t1 t1Var) {
        this.f16165u = 0;
        this.f16166v = t1Var;
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void d(Activity activity, Bundle bundle) {
    }
}

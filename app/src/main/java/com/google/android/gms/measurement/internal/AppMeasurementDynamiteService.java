package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import b9.a;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.ads.lt;
import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.pu1;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.iw;
import eb.b2;
import eb.d1;
import eb.d2;
import eb.e2;
import eb.h2;
import eb.k0;
import eb.k2;
import eb.l2;
import eb.l3;
import eb.q1;
import eb.s1;
import eb.t;
import eb.t1;
import eb.u;
import eb.v;
import eb.w1;
import eb.y0;
import eb.y1;
import fa.y;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import n.e;
import n.r0;
import oa.b;
import q.x;

/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends s0 {

    /* renamed from: u, reason: collision with root package name */
    public d1 f15571u;

    /* renamed from: v, reason: collision with root package name */
    public final e f15572v;

    /* JADX WARN: Type inference failed for: r0v2, types: [n.e, n.r0] */
    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f15571u = null;
        this.f15572v = new r0(0);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void beginAdUnitExposure(String str, long j10) {
        g0();
        this.f15571u.j().A(j10, str);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        t1Var.M(str, bundle, str2);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void clearMeasurementEnabled(long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        t1Var.y();
        t1Var.h().D(new iv1(11, t1Var, null, false));
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void endAdUnitExposure(String str, long j10) {
        g0();
        this.f15571u.j().D(j10, str);
    }

    public final void g0() {
        if (this.f15571u != null) {
            return;
        }
        x.o("Attempting to perform action before initialize.");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void generateEventId(t0 t0Var) {
        g0();
        l3 l3Var = this.f15571u.F;
        d1.b(l3Var);
        long H0 = l3Var.H0();
        g0();
        l3 l3Var2 = this.f15571u.F;
        d1.b(l3Var2);
        l3Var2.S(t0Var, H0);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void getAppInstanceId(t0 t0Var) {
        g0();
        y0 y0Var = this.f15571u.D;
        d1.d(y0Var);
        y0Var.D(new pu1(9, this, t0Var, false));
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void getCachedAppInstanceId(t0 t0Var) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        r0((String) t1Var.B.get(), t0Var);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void getConditionalUserProperties(String str, String str2, t0 t0Var) {
        g0();
        y0 y0Var = this.f15571u.D;
        d1.d(y0Var);
        y0Var.D(new a(this, t0Var, str, str2, 5, false));
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void getCurrentScreenClass(t0 t0Var) {
        String str;
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        l2 l2Var = ((d1) t1Var.f3443v).I;
        d1.c(l2Var);
        k2 k2Var = l2Var.f16222x;
        if (k2Var != null) {
            str = k2Var.f16207b;
        } else {
            str = null;
        }
        r0(str, t0Var);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void getCurrentScreenName(t0 t0Var) {
        String str;
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        l2 l2Var = ((d1) t1Var.f3443v).I;
        d1.c(l2Var);
        k2 k2Var = l2Var.f16222x;
        if (k2Var != null) {
            str = k2Var.f16206a;
        } else {
            str = null;
        }
        r0(str, t0Var);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void getGmpAppId(t0 t0Var) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        d1 d1Var = (d1) t1Var.f3443v;
        String str = d1Var.f16103v;
        if (str == null) {
            str = null;
            try {
                Context context = d1Var.f16102u;
                String str2 = d1Var.M;
                y.h(context);
                Resources resources = context.getResources();
                if (TextUtils.isEmpty(str2)) {
                    str2 = q1.b(context);
                }
                int identifier = resources.getIdentifier("google_app_id", "string", str2);
                if (identifier != 0) {
                    try {
                        str = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            } catch (IllegalStateException e) {
                k0 k0Var = d1Var.C;
                d1.d(k0Var);
                k0Var.A.f(e, "getGoogleAppId failed with exception");
            }
        }
        r0(str, t0Var);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void getMaxUserProperties(String str, t0 t0Var) {
        g0();
        d1.c(this.f15571u.J);
        y.e(str);
        g0();
        l3 l3Var = this.f15571u.F;
        d1.b(l3Var);
        l3Var.R(t0Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void getSessionId(t0 t0Var) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        t1Var.h().D(new ou1(12, t1Var, t0Var, false));
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void getTestFlag(t0 t0Var, int i) {
        g0();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        l3 l3Var = this.f15571u.F;
                        d1.b(l3Var);
                        t1 t1Var = this.f15571u.J;
                        d1.c(t1Var);
                        AtomicReference atomicReference = new AtomicReference();
                        l3Var.V(t0Var, ((Boolean) t1Var.h().z(atomicReference, 15000L, "boolean test flag value", new y1(t1Var, atomicReference, 0))).booleanValue());
                        return;
                    }
                    l3 l3Var2 = this.f15571u.F;
                    d1.b(l3Var2);
                    t1 t1Var2 = this.f15571u.J;
                    d1.c(t1Var2);
                    AtomicReference atomicReference2 = new AtomicReference();
                    l3Var2.R(t0Var, ((Integer) t1Var2.h().z(atomicReference2, 15000L, "int test flag value", new d2(t1Var2, atomicReference2, 1))).intValue());
                    return;
                }
                l3 l3Var3 = this.f15571u.F;
                d1.b(l3Var3);
                t1 t1Var3 = this.f15571u.J;
                d1.c(t1Var3);
                AtomicReference atomicReference3 = new AtomicReference();
                double doubleValue = ((Double) t1Var3.h().z(atomicReference3, 15000L, "double test flag value", new w1(t1Var3, atomicReference3))).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    t0Var.k0(bundle);
                    return;
                } catch (RemoteException e) {
                    k0 k0Var = ((d1) l3Var3.f3443v).C;
                    d1.d(k0Var);
                    k0Var.D.f(e, "Error returning double value to wrapper");
                    return;
                }
            }
            l3 l3Var4 = this.f15571u.F;
            d1.b(l3Var4);
            t1 t1Var4 = this.f15571u.J;
            d1.c(t1Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            l3Var4.S(t0Var, ((Long) t1Var4.h().z(atomicReference4, 15000L, "long test flag value", new y1(t1Var4, atomicReference4, 1))).longValue());
            return;
        }
        l3 l3Var5 = this.f15571u.F;
        d1.b(l3Var5);
        t1 t1Var5 = this.f15571u.J;
        d1.c(t1Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        l3Var5.a0((String) t1Var5.h().z(atomicReference5, 15000L, "String test flag value", new d2(t1Var5, atomicReference5, 0)), t0Var);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void getUserProperties(String str, String str2, boolean z3, t0 t0Var) {
        g0();
        y0 y0Var = this.f15571u.D;
        d1.d(y0Var);
        y0Var.D(new e2(this, t0Var, str, str2, z3, 1));
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void initForTests(Map map) {
        g0();
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void initialize(oa.a aVar, a1 a1Var, long j10) {
        d1 d1Var = this.f15571u;
        if (d1Var == null) {
            Context context = (Context) b.z1(aVar);
            y.h(context);
            this.f15571u = d1.a(context, a1Var, Long.valueOf(j10));
        } else {
            k0 k0Var = d1Var.C;
            d1.d(k0Var);
            k0Var.D.g("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void isDataCollectionEnabled(t0 t0Var) {
        g0();
        y0 y0Var = this.f15571u.D;
        d1.d(y0Var);
        y0Var.D(new ou1(13, this, t0Var, false));
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z9, long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        t1Var.P(str, str2, bundle, z3, z9, j10);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void logEventAndBundle(String str, String str2, Bundle bundle, t0 t0Var, long j10) {
        Bundle bundle2;
        g0();
        y.e(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        u uVar = new u(str2, new t(bundle), "app", j10);
        y0 y0Var = this.f15571u.D;
        d1.d(y0Var);
        y0Var.D(new a(this, t0Var, uVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void logHealthData(int i, String str, oa.a aVar, oa.a aVar2, oa.a aVar3) {
        Object z12;
        Object z13;
        g0();
        Object obj = null;
        if (aVar == null) {
            z12 = null;
        } else {
            z12 = b.z1(aVar);
        }
        if (aVar2 == null) {
            z13 = null;
        } else {
            z13 = b.z1(aVar2);
        }
        if (aVar3 != null) {
            obj = b.z1(aVar3);
        }
        Object obj2 = obj;
        k0 k0Var = this.f15571u.C;
        d1.d(k0Var);
        k0Var.B(i, true, false, str, z12, z13, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void onActivityCreated(oa.a aVar, Bundle bundle, long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        h2 h2Var = t1Var.f16374x;
        if (h2Var != null) {
            t1 t1Var2 = this.f15571u.J;
            d1.c(t1Var2);
            t1Var2.U();
            h2Var.onActivityCreated((Activity) b.z1(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void onActivityDestroyed(oa.a aVar, long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        h2 h2Var = t1Var.f16374x;
        if (h2Var != null) {
            t1 t1Var2 = this.f15571u.J;
            d1.c(t1Var2);
            t1Var2.U();
            h2Var.onActivityDestroyed((Activity) b.z1(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void onActivityPaused(oa.a aVar, long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        h2 h2Var = t1Var.f16374x;
        if (h2Var != null) {
            t1 t1Var2 = this.f15571u.J;
            d1.c(t1Var2);
            t1Var2.U();
            h2Var.onActivityPaused((Activity) b.z1(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void onActivityResumed(oa.a aVar, long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        h2 h2Var = t1Var.f16374x;
        if (h2Var != null) {
            t1 t1Var2 = this.f15571u.J;
            d1.c(t1Var2);
            t1Var2.U();
            h2Var.onActivityResumed((Activity) b.z1(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void onActivitySaveInstanceState(oa.a aVar, t0 t0Var, long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        h2 h2Var = t1Var.f16374x;
        Bundle bundle = new Bundle();
        if (h2Var != null) {
            t1 t1Var2 = this.f15571u.J;
            d1.c(t1Var2);
            t1Var2.U();
            h2Var.onActivitySaveInstanceState((Activity) b.z1(aVar), bundle);
        }
        try {
            t0Var.k0(bundle);
        } catch (RemoteException e) {
            k0 k0Var = this.f15571u.C;
            d1.d(k0Var);
            k0Var.D.f(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void onActivityStarted(oa.a aVar, long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        if (t1Var.f16374x != null) {
            t1 t1Var2 = this.f15571u.J;
            d1.c(t1Var2);
            t1Var2.U();
        }
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void onActivityStopped(oa.a aVar, long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        if (t1Var.f16374x != null) {
            t1 t1Var2 = this.f15571u.J;
            d1.c(t1Var2);
            t1Var2.U();
        }
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void performAction(Bundle bundle, t0 t0Var, long j10) {
        g0();
        t0Var.k0(null);
    }

    public final void r0(String str, t0 t0Var) {
        g0();
        l3 l3Var = this.f15571u.F;
        d1.b(l3Var);
        l3Var.a0(str, t0Var);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void registerOnMeasurementEventListener(u0 u0Var) {
        Object obj;
        g0();
        synchronized (this.f15572v) {
            try {
                obj = (s1) this.f15572v.get(Integer.valueOf(u0Var.zza()));
                if (obj == null) {
                    obj = new eb.a(this, u0Var);
                    this.f15572v.put(Integer.valueOf(u0Var.zza()), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        t1Var.y();
        if (!t1Var.f16376z.add(obj)) {
            t1Var.f().D.g("OnEventListener already registered");
        }
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void resetAnalyticsData(long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        t1Var.b0(null);
        t1Var.h().D(new b2(t1Var, j10, 1));
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        g0();
        d1 d1Var = this.f15571u;
        if (bundle == null) {
            k0 k0Var = d1Var.C;
            d1.d(k0Var);
            k0Var.A.g("Conditional user property must not be null");
        } else {
            t1 t1Var = d1Var.J;
            d1.c(t1Var);
            t1Var.a0(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setConsent(Bundle bundle, long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        y0 h3 = t1Var.h();
        com.google.android.gms.internal.ads.t1 t1Var2 = new com.google.android.gms.internal.ads.t1();
        t1Var2.f11226w = t1Var;
        t1Var2.f11227x = bundle;
        t1Var2.f11225v = j10;
        h3.E(t1Var2);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setConsentThirdParty(Bundle bundle, long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        t1Var.E(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setCurrentScreen(oa.a aVar, String str, String str2, long j10) {
        String str3;
        g0();
        l2 l2Var = this.f15571u.I;
        d1.c(l2Var);
        Activity activity = (Activity) b.z1(aVar);
        if (!((d1) l2Var.f3443v).A.I()) {
            l2Var.f().F.g("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        k2 k2Var = l2Var.f16222x;
        if (k2Var == null) {
            l2Var.f().F.g("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (l2Var.A.get(activity) == null) {
            l2Var.f().F.g("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = l2Var.C(activity.getClass());
        }
        boolean equals = Objects.equals(k2Var.f16207b, str2);
        boolean equals2 = Objects.equals(k2Var.f16206a, str);
        if (equals && equals2) {
            l2Var.f().F.g("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > ((d1) l2Var.f3443v).A.w(null, false))) {
            l2Var.f().F.f(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2.length() > 0 && str2.length() <= ((d1) l2Var.f3443v).A.w(null, false)) {
            js jsVar = l2Var.f().I;
            if (str == null) {
                str3 = "null";
            } else {
                str3 = str;
            }
            jsVar.h("Setting current screen to name, class", str3, str2);
            k2 k2Var2 = new k2(l2Var.t().H0(), str, str2);
            l2Var.A.put(activity, k2Var2);
            l2Var.E(activity, k2Var2, true);
            return;
        }
        l2Var.f().F.f(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setDataCollectionEnabled(boolean z3) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        t1Var.y();
        t1Var.h().D(new lt(3, t1Var, z3));
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        y0 h3 = t1Var.h();
        ou1 ou1Var = new ou1(11);
        ou1Var.f9238v = t1Var;
        ou1Var.f9239w = bundle2;
        h3.D(ou1Var);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setEventInterceptor(u0 u0Var) {
        boolean z3;
        g0();
        iw iwVar = new iw(14, this, u0Var, false);
        y0 y0Var = this.f15571u.D;
        d1.d(y0Var);
        boolean F = y0Var.F();
        d1 d1Var = this.f15571u;
        if (F) {
            t1 t1Var = d1Var.J;
            d1.c(t1Var);
            t1Var.u();
            t1Var.y();
            iw iwVar2 = t1Var.f16375y;
            if (iwVar != iwVar2) {
                if (iwVar2 == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                y.j("EventInterceptor already set.", z3);
            }
            t1Var.f16375y = iwVar;
            return;
        }
        y0 y0Var2 = d1Var.D;
        d1.d(y0Var2);
        y0Var2.D(new pu1(10, this, iwVar, false));
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.y0 y0Var) {
        g0();
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setMeasurementEnabled(boolean z3, long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        Boolean valueOf = Boolean.valueOf(z3);
        t1Var.y();
        t1Var.h().D(new iv1(11, t1Var, valueOf, false));
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setMinimumSessionDuration(long j10) {
        g0();
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setSessionTimeoutDuration(long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        t1Var.h().D(new b2(t1Var, j10, 0));
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setSgtmDebugInfo(Intent intent) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        a8.a();
        eb.e eVar = ((d1) t1Var.f3443v).A;
        if (eVar.F(null, v.f16422s0)) {
            Uri data = intent.getData();
            if (data == null) {
                t1Var.f().G.g("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter != null && queryParameter.equals("1")) {
                String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    t1Var.f().G.f(queryParameter2, "Preview Mode was enabled. Using the sgtmPreviewKey: ");
                    eVar.f16113x = queryParameter2;
                    return;
                }
                return;
            }
            t1Var.f().G.g("Preview Mode was not enabled.");
            eVar.f16113x = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setUserId(String str, long j10) {
        g0();
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        if (str != null && TextUtils.isEmpty(str)) {
            k0 k0Var = ((d1) t1Var.f3443v).C;
            d1.d(k0Var);
            k0Var.D.g("User ID must be non-empty or null");
        } else {
            y0 h3 = t1Var.h();
            iv1 iv1Var = new iv1(9);
            iv1Var.f7236v = t1Var;
            iv1Var.f7237w = str;
            h3.D(iv1Var);
            t1Var.R(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void setUserProperty(String str, String str2, oa.a aVar, boolean z3, long j10) {
        g0();
        Object z12 = b.z1(aVar);
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        t1Var.R(str, str2, z12, z3, j10);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public void unregisterOnMeasurementEventListener(u0 u0Var) {
        Object obj;
        g0();
        synchronized (this.f15572v) {
            obj = (s1) this.f15572v.remove(Integer.valueOf(u0Var.zza()));
        }
        if (obj == null) {
            obj = new eb.a(this, u0Var);
        }
        t1 t1Var = this.f15571u.J;
        d1.c(t1Var);
        t1Var.y();
        if (!t1Var.f16376z.remove(obj)) {
            t1Var.f().D.g("OnEventListener had not been registered");
        }
    }
}

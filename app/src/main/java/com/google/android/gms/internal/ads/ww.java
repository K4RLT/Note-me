package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ww {
    public be0 e;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f12341a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f12342b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public String f12343c = null;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f12344d = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f12345f = new AtomicInteger(-1);

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f12346g = new AtomicReference(null);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f12347h = new AtomicReference(null);
    public final ConcurrentHashMap i = new ConcurrentHashMap(9);

    /* renamed from: j, reason: collision with root package name */
    public final Object f12348j = new Object();

    public static final Bundle f(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    public static final boolean g(Context context) {
        nl nlVar = sl.T0;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (!((Boolean) qlVar.a(nlVar)).booleanValue() || pa.d.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) qlVar2.a(sl.U0)).intValue()) {
            return false;
        }
        if (((Boolean) qlVar2.a(sl.V0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
                return true;
            }
        }
        return true;
    }

    public final boolean a(Context context) {
        int c10;
        nl nlVar = sl.L0;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && !this.f12344d.get()) {
            if (!((Boolean) rVar.f17698c.a(sl.W0)).booleanValue()) {
                AtomicInteger atomicInteger = this.f12345f;
                if (atomicInteger.get() == -1) {
                    l9.d dVar = g9.p.f17688g.f17689a;
                    ca.f fVar = ca.f.f4036b;
                    if (fVar.c(context, 12451000) == 0 || ((c10 = fVar.c(context, 12451000)) != 0 && c10 != 2)) {
                        atomicInteger.set(1);
                    } else {
                        int i = k9.a0.f19634b;
                        l9.i.f("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    }
                }
                if (atomicInteger.get() == 1) {
                }
            }
            return true;
        }
        return false;
    }

    public final String b(Context context) {
        if (!a(context)) {
            return null;
        }
        synchronized (this.f12342b) {
            try {
                String str = this.f12343c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) k(context, "getGmpAppId");
                this.f12343c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String c(Context context) {
        if (a(context)) {
            nl nlVar = sl.R0;
            g9.r rVar = g9.r.e;
            ql qlVar = rVar.f17698c;
            ql qlVar2 = rVar.f17698c;
            long longValue = ((Long) qlVar.a(nlVar)).longValue();
            if (longValue < 0) {
                return (String) k(context, "getAppInstanceId");
            }
            AtomicReference atomicReference = this.f12341a;
            if (atomicReference.get() == null) {
                nl nlVar2 = sl.S0;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) qlVar2.a(nlVar2)).intValue(), ((Integer) qlVar2.a(nlVar2)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new vw(this));
                while (!atomicReference.compareAndSet(null, threadPoolExecutor) && atomicReference.get() == null) {
                }
            }
            try {
                return (String) ((ExecutorService) atomicReference.get()).submit(new xe(this, 3, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public final String d(Context context) {
        Object k3;
        if (a(context) && (k3 = k(context, "generateEventId")) != null) {
            return k3.toString();
        }
        return null;
    }

    public final void e(Context context, String str, String str2, String str3, int i) {
        if (!a(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str2);
        bundle.putString("reward_type", str3);
        bundle.putInt("reward_value", i);
        h(context, "_ar", str, bundle);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i).length());
        sb2.append("Log a Firebase reward video event, reward type: ");
        sb2.append(str3);
        sb2.append(", reward value: ");
        sb2.append(i);
        k9.a0.k(sb2.toString());
    }

    public final void h(Context context, String str, String str2, Bundle bundle) {
        if (a(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                String valueOf = String.valueOf(str2);
                int i = k9.a0.f19634b;
                l9.i.d("Invalid event ID: ".concat(valueOf), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            AtomicReference atomicReference = this.f12346g;
            if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                ConcurrentHashMap concurrentHashMap = this.i;
                Method method = (Method) concurrentHashMap.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentHashMap.put("logEventInternal", method);
                    } catch (Exception unused) {
                        l("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(atomicReference.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    l("logEventInternal", true);
                }
            }
        }
    }

    public final Method i(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = this.i;
        Method method = (Method) concurrentHashMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            l(str, false);
            return null;
        }
    }

    public final void j(Context context, String str, String str2) {
        AtomicReference atomicReference = this.f12346g;
        if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            ConcurrentHashMap concurrentHashMap = this.i;
            Method method = (Method) concurrentHashMap.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentHashMap.put(str2, method);
                } catch (Exception unused) {
                    l(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(atomicReference.get(), str);
                StringBuilder sb2 = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb2.append("Invoke Firebase method ");
                sb2.append(str2);
                sb2.append(", Ad Unit Id: ");
                sb2.append(str);
                k9.a0.k(sb2.toString());
            } catch (Exception unused2) {
                l(str2, false);
            }
        }
    }

    public final Object k(Context context, String str) {
        AtomicReference atomicReference = this.f12346g;
        if (!m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return i(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            l(str, true);
            return null;
        }
    }

    public final void l(String str, boolean z3) {
        AtomicBoolean atomicBoolean = this.f12344d;
        if (!atomicBoolean.get()) {
            String o10 = p.a.o(new StringBuilder(str.length() + 30), "Invoke Firebase method ", str, " error.");
            int i = k9.a0.f19634b;
            l9.i.f(o10);
            if (z3) {
                l9.i.f("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                atomicBoolean.set(true);
            }
            if (this.e != null) {
                if (this.f12347h.get() != null || this.f12346g.get() != null) {
                    j6.s a10 = this.e.a();
                    a10.k("action", "ga_log_event_error");
                    a10.k("method_name", str);
                    a10.l();
                }
            }
        }
    }

    public final boolean m(Context context, String str, AtomicReference atomicReference, boolean z3) {
        if (atomicReference.get() == null) {
            try {
                Object invoke = context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                while (!atomicReference.compareAndSet(null, invoke) && atomicReference.get() == null) {
                }
                return true;
            } catch (Exception unused) {
                l("getInstance", z3);
                return false;
            }
        }
        return true;
    }
}

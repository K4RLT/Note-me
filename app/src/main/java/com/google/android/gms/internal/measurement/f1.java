package com.google.android.gms.internal.measurement;
import q1.b;
import z5.h;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f1 {
    public static volatile f1 i;

    /* renamed from: a, reason: collision with root package name */
    public final String f13746a = "FA";

    /* renamed from: b, reason: collision with root package name */
    public final la.a f13747b = la.a.f20062a;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f13748c;

    /* renamed from: d, reason: collision with root package name */
    public final h f13749d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public int f13750f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13751g;

    /* renamed from: h, reason: collision with root package name */
    public volatile p0 f13752h;

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, com.google.android.gms.internal.measurement.k1, java.util.concurrent.ThreadFactory] */
    public f1(Context context, Bundle bundle) {
        Object obj = new Object();
        obj.f13796a = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory) obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f13748c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f13749d = new h(7, this);
        this.e = new ArrayList();
        int i10 = 0;
        try {
            String b10 = eb.b(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(b10)) {
                b10 = eb.b(context);
            }
            int identifier = resources.getIdentifier("google_app_id", "string", b10);
            String str = null;
            if (identifier != 0) {
                try {
                    str = resources.getString(identifier);
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (str != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, f1.class.getClassLoader());
                } catch (ClassNotFoundException unused2) {
                    this.f13751g = true;
                    Log.w(this.f13746a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused3) {
        }
        e(new b1(this, context, bundle, i10));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f13746a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new e1(this));
        }
    }

    public static f1 b(Context context, Bundle bundle) {
        fa.y.h(context);
        if (i == null) {
            synchronized (f1.class) {
                try {
                    if (i == null) {
                        i = new f1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public final int a(String str) {
        q0 q0Var = new q0();
        e(new b1(this, str, q0Var, 1));
        Integer num = (Integer) q0.r0(q0Var.g0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final List c(String str, String str2) {
        q0 q0Var = new q0();
        e(new i1(this, str, str2, q0Var, 0));
        List list = (List) q0.r0(q0Var.g0(5000L), List.class);
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    public final Map d(String str, String str2, boolean z3) {
        q0 q0Var = new q0();
        e(new h1(this, str, str2, z3, q0Var));
        Bundle g02 = q0Var.g0(5000L);
        if (g02 != null && g02.size() != 0) {
            HashMap hashMap = new HashMap(g02.size());
            for (String str3 : g02.keySet()) {
                Object obj = g02.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.EMPTY_MAP;
    }

    public final void e(c1 c1Var) {
        this.f13748c.execute(c1Var);
    }

    public final void f(Exception exc, boolean z3, boolean z9) {
        this.f13751g |= z3;
        String str = this.f13746a;
        if (z3) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z9) {
            e(new g1(this, exc));
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }
}
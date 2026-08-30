package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class af0 {

    /* renamed from: d, reason: collision with root package name */
    public final long f4473d;

    /* renamed from: f, reason: collision with root package name */
    public final Context f4474f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakReference f4475g;

    /* renamed from: h, reason: collision with root package name */
    public final od0 f4476h;
    public final Executor i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f4477j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f4478k;

    /* renamed from: l, reason: collision with root package name */
    public final ge0 f4479l;

    /* renamed from: m, reason: collision with root package name */
    public final l9.a f4480m;

    /* renamed from: o, reason: collision with root package name */
    public final t80 f4482o;

    /* renamed from: p, reason: collision with root package name */
    public final vr0 f4483p;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4470a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4471b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4472c = false;
    public final yx e = new yx();

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f4481n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public boolean f4484q = true;

    public af0(Executor executor, Context context, WeakReference weakReference, wx wxVar, od0 od0Var, ScheduledExecutorService scheduledExecutorService, ge0 ge0Var, l9.a aVar, t80 t80Var, vr0 vr0Var) {
        this.f4476h = od0Var;
        this.f4474f = context;
        this.f4475g = weakReference;
        this.i = wxVar;
        this.f4478k = scheduledExecutorService;
        this.f4477j = executor;
        this.f4479l = ge0Var;
        this.f4480m = aVar;
        this.f4482o = t80Var;
        this.f4483p = vr0Var;
        f9.k.C.f16819k.getClass();
        this.f4473d = SystemClock.elapsedRealtime();
        d("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final void a() {
        if (!((Boolean) cn.f5126a.p()).booleanValue()) {
            int i = this.f4480m.f20031w;
            nl nlVar = sl.f10963u2;
            g9.r rVar = g9.r.e;
            if (i >= ((Integer) rVar.f17698c.a(nlVar)).intValue() && this.f4484q) {
                if (!this.f4470a) {
                    synchronized (this) {
                        try {
                            if (this.f4470a) {
                                return;
                            }
                            this.f4479l.d();
                            this.f4482o.a();
                            yx yxVar = this.e;
                            final int i10 = 0;
                            Runnable runnable = new Runnable(this) { // from class: com.google.android.gms.internal.ads.ye0

                                /* renamed from: v, reason: collision with root package name */
                                public final /* synthetic */ af0 f12862v;

                                {
                                    this.f12862v = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            af0 af0Var = this.f12862v;
                                            ge0 ge0Var = af0Var.f4479l;
                                            synchronized (ge0Var) {
                                                try {
                                                    if (((Boolean) g9.r.e.f17698c.a(sl.G2)).booleanValue() && !ge0Var.f6383d) {
                                                        HashMap e = ge0Var.e();
                                                        e.put("action", "init_finished");
                                                        ArrayList arrayList = ge0Var.f6381b;
                                                        arrayList.add(e);
                                                        int size = arrayList.size();
                                                        int i11 = 0;
                                                        while (i11 < size) {
                                                            Object obj = arrayList.get(i11);
                                                            i11++;
                                                            ge0Var.f6384f.b((Map) obj);
                                                        }
                                                        ge0Var.f6383d = true;
                                                    }
                                                } finally {
                                                }
                                            }
                                            af0Var.f4482o.b();
                                            af0Var.f4471b = true;
                                            return;
                                        default:
                                            af0 af0Var2 = this.f12862v;
                                            synchronized (af0Var2) {
                                                try {
                                                    if (!af0Var2.f4472c) {
                                                        f9.k.C.f16819k.getClass();
                                                        af0Var2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - af0Var2.f4473d), "Timeout.", false);
                                                        af0Var2.f4479l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                        af0Var2.f4482o.p("com.google.android.gms.ads.MobileAds", "timeout");
                                                        af0Var2.e.c(new Exception());
                                                        return;
                                                    }
                                                    return;
                                                } finally {
                                                }
                                            }
                                    }
                                }
                            };
                            Executor executor = this.i;
                            yxVar.f12998u.a(runnable, executor);
                            this.f4470a = true;
                            ac.b c10 = c();
                            final int i11 = 1;
                            this.f4478k.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ye0

                                /* renamed from: v, reason: collision with root package name */
                                public final /* synthetic */ af0 f12862v;

                                {
                                    this.f12862v = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            af0 af0Var = this.f12862v;
                                            ge0 ge0Var = af0Var.f4479l;
                                            synchronized (ge0Var) {
                                                try {
                                                    if (((Boolean) g9.r.e.f17698c.a(sl.G2)).booleanValue() && !ge0Var.f6383d) {
                                                        HashMap e = ge0Var.e();
                                                        e.put("action", "init_finished");
                                                        ArrayList arrayList = ge0Var.f6381b;
                                                        arrayList.add(e);
                                                        int size = arrayList.size();
                                                        int i112 = 0;
                                                        while (i112 < size) {
                                                            Object obj = arrayList.get(i112);
                                                            i112++;
                                                            ge0Var.f6384f.b((Map) obj);
                                                        }
                                                        ge0Var.f6383d = true;
                                                    }
                                                } finally {
                                                }
                                            }
                                            af0Var.f4482o.b();
                                            af0Var.f4471b = true;
                                            return;
                                        default:
                                            af0 af0Var2 = this.f12862v;
                                            synchronized (af0Var2) {
                                                try {
                                                    if (!af0Var2.f4472c) {
                                                        f9.k.C.f16819k.getClass();
                                                        af0Var2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - af0Var2.f4473d), "Timeout.", false);
                                                        af0Var2.f4479l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                        af0Var2.f4482o.p("com.google.android.gms.ads.MobileAds", "timeout");
                                                        af0Var2.e.c(new Exception());
                                                        return;
                                                    }
                                                    return;
                                                } finally {
                                                }
                                            }
                                    }
                                }
                            }, ((Long) rVar.f17698c.a(sl.f10993w2)).longValue(), TimeUnit.SECONDS);
                            c10.a(new t81(c10, 0, new jk0(this)), executor);
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return;
            }
        }
        if (!this.f4470a) {
            d("com.google.android.gms.ads.MobileAds", 0, "", true);
            this.e.b(Boolean.FALSE);
            this.f4470a = true;
            this.f4471b = true;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f4481n;
        for (String str : concurrentHashMap.keySet()) {
            eq eqVar = (eq) concurrentHashMap.get(str);
            arrayList.add(new eq(str, eqVar.f5753w, eqVar.f5754x, eqVar.f5752v));
        }
        return arrayList;
    }

    public final synchronized ac.b c() {
        f9.k kVar = f9.k.C;
        String str = kVar.f16817h.g().n().e;
        if (!TextUtils.isEmpty(str)) {
            return ed1.e(str);
        }
        yx yxVar = new yx();
        k9.c0 g8 = kVar.f16817h.g();
        g8.f19644c.add(new ac.a(this, 17, yxVar));
        return yxVar;
    }

    public final void d(String str, int i, String str2, boolean z3) {
        this.f4481n.put(str, new eq(str, i, str2, z3));
    }
}

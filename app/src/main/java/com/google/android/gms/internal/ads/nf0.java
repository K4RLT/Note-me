package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nf0 {

    /* renamed from: a, reason: collision with root package name */
    public final qf0 f8688a;

    /* renamed from: b, reason: collision with root package name */
    public final xf0 f8689b;

    /* renamed from: c, reason: collision with root package name */
    public final ef0 f8690c;

    /* renamed from: d, reason: collision with root package name */
    public final jf0 f8691d;
    public final b0.g1 e;

    /* renamed from: f, reason: collision with root package name */
    public final wf0 f8692f;

    /* renamed from: g, reason: collision with root package name */
    public final xw f8693g;

    /* renamed from: h, reason: collision with root package name */
    public final xw f8694h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f8695j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8696k;

    /* renamed from: p, reason: collision with root package name */
    public JSONObject f8701p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8704s;

    /* renamed from: t, reason: collision with root package name */
    public int f8705t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8706u;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f8697l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f8698m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f8699n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public String f8700o = "{}";

    /* renamed from: q, reason: collision with root package name */
    public long f8702q = Long.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public kf0 f8703r = kf0.f7729u;

    /* renamed from: v, reason: collision with root package name */
    public mf0 f8707v = mf0.f8339u;

    /* renamed from: w, reason: collision with root package name */
    public long f8708w = 0;

    /* renamed from: x, reason: collision with root package name */
    public String f8709x = "";

    public nf0(qf0 qf0Var, xf0 xf0Var, ef0 ef0Var, Context context, l9.a aVar, jf0 jf0Var, wf0 wf0Var, xw xwVar, xw xwVar2, String str) {
        this.f8688a = qf0Var;
        this.f8689b = xf0Var;
        this.f8690c = ef0Var;
        this.e = new b0.g1(context, 2);
        this.i = aVar.f20029u;
        this.f8696k = str;
        this.f8691d = jf0Var;
        this.f8692f = wf0Var;
        this.f8693g = xwVar;
        this.f8694h = xwVar2;
        this.f8695j = context;
        f9.k.C.f16823o.f19708g = this;
    }

    public final void a() {
        String str;
        boolean z3;
        nl nlVar = sl.f10811ka;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            if (((Boolean) rVar.f17698c.a(sl.f11048za)).booleanValue()) {
                k9.c0 g8 = f9.k.C.f16817h.g();
                g8.i();
                synchronized (g8.f19642a) {
                    z3 = g8.f19664y;
                }
                if (z3) {
                    j();
                    return;
                }
            }
            k9.c0 g10 = f9.k.C.f16817h.g();
            g10.i();
            synchronized (g10.f19642a) {
                str = g10.f19663x;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (new JSONObject(str).optBoolean("isTestMode", false)) {
                        j();
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void b(boolean z3) {
        if (!this.f8706u && z3) {
            j();
        }
        g(z3, true);
    }

    public final synchronized void c(String str, gf0 gf0Var) {
        nl nlVar = sl.f10811ka;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && f()) {
            if (this.f8705t >= ((Integer) rVar.f17698c.a(sl.f10841ma)).intValue()) {
                int i = k9.a0.f19634b;
                l9.i.f("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap hashMap = this.f8697l;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new ArrayList());
            }
            this.f8705t++;
            ((List) hashMap.get(str)).add(gf0Var);
            if (((Boolean) rVar.f17698c.a(sl.Ia)).booleanValue()) {
                String str2 = gf0Var.f6389w;
                this.f8698m.put(str2, gf0Var);
                HashMap hashMap2 = this.f8699n;
                if (hashMap2.containsKey(str2)) {
                    List list = (List) hashMap2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((yx) it.next()).b(gf0Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized yx d(String str) {
        yx yxVar;
        try {
            yxVar = new yx();
            HashMap hashMap = this.f8698m;
            if (hashMap.containsKey(str)) {
                yxVar.b((gf0) hashMap.get(str));
            } else {
                HashMap hashMap2 = this.f8699n;
                if (!hashMap2.containsKey(str)) {
                    hashMap2.put(str, new ArrayList());
                }
                ((List) hashMap2.get(str)).add(yxVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return yxVar;
    }

    public final synchronized void e(g9.n1 n1Var, mf0 mf0Var) {
        if (!f()) {
            try {
                n1Var.n4(x21.J(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i = k9.a0.f19634b;
                l9.i.f("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        int i10 = 1;
        if (!((Boolean) g9.r.e.f17698c.a(sl.f10811ka)).booleanValue()) {
            try {
                n1Var.n4(x21.J(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i11 = k9.a0.f19634b;
                l9.i.f("Ad inspector had an internal error.");
                return;
            }
        }
        this.f8707v = mf0Var;
        this.f8688a.a(n1Var, new np(this, i10), new cp(4, this.f8692f), new np(this, 0));
        return;
    }

    public final synchronized boolean f() {
        boolean booleanValue = ((Boolean) g9.r.e.f17698c.a(sl.f11048za)).booleanValue();
        boolean z3 = this.f8704s;
        if (booleanValue) {
            if (!z3) {
                if (!f9.k.C.f16823o.g()) {
                    return false;
                }
            }
            return true;
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:16:0x0029, B:18:0x0038, B:22:0x002d, B:24:0x0033), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f8704s     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.f8704s = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.nl r2 = com.google.android.gms.internal.ads.sl.f11048za     // Catch: java.lang.Throwable -> L27
            g9.r r0 = g9.r.e     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.ql r0 = r0.f17698c     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            f9.k r2 = f9.k.C     // Catch: java.lang.Throwable -> L27
            k9.j r2 = r2.f16823o     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.k()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.f()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.l()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.m()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nf0.g(boolean, boolean):void");
    }

    public final synchronized void h(kf0 kf0Var, boolean z3) {
        try {
            if (this.f8703r != kf0Var) {
                if (f()) {
                    l();
                }
                this.f8703r = kf0Var;
                if (f()) {
                    k();
                }
                if (z3) {
                    m();
                }
            }
        } finally {
        }
    }

    public final synchronized JSONObject i() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f8697l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (gf0 gf0Var : (List) entry.getValue()) {
                    if (gf0Var.f6391y != ff0.f6055u) {
                        jSONArray.put(gf0Var.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void j() {
        String str;
        String str2;
        this.f8706u = true;
        jf0 jf0Var = this.f8691d;
        jf0Var.getClass();
        hf0 hf0Var = new hf0(0, jf0Var);
        af0 af0Var = jf0Var.f7433a;
        af0Var.getClass();
        af0Var.e.f12998u.a(new t81(af0Var, 19, hf0Var), af0Var.f4477j);
        this.f8688a.f9835w = this;
        this.f8689b.f12567f = this;
        this.f8690c.i = this;
        this.f8692f.f12231z = this;
        nl nlVar = sl.Oa;
        g9.r rVar = g9.r.e;
        if (!TextUtils.isEmpty((CharSequence) rVar.f17698c.a(nlVar))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f8695j);
            List asList = Arrays.asList(((String) rVar.f17698c.a(nlVar)).split(","));
            xw xwVar = this.f8693g;
            xwVar.f12642c = asList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(xwVar);
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                xwVar.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        nl nlVar2 = sl.Pa;
        if (!TextUtils.isEmpty((CharSequence) rVar.f17698c.a(nlVar2))) {
            SharedPreferences sharedPreferences = this.f8695j.getSharedPreferences("admob", 0);
            List asList2 = Arrays.asList(((String) rVar.f17698c.a(nlVar2)).split(","));
            xw xwVar2 = this.f8694h;
            xwVar2.f12642c = asList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(xwVar2);
            Iterator it2 = asList2.iterator();
            while (it2.hasNext()) {
                xwVar2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        k9.c0 g8 = f9.k.C.f16817h.g();
        g8.i();
        synchronized (g8.f19642a) {
            str = g8.f19663x;
        }
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    g(jSONObject.optBoolean("isTestMode", false), false);
                    h((kf0) Enum.valueOf(kf0.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f8700o = jSONObject.optString("networkExtras", "{}");
                    this.f8702q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        k9.c0 g10 = f9.k.C.f16817h.g();
        g10.i();
        synchronized (g10.f19642a) {
            str2 = g10.A;
        }
        this.f8709x = str2;
    }

    public final synchronized void k() {
        int ordinal = this.f8703r.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.f8690c.b();
            return;
        }
        this.f8689b.b();
    }

    public final synchronized void l() {
        SensorManager sensorManager;
        Sensor sensor;
        try {
            int ordinal = this.f8703r.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return;
                }
                ef0 ef0Var = this.f8690c;
                synchronized (ef0Var) {
                    try {
                        if (ef0Var.f5682j && (sensorManager = ef0Var.f5675a) != null && (sensor = ef0Var.f5676b) != null) {
                            sensorManager.unregisterListener(ef0Var, sensor);
                            ef0Var.f5682j = false;
                            k9.a0.k("Stopped listening for flick gestures.");
                        }
                    } finally {
                    }
                }
                return;
            }
            xf0 xf0Var = this.f8689b;
            synchronized (xf0Var) {
                try {
                    if (xf0Var.f12568g) {
                        SensorManager sensorManager2 = xf0Var.f12564b;
                        if (sensorManager2 != null) {
                            sensorManager2.unregisterListener(xf0Var, xf0Var.f12565c);
                            k9.a0.k("Stopped listening for shake gestures.");
                        }
                        xf0Var.f12568g = false;
                    }
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public final void m() {
        String jSONObject;
        f9.k kVar = f9.k.C;
        k9.c0 g8 = kVar.f16817h.g();
        synchronized (this) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("isTestMode", this.f8704s);
                jSONObject2.put("gesture", this.f8703r);
                long j10 = this.f8702q;
                kVar.f16819k.getClass();
                if (j10 > System.currentTimeMillis() / 1000) {
                    jSONObject2.put("networkExtras", this.f8700o);
                    jSONObject2.put("networkExtrasExpirationSecs", this.f8702q);
                }
            } catch (JSONException unused) {
            }
            jSONObject = jSONObject2.toString();
        }
        g8.getClass();
        if (((Boolean) g9.r.e.f17698c.a(sl.f10811ka)).booleanValue()) {
            g8.i();
            synchronized (g8.f19642a) {
                try {
                    if (!g8.f19663x.equals(jSONObject)) {
                        g8.f19663x = jSONObject;
                        SharedPreferences.Editor editor = g8.f19647g;
                        if (editor != null) {
                            editor.putString("inspector_info", jSONObject);
                            g8.f19647g.apply();
                        }
                        g8.j();
                    }
                } finally {
                }
            }
        }
    }
}

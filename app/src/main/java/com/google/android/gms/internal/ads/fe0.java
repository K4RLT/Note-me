package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class fe0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6045a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6046b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f6047c;

    /* renamed from: d, reason: collision with root package name */
    public final l9.l f6048d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final c7.a f6049f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6050g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f6051h;
    public final AtomicReference i;

    public fe0(wx wxVar, l9.l lVar, g9.n nVar, c7.a aVar, Context context) {
        Object obj;
        PackageInfo packageInfo;
        HashMap hashMap = new HashMap();
        this.f6045a = hashMap;
        this.f6051h = new AtomicBoolean();
        this.i = new AtomicReference(new Bundle());
        this.f6047c = wxVar;
        this.f6048d = lVar;
        nl nlVar = sl.E2;
        g9.r rVar = g9.r.e;
        this.e = ((Boolean) rVar.f17698c.a(nlVar)).booleanValue();
        this.f6049f = aVar;
        nl nlVar2 = sl.R7;
        ql qlVar = rVar.f17698c;
        this.f6050g = ((Boolean) qlVar.a(nlVar2)).booleanValue();
        this.f6046b = context;
        r9.d dVar = (r9.d) nVar.A;
        hashMap.put("s", "gmob_sdk");
        hashMap.put("v", "3");
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_v", Build.VERSION.SDK);
        f9.k kVar = f9.k.C;
        k9.f0 f0Var = kVar.f16813c;
        px pxVar = kVar.f16817h;
        hashMap.put("device", k9.f0.O());
        hashMap.put("app", (String) nVar.f17679w);
        Context context2 = (Context) nVar.f17678v;
        if (true == k9.f0.f(context2)) {
            obj = "1";
        } else {
            obj = "0";
        }
        hashMap.put("is_lite_sdk", obj);
        ArrayList H = rVar.f17696a.H();
        if (((Boolean) qlVar.a(sl.M7)).booleanValue()) {
            H.addAll(pxVar.g().n().i);
        }
        hashMap.put("e", TextUtils.join(",", H));
        hashMap.put("sdkVersion", (String) nVar.f17680x);
        if (((Boolean) qlVar.a(sl.Kc)).booleanValue()) {
            hashMap.put("is_bstar", true != k9.f0.d(context2) ? "0" : "1");
        }
        if (((Boolean) qlVar.a(sl.La)).booleanValue() && ((Boolean) qlVar.a(sl.f10678c3)).booleanValue()) {
            String str = pxVar.f9637g;
            hashMap.put("plugin", str == null ? "" : str);
        }
        if (((Boolean) qlVar.a(sl.Sc)).booleanValue()) {
            String str2 = (String) nVar.f17682z;
            hashMap.put("uev", str2 != null ? str2 : "");
        }
        if (((Boolean) qlVar.a(sl.V2)).booleanValue()) {
            hashMap.put("mem_tier", ((r9.a) dVar.f24669c.get()).name());
        }
        if (((Boolean) qlVar.a(sl.W2)).booleanValue()) {
            hashMap.put("proc_tier", ((r9.c) dVar.e.get()).name());
        }
        if (((Boolean) qlVar.a(sl.X2)).booleanValue() && (packageInfo = (PackageInfo) nVar.f17681y) != null) {
            hashMap.put("vc", String.valueOf(packageInfo.versionCode));
            hashMap.put("vn", String.valueOf(packageInfo.versionName));
        }
    }

    public final void a(Map map) {
        Bundle b10;
        if (map != null && !map.isEmpty()) {
            boolean andSet = this.f6051h.getAndSet(true);
            AtomicReference atomicReference = this.i;
            if (!andSet) {
                String str = (String) g9.r.e.f17698c.a(sl.Ub);
                xw xwVar = new xw(this, str);
                if (TextUtils.isEmpty(str)) {
                    b10 = Bundle.EMPTY;
                } else {
                    Context context = this.f6046b;
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(xwVar);
                    b10 = wa.f9.b(context, str);
                }
                atomicReference.set(b10);
            }
            Bundle bundle = (Bundle) atomicReference.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
            return;
        }
        int i = k9.a0.f19634b;
        l9.i.a("Empty or null paramMap.");
    }

    public final void b(Map map) {
        if (map.isEmpty()) {
            int i = k9.a0.f19634b;
            l9.i.a("Empty paramMap.");
            return;
        }
        a(map);
        String i10 = this.f6049f.i(map);
        k9.a0.k(i10);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.e) {
            if (!parseBoolean || this.f6050g) {
                this.f6047c.execute(new t81(this, 18, i10));
            }
        }
    }

    public final void c(AbstractMap abstractMap) {
        if (abstractMap.isEmpty()) {
            int i = k9.a0.f19634b;
            l9.i.a("Empty paramMap.");
            return;
        }
        a(abstractMap);
        String i10 = this.f6049f.i(abstractMap);
        k9.a0.k(i10);
        if (!((Boolean) g9.r.e.f17698c.a(sl.Le)).booleanValue() && !this.e) {
            return;
        }
        this.f6047c.execute(new ac.a(this, 16, i10));
    }
}

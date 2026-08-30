package com.google.android.gms.internal.ads;
import ac.a;
import c7.a;
import f9.k;
import g9.n;
import g9.r;
import k9.a0;
import k9.f0;
import l9.i;
import l9.l;
import r9.a;
import r9.c;
import r9.d;
import wa.f9;

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
    public final l f6048d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final a f6049f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6050g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f6051h;
    public final AtomicReference i;

    public fe0(wx wxVar, l lVar, n nVar, a aVar, Context context) {
        Object obj;
        PackageInfo packageInfo;
        HashMap hashMap = new HashMap();
        this.f6045a = hashMap;
        this.f6051h = new AtomicBoolean();
        this.i = new AtomicReference(new Bundle());
        this.f6047c = wxVar;
        this.f6048d = lVar;
        nl nlVar = sl.E2;
        r rVar = r.e;
        this.e = ((Boolean) rVar.f17698c.a(nlVar)).booleanValue();
        this.f6049f = aVar;
        nl nlVar2 = sl.R7;
        ql qlVar = rVar.f17698c;
        this.f6050g = ((Boolean) qlVar.a(nlVar2)).booleanValue();
        this.f6046b = context;
        d dVar = (d) nVar.A;
        hashMap.put("s", "gmob_sdk");
        hashMap.put("v", "3");
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_v", Build.VERSION.SDK);
        k kVar = k.C;
        f0 f0Var = kVar.f16813c;
        px pxVar = kVar.f16817h;
        hashMap.put("device", f0.O());
        hashMap.put("app", (String) nVar.f17679w);
        Context context2 = (Context) nVar.f17678v;
        if (true == f0.f(context2)) {
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
            hashMap.put("is_bstar", true != f0.d(context2) ? "0" : "1");
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
            hashMap.put("mem_tier", ((a) dVar.f24669c.get()).name());
        }
        if (((Boolean) qlVar.a(sl.W2)).booleanValue()) {
            hashMap.put("proc_tier", ((c) dVar.e.get()).name());
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
                String str = (String) r.e.f17698c.a(sl.Ub);
                xw xwVar = new xw(this, str);
                if (TextUtils.isEmpty(str)) {
                    b10 = Bundle.EMPTY;
                } else {
                    Context context = this.f6046b;
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(xwVar);
                    b10 = f9.b(context, str);
                }
                atomicReference.set(b10);
            }
            Bundle bundle = (Bundle) atomicReference.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
            return;
        }
        int i = a0.f19634b;
        i.a("Empty or null paramMap.");
    }

    public final void b(Map map) {
        if (map.isEmpty()) {
            int i = a0.f19634b;
            i.a("Empty paramMap.");
            return;
        }
        a(map);
        String i10 = this.f6049f.i(map);
        a0.k(i10);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.e) {
            if (!parseBoolean || this.f6050g) {
                this.f6047c.execute(new t81(this, 18, i10));
            }
        }
    }

    public final void c(AbstractMap abstractMap) {
        if (abstractMap.isEmpty()) {
            int i = a0.f19634b;
            i.a("Empty paramMap.");
            return;
        }
        a(abstractMap);
        String i10 = this.f6049f.i(abstractMap);
        a0.k(i10);
        if (!((Boolean) r.e.f17698c.a(sl.Le)).booleanValue() && !this.e) {
            return;
        }
        this.f6047c.execute(new a(this, 16, i10));
    }
}

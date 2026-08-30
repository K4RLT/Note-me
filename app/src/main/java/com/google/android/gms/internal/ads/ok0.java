package com.google.android.gms.internal.ads;
import a0.l;
import f9.k;
import g9.r;
import k9.a0;
import r.e;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ok0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9142a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9143b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9144c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f9145d = new HashMap();
    public final HashMap e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Executor f9146f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f9147g;

    public ok0(wx wxVar) {
        this.f9146f = wxVar;
    }

    public static final Bundle j(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized d61 a(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(f9.k.C.f16817h.g().n().e) && (map = (Map) this.f9144c.get(str)) != null) {
                List<pk0> list = (List) map.get(str2);
                if (list == null) {
                    String u9 = xy.u(this.f9147g, str2, str);
                    if (((Boolean) g9.r.e.f17698c.a(sl.f10877oc)).booleanValue()) {
                        u9 = u9.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(u9);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (pk0 pk0Var : list) {
                        String str3 = pk0Var.f9537a;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(pk0Var.f9538b);
                    }
                    return d61.a(hashMap);
                }
            }
            return d61.A;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = this.f9142a;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new pk0(str, new Bundle()));
            }
        }
    }

    public final synchronized void c() {
        this.f9143b.clear();
        this.f9142a.clear();
        this.e.clear();
        this.f9145d.clear();
        f();
        d();
        e();
    }

    public final synchronized void d() {
        JSONObject jSONObject;
        if (!((Boolean) cn.f5131g.p()).booleanValue()) {
            if (((Boolean) g9.r.e.f17698c.a(sl.f10933s2)).booleanValue() && (jSONObject = f9.k.C.f16817h.g().n().f8476g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        Bundle j10 = j(jSONObject2.optJSONObject("data"));
                        String optString = jSONObject2.optString("adapter_class_name");
                        boolean optBoolean = jSONObject2.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f9143b.put(optString, new rk0(optString, optBoolean2, optBoolean, true, j10));
                        }
                    }
                } catch (JSONException e) {
                    k9.a0.l("Malformed config loading JSON.", e);
                }
            }
        }
    }

    public final synchronized void e() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) cn.f5127b.p()).booleanValue()) {
                if (((Boolean) g9.r.e.f17698c.a(sl.f10948t2)).booleanValue() && (jSONObject = f9.k.C.f16817h.g().n().f8476g) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject2.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                JSONObject jSONObject3 = optJSONArray.getJSONObject(i10);
                                boolean optBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject3.optString("platform");
                                rk0 rk0Var = new rk0(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.f9145d.put(optString, rk0Var);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.e.put(optString, rk0Var);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            k9.a0.l("Malformed config loading JSON.", e);
        } finally {
        }
    }

    public final synchronized void f() {
        String optString;
        JSONArray optJSONArray;
        try {
            JSONObject jSONObject = f9.k.C.f16817h.g().n().f8476g;
            if (jSONObject != null) {
                try {
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.f9147g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i = 0; i < optJSONArray2.length(); i++) {
                            JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                            if (((Boolean) g9.r.e.f17698c.a(sl.f10877oc)).booleanValue()) {
                                optString = jSONObject2.optString("ad_unit_id", "").toLowerCase(Locale.ROOT);
                            } else {
                                optString = jSONObject2.optString("ad_unit_id", "");
                            }
                            String optString2 = jSONObject2.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                    arrayList.addAll(g(optJSONArray.getJSONObject(i10)));
                                }
                            }
                            h(optString2, optString, arrayList);
                        }
                    }
                } catch (JSONException e) {
                    k9.a0.l("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList g(JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle j10 = j(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        String str = (String) arrayList2.get(i10);
                        b(str);
                        if (((pk0) this.f9142a.get(str)) != null) {
                            arrayList.add(new pk0(str, j10));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized void h(String str, String str2, ArrayList arrayList) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                HashMap hashMap = this.f9144c;
                Map map = (Map) hashMap.get(str);
                if (map == null) {
                    map = new HashMap();
                }
                hashMap.put(str, map);
                List list = (List) map.get(str2);
                if (list == null) {
                    list = new ArrayList();
                }
                list.addAll(arrayList);
                map.put(str2, list);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized d61 i(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(f9.k.C.f16817h.g().n().e)) {
                nl nlVar = sl.f10695d4;
                g9.r rVar = g9.r.e;
                boolean matches = Pattern.matches((String) rVar.f17698c.a(nlVar), str);
                boolean matches2 = Pattern.matches((String) rVar.f17698c.a(sl.f10710e4), str);
                if (matches) {
                    hashMap = new HashMap(this.e);
                } else if (matches2) {
                    hashMap = new HashMap(this.f9145d);
                }
                return d61.a(hashMap);
            }
            return d61.A;
        } catch (Throwable th) {
            throw th;
        }
    }
}

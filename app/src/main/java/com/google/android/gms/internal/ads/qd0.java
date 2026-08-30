package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import r.e;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qd0 {

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f9821b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f9822c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9823d;
    public JSONObject e;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f9820a = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f9824f = new AtomicBoolean(false);

    public qd0(wx wxVar) {
        this.f9822c = wxVar;
    }

    public final synchronized void a() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Map map;
        try {
            this.f9823d = true;
            mx n10 = f9.k.C.f16817h.g().n();
            if (n10 != null && (jSONObject = n10.f8476g) != null) {
                if (((Boolean) g9.r.e.f17698c.a(sl.W4)).booleanValue()) {
                    jSONObject2 = jSONObject.optJSONObject("common_settings");
                } else {
                    jSONObject2 = null;
                }
                this.f9821b = jSONObject2;
                this.e = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (optString != null && optJSONObject2 != null && optString2 != null) {
                                ConcurrentHashMap concurrentHashMap = this.f9820a;
                                if (concurrentHashMap.containsKey(optString2)) {
                                    map = (Map) concurrentHashMap.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                                    concurrentHashMap.put(optString2, concurrentHashMap2);
                                    map = concurrentHashMap2;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }
}

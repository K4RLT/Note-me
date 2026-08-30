package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import j6.s;
import k9.a0;
import l9.i;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mx {

    /* renamed from: d, reason: collision with root package name */
    public String f8474d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public long f8475f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f8476g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8477h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8478j;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8471a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8472b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8473c = new HashMap();
    public final ArrayList i = new ArrayList();

    public mx(String str, long j10) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.f8474d = "";
        this.f8477h = false;
        this.f8478j = false;
        this.e = str;
        this.f8475f = j10;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f8476g = new JSONObject(str);
                if (((Boolean) r.e.f17698c.a(sl.f10703dd)).booleanValue() && a()) {
                    return;
                }
                if (this.f8476g.optInt("status", -1) != 1) {
                    this.f8477h = false;
                    int i = a0.f19634b;
                    i.f("App settings could not be fetched successfully.");
                    return;
                }
                this.f8477h = true;
                this.f8474d = this.f8476g.optString("app_id");
                JSONArray optJSONArray2 = this.f8476g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray2 != null) {
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i10);
                        String optString = jSONObject.optString("format");
                        String optString2 = jSONObject.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                            if ("interstitial".equalsIgnoreCase(optString)) {
                                this.f8472b.add(optString2);
                            } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                                this.f8473c.put(optString2, new sr(optJSONObject3));
                            }
                        }
                    }
                }
                JSONArray optJSONArray3 = this.f8476g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray3 != null) {
                    for (int i11 = 0; i11 < optJSONArray3.length(); i11++) {
                        this.f8471a.add(optJSONArray3.optString(i11));
                    }
                }
                if (((Boolean) r.e.f17698c.a(sl.M7)).booleanValue() && (optJSONObject2 = this.f8476g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                    for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                        this.i.add(optJSONArray.get(i12).toString());
                    }
                }
                if (((Boolean) r.e.f17698c.a(sl.f10761h7)).booleanValue() && (optJSONObject = this.f8476g.optJSONObject("common_settings")) != null) {
                    this.f8478j = optJSONObject.optBoolean("is_prefetching_enabled", false);
                }
            } catch (JSONException e) {
                int i13 = a0.f19634b;
                i.g("Exception occurred while processing app setting json", e);
                k.C.f16817h.d("AppSettings.parseAppSettingsJson", e);
            }
        }
    }

    public final boolean a() {
        if (b()) {
            return false;
        }
        if (((Boolean) r.e.f17698c.a(sl.f10664b5)).booleanValue()) {
            k kVar = k.C;
            be0 be0Var = kVar.f16817h.i;
            if (be0Var != null) {
                s a10 = be0Var.a();
                a10.k("action", "cld_reset");
                a10.k("cld_lut_ms", String.valueOf(this.f8475f));
                kVar.f16819k.getClass();
                a10.k("event_timestamp", String.valueOf(System.currentTimeMillis()));
                a10.k("cld_ttl_sec", String.valueOf(c()));
                a10.l();
            }
        }
        this.f8471a.clear();
        this.f8472b.clear();
        this.f8473c.clear();
        this.f8474d = "";
        this.e = "";
        this.f8476g = null;
        this.f8477h = false;
        this.i.clear();
        this.f8478j = false;
        return true;
    }

    public final boolean b() {
        if (!TextUtils.isEmpty(this.e) && this.f8476g != null) {
            long c10 = c();
            k.C.f16819k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (c10 >= 0) {
                long j10 = this.f8475f;
                if (j10 > currentTimeMillis || (currentTimeMillis - j10) / 1000 > c10) {
                    return false;
                }
            }
        }
        return true;
    }

    public final long c() {
        nl nlVar = sl.f10751gd;
        r rVar = r.e;
        long longValue = ((Long) rVar.f17698c.a(nlVar)).longValue();
        nl nlVar2 = sl.f10735fd;
        ql qlVar = rVar.f17698c;
        if (((Boolean) qlVar.a(nlVar2)).booleanValue() && !TextUtils.isEmpty(this.e)) {
            return this.f8476g.optLong("cache_ttl_sec", ((Long) qlVar.a(nlVar)).longValue());
        }
        return longValue;
    }
}

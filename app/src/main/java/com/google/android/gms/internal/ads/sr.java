package com.google.android.gms.internal.ads;
import f9.k;
import k9.a0;
import l9.i;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sr {

    /* renamed from: a, reason: collision with root package name */
    public final List f11110a;

    public sr(JSONObject jSONObject) {
        if (i.j(2)) {
            a0.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                rr rrVar = new rr(jSONArray.getJSONObject(i10));
                "banner".equalsIgnoreCase(rrVar.f10278c);
                arrayList.add(rrVar);
                if (i < 0) {
                    Iterator it = rrVar.f10276a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i10;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f11110a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            fp fpVar = k.C.f16830v;
            fp.f("click_urls", optJSONObject);
            fp.f("imp_urls", optJSONObject);
            fp.f("downloaded_imp_urls", optJSONObject);
            fp.f("nofill_urls", optJSONObject);
            fp.f("remote_ping_urls", optJSONObject);
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            qv.a(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}

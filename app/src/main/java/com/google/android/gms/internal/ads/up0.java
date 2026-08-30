package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class up0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11695a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11696b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f11697c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f11698d;

    public up0(JsonReader jsonReader) {
        JSONObject c10 = wa.g9.c(jsonReader);
        this.f11698d = c10;
        this.f11695a = c10.optString("ad_html", null);
        this.f11696b = c10.optString("ad_base_url", null);
        this.f11697c = c10.optJSONObject("ad_json");
    }
}

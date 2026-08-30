package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sa0 extends ta0 {

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f10575b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10576c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10577d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10578f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10579g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f10580h;

    public sa0(qp0 qp0Var, JSONObject jSONObject) {
        super(qp0Var);
        JSONObject optJSONObject;
        boolean optBoolean;
        boolean optBoolean2;
        boolean optBoolean3;
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject k3 = wa.g9.k(jSONObject, strArr);
        if (k3 == null) {
            optJSONObject = null;
        } else {
            optJSONObject = k3.optJSONObject(strArr[1]);
        }
        this.f10575b = optJSONObject;
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject k4 = wa.g9.k(jSONObject, strArr2);
        if (k4 == null) {
            optBoolean = false;
        } else {
            optBoolean = k4.optBoolean(strArr2[0], false);
        }
        this.f10576c = optBoolean;
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject k10 = wa.g9.k(jSONObject, strArr3);
        if (k10 == null) {
            optBoolean2 = false;
        } else {
            optBoolean2 = k10.optBoolean(strArr3[1], false);
        }
        this.f10577d = optBoolean2;
        String[] strArr4 = {"enable_omid"};
        JSONObject k11 = wa.g9.k(jSONObject, strArr4);
        if (k11 == null) {
            optBoolean3 = false;
        } else {
            optBoolean3 = k11.optBoolean(strArr4[0], false);
        }
        this.e = optBoolean3;
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject k12 = wa.g9.k(jSONObject, strArr5);
        this.f10579g = k12 != null ? k12.optString(strArr5[0], "") : "";
        this.f10578f = jSONObject.optJSONObject("overlay") != null;
        this.f10580h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final boolean a() {
        return this.f10578f;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final boolean b() {
        return this.f10576c;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final boolean c() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final boolean d() {
        return this.f10577d;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final String e() {
        return this.f10579g;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final jk0 f() {
        JSONObject jSONObject = this.f10580h;
        if (jSONObject != null) {
            return new jk0(28, jSONObject);
        }
        return this.f11300a.V;
    }
}

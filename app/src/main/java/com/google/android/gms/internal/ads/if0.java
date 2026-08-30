package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class if0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7119a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7120b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7121c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7122d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7123f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7124g;

    public if0(String str, String str2, String str3, int i, String str4, int i10, boolean z3) {
        this.f7119a = str;
        this.f7120b = str2;
        this.f7121c = str3;
        this.f7122d = i;
        this.e = str4;
        this.f7123f = i10;
        this.f7124g = z3;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f7119a);
        jSONObject.put("version", this.f7121c);
        nl nlVar = sl.Ga;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f7120b);
        }
        jSONObject.put("status", this.f7122d);
        jSONObject.put("description", this.e);
        jSONObject.put("initializationLatencyMillis", this.f7123f);
        if (((Boolean) rVar.f17698c.a(sl.Ha)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f7124g);
        }
        return jSONObject;
    }
}

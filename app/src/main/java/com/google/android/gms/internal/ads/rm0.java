package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rm0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10242a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10243b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10244c;

    public /* synthetic */ rm0(Object obj, int i, Object obj2) {
        this.f10242a = i;
        this.f10243b = obj;
        this.f10244c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void l(Object obj) {
        switch (this.f10242a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f10243b;
                Bundle bundle = (Bundle) obj;
                if (jSONObject != null) {
                    bundle.putString("fwd_cld", jSONObject.toString());
                }
                JSONObject jSONObject2 = (JSONObject) this.f10244c;
                if (jSONObject2 != null) {
                    bundle.putString("fwd_common_cld", jSONObject2.toString());
                    return;
                }
                return;
            default:
                try {
                    JSONObject g8 = wa.g9.g("pii", (JSONObject) obj);
                    g8.put("doritos", (String) this.f10243b);
                    g8.put("doritos_v2", (String) this.f10244c);
                    return;
                } catch (JSONException unused) {
                    k9.a0.k("Failed putting doritos string.");
                    return;
                }
        }
    }
}

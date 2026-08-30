package com.google.android.gms.internal.ads;
import k9.a0;
import l9.i;
import wa.g9;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ql0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9874a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9875b;

    public /* synthetic */ ql0(String str, int i) {
        this.f9874a = i;
        this.f9875b = str;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void l(Object obj) {
        int i = this.f9874a;
        String str = this.f9875b;
        switch (i) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (str != null) {
                    bundle.putString("arek", str);
                    return;
                }
                return;
            case 1:
                ((Bundle) obj).putString("ms", str);
                return;
            case 2:
                b80.H("key_schema", (Bundle) obj, str);
                return;
            case 3:
                b80.H("omid_v", (Bundle) obj, str);
                return;
            case 4:
                ((Bundle) obj).putString("request_id", str);
                return;
            case 5:
                try {
                    ((JSONObject) obj).put("ms", str);
                    return;
                } catch (JSONException e) {
                    a0.l("Failed putting Ad ID.", e);
                    return;
                }
            default:
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    if (!TextUtils.isEmpty(str)) {
                        g9.g("pii", jSONObject).put("adsid", str);
                        return;
                    }
                    return;
                } catch (JSONException e8) {
                    int i10 = a0.f19634b;
                    i.g("Failed putting trustless token.", e8);
                    return;
                }
        }
    }
}

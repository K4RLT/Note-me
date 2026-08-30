package com.google.android.gms.internal.ads;
import a5.a;
import g9.p;
import k9.a0;
import l9.i;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface rq extends vq, qq {
    @Override // com.google.android.gms.internal.ads.qq
    default void b(String str, Map map) {
        try {
            c("openIntentAsync", g9.p.f17688g.f17689a.k(map));
        } catch (JSONException unused) {
            int i = k9.a0.f19634b;
            l9.i.f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.qq
    default void c(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('openIntentAsync',");
        sb2.append(jSONObject2);
        sb2.append(");");
        String sb3 = sb2.toString();
        int i = k9.a0.f19634b;
        l9.i.a("Dispatching AFMA event: ".concat(sb3));
        o(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.vq
    void o(String str);

    @Override // com.google.android.gms.internal.ads.vq
    default void p(String str, String str2) {
        o(a5.a.l(new StringBuilder(g3.a.v(str, 1, String.valueOf(str2).length()) + 2), str, "(", str2, ");"));
    }
}

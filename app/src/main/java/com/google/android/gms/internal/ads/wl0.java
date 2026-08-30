package com.google.android.gms.internal.ads;
import g9.p;
import k9.a0;
import wa.g9;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wl0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12273a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f12274b;

    public /* synthetic */ wl0(int i, Bundle bundle) {
        this.f12273a = i;
        this.f12274b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        switch (this.f12273a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Bundle bundle2 = this.f12274b;
                if (!bundle2.isEmpty()) {
                    bundle.putBundle("installed_adapter_data", bundle2);
                    return;
                }
                return;
            case 1:
                Bundle bundle3 = (Bundle) obj;
                Bundle d2 = b80.d("device", bundle3);
                d2.putBundle("android_mem_info", this.f12274b);
                bundle3.putBundle("device", d2);
                return;
            case 2:
                Bundle bundle4 = (Bundle) obj;
                Bundle bundle5 = this.f12274b;
                if (bundle5 != null) {
                    bundle4.putAll(bundle5);
                    return;
                }
                return;
            case 3:
                Bundle bundle6 = (Bundle) obj;
                Bundle bundle7 = this.f12274b;
                if (!bundle7.isEmpty()) {
                    bundle6.putBundle("shared_pref", bundle7);
                    return;
                }
                return;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle8 = this.f12274b;
                if (bundle8 != null) {
                    try {
                        g9.g("play_store", g9.g("device", jSONObject)).put("parental_controls", p.f17688g.f17689a.m(bundle8));
                        return;
                    } catch (JSONException unused) {
                        a0.k("Failed putting parental controls bundle.");
                        return;
                    }
                }
                return;
        }
    }
}

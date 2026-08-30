package com.google.android.gms.internal.ads;
import a0.k;
import g9.r;
import k9.a0;
import r.e;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cn0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5133a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5134b;

    public /* synthetic */ cn0(int i, Object obj) {
        this.f5133a = i;
        this.f5134b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        boolean z3;
        boolean z9;
        switch (this.f5133a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                pp0 pp0Var = (pp0) this.f5134b;
                if (pp0Var != null) {
                    if (!((Boolean) g9.r.e.f17698c.a(sl.f10943sd)).booleanValue()) {
                        synchronized (pp0Var.f9579c) {
                            pp0Var.b();
                            z3 = false;
                            if (pp0Var.e == 2) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                        }
                        bundle.putBoolean("render_in_browser", z9);
                        synchronized (pp0Var.f9579c) {
                            pp0Var.b();
                            if (pp0Var.e == 3) {
                                z3 = true;
                            }
                        }
                        bundle.putBoolean("disable_ml", z3);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                try {
                    ((JSONObject) obj).put("cache_state", (JSONObject) this.f5134b);
                    return;
                } catch (JSONException unused) {
                    k9.a0.k("Unable to get cache_state");
                    return;
                }
            case 2:
                try {
                    ((JSONObject) obj).put("gms_sdk_env", ((ao0) this.f5134b).f4565a);
                    return;
                } catch (JSONException unused2) {
                    k9.a0.k("Failed putting version constants.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", (List) this.f5134b));
                    return;
                } catch (JSONException unused3) {
                    k9.a0.k("Failed putting experiment ids.");
                    return;
                }
        }
    }
}

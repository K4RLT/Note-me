package com.google.android.gms.internal.ads;
import a0.l;
import g9.g;
import g9.r;
import k9.a0;
import r.e;
import wa.g9;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dm0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5459a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5460b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5461c;

    public /* synthetic */ dm0(String str, int i, int i10) {
        this.f5459a = i10;
        this.f5460b = str;
        this.f5461c = i;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        int i;
        int i10;
        switch (this.f5459a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                String str = this.f5460b;
                if (!TextUtils.isEmpty(str) && (i = this.f5461c) != -1) {
                    Bundle d2 = b80.d("pii", bundle);
                    bundle.putBundle("pii", d2);
                    d2.putString("pvid", str);
                    d2.putInt("pvid_s", i);
                    return;
                }
                return;
            case 1:
                Bundle bundle2 = (Bundle) obj;
                if (((Boolean) g9.r.e.f17698c.a(sl.Ob)).booleanValue()) {
                    String str2 = this.f5460b;
                    if (!TextUtils.isEmpty(str2)) {
                        bundle2.putString("topics", str2);
                    }
                    int i11 = this.f5461c;
                    if (i11 != -1) {
                        bundle2.putInt("atps", i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                String str3 = this.f5460b;
                if (!TextUtils.isEmpty(str3) && (i10 = this.f5461c) != -1) {
                    try {
                        JSONObject g8 = wa.g9.g("pii", jSONObject);
                        g8.put("pvid", str3);
                        g8.put("pvid_s", i10);
                        return;
                    } catch (JSONException e) {
                        k9.a0.l("Failed putting gms core app set ID info.", e);
                        return;
                    }
                }
                return;
        }
    }
}

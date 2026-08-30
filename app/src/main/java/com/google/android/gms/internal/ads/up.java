package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class up implements vp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11693a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final yx f11694b;

    public up(jp jpVar, yx yxVar) {
        this.f11694b = yxVar;
        Objects.requireNonNull(jpVar);
    }

    @Override // com.google.android.gms.internal.ads.vp
    public final void a(JSONObject jSONObject) {
        switch (this.f11693a) {
            case 0:
                this.f11694b.b(jSONObject);
                return;
            default:
                yx yxVar = this.f11694b;
                try {
                    yxVar.b(jSONObject);
                    return;
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e) {
                    yxVar.c(e);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.vp
    public final void t(String str) {
        switch (this.f11693a) {
            case 0:
                this.f11694b.c(new ba.p(str, 1));
                return;
            default:
                yx yxVar = this.f11694b;
                try {
                    if (str == null) {
                        yxVar.c(new ba.p(1));
                    } else {
                        yxVar.c(new ba.p(str, 1));
                    }
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
        }
    }

    public up(qr qrVar, yx yxVar) {
        this.f11694b = yxVar;
    }
}

package com.google.android.gms.internal.ads;
import ba.p;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kr implements vp {

    /* renamed from: a, reason: collision with root package name */
    public final br f7847a;

    /* renamed from: b, reason: collision with root package name */
    public final yx f7848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr f7849c;

    public kr(br brVar, lr lrVar, yx yxVar) {
        Objects.requireNonNull(lrVar);
        this.f7849c = lrVar;
        this.f7847a = brVar;
        this.f7848b = yxVar;
    }

    @Override // com.google.android.gms.internal.ads.vp
    public final void a(JSONObject jSONObject) {
        br brVar = this.f7847a;
        yx yxVar = this.f7848b;
        try {
            try {
                yxVar.b(((gr) this.f7849c.f8110c).a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                yxVar.c(e);
            }
        } finally {
            brVar.l();
        }
    }

    @Override // com.google.android.gms.internal.ads.vp
    public final void t(String str) {
        br brVar = this.f7847a;
        yx yxVar = this.f7848b;
        try {
            if (str == null) {
                yxVar.c(new p(1));
            } else {
                yxVar.c(new p(str, 1));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            brVar.l();
            throw th;
        }
        brVar.l();
    }
}

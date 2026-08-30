package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ej0 implements fi0 {

    /* renamed from: a, reason: collision with root package name */
    public final od0 f5697a;

    public ej0(od0 od0Var) {
        this.f5697a = od0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zr, com.google.android.gms.internal.ads.h70] */
    @Override // com.google.android.gms.internal.ads.fi0
    public final gi0 a(String str, JSONObject jSONObject) {
        return new gi0(this.f5697a.a(str, jSONObject), new zr(), str);
    }
}

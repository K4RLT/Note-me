package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y30 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12767a;

    /* renamed from: b, reason: collision with root package name */
    public final g50 f12768b;

    public /* synthetic */ y30(g50 g50Var, int i) {
        this.f12767a = i;
        this.f12768b = g50Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f12767a) {
            case 0:
                try {
                    return new JSONObject(this.f12768b.a().f9970z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new ta0(this.f12768b.a());
        }
    }
}

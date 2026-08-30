package com.google.android.gms.internal.ads;
import f9.a;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ea0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5626a;

    /* renamed from: b, reason: collision with root package name */
    public final tw f5627b;

    public /* synthetic */ ea0(tw twVar, int i) {
        this.f5626a = i;
        this.f5627b = twVar;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f5626a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f5627b.f11470v;
                lo1.b(jSONObject);
                return jSONObject;
            case 1:
                rc0 rc0Var = (rc0) this.f5627b.f11471w;
                lo1.b(rc0Var);
                return rc0Var;
            case 2:
                return (a) this.f5627b.f11472x;
            default:
                return (mw) this.f5627b.f11473y;
        }
    }
}

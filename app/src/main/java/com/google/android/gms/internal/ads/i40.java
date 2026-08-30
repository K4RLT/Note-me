package com.google.android.gms.internal.ads;
import f9.k;
import l9.a;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class i40 implements k70 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6980u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f6981v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a f6982w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ qp0 f6983x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ aq0 f6984y;

    public /* synthetic */ i40(Context context, a aVar, qp0 qp0Var, aq0 aq0Var, int i) {
        this.f6980u = i;
        this.f6981v = context;
        this.f6982w = aVar;
        this.f6983x = qp0Var;
        this.f6984y = aq0Var;
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final void e() {
        switch (this.f6980u) {
            case 0:
                JSONObject jSONObject = this.f6983x.C;
                k.C.f16823o.d(this.f6981v, this.f6982w.f20029u, jSONObject.toString(), this.f6984y.f4583g);
                return;
            default:
                JSONObject jSONObject2 = this.f6983x.C;
                k.C.f16823o.d(this.f6981v, this.f6982w.f20029u, jSONObject2.toString(), this.f6984y.f4583g);
                return;
        }
    }
}

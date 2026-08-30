package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uo0 implements f31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tw f11692b;

    public /* synthetic */ uo0(tw twVar, int i) {
        this.f11691a = i;
        this.f11692b = twVar;
    }

    @Override // com.google.android.gms.internal.ads.f31
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.f11691a;
        tw twVar = this.f11692b;
        switch (i) {
            case 0:
                int i10 = k9.a0.f19634b;
                l9.i.d("", (vg0) obj);
                k9.a0.k("Failed to get a cache key, reverting to legacy flow.");
                vo0 vo0Var = new vo0(null, twVar.s());
                twVar.f11473y = vo0Var;
                return vo0Var;
            default:
                dv dvVar = (dv) obj;
                vo0 vo0Var2 = new vo0(dvVar, new uq0(dvVar.D));
                twVar.f11473y = vo0Var2;
                return vo0Var2;
        }
    }
}

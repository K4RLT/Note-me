package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class yb0 implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b81 f12839b;

    public /* synthetic */ yb0(b81 b81Var, int i) {
        this.f12838a = i;
        this.f12839b = b81Var;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final ac.b l(Object obj) {
        h00 h00Var = (h00) obj;
        switch (this.f12838a) {
            case 0:
                if (h00Var != null) {
                    return this.f12839b;
                }
                throw new cg0(1, "Retrieve Web View from image ad response failed.");
            default:
                if (h00Var != null && h00Var.d() != null) {
                    return this.f12839b;
                }
                throw new cg0(1, "Retrieve video view in html5 ad response failed.");
        }
    }
}

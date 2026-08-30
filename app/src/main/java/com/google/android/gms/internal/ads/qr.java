package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qr implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9978a;

    /* renamed from: b, reason: collision with root package name */
    public final ac.b f9979b;

    public /* synthetic */ qr(int i, ac.b bVar) {
        this.f9978a = i;
        this.f9979b = bVar;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final ac.b l(Object obj) {
        switch (this.f9978a) {
            case 0:
                return ed1.c0(this.f9979b, new mr(this, 1, obj), xx.f12657h);
            case 1:
                if (obj != null) {
                    return this.f9979b;
                }
                return ed1.A(new cg0(1, "Retrieve required value in native ad response failed."));
            default:
                return this.f9979b;
        }
    }
}

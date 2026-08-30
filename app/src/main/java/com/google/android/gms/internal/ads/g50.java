package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class g50 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6305a;

    /* renamed from: b, reason: collision with root package name */
    public final hq0 f6306b;

    public /* synthetic */ g50(hq0 hq0Var, int i) {
        this.f6305a = i;
        this.f6306b = hq0Var;
    }

    public qp0 a() {
        qp0 qp0Var = (qp0) this.f6306b.f6873w;
        lo1.b(qp0Var);
        return qp0Var;
    }

    public wp0 b() {
        wp0 wp0Var = (wp0) this.f6306b.f6872v;
        lo1.b(wp0Var);
        return wp0Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f6305a) {
            case 0:
                qp0 qp0Var = (qp0) this.f6306b.f6873w;
                lo1.b(qp0Var);
                return qp0Var;
            case 1:
                return (String) this.f6306b.f6874x;
            case 2:
                return this.f6306b.x();
            default:
                wp0 wp0Var = (wp0) this.f6306b.f6872v;
                lo1.b(wp0Var);
                return wp0Var;
        }
    }
}

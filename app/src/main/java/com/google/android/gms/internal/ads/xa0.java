package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xa0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12534a;

    /* renamed from: b, reason: collision with root package name */
    public final o60 f12535b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f12536c;

    public xa0(o10 o10Var, o60 o60Var) {
        this.f12534a = 0;
        this.f12536c = o10Var;
        this.f12535b = o60Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f12534a) {
            case 0:
                return new uw(((o10) this.f12536c).a(), this.f12535b.a().f4583g);
            case 1:
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                aq0 a10 = this.f12535b.a();
                return new pl0(wxVar, a10, 0);
            default:
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                return new rl0(1, wxVar2, this.f12535b.a(), ((v10) this.f12536c).zzb());
        }
    }

    public /* synthetic */ xa0(o60 o60Var, wr1 wr1Var, int i) {
        this.f12534a = i;
        this.f12535b = o60Var;
        this.f12536c = wr1Var;
    }
}

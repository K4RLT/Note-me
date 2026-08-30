package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jc0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7416a;

    /* renamed from: b, reason: collision with root package name */
    public final g50 f7417b;

    /* renamed from: c, reason: collision with root package name */
    public final um0 f7418c;

    /* renamed from: d, reason: collision with root package name */
    public final z20 f7419d;

    public /* synthetic */ jc0(g50 g50Var, um0 um0Var, z20 z20Var, int i) {
        this.f7416a = i;
        this.f7417b = g50Var;
        this.f7418c = um0Var;
        this.f7419d = z20Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f7416a) {
            case 0:
                return new ic0((String) this.f7417b.f6306b.f6874x, (na0) this.f7418c.zzb(), this.f7419d.a());
            default:
                return new kc0((String) this.f7417b.f6306b.f6874x, (na0) this.f7418c.zzb(), this.f7419d.a());
        }
    }
}

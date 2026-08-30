package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pl0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9541a;

    /* renamed from: b, reason: collision with root package name */
    public final wx f9542b;

    /* renamed from: c, reason: collision with root package name */
    public final aq0 f9543c;

    public /* synthetic */ pl0(wx wxVar, aq0 aq0Var, int i) {
        this.f9541a = i;
        this.f9542b = wxVar;
        this.f9543c = aq0Var;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final ac.b zza() {
        switch (this.f9541a) {
            case 0:
                return this.f9542b.j(new qf(8, this));
            default:
                return this.f9542b.j(new qf(18, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        switch (this.f9541a) {
            case 0:
                return 5;
            default:
                return 21;
        }
    }
}

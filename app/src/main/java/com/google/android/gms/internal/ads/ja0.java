package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ja0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7383a;

    /* renamed from: b, reason: collision with root package name */
    public final z20 f7384b;

    public /* synthetic */ ja0(z20 z20Var, int i) {
        this.f7383a = i;
        this.f7384b = z20Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f7383a) {
            case 0:
                return new ha0(this.f7384b.a());
            default:
                return new wc0(this.f7384b.a());
        }
    }
}

package com.google.android.gms.internal.ads;
import j6.l;

/* loaded from: classes.dex */
public final class v40 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11797a;

    /* renamed from: b, reason: collision with root package name */
    public final l f11798b;

    public /* synthetic */ v40(l lVar, int i) {
        this.f11797a = i;
        this.f11798b = lVar;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        c90 c90Var;
        switch (this.f11797a) {
            case 0:
                i80 i80Var = (i80) this.f11798b.f18934w;
                if (i80Var != null) {
                    c90Var = new c90(i80Var, xx.f12657h);
                } else {
                    c90Var = new c90(new Object(), xx.f12657h);
                }
                return c90Var;
            default:
                return (i80) this.f11798b.f18934w;
        }
    }
}

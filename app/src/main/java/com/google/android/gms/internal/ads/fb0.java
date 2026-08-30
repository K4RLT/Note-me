package com.google.android.gms.internal.ads;
import la.a;

/* loaded from: classes.dex */
public final class fb0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6001a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f6002b;

    /* renamed from: c, reason: collision with root package name */
    public final ea0 f6003c;

    public fb0(ea0 ea0Var, rr1 rr1Var) {
        this.f6003c = ea0Var;
        this.f6002b = rr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f6001a) {
            case 0:
                rc0 rc0Var = (rc0) this.f6003c.f5627b.f11471w;
                lo1.b(rc0Var);
                return new eb0(rc0Var, (a) this.f6002b.zzb());
            default:
                gd0 gd0Var = (gd0) this.f6002b.zzb();
                rc0 rc0Var2 = (rc0) this.f6003c.f5627b.f11471w;
                lo1.b(rc0Var2);
                return new lb0(gd0Var, rc0Var2);
        }
    }

    public fb0(rr1 rr1Var, ea0 ea0Var) {
        this.f6002b = rr1Var;
        this.f6003c = ea0Var;
    }
}

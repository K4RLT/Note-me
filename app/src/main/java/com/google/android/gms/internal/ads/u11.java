package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class u11 implements t11 {

    /* renamed from: a, reason: collision with root package name */
    public final pr1 f11513a;

    /* renamed from: b, reason: collision with root package name */
    public final h21 f11514b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11515c;

    public u11(pr1 pr1Var, h21 h21Var, long j10) {
        this.f11513a = pr1Var;
        this.f11514b = h21Var;
        this.f11515c = j10;
    }

    @Override // com.google.android.gms.internal.ads.t11
    public final boolean a(vy0 vy0Var) {
        boolean z3 = true;
        h21 h21Var = this.f11514b;
        if (vy0Var != null && !vy0Var.equals(vy0.F())) {
            if (vy0Var.B() != this.f11513a.zzb()) {
                h21Var.b(15105);
                return true;
            }
            if ((vy0Var.z().B() * 1000) - System.currentTimeMillis() > this.f11515c) {
                z3 = false;
            }
            if (z3) {
                h21Var.b(15106);
            }
            return z3;
        }
        h21Var.b(15104);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.t11
    public final boolean b(vy0 vy0Var) {
        h21 h21Var = this.f11514b;
        if (vy0Var != null && !vy0Var.equals(vy0.F())) {
            if (vy0Var.B() != this.f11513a.zzb()) {
                h21Var.b(15103);
                return false;
            }
            return true;
        }
        h21Var.b(15102);
        return false;
    }
}

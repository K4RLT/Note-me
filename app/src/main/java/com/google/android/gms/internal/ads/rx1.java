package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rx1 implements xx1, wx1 {
    public long A = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public final yx1 f10330u;

    /* renamed from: v, reason: collision with root package name */
    public final long f10331v;

    /* renamed from: w, reason: collision with root package name */
    public final w f10332w;

    /* renamed from: x, reason: collision with root package name */
    public hx1 f10333x;

    /* renamed from: y, reason: collision with root package name */
    public xx1 f10334y;

    /* renamed from: z, reason: collision with root package name */
    public wx1 f10335z;

    public rx1(yx1 yx1Var, w wVar, long j10) {
        this.f10330u = yx1Var;
        this.f10332w = wVar;
        this.f10331v = j10;
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final void X(long j10) {
        xx1 xx1Var = this.f10334y;
        String str = bq0.f4860a;
        xx1Var.X(j10);
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final boolean a() {
        xx1 xx1Var = this.f10334y;
        if (xx1Var != null && xx1Var.a()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long b(long j10) {
        xx1 xx1Var = this.f10334y;
        String str = bq0.f4860a;
        return xx1Var.b(j10);
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long c() {
        xx1 xx1Var = this.f10334y;
        String str = bq0.f4860a;
        return xx1Var.c();
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final void d(wx1 wx1Var, long j10) {
        this.f10335z = wx1Var;
        xx1 xx1Var = this.f10334y;
        if (xx1Var != null) {
            long j11 = this.A;
            if (j11 == -9223372036854775807L) {
                j11 = this.f10331v;
            }
            xx1Var.d(this, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long e(long j10, du1 du1Var) {
        xx1 xx1Var = this.f10334y;
        String str = bq0.f4860a;
        return xx1Var.e(j10, du1Var);
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final boolean f(jt1 jt1Var) {
        xx1 xx1Var = this.f10334y;
        if (xx1Var != null && xx1Var.f(jt1Var)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final void g(long j10) {
        xx1 xx1Var = this.f10334y;
        String str = bq0.f4860a;
        xx1Var.g(j10);
    }

    @Override // com.google.android.gms.internal.ads.wx1
    public final void h(xx1 xx1Var) {
        wx1 wx1Var = this.f10335z;
        String str = bq0.f4860a;
        wx1Var.h(this);
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long i(r[] rVarArr, boolean[] zArr, sy1[] sy1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.A;
        if (j12 != -9223372036854775807L && j10 == this.f10331v) {
            j11 = j12;
        } else {
            j11 = j10;
        }
        this.A = -9223372036854775807L;
        xx1 xx1Var = this.f10334y;
        String str = bq0.f4860a;
        return xx1Var.i(rVarArr, zArr, sy1VarArr, zArr2, j11);
    }

    @Override // com.google.android.gms.internal.ads.wx1
    public final /* bridge */ /* synthetic */ void j(ty1 ty1Var) {
        wx1 wx1Var = this.f10335z;
        String str = bq0.f4860a;
        wx1Var.j(this);
    }

    public final void k(yx1 yx1Var) {
        long j10 = this.A;
        if (j10 == -9223372036854775807L) {
            j10 = this.f10331v;
        }
        hx1 hx1Var = this.f10333x;
        hx1Var.getClass();
        xx1 c10 = hx1Var.c(yx1Var, this.f10332w, j10);
        this.f10334y = c10;
        if (this.f10335z != null) {
            c10.d(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final void m() {
        xx1 xx1Var = this.f10334y;
        if (xx1Var != null) {
            xx1Var.m();
            return;
        }
        hx1 hx1Var = this.f10333x;
        if (hx1Var != null) {
            hx1Var.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final zy1 n() {
        xx1 xx1Var = this.f10334y;
        String str = bq0.f4860a;
        return xx1Var.n();
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long v() {
        xx1 xx1Var = this.f10334y;
        String str = bq0.f4860a;
        return xx1Var.v();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long zzb() {
        xx1 xx1Var = this.f10334y;
        String str = bq0.f4860a;
        return xx1Var.zzb();
    }
}

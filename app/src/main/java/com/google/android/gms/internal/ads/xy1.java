package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xy1 implements xx1, wx1 {

    /* renamed from: u, reason: collision with root package name */
    public final xx1 f12666u;

    /* renamed from: v, reason: collision with root package name */
    public final long f12667v;

    /* renamed from: w, reason: collision with root package name */
    public Object f12668w;

    public xy1(xx1 xx1Var, long j10) {
        this.f12666u = xx1Var;
        this.f12667v = j10;
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final void X(long j10) {
        this.f12666u.X(j10 - this.f12667v);
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final boolean a() {
        return this.f12666u.a();
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long b(long j10) {
        xx1 xx1Var = this.f12666u;
        long j11 = this.f12667v;
        return xx1Var.b(j10 - j11) + j11;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long c() {
        long c10 = this.f12666u.c();
        if (c10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return c10 + this.f12667v;
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final void d(wx1 wx1Var, long j10) {
        this.f12668w = wx1Var;
        this.f12666u.d(this, j10 - this.f12667v);
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long e(long j10, du1 du1Var) {
        xx1 xx1Var = this.f12666u;
        long j11 = this.f12667v;
        return xx1Var.e(j10 - j11, du1Var) + j11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.it1, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.ty1
    public final boolean f(jt1 jt1Var) {
        long j10 = jt1Var.f7539a;
        ?? obj = new Object();
        obj.f7221b = jt1Var.f7540b;
        obj.f7222c = jt1Var.f7541c;
        obj.f7220a = j10 - this.f12667v;
        return this.f12666u.f(new jt1(obj));
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final void g(long j10) {
        this.f12666u.g(j10 - this.f12667v);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.wx1, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.wx1
    public final void h(xx1 xx1Var) {
        ?? r12 = this.f12668w;
        r12.getClass();
        r12.h(this);
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long i(r[] rVarArr, boolean[] zArr, sy1[] sy1VarArr, boolean[] zArr2, long j10) {
        sy1[] sy1VarArr2 = new sy1[sy1VarArr.length];
        int i = 0;
        while (true) {
            sy1 sy1Var = null;
            if (i >= sy1VarArr.length) {
                break;
            }
            wy1 wy1Var = (wy1) sy1VarArr[i];
            if (wy1Var != null) {
                sy1Var = wy1Var.f12370a;
            }
            sy1VarArr2[i] = sy1Var;
            i++;
        }
        long j11 = this.f12667v;
        long i10 = this.f12666u.i(rVarArr, zArr, sy1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < sy1VarArr.length; i11++) {
            sy1 sy1Var2 = sy1VarArr2[i11];
            if (sy1Var2 == null) {
                sy1VarArr[i11] = null;
            } else {
                sy1 sy1Var3 = sy1VarArr[i11];
                if (sy1Var3 == null || ((wy1) sy1Var3).f12370a != sy1Var2) {
                    sy1VarArr[i11] = new wy1(sy1Var2, j11);
                }
            }
        }
        return i10 + j11;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.wx1, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.wx1
    public final /* bridge */ /* synthetic */ void j(ty1 ty1Var) {
        ?? r12 = this.f12668w;
        r12.getClass();
        r12.j(this);
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final void m() {
        this.f12666u.m();
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final zy1 n() {
        return this.f12666u.n();
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long v() {
        long v2 = this.f12666u.v();
        if (v2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return v2 + this.f12667v;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long zzb() {
        long zzb = this.f12666u.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.f12667v;
    }
}

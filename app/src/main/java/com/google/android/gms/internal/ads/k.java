package com.google.android.gms.internal.ads;
import p.e;
import p.f;
import p.g;

/* loaded from: classes.dex */
public final class k extends m implements Comparable {
    public final boolean A;
    public final boolean B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;

    /* renamed from: y, reason: collision with root package name */
    public final int f7588y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f7589z;

    public k(int i, hi hiVar, int i10, j jVar, int i11, String str, String str2) {
        super(i, hiVar, i10);
        boolean z3;
        boolean z9;
        d51 d51Var;
        int i12;
        int i13;
        int bitCount;
        boolean z10;
        boolean z11;
        boolean z12;
        int i14 = 0;
        this.f7589z = zw1.K(i11, false);
        int i15 = this.f8196x.e;
        jVar.getClass();
        d51 d51Var2 = jVar.f9892r;
        if (1 != (i15 & 1)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.A = z3;
        if ((i15 & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.B = z9;
        if (str2 != null) {
            d51Var = d51.q(str2);
        } else if (d51Var2.isEmpty()) {
            d51Var = d51.q("");
        } else {
            d51Var = d51Var2;
        }
        int i16 = 0;
        while (true) {
            if (i16 < d51Var.size()) {
                i12 = p.f(this.f8196x, (String) d51Var.get(i16), false);
                if (i12 > 0) {
                    break;
                } else {
                    i16++;
                }
            } else {
                i12 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            }
        }
        this.C = i16;
        this.D = i12;
        if (str2 != null) {
            i13 = 1088;
        } else {
            i13 = 0;
        }
        int i17 = this.f8196x.f8451f;
        if (i17 != 0 && i17 == i13) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i13 & i17);
        }
        this.E = bitCount;
        mw1 mw1Var = this.f8196x;
        if ((1088 & mw1Var.f8451f) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        int g8 = p.g(mw1Var, jVar.f9893s);
        this.F = g8;
        if (p.e(str) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        int f10 = p.f(this.f8196x, str, z11);
        this.G = f10;
        if (i12 > 0 || ((d51Var2.isEmpty() && bitCount > 0) || ((d51Var2.isEmpty() && g8 != Integer.MAX_VALUE) || this.A || (this.B && f10 > 0)))) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (zw1.K(i11, jVar.B) && z12) {
            i14 = 1;
        }
        this.f7588y = i14;
    }

    @Override // com.google.android.gms.internal.ads.m
    public final int a() {
        return this.f7588y;
    }

    @Override // com.google.android.gms.internal.ads.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        w41 d2 = w41.f12133a.d(this.f7589z, kVar.f7589z);
        Integer valueOf = Integer.valueOf(this.C);
        Integer valueOf2 = Integer.valueOf(kVar.C);
        w51 w51Var = w51.f12146v;
        w51 w51Var2 = w51.f12147w;
        w41 a10 = d2.a(valueOf, valueOf2, w51Var2);
        int i = kVar.D;
        int i10 = this.D;
        w41 b10 = a10.b(i10, i);
        int i11 = kVar.E;
        int i12 = this.E;
        w41 d10 = b10.b(i12, i11).a(Integer.valueOf(this.F), Integer.valueOf(kVar.F), w51Var2).d(this.A, kVar.A);
        Boolean valueOf3 = Boolean.valueOf(this.B);
        Boolean valueOf4 = Boolean.valueOf(kVar.B);
        if (i10 != 0) {
            w51Var = w51Var2;
        }
        w41 b11 = d10.a(valueOf3, valueOf4, w51Var).b(this.G, kVar.G);
        if (i12 == 0) {
            b11 = b11.c(this.H, kVar.H);
        }
        return b11.e();
    }
}

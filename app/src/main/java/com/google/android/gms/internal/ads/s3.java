package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public final r3 f10471a;

    /* renamed from: b, reason: collision with root package name */
    public final i3 f10472b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10473c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10474d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public int f10475f;

    /* renamed from: g, reason: collision with root package name */
    public int f10476g;

    /* renamed from: h, reason: collision with root package name */
    public int f10477h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f10478j;

    /* renamed from: k, reason: collision with root package name */
    public int f10479k;

    /* renamed from: l, reason: collision with root package name */
    public long f10480l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f10481m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f10482n;

    public s3(int i, r3 r3Var, i3 i3Var) {
        int i10;
        int i11;
        int i12 = r3Var.f10070d;
        this.f10471a = r3Var;
        int a10 = r3Var.a();
        boolean z3 = true;
        if (a10 != 1) {
            if (a10 == 2) {
                a10 = 2;
            } else {
                z3 = false;
            }
        }
        b80.l(z3);
        if (a10 == 2) {
            i10 = 1667497984;
        } else {
            i10 = 1651965952;
        }
        int i13 = ((i / 10) + 48) | (((i % 10) + 48) << 8);
        this.f10473c = i10 | i13;
        this.e = bq0.w(i12, r3Var.f10068b * 1000000, r3Var.f10069c, RoundingMode.DOWN);
        this.f10472b = i3Var;
        if (a10 == 2) {
            i11 = 1650720768 | i13;
        } else {
            i11 = -1;
        }
        this.f10474d = i11;
        this.f10480l = -1L;
        this.f10481m = new long[512];
        this.f10482n = new int[512];
        this.f10475f = i12;
    }

    public final z2 a(long j10) {
        if (this.f10479k != 0) {
            int i = (int) (j10 / ((this.e * 1) / this.f10475f));
            int r8 = bq0.r(this.f10482n, i, true, true);
            if (this.f10482n[r8] == i) {
                b3 b10 = b(r8);
                return new z2(b10, b10);
            }
            b3 b11 = b(r8);
            int i10 = r8 + 1;
            if (i10 < this.f10481m.length) {
                return new z2(b11, b(i10));
            }
            return new z2(b11, b11);
        }
        b3 b3Var = new b3(0L, this.f10480l);
        return new z2(b3Var, b3Var);
    }

    public final b3 b(int i) {
        return new b3(((this.e * 1) / this.f10475f) * this.f10482n[i], this.f10481m[i]);
    }
}

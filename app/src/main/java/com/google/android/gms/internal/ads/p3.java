package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class p3 implements n2 {

    /* renamed from: d, reason: collision with root package name */
    public final s6 f9339d;
    public int e;

    /* renamed from: g, reason: collision with root package name */
    public q3 f9341g;

    /* renamed from: j, reason: collision with root package name */
    public long f9343j;

    /* renamed from: k, reason: collision with root package name */
    public s3 f9344k;

    /* renamed from: o, reason: collision with root package name */
    public int f9348o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9349p;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9338c = true;

    /* renamed from: a, reason: collision with root package name */
    public final xk0 f9336a = new xk0(12);

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.filament.k f9337b = new Object();

    /* renamed from: f, reason: collision with root package name */
    public p2 f9340f = new s6(15);
    public s3[] i = new s3[0];

    /* renamed from: m, reason: collision with root package name */
    public long f9346m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f9347n = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f9345l = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f9342h = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.filament.k, java.lang.Object] */
    public p3(s6 s6Var) {
        this.f9339d = s6Var;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        xk0 xk0Var = this.f9336a;
        o2Var.y(xk0Var.f12580a, 0, 12);
        xk0Var.E(0);
        if (xk0Var.c() != 1179011410) {
            return false;
        }
        xk0Var.G(4);
        if (xk0Var.c() != 541677121) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.e = 0;
        if (this.f9338c) {
            p2Var = new d(p2Var, this.f9339d);
        }
        this.f9340f = p2Var;
        this.f9343j = -1L;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        this.f9343j = -1L;
        this.f9344k = null;
        int i = 0;
        for (s3 s3Var : this.i) {
            if (s3Var.f10479k == 0) {
                s3Var.i = 0;
            } else {
                s3Var.i = s3Var.f10482n[bq0.s(s3Var.f10481m, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.i.length != 0) {
                i = 3;
            }
            this.e = i;
            return;
        }
        this.e = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b8  */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.o2 r31, b0.a r32) {
        /*
            Method dump skipped, instructions count: 1149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p3.h(com.google.android.gms.internal.ads.o2, b0.a):int");
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class c4 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final xk0 f4987a = new xk0(4);

    /* renamed from: b, reason: collision with root package name */
    public final xk0 f4988b = new xk0(9);

    /* renamed from: c, reason: collision with root package name */
    public final xk0 f4989c = new xk0(11);

    /* renamed from: d, reason: collision with root package name */
    public final xk0 f4990d = new xk0();
    public final d4 e;

    /* renamed from: f, reason: collision with root package name */
    public p2 f4991f;

    /* renamed from: g, reason: collision with root package name */
    public int f4992g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4993h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f4994j;

    /* renamed from: k, reason: collision with root package name */
    public int f4995k;

    /* renamed from: l, reason: collision with root package name */
    public int f4996l;

    /* renamed from: m, reason: collision with root package name */
    public long f4997m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4998n;

    /* renamed from: o, reason: collision with root package name */
    public b4 f4999o;

    /* renamed from: p, reason: collision with root package name */
    public f4 f5000p;

    static {
        int i = xy.O;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.d4, com.google.android.gms.internal.ads.um1] */
    public c4() {
        com.google.android.gms.internal.ads.um1 um1Var = new um1(new l2());
        um1Var.f5301w = -9223372036854775807L;
        um1Var.f5302x = new long[0];
        um1Var.f5303y = new long[0];
        this.e = um1Var;
        this.f4992g = 1;
    }

    public final xk0 a(o2 o2Var) {
        int i = this.f4996l;
        xk0 xk0Var = this.f4990d;
        byte[] bArr = xk0Var.f12580a;
        if (i > bArr.length) {
            int length = bArr.length;
            xk0Var.z(new byte[Math.max(length + length, i)], 0);
        } else {
            xk0Var.E(0);
        }
        xk0Var.C(this.f4996l);
        o2Var.v(xk0Var.f12580a, 0, this.f4996l);
        return xk0Var;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        xk0 xk0Var = this.f4987a;
        i2 i2Var = (i2) o2Var;
        i2Var.E(xk0Var.f12580a, 0, 3, false);
        xk0Var.E(0);
        if (xk0Var.O() == 4607062) {
            i2Var.E(xk0Var.f12580a, 0, 2, false);
            xk0Var.E(0);
            if ((xk0Var.L() & 250) == 0) {
                i2Var.E(xk0Var.f12580a, 0, 4, false);
                xk0Var.E(0);
                int b10 = xk0Var.b();
                i2Var.f6967z = 0;
                i2Var.d(b10, false);
                i2Var.E(xk0Var.f12580a, 0, 4, false);
                xk0Var.E(0);
                if (xk0Var.b() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.f4991f = p2Var;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f4992g = 1;
            this.f4993h = false;
        } else {
            this.f4992g = 3;
        }
        this.f4994j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v37, types: [com.google.android.gms.internal.ads.b4, com.google.android.gms.internal.ads.um1] */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.o2 r32, b0.a r33) {
        /*
            Method dump skipped, instructions count: 1131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c4.h(com.google.android.gms.internal.ads.o2, b0.a):int");
    }
}

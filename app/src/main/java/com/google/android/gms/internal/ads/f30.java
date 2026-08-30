package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class f30 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5901a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5902b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5903c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5904d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5905f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5906g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5907h;
    public final t20 i;

    /* renamed from: j, reason: collision with root package name */
    public int f5908j;

    /* renamed from: k, reason: collision with root package name */
    public int f5909k;

    /* renamed from: l, reason: collision with root package name */
    public int f5910l;

    /* renamed from: m, reason: collision with root package name */
    public int f5911m;

    /* renamed from: n, reason: collision with root package name */
    public int f5912n;

    /* renamed from: o, reason: collision with root package name */
    public int f5913o;

    /* renamed from: p, reason: collision with root package name */
    public int f5914p;

    /* renamed from: q, reason: collision with root package name */
    public double f5915q;

    public f30(int i, int i10, float f10, float f11, int i11, boolean z3) {
        t20 c30Var;
        this.f5901a = i;
        this.f5902b = i10;
        this.f5903c = f10;
        this.f5904d = f11;
        this.e = i / i11;
        this.f5905f = i / 400;
        int i12 = i / 65;
        this.f5906g = i12;
        this.f5907h = i12 + i12;
        if (z3) {
            c30Var = new n20(this);
        } else {
            c30Var = new c30(this);
        }
        this.i = c30Var;
    }

    public final void a(int i, int i10) {
        t20 t20Var = this.i;
        t20Var.s(i10);
        Object v2 = t20Var.v();
        Object j10 = t20Var.j();
        int i11 = this.f5909k;
        int i12 = this.f5902b;
        System.arraycopy(v2, i * i12, j10, i11 * i12, i10 * i12);
        this.f5909k += i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f30.b():void");
    }
}

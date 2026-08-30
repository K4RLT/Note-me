package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class c3 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4973a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4974b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4975c;

    /* renamed from: d, reason: collision with root package name */
    public int f4976d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public p2 f4977f;

    /* renamed from: g, reason: collision with root package name */
    public i3 f4978g;

    public c3(String str, int i, int i10) {
        this.f4973a = i;
        this.f4974b = i10;
        this.f4975c = str;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        boolean z3;
        int i = this.f4974b;
        int i10 = this.f4973a;
        if (i10 != -1 && i != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        xk0 xk0Var = new xk0(i);
        ((i2) o2Var).E(xk0Var.f12580a, 0, i, false);
        if (xk0Var.L() == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.a3, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.f4977f = p2Var;
        i3 A = p2Var.A(1024, 4);
        this.f4978g = A;
        rv1 rv1Var = new rv1();
        String str = this.f4975c;
        rv1Var.d(str);
        rv1Var.e(str);
        A.e(new mw1(rv1Var));
        this.f4977f.z();
        this.f4977f.B(new Object());
        this.e = 1;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        if (j10 == 0 || this.e == 1) {
            this.e = 1;
            this.f4976d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int h(o2 o2Var, b0.a aVar) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            g5.q.l();
            return 0;
        }
        i3 i3Var = this.f4978g;
        i3Var.getClass();
        int d2 = i3Var.d(o2Var, 1024, true);
        if (d2 == -1) {
            this.e = 2;
            this.f4978g.c(0L, 1, this.f4976d, 0, null);
            this.f4976d = 0;
            return 0;
        }
        this.f4976d += d2;
        return 0;
    }
}

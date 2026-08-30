package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5007a;

    /* renamed from: b, reason: collision with root package name */
    public int f5008b;

    /* renamed from: c, reason: collision with root package name */
    public int f5009c;

    /* renamed from: d, reason: collision with root package name */
    public long f5010d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final xk0 f5011f;

    /* renamed from: g, reason: collision with root package name */
    public final xk0 f5012g;

    /* renamed from: h, reason: collision with root package name */
    public int f5013h;
    public int i;

    public c6(xk0 xk0Var, xk0 xk0Var2, boolean z3) {
        this.f5012g = xk0Var;
        this.f5011f = xk0Var2;
        this.e = z3;
        xk0Var2.E(12);
        this.f5007a = xk0Var2.h();
        xk0Var.E(12);
        this.i = xk0Var.h();
        x21.m("first_chunk must be 1", xk0Var.b() == 1);
        this.f5008b = -1;
    }

    public final boolean a() {
        long P;
        int i = this.f5008b + 1;
        this.f5008b = i;
        if (i == this.f5007a) {
            return false;
        }
        boolean z3 = this.e;
        xk0 xk0Var = this.f5011f;
        if (z3) {
            P = xk0Var.j();
        } else {
            P = xk0Var.P();
        }
        this.f5010d = P;
        if (this.f5008b == this.f5013h) {
            xk0 xk0Var2 = this.f5012g;
            this.f5009c = xk0Var2.h();
            xk0Var2.G(4);
            int i10 = -1;
            int i11 = this.i - 1;
            this.i = i11;
            if (i11 > 0) {
                i10 = (-1) + xk0Var2.h();
            }
            this.f5013h = i10;
        }
        return true;
    }
}

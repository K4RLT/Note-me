package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
public final class h4 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6581a;

    /* renamed from: b, reason: collision with root package name */
    public final c3 f6582b;

    /* renamed from: c, reason: collision with root package name */
    public p2 f6583c;

    /* renamed from: d, reason: collision with root package name */
    public n2 f6584d;
    public Pair e;

    /* renamed from: f, reason: collision with root package name */
    public final n2 f6585f;

    public h4(int i) {
        this.f6581a = i;
        switch (i) {
            case 1:
                this.f6582b = new c3("image/jpeg", 65496, 2);
                this.f6585f = new i4();
                return;
            default:
                this.f6582b = new c3("image/heif", -1, -1);
                this.f6585f = new g4();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
        switch (this.f6581a) {
            case 0:
                ((g4) this.f6585f).b();
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        switch (this.f6581a) {
            case 0:
                if (b80.n(o2Var, true)) {
                    return true;
                }
                ((i2) o2Var).f6967z = 0;
                return b80.n(o2Var, false);
            default:
                if (((i4) this.f6585f).e(o2Var)) {
                    return true;
                }
                ((i2) o2Var).f6967z = 0;
                return this.f6582b.e(o2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        switch (this.f6581a) {
            case 0:
                this.f6583c = p2Var;
                return;
            default:
                this.f6583c = p2Var;
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        switch (this.f6581a) {
            case 0:
                n2 n2Var = this.f6584d;
                if (n2Var != null) {
                    n2Var.g(j10, j11);
                    return;
                } else {
                    this.e = Pair.create(Long.valueOf(j10), Long.valueOf(j11));
                    return;
                }
            default:
                n2 n2Var2 = this.f6584d;
                if (n2Var2 != null) {
                    n2Var2.g(j10, j11);
                    return;
                } else {
                    this.e = Pair.create(Long.valueOf(j10), Long.valueOf(j11));
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int h(o2 o2Var, b0.a aVar) {
        switch (this.f6581a) {
            case 0:
                if (this.f6584d == null) {
                    n2 n2Var = (g4) this.f6585f;
                    n2Var.getClass();
                    if (!b80.n(o2Var, true)) {
                        n2Var = this.f6582b;
                    }
                    this.f6584d = n2Var;
                    o2Var.h();
                    Pair pair = this.e;
                    if (pair != null) {
                        this.f6584d.g(((Long) pair.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    n2 n2Var2 = this.f6584d;
                    p2 p2Var = this.f6583c;
                    p2Var.getClass();
                    n2Var2.f(p2Var);
                }
                return this.f6584d.h(o2Var, aVar);
            default:
                if (this.f6584d == null) {
                    n2 n2Var3 = (i4) this.f6585f;
                    if (!n2Var3.e(o2Var)) {
                        n2Var3 = this.f6582b;
                    }
                    this.f6584d = n2Var3;
                    o2Var.h();
                    Pair pair2 = this.e;
                    if (pair2 != null) {
                        this.f6584d.g(((Long) pair2.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    n2 n2Var4 = this.f6584d;
                    p2 p2Var2 = this.f6583c;
                    p2Var2.getClass();
                    n2Var4.f(p2Var2);
                }
                return this.f6584d.h(o2Var, aVar);
        }
    }

    private final void a() {
    }
}

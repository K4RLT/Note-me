package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class ys0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12934u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ at0 f12935v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12936w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dt0 f12937x;

    public /* synthetic */ ys0(at0 at0Var, int i, dt0 dt0Var) {
        this.f12935v = at0Var;
        this.f12936w = i;
        this.f12937x = dt0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f12934u) {
            case 0:
                this.f12935v.n(this.f12937x, this.f12936w);
                return;
            default:
                at0 at0Var = this.f12935v;
                int i = this.f12936w;
                if (i > 0) {
                    at0Var.n(this.f12937x, i);
                }
                at0Var.k(0L);
                return;
        }
    }

    public /* synthetic */ ys0(at0 at0Var, dt0 dt0Var, int i) {
        this.f12935v = at0Var;
        this.f12937x = dt0Var;
        this.f12936w = i;
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class m30 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8226u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n30 f8227v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8228w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8229x;

    public /* synthetic */ m30(n30 n30Var, int i, int i10, int i11) {
        this.f8226u = i11;
        this.f8227v = n30Var;
        this.f8228w = i;
        this.f8229x = i10;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f8226u) {
            case 0:
                n30 n30Var = this.f8227v;
                n30Var.f8533v.execute(new m30(n30Var, this.f8228w, this.f8229x, 1));
                return;
            default:
                this.f8227v.k(this.f8228w - 1, this.f8229x);
                return;
        }
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class l30 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7928u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n30 f7929v;

    public /* synthetic */ l30(n30 n30Var, int i) {
        this.f7928u = i;
        this.f7929v = n30Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f7928u) {
            case 0:
                n30 n30Var = this.f7929v;
                n30Var.f8533v.execute(new l30(n30Var, 1));
                return;
            default:
                this.f7929v.l();
                return;
        }
    }
}

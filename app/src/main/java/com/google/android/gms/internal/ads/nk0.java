package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class nk0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8740u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ok0 f8741v;

    public /* synthetic */ nk0(ok0 ok0Var, int i) {
        this.f8740u = i;
        this.f8741v = ok0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f8740u) {
            case 0:
                this.f8741v.c();
                return;
            case 1:
                this.f8741v.c();
                return;
            default:
                ok0 ok0Var = this.f8741v;
                ok0Var.getClass();
                ok0Var.f9146f.execute(new nk0(ok0Var, 1));
                return;
        }
    }
}

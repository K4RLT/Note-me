package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class pd0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9502u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ qd0 f9503v;

    public /* synthetic */ pd0(qd0 qd0Var, int i) {
        this.f9502u = i;
        this.f9503v = qd0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f9502u) {
            case 0:
                qd0 qd0Var = this.f9503v;
                qd0Var.f9822c.execute(new pd0(qd0Var, 1));
                return;
            case 1:
                this.f9503v.a();
                return;
            default:
                this.f9503v.a();
                return;
        }
    }
}

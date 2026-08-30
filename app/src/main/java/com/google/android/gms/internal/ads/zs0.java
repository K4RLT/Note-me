package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class zs0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13257u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ at0 f13258v;

    public /* synthetic */ zs0(at0 at0Var, int i) {
        this.f13257u = i;
        this.f13258v = at0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13257u) {
            case 0:
                this.f13258v.l();
                return;
            case 1:
                this.f13258v.l();
                return;
            case 2:
                this.f13258v.l();
                return;
            case 3:
                this.f13258v.l();
                return;
            default:
                at0 at0Var = this.f13258v;
                at0Var.f4607b.set(false);
                at0Var.l();
                return;
        }
    }
}

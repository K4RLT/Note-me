package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class qg0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9844u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ rg0 f9845v;

    public /* synthetic */ qg0(rg0 rg0Var, int i) {
        this.f9844u = i;
        this.f9845v = rg0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f9844u) {
            case 0:
                this.f9845v.a();
                return;
            default:
                this.f9845v.a();
                return;
        }
    }
}

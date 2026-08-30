package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fy implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6206u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ hy f6207v;

    public /* synthetic */ fy(hy hyVar, int i) {
        this.f6206u = i;
        this.f6207v = hyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6206u) {
            case 0:
                ly lyVar = this.f6207v.K;
                if (lyVar != null) {
                    lyVar.h();
                    return;
                }
                return;
            case 1:
                ly lyVar2 = this.f6207v.K;
                if (lyVar2 != null) {
                    ky kyVar = lyVar2.f8183y;
                    kyVar.f7902w = false;
                    k9.b0 b0Var = k9.f0.f19676l;
                    b0Var.removeCallbacks(kyVar);
                    b0Var.postDelayed(kyVar, 250L);
                    b0Var.post(new jy(lyVar2, 0));
                    return;
                }
                return;
            case 2:
                hy hyVar = this.f6207v;
                ly lyVar3 = hyVar.K;
                if (lyVar3 != null) {
                    lyVar3.g();
                    hyVar.K.i();
                    return;
                }
                return;
            case 3:
                hy hyVar2 = this.f6207v;
                ly lyVar4 = hyVar2.K;
                if (lyVar4 != null) {
                    if (!hyVar2.L) {
                        lyVar4.k();
                        hyVar2.L = true;
                    }
                    hyVar2.K.f();
                    return;
                }
                return;
            default:
                ly lyVar5 = this.f6207v.K;
                if (lyVar5 != null) {
                    lyVar5.g();
                    return;
                }
                return;
        }
    }
}

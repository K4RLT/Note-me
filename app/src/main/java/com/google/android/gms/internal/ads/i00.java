package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class i00 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6946u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f6947v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f6948w;

    public /* synthetic */ i00(Object obj, long j10, int i) {
        this.f6946u = i;
        this.f6948w = obj;
        this.f6947v = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6946u) {
            case 0:
                ((x00) this.f6948w).f12390u.N0(this.f6947v, true);
                return;
            case 1:
                ((eb.q) this.f6948w).C(this.f6947v);
                return;
            default:
                eb.l2 l2Var = (eb.l2) this.f6948w;
                ((eb.d1) l2Var.f3443v).j().y(this.f6947v);
                l2Var.f16224z = null;
                return;
        }
    }
}

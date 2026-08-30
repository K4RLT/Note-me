package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class e50 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5592u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p8 f5593v;

    public /* synthetic */ e50(p8 p8Var, int i) {
        this.f5592u = i;
        this.f5593v = p8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5592u) {
            case 0:
                this.f5593v.t(new cg0(3));
                return;
            default:
                ((yk0) ((zd1) ((k60) this.f5593v.f9423z).f7669d).f13143w).e();
                return;
        }
    }
}

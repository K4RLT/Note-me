package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fj extends yx {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f6081v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final Object f6082w;

    public fj(mf mfVar) {
        this.f6082w = mfVar;
    }

    @Override // com.google.android.gms.internal.ads.yx, java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        switch (this.f6081v) {
            case 0:
                ((mf) this.f6082w).e();
                return this.f12998u.cancel(z3);
            default:
                return super.cancel(z3);
        }
    }

    public void d() {
        b(this.f6082w);
    }

    public fj(Object obj) {
        this.f6082w = obj;
    }
}

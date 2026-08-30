package com.google.android.gms.internal.ads;
import n.r0;

/* loaded from: classes.dex */
public final /* synthetic */ class p00 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9302u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h00 f9303v;

    public /* synthetic */ p00(h00 h00Var, int i) {
        this.f9302u = i;
        this.f9303v = h00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, r0] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9302u) {
            case 0:
                this.f9303v.destroy();
                return;
            case 1:
                this.f9303v.destroy();
                return;
            case 2:
                this.f9303v.onPause();
                return;
            case 3:
                this.f9303v.onResume();
                return;
            case 4:
                this.f9303v.destroy();
                return;
            case 5:
                this.f9303v.b("onSdkImpression", new r0(0));
                return;
            case 6:
                this.f9303v.destroy();
                return;
            default:
                this.f9303v.B0();
                return;
        }
    }
}

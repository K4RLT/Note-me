package com.google.android.gms.internal.ads;
import k9.a0;

/* loaded from: classes.dex */
public final /* synthetic */ class yq implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12927u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ uq f12928v;

    public /* synthetic */ yq(uq uqVar, int i) {
        this.f12927u = i;
        this.f12928v = uqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12927u) {
            case 0:
                uq uqVar = this.f12928v;
                h00 h00Var = uqVar.f11699u;
                if (h00Var != null) {
                    h00Var.destroy();
                    uqVar.f11699u = null;
                    return;
                }
                return;
            case 1:
                uq uqVar2 = this.f12928v;
                h00 h00Var2 = uqVar2.f11699u;
                if (h00Var2 != null) {
                    h00Var2.destroy();
                    uqVar2.f11699u = null;
                    return;
                }
                return;
            default:
                a0.k("maybeDestroy > Destroying engine.");
                jp jpVar = lp.f8083j;
                uq uqVar3 = this.f12928v;
                uqVar3.e("/result", jpVar);
                h00 h00Var3 = uqVar3.f11699u;
                if (h00Var3 != null) {
                    h00Var3.destroy();
                    uqVar3.f11699u = null;
                    return;
                }
                return;
        }
    }
}

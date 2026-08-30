package com.google.android.gms.internal.ads;
import j9.d;

/* loaded from: classes.dex */
public final /* synthetic */ class h40 implements e80 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6586u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f6587v;

    public /* synthetic */ h40(int i, Object obj) {
        this.f6586u = i;
        this.f6587v = obj;
    }

    @Override // com.google.android.gms.internal.ads.e80
    public final /* synthetic */ void l() {
        j9.d z02;
        switch (this.f6586u) {
            case 0:
                ((x70) this.f6587v).E();
                return;
            default:
                h00 h00Var = (h00) this.f6587v;
                if (h00Var != null && (z02 = h00Var.z0()) != null) {
                    z02.l();
                    return;
                }
                return;
        }
    }
}

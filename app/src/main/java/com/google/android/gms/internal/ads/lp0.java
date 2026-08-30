package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class lp0 implements w9.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8098u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ oh f8099v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ph f8100w;

    public /* synthetic */ lp0(ph phVar, oh ohVar, int i) {
        this.f8098u = i;
        this.f8099v = ohVar;
        this.f8100w = phVar;
    }

    @Override // w9.a
    public final void l() {
        int i = this.f8098u;
        oh ohVar = this.f8099v;
        ph phVar = this.f8100w;
        switch (i) {
            case 0:
                if (((mp0) phVar).D != null) {
                    try {
                        g9.o1 o1Var = (g9.o1) ohVar;
                        o1Var.v2(o1Var.g2(), 1);
                        return;
                    } catch (RemoteException e) {
                        int i10 = k9.a0.f19634b;
                        l9.i.i(e, "#007 Could not call remote method.");
                        return;
                    }
                }
                return;
            default:
                if (((op0) phVar).f9192x != null) {
                    try {
                        g9.m0 m0Var = (g9.m0) ohVar;
                        m0Var.v2(m0Var.g2(), 1);
                        return;
                    } catch (RemoteException e8) {
                        int i11 = k9.a0.f19634b;
                        l9.i.i(e8, "#007 Could not call remote method.");
                        return;
                    }
                }
                return;
        }
    }
}

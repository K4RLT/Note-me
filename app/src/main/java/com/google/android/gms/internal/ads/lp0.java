package com.google.android.gms.internal.ads;
import g9.m0;
import g9.o1;
import k9.a0;
import l9.i;
import w9.a;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class lp0 implements a {

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

    @Override // a
    public final void l() {
        int i = this.f8098u;
        oh ohVar = this.f8099v;
        ph phVar = this.f8100w;
        switch (i) {
            case 0:
                if (((mp0) phVar).D != null) {
                    try {
                        o1 o1Var = (o1) ohVar;
                        o1Var.v2(o1Var.g2(), 1);
                        return;
                    } catch (RemoteException e) {
                        int i10 = a0.f19634b;
                        i.i(e, "#007 Could not call remote method.");
                        return;
                    }
                }
                return;
            default:
                if (((op0) phVar).f9192x != null) {
                    try {
                        m0 m0Var = (m0) ohVar;
                        m0Var.v2(m0Var.g2(), 1);
                        return;
                    } catch (RemoteException e8) {
                        int i11 = a0.f19634b;
                        i.i(e8, "#007 Could not call remote method.");
                        return;
                    }
                }
                return;
        }
    }
}

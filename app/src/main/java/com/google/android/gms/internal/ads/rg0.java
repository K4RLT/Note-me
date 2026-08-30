package com.google.android.gms.internal.ads;
import ca.b;
import f9.k;
import fa.c;
import g9.r;
import k9.a0;
import l9.i;
import r.e;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class rg0 extends pg0 {
    public String A;
    public int B;

    @Override // fa.b
    public final void g0() {
        av ng0Var;
        av ng0Var2;
        synchronized (this.f9515v) {
            try {
                if (!this.f9517x) {
                    this.f9517x = true;
                    try {
                        try {
                            int i = this.B;
                            if (i == 2) {
                                wu wuVar = (wu) this.f9519z.t();
                                dv dvVar = this.f9518y;
                                if (((Boolean) g9.r.e.f17698c.a(sl.Ae)).booleanValue()) {
                                    ng0Var2 = new og0(this.f9514u, this.f9518y);
                                } else {
                                    ng0Var2 = new ng0(this);
                                }
                                wuVar.R2(dvVar, ng0Var2);
                            } else if (i == 3) {
                                wu wuVar2 = (wu) this.f9519z.t();
                                String str = this.A;
                                if (((Boolean) g9.r.e.f17698c.a(sl.Ae)).booleanValue()) {
                                    ng0Var = new og0(this.f9514u, this.f9518y);
                                } else {
                                    ng0Var = new ng0(this);
                                }
                                wuVar2.z2(str, ng0Var);
                            } else {
                                this.f9514u.c(new cg0(1));
                            }
                        } catch (Throwable th) {
                            f9.k.C.f16817h.d("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                            this.f9514u.c(new cg0(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f9514u.c(new cg0(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pg0, fa.c
    public final void r0(ca.b bVar) {
        int i = k9.a0.f19634b;
        l9.i.a("Cannot connect to remote service, fallback to local instance.");
        this.f9514u.c(new cg0(1));
    }
}

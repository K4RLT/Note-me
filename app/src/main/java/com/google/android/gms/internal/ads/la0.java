package com.google.android.gms.internal.ads;
import ac.b;
import k9.a0;
import l9.i;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class la0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7998u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ na0 f7999v;

    public /* synthetic */ la0(na0 na0Var, int i) {
        this.f7998u = i;
        this.f7999v = na0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qo qoVar = null;
        switch (this.f7998u) {
            case 0:
                na0 na0Var = this.f7999v;
                na0Var.f8616n.L();
                ra0 ra0Var = na0Var.f8615m;
                synchronized (ra0Var) {
                    try {
                        h00 h00Var = ra0Var.i;
                        if (h00Var != null) {
                            h00Var.destroy();
                            ra0Var.i = null;
                        }
                        h00 h00Var2 = ra0Var.f10172j;
                        if (h00Var2 != null) {
                            h00Var2.destroy();
                            ra0Var.f10172j = null;
                        }
                        h00 h00Var3 = ra0Var.f10173k;
                        if (h00Var3 != null) {
                            h00Var3.destroy();
                            ra0Var.f10173k = null;
                        }
                        b bVar = ra0Var.f10175m;
                        if (bVar != null) {
                            bVar.cancel(false);
                            ra0Var.f10175m = null;
                        }
                        yx yxVar = ra0Var.f10176n;
                        if (yxVar != null) {
                            yxVar.cancel(false);
                            ra0Var.f10176n = null;
                        }
                        ra0Var.f10174l = null;
                        ra0Var.f10184v.clear();
                        ra0Var.f10185w.clear();
                        ra0Var.f10166b = null;
                        ra0Var.f10167c = null;
                        ra0Var.f10168d = null;
                        ra0Var.e = null;
                        ra0Var.f10171h = null;
                        ra0Var.f10177o = null;
                        ra0Var.f10178p = null;
                        ra0Var.f10179q = null;
                        ra0Var.f10181s = null;
                        ra0Var.f10182t = null;
                        ra0Var.f10183u = null;
                    } finally {
                    }
                }
                return;
            default:
                na0 na0Var2 = this.f7999v;
                wa0 wa0Var = na0Var2.f8619q;
                try {
                    ra0 ra0Var2 = na0Var2.f8615m;
                    int q10 = ra0Var2.q();
                    if (q10 != 1) {
                        if (q10 != 2) {
                            if (q10 != 3) {
                                if (q10 != 6) {
                                    if (q10 != 7) {
                                        int i = a0.f19634b;
                                        i.c("Wrong native template id!");
                                        return;
                                    }
                                    oq oqVar = wa0Var.e;
                                    if (oqVar != null) {
                                        hc0 hc0Var = (hc0) na0Var2.f8623u.zzb();
                                        Parcel g22 = oqVar.g2();
                                        qh.e(g22, hc0Var);
                                        oqVar.v2(g22, 1);
                                        return;
                                    }
                                    return;
                                }
                                uo uoVar = wa0Var.f12200c;
                                if (uoVar != null) {
                                    na0Var2.l();
                                    uoVar.h4((xo) na0Var2.f8622t.zzb());
                                    return;
                                }
                                return;
                            }
                            String g8 = ra0Var2.g();
                            if (g8 != null) {
                                qoVar = (qo) wa0Var.f12202f.get(g8);
                            }
                            if (qoVar != null) {
                                if (ra0Var2.h() != null) {
                                    na0Var2.e("Google", true);
                                }
                                qoVar.N2((ko) na0Var2.f8624v.zzb());
                                return;
                            }
                            return;
                        }
                        lo loVar = wa0Var.f12199b;
                        if (loVar != null) {
                            na0Var2.l();
                            ic0 ic0Var = (ic0) na0Var2.f8621s.zzb();
                            Parcel g23 = loVar.g2();
                            qh.e(g23, ic0Var);
                            loVar.v2(g23, 1);
                            return;
                        }
                        return;
                    }
                    mo moVar = wa0Var.f12198a;
                    if (moVar != null) {
                        na0Var2.l();
                        kc0 kc0Var = (kc0) na0Var2.f8620r.zzb();
                        Parcel g24 = moVar.g2();
                        qh.e(g24, kc0Var);
                        moVar.v2(g24, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e) {
                    int i10 = a0.f19634b;
                    i.d("RemoteException when notifyAdLoad is called", e);
                    return;
                }
        }
    }
}

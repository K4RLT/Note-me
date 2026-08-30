package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import k9.c0;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class ap0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4568a;

    /* renamed from: b, reason: collision with root package name */
    public final tr1 f4569b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f4570c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f4571d;

    public /* synthetic */ ap0(tr1 tr1Var, rr1 rr1Var, rr1 rr1Var2, int i) {
        this.f4568a = i;
        this.f4569b = tr1Var;
        this.f4570c = rr1Var;
        this.f4571d = rr1Var2;
    }

    public zo0 a() {
        mx mxVar;
        mx mxVar2;
        switch (this.f4568a) {
            case 0:
                Context context = (Context) this.f4569b.f11431a;
                mq0 mq0Var = (mq0) this.f4570c.zzb();
                wq0 wq0Var = (wq0) this.f4571d.zzb();
                nl nlVar = sl.f10793j7;
                r rVar = r.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    mxVar = k.C.f16817h.g().n();
                } else {
                    c0 g8 = k.C.f16817h.g();
                    synchronized (g8.f19642a) {
                        mxVar = g8.f19653n;
                    }
                }
                boolean z3 = false;
                if (mxVar != null && mxVar.f8478j) {
                    z3 = true;
                }
                if (((Integer) rVar.f17698c.a(sl.f11046z7)).intValue() > 0) {
                    if (!((Boolean) rVar.f17698c.a(sl.f10777i7)).booleanValue() || z3) {
                        vq0 a10 = wq0Var.a(pq0.f9587w, context, mq0Var, new hx0(28, new jk0(26)));
                        mu muVar = new mu(new to0(0, (byte) 0));
                        zd1 zd1Var = a10.f11968a;
                        wx wxVar = xx.f12651a;
                        return new yd1(muVar, new hq0(zd1Var, wxVar), a10.f11969b, ((qq0) zd1Var.f13143w).A, wxVar);
                    }
                }
                return new to0(0, (byte) 0);
            default:
                Context context2 = (Context) this.f4569b.f11431a;
                mq0 mq0Var2 = (mq0) this.f4570c.zzb();
                wq0 wq0Var2 = (wq0) this.f4571d.zzb();
                nl nlVar2 = sl.f10793j7;
                r rVar2 = r.e;
                if (((Boolean) rVar2.f17698c.a(nlVar2)).booleanValue()) {
                    mxVar2 = k.C.f16817h.g().n();
                } else {
                    c0 g10 = k.C.f16817h.g();
                    synchronized (g10.f19642a) {
                        mxVar2 = g10.f19653n;
                    }
                }
                boolean z9 = false;
                if (mxVar2 != null && mxVar2.f8478j) {
                    z9 = true;
                }
                if (((Integer) rVar2.f17698c.a(sl.f10823l7)).intValue() > 0) {
                    if (!((Boolean) rVar2.f17698c.a(sl.f10777i7)).booleanValue() || z9) {
                        vq0 a11 = wq0Var2.a(pq0.f9585u, context2, mq0Var2, new hx0(28, new jk0(26)));
                        mu muVar2 = new mu(new to0(0, (byte) 0));
                        zd1 zd1Var2 = a11.f11968a;
                        wx wxVar2 = xx.f12651a;
                        return new yd1(muVar2, new hq0(zd1Var2, wxVar2), a11.f11969b, ((qq0) zd1Var2.f13143w).A, wxVar2);
                    }
                }
                return new to0(0, (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f4568a) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return new zz0("yVK2BtjhkWiqPWfXVe7pCdqpfz2Ps9CcWbBtlKTt4FN37/tD76f0HDGVwAjTsvKH", "Fo5nkU2nfGSO+g2iGIxI5+P04k6pQ8lbcFZjpNOd5oc=", (wd) this.f4569b.f11431a, (pz0) this.f4570c.zzb(), ((h21) this.f4571d.zzb()).a(114), 1);
            default:
                return new zz0("50+sX4d44jerXZ0t37Z07Ss5Y2LVKA0u1WWlTsyrM+njWBpcjf8xU2ZOd5yoshWp", "IaakTOOFGOw3T0IOJ/LBUMRFnsvXDEiR+LxXdy42JcU=", (wd) this.f4569b.f11431a, (pz0) this.f4570c.zzb(), ((h21) this.f4571d.zzb()).a(ModuleDescriptor.MODULE_VERSION), 0);
        }
    }
}

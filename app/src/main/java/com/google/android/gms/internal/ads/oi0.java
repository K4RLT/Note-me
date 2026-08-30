package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class oi0 implements ji0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9128a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9129b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f9130c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9131d;

    public /* synthetic */ oi0(Context context, Object obj, Executor executor, int i) {
        this.f9128a = i;
        this.f9129b = context;
        this.f9131d = obj;
        this.f9130c = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x052f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(com.google.android.gms.internal.ads.wp0 r68, com.google.android.gms.internal.ads.qp0 r69, com.google.android.gms.internal.ads.gi0 r70) {
        /*
            Method dump skipped, instructions count: 3143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oi0.c(com.google.android.gms.internal.ads.wp0, com.google.android.gms.internal.ads.qp0, com.google.android.gms.internal.ads.gi0):java.lang.Object");
    }

    public static final boolean d(wp0 wp0Var, int i) {
        return ((aq0) wp0Var.f12312a.f4819v).f4584h.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.ji0
    public final Object a(wp0 wp0Var, qp0 qp0Var, gi0 gi0Var) {
        Exception exc;
        View view;
        int i = this.f9128a;
        Executor executor = this.f9130c;
        Object obj = this.f9131d;
        switch (i) {
            case 0:
                hq0 hq0Var = new hq0(wp0Var, qp0Var, gi0Var.f6406a);
                com.google.android.gms.internal.measurement.e4 e4Var = new com.google.android.gms.internal.measurement.e4(6, new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(this, gi0Var, qp0Var), null, false);
                b8.u4 u4Var = new b8.u4(qp0Var.f9925a0, 2);
                b20 b20Var = (b20) obj;
                y10 y10Var = b20Var.f4676c;
                b20 b20Var2 = b20Var.f4677d;
                z10 z10Var = new z10(y10Var, b20Var2, hq0Var, e4Var, u4Var);
                ((e70) z10Var.U.zzb()).L1(new e30(0, (iq0) gi0Var.f6407b), executor);
                ((zi0) gi0Var.f6408c).w4(new gk0((q60) z10Var.f13036c0.zzb(), (e90) z10Var.f13038e0.zzb(), (a70) z10Var.Y.zzb(), (g70) z10Var.f13035b0.zzb(), (j70) z10Var.f13039f0.zzb(), (h80) b20Var2.S.zzb(), (r70) z10Var.f13040g0.zzb(), (l90) z10Var.f13041h0.zzb(), (f80) z10Var.f13042i0.zzb(), (y60) z10Var.f13044k0.zzb()));
                return z10Var.l0();
            case 1:
                Object obj2 = gi0Var.f6407b;
                if (((Boolean) g9.r.e.f17698c.a(sl.W8)).booleanValue() && qp0Var.f9936g0) {
                    try {
                        bs h02 = ((iq0) obj2).f7192a.h0();
                        if (h02 != null) {
                            try {
                                view = (View) oa.b.z1(h02.u4());
                                boolean b10 = h02.b();
                                if (view != null) {
                                    if (b10) {
                                        try {
                                            view = (View) ed1.c0(v81.f11836v, new d50(5, this, view, qp0Var), xx.f12655f).get();
                                        } catch (InterruptedException | ExecutionException e) {
                                            throw new Exception(e);
                                        }
                                    }
                                } else {
                                    throw new Exception(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                                }
                            } catch (RemoteException e8) {
                                throw new Exception(e8);
                            }
                        } else {
                            int i10 = k9.a0.f19634b;
                            l9.i.c("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                            throw new Exception(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                        }
                    } finally {
                    }
                } else {
                    try {
                        view = (View) oa.b.z1(((iq0) obj2).f7192a.b());
                    } finally {
                    }
                }
                d20 d20Var = (d20) obj;
                hq0 hq0Var2 = new hq0(wp0Var, qp0Var, gi0Var.f6406a);
                iq0 iq0Var = (iq0) obj2;
                tw twVar = new tw(view, (h00) null, new hx0(24, iq0Var), (rp0) qp0Var.f9960u.get(0));
                y10 y10Var2 = d20Var.f5263d;
                d20 d20Var2 = d20Var.e;
                c20 c20Var = new c20(y10Var2, d20Var2, hq0Var2, twVar);
                ((d90) c20Var.f4970n0.zzb()).U1(view);
                ((e70) c20Var.U.zzb()).L1(new e30(0, iq0Var), executor);
                ((zi0) gi0Var.f6408c).w4(new gk0((q60) c20Var.Z.zzb(), (e90) c20Var.f4964f0.zzb(), (a70) c20Var.f4961c0.zzb(), (g70) c20Var.Y.zzb(), c20Var.l0(), (h80) d20Var2.U.zzb(), (r70) c20Var.f4967i0.zzb(), (l90) c20Var.f4968j0.zzb(), (f80) c20Var.f4969k0.zzb(), (y60) c20Var.l0.zzb()));
                return c20Var.m0();
            default:
                return c(wp0Var, qp0Var, gi0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.ji0
    public final void b(wp0 wp0Var, qp0 qp0Var, gi0 gi0Var) {
        Exception exc;
        g9.c3 t3;
        switch (this.f9128a) {
            case 0:
                iq0 iq0Var = (iq0) gi0Var.f6407b;
                aq0 aq0Var = (aq0) wp0Var.f12312a.f4819v;
                String jSONObject = qp0Var.f9962v.toString();
                Context context = this.f9129b;
                as asVar = (as) gi0Var.f6408c;
                try {
                    iq0Var.f7192a.P2(new oa.b(context), aq0Var.f4581d, jSONObject, asVar);
                    return;
                } finally {
                }
            case 1:
                up0 up0Var = qp0Var.f9956s;
                JSONObject jSONObject2 = qp0Var.f9962v;
                boolean z3 = qp0Var.f9936g0;
                IInterface iInterface = gi0Var.f6408c;
                Object obj = gi0Var.f6407b;
                aq0 aq0Var2 = (aq0) wp0Var.f12312a.f4819v;
                g9.c3 c3Var = aq0Var2.f4582f;
                boolean z9 = c3Var.H;
                int i = c3Var.f17590v;
                int i10 = c3Var.f17593y;
                Context context2 = this.f9129b;
                if (z9) {
                    z8.h hVar = new z8.h(i10, i);
                    hVar.f31989d = true;
                    hVar.e = i;
                    t3 = new g9.c3(context2, hVar);
                } else {
                    if (((Boolean) g9.r.e.f17698c.a(sl.W8)).booleanValue() && z3) {
                        z8.h hVar2 = new z8.h(i10, i);
                        hVar2.f31990f = true;
                        hVar2.f31991g = i;
                        t3 = new g9.c3(context2, hVar2);
                    } else {
                        t3 = xy.t(context2, qp0Var.f9960u);
                    }
                }
                g9.c3 c3Var2 = t3;
                if (((Boolean) g9.r.e.f17698c.a(sl.W8)).booleanValue() && z3) {
                    iq0 iq0Var2 = (iq0) obj;
                    try {
                        iq0Var2.f7192a.S1(new oa.b(context2), c3Var2, aq0Var2.f4581d, jSONObject2.toString(), wa.g9.i(up0Var), (as) iInterface);
                        return;
                    } finally {
                    }
                }
                iq0 iq0Var3 = (iq0) obj;
                try {
                    iq0Var3.f7192a.L0(new oa.b(context2), c3Var2, aq0Var2.f4581d, jSONObject2.toString(), wa.g9.i(up0Var), (as) iInterface);
                    return;
                } finally {
                }
            default:
                iq0 iq0Var4 = (iq0) gi0Var.f6407b;
                aq0 aq0Var3 = (aq0) wp0Var.f12312a.f4819v;
                String jSONObject3 = qp0Var.f9962v.toString();
                String i11 = wa.g9.i(qp0Var.f9956s);
                Context context3 = this.f9129b;
                as asVar2 = (as) gi0Var.f6408c;
                rn rnVar = aq0Var3.f4585j;
                ArrayList arrayList = aq0Var3.f4584h;
                try {
                    iq0Var4.f7192a.Z1(new oa.b(context3), aq0Var3.f4581d, jSONObject3, i11, asVar2, rnVar, arrayList);
                    return;
                } finally {
                }
        }
    }
}

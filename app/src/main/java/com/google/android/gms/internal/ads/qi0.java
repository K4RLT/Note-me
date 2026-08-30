package com.google.android.gms.internal.ads;
import a0.l;
import b8.u4;
import k9.a0;
import oa.b;
import z8.b;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qi0 implements ji0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9850a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9851b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9852c;

    public /* synthetic */ qi0(Context context, Object obj, int i) {
        this.f9850a = i;
        this.f9851b = context;
        this.f9852c = obj;
    }

    @Override // com.google.android.gms.internal.ads.ji0
    public final Object a(wp0 wp0Var, qp0 qp0Var, gi0 gi0Var) {
        switch (this.f9850a) {
            case 0:
                tw twVar = new tw(qp0Var, (zs) gi0Var.f6407b, z8.b.APP_OPEN_AD);
                hq0 hq0Var = new hq0(wp0Var, qp0Var, gi0Var.f6406a);
                com.google.android.gms.internal.measurement.e4 e4Var = new com.google.android.gms.internal.measurement.e4(6, twVar, null, false);
                b8.u4 u4Var = new b8.u4(qp0Var.f9925a0, 2);
                b20 b20Var = (b20) this.f9852c;
                y10 y10Var = b20Var.f4676c;
                b20 b20Var2 = b20Var.f4677d;
                z10 z10Var = new z10(y10Var, b20Var2, hq0Var, e4Var, u4Var);
                rr1 rr1Var = z10Var.Y;
                twVar.f11473y = (a70) rr1Var.zzb();
                ((zi0) gi0Var.f6408c).w4(new dk0((q60) z10Var.f13036c0.zzb(), (e90) z10Var.f13038e0.zzb(), (a70) rr1Var.zzb(), (g70) z10Var.f13035b0.zzb(), (j70) z10Var.f13039f0.zzb(), (h80) b20Var2.S.zzb(), (r70) z10Var.f13040g0.zzb(), (l90) z10Var.f13041h0.zzb(), (f80) z10Var.f13042i0.zzb(), (y60) z10Var.f13044k0.zzb()));
                return z10Var.l0();
            case 1:
                tw twVar2 = new tw(qp0Var, (zs) gi0Var.f6407b, z8.b.INTERSTITIAL);
                hq0 hq0Var2 = new hq0(wp0Var, qp0Var, gi0Var.f6406a);
                com.google.android.gms.internal.measurement.e4 e4Var2 = new com.google.android.gms.internal.measurement.e4(6, twVar2, null, false);
                h20 h20Var = (h20) this.f9852c;
                y10 y10Var2 = h20Var.f6547b;
                h20 h20Var2 = h20Var.f6548c;
                g20 g20Var = new g20(y10Var2, h20Var2, hq0Var2, e4Var2);
                rr1 rr1Var2 = g20Var.X;
                twVar2.f11473y = (a70) rr1Var2.zzb();
                ((zi0) gi0Var.f6408c).w4(new dk0((q60) g20Var.f6262b0.zzb(), (e90) g20Var.f6265e0.zzb(), (a70) rr1Var2.zzb(), (g70) g20Var.f6261a0.zzb(), (j70) g20Var.f6266f0.zzb(), (h80) h20Var2.S.zzb(), (r70) g20Var.f6268h0.zzb(), (l90) g20Var.f6269i0.zzb(), (f80) g20Var.f6270j0.zzb(), (y60) g20Var.l0.zzb()));
                return g20Var.l0();
            default:
                tw twVar3 = new tw(qp0Var, (zs) gi0Var.f6407b, z8.b.REWARDED);
                hq0 hq0Var3 = new hq0(wp0Var, qp0Var, gi0Var.f6406a);
                zc0 zc0Var = new zc0(twVar3, null, 0);
                k20 k20Var = (k20) this.f9852c;
                y10 y10Var3 = k20Var.f7611c;
                k20 k20Var2 = k20Var.f7613d;
                j20 j20Var = new j20(y10Var3, k20Var2, hq0Var3, zc0Var);
                rr1 rr1Var3 = j20Var.X;
                twVar3.f11473y = (a70) rr1Var3.zzb();
                ((zi0) gi0Var.f6408c).w4(new ck0((q60) j20Var.f7289b0.zzb(), (e90) j20Var.f7291d0.zzb(), (a70) rr1Var3.zzb(), (g70) j20Var.f7288a0.zzb(), (j70) j20Var.f7292e0.zzb(), (y60) j20Var.f7298k0.zzb(), (h80) k20Var2.W.zzb(), (l90) j20Var.f7295h0.zzb(), (r70) j20Var.f7294g0.zzb(), (i90) j20Var.m0.zzb(), (f80) j20Var.f7296i0.zzb()));
                return j20Var.l0();
        }
    }

    @Override // com.google.android.gms.internal.ads.ji0
    public final void b(wp0 wp0Var, qp0 qp0Var, gi0 gi0Var) {
        switch (this.f9850a) {
            case 0:
                try {
                    zs zsVar = (zs) gi0Var.f6407b;
                    zsVar.Z2(qp0Var.Z);
                    zsVar.q3(qp0Var.U, qp0Var.f9962v.toString(), ((aq0) wp0Var.f12312a.f4819v).f4581d, new oa.b(this.f9851b), new pi0(gi0Var), (as) gi0Var.f6408c);
                    return;
                } catch (RemoteException e) {
                    k9.a0.l("Remote exception loading an app open RTB ad", e);
                    throw new Exception(e);
                }
            case 1:
                try {
                    zs zsVar2 = (zs) gi0Var.f6407b;
                    zsVar2.Z2(qp0Var.Z);
                    zsVar2.Q2(qp0Var.U, qp0Var.f9962v.toString(), ((aq0) wp0Var.f12312a.f4819v).f4581d, new oa.b(this.f9851b), new dj0(this, gi0Var), (as) gi0Var.f6408c);
                    return;
                } catch (RemoteException e8) {
                    k9.a0.l("Remote exception loading a interstitial RTB ad", e8);
                    throw new Exception(e8);
                }
            default:
                try {
                    Object obj = gi0Var.f6407b;
                    IInterface iInterface = gi0Var.f6408c;
                    zs zsVar3 = (zs) obj;
                    String str = qp0Var.Z;
                    JSONObject jSONObject = qp0Var.f9962v;
                    zsVar3.Z2(str);
                    aq0 aq0Var = (aq0) wp0Var.f12312a.f4819v;
                    int i = aq0Var.f4591p.f2825v;
                    String str2 = qp0Var.U;
                    Context context = this.f9851b;
                    if (i == 3) {
                        zsVar3.C0(str2, jSONObject.toString(), aq0Var.f4581d, new oa.b(context), new xj0(this, gi0Var), (as) iInterface);
                    } else {
                        zsVar3.F2(str2, jSONObject.toString(), aq0Var.f4581d, new oa.b(context), new xj0(this, gi0Var), (as) iInterface);
                    }
                    return;
                } catch (RemoteException e10) {
                    k9.a0.l("Remote exception loading a rewarded RTB ad", e10);
                    return;
                }
        }
    }
}

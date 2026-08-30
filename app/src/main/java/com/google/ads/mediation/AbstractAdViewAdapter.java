package com.google.ads.mediation;
import a.a;
import d.c;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.ap;
import com.google.android.gms.internal.ads.bp;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.pq;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.um;
import com.google.android.gms.internal.ads.zd1;
import com.google.android.gms.internal.ads.zo;
import g9.c2;
import g9.e2;
import g9.g0;
import g9.k0;
import g9.p;
import g9.r;
import g9.w2;
import g9.x2;
import g9.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import n9.a0;
import n9.f;
import n9.n;
import z8.g;
import z8.h;
import z8.i;
import z8.s;
import z8.t;
import z8.v;

/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private z8.e adLoader;
    protected i mAdView;
    protected m9.a mInterstitialAd;

    public g buildAdRequest(Context context, f fVar, Bundle bundle, Bundle bundle2) {
        c1.a aVar = new c1.a(6);
        c2 c2Var = (c2) aVar.f3443v;
        Set d2 = fVar.d();
        if (d2 != null) {
            Iterator it = d2.iterator();
            while (it.hasNext()) {
                ((HashSet) c2Var.f17581d).add((String) it.next());
            }
        }
        if (fVar.c()) {
            l9.d dVar = p.f17688g.f17689a;
            ((HashSet) c2Var.e).add(l9.c(context));
        }
        if (fVar.a() != -1) {
            int i = 1;
            if (fVar.a() != 1) {
                i = 0;
            }
            c2Var.f17578a = i;
        }
        c2Var.f17580c = fVar.b();
        aVar.g(buildExtrasBundle(bundle, bundle2));
        return new g(aVar);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString("pubid");
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public m9.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public z1 getVideoController() {
        z1 z1Var;
        i iVar = this.mAdView;
        if (iVar != null) {
            s sVar = (s) iVar.f31994u.f17617d;
            synchronized (sVar.f32003a) {
                z1Var = sVar.f32004b;
            }
            return z1Var;
        }
        return null;
    }

    public z8.d newAdLoader(Context context, String str) {
        return new z8.d(context, str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(2:5|(2:7|8))|9|10|11|(1:13)|8) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        l9.i.i(r0, "#007 Could not call remote method.");
     */
    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, n9.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            r5 = this;
            z8.i r0 = r5.mAdView
            r1 = 0
            if (r0 == 0) goto L4f
            android.content.Context r2 = r0.getContext()
            com.google.android.gms.internal.ads.sl.a(r2)
            com.google.android.gms.internal.ads.nb r2 = com.google.android.gms.internal.ads.um.e
            java.lang.Object r2 = r2.p()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L38
            com.google.android.gms.internal.ads.nl r2 = com.google.android.gms.internal.ads.sl.f11050zc
            g9.r r3 = g9.r.e
            com.google.android.gms.internal.ads.ql r3 = r3.f17698c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L38
            java.util.concurrent.ExecutorService r2 = l9.b.f20035b
            z8.v r3 = new z8.v
            r4 = 2
            r3.<init>(r0, r4)
            r2.execute(r3)
            goto L4d
        L38:
            g9.e2 r0 = r0.f31994u
            r0.getClass()
            java.lang.Object r0 = r0.f17621j     // Catch: android.os.RemoteException -> L47
            g9.k0 r0 = (g9.k0) r0     // Catch: android.os.RemoteException -> L47
            if (r0 == 0) goto L4d
            r0.y()     // Catch: android.os.RemoteException -> L47
            goto L4d
        L47:
            r0 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            l9.i.i(r0, r2)
        L4d:
            r5.mAdView = r1
        L4f:
            m9.a r0 = r5.mInterstitialAd
            if (r0 == 0) goto L55
            r5.mInterstitialAd = r1
        L55:
            z8.e r0 = r5.adLoader
            if (r0 == 0) goto L5b
            r5.adLoader = r1
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.AbstractAdViewAdapter.onDestroy():void");
    }

    public void onImmersiveModeUpdated(boolean z3) {
        m9.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            try {
                k0 k0Var = ((pq) aVar).f9583c;
                if (k0Var != null) {
                    k0Var.t0(z3);
                }
            } catch (RemoteException e) {
                l9.i.i(e, "#007 Could not call remote method.");
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, n9.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        i iVar = this.mAdView;
        if (iVar != null) {
            sl.a(iVar.getContext());
            if (((Boolean) um.f11681g.p()).booleanValue()) {
                if (((Boolean) r.e.f17698c.a(sl.Ac)).booleanValue()) {
                    l9.b.f20035b.execute(new v(iVar, 0));
                    return;
                }
            }
            e2 e2Var = iVar.f31994u;
            e2Var.getClass();
            try {
                k0 k0Var = (k0) e2Var.f17621j;
                if (k0Var != null) {
                    k0Var.a();
                }
            } catch (RemoteException e) {
                l9.i.i(e, "#007 Could not call remote method.");
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, n9.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        i iVar = this.mAdView;
        if (iVar != null) {
            sl.a(iVar.getContext());
            if (((Boolean) um.f11682h.p()).booleanValue()) {
                if (((Boolean) r.e.f17698c.a(sl.f11036yc)).booleanValue()) {
                    l9.b.f20035b.execute(new v(iVar, 1));
                    return;
                }
            }
            e2 e2Var = iVar.f31994u;
            e2Var.getClass();
            try {
                k0 k0Var = (k0) e2Var.f17621j;
                if (k0Var != null) {
                    k0Var.b();
                }
            } catch (RemoteException e) {
                l9.i.i(e, "#007 Could not call remote method.");
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, n nVar, Bundle bundle, h hVar, f fVar, Bundle bundle2) {
        i iVar = new i(context);
        this.mAdView = iVar;
        iVar.setAdSize(new h(hVar.f31986a, hVar.f31987b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, nVar));
        this.mAdView.a(buildAdRequest(context, fVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, n9.s sVar, Bundle bundle, f fVar, Bundle bundle2) {
        m9.a(context, getAdUnitId(bundle), buildAdRequest(context, fVar, bundle2, bundle), new c(this, sVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, n9.v vVar, Bundle bundle, a0 a0Var, Bundle bundle2) {
        c9.c cVar;
        e eVar;
        e eVar2 = new e(this, vVar);
        z8.d newAdLoader = newAdLoader(context, bundle.getString("pubid"));
        newAdLoader.getClass();
        g0 g0Var = newAdLoader.f31980b;
        try {
            g0Var.f1(new x2(eVar2));
        } catch (RemoteException e) {
            l9.i.g("Failed to set AdListener.", e);
        }
        ns nsVar = (ns) a0Var;
        nsVar.getClass();
        c9.c cVar2 = new c9.c();
        rn rnVar = nsVar.f8833d;
        if (rnVar == null) {
            cVar = new c9.c(cVar2);
        } else {
            int i = rnVar.f10248u;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        cVar2.f4012g = rnVar.A;
                        cVar2.f4009c = rnVar.B;
                    }
                    cVar2.f4007a = rnVar.f10249v;
                    cVar2.f4008b = rnVar.f10250w;
                    cVar2.f4010d = rnVar.f10251x;
                    cVar = new c9.c(cVar2);
                }
                w2 w2Var = rnVar.f10253z;
                if (w2Var != null) {
                    cVar2.f4011f = new t(w2Var);
                }
            }
            cVar2.e = rnVar.f10252y;
            cVar2.f4007a = rnVar.f10249v;
            cVar2.f4008b = rnVar.f10250w;
            cVar2.f4010d = rnVar.f10251x;
            cVar = new c9.c(cVar2);
        }
        try {
            g0Var.k4(new rn(cVar));
        } catch (RemoteException e8) {
            l9.i.g("Failed to specify native ad options", e8);
        }
        HashMap hashMap = nsVar.f8835g;
        ArrayList arrayList = nsVar.e;
        newAdLoader.b(rn.a(nsVar.f8833d));
        if (arrayList.contains("6")) {
            try {
                g0Var.i3(new bp(0, eVar2));
            } catch (RemoteException e10) {
                l9.i.g("Failed to add google native ad listener", e10);
            }
        }
        if (arrayList.contains("3")) {
            for (String str : hashMap.keySet()) {
                zo zoVar = null;
                if (true != ((Boolean) hashMap.get(str)).booleanValue()) {
                    eVar = null;
                } else {
                    eVar = eVar2;
                }
                zd1 zd1Var = new zd1(eVar2, eVar);
                try {
                    ap apVar = new ap(zd1Var);
                    if (eVar != null) {
                        zoVar = new zo(zd1Var);
                    }
                    g0Var.i2(str, apVar, zoVar);
                } catch (RemoteException e11) {
                    l9.i.g("Failed to add custom template ad listener", e11);
                }
            }
        }
        z8.e a10 = newAdLoader.a();
        this.adLoader = a10;
        a10.a(buildAdRequest(context, a0Var, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        m9.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.b(null);
        }
    }
}

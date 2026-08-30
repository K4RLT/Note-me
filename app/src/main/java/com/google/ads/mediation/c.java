package com.google.ads.mediation;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.hq0;
import com.google.android.gms.internal.ads.pq;
import fa.y;
import g9.k0;
import l9.i;
import n9.s;
import z8.l;

/* loaded from: classes.dex */
public final class c extends m9.b {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractAdViewAdapter f4204d;
    public final s e;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, s sVar) {
        this.f4204d = abstractAdViewAdapter;
        this.e = sVar;
    }

    @Override // z8.u
    public final void a(l lVar) {
        ((hq0) this.e).f(lVar);
    }

    @Override // z8.u
    public final void b(Object obj) {
        m9.a aVar = (m9.a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f4204d;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        s sVar = this.e;
        d dVar = new d(abstractAdViewAdapter, sVar);
        pq pqVar = (pq) aVar;
        pqVar.getClass();
        try {
            k0 k0Var = pqVar.f9583c;
            if (k0Var != null) {
                k0Var.z3(new g9.s(dVar));
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
        hq0 hq0Var = (hq0) sVar;
        hq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdLoaded.");
        try {
            ((as) hq0Var.f6872v).f();
        } catch (RemoteException e8) {
            i.i(e8, "#007 Could not call remote method.");
        }
    }
}

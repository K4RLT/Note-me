package com.google.ads.mediation;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.hq0;
import com.google.android.gms.internal.ads.hx0;
import fa.y;
import l9.i;
import n9.v;
import z8.l;

/* loaded from: classes.dex */
public final class e extends z8.c {

    /* renamed from: u, reason: collision with root package name */
    public final AbstractAdViewAdapter f4206u;

    /* renamed from: v, reason: collision with root package name */
    public final v f4207v;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, v vVar) {
        this.f4206u = abstractAdViewAdapter;
        this.f4207v = vVar;
    }

    @Override // z8.c, g9.a
    public final void L() {
        hq0 hq0Var = (hq0) this.f4207v;
        hq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        a aVar = (a) hq0Var.f6873w;
        if (((hx0) hq0Var.f6874x) == null) {
            if (aVar == null) {
                i.i(null, "#007 Could not call remote method.");
                return;
            } else if (!aVar.f4202n) {
                i.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        i.a("Adapter called onAdClicked.");
        try {
            ((as) hq0Var.f6872v).a();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // z8.c
    public final void a() {
        hq0 hq0Var = (hq0) this.f4207v;
        hq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdClosed.");
        try {
            ((as) hq0Var.f6872v).b();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // z8.c
    public final void b(l lVar) {
        ((hq0) this.f4207v).g(lVar);
    }

    @Override // z8.c
    public final void c() {
        hq0 hq0Var = (hq0) this.f4207v;
        hq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        a aVar = (a) hq0Var.f6873w;
        if (((hx0) hq0Var.f6874x) == null) {
            if (aVar == null) {
                i.i(null, "#007 Could not call remote method.");
                return;
            } else if (!aVar.f4201m) {
                i.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        i.a("Adapter called onAdImpression.");
        try {
            ((as) hq0Var.f6872v).i();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // z8.c
    public final void e() {
    }

    @Override // z8.c
    public final void k() {
        hq0 hq0Var = (hq0) this.f4207v;
        hq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdOpened.");
        try {
            ((as) hq0Var.f6872v).g();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }
}

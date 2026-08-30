package com.google.ads.mediation;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.hq0;
import fa.y;
import l9.i;
import n9.n;
import z8.l;

/* loaded from: classes.dex */
public final class b extends z8.c implements a9.d, g9.a {

    /* renamed from: u, reason: collision with root package name */
    public final n f4203u;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, n nVar) {
        this.f4203u = nVar;
    }

    @Override // z8.c, g9.a
    public final void L() {
        hq0 hq0Var = (hq0) this.f4203u;
        hq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdClicked.");
        try {
            ((as) hq0Var.f6872v).a();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // z8.c
    public final void a() {
        hq0 hq0Var = (hq0) this.f4203u;
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
        ((hq0) this.f4203u).c(lVar);
    }

    @Override // z8.c
    public final void e() {
        hq0 hq0Var = (hq0) this.f4203u;
        hq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdLoaded.");
        try {
            ((as) hq0Var.f6872v).f();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // z8.c
    public final void k() {
        hq0 hq0Var = (hq0) this.f4203u;
        hq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdOpened.");
        try {
            ((as) hq0Var.f6872v).g();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // a9.d
    public final void p(String str, String str2) {
        hq0 hq0Var = (hq0) this.f4203u;
        hq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAppEvent.");
        try {
            ((as) hq0Var.f6872v).O3(str, str2);
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }
}

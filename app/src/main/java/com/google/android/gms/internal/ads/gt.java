package com.google.android.gms.internal.ads;
import fa.y;
import j9.m;
import l9.i;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class gt implements j9.m {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zzbym f6446u;

    public gt(zzbym zzbymVar) {
        this.f6446u = zzbymVar;
    }

    @Override // j9.m
    public final void R0() {
        l9.i.a("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // j9.m
    public final void T1() {
        l9.i.a("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // j9.m
    public final void d() {
        l9.i.a("Opening AdMobCustomTabsAdapter overlay.");
        hq0 hq0Var = (hq0) this.f6446u.f13346b;
        hq0Var.getClass();
        fa.y.d("#008 Must be called on the main UI thread.");
        l9.i.a("Adapter called onAdOpened.");
        try {
            ((as) hq0Var.f6872v).g();
        } catch (RemoteException e) {
            l9.i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // j9.m
    public final void g2() {
        l9.i.a("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // j9.m
    public final void i4(int i) {
        l9.i.a("AdMobCustomTabsAdapter overlay is closed.");
        hq0 hq0Var = (hq0) this.f6446u.f13346b;
        hq0Var.getClass();
        fa.y.d("#008 Must be called on the main UI thread.");
        l9.i.a("Adapter called onAdClosed.");
        try {
            ((as) hq0Var.f6872v).b();
        } catch (RemoteException e) {
            l9.i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // j9.m
    public final void o3() {
    }

    @Override // j9.m
    public final void r0() {
        l9.i.a("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // j9.m
    public final void t1() {
        l9.i.a("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // j9.m
    public final void u2() {
        l9.i.a("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // j9.m
    public final void v2() {
        l9.i.a("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // j9.m
    public final void z1() {
        l9.i.a("AdMobCustomTabsAdapter overlay is created.");
    }
}

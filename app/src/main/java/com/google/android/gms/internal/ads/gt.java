package com.google.android.gms.internal.ads;
import fa.y;
import j9.m;
import l9.i;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class gt implements m {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zzbym f6446u;

    public gt(zzbym zzbymVar) {
        this.f6446u = zzbymVar;
    }

    @Override // m
    public final void R0() {
        i.a("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // m
    public final void T1() {
        i.a("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // m
    public final void d() {
        i.a("Opening AdMobCustomTabsAdapter overlay.");
        hq0 hq0Var = (hq0) this.f6446u.f13346b;
        hq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdOpened.");
        try {
            ((as) hq0Var.f6872v).g();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // m
    public final void g2() {
        i.a("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // m
    public final void i4(int i) {
        i.a("AdMobCustomTabsAdapter overlay is closed.");
        hq0 hq0Var = (hq0) this.f6446u.f13346b;
        hq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdClosed.");
        try {
            ((as) hq0Var.f6872v).b();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // m
    public final void o3() {
    }

    @Override // m
    public final void r0() {
        i.a("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // m
    public final void t1() {
        i.a("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // m
    public final void u2() {
        i.a("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // m
    public final void v2() {
        i.a("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // m
    public final void z1() {
        i.a("AdMobCustomTabsAdapter overlay is created.");
    }
}

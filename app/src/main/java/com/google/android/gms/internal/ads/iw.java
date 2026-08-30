package com.google.android.gms.internal.ads;
import fa.y;
import l9.i;
import n9.c;
import n9.i;
import n9.t;
import n9.x;
import z8.a;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class iw implements x {

    /* renamed from: a, reason: collision with root package name */
    public final as f7238a;

    public iw(as asVar) {
        this.f7238a = asVar;
    }

    @Override // x, i
    public final void a(a aVar) {
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdFailedToShow.");
        int i = aVar.f31969a;
        String str = aVar.f31970b;
        String str2 = aVar.f31971c;
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 60 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
        sb2.append("Mediation ad failed to show: Error Code = ");
        sb2.append(i);
        sb2.append(". Error Message = ");
        sb2.append(str);
        sb2.append(" Error Domain = ");
        sb2.append(str2);
        i.f(sb2.toString());
        try {
            this.f7238a.c3(aVar.a());
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // x, t
    public final void c() {
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onVideoComplete.");
        try {
            this.f7238a.d4();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // x
    public final void d() {
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onUserEarnedReward.");
        try {
            this.f7238a.s();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // c
    public final void e() {
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdOpened.");
        try {
            this.f7238a.g();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // x
    public final void f() {
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onVideoStart.");
        try {
            this.f7238a.D();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // c
    public final void g() {
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called reportAdImpression.");
        try {
            this.f7238a.i();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // c
    public final void h() {
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called reportAdClicked.");
        try {
            this.f7238a.a();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // c
    public final void onAdClosed() {
        y.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdClosed.");
        try {
            this.f7238a.b();
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }
}

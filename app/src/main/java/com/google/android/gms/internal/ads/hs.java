package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class hs extends g9.x1 {

    /* renamed from: u, reason: collision with root package name */
    public final Object f6878u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public volatile g9.a2 f6879v;

    @Override // g9.z1
    public final void a() {
        throw new RemoteException();
    }

    @Override // g9.z1
    public final void b() {
        throw new RemoteException();
    }

    @Override // g9.z1
    public final boolean d() {
        throw new RemoteException();
    }

    @Override // g9.z1
    public final float f() {
        throw new RemoteException();
    }

    @Override // g9.z1
    public final int g() {
        throw new RemoteException();
    }

    @Override // g9.z1
    public final float i() {
        throw new RemoteException();
    }

    @Override // g9.z1
    public final void j() {
        throw new RemoteException();
    }

    @Override // g9.z1
    public final float m() {
        throw new RemoteException();
    }

    @Override // g9.z1
    public final boolean n() {
        throw new RemoteException();
    }

    @Override // g9.z1
    public final g9.a2 p() {
        g9.a2 a2Var;
        synchronized (this.f6878u) {
            a2Var = this.f6879v;
        }
        return a2Var;
    }

    @Override // g9.z1
    public final void p0(boolean z3) {
        throw new RemoteException();
    }

    @Override // g9.z1
    public final boolean q() {
        throw new RemoteException();
    }

    @Override // g9.z1
    public final void u0(g9.a2 a2Var) {
        synchronized (this.f6878u) {
            this.f6879v = a2Var;
        }
    }
}

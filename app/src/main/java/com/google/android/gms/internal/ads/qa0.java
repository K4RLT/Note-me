package com.google.android.gms.internal.ads;
import g9.a2;
import g9.x1;
import g9.z1;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qa0 extends x1 {

    /* renamed from: u, reason: collision with root package name */
    public final Object f9793u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final z1 f9794v;

    /* renamed from: w, reason: collision with root package name */
    public final gs f9795w;

    public qa0(z1 z1Var, gs gsVar) {
        this.f9794v = z1Var;
        this.f9795w = gsVar;
    }

    @Override // z1
    public final void a() {
        throw new RemoteException();
    }

    @Override // z1
    public final void b() {
        throw new RemoteException();
    }

    @Override // z1
    public final boolean d() {
        throw new RemoteException();
    }

    @Override // z1
    public final float f() {
        gs gsVar = this.f9795w;
        if (gsVar != null) {
            return gsVar.L();
        }
        return 0.0f;
    }

    @Override // z1
    public final int g() {
        throw new RemoteException();
    }

    @Override // z1
    public final float i() {
        gs gsVar = this.f9795w;
        if (gsVar != null) {
            return gsVar.d0();
        }
        return 0.0f;
    }

    @Override // z1
    public final void j() {
        throw new RemoteException();
    }

    @Override // z1
    public final float m() {
        throw new RemoteException();
    }

    @Override // z1
    public final boolean n() {
        throw new RemoteException();
    }

    @Override // z1
    public final a2 p() {
        synchronized (this.f9793u) {
            try {
                z1 z1Var = this.f9794v;
                if (z1Var != null) {
                    return z1Var.p();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z1
    public final void p0(boolean z3) {
        throw new RemoteException();
    }

    @Override // z1
    public final boolean q() {
        throw new RemoteException();
    }

    @Override // z1
    public final void u0(a2 a2Var) {
        synchronized (this.f9793u) {
            try {
                z1 z1Var = this.f9794v;
                if (z1Var != null) {
                    z1Var.u0(a2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

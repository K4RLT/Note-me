package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class vk0 extends g9.c0 {

    /* renamed from: u, reason: collision with root package name */
    public final hq0 f11928u;

    /* JADX WARN: Type inference failed for: r6v4, types: [com.google.android.gms.internal.ads.k60, java.lang.Object] */
    public vk0(Context context, y10 y10Var, zp0 zp0Var, wa0 wa0Var, g9.x xVar) {
        zd1 zd1Var = new zd1(wa0Var, (be0) y10Var.f12728m.zzb());
        ((yk0) zd1Var.f13143w).f12894u.set(xVar);
        com.google.android.gms.internal.ads.k60 obj = new Object();
        obj.f7668c = y10Var;
        obj.f7666a = context;
        obj.f7669d = zd1Var;
        obj.f7667b = zp0Var;
        obj.e = y10Var.c();
        zp0Var.f13241r = (yk0) zd1Var.f13143w;
        this.f11928u = new hq0((Object) obj, 17, zp0Var.f13228c);
    }

    @Override // g9.d0
    public final void I3(g9.z2 z2Var) {
        this.f11928u.u(z2Var, 1);
    }

    @Override // g9.d0
    public final synchronized String b() {
        String str;
        hq0 hq0Var = this.f11928u;
        synchronized (hq0Var) {
            str = null;
            try {
                p60 p60Var = (p60) hq0Var.f6874x;
                if (p60Var != null) {
                    str = p60Var.f9412u;
                }
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            }
        }
        return str;
    }

    @Override // g9.d0
    public final synchronized String d() {
        String str;
        hq0 hq0Var = this.f11928u;
        synchronized (hq0Var) {
            str = null;
            try {
                p60 p60Var = (p60) hq0Var.f6874x;
                if (p60Var != null) {
                    str = p60Var.f9412u;
                }
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            }
        }
        return str;
    }

    @Override // g9.d0
    public final synchronized boolean e() {
        boolean z3;
        hq0 hq0Var = this.f11928u;
        synchronized (hq0Var) {
            try {
                f50 f50Var = (f50) ((k60) hq0Var.f6872v).f7670f;
                if (f50Var != null) {
                    if (f50Var.f5936c) {
                        z3 = true;
                    }
                }
                z3 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @Override // g9.d0
    public final synchronized void v3(g9.z2 z2Var, int i) {
        this.f11928u.u(z2Var, i);
    }
}

package com.google.android.gms.internal.ads;
import g9.n0;
import g9.p0;
import g9.t2;
import k9.a0;
import l9.i;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class mt0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8411u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ dt0 f8412v;

    public mt0(dt0 dt0Var) {
        this.f8411u = 0;
        Objects.requireNonNull(dt0Var);
        this.f8412v = dt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8411u;
        dt0 dt0Var = this.f8412v;
        switch (i) {
            case 0:
                dt0Var.v();
                return;
            case 1:
                g9.n0 n0Var = dt0Var.f5500h;
                if (n0Var != null) {
                    try {
                        g9.t2 t2Var = (g9.t2) dt0Var.e.get();
                        Parcel g22 = n0Var.g2();
                        qh.c(g22, t2Var);
                        n0Var.v2(g22, 2);
                    } catch (RemoteException unused) {
                        int i10 = k9.a0.f19634b;
                        l9.i.f("Failed to call onAdsExhausted");
                    }
                }
                g9.p0 p0Var = dt0Var.i;
                if (p0Var != null) {
                    try {
                        String str = dt0Var.f5503l;
                        Parcel g23 = p0Var.g2();
                        g23.writeString(str);
                        p0Var.v2(g23, 2);
                        return;
                    } catch (RemoteException unused2) {
                        int i11 = k9.a0.f19634b;
                        l9.i.f("Failed to call onAdsExhausted");
                        return;
                    }
                }
                return;
            case 2:
                if (dt0Var.f5508q != null) {
                    dt0Var.f5509r.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int s10 = dt0Var.s();
                    String g8 = dt0Var.g();
                    dt0Var.f5508q.n("pae", "paeo_ts", currentTimeMillis, s10, 0, null, dt0Var.f5510s, g8);
                    return;
                }
                return;
            case 3:
                dt0Var.e();
                return;
            case 4:
                dt0Var.e();
                return;
            default:
                dt0Var.w();
                return;
        }
    }

    public /* synthetic */ mt0(dt0 dt0Var, int i) {
        this.f8411u = i;
        this.f8412v = dt0Var;
    }
}

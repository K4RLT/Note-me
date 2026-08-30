package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class pt1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9601u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f9602v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f9603w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9604x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9605y;

    public /* synthetic */ pt1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f9601u = i;
        this.f9602v = obj;
        this.f9603w = obj2;
        this.f9604x = obj3;
        this.f9605y = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aj ajVar;
        boolean z3;
        long j10;
        switch (this.f9601u) {
            case 0:
                Pair pair = (Pair) this.f9603w;
                ((ku1) ((rt1) this.f9602v).f10290b.D).n(((Integer) pair.first).intValue(), (yx1) pair.second, (qx1) this.f9604x, (vx1) this.f9605y);
                return;
            case 1:
                Pair pair2 = (Pair) this.f9603w;
                ((ku1) ((rt1) this.f9602v).f10290b.D).o(((Integer) pair2.first).intValue(), (yx1) pair2.second, (qx1) this.f9604x, (vx1) this.f9605y);
                return;
            default:
                fj fjVar = (fj) this.f9605y;
                cj cjVar = (cj) this.f9603w;
                zd1 zd1Var = (zd1) this.f9602v;
                try {
                    ej ejVar = (ej) cjVar.t();
                    boolean A = cjVar.A();
                    dj djVar = (dj) this.f9604x;
                    if (A) {
                        Parcel g22 = ejVar.g2();
                        qh.c(g22, djVar);
                        Parcel u22 = ejVar.u2(g22, 2);
                        ajVar = (aj) qh.b(u22, aj.CREATOR);
                        u22.recycle();
                    } else {
                        Parcel g23 = ejVar.g2();
                        qh.c(g23, djVar);
                        Parcel u23 = ejVar.u2(g23, 1);
                        ajVar = (aj) qh.b(u23, aj.CREATOR);
                        u23.recycle();
                    }
                    if (!ajVar.a()) {
                        fjVar.c(new RuntimeException("No entry contents."));
                        ((mf) zd1Var.f13144x).e();
                        return;
                    }
                    gj gjVar = new gj(zd1Var, ajVar.b());
                    int read = gjVar.read();
                    if (read != -1) {
                        gjVar.unread(read);
                        synchronized (ajVar) {
                            z3 = ajVar.f4518v;
                        }
                        boolean g8 = ajVar.g();
                        synchronized (ajVar) {
                            j10 = ajVar.f4520x;
                        }
                        fjVar.b(new hj(gjVar, z3, g8, j10, ajVar.d()));
                        return;
                    }
                    throw new IOException("Unable to read from cache.");
                } catch (RemoteException e) {
                    e = e;
                    int i = k9.a0.f19634b;
                    l9.i.d("Unable to obtain a cache service instance.", e);
                    fjVar.c(e);
                    ((mf) zd1Var.f13144x).e();
                    return;
                } catch (IOException e8) {
                    e = e8;
                    int i10 = k9.a0.f19634b;
                    l9.i.d("Unable to obtain a cache service instance.", e);
                    fjVar.c(e);
                    ((mf) zd1Var.f13144x).e();
                    return;
                }
        }
    }
}

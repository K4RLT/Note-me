package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.hf0;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.um;
import e7.h;
import fa.y;
import g9.f1;
import g9.f2;
import g9.i2;
import g9.r;
import l9.b;
import l9.i;
import q.x;

/* loaded from: classes.dex */
public class MobileAds {
    /* JADX WARN: Type inference failed for: r1v16, types: [c2.b, g9.f2] */
    /* JADX WARN: Type inference failed for: r1v17, types: [c2.b, g9.f2] */
    /* JADX WARN: Type inference failed for: r1v18, types: [c2.b, g9.f2] */
    public static void a(Context context, h hVar) {
        final i2 d2 = i2.d();
        synchronized (d2.f17655d) {
            try {
                if (d2.f17656f) {
                    d2.e.add(hVar);
                    return;
                }
                if (d2.f17657g) {
                    hVar.a(d2.e());
                    return;
                }
                d2.f17656f = true;
                d2.e.add(hVar);
                if (context != null) {
                    synchronized (d2.f17658h) {
                        try {
                            d2.b(context);
                            f1 f1Var = d2.i;
                            if (f1Var != null) {
                                f1Var.t4(new hf0(1, d2));
                                d2.i.D2(new tr());
                            }
                            d2.f17659j.getClass();
                            d2.f17659j.getClass();
                        } catch (RemoteException e) {
                            i.g("MobileAdsSettingManager initialization failed", e);
                        } finally {
                        }
                        sl.a(context);
                        if (((Boolean) um.f11676a.p()).booleanValue()) {
                            if (((Boolean) r.e.f17698c.a(sl.Bc)).booleanValue()) {
                                i.a("Initializing on bg thread");
                                final int i = 1;
                                b.f20034a.execute(new Runnable() { // from class: g9.h2
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        switch (i) {
                                            case 0:
                                                i2 i2Var = d2;
                                                synchronized (i2Var.f17658h) {
                                                    i2Var.c();
                                                }
                                                return;
                                            default:
                                                i2 i2Var2 = d2;
                                                synchronized (i2Var2.f17658h) {
                                                    i2Var2.c();
                                                }
                                                return;
                                        }
                                    }
                                });
                                d2.f17652a = new c2.b(context, z8.b.INTERSTITIAL);
                                d2.f17653b = new c2.b(context, z8.b.REWARDED);
                                d2.f17654c = new c2.b(context, z8.b.APP_OPEN_AD);
                            }
                        }
                        if (((Boolean) um.f11677b.p()).booleanValue()) {
                            if (((Boolean) r.e.f17698c.a(sl.Bc)).booleanValue()) {
                                final int i10 = 0;
                                b.f20035b.execute(new Runnable() { // from class: g9.h2
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        switch (i10) {
                                            case 0:
                                                i2 i2Var = d2;
                                                synchronized (i2Var.f17658h) {
                                                    i2Var.c();
                                                }
                                                return;
                                            default:
                                                i2 i2Var2 = d2;
                                                synchronized (i2Var2.f17658h) {
                                                    i2Var2.c();
                                                }
                                                return;
                                        }
                                    }
                                });
                                d2.f17652a = new c2.b(context, z8.b.INTERSTITIAL);
                                d2.f17653b = new c2.b(context, z8.b.REWARDED);
                                d2.f17654c = new c2.b(context, z8.b.APP_OPEN_AD);
                            }
                        }
                        i.a("Initializing on calling thread");
                        d2.c();
                        d2.f17652a = new c2.b(context, z8.b.INTERSTITIAL);
                        d2.f17653b = new c2.b(context, z8.b.REWARDED);
                        d2.f17654c = new c2.b(context, z8.b.APP_OPEN_AD);
                    }
                    return;
                }
                x.n("Context cannot be null.");
            } finally {
            }
        }
    }

    private static void setPlugin(String str) {
        boolean z3;
        i2 d2 = i2.d();
        synchronized (d2.f17658h) {
            if (d2.i != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            y.j("MobileAds.initialize() must be called prior to setting the plugin.", z3);
            f1 f1Var = d2.i;
            if (f1Var == null) {
                return;
            }
            try {
                f1Var.T(str);
            } catch (RemoteException e) {
                i.d("Unable to set plugin.", e);
            }
        }
    }

    private static void stop() {
        i2 d2 = i2.d();
        synchronized (d2.f17655d) {
            d2.f17657g = false;
            d2.f17656f = false;
            d2.e.clear();
        }
        synchronized (d2.f17658h) {
            try {
                f1 f1Var = d2.i;
                if (f1Var != null) {
                    f1Var.R1();
                }
            } catch (RemoteException e) {
                i.d("Unable to stop the SDK.", e);
            }
            d2.i = null;
            f2 f2Var = d2.f17652a;
            if (f2Var != null) {
                f2Var.j();
                d2.f17652a = null;
            }
            f2 f2Var2 = d2.f17653b;
            if (f2Var2 != null) {
                f2Var2.j();
                d2.f17653b = null;
            }
            f2 f2Var3 = d2.f17654c;
            if (f2Var3 != null) {
                f2Var3.j();
                d2.f17654c = null;
            }
        }
    }
}

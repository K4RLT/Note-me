package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import r.e;

import android.os.SystemClock;
import java.util.Map;

/* loaded from: classes.dex */
public final class td0 implements lr0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11328u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Object f11329v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f11330w;

    public td0(jj jjVar, Map map) {
        this.f11329v = map;
        this.f11330w = jjVar;
    }

    @Override // com.google.android.gms.internal.ads.lr0
    public final void k(String str) {
        int i = this.f11328u;
    }

    @Override // com.google.android.gms.internal.ads.lr0
    public final void l(ir0 ir0Var, String str, Throwable th) {
        switch (this.f11328u) {
            case 0:
                Map map = (Map) this.f11329v;
                if (map.containsKey(ir0Var)) {
                    ((jj) this.f11330w).b(((sd0) map.get(ir0Var)).f10593c);
                    return;
                }
                return;
            default:
                if (((Boolean) g9.r.e.f17698c.a(sl.f10713e7)).booleanValue() && ir0.RENDERER == ir0Var) {
                    lh0 lh0Var = (lh0) this.f11329v;
                    if (lh0Var.b() != 0) {
                        f9.k.C.f16819k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime() - lh0Var.b();
                        synchronized (lh0Var) {
                            synchronized (lh0Var.f8033j) {
                                lh0Var.e = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.lr0
    public final void t(ir0 ir0Var, String str) {
        switch (this.f11328u) {
            case 0:
                Map map = (Map) this.f11329v;
                if (map.containsKey(ir0Var)) {
                    ((jj) this.f11330w).b(((sd0) map.get(ir0Var)).f10591a);
                    return;
                }
                return;
            default:
                if (((Boolean) g9.r.e.f17698c.a(sl.f10713e7)).booleanValue()) {
                    if (ir0.RENDERER == ir0Var) {
                        lh0 lh0Var = (lh0) this.f11329v;
                        f9.k.C.f16819k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        synchronized (lh0Var) {
                            synchronized (lh0Var.i) {
                                lh0Var.f8029d = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    if (ir0.PRELOADED_LOADER == ir0Var || ir0.SERVER_TRANSACTION == ir0Var) {
                        lh0 lh0Var2 = (lh0) this.f11329v;
                        f9.k.C.f16819k.getClass();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        synchronized (lh0Var2) {
                            synchronized (lh0Var2.f8030f) {
                                lh0Var2.f8026a = elapsedRealtime2;
                            }
                        }
                        mh0 mh0Var = (mh0) this.f11330w;
                        ((com.google.android.gms.internal.measurement.e4) mh0Var.f3469c).i(new f3(mh0Var, lh0Var2.a(), 4));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.lr0
    public final void z(ir0 ir0Var, String str) {
        switch (this.f11328u) {
            case 0:
                Map map = (Map) this.f11329v;
                if (map.containsKey(ir0Var)) {
                    ((jj) this.f11330w).b(((sd0) map.get(ir0Var)).f10592b);
                    return;
                }
                return;
            default:
                if (((Boolean) g9.r.e.f17698c.a(sl.f10713e7)).booleanValue() && ir0.RENDERER == ir0Var) {
                    lh0 lh0Var = (lh0) this.f11329v;
                    if (lh0Var.b() != 0) {
                        f9.k.C.f16819k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime() - lh0Var.b();
                        synchronized (lh0Var) {
                            synchronized (lh0Var.f8033j) {
                                lh0Var.e = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public td0(lh0 lh0Var, mh0 mh0Var) {
        this.f11329v = lh0Var;
        this.f11330w = mh0Var;
    }

    private final void a(String str) {
    }

    private final void b(String str) {
    }
}

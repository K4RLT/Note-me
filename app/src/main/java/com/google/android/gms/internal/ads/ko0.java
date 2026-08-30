package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ko0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7821a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f7822b;

    /* renamed from: c, reason: collision with root package name */
    public final y10 f7823c;

    /* renamed from: d, reason: collision with root package name */
    public final jo0 f7824d;
    public final zo0 e;

    /* renamed from: f, reason: collision with root package name */
    public final l9.a f7825f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f7826g;

    /* renamed from: h, reason: collision with root package name */
    public final vr0 f7827h;
    public final zp0 i;

    /* renamed from: j, reason: collision with root package name */
    public ac.b f7828j;

    public ko0(Context context, Executor executor, y10 y10Var, zo0 zo0Var, jo0 jo0Var, zp0 zp0Var, l9.a aVar) {
        this.f7821a = context;
        this.f7822b = executor;
        this.f7823c = y10Var;
        this.e = zo0Var;
        this.f7824d = jo0Var;
        this.i = zp0Var;
        this.f7825f = aVar;
        this.f7826g = new FrameLayout(context);
        this.f7827h = y10Var.c();
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [com.google.android.gms.internal.ads.go0, java.lang.Object] */
    public final synchronized boolean a(g9.z2 z2Var, String str, an1 an1Var, el0 el0Var) {
        Throwable th;
        boolean z3;
        ur0 ur0Var;
        b20 b20Var;
        try {
            try {
                if (!z2Var.b()) {
                    if (((Boolean) um.f11679d.p()).booleanValue()) {
                        try {
                            if (((Boolean) g9.r.e.f17698c.a(sl.Cc)).booleanValue()) {
                                z3 = true;
                                if (this.f7825f.f20031w >= ((Integer) g9.r.e.f17698c.a(sl.Dc)).intValue() || !z3) {
                                    fa.y.d("loadAd must be called on the main UI thread.");
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    z3 = false;
                    if (this.f7825f.f20031w >= ((Integer) g9.r.e.f17698c.a(sl.Dc)).intValue()) {
                    }
                    fa.y.d("loadAd must be called on the main UI thread.");
                }
                if (str == null) {
                    int i = k9.a0.f19634b;
                    l9.i.c("Ad unit ID should not be null for app open ad.");
                    this.f7822b.execute(new e40(21, this));
                    return false;
                }
                if (this.f7828j != null) {
                    return false;
                }
                nl nlVar = sl.f10709e3;
                g9.r rVar = g9.r.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    g9.p.a();
                }
                if (((Boolean) rm.f10240c.p()).booleanValue() && (b20Var = (b20) this.e.k()) != null) {
                    ur0 ur0Var2 = (ur0) b20Var.f4678f.zzb();
                    ur0Var2.i(7);
                    ur0Var2.c(z2Var.J);
                    ur0Var2.d(z2Var.G);
                    ur0Var = ur0Var2;
                } else {
                    ur0Var = null;
                }
                Context context = this.f7821a;
                boolean z9 = z2Var.f17726z;
                ay0.p(context, z9);
                if (((Boolean) rVar.f17698c.a(sl.f10811ka)).booleanValue() && z9) {
                    ((nf0) this.f7823c.D.zzb()).b(true);
                }
                Pair pair = new Pair("api-call", Long.valueOf(z2Var.T));
                f9.k.C.f16819k.getClass();
                Bundle e = b80.e(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
                zp0 zp0Var = this.i;
                zp0Var.f13228c = str;
                zp0Var.f13227b = g9.c3.b();
                zp0Var.f13226a = z2Var;
                zp0Var.f13243t = e;
                aq0 a10 = zp0Var.a();
                rr0 g8 = rr0.g(context, ed1.P(a10), 7, z2Var);
                Object obj = new Object();
                obj.f6439a = a10;
                ac.b o10 = this.e.o(new x90(8, obj, null, false), new lx0(29, this));
                this.f7828j = o10;
                o10.a(new t81(o10, 0, new p8(this, el0Var, ur0Var, g8, obj, 6, false)), this.f7822b);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.yd1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.yd1, java.lang.Object] */
    public final synchronized a20 b(xo0 xo0Var) {
        go0 go0Var = (go0) xo0Var;
        if (((Boolean) g9.r.e.f17698c.a(sl.f10908q9)).booleanValue()) {
            com.google.android.gms.internal.ads.yd1 obj = new Object();
            obj.f12855u = this.f7821a;
            obj.f12856v = go0Var.f6439a;
            k60 k60Var = new k60((yd1) obj);
            o80 o80Var = new o80();
            jo0 jo0Var = this.f7824d;
            Executor executor = this.f7822b;
            ((HashSet) o80Var.f9029l).add(new c90(jo0Var, executor));
            o80Var.e(jo0Var, executor);
            p80 p80Var = new p80(o80Var);
            a20 a20Var = new a20(this.f7823c.f12709b, 0);
            a20Var.f4323f = k60Var;
            a20Var.e = p80Var;
            return a20Var;
        }
        jo0 jo0Var2 = this.f7824d;
        jo0 jo0Var3 = new jo0(jo0Var2.f7493u);
        jo0Var3.C = jo0Var2;
        o80 o80Var2 = new o80();
        Executor executor2 = this.f7822b;
        o80Var2.c(jo0Var3, executor2);
        ((HashSet) o80Var2.f9025g).add(new c90(jo0Var3, executor2));
        ((HashSet) o80Var2.f9031n).add(new c90(jo0Var3, executor2));
        ((HashSet) o80Var2.f9030m).add(new c90(jo0Var3, executor2));
        ((HashSet) o80Var2.f9029l).add(new c90(jo0Var3, executor2));
        o80Var2.e(jo0Var3, executor2);
        o80Var2.f9032o = jo0Var3;
        Object obj2 = new Object();
        obj2.f12855u = this.f7821a;
        obj2.f12856v = go0Var.f6439a;
        k60 k60Var2 = new k60((yd1) obj2);
        p80 p80Var2 = new p80(o80Var2);
        a20 a20Var2 = new a20(this.f7823c.f12709b, 0);
        a20Var2.f4323f = k60Var2;
        a20Var2.e = p80Var2;
        return a20Var2;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class kp0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7834a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f7835b;

    /* renamed from: c, reason: collision with root package name */
    public final y10 f7836c;

    /* renamed from: d, reason: collision with root package name */
    public final hp0 f7837d;
    public final zo0 e;

    /* renamed from: f, reason: collision with root package name */
    public final xp0 f7838f;

    /* renamed from: g, reason: collision with root package name */
    public final vr0 f7839g;

    /* renamed from: h, reason: collision with root package name */
    public final zp0 f7840h;
    public ac.b i;

    public kp0(Context context, Executor executor, y10 y10Var, zo0 zo0Var, hp0 hp0Var, zp0 zp0Var, xp0 xp0Var) {
        this.f7834a = context;
        this.f7835b = executor;
        this.f7836c = y10Var;
        this.e = zo0Var;
        this.f7837d = hp0Var;
        this.f7840h = zp0Var;
        this.f7838f = xp0Var;
        this.f7839g = y10Var.c();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, com.google.android.gms.internal.ads.jp0] */
    public final boolean a(g9.z2 z2Var, String str, an1 an1Var, el0 el0Var) {
        ur0 ur0Var;
        Executor executor = this.f7835b;
        if (str == null) {
            int i = k9.a0.f19634b;
            l9.i.c("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new e40(26, this));
            return false;
        }
        ac.b bVar = this.i;
        if (bVar != null && !bVar.isDone()) {
            return false;
        }
        nl nlVar = sl.f10709e3;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            g9.p.a();
        }
        boolean booleanValue = ((Boolean) rm.f10240c.p()).booleanValue();
        zo0 zo0Var = this.e;
        if (booleanValue && zo0Var.k() != null) {
            ur0Var = (ur0) ((k20) zo0Var.k()).f7615g.zzb();
            ur0Var.i(5);
            ur0Var.c(z2Var.J);
            ur0Var.d(z2Var.G);
        } else {
            ur0Var = null;
        }
        boolean z3 = z2Var.f17726z;
        Context context = this.f7834a;
        ay0.p(context, z3);
        if (((Boolean) rVar.f17698c.a(sl.f10811ka)).booleanValue() && z3) {
            ((nf0) this.f7836c.D.zzb()).b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(z2Var.T));
        f9.k.C.f16819k.getClass();
        Bundle e = b80.e(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        zp0 zp0Var = this.f7840h;
        zp0Var.f13228c = str;
        zp0Var.f13227b = new g9.c3("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
        zp0Var.f13226a = z2Var;
        zp0Var.f13243t = e;
        aq0 a10 = zp0Var.a();
        rr0 g8 = rr0.g(context, ed1.P(a10), 5, z2Var);
        ?? obj = new Object();
        obj.f7506a = a10;
        ac.b o10 = zo0Var.o(new x90(8, obj, null, false), new bl0(2, this));
        this.i = o10;
        o10.a(new t81(o10, 0, new p8(this, el0Var, ur0Var, g8, obj, 8, false)), executor);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.yd1, java.lang.Object] */
    public final a20 b(xo0 xo0Var) {
        a20 a20Var = new a20(this.f7836c.f12709b, 1);
        ?? obj = new Object();
        obj.f12855u = this.f7834a;
        obj.f12856v = ((jp0) xo0Var).f7506a;
        obj.f12858x = this.f7838f;
        a20Var.f4323f = new k60((yd1) obj);
        a20Var.e = new p80(new o80());
        return a20Var;
    }
}

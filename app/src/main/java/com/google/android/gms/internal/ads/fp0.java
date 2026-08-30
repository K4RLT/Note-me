package com.google.android.gms.internal.ads;
import f9.k;
import g9.c3;
import g9.p;
import g9.r;
import g9.z2;
import k9.a0;
import l9.i;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fp0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6144a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f6145b;

    /* renamed from: c, reason: collision with root package name */
    public final y10 f6146c;

    /* renamed from: d, reason: collision with root package name */
    public final yk0 f6147d;
    public final hp0 e;

    /* renamed from: f, reason: collision with root package name */
    public yl f6148f;

    /* renamed from: g, reason: collision with root package name */
    public final vr0 f6149g;

    /* renamed from: h, reason: collision with root package name */
    public final zp0 f6150h;
    public hr0 i;

    public fp0(Context context, Executor executor, y10 y10Var, yk0 yk0Var, hp0 hp0Var, zp0 zp0Var) {
        this.f6144a = context;
        this.f6145b = executor;
        this.f6146c = y10Var;
        this.f6147d = yk0Var;
        this.f6150h = zp0Var;
        this.e = hp0Var;
        this.f6149g = y10Var.c();
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [com.google.android.gms.internal.ads.yd1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.google.android.gms.internal.ads.yd1, java.lang.Object] */
    public final boolean a(z2 z2Var, String str, an1 an1Var, el0 el0Var) {
        boolean z3;
        h20 h20Var;
        ur0 ur0Var;
        Executor executor = this.f6145b;
        if (str == null) {
            int i = a0.f19634b;
            i.c("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new e40(24, this));
            return false;
        }
        if (b()) {
            return false;
        }
        nl nlVar = sl.f10709e3;
        r rVar = r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
            p.a();
        }
        boolean booleanValue = ((Boolean) qlVar2.a(sl.f10811ka)).booleanValue();
        y10 y10Var = this.f6146c;
        if (booleanValue && z2Var.f17726z) {
            ((nf0) y10Var.D.zzb()).b(true);
        }
        c3 c3Var = ((cp0) an1Var).O;
        Pair pair = new Pair("api-call", Long.valueOf(z2Var.T));
        k.C.f16819k.getClass();
        Bundle e = b80.e(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        zp0 zp0Var = this.f6150h;
        zp0Var.f13228c = str;
        zp0Var.f13227b = c3Var;
        zp0Var.f13226a = z2Var;
        zp0Var.f13243t = e;
        aq0 a10 = zp0Var.a();
        int P = ed1.P(a10);
        Context context = this.f6144a;
        rr0 g8 = rr0.g(context, P, 4, z2Var);
        boolean booleanValue2 = ((Boolean) qlVar2.a(sl.f10924r9)).booleanValue();
        yk0 yk0Var = this.f6147d;
        if (booleanValue2) {
            y10 y10Var2 = y10Var.f12709b;
            Object obj = new Object();
            obj.f12855u = context;
            obj.f12856v = a10;
            k60 k60Var = new k60((yd1) obj);
            o80 o80Var = new o80();
            o80Var.f(yk0Var, executor);
            o80Var.d(yk0Var, executor);
            z3 = true;
            h20Var = new h20(y10Var2, new v80(16), new p80(o80Var), k60Var, new tf(28, false), new jk0(0, this.f6148f), null, null);
        } else {
            o80 o80Var2 = new o80();
            HashSet hashSet = (HashSet) o80Var2.f9026h;
            HashSet hashSet2 = (HashSet) o80Var2.e;
            z3 = true;
            hp0 hp0Var = this.e;
            if (hp0Var != null) {
                hashSet2.add(new c90(hp0Var, executor));
                hashSet.add(new c90(hp0Var, executor));
                o80Var2.c(hp0Var, executor);
            }
            y10 y10Var3 = y10Var.f12709b;
            Object obj2 = new Object();
            obj2.f12855u = context;
            obj2.f12856v = a10;
            k60 k60Var2 = new k60((yd1) obj2);
            o80Var2.f(yk0Var, executor);
            hashSet2.add(new c90(yk0Var, executor));
            hashSet.add(new c90(yk0Var, executor));
            o80Var2.c(yk0Var, executor);
            ((HashSet) o80Var2.f9022c).add(new c90(yk0Var, executor));
            o80Var2.e(yk0Var, executor);
            o80Var2.d(yk0Var, executor);
            ((HashSet) o80Var2.f9030m).add(new c90(yk0Var, executor));
            ((HashSet) o80Var2.f9029l).add(new c90(yk0Var, executor));
            h20Var = new h20(y10Var3, new v80(16), new p80(o80Var2), k60Var2, new tf(28, false), new jk0(0, this.f6148f), null, null);
        }
        if (((Boolean) rm.f10240c.p()).booleanValue()) {
            ur0Var = (ur0) h20Var.i.zzb();
            ur0Var.i(4);
            ur0Var.c(z2Var.J);
            ur0Var.d(z2Var.G);
        } else {
            ur0Var = null;
        }
        i50 i50Var = (i50) h20Var.f6558o.zzb();
        hr0 c10 = i50Var.c(i50Var.b());
        this.i = c10;
        c10.a(new t81(c10, 0, new p8(this, el0Var, ur0Var, g8, h20Var, 7, false)), executor);
        return z3;
    }

    public final boolean b() {
        hr0 hr0Var = this.i;
        if (hr0Var != null && !hr0Var.f6877w.isDone()) {
            return true;
        }
        return false;
    }
}
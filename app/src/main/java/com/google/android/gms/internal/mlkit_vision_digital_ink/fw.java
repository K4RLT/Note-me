package com.google.android.gms.internal.mlkit_vision_digital_ink;
import b2.f1;
import g5.q;
import g9.n;
import i0.m;
import j6.c;
import j6.e;
import j6.l;
import pa.f;
import ra.e;

import android.content.Context;
import com.google.android.gms.internal.ads.i60;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fw {

    /* renamed from: a, reason: collision with root package name */
    public final ew f14327a;

    /* renamed from: b, reason: collision with root package name */
    public final lw f14328b;

    /* renamed from: c, reason: collision with root package name */
    public final tq f14329c;

    /* renamed from: d, reason: collision with root package name */
    public final tq f14330d;
    public final tq e;

    /* renamed from: f, reason: collision with root package name */
    public final tq f14331f;

    /* renamed from: g, reason: collision with root package name */
    public final tq f14332g;

    /* renamed from: h, reason: collision with root package name */
    public final tq f14333h;
    public final tq i;

    /* renamed from: j, reason: collision with root package name */
    public final tq f14334j;

    /* renamed from: k, reason: collision with root package name */
    public final tq f14335k;

    /* renamed from: l, reason: collision with root package name */
    public final tq f14336l;

    /* renamed from: m, reason: collision with root package name */
    public final tq f14337m;

    /* renamed from: n, reason: collision with root package name */
    public final tq f14338n;

    /* renamed from: o, reason: collision with root package name */
    public final tq f14339o;

    /* renamed from: p, reason: collision with root package name */
    public final tq f14340p;

    /* renamed from: q, reason: collision with root package name */
    public final tq f14341q;

    /* renamed from: r, reason: collision with root package name */
    public final tq f14342r;

    /* renamed from: s, reason: collision with root package name */
    public final tq f14343s;

    public fw(ew ewVar, gw gwVar, iw iwVar, lw lwVar, pw pwVar) {
        this.f14327a = ewVar;
        this.f14328b = lwVar;
        tq a10 = tq.a(new mw(lwVar, 1));
        this.f14329c = a10;
        tq a11 = tq.a(new ow(0));
        this.f14330d = a11;
        s5 s5Var = new s5(17, ewVar);
        tq a12 = tq.a(new mw(lwVar, 3));
        this.e = a12;
        tq a13 = tq.a(new mw(lwVar, 2));
        this.f14331f = a13;
        b1 b1Var = new b1(s5Var, a11, a12, a13, 3);
        tq a14 = tq.a(new e(s5Var, a12));
        tq a15 = tq.a(new mw(lwVar, 6));
        this.f14332g = a15;
        kv kvVar = new kv(a13, 0);
        tq a16 = tq.a(new rw(pwVar, s5Var, a14, a15, a10, kvVar, a12, 1));
        tq a17 = tq.a(new jw(iwVar, 1));
        this.f14333h = a17;
        tq a18 = tq.a(new yv(s5Var, a11, a16, a17, a13, 3));
        tq a19 = tq.a(new c(12, (Object) s5Var, (Object) a12, false));
        this.i = tq.a(new s5(19, new com.google.android.gms.internal.ads.hb(s5Var, a10, b1Var, a18, tq.a(new yv(s5Var, a11, tq.a(new rw(pwVar, s5Var, a19, a15, a10, kvVar, a12, 0)), a17, a13, 1)), a14, a19, kvVar, a15, a17, a13)));
        this.f14334j = tq.a(new hw(gwVar, 1));
        this.f14335k = tq.a(new mw(lwVar, 4));
        this.f14336l = tq.a(new mw(lwVar, 0));
        tq a20 = tq.a(new e(23, pwVar, s5Var, a12));
        tq a21 = tq.a(new kv(tq.a(pa.f14792x), 1));
        this.f14337m = a21;
        this.f14338n = tq.a(new e(22, a20, a21, a17));
        this.f14339o = tq.a(new hw(gwVar, 0));
        yv yvVar = new yv(s5Var, a21, a11, a12, a17, 0);
        tq a22 = tq.a(new m(13, s5Var, a12, false));
        tq a23 = tq.a(new yv(s5Var, a21, a11, tq.a(new qw(pwVar, s5Var, a22, a15, a10, kvVar, a12, 1)), a17, 2));
        tq a24 = tq.a(new pw(s5Var, 13, a12));
        this.f14340p = tq.a(new s5(18, new f1(a10, yvVar, a23, tq.a(new n(s5Var, a21, a11, tq.a(new qw(pwVar, s5Var, a24, a15, a10, kvVar, a12, 0)), a17, a13, 4)), a22, a24, kvVar, a15, a17, a13)));
        this.f14341q = tq.a(new iw(lwVar, 13, s5Var));
        this.f14342r = tq.a(new mw(lwVar, 5));
        this.f14343s = tq.a(new jw(iwVar, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.hb] */
    public final com.google.android.gms.internal.ads.hb a() {
        Context context = this.f14327a.f14283a;
        f(context);
        qu quVar = (qu) this.f14340p.c();
        i60 b10 = b();
        Executor executor = (Executor) this.f14333h.c();
        q2 q2Var = (q2) this.e.c();
        i iVar = (i) this.f14332g.c();
        q2 q2Var2 = (q2) this.f14342r.c();
        zw c10 = c();
        ss ssVar = (ss) this.f14331f.c();
        Executor executor2 = (Executor) this.f14343s.c();
        Object obj = new Object();
        obj.E = new s5(22);
        obj.f6649u = context;
        obj.f6650v = quVar;
        obj.f6651w = b10;
        obj.f6653y = executor;
        obj.f6654z = executor2;
        obj.A = q2Var;
        obj.f6652x = iVar;
        obj.B = q2Var2;
        obj.C = c10;
        obj.D = ssVar;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.lw, java.lang.Object] */
    public final i60 b() {
        ew ewVar = this.f14327a;
        Context context = ewVar.f14283a;
        f(context);
        kw kwVar = (kw) this.f14330d.c();
        wv wvVar = (wv) this.i.c();
        tq tqVar = this.f14332g;
        i iVar = (i) tqVar.c();
        Context context2 = ewVar.f14283a;
        f(context2);
        z2 z2Var = (z2) this.f14334j.c();
        i iVar2 = (i) tqVar.c();
        kx kxVar = (kx) this.f14335k.c();
        tq tqVar2 = this.f14336l;
        q2 q2Var = (q2) tqVar2.c();
        ex exVar = (ex) this.f14338n.c();
        tq tqVar3 = this.f14333h;
        Executor executor = (Executor) tqVar3.c();
        tq tqVar4 = this.f14331f;
        ss ssVar = (ss) tqVar4.c();
        Object obj = new Object();
        obj.C = new HashMap();
        obj.f14646x = context2;
        obj.f14647y = z2Var;
        obj.f14643u = iVar2;
        obj.f14644v = kxVar;
        obj.f14645w = q2Var;
        obj.f14648z = exVar;
        obj.A = executor;
        obj.B = ssVar;
        new s5(22);
        new HashMap();
        q2 q2Var2 = (q2) this.f14339o.c();
        q2 q2Var3 = (q2) tqVar2.c();
        dx dxVar = (dx) this.f14329c.c();
        ss ssVar2 = (ss) tqVar4.c();
        return new i60(context, kwVar, wvVar, iVar, (lw) obj, q2Var2, q2Var3, dxVar, ssVar2, (q2) this.e.c(), (Executor) tqVar3.c(), new jm(11));
    }

    public final zw c() {
        q2 q2Var = (q2) this.f14328b.f14648z;
        Executor executor = (Executor) this.f14333h.c();
        ss ssVar = (ss) this.f14331f.c();
        if (q2Var.c()) {
            if (q2Var.a() == null) {
                return new l(ssVar, 13, executor);
            }
            q.b();
            return null;
        }
        return new ow(1);
    }
}
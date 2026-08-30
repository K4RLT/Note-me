package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.accounts.AccountManager;
import android.content.Context;
import com.google.android.gms.internal.ads.i60;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class us {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f15068a;

    /* renamed from: b, reason: collision with root package name */
    public Context f15069b;

    /* renamed from: c, reason: collision with root package name */
    public ab f15070c;

    /* renamed from: d, reason: collision with root package name */
    public j2 f15071d;
    public i e;

    /* renamed from: f, reason: collision with root package name */
    public kx f15072f;

    /* renamed from: g, reason: collision with root package name */
    public final j2 f15073g;

    /* renamed from: h, reason: collision with root package name */
    public z2 f15074h;
    public u0 i;

    /* renamed from: j, reason: collision with root package name */
    public final j2 f15075j;

    /* renamed from: k, reason: collision with root package name */
    public q2 f15076k;

    /* renamed from: l, reason: collision with root package name */
    public final j2 f15077l;

    /* renamed from: m, reason: collision with root package name */
    public final j2 f15078m;

    public us() {
        new ArrayList();
        j2 j2Var = j2.f14494u;
        this.f15071d = j2Var;
        this.f15073g = j2Var;
        this.f15075j = j2Var;
        this.f15076k = j2Var;
        this.f15077l = j2Var;
        this.f15078m = j2Var;
        this.f15068a = new u0(3);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.lw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.ss, java.lang.Object] */
    public final dt a() {
        this.f15069b.getClass();
        this.f15071d.getClass();
        this.e.getClass();
        this.i.getClass();
        this.f15072f.getClass();
        this.f15074h.getClass();
        eb ebVar = new eb(this.f15070c);
        ew ewVar = new ew(this.f15069b, 0);
        u0 u0Var = this.f15068a;
        u0Var.f15036v = ewVar;
        u0Var.f15038x = new iw(ebVar, 0, this.f15070c);
        u0Var.f15037w = new gw(this.f15075j, this.f15074h);
        ?? obj = new Object();
        Object obj2 = new Object();
        Context context = this.f15069b;
        jm jmVar = new jm(27);
        context.getPackageName();
        AccountManager.get(context);
        s2 s2Var = new s2(jmVar);
        i iVar = this.e;
        kx kxVar = this.f15072f;
        q2 q2Var = this.f15076k;
        ?? obj3 = new Object();
        obj3.f14643u = iVar;
        obj3.f14644v = kxVar;
        obj3.C = obj2;
        obj3.f14645w = this.f15073g;
        obj3.f14646x = q2Var;
        obj3.f14647y = this.f15078m;
        obj3.A = s2Var;
        obj3.B = obj;
        obj3.f14648z = this.f15077l;
        u0Var.f15039y = obj3;
        u0Var.f15040z = new pw(this.f15070c, 0, this.i);
        pa.m((ew) u0Var.f15036v, ew.class);
        pa.m((gw) u0Var.f15037w, gw.class);
        pa.m((iw) u0Var.f15038x, iw.class);
        pa.m((lw) u0Var.f15039y, lw.class);
        pa.m((pw) u0Var.f15040z, pw.class);
        ew ewVar2 = (ew) u0Var.f15036v;
        fw fwVar = new fw(ewVar2, (gw) u0Var.f15037w, (iw) u0Var.f15038x, (lw) u0Var.f15039y, (pw) u0Var.f15040z);
        this.f15069b.getApplicationContext();
        new eb(ebVar);
        gn.b(this.f15074h);
        new s5(22);
        new HashMap();
        new s5(22);
        new HashMap();
        Context context2 = this.f15069b;
        tq tqVar = fwVar.f14329c;
        Context context3 = ewVar2.f14283a;
        pa.f(context3);
        dx dxVar = (dx) tqVar.c();
        i60 b10 = fwVar.b();
        tq tqVar2 = fwVar.i;
        wv wvVar = (wv) tqVar2.c();
        com.google.android.gms.internal.ads.hb a10 = fwVar.a();
        tq tqVar3 = fwVar.f14340p;
        qu quVar = (qu) tqVar3.c();
        pa.f(ewVar2.f14283a);
        fwVar.b();
        tq tqVar4 = fwVar.f14337m;
        tq tqVar5 = fwVar.f14332g;
        tq tqVar6 = fwVar.e;
        tq tqVar7 = fwVar.f14330d;
        tq tqVar8 = fwVar.f14333h;
        tq tqVar9 = fwVar.f14331f;
        fwVar.b();
        fwVar.a();
        tq tqVar10 = fwVar.f14338n;
        q2 q2Var2 = (q2) tqVar6.c();
        Executor executor = (Executor) tqVar8.c();
        ss ssVar = (ss) tqVar9.c();
        fwVar.c();
        b6.u uVar = new b6.u(context3, dxVar, b10, wvVar, a10, quVar, q2Var2, executor, ssVar);
        i iVar2 = this.e;
        return new dt(context2, uVar, ebVar, iVar2, obj);
    }
}

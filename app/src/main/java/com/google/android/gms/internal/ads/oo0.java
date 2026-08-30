package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class oo0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9172a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f9173b;

    /* renamed from: c, reason: collision with root package name */
    public final y10 f9174c;

    /* renamed from: d, reason: collision with root package name */
    public final yk0 f9175d;
    public final al0 e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f9176f;

    /* renamed from: g, reason: collision with root package name */
    public yl f9177g;

    /* renamed from: h, reason: collision with root package name */
    public final x70 f9178h;
    public final vr0 i;

    /* renamed from: j, reason: collision with root package name */
    public final i80 f9179j;

    /* renamed from: k, reason: collision with root package name */
    public final zp0 f9180k;

    /* renamed from: l, reason: collision with root package name */
    public hr0 f9181l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9182m;

    /* renamed from: n, reason: collision with root package name */
    public g9.y1 f9183n;

    /* renamed from: o, reason: collision with root package name */
    public el0 f9184o;

    public oo0(Context context, Executor executor, g9.c3 c3Var, y10 y10Var, yk0 yk0Var, al0 al0Var, zp0 zp0Var, i80 i80Var) {
        this.f9172a = context;
        this.f9173b = executor;
        this.f9174c = y10Var;
        this.f9175d = yk0Var;
        this.e = al0Var;
        this.f9180k = zp0Var;
        this.f9178h = new x70((ScheduledExecutorService) y10Var.f12713d.zzb(), (la.a) y10Var.f12716f.zzb(), (be0) y10Var.f12728m.zzb());
        this.i = y10Var.c();
        this.f9176f = new FrameLayout(context);
        this.f9179j = i80Var;
        zp0Var.f13227b = c3Var;
        this.f9182m = true;
        this.f9183n = null;
        this.f9184o = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.gms.internal.ads.yd1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.google.android.gms.internal.ads.yd1, java.lang.Object] */
    public final boolean a(g9.z2 z2Var, String str, an1 an1Var, el0 el0Var) {
        d20 d20Var;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Executor executor = this.f9173b;
        if (str == null) {
            int i10 = k9.a0.f19634b;
            l9.i.c("Ad unit ID should not be null for banner ad.");
            executor.execute(new e40(22, this));
            return false;
        }
        boolean b10 = b();
        zp0 zp0Var = this.f9180k;
        if (b10) {
            if (!zp0Var.f13239p) {
                this.f9182m = true;
                return false;
            }
        } else {
            nl nlVar = sl.f10709e3;
            g9.r rVar = g9.r.e;
            ql qlVar = rVar.f17698c;
            ql qlVar2 = rVar.f17698c;
            if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
                g9.p.a();
            }
            boolean booleanValue = ((Boolean) qlVar2.a(sl.f10811ka)).booleanValue();
            y10 y10Var = this.f9174c;
            if (booleanValue && z2Var.f17726z) {
                ((nf0) y10Var.D.zzb()).b(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(z2Var.T));
            f9.k.C.f16819k.getClass();
            Bundle e = b80.e(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            zp0Var.f13228c = str;
            zp0Var.f13226a = z2Var;
            zp0Var.f13243t = e;
            aq0 a10 = zp0Var.a();
            int P = ed1.P(a10);
            Context context = this.f9172a;
            rr0 g8 = rr0.g(context, P, 3, z2Var);
            boolean booleanValue2 = ((Boolean) cn.f5130f.p()).booleanValue();
            yk0 yk0Var = this.f9175d;
            ur0 ur0Var = null;
            if (booleanValue2 && zp0Var.f13227b.E) {
                if (yk0Var != null) {
                    yk0Var.x(x21.J(7, null, null));
                }
            } else {
                boolean booleanValue3 = ((Boolean) qlVar2.a(sl.f10891p9)).booleanValue();
                int i11 = 5;
                FrameLayout frameLayout = this.f9176f;
                i80 i80Var = this.f9179j;
                x70 x70Var = this.f9178h;
                if (booleanValue3) {
                    y10 y10Var2 = y10Var.f12709b;
                    ?? obj = new Object();
                    obj.f12855u = context;
                    obj.f12856v = a10;
                    k60 k60Var = new k60((yd1) obj);
                    o80 o80Var = new o80();
                    o80Var.f(yk0Var, executor);
                    o80Var.d(yk0Var, executor);
                    p80 p80Var = new p80(o80Var);
                    jk0 jk0Var = new jk0(i, this.f9177g);
                    x90 x90Var = new x90((Object) wa0.f12197h, (int) (objArr6 == true ? 1 : 0), (Object) ur0Var);
                    j6.l lVar = new j6.l(x70Var, i11, i80Var);
                    int i12 = 16;
                    d20Var = new d20(y10Var2, new lx0(i12, frameLayout), x90Var, new v80(i12), p80Var, k60Var, new tf(28, (boolean) (objArr5 == true ? 1 : 0)), jk0Var, lVar, null, null);
                } else {
                    y10 y10Var3 = y10Var.f12709b;
                    ?? obj2 = new Object();
                    obj2.f12855u = context;
                    obj2.f12856v = a10;
                    k60 k60Var2 = new k60((yd1) obj2);
                    o80 o80Var2 = new o80();
                    HashSet hashSet = (HashSet) o80Var2.f9022c;
                    o80Var2.f(yk0Var, executor);
                    hashSet.add(new c90(yk0Var, executor));
                    hashSet.add(new c90(this.e, executor));
                    o80Var2.e(yk0Var, executor);
                    ((HashSet) o80Var2.f9024f).add(new c90(yk0Var, executor));
                    ((HashSet) o80Var2.e).add(new c90(yk0Var, executor));
                    ((HashSet) o80Var2.f9026h).add(new c90(yk0Var, executor));
                    o80Var2.c(yk0Var, executor);
                    o80Var2.d(yk0Var, executor);
                    ((HashSet) o80Var2.f9030m).add(new c90(yk0Var, executor));
                    p80 p80Var2 = new p80(o80Var2);
                    jk0 jk0Var2 = new jk0((int) (objArr3 == true ? 1 : 0), (Object) this.f9177g);
                    x90 x90Var2 = new x90((Object) wa0.f12197h, (int) (objArr2 == true ? 1 : 0), (Object) ur0Var);
                    j6.l lVar2 = new j6.l(x70Var, 5, i80Var);
                    int i13 = 16;
                    d20Var = new d20(y10Var3, new lx0(i13, frameLayout), x90Var2, new v80(i13), p80Var2, k60Var2, new tf(28, (boolean) (objArr == true ? 1 : 0)), jk0Var2, lVar2, null, null);
                }
                if (((Boolean) rm.f10240c.p()).booleanValue()) {
                    ur0Var = (ur0) d20Var.f5275l.zzb();
                    ur0Var.i(3);
                    ur0Var.c(z2Var.J);
                    ur0Var.d(z2Var.G);
                }
                this.f9184o = el0Var;
                i50 i50Var = (i50) d20Var.f5283t.zzb();
                hr0 c10 = i50Var.c(i50Var.b());
                this.f9181l = c10;
                c10.a(new t81((Object) c10, (int) (objArr4 == true ? 1 : 0), (Object) new tw(this, ur0Var, g8, d20Var, 20, false)), executor);
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        hr0 hr0Var = this.f9181l;
        if (hr0Var != null && !hr0Var.f6877w.isDone()) {
            return true;
        }
        return false;
    }

    public final void c() {
        synchronized (this) {
            try {
                hr0 hr0Var = this.f9181l;
                if (hr0Var != null && hr0Var.f6877w.isDone()) {
                    try {
                        f40 f40Var = (f40) this.f9181l.f6877w.get();
                        this.f9181l = null;
                        FrameLayout frameLayout = this.f9176f;
                        frameLayout.removeAllViews();
                        f40Var.getClass();
                        ViewParent parent = f40Var.f5921m.getParent();
                        if (parent instanceof ViewGroup) {
                            String str = f40Var.f13071f.f9412u;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 78);
                            sb2.append("Banner view provided from ");
                            sb2.append(str);
                            sb2.append(" already has a parent view. Removing its old parent.");
                            String sb3 = sb2.toString();
                            int i = k9.a0.f19634b;
                            l9.i.f(sb3);
                            ((ViewGroup) parent).removeView(f40Var.f5921m);
                        }
                        nl nlVar = sl.f10891p9;
                        g9.r rVar = g9.r.e;
                        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                            jk0 jk0Var = f40Var.f13072g.f5031u;
                            yk0 yk0Var = this.f9175d;
                            c80 c80Var = (c80) jk0Var.f7466v;
                            c80Var.f5032v = yk0Var;
                            c80Var.f5033w = this.e;
                        }
                        frameLayout.addView(f40Var.f5921m);
                        el0 el0Var = this.f9184o;
                        if (el0Var != null) {
                            el0Var.e(f40Var);
                        }
                        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                            Executor executor = this.f9173b;
                            yk0 yk0Var2 = this.f9175d;
                            Objects.requireNonNull(yk0Var2);
                            executor.execute(new e40(23, yk0Var2));
                        }
                        int i10 = ((sp0) f40Var.f13067a.f12313b.f11471w).f11093d;
                        if (i10 >= 0) {
                            this.f9182m = false;
                            x70 x70Var = this.f9178h;
                            x70Var.U1(i10);
                            x70Var.V1(f40Var.d());
                        } else {
                            this.f9182m = true;
                            this.f9178h.U1(f40Var.d());
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        e();
                        k9.a0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f9182m = true;
                        this.f9178h.E();
                    } catch (ExecutionException e8) {
                        e = e8;
                        e();
                        k9.a0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f9182m = true;
                        this.f9178h.E();
                    }
                } else if (this.f9181l != null) {
                    k9.a0.k("Show timer went off but there is an ongoing ad request.");
                    this.f9182m = true;
                } else {
                    k9.a0.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f9182m = true;
                    this.f9178h.E();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        PowerManager powerManager;
        Object parent = this.f9176f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        k9.f0 f0Var = f9.k.C.f16813c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        if (applicationContext != null) {
            powerManager = (PowerManager) applicationContext.getSystemService("power");
        } else {
            powerManager = null;
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return k9.f0.r(view, powerManager, keyguardManager);
    }

    public final void e() {
        this.f9181l = null;
        g9.y1 y1Var = this.f9183n;
        this.f9183n = null;
        if (((Boolean) g9.r.e.f17698c.a(sl.f10891p9)).booleanValue() && y1Var != null) {
            this.f9173b.execute(new ac.a(this, 21, y1Var));
        }
        el0 el0Var = this.f9184o;
        if (el0Var != null) {
            el0Var.mo201zza();
        }
    }
}

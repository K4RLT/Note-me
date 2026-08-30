package com.google.android.gms.internal.ads;
import d.b;
import g9.p;
import g9.r;
import l9.a;
import l9.d;
import r.e;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class j10 implements lf {

    /* renamed from: u, reason: collision with root package name */
    public final Context f7280u;

    /* renamed from: v, reason: collision with root package name */
    public final jk0 f7281v;

    public j10(Context context, l9.a aVar) {
        int i;
        boolean z3;
        jk0 jk0Var;
        this.f7280u = context;
        nl nlVar = sl.z3;
        g9.r rVar = g9.r.e;
        int intValue = ((Integer) rVar.f17698c.a(nlVar)).intValue();
        if (intValue != 1) {
            i = 3;
            if (intValue != 2 && intValue == 3) {
                i = 4;
            }
        } else {
            i = 2;
        }
        tx0 D = ux0.D();
        float floatValue = ((Float) rVar.f17698c.a(sl.F3)).floatValue();
        D.b();
        ((ux0) D.f4845v).F(floatValue);
        ux0 ux0Var = (ux0) D.c();
        vx0 G = wx0.G();
        boolean booleanValue = ((Boolean) rVar.f17698c.a(sl.G3)).booleanValue();
        G.b();
        ((wx0) G.f4845v).I(booleanValue);
        long longValue = ((Long) rVar.f17698c.a(sl.I3)).longValue();
        G.b();
        ((wx0) G.f4845v).J(longValue);
        wx0 wx0Var = (wx0) G.c();
        qx0 j02 = rx0.j0();
        j02.b();
        ((rx0) j02.f4845v).L(i);
        String str = aVar.f20029u;
        j02.b();
        ((rx0) j02.f4845v).A(str);
        j02.b();
        ((rx0) j02.f4845v).M();
        boolean booleanValue2 = ((Boolean) rVar.f17698c.a(sl.f10742g3)).booleanValue();
        j02.b();
        ((rx0) j02.f4845v).k0(booleanValue2);
        boolean booleanValue3 = ((Boolean) rVar.f17698c.a(sl.J3)).booleanValue();
        j02.b();
        ((rx0) j02.f4845v).l0(booleanValue3);
        boolean booleanValue4 = ((Boolean) rVar.f17698c.a(sl.K3)).booleanValue();
        j02.b();
        ((rx0) j02.f4845v).z(booleanValue4);
        if (((Integer) rVar.f17698c.a(sl.f10994w3)).intValue() == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        j02.b();
        ((rx0) j02.f4845v).G(z3);
        long intValue2 = ((Integer) rVar.f17698c.a(sl.f11027y3)).intValue();
        j02.b();
        ((rx0) j02.f4845v).F(intValue2);
        long longValue2 = ((Long) rVar.f17698c.a(sl.H3)).longValue();
        j02.b();
        ((rx0) j02.f4845v).D(longValue2);
        long intValue3 = ((Integer) rVar.f17698c.a(sl.f11011x3)).intValue();
        j02.b();
        ((rx0) j02.f4845v).C(intValue3);
        j02.b();
        ((rx0) j02.f4845v).B(ux0Var);
        j02.b();
        ((rx0) j02.f4845v).E(wx0Var);
        boolean booleanValue5 = ((Boolean) rVar.f17698c.a(sl.f10852n4)).booleanValue();
        j02.b();
        ((rx0) j02.f4845v).H(booleanValue5);
        rx0 rx0Var = (rx0) j02.c();
        wx wxVar = xx.f12651a;
        synchronized (jk0.f7463w) {
            try {
                if (jk0.f7464x == null) {
                    jk0.f7464x = new jk0(context, wxVar, rx0Var);
                }
                jk0Var = jk0.f7464x;
            } finally {
            }
        }
        this.f7281v = jk0Var;
        oy0 oy0Var = ((px0) jk0Var.f7466v).f9647a;
        synchronized (oy0Var) {
            try {
                if (oy0Var.e != null) {
                    return;
                }
                Set set = (Set) oy0Var.f9271b.zzb();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ny0) it.next()).zza());
                }
                h21 h21Var = (h21) oy0Var.f9273d.zzb();
                c81 d02 = ed1.d0(new k81(d51.u(arrayList), true), i6.f7015t, oy0Var.f9272c);
                h21Var.e(2, d02);
                oy0Var.e = d02;
                Iterator it2 = ((Set) oy0Var.f9270a.zzb()).iterator();
                while (it2.hasNext()) {
                    ((ny0) it2.next()).zza();
                }
                if (oy0Var.e != null) {
                } else {
                    throw null;
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void a(int i, int i10, int i11) {
        l9.d dVar = g9.p.f17688g.f17689a;
        Context context = this.f7280u;
        long j10 = i11;
        MotionEvent obtain = MotionEvent.obtain(0L, j10, 0, l9.d.b(context, i), l9.d.p(context.getResources().getDisplayMetrics(), i10), 0);
        jk0 jk0Var = this.f7281v;
        jk0Var.L(obtain);
        obtain.recycle();
        MotionEvent obtain2 = MotionEvent.obtain(0L, j10, 2, l9.d.p(context.getResources().getDisplayMetrics(), i), l9.d.p(context.getResources().getDisplayMetrics(), i10), 0);
        jk0Var.L(obtain2);
        obtain2.recycle();
        MotionEvent obtain3 = MotionEvent.obtain(0L, j10, 1, l9.d.p(context.getResources().getDisplayMetrics(), i), l9.d.p(context.getResources().getDisplayMetrics(), i10), 0);
        jk0Var.L(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void b(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f7281v.L(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String c(Context context, String str, View view, Activity activity) {
        return this.f7281v.K(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String d(Context context) {
        return this.f7281v.H(context);
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void e(StackTraceElement[] stackTraceElementArr) {
        jk0 jk0Var = this.f7281v;
        List asList = Arrays.asList(stackTraceElementArr);
        c21 c21Var = ((px0) jk0Var.f7466v).f9649c.f12425b;
        synchronized (c21Var) {
            ArrayList arrayList = c21Var.f4972a;
            arrayList.clear();
            arrayList.addAll(asList);
        }
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String f(Context context) {
        return this.f7281v.H(context);
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void g(View view) {
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String h(Context context, String str, View view) {
        return this.f7281v.K(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String i(Context context, View view, Activity activity) {
        String num;
        c81 c81Var;
        px0 px0Var = (px0) this.f7281v.f7466v;
        dy0 dy0Var = px0Var.e;
        h21 h21Var = px0Var.f9650d;
        g21 a10 = h21Var.a(4);
        try {
            try {
                try {
                    a10.a();
                    oy0 oy0Var = px0Var.f9647a;
                    synchronized (oy0Var) {
                        c81Var = oy0Var.e;
                        if (c81Var == null) {
                            throw null;
                        }
                    }
                    num = (String) ed1.c0(c81Var, new lr(px0Var, context, view, activity, 6), o81.f9033u).get(px0Var.f9651f, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    h21Var.b(57);
                    num = Integer.toString(17);
                } catch (Throwable th) {
                    a10.b(th);
                    throw th;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                a10.b(e);
                num = "";
            } catch (ExecutionException e8) {
                Throwable th2 = e8;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                a10.b(th2);
                num = Integer.toString(3);
            }
            a10.c();
            dy0Var.zzb();
            return num;
        } catch (Throwable th3) {
            a10.c();
            dy0Var.zzb();
            throw th3;
        }
    }
}

package com.google.android.gms.internal.ads;
import f9.k;
import g9.a;
import g9.r;
import g9.y1;
import j6.c;
import k9.a0;
import k9.f0;
import l9.i;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class n30 implements s60, k70, b70, a, z60, b90, v70 {
    public final ws0 A;
    public final eq0 B;
    public final of C;
    public final hm D;
    public final WeakReference E;
    public final WeakReference F;
    public final zd1 G;
    public final s70 H;
    public final c60 I;
    public final Set J;
    public boolean K;
    public final AtomicBoolean L = new AtomicBoolean();
    public x0 M = null;

    /* renamed from: u, reason: collision with root package name */
    public final Context f8532u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f8533v;

    /* renamed from: w, reason: collision with root package name */
    public final Executor f8534w;

    /* renamed from: x, reason: collision with root package name */
    public final ScheduledExecutorService f8535x;

    /* renamed from: y, reason: collision with root package name */
    public final wp0 f8536y;

    /* renamed from: z, reason: collision with root package name */
    public final qp0 f8537z;

    public n30(Context context, wx wxVar, Executor executor, ScheduledExecutorService scheduledExecutorService, wp0 wp0Var, qp0 qp0Var, ws0 ws0Var, eq0 eq0Var, View view, h00 h00Var, of ofVar, hm hmVar, zd1 zd1Var, s70 s70Var, c60 c60Var, Set set) {
        this.f8532u = context;
        this.f8533v = wxVar;
        this.f8534w = executor;
        this.f8535x = scheduledExecutorService;
        this.f8536y = wp0Var;
        this.f8537z = qp0Var;
        this.A = ws0Var;
        this.B = eq0Var;
        this.C = ofVar;
        this.E = new WeakReference(view);
        this.F = new WeakReference(h00Var);
        this.D = hmVar;
        this.G = zd1Var;
        this.H = s70Var;
        this.I = c60Var;
        this.J = set;
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void C() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void E() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void F() {
    }

    @Override // a
    public final void L() {
        boolean booleanValue = ((Boolean) r.e.f17698c.a(sl.Z0)).booleanValue();
        wp0 wp0Var = this.f8536y;
        if ((!booleanValue || !((sp0) wp0Var.f12313b.f11471w).f11096h) && ((Boolean) vm.f11944d.p()).booleanValue()) {
            hm hmVar = this.D;
            hmVar.getClass();
            i71 S = ed1.S(q81.t((q81) ed1.Y(q81.t(v81.f11836v), ((Long) vm.f11943c.p()).longValue(), TimeUnit.MILLISECONDS, hmVar.f6839c)), Throwable.class, i6.e, xx.f12657h);
            S.a(new t81(S, 0, new hx0(11, this)), this.f8533v);
            return;
        }
        qp0 qp0Var = this.f8537z;
        ArrayList a10 = this.A.a(wp0Var, qp0Var, qp0Var.f9928c);
        int i = 1;
        if (true == k.C.f16817h.i(this.f8532u)) {
            i = 2;
        }
        this.B.b(i, a10);
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void a() {
        qp0 qp0Var = this.f8537z;
        this.B.a(this.A.a(this.f8536y, qp0Var, qp0Var.f9935g), null);
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void b() {
        qp0 qp0Var = this.f8537z;
        this.B.a(this.A.a(this.f8536y, qp0Var, qp0Var.i), null);
    }

    public final List c() {
        Integer num;
        boolean booleanValue = ((Boolean) r.e.f17698c.a(sl.Nc)).booleanValue();
        qp0 qp0Var = this.f8537z;
        if (booleanValue) {
            f0 f0Var = k.C.f16813c;
            Context context = this.f8532u;
            if (f0.d(context)) {
                Object systemService = context.getSystemService("display");
                if (systemService instanceof DisplayManager) {
                    num = Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
                } else {
                    num = null;
                }
                if (num != null) {
                    int min = Math.min(num.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = qp0Var.f9930d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(min)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return qp0Var.f9930d;
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final synchronized void e() {
        zd1 zd1Var;
        long j10;
        try {
            if (this.K) {
                ArrayList arrayList = new ArrayList(c());
                qp0 qp0Var = this.f8537z;
                arrayList.addAll(qp0Var.f9933f);
                this.B.a(this.A.b(this.f8536y, qp0Var, true, null, null, arrayList, null, null), null);
            } else {
                eq0 eq0Var = this.B;
                ws0 ws0Var = this.A;
                wp0 wp0Var = this.f8536y;
                qp0 qp0Var2 = this.f8537z;
                eq0Var.a(ws0Var.a(wp0Var, qp0Var2, qp0Var2.f9945m), null);
                if (((Boolean) r.e.f17698c.a(sl.f11012x4)).booleanValue() && (zd1Var = this.G) != null) {
                    List list = ((qp0) zd1Var.f13143w).f9945m;
                    String d2 = ((qj0) zd1Var.f13144x).d();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(ws0.c((String) it.next(), "@gw_adnetstatus@", d2));
                    }
                    qj0 qj0Var = (qj0) zd1Var.f13144x;
                    synchronized (qj0Var) {
                        j10 = qj0Var.f9859h;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        arrayList3.add(ws0.c((String) obj, "@gw_ttr@", Long.toString(j10, 10)));
                    }
                    eq0Var.a(ws0Var.a((wp0) zd1Var.f13142v, (qp0) zd1Var.f13143w, arrayList3), null);
                }
                eq0Var.a(ws0Var.a(wp0Var, qp0Var2, qp0Var2.f9933f), null);
            }
            this.K = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.b90
    public final void g() {
        qp0 qp0Var = this.f8537z;
        this.B.a(this.A.a(this.f8536y, qp0Var, qp0Var.f9961u0), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.v70
    public final void i() {
        qp0 qp0Var = this.f8537z;
        if (qp0Var.e == 4) {
            this.B.a(this.A.a(this.f8536y, qp0Var, qp0Var.A0), null);
        }
    }

    public final void k(int i, int i10) {
        View view;
        if (i > 0 && ((view = (View) this.E.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            this.f8535x.schedule(new m30(this, i, i10, 0), i10, TimeUnit.MILLISECONDS);
        } else {
            l();
        }
    }

    public final void l() {
        int i;
        int intValue;
        x0 x0Var;
        qp0 qp0Var = this.f8537z;
        List list = qp0Var.f9930d;
        if (list != null && !list.isEmpty()) {
            nl nlVar = sl.f10914qf;
            r rVar = r.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && this.M == null) {
                sx sxVar = k.C.f16817h.f9634c;
                Set set = this.J;
                String str = ((aq0) this.f8536y.f12312a.f4819v).f4583g;
                qx qxVar = sxVar.f11186x;
                synchronized (qxVar.f10016g) {
                    try {
                        int i10 = qxVar.f10021m;
                        qxVar.f10021m = i10 + 1;
                        if (set.isEmpty()) {
                            x0Var = new x0(i10, -1, -1, false);
                        } else {
                            TreeSet treeSet = new TreeSet(set);
                            StringBuilder sb2 = new StringBuilder();
                            Iterator it = treeSet.iterator();
                            if (it.hasNext()) {
                                Object next = it.next();
                                while (true) {
                                    sb2.append((CharSequence) next);
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    sb2.append((CharSequence) ",");
                                    next = it.next();
                                }
                            }
                            String sb3 = sb2.toString();
                            HashMap hashMap = qxVar.f10022n;
                            Integer num = (Integer) hashMap.get(sb3);
                            int i11 = 0;
                            if (num == null) {
                                intValue = 0;
                            } else {
                                intValue = num.intValue();
                            }
                            hashMap.put(sb3, Integer.valueOf(intValue + 1));
                            if (str == null) {
                                x0Var = new x0(i10, intValue, -1, false);
                            } else {
                                StringBuilder sb4 = new StringBuilder(str.length() + 1 + sb3.length());
                                sb4.append(str);
                                sb4.append("|");
                                sb4.append(sb3);
                                String sb5 = sb4.toString();
                                HashMap hashMap2 = qxVar.f10023o;
                                Integer num2 = (Integer) hashMap2.get(sb5);
                                if (num2 != null) {
                                    i11 = num2.intValue();
                                }
                                hashMap2.put(sb5, Integer.valueOf(i11 + 1));
                                x0Var = new x0(i10, intValue, i11, false);
                            }
                        }
                    } finally {
                    }
                }
                this.M = x0Var;
            }
            String str2 = null;
            if (((Boolean) rVar.f17698c.a(sl.f10935s4)).booleanValue()) {
                str2 = this.C.f9103b.i(this.f8532u, (View) this.E.get(), null);
            }
            if ((!((Boolean) rVar.f17698c.a(sl.Z0)).booleanValue() || !((sp0) this.f8536y.f12313b.f11471w).f11096h) && ((Boolean) vm.f11947h.p()).booleanValue()) {
                if (((Boolean) vm.f11946g.p()).booleanValue() && ((i = qp0Var.f9926b) == 1 || i == 2 || i == 5)) {
                }
                q81 q81Var = (q81) ed1.Y(q81.t(v81.f11836v), ((Long) rVar.f17698c.a(sl.D1)).longValue(), TimeUnit.MILLISECONDS, this.f8535x);
                q81Var.a(new t81(q81Var, 0, new c(this, 5, str2)), this.f8533v);
                return;
            }
            this.B.a(this.A.b(this.f8536y, qp0Var, false, str2, null, c(), this.I, this.M), this.H);
        }
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void o(y1 y1Var) {
        if (((Boolean) r.e.f17698c.a(sl.f10677c2)).booleanValue()) {
            int i = y1Var.f17714u;
            ArrayList arrayList = new ArrayList();
            qp0 qp0Var = this.f8537z;
            for (String str : qp0Var.f9948o) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 2);
                sb2.append("2.");
                sb2.append(i);
                arrayList.add(ws0.c(str, "@gw_mpe@", sb2.toString()));
            }
            this.B.a(this.A.a(this.f8536y, qp0Var, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void v(iv ivVar, String str, String str2) {
        xp0 xp0Var;
        qp0 qp0Var = this.f8537z;
        List list = qp0Var.f9937h;
        ws0 ws0Var = this.A;
        ws0Var.getClass();
        ArrayList arrayList = new ArrayList();
        ws0Var.f12325h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = ivVar.f7231u;
            String num = Integer.toString(ivVar.f7232v);
            boolean booleanValue = ((Boolean) r.e.f17698c.a(sl.f10949t4)).booleanValue();
            h31 h31Var = y21.f12763u;
            if (booleanValue) {
                yp0 yp0Var = ws0Var.f12324g;
                if (yp0Var != null && (xp0Var = yp0Var.f12926a) != null) {
                    h31Var = new l31(xp0Var);
                }
            } else {
                xp0 xp0Var2 = ws0Var.f12323f;
                if (xp0Var2 != null) {
                    h31Var = new l31(xp0Var2);
                }
            }
            String str4 = (String) h31Var.b(i6.f7014s).a();
            String str5 = (String) h31Var.b(i6.f7013r).a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ay0.f(ws0.c(ws0.c(ws0.c(ws0.c(ws0.c(ws0.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", num), "@gw_sdkver@", ws0Var.f12320b), ws0Var.e, qp0Var.W, qp0Var.f9965w0));
            }
        } catch (RemoteException e) {
            int i = a0.f19634b;
            i.d("Unable to determine award type and amount.", e);
        }
        this.B.a(arrayList, null);
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void y() {
        if (!this.L.compareAndSet(false, true)) {
            return;
        }
        nl nlVar = sl.B4;
        r rVar = r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        int intValue = ((Integer) qlVar.a(nlVar)).intValue();
        if (intValue > 0) {
            k(intValue, ((Integer) qlVar2.a(sl.C4)).intValue());
        } else if (((Boolean) qlVar2.a(sl.A4)).booleanValue()) {
            this.f8534w.execute(new l30(this, 0));
        } else {
            l();
        }
    }
}

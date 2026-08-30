package com.google.android.gms.internal.ads;
import a5.a;
import ac.b;
import f9.k;
import g9.e3;
import g9.r;
import r.e;
import r1.a;
import r2.a;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class uj0 implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final kr0 f11642a;

    /* renamed from: b, reason: collision with root package name */
    public final u60 f11643b;

    /* renamed from: c, reason: collision with root package name */
    public final ws0 f11644c;

    /* renamed from: d, reason: collision with root package name */
    public final xs0 f11645d;
    public final Executor e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f11646f;

    /* renamed from: g, reason: collision with root package name */
    public final b50 f11647g;

    /* renamed from: h, reason: collision with root package name */
    public final qj0 f11648h;
    public final ii0 i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f11649j;

    /* renamed from: k, reason: collision with root package name */
    public final ur0 f11650k;

    /* renamed from: l, reason: collision with root package name */
    public final hb f11651l;

    /* renamed from: m, reason: collision with root package name */
    public final zd0 f11652m;

    public uj0(Context context, kr0 kr0Var, qj0 qj0Var, u60 u60Var, ws0 ws0Var, xs0 xs0Var, b50 b50Var, wx wxVar, ScheduledExecutorService scheduledExecutorService, ii0 ii0Var, ur0 ur0Var, hb hbVar, zd0 zd0Var) {
        this.f11649j = context;
        this.f11642a = kr0Var;
        this.f11648h = qj0Var;
        this.f11643b = u60Var;
        this.f11644c = ws0Var;
        this.f11645d = xs0Var;
        this.f11647g = b50Var;
        this.e = wxVar;
        this.f11646f = scheduledExecutorService;
        this.i = ii0Var;
        this.f11650k = ur0Var;
        this.f11651l = hbVar;
        this.f11652m = zd0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) r1.f17698c.a(com.google.android.gms.internal.ads.sl.f11014x6)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(com.google.android.gms.internal.ads.wp0 r6) {
        /*
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.f11030y6
            g9.r r1 = g9.r.e
            com.google.android.gms.internal.ads.ql r2 = r1.f17698c
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r2 = "No fill."
            r3 = 1
            if (r3 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r2
        L19:
            com.google.android.gms.internal.ads.tw r6 = r6.f12313b
            java.lang.Object r6 = r6.f11471w
            com.google.android.gms.internal.ads.sp0 r6 = (com.google.android.gms.internal.ads.sp0) r6
            int r3 = r6.f11094f
            if (r3 == 0) goto L5b
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 300(0x12c, float:4.2E-43)
            if (r3 < r4) goto L3c
            if (r3 >= r5) goto L3c
            com.google.android.gms.internal.ads.nl r3 = com.google.android.gms.internal.ads.sl.f11014x6
            com.google.android.gms.internal.ads.ql r1 = r1.f17698c
            java.lang.Object r1 = r1.a(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L5b
            goto L5c
        L3c:
            if (r3 < r5) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r3 >= r0) goto L45
            java.lang.String r2 = "No location header to follow redirect or too many redirects."
            goto L5c
        L45:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 35
            r1.<init>(r0)
            java.lang.String r0 = "Received error HTTP response code: "
            java.lang.String r2 = a5.a.f(r3, r0, r1)
            goto L5c
        L5b:
            r2 = r0
        L5c:
            com.google.android.gms.internal.ads.w91 r6 = r6.f11097j
            if (r6 == 0) goto L63
            java.lang.String r6 = r6.f12196b
            return r6
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uj0.a(com.google.android.gms.internal.ads.wp0):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final ac.b l(Object obj) {
        ac.b j10;
        int i;
        Bundle bundle;
        uj0 uj0Var = this;
        wp0 wp0Var = (wp0) obj;
        nl nlVar = sl.J2;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && (bundle = (Bundle) wp0Var.f12313b.f11473y) != null) {
            zd0 zd0Var = uj0Var.f11652m;
            synchronized (zd0Var) {
                zd0Var.e.putAll(bundle);
            }
        }
        if (((Boolean) rVar.f17698c.a(sl.K2)).booleanValue()) {
            a5.a.u(f9.k.C.f16819k, uj0Var.f11652m, "rendering-start");
        }
        String a10 = a(wp0Var);
        ii0 ii0Var = uj0Var.i;
        tw twVar = wp0Var.f12313b;
        sp0 sp0Var = (sp0) twVar.f11471w;
        ii0Var.f7146d = sp0Var;
        if (((Boolean) rVar.f17698c.a(sl.x9)).booleanValue() && (i = sp0Var.f11094f) != 0 && (i < 200 || i >= 300)) {
            return ed1.A(new cg0(3, a10));
        }
        String str = sp0Var.f11104q;
        if (((Boolean) rVar.f17698c.a(sl.v4)).booleanValue() && !TextUtils.isEmpty(str)) {
            List list = (List) twVar.f11470v;
            synchronized (ii0Var) {
                Map map = ii0Var.f7144b;
                if (map.containsKey(str)) {
                    g9.e3 e3Var = (g9.e3) map.get(str);
                    List list2 = ii0Var.f7143a;
                    int indexOf = list2.indexOf(e3Var);
                    try {
                        list2.remove(indexOf);
                    } catch (IndexOutOfBoundsException e) {
                        f9.k.C.f16817h.d("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e);
                    }
                    ii0Var.f7144b.remove(str);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ii0Var.b((qp0) it.next(), indexOf);
                        indexOf++;
                    }
                }
            }
        } else {
            for (qp0 qp0Var : (List) twVar.f11470v) {
                ii0Var.b(qp0Var, ii0Var.f7143a.size());
                Iterator it2 = qp0Var.f9924a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        di0 a11 = uj0Var.f11647g.a(qp0Var.f9926b, (String) it2.next());
                        if (a11 == null || !a11.b(wp0Var, qp0Var)) {
                        }
                    } else {
                        ii0Var.c(qp0Var, 0L, x21.J(1, null, null), false);
                        break;
                    }
                }
            }
        }
        u60 u60Var = uj0Var.f11643b;
        k30 k30Var = new k30(wp0Var, uj0Var.f11645d, uj0Var.f11644c);
        Executor executor = uj0Var.e;
        u60Var.L1(k30Var, executor);
        if (sp0Var.f11105r > 1) {
            hb hbVar = uj0Var.f11651l;
            synchronized (hbVar) {
                try {
                    if (!((AtomicBoolean) hbVar.C).getAndSet(true)) {
                        List list3 = (List) wp0Var.f12313b.f11470v;
                        if (list3.isEmpty()) {
                            ((d91) hbVar.B).e(new cg0(3, a(wp0Var)));
                        } else {
                            hbVar.E = wp0Var;
                            qj0 qj0Var = (qj0) hbVar.f6654z;
                            hbVar.D = new jj0(wp0Var, qj0Var, (d91) hbVar.B);
                            qj0Var.a(list3);
                            for (qp0 a12 = ((jj0) hbVar.D).a(); a12 != null; a12 = ((jj0) hbVar.D).a()) {
                                hbVar.A(a12);
                            }
                        }
                    }
                    j10 = (d91) hbVar.B;
                } finally {
                }
            }
        } else {
            String a13 = a(wp0Var);
            kr0 kr0Var = uj0Var.f11642a;
            ir0 ir0Var = ir0.RENDER_CONFIG_INIT;
            Objects.requireNonNull(kr0Var);
            j10 = new k60(kr0Var, ir0Var, null, kr0.f7850d, Collections.EMPTY_LIST, ed1.A(new cg0(3, a13))).j();
            qj0 qj0Var2 = uj0Var.f11648h;
            synchronized (qj0Var2) {
                qj0Var2.f9853a.getClass();
                qj0Var2.i = SystemClock.elapsedRealtime();
            }
            int i10 = 0;
            for (qp0 qp0Var2 : (List) twVar.f11470v) {
                Iterator it3 = qp0Var2.f9924a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String str2 = (String) it3.next();
                    di0 a14 = uj0Var.f11647g.a(qp0Var2.f9926b, str2);
                    if (a14 != null && a14.b(wp0Var, qp0Var2)) {
                        k60 a15 = kr0Var.a(j10, ir0.RENDER_CONFIG_WATERFALL);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(str2).length());
                        sb2.append("render-config-");
                        sb2.append(i10);
                        sb2.append("-");
                        sb2.append(str2);
                        String sb3 = sb2.toString();
                        ac.b bVar = (ac.b) a15.f7668c;
                        List list4 = (List) a15.f7669d;
                        ac.b bVar2 = (ac.b) a15.e;
                        kr0 kr0Var2 = (kr0) a15.f7670f;
                        Object obj2 = a15.f7666a;
                        Objects.requireNonNull(kr0Var2);
                        j10 = new k60(kr0Var2, obj2, sb3, bVar, list4, ed1.U(bVar2, Throwable.class, new lr(uj0Var, qp0Var2, wp0Var, a14, 4), kr0Var2.f7851a)).j();
                        break;
                    }
                    uj0Var = this;
                }
                i10++;
                uj0Var = this;
            }
            j10.a(new e40(18, qj0Var2), executor);
        }
        return j10;
    }
}

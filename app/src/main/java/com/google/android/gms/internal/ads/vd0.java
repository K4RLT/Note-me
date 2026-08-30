package com.google.android.gms.internal.ads;
import f9.k;
import mf.b;
import p.b;
import r.e;
import r0.a;
import r2.a;
import r2.b;
import r3.a;
import r4.a;
import a0.k;
import c2.z1;
import ee.a;
import g9.r;
import g9.y1;
import k9.a0;
import l9.i;
import la.b;
import p.e;
import r0.c;
import r0.p;
import r2.f;
import s9.m;
import ya.ee;
import z1.o;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class vd0 implements a80, k70, v60, j90 {

    /* renamed from: u, reason: collision with root package name */
    public final zd0 f11887u;

    /* renamed from: v, reason: collision with root package name */
    public final fe0 f11888v;

    /* renamed from: w, reason: collision with root package name */
    public final Context f11889w;

    public vd0(zd0 zd0Var, fe0 fe0Var, Context context) {
        this.f11887u = zd0Var;
        this.f11888v = fe0Var;
        this.f11889w = context;
    }

    @Override // com.google.android.gms.internal.ads.j90
    public final void G(String str) {
        if (!((Boolean) g9.r.e.f17698c.a(sl.Q7)).booleanValue()) {
            return;
        }
        zd0 zd0Var = this.f11887u;
        zd0Var.f13137a.put("action", "sgf");
        zd0Var.b("sgf_reason", str);
        zd0Var.d();
        this.f11888v.b(zd0Var.f13137a);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void S(wp0 wp0Var) {
        String str;
        zd0 zd0Var = this.f11887u;
        zd0Var.getClass();
        tw twVar = wp0Var.f12313b;
        List list = (List) twVar.f11470v;
        if (!list.isEmpty()) {
            int i = ((qp0) list.get(0)).f9926b;
            zd0Var.b("ad_format", qp0.a(i));
            if (i == 6) {
                ConcurrentHashMap concurrentHashMap = zd0Var.f13137a;
                if (true != zd0Var.f13138b.A) {
                    str = "0";
                } else {
                    str = "1";
                }
                concurrentHashMap.put("as", str);
            }
        }
        nl nlVar = sl.L2;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            zd0Var.b("mwl", Integer.toString(list.size()));
        }
        zd0Var.b("gqi", ((sp0) twVar.f11471w).f11091b);
        if (((Boolean) rVar.f17698c.a(sl.Sa)).booleanValue()) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.j90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(s9.m r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.Q7
            g9.r r1 = g9.r.e
            com.google.android.gms.internal.ads.ql r2 = r1.f17698c
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L14
            goto L9e
        L14:
            java.lang.String r0 = "sgs"
            com.google.android.gms.internal.ads.fe0 r2 = r8.f11888v
            java.lang.String r3 = "action"
            com.google.android.gms.internal.ads.zd0 r4 = r8.f11887u
            if (r9 != 0) goto L2e
            java.util.concurrent.ConcurrentHashMap r9 = r4.f13137a
            r9.put(r3, r0)
            java.lang.String r0 = "request_id"
            java.lang.String r1 = "-1"
            r9.put(r0, r1)
            r2.b(r9)
            return
        L2e:
            com.google.android.gms.internal.ads.dv r5 = r9.f25085c
            if (r5 == 0) goto L39
            android.os.Bundle r6 = r5.G
            com.google.android.gms.internal.ads.y51 r7 = com.google.android.gms.internal.ads.xd0.f12550d
            r8.b(r6, r7)
        L39:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L9f
            java.lang.String r9 = r9.f25084b     // Catch: org.json.JSONException -> L9f
            r6.<init>(r9)     // Catch: org.json.JSONException -> L9f
            java.util.concurrent.ConcurrentHashMap r9 = r4.f13137a
            java.util.concurrent.ConcurrentHashMap r7 = r4.f13137a
            r9.put(r3, r0)
            com.google.android.gms.internal.ads.nl r9 = com.google.android.gms.internal.ads.sl.f10686cb
            com.google.android.gms.internal.ads.ql r0 = r1.f17698c
            java.lang.Object r9 = r0.a(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L58
            goto L75
        L58:
            java.lang.String r9 = "extras"
            org.json.JSONObject r9 = r6.getJSONObject(r9)     // Catch: org.json.JSONException -> L69
            java.lang.String r0 = "accept_3p_cookie"
            boolean r9 = r9.getBoolean(r0)     // Catch: org.json.JSONException -> L69
            if (r9 == 0) goto L6b
            java.lang.String r9 = "1"
            goto L77
        L69:
            r9 = move-exception
            goto L6e
        L6b:
            java.lang.String r9 = "0"
            goto L77
        L6e:
            int r0 = k9.a0.f19634b
            java.lang.String r0 = "Error retrieving JSONObject from the requestJson, "
            l9.i.d(r0, r9)
        L75:
            java.lang.String r9 = "na"
        L77:
            java.lang.String r0 = "tpc"
            r7.put(r0, r9)
            if (r5 == 0) goto L83
            android.os.Bundle r9 = r5.f5526u
            r4.a(r9)
        L83:
            r4.d()
            r2.b(r7)
            com.google.android.gms.internal.ads.nl r9 = com.google.android.gms.internal.ads.sl.Ua
            g9.r r0 = g9.r.e
            com.google.android.gms.internal.ads.ql r0 = r0.f17698c
            java.lang.Object r9 = r0.a(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L9e
            r8.d()
        L9e:
            return
        L9f:
            java.util.concurrent.ConcurrentHashMap r9 = r4.f13137a
            java.lang.String r0 = "sgf"
            r9.put(r3, r0)
            java.lang.String r0 = "sgf_reason"
            java.lang.String r1 = "request_invalid"
            r9.put(r0, r1)
            r2.b(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vd0.a(s9.m):void");
    }

    public final void b(Bundle bundle, d51 d51Var) {
        String str;
        nl nlVar = sl.J2;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && bundle != null) {
            f9.k.C.f16819k.getClass();
            bundle.putLong("public-api-callback", System.currentTimeMillis());
            zd0 zd0Var = this.f11887u;
            zd0Var.getClass();
            String str2 = "1";
            if (((Boolean) rVar.f17698c.a(sl.Re)).booleanValue()) {
                if (true == zd0Var.f13139c.f4592q) {
                    str = "1";
                } else {
                    str = "0";
                }
                zd0Var.b("brr", str);
            }
            if (bundle.containsKey("ls")) {
                if (true != bundle.getBoolean("ls")) {
                    str2 = "0";
                }
                zd0Var.b("ls", str2);
            }
            int size = d51Var.size();
            for (int i = 0; i < size; i++) {
                xd0 xd0Var = (xd0) d51Var.get(i);
                long j10 = bundle.getLong(wd0.f(xd0Var.f12552b), -1L);
                long j11 = bundle.getLong(wd0.f(xd0Var.f12553c), -1L);
                if (j10 > 0 && j11 > 0) {
                    zd0Var.b(xd0Var.f12551a, String.valueOf(j11 - j10));
                }
            }
            c(bundle.getBundle("client_sig_latency_key"));
            c(bundle.getBundle("gms_sig_latency_key"));
        }
    }

    public final void c(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                long j10 = bundle.getLong(str);
                if (j10 >= 0) {
                    this.f11887u.b(str, String.valueOf(j10));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r3 = r4.getHistoricalProcessExitReasons(r3.getPackageName(), 0, 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.nb r0 = com.google.android.gms.internal.ads.cn.f5129d
            java.lang.Object r0 = r0.p()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "Invalid number format in appExitInfoReasonAllowlist: "
            if (r0 == 0) goto L12
            goto Lea
        L12:
            f9.k r0 = f9.k.C
            com.google.android.gms.internal.ads.px r0 = r0.f16817h
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f9646q
            r2 = 1
            boolean r0 = r0.getAndSet(r2)
            if (r0 != 0) goto Lea
            boolean r0 = la.b.i()
            if (r0 == 0) goto Lea
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.Va
            g9.r r3 = g9.r.e
            com.google.android.gms.internal.ads.ql r3 = r3.f17698c
            java.lang.Object r0 = r3.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto Lea
            android.content.Context r3 = r7.f11889w     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            java.lang.String r4 = "activity"
            java.lang.Object r4 = r3.getSystemService(r4)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            if (r4 == 0) goto Lea
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            java.util.List r3 = c2.z1.o(r4, r3)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            if (r3 == 0) goto Lea
            boolean r4 = r3.isEmpty()     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            if (r4 != 0) goto Lea
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            android.app.ApplicationExitInfo r3 = com.google.android.gms.internal.mlkit_vision_digital_ink.p.e(r3)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            int r3 = com.google.android.gms.internal.mlkit_vision_digital_ink.p.b(r3)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            com.google.android.gms.internal.ads.a31 r4 = new com.google.android.gms.internal.ads.a31     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            r5 = 44
            r4.<init>(r5)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            com.google.android.gms.internal.ads.mf r4 = com.google.android.gms.internal.ads.mf.b(r4)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            com.google.android.gms.internal.ads.d31 r5 = com.google.android.gms.internal.ads.d31.f5300w     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            com.google.android.gms.internal.ads.mf r4 = r4.k(r5)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            java.lang.Object r5 = r4.f8337v     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            com.google.android.gms.internal.ads.z21 r5 = (com.google.android.gms.internal.ads.z21) r5     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            com.google.android.gms.internal.ads.mf r6 = new com.google.android.gms.internal.ads.mf     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            java.lang.Object r4 = r4.f8338w     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            com.google.android.gms.internal.ads.p31 r4 = (com.google.android.gms.internal.ads.p31) r4     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            r6.<init>(r4, r2, r5)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            r0.getClass()     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            java.lang.Object r2 = r6.f8338w     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            com.google.android.gms.internal.ads.p31 r2 = (com.google.android.gms.internal.ads.p31) r2     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            java.util.Iterator r0 = r2.f(r6, r0)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
        L89:
            r2 = r0
            com.google.android.gms.internal.ads.o31 r2 = (com.google.android.gms.internal.ads.o31) r2     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            boolean r4 = r2.hasNext()     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            if (r4 == 0) goto Lea
            java.lang.Object r2 = r2.next()     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2 java.lang.NumberFormatException -> Lc4
            if (r2 != r3) goto L89
            com.google.android.gms.internal.ads.fe0 r0 = r7.f11888v     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            r0.getClass()     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            java.util.HashMap r2 = r0.f6045a     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            r1.<init>(r2)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            java.lang.String r2 = "action"
            java.lang.String r4 = "aei"
            r1.put(r2, r4)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            java.lang.String r2 = "aeir"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            r1.put(r2, r3)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            r0.c(r1)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            goto Lea
        Lbe:
            r0 = move-exception
            goto Le1
        Lc0:
            r0 = move-exception
            goto Le1
        Lc2:
            r0 = move-exception
            goto Le1
        Lc4:
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            int r4 = r4.length()     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            int r4 = r4 + 53
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            r5.append(r1)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            r5.append(r2)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            java.lang.String r2 = r5.toString()     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            k9.a0.k(r2)     // Catch: java.lang.RuntimeException -> Lbe java.lang.NoClassDefFoundError -> Lc0 java.lang.NoSuchMethodError -> Lc2
            goto L89
        Le1:
            f9.k r1 = f9.k.C
            com.google.android.gms.internal.ads.px r1 = r1.f16817h
            java.lang.String r2 = "CsiAdLoadListener.maybeLogAppExitInfo"
            r1.d(r2, r0)
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vd0.d():void");
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final void e() {
        Bundle bundle;
        String str;
        zd0 zd0Var = this.f11887u;
        zd0Var.f13137a.put("action", "loaded");
        synchronized (zd0Var) {
            bundle = zd0Var.e;
        }
        b(bundle, xd0.e);
        if (((Boolean) g9.r.e.f17698c.a(sl.f10689ce)).booleanValue()) {
            boolean a10 = ya.ee.a("MUTE_AUDIO");
            ConcurrentHashMap concurrentHashMap = zd0Var.f13137a;
            if (true != a10) {
                str = "0";
            } else {
                str = "1";
            }
            concurrentHashMap.put("mafe", str);
        }
        zd0Var.d();
        this.f11888v.b(zd0Var.f13137a);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void r(dv dvVar) {
        this.f11887u.a(dvVar.f5526u);
        if (((Boolean) g9.r.e.f17698c.a(sl.Ta)).booleanValue()) {
            d();
        }
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final void x(g9.y1 y1Var) {
        zd0 zd0Var = this.f11887u;
        zd0Var.f13137a.put("action", "ftl");
        zd0Var.b("ftl", String.valueOf(y1Var.f17714u));
        zd0Var.b("ed", y1Var.f17716w);
        if (((Boolean) g9.r.e.f17698c.a(sl.f10730f8)).booleanValue()) {
            zd0Var.b("emsg", y1Var.f17715v);
        }
        zd0Var.d();
        this.f11888v.b(zd0Var.f13137a);
    }
}

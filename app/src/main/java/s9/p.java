package s9;
import c.g;
import p.b;
import r.e;
import u.c;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.internal.ads.fe0;
import com.google.android.gms.internal.ads.lt;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.wx;
import com.google.android.gms.internal.ads.xx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import ya.zb;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f25095a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f25096b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f25097c;

    /* renamed from: d, reason: collision with root package name */
    public final fe0 f25098d;
    public final ExecutorService e;

    public p(Context context, fe0 fe0Var, wx wxVar) {
        this.f25097c = context;
        this.f25098d = fe0Var;
        this.e = wxVar;
    }

    public final synchronized void a(Object obj, v9.a aVar) {
        f9.k.C.f16819k.getClass();
        xx.f12655f.execute(new qb.s(2, this, obj, new Pair(aVar, Long.valueOf(System.currentTimeMillis()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0027, B:11:0x002b, B:14:0x0035, B:16:0x0039, B:17:0x004a, B:20:0x0054, B:26:0x0074, B:27:0x0078, B:29:0x007e, B:33:0x0042, B:35:0x0032), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0027, B:11:0x002b, B:14:0x0035, B:16:0x0039, B:17:0x004a, B:20:0x0054, B:26:0x0074, B:27:0x0078, B:29:0x007e, B:33:0x0042, B:35:0x0032), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0027, B:11:0x002b, B:14:0x0035, B:16:0x0039, B:17:0x004a, B:20:0x0054, B:26:0x0074, B:27:0x0078, B:29:0x007e, B:33:0x0042, B:35:0x0032), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(boolean r10, s9.r r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.HashMap r0 = r9.f25095a     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L30
            s9.r r2 = (s9.r) r2     // Catch: java.lang.Throwable -> L30
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            f9.k r5 = f9.k.C     // Catch: java.lang.Throwable -> L30
            la.a r5 = r5.f16819k     // Catch: java.lang.Throwable -> L30
            r5.getClass()     // Catch: java.lang.Throwable -> L30
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L30
            long r7 = r2.f25106c     // Catch: java.lang.Throwable -> L30
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L24
            r5 = r3
            goto L25
        L24:
            r5 = r4
        L25:
            if (r5 != 0) goto L32
            c r2 = r2.f25104a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            c r2 = r11.f25104a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L35
            goto L32
        L30:
            r10 = move-exception
            goto L8a
        L32:
            r0.put(r1, r11)     // Catch: java.lang.Throwable -> L30
        L35:
            c r0 = r11.f25104a     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L42
            com.google.android.gms.internal.ads.nb r0 = com.google.android.gms.internal.ads.bn.f4840f     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.p()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
            goto L4a
        L42:
            com.google.android.gms.internal.ads.nb r0 = com.google.android.gms.internal.ads.bn.f4841g     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.p()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
        L4a:
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L30
            c r0 = r11.f25104a     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L53
            goto L54
        L53:
            r3 = r4
        L54:
            com.google.android.gms.internal.ads.ux r0 = com.google.android.gms.internal.ads.xx.f12654d     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.internal.ads.xq0 r2 = new com.google.android.gms.internal.ads.xq0     // Catch: java.lang.Throwable -> L30
            r7 = 1
            r2.<init>(r7, r9, r10, r3)     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L30
            r0.schedule(r2, r5, r10)     // Catch: java.lang.Throwable -> L30
            java.util.HashMap r10 = r9.f25096b     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r10.get(r1)     // Catch: java.lang.Throwable -> L30
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            r10.put(r1, r2)     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L74
            goto L88
        L74:
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        L78:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L88
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L30
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> L30
            r9.e(r11, r0, r4)     // Catch: java.lang.Throwable -> L30
            goto L78
        L88:
            monitor-exit(r9)
            return
        L8a:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L30
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.b(boolean, s9.r):void");
    }

    public final void c(boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        HashMap hashMap = this.f25096b;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new ArrayList());
            this.e.submit(new lt(5, this, z3));
        }
    }

    public final synchronized void d(boolean z3, boolean z9) {
        Throwable th;
        Boolean valueOf;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z3);
                HashMap hashMap = this.f25095a;
                Boolean valueOf2 = Boolean.valueOf(z3);
                r rVar = (r) hashMap.get(valueOf2);
                int i = 0;
                if (z9 && rVar != null) {
                    try {
                        i = rVar.f25107d + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                r rVar2 = (r) hashMap.get(valueOf2);
                if (rVar2 == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(rVar2.e.get());
                }
                q qVar = new q(this, z3, i, valueOf, this.f25098d);
                z8.g gVar = new z8.g((z8.f) new c1.a(6).g(bundle));
                if (((Boolean) g9.e.f17698c.a(sl.f11019xc)).booleanValue()) {
                    this.e.submit(new c7.r(10, this, gVar, qVar));
                } else {
                    c.g(this.f25097c, gVar, qVar);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void e(r rVar, Pair pair, boolean z3) {
        boolean z9 = true;
        rVar.e.set(true);
        c cVar = rVar.f25104a;
        if (cVar != null) {
            ((v9.a) pair.first).b(cVar);
        } else {
            ((v9.a) pair.first).a(rVar.f25105b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        f9.k.C.f16819k.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue()));
        Pair pair7 = new Pair("sgpc_h", Boolean.toString(z3));
        if (cVar == null) {
            z9 = false;
        }
        zb.d(this.f25098d, "sgpcr", pair2, pair3, pair4, pair5, pair6, pair7, new Pair("sgpc_rs", Boolean.toString(z9)));
    }
}

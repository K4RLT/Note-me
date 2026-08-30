package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class it0 {

    /* renamed from: c, reason: collision with root package name */
    public final pt0 f7215c;

    /* renamed from: d, reason: collision with root package name */
    public final bl0 f7216d;
    public final Context e;

    /* renamed from: f, reason: collision with root package name */
    public volatile ConnectivityManager f7217f;

    /* renamed from: h, reason: collision with root package name */
    public final la.a f7219h;
    public AtomicInteger i;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f7218g = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f7213a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f7214b = new ConcurrentHashMap();

    public it0(pt0 pt0Var, bl0 bl0Var, Context context, la.a aVar) {
        this.f7215c = pt0Var;
        this.f7216d = bl0Var;
        this.e = context;
        this.f7219h = aVar;
    }

    public static String a(String str, z8.b bVar) {
        String name;
        if (bVar == null) {
            name = "NULL";
        } else {
            name = bVar.name();
        }
        return p.a.o(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length()), str, "#", name);
    }

    public final void b(boolean z3) {
        synchronized (this) {
            if (((Boolean) g9.r.e.f17698c.a(sl.C)).booleanValue()) {
                c(z3);
            }
        }
    }

    public final synchronized void c(boolean z3) {
        ConcurrentHashMap concurrentHashMap = this.f7213a;
        try {
            if (z3) {
                Iterator it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    ((dt0) it.next()).n();
                }
            } else {
                Iterator it2 = concurrentHashMap.values().iterator();
                while (it2.hasNext()) {
                    ((dt0) it2.next()).f5499g.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
    
        if (((java.lang.Boolean) r3.f17698c.a(com.google.android.gms.internal.ads.sl.F)).booleanValue() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.ArrayList d(java.util.List r9) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.it0.d(java.util.List):java.util.ArrayList");
    }

    public final synchronized boolean e(String str, z8.b bVar) {
        boolean z3;
        Long l10;
        int s10;
        try {
            this.f7219h.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            dt0 g8 = g(str, bVar);
            if (g8 != null && g8.l()) {
                z3 = true;
            } else {
                z3 = false;
            }
            String str2 = null;
            if (z3) {
                l10 = Long.valueOf(System.currentTimeMillis());
            } else {
                l10 = null;
            }
            jt0 jt0Var = new jt0(new hq0(str, 19, bVar));
            int i = 0;
            bl0 bl0Var = this.f7216d;
            if (g8 == null) {
                s10 = 0;
            } else {
                s10 = g8.s();
            }
            if (g8 != null) {
                i = g8.t();
            }
            int i10 = i;
            if (g8 != null) {
                str2 = g8.o();
            }
            bl0Var.i(s10, i10, currentTimeMillis, l10, str2, jt0Var, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z3;
    }

    public final synchronized Object f(Class cls, String str, z8.b bVar) {
        Object cast;
        jt0 jt0Var = new jt0(new hq0(str, 19, bVar));
        bl0 bl0Var = this.f7216d;
        this.f7219h.getClass();
        bl0Var.n("poll_ad", "ppac_ts", System.currentTimeMillis(), -1, -1, null, jt0Var, "1");
        dt0 g8 = g(str, bVar);
        if (g8 == null) {
            return null;
        }
        try {
            String o10 = g8.o();
            Object m4 = g8.m();
            if (m4 == null) {
                cast = null;
            } else {
                cast = cls.cast(m4);
            }
            if (cast != null) {
                bl0Var.j(System.currentTimeMillis(), g8.s(), g8.t(), o10, jt0Var, "1");
            }
            return cast;
        } catch (ClassCastException e) {
            f9.k.C.f16817h.d("PreloadAdManager.pollAd", e);
            k9.a0.l("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return null;
        }
    }

    public final synchronized dt0 g(String str, z8.b bVar) {
        return (dt0) this.f7213a.get(a(str, bVar));
    }
}

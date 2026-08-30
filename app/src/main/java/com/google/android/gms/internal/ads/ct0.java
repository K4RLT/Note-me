package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import k9.a0;
import k9.c0;
import la.a;
import z8.b;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ct0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5159a;

    /* renamed from: b, reason: collision with root package name */
    public final pt0 f5160b;

    /* renamed from: c, reason: collision with root package name */
    public final bl0 f5161c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f5162d;
    public volatile ConnectivityManager e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f5163f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final a f5164g;

    /* renamed from: h, reason: collision with root package name */
    public AtomicInteger f5165h;
    public final at0 i;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f5166j;

    public ct0(pt0 pt0Var, bl0 bl0Var, Context context, a aVar, at0 at0Var, c0 c0Var) {
        HashMap hashMap = new HashMap();
        this.f5159a = hashMap;
        hashMap.put(b.APP_OPEN_AD, new HashMap());
        hashMap.put(b.INTERSTITIAL, new HashMap());
        hashMap.put(b.REWARDED, new HashMap());
        this.f5160b = pt0Var;
        this.f5161c = bl0Var;
        this.f5162d = context;
        this.f5164g = aVar;
        this.i = at0Var;
        this.f5166j = c0Var;
    }

    public final void a(boolean z3) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f5159a;
        synchronized (hashMap) {
            try {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll(((Map) it.next()).values());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dt0 dt0Var = (dt0) arrayList.get(i);
            if (z3) {
                dt0Var.n();
            } else {
                dt0Var.f5499g.set(false);
            }
        }
    }

    public final Object b(Class cls, String str, b bVar) {
        Object cast;
        bl0 bl0Var = this.f5161c;
        this.f5164g.getClass();
        bl0Var.n("poll_ad", "ppacwe_ts", System.currentTimeMillis(), -1, -1, null, null, "2");
        HashMap hashMap = this.f5159a;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(bVar)) {
                    return null;
                }
                dt0 dt0Var = (dt0) ((Map) hashMap.get(bVar)).get(str);
                if (dt0Var != null && bVar.equals(dt0Var.q())) {
                    hq0 hq0Var = new hq0(dt0Var.r(), 19, dt0Var.q());
                    hq0Var.f6874x = str;
                    jt0 jt0Var = new jt0(hq0Var);
                    bl0Var.n("poll_ad", "ppac_ts", System.currentTimeMillis(), dt0Var.s(), dt0Var.t(), null, jt0Var, "2");
                    try {
                        String o10 = dt0Var.o();
                        Object m4 = dt0Var.m();
                        if (m4 == null) {
                            cast = null;
                        } else {
                            cast = cls.cast(m4);
                        }
                        if (cast != null) {
                            bl0Var.j(System.currentTimeMillis(), dt0Var.s(), dt0Var.t(), o10, jt0Var, "2");
                            return cast;
                        }
                        return cast;
                    } catch (ClassCastException e) {
                        k.C.f16817h.d("PreloadAdManager.pollAd", e);
                        a0.l("Unable to cast ad to the requested type:".concat(cls.getName()), e);
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public final boolean c(b bVar) {
        int i;
        int max;
        HashMap hashMap = this.f5159a;
        if (hashMap.containsKey(bVar)) {
            i = ((Map) hashMap.get(bVar)).size();
        } else {
            i = 0;
        }
        int ordinal = bVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 5) {
                    max = 0;
                } else {
                    max = Math.max(((Integer) r.e.f17698c.a(sl.f10966u5)).intValue(), 1);
                }
            } else {
                max = Math.max(((Integer) r.e.f17698c.a(sl.f10950t5)).intValue(), 1);
            }
        } else {
            max = Math.max(((Integer) r.e.f17698c.a(sl.f10936s5)).intValue(), 1);
        }
        if (i >= max) {
            return false;
        }
        return true;
    }
}

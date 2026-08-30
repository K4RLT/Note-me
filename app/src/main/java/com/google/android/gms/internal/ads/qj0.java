package com.google.android.gms.internal.ads;
import ac.b;
import g9.r;
import la.a;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class qj0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f9853a;

    /* renamed from: b, reason: collision with root package name */
    public final zd1 f9854b;

    /* renamed from: c, reason: collision with root package name */
    public final xs0 f9855c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f9856d = new LinkedHashMap();
    public final boolean e = ((Boolean) r.e.f17698c.a(sl.K7)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    public final ii0 f9857f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9858g;

    /* renamed from: h, reason: collision with root package name */
    public long f9859h;
    public long i;

    public qj0(a aVar, zd1 zd1Var, ii0 ii0Var, xs0 xs0Var) {
        this.f9853a = aVar;
        this.f9854b = zd1Var;
        this.f9857f = ii0Var;
        this.f9855c = xs0Var;
    }

    public final synchronized void a(List list) {
        this.f9853a.getClass();
        this.i = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qp0 qp0Var = (qp0) it.next();
            String str = qp0Var.f9964w;
            if (!TextUtils.isEmpty(str)) {
                this.f9856d.put(qp0Var, new pj0(str, qp0Var.f9934f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void b(wp0 wp0Var, qp0 qp0Var, b bVar, ws0 ws0Var) {
        sp0 sp0Var = (sp0) wp0Var.f12313b.f11471w;
        this.f9853a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = qp0Var.f9964w;
        if (str != null) {
            this.f9856d.put(qp0Var, new pj0(str, qp0Var.f9934f0, 9, 0L, null));
            oj0 oj0Var = new oj0(this, elapsedRealtime, sp0Var, qp0Var, str, ws0Var, wp0Var);
            bVar.a(new t81(bVar, 0, oj0Var), xx.f12657h);
        }
    }

    public final synchronized void c(qp0 qp0Var) {
        pj0 pj0Var = (pj0) this.f9856d.get(qp0Var);
        if (pj0Var != null && !this.f9858g) {
            pj0Var.f9531c = 8;
        }
    }

    public final synchronized String d() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f9856d.entrySet().iterator();
            while (it.hasNext()) {
                pj0 pj0Var = (pj0) ((Map.Entry) it.next()).getValue();
                if (pj0Var.f9531c != Integer.MAX_VALUE) {
                    arrayList.add(pj0Var.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }
}

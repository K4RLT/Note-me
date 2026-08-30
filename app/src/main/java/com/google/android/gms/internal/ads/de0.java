package com.google.android.gms.internal.ads;
import la.a;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class de0 implements lr0 {

    /* renamed from: v, reason: collision with root package name */
    public final zd0 f5407v;

    /* renamed from: w, reason: collision with root package name */
    public final a f5408w;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f5406u = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f5409x = new HashMap();

    public de0(zd0 zd0Var, Set set, a aVar) {
        this.f5407v = zd0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ce0 ce0Var = (ce0) it.next();
            HashMap hashMap = this.f5409x;
            ce0Var.getClass();
            hashMap.put(ir0.RENDERER, ce0Var);
        }
        this.f5408w = aVar;
    }

    public final void a(ir0 ir0Var, boolean z3) {
        String str;
        ce0 ce0Var = (ce0) this.f5409x.get(ir0Var);
        if (ce0Var != null) {
            if (true != z3) {
                str = "f.";
            } else {
                str = "s.";
            }
            ir0 ir0Var2 = ce0Var.f5080b;
            HashMap hashMap = this.f5406u;
            if (hashMap.containsKey(ir0Var2)) {
                this.f5408w.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(ir0Var2)).longValue();
                String str2 = ce0Var.f5079a;
                ConcurrentHashMap concurrentHashMap = this.f5407v.f13137a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime).length() + 2);
                sb2.append(str);
                sb2.append(elapsedRealtime);
                concurrentHashMap.put("label.".concat(str2), sb2.toString());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lr0
    public final void l(ir0 ir0Var, String str, Throwable th) {
        HashMap hashMap = this.f5406u;
        if (hashMap.containsKey(ir0Var)) {
            this.f5408w.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(ir0Var)).longValue();
            this.f5407v.f13137a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.f5409x.containsKey(ir0Var)) {
            a(ir0Var, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.lr0
    public final void t(ir0 ir0Var, String str) {
        this.f5408w.getClass();
        this.f5406u.put(ir0Var, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.lr0
    public final void z(ir0 ir0Var, String str) {
        HashMap hashMap = this.f5406u;
        if (hashMap.containsKey(ir0Var)) {
            this.f5408w.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(ir0Var)).longValue();
            this.f5407v.f13137a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.f5409x.containsKey(ir0Var)) {
            a(ir0Var, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.lr0
    public final void k(String str) {
    }
}

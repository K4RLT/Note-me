package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ge0 {
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final fe0 f6384f;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6381b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f6382c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6383d = false;

    /* renamed from: a, reason: collision with root package name */
    public final k9.c0 f6380a = f9.k.C.f16817h.g();

    public ge0(fe0 fe0Var, String str) {
        this.e = str;
        this.f6384f = fe0Var;
    }

    public final synchronized void a(String str) {
        if (!((Boolean) g9.r.e.f17698c.a(sl.G2)).booleanValue()) {
            return;
        }
        HashMap e = e();
        e.put("action", "adapter_init_started");
        e.put("ancn", str);
        this.f6381b.add(e);
    }

    public final synchronized void b(String str) {
        if (!((Boolean) g9.r.e.f17698c.a(sl.G2)).booleanValue()) {
            return;
        }
        HashMap e = e();
        e.put("action", "adapter_init_finished");
        e.put("ancn", str);
        this.f6381b.add(e);
    }

    public final synchronized void c(String str, String str2) {
        if (!((Boolean) g9.r.e.f17698c.a(sl.G2)).booleanValue()) {
            return;
        }
        HashMap e = e();
        e.put("action", "adapter_init_finished");
        e.put("ancn", str);
        e.put("rqe", str2);
        this.f6381b.add(e);
    }

    public final synchronized void d() {
        if (((Boolean) g9.r.e.f17698c.a(sl.G2)).booleanValue() && !this.f6382c) {
            HashMap e = e();
            e.put("action", "init_started");
            this.f6381b.add(e);
            this.f6382c = true;
        }
    }

    public final HashMap e() {
        String str;
        fe0 fe0Var = this.f6384f;
        fe0Var.getClass();
        HashMap hashMap = new HashMap(fe0Var.f6045a);
        f9.k.C.f16819k.getClass();
        hashMap.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        if (this.f6380a.t()) {
            str = "";
        } else {
            str = this.e;
        }
        hashMap.put("tid", str);
        return hashMap;
    }
}

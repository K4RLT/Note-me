package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class p50 implements m80, k70 {

    /* renamed from: u, reason: collision with root package name */
    public final la.a f9403u;

    /* renamed from: v, reason: collision with root package name */
    public final q50 f9404v;

    /* renamed from: w, reason: collision with root package name */
    public final aq0 f9405w;

    /* renamed from: x, reason: collision with root package name */
    public final String f9406x;

    public p50(la.a aVar, q50 q50Var, aq0 aq0Var, String str) {
        this.f9403u = aVar;
        this.f9404v = q50Var;
        this.f9405w = aq0Var;
        this.f9406x = str;
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final void e() {
        this.f9403u.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.f9405w.f4583g;
        q50 q50Var = this.f9404v;
        ConcurrentHashMap concurrentHashMap = q50Var.f9756c;
        String str2 = this.f9406x;
        Long l10 = (Long) concurrentHashMap.get(str2);
        if (l10 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        q50Var.f9757d.put(str, Long.valueOf(elapsedRealtime - l10.longValue()));
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void l() {
        this.f9403u.getClass();
        this.f9404v.f9756c.put(this.f9406x, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}

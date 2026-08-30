package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class em0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5719a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5720b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5721c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5722d;
    public final n50 e;

    /* renamed from: f, reason: collision with root package name */
    public final lq0 f5723f;

    /* renamed from: g, reason: collision with root package name */
    public final aq0 f5724g;

    /* renamed from: h, reason: collision with root package name */
    public final k9.c0 f5725h = f9.k.C.f16817h.g();
    public final zd0 i;

    /* renamed from: j, reason: collision with root package name */
    public final q50 f5726j;

    public em0(Context context, String str, String str2, n50 n50Var, lq0 lq0Var, aq0 aq0Var, zd0 zd0Var, q50 q50Var, long j10) {
        this.f5719a = context;
        this.f5720b = str;
        this.f5721c = str2;
        this.e = n50Var;
        this.f5723f = lq0Var;
        this.f5724g = aq0Var;
        this.i = zd0Var;
        this.f5726j = q50Var;
        this.f5722d = j10;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final ac.b zza() {
        String str;
        Bundle bundle = new Bundle();
        zd0 zd0Var = this.i;
        ConcurrentHashMap concurrentHashMap = zd0Var.f13137a;
        String str2 = this.f5720b;
        concurrentHashMap.put("seq_num", str2);
        if (((Boolean) g9.r.e.f17698c.a(sl.J2)).booleanValue()) {
            f9.k.C.f16819k.getClass();
            zd0Var.b("tsacc", String.valueOf(System.currentTimeMillis() - this.f5722d));
            if (true != k9.f0.g(this.f5719a)) {
                str = "1";
            } else {
                str = "0";
            }
            zd0Var.b("foreground", str);
        }
        n50 n50Var = this.e;
        aq0 aq0Var = this.f5724g;
        g9.z2 z2Var = aq0Var.f4581d;
        lx lxVar = n50Var.f8547v;
        synchronized (lxVar.f8169d) {
            lxVar.f8166a.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            lxVar.f8173j = elapsedRealtime;
            sx sxVar = lxVar.f8167b;
            synchronized (sxVar.f11183u) {
                sxVar.f11186x.a(z2Var, elapsedRealtime);
            }
        }
        bundle.putAll(this.f5723f.b());
        return ed1.e(new fm0(this.f5719a, bundle, str2, this.f5721c, this.f5725h, aq0Var.f4583g, this.f5726j));
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        return 12;
    }
}

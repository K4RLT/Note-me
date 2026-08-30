package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class wq implements mp {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f12314u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ cr f12315v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uq f12316w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dr f12317x;

    public wq(dr drVar, long j10, cr crVar, uq uqVar) {
        this.f12314u = j10;
        this.f12315v = crVar;
        this.f12316w = uqVar;
        this.f12317x = drVar;
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final void d(Object obj, Map map) {
        f9.k.C.f16819k.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.f12314u;
        StringBuilder sb2 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 42);
        sb2.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb2.append(currentTimeMillis);
        sb2.append(" ms.");
        k9.a0.k(sb2.toString());
        k9.a0.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        dr drVar = this.f12317x;
        synchronized (drVar.f5484c) {
            k9.a0.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            cr crVar = this.f12315v;
            if (((AtomicInteger) crVar.f3469c).get() != -1 && ((AtomicInteger) crVar.f3469c).get() != 1) {
                drVar.f5483b = 0;
                uq uqVar = this.f12316w;
                uqVar.l("/log", lp.f8078c);
                uqVar.l("/result", lp.f8083j);
                ((yx) crVar.f3468b).b(uqVar);
                drVar.f5487g = crVar;
                k9.a0.k("Successfully loaded JS Engine.");
                k9.a0.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            k9.a0.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}

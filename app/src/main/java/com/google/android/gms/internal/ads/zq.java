package com.google.android.gms.internal.ads;
import a0.k;
import g9.r;
import k9.a0;
import r.e;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zq implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13248u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ dr f13249v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cr f13250w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ uq f13251x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f13252y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f13253z;

    public /* synthetic */ zq(dr drVar, cr crVar, uq uqVar, ArrayList arrayList, long j10, int i) {
        this.f13248u = i;
        this.f13250w = crVar;
        this.f13251x = uqVar;
        this.f13252y = arrayList;
        this.f13253z = j10;
        this.f13249v = drVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        switch (this.f13248u) {
            case 0:
                k9.a0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
                dr drVar = this.f13249v;
                synchronized (drVar.f5484c) {
                    try {
                        k9.a0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                        cr crVar = this.f13250w;
                        if (((AtomicInteger) crVar.f3469c).get() != -1 && ((AtomicInteger) crVar.f3469c).get() != 1) {
                            nl nlVar = sl.C8;
                            g9.r rVar = g9.r.e;
                            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                                crVar.k("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                            } else {
                                crVar.j();
                            }
                            xx.f12655f.execute(new yq(this.f13251x, 0));
                            String valueOf = String.valueOf(rVar.f17698c.a(sl.e));
                            int i = ((AtomicInteger) crVar.f3469c).get();
                            int i10 = drVar.f5483b;
                            ArrayList arrayList = this.f13252y;
                            if (arrayList.isEmpty()) {
                                sb2 = ". Still waiting for the engine to be loaded";
                            } else {
                                String valueOf2 = String.valueOf(arrayList.get(0));
                                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 88);
                                sb3.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                                sb3.append(valueOf2);
                                sb2 = sb3.toString();
                            }
                            f9.k.C.f16819k.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - this.f13253z;
                            StringBuilder sb4 = new StringBuilder(valueOf.length() + FacebookMediationAdapter.ERROR_NULL_CONTEXT + String.valueOf(i).length() + 36 + String.valueOf(i10).length() + sb2.length() + 39 + String.valueOf(currentTimeMillis).length() + 26);
                            sb4.append("Could not finish the full JS engine loading in ");
                            sb4.append(valueOf);
                            sb4.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                            sb4.append(i);
                            sb4.append(". Update status(fullLoadTimeout) is ");
                            sb4.append(i10);
                            sb4.append(sb2);
                            sb4.append(" ms. Total latency(fullLoadTimeout) is ");
                            sb4.append(currentTimeMillis);
                            sb4.append(" ms at timeout. Rejecting.");
                            k9.a0.k(sb4.toString());
                            k9.a0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                            return;
                        }
                        k9.a0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
            default:
                dr drVar2 = this.f13249v;
                cr crVar2 = this.f13250w;
                uq uqVar = this.f13251x;
                ArrayList arrayList2 = this.f13252y;
                long j10 = this.f13253z;
                k9.a0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                synchronized (drVar2.f5484c) {
                    try {
                        k9.a0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                        if (((AtomicInteger) crVar2.f3469c).get() != -1 && ((AtomicInteger) crVar2.f3469c).get() != 1) {
                            nl nlVar2 = sl.C8;
                            g9.r rVar2 = g9.r.e;
                            if (((Boolean) rVar2.f17698c.a(nlVar2)).booleanValue()) {
                                crVar2.k("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                            } else {
                                crVar2.j();
                            }
                            xx.f12655f.execute(new yq(uqVar, 1));
                            String valueOf3 = String.valueOf(rVar2.f17698c.a(sl.f10691d));
                            int i11 = ((AtomicInteger) crVar2.f3469c).get();
                            int i12 = drVar2.f5483b;
                            String valueOf4 = String.valueOf(arrayList2.get(0));
                            f9.k.C.f16819k.getClass();
                            long currentTimeMillis2 = System.currentTimeMillis() - j10;
                            StringBuilder sb5 = new StringBuilder(valueOf3.length() + 94 + String.valueOf(i11).length() + 39 + String.valueOf(i12).length() + 57 + valueOf4.length() + 42 + String.valueOf(currentTimeMillis2).length() + 15);
                            sb5.append("Could not receive /jsLoaded in ");
                            sb5.append(valueOf3);
                            sb5.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                            sb5.append(i11);
                            sb5.append(". Update status(onEngLoadedTimeout) is ");
                            sb5.append(i12);
                            sb5.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                            sb5.append(valueOf4);
                            sb5.append(" ms. Total latency(onEngLoadedTimeout) is ");
                            sb5.append(currentTimeMillis2);
                            sb5.append(" ms. Rejecting.");
                            k9.a0.k(sb5.toString());
                            k9.a0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                            return;
                        }
                        k9.a0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
        }
    }
}

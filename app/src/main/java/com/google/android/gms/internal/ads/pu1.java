package com.google.android.gms.internal.ads;
import b.b;
import ba.j;
import c7.a;
import c7.a0;
import c7.v;
import d1.c;
import de.b;
import de.l;
import eb.d;
import eb.d0;
import eb.d1;
import eb.k3;
import eb.l;
import eb.l1;
import eb.l3;
import eb.m;
import eb.n2;
import eb.o1;
import eb.o2;
import eb.q0;
import eb.r2;
import eb.t1;
import eb.u;
import f3.j;
import f9.k;
import fa.y;
import g5.d0;
import ib.d;
import ib.f;
import ib.h;
import ib.k;
import ib.l;
import ib.o;
import j6.l;
import k9.c;
import k9.g;
import k9.j;
import lb.c1;
import lb.f0;
import lb.h1;
import lb.j1;
import lb.k0;
import lb.k1;
import lb.l0;
import lb.o1;
import lb.s;
import lb.t0;
import lb.t1;
import lb.z0;
import m.b;
import mb.e;
import pb.b;
import pb.d;
import pe.z;
import qb.c;
import qb.d;
import qb.l;
import qb.p;
import ra.d;
import ra.e;
import s9.a;
import xf.b;
import xf.e;
import y9.b;
import za.a;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.AudioDeviceInfo;
import android.media.metrics.TrackChangeEvent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class pu1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9614u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f9615v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f9616w;

    public pu1(com.google.android.gms.internal.mlkit_vision_digital_ink.wl wlVar, Runnable runnable) {
        this.f9614u = 5;
        Objects.requireNonNull(wlVar);
        this.f9616w = wlVar;
        this.f9615v = runnable;
    }

    private final void a() {
        qb.l lVar = (qb.l) this.f9615v;
        Runnable runnable = (Runnable) this.f9616w;
        if (lVar.f23655k == null && !lVar.f23651f) {
            if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                Log.i("ServiceConnMgrImpl", "Initiate binding to the service.");
            }
            ArrayList arrayList = lVar.f23650d;
            synchronized (arrayList) {
                arrayList.add(runnable);
            }
            c7.a0 a0Var = new c7.a0(3, lVar);
            lVar.f23654j = a0Var;
            lVar.f23651f = true;
            if (!lVar.f23648b.bindService(lVar.f23652g, a0Var, 65)) {
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    Log.i("ServiceConnMgrImpl", "Failed to bind to the service.");
                }
                lVar.f23651f = false;
                ArrayList arrayList2 = lVar.f23650d;
                synchronized (arrayList2) {
                    arrayList2.clear();
                }
                return;
            }
            return;
        }
        if (lVar.f23651f) {
            if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                Log.i("ServiceConnMgrImpl", "Waiting to bind to the service.");
            }
            ArrayList arrayList3 = lVar.f23650d;
            synchronized (arrayList3) {
                arrayList3.add(runnable);
            }
            return;
        }
        runnable.run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        pu puVar;
        zb1 zb1Var;
        String str;
        String str2;
        int i = 3;
        boolean z3 = true;
        int i10 = 0;
        switch (this.f9614u) {
            case 0:
                ((su1) this.f9615v).f11172x.reportTrackChangeEvent((TrackChangeEvent) this.f9616w);
                return;
            case 1:
                mu muVar = (mu) this.f9615v;
                gs1 gs1Var = (gs1) this.f9616w;
                muVar.getClass();
                String str3 = bq0.f4860a;
                ((rs1) muVar.f8423w).f10282u.X.k(gs1Var);
                return;
            case 2:
                na1 na1Var = (na1) this.f9615v;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f9616w;
                if (((qv1) na1Var.e) != null && (puVar = (pu) ((com.google.android.gms.internal.mlkit_vision_digital_ink.lw) ((bl0) na1Var.f8631c).f4819v).f14648z) != null && !audioDeviceInfo.equals((AudioDeviceInfo) puVar.D)) {
                    puVar.D = audioDeviceInfo;
                    Context context = puVar.f9606u;
                    l50 l50Var = (l50) puVar.E;
                    List j10 = puVar.j();
                    y51 y51Var = vu1.e;
                    puVar.k(vu1.a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), l50Var, audioDeviceInfo, j10));
                    return;
                }
                return;
            case 3:
                ((zb0) this.f9615v).mo213l(this.f9616w);
                return;
            case 4:
                ((com.google.android.gms.internal.mlkit_vision_digital_ink.ha) this.f9615v).v((com.google.android.gms.internal.mlkit_vision_digital_ink.ya) this.f9616w);
                return;
            case 5:
                com.google.android.gms.internal.mlkit_vision_digital_ink.wl wlVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.wl) this.f9616w;
                try {
                    ((Runnable) this.f9615v).run();
                    return;
                } finally {
                    com.google.android.gms.internal.mlkit_vision_digital_ink.wl.a(wlVar);
                }
            case 6:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f9615v;
                while (!((Set) this.f9616w).isEmpty()) {
                    try {
                        de.l lVar = (de.l) referenceQueue.remove();
                        if (lVar.f15852a.remove(lVar)) {
                            lVar.clear();
                            lVar.f15853b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 7:
                d dVar = (d) this.f9615v;
                AtomicReference atomicReference = (AtomicReference) dVar.f5232x;
                if (((Thread) atomicReference.getAndSet(Thread.currentThread())) != null) {
                    z3 = false;
                }
                fa.y.k(z3);
                try {
                    ((Runnable) this.f9616w).run();
                    atomicReference.set(null);
                    dVar.k();
                    return;
                } finally {
                }
            case 8:
                ((eb.l1) this.f9615v).k();
                if (de.b.b()) {
                    ((eb.l1) this.f9615v).h().D(this);
                    return;
                }
                if (((eb.l) this.f9616w).f16220c == 0) {
                    z3 = false;
                }
                ((eb.l) this.f9616w).f16220c = 0L;
                if (z3) {
                    ((eb.l) this.f9616w).c();
                    return;
                }
                return;
            case 9:
                eb.n2 p10 = ((AppMeasurementDynamiteService) this.f9616w).f15571u.p();
                com.google.android.gms.internal.measurement.t0 t0Var = (com.google.android.gms.internal.measurement.t0) this.f9615v;
                p10.u();
                p10.y();
                p10.D(new ba.j(p10, p10.P(false), t0Var, 18, false));
                return;
            case 10:
                eb.t1 t1Var = ((AppMeasurementDynamiteService) this.f9616w).f15571u.J;
                eb.d1.c(t1Var);
                com.google.android.gms.internal.mlkit_vision_digital_ink.iw iwVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.iw) this.f9615v;
                t1Var.u();
                t1Var.y();
                com.google.android.gms.internal.mlkit_vision_digital_ink.iw iwVar2 = t1Var.f16375y;
                if (iwVar != iwVar2) {
                    if (iwVar2 != null) {
                        z3 = false;
                    }
                    fa.y.j("EventInterceptor already set.", z3);
                }
                t1Var.f16375y = iwVar;
                return;
            case 11:
                eb.t1 t1Var2 = (eb.t1) this.f9616w;
                Bundle bundle = (Bundle) this.f9615v;
                t1Var2.u();
                t1Var2.y();
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                fa.y.e(string);
                fa.y.e(string2);
                fa.y.h(bundle.get("value"));
                eb.d1 d1Var = (eb.d1) t1Var2.f3443v;
                if (!d1Var.e()) {
                    t1Var2.f().I.g("Conditional property not set since app measurement is disabled");
                    return;
                }
                eb.k3 k3Var = new eb.k3(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                try {
                    eb.l3 t3 = t1Var2.t();
                    bundle.getString("app_id");
                    eb.u H = t3.H(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true);
                    eb.l3 t10 = t1Var2.t();
                    bundle.getString("app_id");
                    eb.u H2 = t10.H(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true);
                    eb.l3 t11 = t1Var2.t();
                    bundle.getString("app_id");
                    d1Var.p().B(new eb.d(bundle.getString("app_id"), string2, k3Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), H2, bundle.getLong("trigger_timeout"), H, bundle.getLong("time_to_live"), t11.H(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
            case 12:
                eb.t1 t1Var3 = (eb.t1) this.f9616w;
                eb.d1 d1Var2 = (eb.d1) t1Var3.f3443v;
                eb.q0 s10 = t1Var3.s();
                eb.m mVar = (eb.m) this.f9615v;
                s10.u();
                s10.u();
                eb.m b10 = eb.m.b(s10.D().getString("dma_consent_settings", null));
                int i11 = mVar.f16229a;
                if (eb.o1.h(i11, b10.f16229a)) {
                    SharedPreferences.Editor edit = s10.D().edit();
                    edit.putString("dma_consent_settings", mVar.f16230b);
                    edit.apply();
                    t1Var3.f().I.f(mVar, "Setting DMA consent(FE)");
                    eb.n2 p11 = d1Var2.p();
                    p11.u();
                    p11.y();
                    if (!p11.L() || p11.t().B0() >= 241200) {
                        eb.n2 p12 = d1Var2.p();
                        p12.u();
                        p12.y();
                        eb.o2 o2Var = new eb.o2(i10);
                        o2Var.f16287v = p12;
                        p12.D(o2Var);
                        return;
                    }
                    d1Var2.p().F(false);
                    return;
                }
                t1Var3.f().G.f(Integer.valueOf(i11), "Lower precedence consent source ignored, proposed source");
                return;
            case 13:
                synchronized (((eb.r2) this.f9616w)) {
                    try {
                        ((eb.r2) this.f9616w).f16353u = false;
                        if (!((eb.r2) this.f9616w).f16355w.I()) {
                            ((eb.r2) this.f9616w).f16355w.f().H.g("Connected to remote service");
                            eb.n2 n2Var = ((eb.r2) this.f9616w).f16355w;
                            eb.d0 d0Var = (eb.d0) this.f9615v;
                            n2Var.u();
                            n2Var.f16280y = d0Var;
                            n2Var.O();
                            n2Var.M();
                        }
                    } finally {
                    }
                }
                return;
            case 14:
                be0 be0Var = (be0) this.f9615v;
                Long l10 = (Long) this.f9616w;
                f9.k.C.f16819k.getClass();
                f3.j(be0Var, "cld_r", SystemClock.elapsedRealtime() - l10.longValue());
                return;
            case 15:
                boolean z9 = ((ib.o) this.f9615v).f18384d;
                ib.k kVar = (ib.k) this.f9616w;
                if (z9) {
                    kVar.f18375x.q();
                    return;
                }
                try {
                    ((ib.k) this.f9616w).f18375x.p(kVar.f18374w.g((ib.o) this.f9615v));
                    return;
                } catch (ib.f e) {
                    boolean z10 = e.getCause() instanceof Exception;
                    ib.o oVar = ((ib.k) this.f9616w).f18375x;
                    if (z10) {
                        oVar.o((Exception) e.getCause());
                        return;
                    } else {
                        oVar.o(e);
                        return;
                    }
                } catch (Exception e8) {
                    ((ib.k) this.f9616w).f18375x.o(e8);
                    return;
                }
            case 16:
                synchronized (((ib.l) this.f9616w).f18378w) {
                    try {
                        ib.d dVar2 = (ib.d) ((ib.l) this.f9616w).f18379x;
                        if (dVar2 != null) {
                            Exception i12 = ((ib.o) this.f9615v).i();
                            fa.y.h(i12);
                            dVar2.w(i12);
                        }
                    } finally {
                    }
                }
                return;
            case 17:
                ib.o oVar2 = (ib.o) this.f9615v;
                try {
                    oVar2.p(((Callable) this.f9616w).call());
                    return;
                } catch (Exception e10) {
                    oVar2.o(e10);
                    return;
                } catch (Throwable th) {
                    oVar2.o(new RuntimeException(th));
                    return;
                }
            case 18:
                try {
                    ((Runnable) this.f9616w).run();
                    synchronized (((g5.d0) this.f9615v).f17432y) {
                        ((g5.d0) this.f9615v).a();
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (((g5.d0) this.f9615v).f17432y) {
                        ((g5.d0) this.f9615v).a();
                        throw th2;
                    }
                }
            case 19:
                k9.g gVar = (k9.g) this.f9615v;
                wx wxVar = (wx) this.f9616w;
                f9.k kVar2 = f9.k.C;
                k9.j jVar = kVar2.f16823o;
                Context context2 = gVar.f19686a;
                if (!jVar.b(context2, gVar.f19689d, gVar.e)) {
                    kVar2.f16823o.c(context2, gVar.f19689d, gVar.e);
                    return;
                } else {
                    wxVar.execute(new k9.c(gVar, i));
                    return;
                }
            case 20:
                lb.s sVar = (lb.s) this.f9615v;
                Bundle bundle2 = (Bundle) this.f9616w;
                lb.t0 t0Var2 = sVar.f20263g;
                t0Var2.getClass();
                if (((Boolean) t0Var2.b(new j6.l(t0Var2, 16, bundle2))).booleanValue()) {
                    lb.l0 l0Var = sVar.f20264h;
                    mb.e eVar = l0Var.f20191j;
                    c7.a aVar = lb.l0.f20183k;
                    aVar.a("Run extractor loop", new Object[0]);
                    AtomicBoolean atomicBoolean = l0Var.i;
                    if (!atomicBoolean.compareAndSet(false, true)) {
                        aVar.g("runLoop already looping; return", new Object[0]);
                        return;
                    }
                    while (true) {
                        try {
                            zb1Var = l0Var.f20190h.a();
                        } catch (lb.k0 e11) {
                            int i13 = e11.f20175u;
                            aVar.c("Error while getting next extraction task: %s", e11.getMessage());
                            if (i13 >= 0) {
                                ((lb.t1) eVar.b()).b(i13);
                                l0Var.a(i13, e11);
                            }
                            zb1Var = null;
                        }
                        if (zb1Var != null) {
                            try {
                                if (zb1Var instanceof lb.f0) {
                                    l0Var.f20185b.a((lb.f0) zb1Var);
                                } else if (zb1Var instanceof lb.o1) {
                                    l0Var.f20186c.a((lb.o1) zb1Var);
                                } else if (zb1Var instanceof lb.z0) {
                                    l0Var.f20187d.a((lb.z0) zb1Var);
                                } else if (zb1Var instanceof lb.c1) {
                                    l0Var.e.a((lb.c1) zb1Var);
                                } else if (zb1Var instanceof lb.h1) {
                                    l0Var.f20188f.a((lb.h1) zb1Var);
                                } else if (zb1Var instanceof lb.j1) {
                                    l0Var.f20189g.a((lb.j1) zb1Var);
                                } else {
                                    aVar.c("Unknown task type: %s", zb1Var.getClass().getName());
                                }
                            } catch (Exception e12) {
                                aVar.c("Error during extraction task: %s", e12.getMessage());
                                ((lb.t1) eVar.b()).b(zb1Var.f13134u);
                                l0Var.a(zb1Var.f13134u, e12);
                            }
                        } else {
                            atomicBoolean.set(false);
                            return;
                        }
                    }
                } else {
                    return;
                }
            case gl.zzm /* 21 */:
                lb.k1 k1Var = (lb.k1) this.f9615v;
                lb.j1 j1Var = (lb.j1) this.f9616w;
                k1Var.f20176a.a((String) j1Var.f13135v, j1Var.f20172y, j1Var.f20171x);
                return;
            case 22:
                ((c7.v) this.f9615v).accept(this.f9616w);
                return;
            case 23:
                ((qb.d) ((qb.c) this.f9615v).f23625x).f23628c.remove((String) this.f9616w);
                return;
            case 24:
                a();
                return;
            case 25:
                qb.p pVar = (qb.p) this.f9615v;
                Bundle bundle3 = (Bundle) this.f9616w;
                try {
                    qb.l lVar2 = pVar.f23665a;
                    if (lVar2 != null) {
                        pb.d dVar3 = (pb.d) lVar2.f23655k;
                        if (dVar3 != null) {
                            pb.b bVar = (pb.b) dVar3;
                            Parcel o12 = bVar.o1();
                            int i14 = za.a.f32013a;
                            o12.writeInt(1);
                            bundle3.writeToParcel(o12, 0);
                            bVar.z1(o12, 3);
                            return;
                        }
                        return;
                    }
                    throw null;
                } catch (RemoteException e13) {
                    Log.e("HpoaClientImpl", "Failed to call hpoaService.endSession", e13);
                    return;
                }
            case 26:
                ra.e eVar2 = (ra.e) this.f9615v;
                ib.h hVar = (ib.h) this.f9616w;
                Context context3 = (Context) eVar2.f24675v;
                String string3 = ra.e.D(context3).getString("app_set_id", null);
                long j11 = -1;
                long j12 = ra.e.D(context3).getLong("app_set_id_last_used_time", -1L);
                if (j12 != -1) {
                    j11 = j12 + 33696000000L;
                }
                if (string3 != null && System.currentTimeMillis() <= j11) {
                    try {
                        ra.e.E(context3);
                    } catch (ra.d e14) {
                        hVar.a(e14);
                        return;
                    }
                } else {
                    string3 = UUID.randomUUID().toString();
                    try {
                        if (!context3.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string3).commit()) {
                            String valueOf = String.valueOf(context3.getPackageName());
                            if (valueOf.length() != 0) {
                                str2 = "Failed to store app set ID generated for App ".concat(valueOf);
                            } else {
                                str2 = new String("Failed to store app set ID generated for App ");
                            }
                            Log.e("AppSet", str2);
                            throw new Exception("Failed to store the app set ID.");
                        }
                        ra.e.E(context3);
                        if (!context3.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context3.getPackageName());
                            if (valueOf2.length() != 0) {
                                str = "Failed to store app set ID creation time for App ".concat(valueOf2);
                            } else {
                                str = new String("Failed to store app set ID creation time for App ");
                            }
                            Log.e("AppSet", str);
                            throw new Exception("Failed to store the app set ID creation time.");
                        }
                    } catch (ra.d e15) {
                        hVar.a(e15);
                        return;
                    }
                }
                hVar.b(new y9.b(string3, 1));
                return;
            case 27:
                ((s9.a) ((em) this.f9615v).f5718c).f25037b.evaluateJavascript((String) this.f9616w, null);
                return;
            default:
                ((xf.e) this.f9615v).g((xf.b) this.f9616w, pe.z.f22715a);
                return;
        }
    }

    public /* synthetic */ pu1(com.google.android.gms.internal.mlkit_vision_digital_ink.ha haVar, int i, com.google.android.gms.internal.mlkit_vision_digital_ink.ya yaVar) {
        this.f9614u = 4;
        this.f9615v = haVar;
        this.f9616w = yaVar;
    }

    public /* synthetic */ pu1(Object obj, int i, Object obj2) {
        this.f9614u = i;
        this.f9615v = obj;
        this.f9616w = obj2;
    }

    public /* synthetic */ pu1(int i, Object obj, Object obj2, boolean z3) {
        this.f9614u = i;
        this.f9615v = obj2;
        this.f9616w = obj;
    }
}

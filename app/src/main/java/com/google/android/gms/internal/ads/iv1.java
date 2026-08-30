package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class iv1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7235u;

    /* renamed from: v, reason: collision with root package name */
    public Object f7236v;

    /* renamed from: w, reason: collision with root package name */
    public Object f7237w;

    public iv1(oa oaVar, com.google.android.gms.internal.measurement.i0 i0Var, oa oaVar2) {
        this.f7235u = 7;
        this.f7236v = i0Var;
        this.f7237w = oaVar;
    }

    private final void a() {
        IInterface iInterface;
        c7.a0 a0Var = (c7.a0) this.f7236v;
        qb.l lVar = (qb.l) a0Var.f3898v;
        lVar.f23655k = (IInterface) lVar.f23653h.d((IBinder) this.f7237w);
        Log.i("ServiceConnMgrImpl", "notifyOnConnected");
        Iterator it = lVar.e.iterator();
        while (it.hasNext()) {
            ((qb.d) it.next()).getClass();
            Log.i("HsdpClientImpl", "HSDP bound service connected");
        }
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "linkToDeath");
        }
        int i = 0;
        try {
            iInterface = lVar.f23655k;
        } catch (RemoteException e) {
            Log.e("ServiceConnMgrImpl", "linkToDeath failed", e);
        }
        if (iInterface != null) {
            iInterface.asBinder().linkToDeath(lVar.i, 0);
            qb.l lVar2 = (qb.l) a0Var.f3898v;
            lVar2.f23651f = false;
            synchronized (lVar2.f23650d) {
                try {
                    ArrayList arrayList = lVar2.f23650d;
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Runnable) obj).run();
                    }
                    lVar2.f23650d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw null;
    }

    private final void b() {
        s9.i iVar = (s9.i) this.f7236v;
        rc0 rc0Var = ((rc0[]) this.f7237w)[0];
        if (rc0Var != null) {
            jq0 jq0Var = iVar.f25074z;
            v81 e = ed1.e(rc0Var);
            synchronized (jq0Var) {
                jq0Var.f7509a.addFirst(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, ac.b] */
    @Override // java.lang.Runnable
    public final void run() {
        a3 r2Var;
        fa.i iVar;
        cq0 cq0Var;
        boolean z3 = false;
        int i = 1;
        switch (this.f7235u) {
            case 0:
                mu muVar = (mu) this.f7236v;
                synchronized (((hs1) this.f7237w)) {
                }
                String str = bq0.f4860a;
                ku1 ku1Var = ((rs1) muVar.f8423w).f10282u.L;
                ku1Var.p(ku1Var.t((yx1) ku1Var.f7884d.e), 1013, new iu1(22));
                return;
            case 1:
                b2.d1 d1Var = (b2.d1) this.f7236v;
                ou1 ou1Var = (ou1) this.f7237w;
                ((uw1) d1Var.f1434y).e();
                qw1 qw1Var = (qw1) d1Var.f1433x;
                synchronized (qw1Var.f9998a) {
                    qw1Var.b();
                    ou1Var.run();
                }
                return;
            case 2:
                my1 my1Var = (my1) this.f7236v;
                a3 a3Var = (a3) this.f7237w;
                if (my1Var.K == null) {
                    r2Var = a3Var;
                } else {
                    r2Var = new r2(-9223372036854775807L, 0L);
                }
                my1Var.T = r2Var;
                my1Var.U = a3Var.zza();
                if (!my1Var.f8485b0 && a3Var.zza() == -9223372036854775807L) {
                    z3 = true;
                }
                my1Var.V = z3;
                if (true == z3) {
                    i = 7;
                }
                my1Var.W = i;
                if (my1Var.P) {
                    my1Var.f8497z.s(my1Var.U, a3Var, z3);
                    return;
                } else {
                    my1Var.q();
                    return;
                }
            case 3:
                com.google.android.gms.internal.mlkit_vision_digital_ink.ya yaVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.ya) this.f7236v;
                com.google.android.gms.internal.mlkit_vision_digital_ink.n9 n9Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.n9) this.f7237w;
                if (yaVar instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.n9) {
                    ((com.google.android.gms.internal.mlkit_vision_digital_ink.n9) yaVar).l(n9Var);
                } else if (yaVar != null && yaVar.isCancelled() && n9Var != null) {
                    n9Var.cancel(false);
                }
                this.f7236v = null;
                this.f7237w = null;
                return;
            case 4:
                ib.h hVar = (ib.h) this.f7236v;
                try {
                    hVar.b(((com.google.android.gms.internal.mlkit_vision_digital_ink.ya) this.f7237w).get());
                    return;
                } catch (Throwable th) {
                    hVar.a(new Exception(th));
                    return;
                }
            case 5:
                Callable callable = (Callable) this.f7236v;
                ib.h hVar2 = (ib.h) this.f7237w;
                try {
                    hVar2.b(callable.call());
                    return;
                } catch (zd.a e) {
                    hVar2.a(e);
                    return;
                } catch (Exception e8) {
                    hVar2.a(new zd.a("Internal error has occurred when executing ML Kit tasks", e8));
                    return;
                }
            case 6:
                ca.b bVar = (ca.b) this.f7236v;
                c0.z zVar = (c0.z) this.f7237w;
                da.c cVar = (da.c) zVar.f3437v;
                ea.l lVar = (ea.l) ((ea.d) zVar.f3441z).D.get((ea.a) zVar.f3438w);
                if (lVar != null) {
                    if (bVar.f4022v == 0) {
                        zVar.f3436u = true;
                        if (cVar.l()) {
                            if (zVar.f3436u && (iVar = (fa.i) zVar.f3439x) != null) {
                                cVar.c(iVar, (Set) zVar.f3440y);
                                return;
                            }
                            return;
                        }
                        try {
                            cVar.c(null, cVar.b());
                            return;
                        } catch (SecurityException e10) {
                            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                            cVar.d("Failed to get service from broker.");
                            lVar.l(new ca.b(10, null, null), null);
                            return;
                        }
                    }
                    lVar.l(bVar, null);
                    return;
                }
                return;
            case 7:
                oa oaVar = (oa) this.f7237w;
                eb.t0 t0Var = (eb.t0) oaVar.f9049w;
                String str2 = (String) oaVar.f9048v;
                com.google.android.gms.internal.measurement.i0 i0Var = (com.google.android.gms.internal.measurement.i0) this.f7236v;
                eb.d1 d1Var2 = t0Var.f16373b;
                eb.y0 y0Var = d1Var2.D;
                eb.k0 k0Var = d1Var2.C;
                eb.d1.d(y0Var);
                y0Var.u();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", str2);
                try {
                    com.google.android.gms.internal.measurement.k0 k0Var2 = (com.google.android.gms.internal.measurement.k0) i0Var;
                    Parcel g02 = k0Var2.g0();
                    com.google.android.gms.internal.measurement.f0.c(g02, bundle);
                    Parcel t12 = k0Var2.t1(g02, 1);
                    Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.f0.a(t12, Bundle.CREATOR);
                    t12.recycle();
                    if (bundle2 == null) {
                        eb.d1.d(k0Var);
                        k0Var.A.g("Install Referrer Service returned a null response");
                    }
                } catch (Exception e11) {
                    eb.d1.d(k0Var);
                    k0Var.A.f(e11.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                eb.y0 y0Var2 = d1Var2.D;
                eb.d1.d(y0Var2);
                y0Var2.u();
                throw new IllegalStateException("Unexpected call on client side");
            case 8:
                eb.h3 h3Var = ((eb.f1) this.f7237w).f16128u;
                h3Var.Z();
                eb.d dVar = (eb.d) this.f7236v;
                if (dVar.f16095w.zza() == null) {
                    h3Var.getClass();
                    String str3 = dVar.f16093u;
                    fa.y.h(str3);
                    eb.o3 L = h3Var.L(str3);
                    if (L != null) {
                        h3Var.p(dVar, L);
                        return;
                    }
                    return;
                }
                h3Var.getClass();
                String str4 = dVar.f16093u;
                fa.y.h(str4);
                eb.o3 L2 = h3Var.L(str4);
                if (L2 != null) {
                    h3Var.H(dVar, L2);
                    return;
                }
                return;
            case 9:
                eb.t1 t1Var = (eb.t1) this.f7236v;
                String str5 = (String) this.f7237w;
                eb.d1 d1Var3 = (eb.d1) t1Var.f3443v;
                eb.g0 m4 = d1Var3.m();
                String str6 = m4.K;
                if (str6 != null && !str6.equals(str5)) {
                    z3 = true;
                }
                m4.K = str5;
                if (z3) {
                    d1Var3.m().D();
                    return;
                }
                return;
            case 10:
                eb.t1 t1Var2 = (eb.t1) this.f7237w;
                Bundle bundle3 = (Bundle) this.f7236v;
                t1Var2.u();
                t1Var2.y();
                String string = bundle3.getString("name");
                fa.y.e(string);
                eb.d1 d1Var4 = (eb.d1) t1Var2.f3443v;
                if (!d1Var4.e()) {
                    t1Var2.f().I.g("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                eb.k3 k3Var = new eb.k3(0L, null, string, "");
                try {
                    eb.l3 t3 = t1Var2.t();
                    bundle3.getString("app_id");
                    d1Var4.p().B(new eb.d(bundle3.getString("app_id"), "", k3Var, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), t3.H(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 11:
                ((eb.t1) this.f7237w).L((Boolean) this.f7236v, true);
                return;
            case 12:
                eb.n2 n2Var = (eb.n2) this.f7237w;
                eb.d0 d0Var = n2Var.f16280y;
                if (d0Var == null) {
                    n2Var.f().A.g("Failed to send current screen to service");
                    return;
                }
                try {
                    eb.k2 k2Var = (eb.k2) this.f7236v;
                    if (k2Var == null) {
                        d0Var.j2(0L, null, null, ((eb.d1) n2Var.f3443v).f16102u.getPackageName());
                    } else {
                        d0Var.j2(k2Var.f16208c, k2Var.f16206a, k2Var.f16207b, ((eb.d1) n2Var.f3443v).f16102u.getPackageName());
                    }
                    n2Var.O();
                    return;
                } catch (RemoteException e12) {
                    n2Var.f().A.f(e12, "Failed to send current screen to the service");
                    return;
                }
            case 13:
                eb.o3 o3Var = (eb.o3) this.f7236v;
                eb.n2 n2Var2 = (eb.n2) this.f7237w;
                eb.d0 d0Var2 = n2Var2.f16280y;
                if (d0Var2 == null) {
                    n2Var2.f().A.g("Failed to send consent settings to service");
                    return;
                }
                try {
                    d0Var2.G1(o3Var);
                    n2Var2.O();
                    return;
                } catch (RemoteException e13) {
                    n2Var2.f().A.f(e13, "Failed to send consent settings to the service");
                    return;
                }
            case 14:
                eb.n2 n2Var3 = ((eb.r2) this.f7237w).f16355w;
                ComponentName componentName = (ComponentName) this.f7236v;
                n2Var3.u();
                if (n2Var3.f16280y != null) {
                    n2Var3.f16280y = null;
                    n2Var3.f().I.f(componentName, "Disconnected from device MeasurementService");
                    n2Var3.u();
                    n2Var3.G();
                    return;
                }
                return;
            case 15:
                ((z8.k) ((g9.e2) this.f7236v).f17624m).addView((View) oa.b.z1((oa.a) this.f7237w));
                return;
            case 16:
                ib.k kVar = (ib.k) this.f7237w;
                ib.o oVar = kVar.f18375x;
                try {
                    ib.o oVar2 = (ib.o) kVar.f18374w.g((ib.o) this.f7236v);
                    if (oVar2 == null) {
                        kVar.w(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    fc.d dVar2 = ib.i.f18365b;
                    oVar2.f(dVar2, kVar);
                    oVar2.e(dVar2, kVar);
                    oVar2.a(dVar2, kVar);
                    return;
                } catch (ib.f e14) {
                    if (e14.getCause() instanceof Exception) {
                        oVar.o((Exception) e14.getCause());
                        return;
                    } else {
                        oVar.o(e14);
                        return;
                    }
                } catch (Exception e15) {
                    oVar.o(e15);
                    return;
                }
            case 17:
                synchronized (((ib.l) this.f7237w).f18378w) {
                    try {
                        ib.e eVar = (ib.e) ((ib.l) this.f7237w).f18379x;
                        if (eVar != null) {
                            eVar.d(((ib.o) this.f7236v).j());
                        }
                    } finally {
                    }
                }
                return;
            case 18:
                ((j9.d) ((nx) this.f7236v).f8887x).f19064v.getWindow().setBackgroundDrawable((BitmapDrawable) this.f7237w);
                return;
            case 19:
                if (!(((k6.q) this.f7237w).f19575u.f19962u instanceof l6.a)) {
                    try {
                        a6.h hVar3 = (a6.h) ((l6.j) this.f7236v).get();
                        if (hVar3 != null) {
                            a6.q.d().a(k6.q.A, "Updating notification for " + ((k6.q) this.f7237w).f19577w.f18946c);
                            k6.q qVar = (k6.q) this.f7237w;
                            l6.j jVar = qVar.f19575u;
                            k6.r rVar = qVar.f19579y;
                            Context context = qVar.f19576v;
                            UUID id2 = qVar.f19578x.getId();
                            rVar.getClass();
                            Object obj = new Object();
                            rVar.f19581a.a(new com.google.android.gms.internal.consent_sdk.g7(rVar, obj, id2, hVar3, context, 5, false));
                            jVar.m(obj);
                            return;
                        }
                        throw new IllegalStateException("Worker was marked important (" + ((k6.q) this.f7237w).f19577w.f18946c + ") but did not provide ForegroundInfo");
                    } catch (Throwable th2) {
                        ((k6.q) this.f7237w).f19575u.l(th2);
                        return;
                    }
                }
                return;
            case 20:
                k9.c0 c0Var = (k9.c0) this.f7236v;
                SharedPreferences sharedPreferences = ((Context) this.f7237w).getSharedPreferences("admob", 0);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                try {
                    synchronized (c0Var.f19642a) {
                        try {
                            c0Var.f19646f = sharedPreferences;
                            c0Var.f19647g = edit;
                            NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                            c0Var.f19648h = c0Var.f19646f.getBoolean("use_https", c0Var.f19648h);
                            c0Var.f19660u = c0Var.f19646f.getBoolean("content_url_opted_out", c0Var.f19660u);
                            c0Var.i = c0Var.f19646f.getString("content_url_hashes", c0Var.i);
                            c0Var.f19650k = c0Var.f19646f.getBoolean("gad_idless", c0Var.f19650k);
                            c0Var.f19661v = c0Var.f19646f.getBoolean("content_vertical_opted_out", c0Var.f19661v);
                            c0Var.f19649j = c0Var.f19646f.getString("content_vertical_hashes", c0Var.f19649j);
                            c0Var.f19657r = c0Var.f19646f.getInt("version_code", c0Var.f19657r);
                            if (((Boolean) pm.f9550g.p()).booleanValue() && g9.r.e.f17698c.f9873j) {
                                c0Var.f19653n = new mx("", 0L);
                            } else {
                                c0Var.f19653n = new mx(c0Var.f19646f.getString("app_settings_json", c0Var.f19653n.e), c0Var.f19646f.getLong("app_settings_last_update_ms", c0Var.f19653n.f8475f));
                            }
                            c0Var.f19654o = c0Var.f19646f.getLong("app_last_background_time_ms", c0Var.f19654o);
                            c0Var.f19656q = c0Var.f19646f.getInt("request_in_session_count", c0Var.f19656q);
                            c0Var.f19655p = c0Var.f19646f.getLong("first_ad_req_time_ms", c0Var.f19655p);
                            c0Var.f19658s = c0Var.f19646f.getStringSet("never_pool_slots", c0Var.f19658s);
                            c0Var.f19662w = c0Var.f19646f.getString("display_cutout", c0Var.f19662w);
                            c0Var.B = c0Var.f19646f.getInt("app_measurement_npa", c0Var.B);
                            c0Var.C = c0Var.f19646f.getInt("sd_app_measure_npa", c0Var.C);
                            c0Var.D = c0Var.f19646f.getLong("sd_app_measure_npa_ts", c0Var.D);
                            c0Var.f19663x = c0Var.f19646f.getString("inspector_info", c0Var.f19663x);
                            c0Var.f19664y = c0Var.f19646f.getBoolean("linked_device", c0Var.f19664y);
                            c0Var.f19665z = c0Var.f19646f.getString("linked_ad_unit", c0Var.f19665z);
                            c0Var.A = c0Var.f19646f.getString("inspector_ui_storage", c0Var.A);
                            c0Var.f19651l = c0Var.f19646f.getString("IABTCF_TCString", c0Var.f19651l);
                            c0Var.f19652m = c0Var.f19646f.getInt("gad_has_consent_for_cookies", c0Var.f19652m);
                            c0Var.E = c0Var.f19646f.getBoolean("is_install_referrer_reported", c0Var.E);
                            c0Var.F = c0Var.f19646f.getInt("total_inflight_ad_limit", c0Var.F);
                            c0Var.G = c0Var.f19646f.getInt("default_queue_capacity", c0Var.G);
                            try {
                                c0Var.f19659t = new JSONObject(c0Var.f19646f.getString("native_advanced_settings", "{}"));
                            } catch (JSONException e16) {
                                int i10 = k9.a0.f19634b;
                                l9.i.g("Could not convert native advanced settings to json object", e16);
                            }
                            c0Var.j();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                } catch (Throwable th4) {
                    f9.k.C.f16817h.d("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th4);
                    k9.a0.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th4);
                    return;
                }
            case gl.zzm /* 21 */:
                ((lb.w0) this.f7236v).f20296b.b((Intent) this.f7237w);
                return;
            case 22:
                ((m.e) this.f7237w).f20411v.d((Bundle) this.f7236v);
                return;
            case 23:
                oc.q.a((oc.q) this.f7237w, (com.google.android.gms.internal.mlkit_vision_digital_ink.lw) this.f7236v);
                return;
            case 24:
                ((qb.d) ((qb.c) this.f7236v).f23625x).f23628c.remove((String) this.f7237w);
                return;
            case 25:
                a();
                return;
            case 26:
                qb.d dVar3 = (qb.d) this.f7236v;
                Bundle bundle4 = (Bundle) this.f7237w;
                try {
                    pb.g gVar = (pb.g) dVar3.f23627b.f23655k;
                    if (gVar != null) {
                        qb.c cVar2 = dVar3.f23629d;
                        pb.e eVar2 = (pb.e) gVar;
                        Parcel o12 = eVar2.o1();
                        int i11 = za.a.f32013a;
                        o12.writeInt(1);
                        bundle4.writeToParcel(o12, 0);
                        if (cVar2 == null) {
                            o12.writeStrongBinder(null);
                        } else {
                            o12.writeStrongBinder(cVar2);
                        }
                        eVar2.z1(o12, 4);
                        return;
                    }
                    return;
                } catch (DeadObjectException e17) {
                    Log.e("HsdpClientImpl", "hsdpService is dead", e17);
                    return;
                } catch (RemoteException e18) {
                    Log.e("HsdpClientImpl", "Failed to call hsdpService.endSession", e18);
                    return;
                }
            case 27:
                b();
                return;
            case 28:
                s9.a aVar = (s9.a) this.f7236v;
                String str7 = (String) this.f7237w;
                WebView webView = aVar.f25037b;
                Context context2 = aVar.f25036a;
                Uri parse = Uri.parse(str7);
                try {
                    if (((Boolean) g9.r.e.f17698c.a(sl.f10988vd)).booleanValue() && (cq0Var = aVar.f25039d) != null) {
                        parse = cq0Var.a(parse, context2, webView, null);
                    } else {
                        parse = aVar.f25038c.b(parse, context2, webView, null);
                    }
                } catch (pf e19) {
                    int i12 = k9.a0.f19634b;
                    l9.i.b("Failed to append the click signal to URL: ", e19);
                    f9.k.C.f16817h.d("TaggingLibraryJsInterface.recordClick", e19);
                }
                aVar.i.b(parse.toString(), null, null, null);
                return;
            default:
                z8.e eVar3 = (z8.e) this.f7236v;
                try {
                    eVar3.f31982b.I3(g9.b3.a(eVar3.f31981a, (g9.d2) this.f7237w));
                    return;
                } catch (RemoteException e20) {
                    l9.i.d("Failed to load ad.", e20);
                    return;
                }
        }
    }

    public /* synthetic */ iv1(int i, Object obj, Object obj2, boolean z3) {
        this.f7235u = i;
        this.f7237w = obj;
        this.f7236v = obj2;
    }

    public /* synthetic */ iv1(Object obj, int i, Object obj2) {
        this.f7235u = i;
        this.f7236v = obj;
        this.f7237w = obj2;
    }

    public /* synthetic */ iv1(int i) {
        this.f7235u = i;
    }
}

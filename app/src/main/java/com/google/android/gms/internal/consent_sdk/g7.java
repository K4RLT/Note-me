package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.daren.scraply.MainActivity;
import com.google.android.gms.internal.mlkit_vision_digital_ink.fb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.hb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ka;
import com.google.android.gms.internal.mlkit_vision_digital_ink.la;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ya;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import wa.y8;
import ya.ma;

/* loaded from: classes.dex */
public final /* synthetic */ class g7 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13421u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f13422v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f13423w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f13424x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f13425y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f13426z;

    public /* synthetic */ g7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f13421u = i;
        this.f13422v = obj;
        this.f13423w = obj2;
        this.f13424x = obj3;
        this.f13425y = obj4;
        this.f13426z = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        eb.n2 n2Var;
        eb.d0 d0Var;
        switch (this.f13421u) {
            case 0:
                lw lwVar = (lw) this.f13422v;
                MainActivity mainActivity = (MainActivity) this.f13423w;
                n8.m mVar = (n8.m) this.f13424x;
                e7.c cVar = (e7.c) this.f13425y;
                final e7.d dVar = (e7.d) this.f13426z;
                try {
                    Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + z.a((Application) lwVar.f14643u) + "\") to set this as a debug device.");
                    ba.r w10 = ((nd.o) lwVar.A).w(lwVar.g(((m) lwVar.f14648z).a(mainActivity, mVar)));
                    g gVar = (g) lwVar.f14646x;
                    gVar.f13407b.edit().putInt("consent_status", w10.f3161u).commit();
                    int i = w10.f3162v;
                    SharedPreferences.Editor edit = gVar.f13407b.edit();
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                str = "REQUIRED";
                            } else {
                                throw null;
                            }
                        } else {
                            str = "NOT_REQUIRED";
                        }
                    } else {
                        str = "UNKNOWN";
                    }
                    edit.putString("privacy_options_requirement_status", str).commit();
                    ((n) lwVar.f14647y).f13496c.set((o) w10.f3163w);
                    y yVar = (y) lwVar.C;
                    yVar.a((Queue) yVar.f13611f.get(), 8, 9, null);
                    ((p0) lwVar.B).f13521a.execute(new ba.j(6, lwVar, cVar, w10));
                    return;
                } catch (l1 e) {
                    y yVar2 = (y) lwVar.C;
                    yVar2.a((Queue) yVar2.f13611f.get(), 8, 9, p.a.l("RequestConsentUpdate exception. Error: ", e.getMessage(), ", cause: ", String.valueOf(e.getCause())));
                    final int i10 = 0;
                    ((Handler) lwVar.f14644v).post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.w5
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    c7.a a10 = e.a();
                                    e7.d dVar2 = dVar;
                                    kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) dVar2.f15942v;
                                    d7.a aVar = (d7.a) dVar2.f15943w;
                                    Log.d("AdsConsent", "consulta de consentimiento: " + a10.f3896v);
                                    if (!uVar.f19783u) {
                                        uVar.f19783u = true;
                                        aVar.invoke();
                                        return;
                                    }
                                    return;
                                default:
                                    c7.a a11 = e.a();
                                    e7.d dVar3 = dVar;
                                    kotlin.jvm.internal.u uVar2 = (kotlin.jvm.internal.u) dVar3.f15942v;
                                    d7.a aVar2 = (d7.a) dVar3.f15943w;
                                    Log.d("AdsConsent", "consulta de consentimiento: " + a11.f3896v);
                                    if (!uVar2.f19783u) {
                                        uVar2.f19783u = true;
                                        aVar2.invoke();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                } catch (RuntimeException e8) {
                    y yVar3 = (y) lwVar.C;
                    yVar3.a((Queue) yVar3.f13611f.get(), 8, 9, "RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e8.getMessage())));
                    final int i11 = 1;
                    final l1 l1Var = new l1(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e8))));
                    ((Handler) lwVar.f14644v).post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.w5
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    c7.a a10 = l1Var.a();
                                    e7.d dVar2 = dVar;
                                    kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) dVar2.f15942v;
                                    d7.a aVar = (d7.a) dVar2.f15943w;
                                    Log.d("AdsConsent", "consulta de consentimiento: " + a10.f3896v);
                                    if (!uVar.f19783u) {
                                        uVar.f19783u = true;
                                        aVar.invoke();
                                        return;
                                    }
                                    return;
                                default:
                                    c7.a a11 = l1Var.a();
                                    e7.d dVar3 = dVar;
                                    kotlin.jvm.internal.u uVar2 = (kotlin.jvm.internal.u) dVar3.f15942v;
                                    d7.a aVar2 = (d7.a) dVar3.f15943w;
                                    Log.d("AdsConsent", "consulta de consentimiento: " + a11.f3896v);
                                    if (!uVar2.f19783u) {
                                        uVar2.f19783u = true;
                                        aVar2.invoke();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 1:
                hb hbVar = (hb) this.f13422v;
                if (hbVar.isDone()) {
                    ((fb) this.f13423w).f((ya) this.f13424x);
                    return;
                } else {
                    if (((ya) this.f13425y).isCancelled() && ((la) this.f13426z).compareAndSet(ka.f14564u, ka.f14565v)) {
                        hbVar.cancel(false);
                        return;
                    }
                    return;
                }
            case 2:
                de.h hVar = (de.h) this.f13422v;
                pd.c cVar2 = (pd.c) this.f13423w;
                pd.c cVar3 = (pd.c) this.f13424x;
                Callable callable = (Callable) this.f13425y;
                ib.h hVar2 = (ib.h) this.f13426z;
                AtomicBoolean atomicBoolean = hVar.f15844a;
                ib.o oVar = (ib.o) cVar2.f22681u;
                try {
                    if (oVar.k()) {
                        cVar3.h();
                        return;
                    }
                    try {
                        if (!atomicBoolean.get()) {
                            hVar.d();
                            atomicBoolean.set(true);
                        }
                        if (oVar.k()) {
                            cVar3.h();
                            return;
                        }
                        Object call = callable.call();
                        if (oVar.k()) {
                            cVar3.h();
                            return;
                        } else {
                            hVar2.b(call);
                            return;
                        }
                    } catch (RuntimeException e10) {
                        throw new zd.a("Internal error has occurred when executing ML Kit tasks", e10);
                    }
                } catch (Exception e11) {
                    if (oVar.k()) {
                        cVar3.h();
                        return;
                    } else {
                        hVar2.a(e11);
                        return;
                    }
                }
            case 3:
                synchronized (((AtomicReference) this.f13422v)) {
                    try {
                        try {
                            n2Var = (eb.n2) this.f13426z;
                            d0Var = n2Var.f16280y;
                        } catch (RemoteException e12) {
                            ((eb.n2) this.f13426z).f().A.i("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f13423w, e12);
                            ((AtomicReference) this.f13422v).set(Collections.EMPTY_LIST);
                        }
                        if (d0Var == null) {
                            n2Var.f().A.i("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f13423w, (String) this.f13424x);
                            ((AtomicReference) this.f13422v).set(Collections.EMPTY_LIST);
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            ((AtomicReference) this.f13422v).set(d0Var.J1((String) this.f13423w, (String) this.f13424x, (eb.o3) this.f13425y));
                        } else {
                            ((AtomicReference) this.f13422v).set(d0Var.l2(null, (String) this.f13423w, (String) this.f13424x));
                        }
                        ((eb.n2) this.f13426z).O();
                        ((AtomicReference) this.f13422v).notify();
                        return;
                    } finally {
                        ((AtomicReference) this.f13422v).notify();
                    }
                }
            case 4:
                eb.o3 o3Var = (eb.o3) this.f13424x;
                String str2 = (String) this.f13423w;
                String str3 = (String) this.f13422v;
                com.google.android.gms.internal.measurement.t0 t0Var = (com.google.android.gms.internal.measurement.t0) this.f13425y;
                eb.n2 n2Var2 = (eb.n2) this.f13426z;
                ArrayList arrayList = new ArrayList();
                try {
                    eb.d0 d0Var2 = n2Var2.f16280y;
                    if (d0Var2 == null) {
                        n2Var2.f().A.h("Failed to get conditional properties; not connected to service", str3, str2);
                    } else {
                        arrayList = eb.l3.s0(d0Var2.J1(str3, str2, o3Var));
                        n2Var2.O();
                        n2Var2.t().U(t0Var, arrayList);
                    }
                    return;
                } catch (RemoteException e13) {
                    n2Var2.f().A.i("Failed to get conditional properties; remote exception", str3, str2, e13);
                    return;
                } finally {
                    n2Var2.t().U(t0Var, arrayList);
                }
            case 5:
                try {
                    if (!(((l6.j) this.f13422v).f19962u instanceof l6.a)) {
                        String uuid = ((UUID) this.f13423w).toString();
                        j6.p j10 = ((k6.r) this.f13426z).f19583c.j(uuid);
                        if (j10 != null && !a5.a.a(j10.f18945b)) {
                            ((k6.r) this.f13426z).f19582b.g(uuid, (a6.h) this.f13424x);
                            ((Context) this.f13425y).startService(i6.a.a((Context) this.f13425y, y8.a(j10), (a6.h) this.f13424x));
                        } else {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                    }
                    ((l6.j) this.f13422v).j(null);
                    return;
                } catch (Throwable th) {
                    ((l6.j) this.f13422v).l(th);
                    return;
                }
            default:
                ((qb.h) this.f13422v).A.d();
                ((Activity) this.f13423w).startActivityForResult(ma.a((String) this.f13424x, (String) this.f13425y, (HashMap) this.f13426z), 0);
                return;
        }
    }

    public /* synthetic */ g7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z3) {
        this.f13421u = i;
        this.f13422v = obj2;
        this.f13423w = obj3;
        this.f13424x = obj4;
        this.f13425y = obj5;
        this.f13426z = obj;
    }
}

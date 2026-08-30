package com.google.android.gms.internal.ads;
import f0.e;
import f9.k;
import fa.y;
import g9.k0;
import g9.p;
import g9.r;
import k9.a0;
import k9.f0;
import l9.a;
import l9.d;
import l9.i;
import oa.b;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class e40 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5588u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5589v;

    public /* synthetic */ e40(int i, Object obj) {
        this.f5588u = i;
        this.f5589v = obj;
    }

    private final /* synthetic */ void a() {
        ag0 ag0Var = (ag0) this.f5589v;
        AtomicReference atomicReference = ag0Var.f4495d;
        synchronized (atomicReference) {
            try {
                if (!((String) atomicReference.get()).isEmpty()) {
                    return;
                }
                atomicReference.set(ag0Var.b());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        mg0 mg0Var = (mg0) this.f5589v;
        synchronized (mg0Var.f9515v) {
            try {
                if (mg0Var.f9516w) {
                    return;
                }
                mg0Var.f9516w = true;
                cj cjVar = new cj(mg0Var.A, f9.k.C.f16828t.a(), mg0Var, mg0Var, 2);
                mg0Var.f9519z = cjVar;
                cjVar.m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        int i;
        String t3;
        TelephonyManager telephonyManager;
        wi0 wi0Var = (wi0) this.f5589v;
        z zVar = (z) wi0Var.f12247a.get();
        if (zVar != null) {
            int b10 = wi0Var.f12249c.b();
            a0 a0Var = zVar.f13018a;
            synchronized (a0Var) {
                try {
                    if (a0Var.F != b10 || a0Var.G == null) {
                        a0Var.F = b10;
                        if (b10 != 1 && b10 != 0 && b10 != 8) {
                            if (a0Var.G == null) {
                                Context context = a0Var.f4293u;
                                String str = bq0.f4860a;
                                if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (!TextUtils.isEmpty(networkCountryIso)) {
                                        t3 = ed1.t(networkCountryIso);
                                        a0Var.G = t3;
                                    }
                                }
                                t3 = ed1.t(Locale.getDefault().getCountry());
                                a0Var.G = t3;
                            }
                            a0Var.D = a0Var.b(b10);
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (a0Var.f4297y > 0) {
                                i = (int) (elapsedRealtime - a0Var.f4298z);
                            } else {
                                i = 0;
                            }
                            a0Var.a(a0Var.A, i, a0Var.D);
                            a0Var.f4298z = elapsedRealtime;
                            a0Var.A = 0L;
                            a0Var.C = 0L;
                            a0Var.B = 0L;
                            h0 h0Var = a0Var.f4296x;
                            ((ArrayList) h0Var.f6522f).clear();
                            h0Var.f6519b = -1;
                            h0Var.f6520c = 0;
                            h0Var.f6521d = 0;
                        }
                    }
                } finally {
                }
            }
        }
    }

    private final void d() {
        qj0 qj0Var = (qj0) this.f5589v;
        synchronized (qj0Var) {
            qj0Var.f9853a.getClass();
            qj0Var.f9859h = SystemClock.elapsedRealtime() - qj0Var.i;
        }
    }

    private final void e() {
        qk0 qk0Var = (qk0) this.f5589v;
        synchronized (qk0Var) {
            qk0Var.v4(3, "Signal collection timeout.");
        }
    }

    private final /* synthetic */ void f() {
        er0 er0Var;
        er0 er0Var2 = (er0) this.f5589v;
        fr0 fr0Var = er0Var2.f5763d;
        synchronized (fr0Var) {
            try {
                ScheduledFuture scheduledFuture = er0Var2.f5762c;
                if (scheduledFuture != null) {
                    er0Var = (er0) fr0Var.f6155w.remove(scheduledFuture);
                } else {
                    er0Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (er0Var != null) {
            fr0 fr0Var2 = er0Var2.f5763d;
            fr0Var2.f6154v.execute(er0Var2.f5760a);
        }
    }

    private final void g() {
        fr0 fr0Var = (fr0) this.f5589v;
        synchronized (fr0Var) {
            HashMap hashMap = fr0Var.f6155w;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i);
                er0 er0Var = (er0) hashMap.get(scheduledFuture);
                if (er0Var != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                    scheduledFuture.cancel(false);
                    hashMap.remove(scheduledFuture);
                    f9.k.C.f16819k.getClass();
                    fr0Var.a(er0Var.f5760a, Math.max(0L, er0Var.f5761b - System.currentTimeMillis()));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.google.android.gms.internal.ads.r90, java.lang.Exception] */
    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        switch (this.f5588u) {
            case 0:
                f40 f40Var = (f40) this.f5589v;
                so soVar = f40Var.f5925q.f12201d;
                if (soVar != null) {
                    try {
                        g9.k0 k0Var = (g9.k0) f40Var.f5927s.zzb();
                        oa.b bVar = new oa.b(f40Var.f5920l);
                        Parcel g22 = soVar.g2();
                        qh.e(g22, k0Var);
                        qh.e(g22, bVar);
                        soVar.v2(g22, 1);
                        return;
                    } catch (RemoteException e) {
                        int i = k9.a0.f19634b;
                        l9.i.d("RemoteException when notifyAdLoad is called", e);
                        return;
                    }
                }
                return;
            case 1:
                ((f50) this.f5589v).f5936c = false;
                return;
            case 2:
                r50 r50Var = (r50) this.f5589v;
                ay0.J(r50Var.f10097w);
                r50Var.B = true;
                return;
            case 3:
                a60 a60Var = (a60) this.f5589v;
                synchronized (a60Var) {
                    try {
                        d91 d91Var = a60Var.f4375z;
                        if (!d91Var.isDone()) {
                            d91Var.d(Boolean.TRUE);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 4:
                g60 g60Var = (g60) this.f5589v;
                synchronized (g60Var.f6310u) {
                    try {
                        if (!g60Var.C) {
                            g60Var.C = true;
                            g60Var.a();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 5:
                y60 y60Var = (y60) this.f5589v;
                synchronized (y60Var) {
                    int i10 = k9.a0.f19634b;
                    l9.i.c("Timeout waiting for show call succeed to be called.");
                    y60Var.N(new Exception("Timeout for show call succeed."));
                    y60Var.f12801y = true;
                }
                return;
            case 6:
                ((ua0) this.f5589v).k();
                return;
            case 7:
                za0 za0Var = (za0) this.f5589v;
                if (za0Var.A == null) {
                    View view = new View(za0Var.f13128x.getContext());
                    za0Var.A = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (za0Var.f13128x != za0Var.A.getParent()) {
                    za0Var.f13128x.addView(za0Var.A);
                    return;
                }
                return;
            case 8:
                hc0 hc0Var = (hc0) this.f5589v;
                try {
                    hc0Var.getClass();
                    fa.y.d("#008 Must be called on the main UI thread.");
                    hc0Var.w4();
                    na0 na0Var = hc0Var.f6669w;
                    if (na0Var != null) {
                        na0Var.o();
                    }
                    hc0Var.f6669w = null;
                    hc0Var.f6667u = null;
                    hc0Var.f6668v = null;
                    hc0Var.f6670x = true;
                    return;
                } catch (RemoteException e8) {
                    int i11 = k9.a0.f19634b;
                    l9.i.i(e8, "#007 Could not call remote method.");
                    return;
                }
            case 9:
                String str = f9.k.C.f16817h.g().n().e;
                boolean isEmpty = TextUtils.isEmpty(str);
                yx yxVar = (yx) this.f5589v;
                if (!isEmpty) {
                    yxVar.b(str);
                    return;
                } else {
                    yxVar.c(new Exception());
                    return;
                }
            case 10:
                qf0 qf0Var = (qf0) this.f5589v;
                h00 h00Var = qf0Var.f9836x;
                nf0 nf0Var = qf0Var.f9835w;
                synchronized (nf0Var) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("platform", "ANDROID");
                        String str2 = nf0Var.f8696k;
                        if (!TextUtils.isEmpty(str2)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 12);
                            sb2.append("afma-sdk-a-v");
                            sb2.append(str2);
                            jSONObject.put("sdkVersion", sb2.toString());
                        }
                        jSONObject.put("internalSdkVersion", nf0Var.i);
                        jSONObject.put("osVersion", Build.VERSION.RELEASE);
                        jSONObject.put("adapters", nf0Var.f8691d.a());
                        nl nlVar = sl.La;
                        g9.r rVar = g9.r.e;
                        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                            String str3 = f9.k.C.f16817h.f9637g;
                            if (!TextUtils.isEmpty(str3)) {
                                jSONObject.put("plugin", str3);
                            }
                        }
                        long j10 = nf0Var.f8702q;
                        f9.k kVar = f9.k.C;
                        kVar.f16819k.getClass();
                        if (j10 < System.currentTimeMillis() / 1000) {
                            nf0Var.f8700o = "{}";
                        }
                        jSONObject.put("networkExtras", nf0Var.f8700o);
                        jSONObject.put("adSlots", nf0Var.i());
                        jSONObject.put("appInfo", nf0Var.e.r());
                        String str4 = kVar.f16817h.g().n().e;
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject.put("cld", new JSONObject(str4));
                        }
                        if (((Boolean) rVar.f17698c.a(sl.Aa)).booleanValue() && (jSONObject2 = nf0Var.f8701p) != null) {
                            String obj = jSONObject2.toString();
                            StringBuilder sb3 = new StringBuilder(obj.length() + 13);
                            sb3.append("Server data: ");
                            sb3.append(obj);
                            String sb4 = sb3.toString();
                            int i12 = k9.a0.f19634b;
                            l9.i.a(sb4);
                            jSONObject.put("serverData", nf0Var.f8701p);
                        }
                        if (((Boolean) rVar.f17698c.a(sl.f11048za)).booleanValue()) {
                            jSONObject.put("openAction", nf0Var.f8707v);
                            jSONObject.put("gesture", nf0Var.f8703r);
                        }
                        jSONObject.put("isGamRegisteredTestDevice", kVar.f16823o.g());
                        l9.d dVar = g9.p.f17688g.f17689a;
                        jSONObject.put("isSimulator", l9.d.q());
                        if (((Boolean) rVar.f17698c.a(sl.Na)).booleanValue()) {
                            jSONObject.put("uiStorage", new JSONObject(nf0Var.f8709x));
                        }
                        if (!TextUtils.isEmpty((CharSequence) rVar.f17698c.a(sl.Pa))) {
                            jSONObject.put("gmaDisk", (JSONObject) nf0Var.f8694h.f12641b);
                        }
                        if (!TextUtils.isEmpty((CharSequence) rVar.f17698c.a(sl.Oa))) {
                            jSONObject.put("userDisk", (JSONObject) nf0Var.f8693g.f12641b);
                        }
                    } catch (JSONException e10) {
                        f9.k.C.f16817h.e("Inspector.toJson", e10);
                        int i13 = k9.a0.f19634b;
                        l9.i.g("Ad inspector encountered an error", e10);
                    } finally {
                    }
                }
                h00Var.p("window.inspectorInfo", jSONObject.toString());
                return;
            case 11:
                a();
                return;
            case 12:
                ((lg0) this.f5589v).a();
                return;
            case 13:
                ((lg0) this.f5589v).a();
                return;
            case 14:
                hq0 hq0Var = (hq0) this.f5589v;
                y10 y10Var = ((y10) hq0Var.f6873w).f12709b;
                lo1.c((Context) hq0Var.f6872v, Context.class);
                jk0 jk0Var = new jk0(y10Var);
                rr1 rr1Var = y10Var.f12728m;
                k10 k10Var = y10Var.f12707a;
                h30 h30Var = (h30) jk0Var.f7466v;
                Context context = (Context) k10Var.f7600c;
                lo1.b(context);
                wx wxVar = xx.f12652b;
                lo1.b(wxVar);
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                pr1 b10 = rr1.b(h30Var);
                l9.a aVar = (l9.a) k10Var.f7599b;
                lo1.b(aVar);
                zd1 zd1Var = new zd1(context, wxVar, wxVar2, b10, aVar, jk0Var, (be0) rr1Var.zzb());
                k9.f0 f0Var = f9.k.C.f16813c;
                if (k9.f0.e(context.getPackageName())) {
                    wxVar2.execute(new e40(15, zd1Var));
                    return;
                }
                jk0 jk0Var2 = new jk0(23, zd1Var);
                lo1.b(context);
                lo1.b(aVar);
                wxVar.execute(new e40(16, new mg0(context, aVar, jk0Var2)));
                return;
            case 15:
                ((zd1) this.f5589v).u();
                return;
            case 16:
                b();
                return;
            case 17:
                c();
                return;
            case 18:
                d();
                return;
            case 19:
                e();
                return;
            case 20:
                boolean booleanValue = ((Boolean) g9.r.e.f17698c.a(sl.Pb)).booleanValue();
                Throwable th = (Throwable) this.f5589v;
                if (booleanValue) {
                    f9.k.C.f16817h.f("TopicsSignalUnsampled.fetchTopicsSignal", th);
                    return;
                } else {
                    f9.k.C.f16817h.e("TopicsSignal.fetchTopicsSignal", th);
                    return;
                }
            case gl.zzm /* 21 */:
                ((ko0) this.f5589v).f7824d.x(x21.J(6, null, null));
                return;
            case 22:
                ((oo0) this.f5589v).f9175d.x(x21.J(6, null, null));
                return;
            case 23:
                ((yk0) this.f5589v).e();
                return;
            case 24:
                ((fp0) this.f5589v).f6147d.x(x21.J(6, null, null));
                return;
            case 25:
                ((hp0) this.f5589v).e();
                return;
            case 26:
                ((kp0) this.f5589v).f7837d.x(x21.J(6, null, null));
                return;
            case 27:
                f();
                return;
            case 28:
                g();
                return;
            default:
                bu0 bu0Var = (bu0) this.f5589v;
                AtomicBoolean atomicBoolean = bu0Var.e;
                AudioManager audioManager = bu0Var.f4878c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                float f10 = 0.0f;
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f10 = streamVolume / streamMaxVolume;
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                }
                atomicBoolean.set(false);
                if (((Float) bu0Var.f4879d.getAndSet(Float.valueOf(f10))).floatValue() != f10) {
                    bu0Var.f4876a.post(new au0(this, f10));
                    return;
                }
                return;
        }
    }
}

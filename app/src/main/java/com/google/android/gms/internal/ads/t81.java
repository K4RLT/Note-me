package com.google.android.gms.internal.ads;
import a6.q;
import ac.b;
import b6.v;
import ba.n;
import ba.o;
import ba.p;
import c7.c;
import c7.f;
import f9.k;
import fa.y;
import g9.r;
import g9.w2;
import g9.y1;
import j6.s;
import k6.i;
import k9.a0;
import k9.c0;
import k9.f0;
import l6.a;
import l6.j;
import l9.a;
import l9.i;
import la.b;
import oa.b;
import p.a;
import t.h;
import t.i;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t81 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11270u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f11271v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f11272w;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ t81(na0 na0Var, mb0 mb0Var) {
        this.f11270u = 16;
        this.f11271v = na0Var;
        this.f11272w = (ph) mb0Var;
    }

    private final void a() {
        Object ohVar;
        l21 l21Var;
        IBinder iBinder = (IBinder) this.f11272w;
        int i = k21.f7634u;
        int i10 = 0;
        if (iBinder == null) {
            ohVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
            if (queryLocalInterface instanceof l21) {
                ohVar = (l21) queryLocalInterface;
            } else {
                ohVar = new oh(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService", 0);
            }
        }
        t21 t21Var = (t21) this.f11271v;
        bj0 bj0Var = t21Var.f11230u;
        bj0Var.D = ohVar;
        ((w91) bj0Var.f4807x).b("linkToDeath", new Object[0]);
        try {
            l21Var = (l21) bj0Var.D;
        } catch (RemoteException e) {
            ((w91) t21Var.f11230u.f4807x).e(e, "linkToDeath failed", new Object[0]);
        }
        if (l21Var != null) {
            l21Var.asBinder().linkToDeath((u21) bj0Var.B, 0);
            bj0 bj0Var2 = t21Var.f11230u;
            bj0Var2.f4804u = false;
            synchronized (((ArrayList) bj0Var2.f4809z)) {
                try {
                    ArrayList arrayList = (ArrayList) bj0Var2.f4809z;
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Runnable) obj).run();
                    }
                    ((ArrayList) bj0Var2.f4809z).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, com.google.android.gms.internal.ads.uq] */
    /* JADX WARN: Type inference failed for: r2v73, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable c10;
        Exception exc;
        Exception exc2;
        View view;
        PowerManager.WakeLock wakeLock;
        int i = 2;
        boolean z3 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.f11270u) {
            case 0:
                s81 s81Var = (s81) this.f11272w;
                b bVar = (b) this.f11271v;
                if ((bVar instanceof z71) && (c10 = ((z71) bVar).c()) != null) {
                    s81Var.t(c10);
                    return;
                }
                try {
                    s81Var.mo202r(ed1.j0(bVar));
                    return;
                } catch (ExecutionException e) {
                    s81Var.t(e.getCause());
                    return;
                } catch (Throwable th) {
                    s81Var.t(th);
                    return;
                }
            case 1:
                if (!(((v) this.f11272w).K.f19962u instanceof a)) {
                    try {
                        ((b) this.f11271v).get();
                        q.d().a(v.M, "Starting work for " + ((v) this.f11272w).f1790x.f18946c);
                        v vVar = (v) this.f11272w;
                        vVar.K.m(vVar.f1791y.startWork());
                        return;
                    } catch (Throwable th2) {
                        ((v) this.f11272w).K.l(th2);
                        return;
                    }
                }
                return;
            case 2:
                n nVar = (n) this.f11271v;
                int i10 = ((o) this.f11272w).f3151a;
                synchronized (nVar) {
                    o oVar = (o) nVar.f3149y.get(i10);
                    if (oVar != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i10);
                        nVar.f3149y.remove(i10);
                        oVar.b(new p("Timed out waiting for response", (Throwable) null));
                        nVar.c();
                    }
                }
                return;
            case 3:
                Future future = (Future) this.f11271v;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f11272w;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.h("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                try {
                    ((c) ((com.google.android.gms.internal.mlkit_vision_digital_ink.iw) this.f11271v).f14490w).A.u((f) this.f11272w);
                    return;
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.i("BillingClient", "Exception calling onBillingSetupFinished.", th3);
                    return;
                }
            case 5:
                s sVar = (s) this.f11271v;
                gs1 gs1Var = (gs1) this.f11272w;
                sVar.getClass();
                String str = bq0.f4860a;
                ((rs1) sVar.f18982w).f10282u.Y.k(gs1Var);
                return;
            case 6:
                if (((fj) this.f11271v).isCancelled()) {
                    ((Future) this.f11272w).cancel(true);
                    return;
                }
                return;
            case 7:
                uq uqVar = (uq) this.f11271v;
                String str2 = (String) this.f11272w;
                h00 h00Var = uqVar.f11699u;
                if (h00Var != null) {
                    h00Var.loadData(str2, "text/html", "UTF-8");
                    return;
                }
                return;
            case 8:
                cr crVar = (cr) this.f11272w;
                dr drVar = (dr) this.f11271v;
                k.C.f16819k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                try {
                    a0.k("loadJavascriptEngine > Before createJavascriptEngine");
                    Context context = (Context) drVar.f5485d;
                    a aVar = (a) drVar.e;
                    Object obj = new Object();
                    h00 e8 = fp.e(context, new x0(0, 0, 0), "", false, false, null, null, aVar, null, null, new jj(), null, null, null, null, null);
                    obj.f11699u = e8;
                    e8.U().setWillNotDraw(true);
                    a0.k("loadJavascriptEngine > After createJavascriptEngine");
                    a0.k("loadJavascriptEngine > Before setting new engine loaded listener");
                    ar arVar = new ar(drVar, arrayList, currentTimeMillis, crVar, obj);
                    h00 h00Var2 = obj.f11699u;
                    int i11 = 7;
                    if (h00Var2 != null) {
                        h00Var2.j0().B = new hx0(i11, arVar);
                    }
                    a0.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    obj.l("/jsLoaded", new wq(drVar, currentTimeMillis, crVar, obj));
                    i iVar = new i(i, (boolean) (objArr2 == true ? 1 : 0));
                    xq xqVar = new xq(drVar, obj, iVar);
                    iVar.f19569v = xqVar;
                    a0.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    if (!((Boolean) wm.f12284d.p()).booleanValue() || TextUtils.equals(((Context) drVar.f5485d).getPackageName(), "com.google.android.gms")) {
                        obj.l("/requestReload", xqVar);
                    }
                    String str3 = (String) drVar.f5482a;
                    a0.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str3)));
                    if (str3.endsWith(".js")) {
                        a0.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                        a0.k("loadJavascript on adWebView from path: ".concat(str3));
                        uq.k(new tq(obj, "<!DOCTYPE html><html><head><script src=\"" + str3 + "\"></script></head><body></body></html>", objArr == true ? 1 : 0));
                        a0.k("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str3.startsWith("<html>")) {
                        a0.k("loadJavascriptEngine > Before newEngine.loadHtml");
                        a0.k("loadHtml on adWebView from html");
                        uq.k(new t81((Object) obj, i11, str3));
                        a0.k("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        a0.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        a0.k("loadHtmlWrapper on adWebView from path: ".concat(str3));
                        uq.k(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra((Object) obj, i11, str3));
                        a0.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    a0.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    f0.f19676l.postDelayed(new zq(drVar, crVar, obj, arrayList, currentTimeMillis, 0), ((Integer) r.e.f17698c.a(sl.e)).intValue());
                    return;
                } catch (Throwable th4) {
                    int i12 = a0.f19634b;
                    i.d("Error creating webview.", th4);
                    nl nlVar = sl.C8;
                    r rVar = r.e;
                    if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                        crVar.k("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th4);
                        return;
                    } else if (((Boolean) rVar.f17698c.a(sl.E8)).booleanValue()) {
                        k.C.f16817h.e("SdkJavascriptFactory.loadJavascriptEngine", th4);
                        crVar.j();
                        return;
                    } else {
                        k.C.f16817h.d("SdkJavascriptFactory.loadJavascriptEngine", th4);
                        crVar.j();
                        return;
                    }
                }
            case 9:
                mw mwVar = (mw) this.f11271v;
                Bitmap bitmap = (Bitmap) this.f11272w;
                mwVar.getClass();
                mm1 mm1Var = om1.f9167v;
                nm1 nm1Var = new nm1();
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, nm1Var);
                synchronized (mwVar.f8444h) {
                    pp1 pp1Var = mwVar.f8438a;
                    fq1 z9 = gq1.z();
                    om1 f10 = nm1Var.f();
                    z9.b();
                    ((gq1) z9.f4845v).B(f10);
                    z9.b();
                    ((gq1) z9.f4845v).A("image/png");
                    z9.b();
                    ((gq1) z9.f4845v).C(2);
                    gq1 gq1Var = (gq1) z9.c();
                    pp1Var.b();
                    ((qq1) pp1Var.f4845v).J(gq1Var);
                }
                return;
            case 10:
                Context context2 = (Context) this.f11271v;
                qb0 qb0Var = (qb0) this.f11272w;
                xy.f12658v = (AudioManager) context2.getSystemService("audio");
                qb0Var.a();
                return;
            case 11:
                AtomicInteger atomicInteger = wz.O;
                ((h00) this.f11271v).b("onGcacheInfoEvent", (HashMap) this.f11272w);
                return;
            case 12:
                ((u00) this.f11271v).f11502u.b("pubVideoCmd", (HashMap) this.f11272w);
                return;
            case 13:
                p20 p20Var = (p20) this.f11271v;
                Runnable runnable2 = (Runnable) this.f11272w;
                y.d("Adapters must be initialized on the main thread.");
                HashMap hashMap = k.C.f16817h.g().n().f8473c;
                if (!hashMap.isEmpty()) {
                    if (runnable2 != null) {
                        try {
                            runnable2.run();
                        } catch (Throwable th5) {
                            int i13 = a0.f19634b;
                            i.g("Could not initialize rewarded ads.", th5);
                            return;
                        }
                    }
                    if (((vr) ((AtomicReference) p20Var.f9328w.f9099a.f6874x).get()) != null) {
                        HashMap hashMap2 = new HashMap();
                        Iterator it = hashMap.values().iterator();
                        while (it.hasNext()) {
                            for (rr rrVar : ((sr) it.next()).f11110a) {
                                String str4 = rrVar.f10277b;
                                for (String str5 : rrVar.f10276a) {
                                    if (!hashMap2.containsKey(str5)) {
                                        hashMap2.put(str5, new ArrayList());
                                    }
                                    if (str4 != null) {
                                        ((List) hashMap2.get(str5)).add(str4);
                                    }
                                }
                            }
                        }
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : hashMap2.entrySet()) {
                            String str6 = (String) entry.getKey();
                            try {
                                gi0 a10 = p20Var.f9329x.a(str6, jSONObject);
                                if (a10 != null) {
                                    iq0 iq0Var = (iq0) a10.f6407b;
                                    boolean a11 = iq0Var.a();
                                    xr xrVar = iq0Var.f7192a;
                                    if (!a11) {
                                        try {
                                            if (xrVar.I()) {
                                                try {
                                                    xrVar.R3(new b(p20Var.f9326u), (aj0) a10.f6408c, (List) entry.getValue());
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 45);
                                                    sb2.append("Initialized rewarded video mediation adapter ");
                                                    sb2.append(str6);
                                                    String sb3 = sb2.toString();
                                                    int i14 = a0.f19634b;
                                                    i.a(sb3);
                                                } finally {
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } catch (dq0 e10) {
                                String o10 = a.o(new StringBuilder(String.valueOf(str6).length() + 56), "Failed to initialize rewarded video mediation adapter \"", str6, "\"");
                                int i15 = a0.f19634b;
                                i.g(o10, e10);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 14:
                JSONObject jSONObject2 = (JSONObject) this.f11271v;
                String obj2 = jSONObject2.toString();
                String o11 = a.o(new StringBuilder(obj2.length() + 31), "Calling AFMA_updateActiveView(", obj2, ")");
                int i16 = a0.f19634b;
                i.a(o11);
                ((h00) this.f11272w).a("AFMA_updateActiveView", jSONObject2);
                return;
            case 15:
                try {
                    ((n80) this.f11271v).mo205l(this.f11272w);
                    return;
                } catch (Throwable th6) {
                    k.C.f16817h.e("EventEmitter.notify", th6);
                    a0.l("Event emitter exception.", th6);
                    return;
                }
            case 16:
                ((na0) this.f11271v).g((ph) this.f11272w);
                return;
            case 17:
                ab0 ab0Var = (ab0) this.f11271v;
                ViewGroup viewGroup = (ViewGroup) this.f11272w;
                aq0 aq0Var = ab0Var.f4432b;
                c0 c0Var = ab0Var.f4431a;
                ra0 ra0Var = ab0Var.f4434d;
                synchronized (ra0Var) {
                    view = ra0Var.f10177o;
                }
                if (view != null) {
                    if (viewGroup != null) {
                        z3 = true;
                    }
                    if (ra0Var.q() != 2 && ra0Var.q() != 1) {
                        if (ra0Var.q() == 6) {
                            String str7 = aq0Var.f4583g;
                            c0Var.p(str7, "2", z3);
                            c0Var.p(str7, "1", z3);
                            return;
                        }
                        return;
                    }
                    c0Var.p(aq0Var.f4583g, String.valueOf(ra0Var.q()), z3);
                    return;
                }
                return;
            case 18:
                ((fe0) this.f11271v).f6048d.a(null, (String) this.f11272w);
                return;
            case 19:
                try {
                    ((iq) this.f11272w).f2(((af0) this.f11271v).b());
                    return;
                } catch (RemoteException e11) {
                    int i17 = a0.f19634b;
                    i.d("", e11);
                    return;
                }
            case 20:
                if (((Boolean) r.e.f17698c.a(sl.f10760h6)).booleanValue() && ct.D.f8992v) {
                    ((tt0) this.f11271v).b((View) this.f11272w);
                    return;
                }
                return;
            case gl.zzm /* 21 */:
                si0 si0Var = (si0) this.f11271v;
                h00 h00Var3 = (h00) this.f11272w;
                h00Var3.l1();
                aq0 aq0Var2 = si0Var.f10620d;
                u00 d2 = h00Var3.d();
                w2 w2Var = aq0Var2.f4578a;
                if (w2Var != null && d2 != null) {
                    d2.w4(w2Var);
                }
                if (((Boolean) r.e.f17698c.a(sl.Q1)).booleanValue() && !h00Var3.isAttachedToWindow()) {
                    h00Var3.onPause();
                    h00Var3.k1();
                    return;
                }
                return;
            case 22:
                ((dl0) ((zd1) ((k60) ((p8) this.f11271v).f9423z).f7669d).f13144x).x((y1) this.f11272w);
                return;
            case 23:
                ((fp0) ((p8) this.f11271v).f9423z).f6147d.x((y1) this.f11272w);
                return;
            case 24:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f11272w;
                InputStream inputStream = (InputStream) this.f11271v;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                        try {
                            b.e(inputStream, autoCloseOutputStream, false);
                            autoCloseOutputStream.close();
                            inputStream.close();
                            return;
                        } finally {
                        }
                    } catch (IOException unused) {
                        return;
                    }
                } finally {
                }
            case 25:
                com.google.android.gms.internal.mlkit_vision_digital_ink.iw iwVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.iw) this.f11271v;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f11272w;
                synchronized (iwVar) {
                    if (atomicBoolean.get() && (wakeLock = (PowerManager.WakeLock) iwVar.f14490w) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 26:
                at0 at0Var = (at0) this.f11271v;
                dt0 dt0Var = (dt0) this.f11272w;
                if (!at0Var.f4607b.get() && dt0Var.t() == 0 && dt0Var.u()) {
                    dt0Var.k();
                }
                at0Var.k(((Long) r.e.f17698c.a(sl.f10692d0)).longValue());
                return;
            case 27:
                s6.E((WebView) this.f11271v, (String) this.f11272w);
                return;
            case 28:
                a();
                return;
            default:
                ((e81) this.f11271v).w((z41) this.f11272w);
                return;
        }
    }

    public String toString() {
        switch (this.f11270u) {
            case 0:
                hq0 hq0Var = new hq0(t81.class.getSimpleName());
                s81 s81Var = (s81) this.f11272w;
                com.google.android.gms.internal.measurement.e4 e4Var = new com.google.android.gms.internal.measurement.e4(9, false);
                ((com.google.android.gms.internal.measurement.e4) hq0Var.f6874x).f13729w = e4Var;
                hq0Var.f6874x = e4Var;
                e4Var.f13728v = s81Var;
                return hq0Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t81(Object obj, int i, Object obj2) {
        this.f11270u = i;
        this.f11271v = obj;
        this.f11272w = obj2;
    }

    public t81(s6 s6Var, WebView webView, String str) {
        this.f11270u = 27;
        this.f11271v = webView;
        this.f11272w = str;
    }

    public t81(v vVar, j jVar) {
        this.f11270u = 1;
        this.f11272w = vVar;
        this.f11271v = jVar;
    }
}
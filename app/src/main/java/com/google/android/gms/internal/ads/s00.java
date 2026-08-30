package com.google.android.gms.internal.ads;
import a0.k;
import a5.a;
import a6.x;
import ac.b;
import ca.h;
import f9.g;
import g9.p;
import g9.r;
import j6.l;
import j9.c;
import j9.d;
import j9.e;
import j9.j;
import j9.m;
import k9.a0;
import k9.b0;
import k9.f0;
import k9.z;
import l9.i;
import r0.s;
import wa.k9;
import ya.ee;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s00 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, h00 {

    /* renamed from: w0 */
    public static final /* synthetic */ int f10415w0 = 0;
    public final j6.l A;
    public final DisplayMetrics B;
    public final float C;
    public qp0 D;
    public sp0 E;
    public boolean F;
    public boolean G;
    public x00 H;
    public j9.d I;
    public bi0 J;
    public ai0 K;
    public x0 L;
    public final String M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Boolean R;
    public boolean S;
    public final String T;
    public u00 U;
    public boolean V;
    public boolean W;

    /* renamed from: a0 */
    public qn f10416a0;

    /* renamed from: b0 */
    public hc0 f10417b0;

    /* renamed from: c0 */
    public no0 f10418c0;

    /* renamed from: d0 */
    public int f10419d0;

    /* renamed from: e0 */
    public int f10420e0;

    /* renamed from: f0 */
    public ul f10421f0;

    /* renamed from: g0 */
    public final ul f10422g0;

    /* renamed from: h0 */
    public ul f10423h0;

    /* renamed from: i0 */
    public final j6.l f10424i0;

    /* renamed from: j0 */
    public int f10425j0;

    /* renamed from: k0 */
    public j9.d f10426k0;
    public boolean l0;
    public final k9.z m0;

    /* renamed from: n0 */
    public int f10427n0;

    /* renamed from: o0 */
    public int f10428o0;

    /* renamed from: p0 */
    public int f10429p0;

    /* renamed from: q0 */
    public int f10430q0;

    /* renamed from: r0 */
    public int f10431r0;

    /* renamed from: s0 */
    public HashMap f10432s0;

    /* renamed from: t0 */
    public final WindowManager f10433t0;

    /* renamed from: u */
    public final d10 f10434u;

    /* renamed from: u0 */
    public final jj f10435u0;

    /* renamed from: v */
    public final of f10436v;

    /* renamed from: v0 */
    public boolean f10437v0;

    /* renamed from: w */
    public final cq0 f10438w;

    /* renamed from: x */
    public final hm f10439x;

    /* renamed from: y */
    public final l9.a f10440y;

    /* renamed from: z */
    public f9.g f10441z;

    public s00(d10 d10Var, x0 x0Var, String str, boolean z3, of ofVar, hm hmVar, l9.a aVar, f9.g gVar, j6.l lVar, jj jjVar, qp0 qp0Var, sp0 sp0Var, cq0 cq0Var) {
        super(d10Var);
        sp0 sp0Var2;
        String str2;
        this.F = false;
        this.G = false;
        this.S = true;
        this.T = "";
        this.f10427n0 = -1;
        this.f10428o0 = -1;
        this.f10429p0 = -1;
        this.f10430q0 = -1;
        this.f10431r0 = -1;
        this.f10434u = d10Var;
        this.L = x0Var;
        this.M = str;
        this.P = z3;
        this.f10436v = ofVar;
        this.f10438w = cq0Var;
        this.f10439x = hmVar;
        this.f10440y = aVar;
        this.f10441z = gVar;
        this.A = lVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f10433t0 = windowManager;
        k9.f0 f0Var = f9.k.C.f16813c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.B = displayMetrics;
        this.C = displayMetrics.density;
        this.f10435u0 = jjVar;
        this.D = qp0Var;
        this.E = sp0Var;
        this.m0 = new k9.z(d10Var.f5247a, this, this);
        this.f10437v0 = false;
        setBackgroundColor(0);
        if (((Boolean) g9.r.e.f17698c.a(sl.f10656ad)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            int i = k9.a0.f19634b;
            l9.i.d("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        nl nlVar = sl.Zc;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) rVar.f17698c.a(sl.Me)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        f9.k kVar = f9.k.C;
        settings.setUserAgentString(kVar.f16813c.E(d10Var, aVar.f20029u));
        Context context = getContext();
        wa.k9.a(context, new xe(settings, 23, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        F();
        addJavascriptInterface(new v00(this, new lx0(15, this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        j6.l lVar2 = this.f10424i0;
        if (lVar2 != null) {
            wl wlVar = (wl) lVar2.f18934w;
            com.google.android.gms.internal.consent_sdk.c a10 = kVar.f16817h.a();
            if (a10 != null) {
                ((ArrayBlockingQueue) a10.f13371v).offer(wlVar);
            }
        }
        wl wlVar2 = new wl(this.M);
        j6.l lVar3 = new j6.l(wlVar2);
        this.f10424i0 = lVar3;
        synchronized (wlVar2.f12272c) {
        }
        if (((Boolean) rVar.f17698c.a(sl.f11010x2)).booleanValue() && (sp0Var2 = this.E) != null && (str2 = sp0Var2.f11091b) != null) {
            wlVar2.c("gqi", str2);
        }
        ul d2 = wl.d();
        this.f10422g0 = d2;
        ((HashMap) lVar3.f18933v).put("native:view_create", d2);
        Context context2 = null;
        this.f10423h0 = null;
        this.f10421f0 = null;
        if (c7.a.f3894w == null) {
            c7.a.f3894w = new c7.a(4, false);
        }
        c7.a aVar2 = c7.a.f3894w;
        aVar2.getClass();
        k9.a0.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(d10Var);
        if (!defaultUserAgent.equals(aVar2.f3896v)) {
            int i10 = ca.h.e;
            try {
                context2 = d10Var.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (context2 == null) {
                d10Var.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(d10Var)).apply();
            }
            aVar2.f3896v = defaultUserAgent;
        }
        k9.a0.k("User agent is updated.");
        kVar.f16817h.f9640k.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final l9.a A() {
        return this.f10440y;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final sp0 A0() {
        return this.E;
    }

    public final /* synthetic */ void B(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void B0() {
        k9.a0.k("Cannot add text view to inner AdWebView");
    }

    public final /* synthetic */ void C(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void C0(x0 x0Var) {
        this.L = x0Var;
        requestLayout();
    }

    public final /* synthetic */ void D() {
        super.loadUrl("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void D0(String str, String str2) {
        Throwable th;
        String str3;
        try {
            try {
                if (!o0()) {
                    String str4 = (String) g9.r.e.f17698c.a(sl.f11024y0);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        try {
                            jSONObject.put("version", str4);
                            jSONObject.put("sdk", "Google Mobile Ads");
                            jSONObject.put("sdkVersion", "12.4.51-000");
                            str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (JSONException e) {
                        int i = k9.a0.f19634b;
                        l9.i.g("Unable to build MRAID_ENV", e);
                        str3 = null;
                    }
                    super.loadDataWithBaseURL(str, z00.a(str2, str3), "text/html", "UTF-8", null);
                    return;
                }
                int i10 = k9.a0.f19634b;
                l9.i.f("#004 The webview is destroyed. Ignoring action.");
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void E() {
        try {
            k9.f0.f19676l.post(new r00(this, 1));
        } catch (Throwable th) {
            f9.k.C.f16817h.d("AdWebViewImpl.loadUrlUnsafe", th);
            int i = k9.a0.f19634b;
            l9.i.g("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized bi0 E0() {
        return this.J;
    }

    public final synchronized void F() {
        try {
            qp0 qp0Var = this.D;
            if (qp0Var != null && qp0Var.m0) {
                int i = k9.a0.f19634b;
                l9.i.a("Disabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (!this.Q) {
                            setLayerType(1, null);
                        }
                        this.Q = true;
                    } finally {
                    }
                }
                return;
            }
            if (!this.P && !this.L.b()) {
                int i10 = k9.a0.f19634b;
                l9.i.a("Enabling hardware acceleration on an AdView.");
                synchronized (this) {
                    try {
                        if (this.Q) {
                            setLayerType(0, null);
                        }
                        this.Q = false;
                    } finally {
                    }
                }
                return;
            }
            int i11 = k9.a0.f19634b;
            l9.i.a("Enabling hardware acceleration on an overlay.");
            synchronized (this) {
                try {
                    if (this.Q) {
                        setLayerType(0, null);
                    }
                    this.Q = false;
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void F0(Context context) {
        d10 d10Var = this.f10434u;
        d10Var.setBaseContext(context);
        this.m0.f19735f = d10Var.f5247a;
    }

    public final synchronized void G() {
        if (!this.l0) {
            this.l0 = true;
            f9.k.C.f16817h.f9640k.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized j9.d G0() {
        return this.f10426k0;
    }

    public final synchronized void H() {
        try {
            HashMap hashMap = this.f10432s0;
            if (hashMap != null) {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((jz) it.next()).a();
                }
            }
            this.f10432s0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized ai0 H0() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final int I() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized boolean I0() {
        return this.P;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final qp0 J() {
        return this.D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.h00
    public final void J0(int i, boolean z3, boolean z9) {
        g9.a aVar;
        f90 f90Var;
        f90 f90Var2;
        wh0 wh0Var;
        int i10;
        g9.a aVar2;
        boolean z10;
        x00 x00Var = this.H;
        q00 q00Var = x00Var.f12390u;
        boolean y10 = x00.y(q00Var.f9696u.I0(), q00Var);
        boolean z11 = true;
        if (!y10 && z9) {
            z11 = false;
        }
        if (y10) {
            aVar = null;
            f90Var = null;
        } else {
            aVar = x00Var.f12394y;
            f90Var = null;
        }
        j9.m mVar = x00Var.f12395z;
        f90 f90Var3 = f90Var;
        j9.c cVar = x00Var.O;
        l9.a aVar3 = q00Var.f9696u.f10440y;
        if (z11) {
            f90Var2 = f90Var3;
        } else {
            f90Var2 = x00Var.E;
        }
        if (x00.x(q00Var)) {
            wh0Var = x00Var.f12388a0;
            i10 = i;
            z10 = z3;
            aVar2 = aVar;
        } else {
            wh0Var = f90Var3;
            i10 = i;
            aVar2 = aVar;
            z10 = z3;
        }
        x00Var.a(new AdOverlayInfoParcel(aVar2, mVar, cVar, q00Var, z10, i10, aVar3, f90Var2, wh0Var));
    }

    public final void K(boolean z3) {
        String str;
        HashMap hashMap = new HashMap();
        if (true != z3) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("isVisible", str);
        b("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void K0(int i) {
        this.f10425j0 = i;
    }

    @Override // g9.a
    public final void L() {
        x00 x00Var = this.H;
        if (x00Var != null) {
            x00Var.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void L0(boolean z3) {
        int i;
        j9.d dVar;
        int i10 = this.f10419d0;
        if (true != z3) {
            i = -1;
        } else {
            i = 1;
        }
        int i11 = i10 + i;
        this.f10419d0 = i11;
        if (i11 <= 0 && (dVar = this.I) != null) {
            synchronized (dVar.I) {
                try {
                    dVar.L = true;
                    a6.x xVar = dVar.K;
                    if (xVar != null) {
                        k9.b0 b0Var = k9.f0.f19676l;
                        b0Var.removeCallbacks(xVar);
                        b0Var.post(dVar.K);
                    }
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void M() {
        x00 x00Var = this.H;
        if (x00Var != null) {
            x00Var.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void M0(ai0 ai0Var) {
        this.K = ai0Var;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void N0(long j10, boolean z3) {
        String str;
        HashMap hashMap = new HashMap(2);
        if (true != z3) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("success", str);
        hashMap.put("duration", Long.toString(j10));
        b("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void O(int i) {
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void O0() {
        an1.j((wl) this.f10424i0.f18934w, this.f10422g0, "aeh2");
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f10440y.f20029u);
        b("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized String P() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void P0(boolean z3, int i, String str, boolean z9, boolean z10) {
        g9.a aVar;
        k00 k00Var;
        f90 f90Var;
        x00 x00Var = this.H;
        q00 q00Var = x00Var.f12390u;
        boolean I0 = q00Var.f9696u.I0();
        boolean y10 = x00.y(I0, q00Var);
        boolean z11 = true;
        if (!y10 && z9) {
            z11 = false;
        }
        if (y10) {
            aVar = null;
        } else {
            aVar = x00Var.f12394y;
        }
        if (I0) {
            k00Var = null;
        } else {
            k00Var = new k00(q00Var, x00Var.f12395z);
        }
        dp dpVar = x00Var.C;
        wh0 wh0Var = null;
        ep epVar = x00Var.D;
        boolean z12 = z11;
        k00 k00Var2 = k00Var;
        j9.c cVar = x00Var.O;
        l9.a aVar2 = q00Var.f9696u.f10440y;
        if (z12) {
            f90Var = null;
        } else {
            f90Var = x00Var.E;
        }
        if (x00.x(q00Var)) {
            wh0Var = x00Var.f12388a0;
        }
        x00Var.a(new AdOverlayInfoParcel(aVar, k00Var2, dpVar, epVar, cVar, q00Var, z3, i, str, aVar2, f90Var, wh0Var, z10));
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void Q() {
        x00 x00Var = this.H;
        if (x00Var != null) {
            x00Var.Q();
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void Q0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void S0(bi0 bi0Var) {
        this.J = bi0Var;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final of T0() {
        return this.f10436v;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final View U() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void U0(u00 u00Var) {
        if (this.U != null) {
            int i = k9.a0.f19634b;
            l9.i.c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.U = u00Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void V0(no0 no0Var) {
        this.f10418c0 = no0Var;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void W0(j9.e eVar, boolean z3, boolean z9, String str) {
        this.H.F(eVar, z3, z9, str);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void X0(String str, mp mpVar) {
        x00 x00Var = this.H;
        if (x00Var != null) {
            synchronized (x00Var.f12393x) {
                try {
                    List list = (List) x00Var.f12392w.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(mpVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void Y0(j9.d dVar) {
        this.I = dVar;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void Z0(int i) {
        ul ulVar = this.f10422g0;
        j6.l lVar = this.f10424i0;
        if (i == 0) {
            an1.j((wl) lVar.f18934w, ulVar, "aebb2");
        }
        an1.j((wl) lVar.f18934w, ulVar, "aeh2");
        lVar.getClass();
        ((wl) lVar.f18934w).c("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f10440y.f20029u);
        b("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.vq
    public final void a(String str, JSONObject jSONObject) {
        p(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final boolean a1() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.qq
    public final void b(String str, Map map) {
        try {
            c(str, g9.p.f17688g.f17689a.k(map));
        } catch (JSONException unused) {
            int i = k9.a0.f19634b;
            l9.i.f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void b1(qn qnVar) {
        this.f10416a0 = qnVar;
    }

    @Override // com.google.android.gms.internal.ads.qq
    public final void c(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder q10 = p.a.q("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String sb2 = q10.toString();
        int i = k9.a0.f19634b;
        l9.i.a("Dispatching AFMA event: ".concat(sb2));
        w(q10.toString());
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final p8 c1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized u00 d() {
        return this.U;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized jz d1(String str) {
        HashMap hashMap = this.f10432s0;
        if (hashMap == null) {
            return null;
        }
        return (jz) hashMap.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0045 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0001, B:6:0x001b, B:9:0x004a, B:11:0x004e, B:12:0x005b, B:17:0x0074, B:19:0x0093, B:21:0x0099, B:23:0x009f, B:26:0x00a9, B:29:0x00b8, B:32:0x0028, B:34:0x002c, B:39:0x0045, B:40:0x0048, B:41:0x0037, B:43:0x003d, B:44:0x0006, B:46:0x0014), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.h00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void destroy() {
        /*
            r5 = this;
            monitor-enter(r5)
            j6.l r0 = r5.f10424i0     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L6
            goto L1b
        L6:
            java.lang.Object r0 = r0.f18934w     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.wl r0 = (com.google.android.gms.internal.ads.wl) r0     // Catch: java.lang.Throwable -> L59
            f9.k r1 = f9.k.C     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.px r1 = r1.f16817h     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.consent_sdk.c r1 = r1.a()     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r1.f13371v     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.ArrayBlockingQueue r1 = (java.util.concurrent.ArrayBlockingQueue) r1     // Catch: java.lang.Throwable -> L59
            r1.offer(r0)     // Catch: java.lang.Throwable -> L59
        L1b:
            k9.z r0 = r5.m0     // Catch: java.lang.Throwable -> L59
            r1 = 0
            r0.f19733c = r1     // Catch: java.lang.Throwable -> L59
            java.lang.Object r2 = r0.f19735f     // Catch: java.lang.Throwable -> L59
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L59
            r3 = 0
            if (r2 != 0) goto L28
            goto L4a
        L28:
            boolean r4 = r0.f19731a     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r0.e     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.s00 r4 = (com.google.android.gms.internal.ads.s00) r4     // Catch: java.lang.Throwable -> L59
            android.view.Window r2 = r2.getWindow()     // Catch: java.lang.Throwable -> L59
            if (r2 != 0) goto L37
            goto L42
        L37:
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L42
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()     // Catch: java.lang.Throwable -> L59
            goto L43
        L42:
            r2 = r3
        L43:
            if (r2 == 0) goto L48
            r2.removeOnGlobalLayoutListener(r4)     // Catch: java.lang.Throwable -> L59
        L48:
            r0.f19731a = r1     // Catch: java.lang.Throwable -> L59
        L4a:
            j9.d r0 = r5.I     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L5b
            r0.l()     // Catch: java.lang.Throwable -> L59
            j9.d r0 = r5.I     // Catch: java.lang.Throwable -> L59
            r0.f0()     // Catch: java.lang.Throwable -> L59
            r5.I = r3     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            r0 = move-exception
            goto Lc2
        L5b:
            r5.J = r3     // Catch: java.lang.Throwable -> L59
            r5.K = r3     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.x00 r0 = r5.H     // Catch: java.lang.Throwable -> L59
            r0.e()     // Catch: java.lang.Throwable -> L59
            r5.f10418c0 = r3     // Catch: java.lang.Throwable -> L59
            r5.f10441z = r3     // Catch: java.lang.Throwable -> L59
            r5.setOnClickListener(r3)     // Catch: java.lang.Throwable -> L59
            r5.setOnTouchListener(r3)     // Catch: java.lang.Throwable -> L59
            boolean r0 = r5.O     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L74
            monitor-exit(r5)
            return
        L74:
            f9.k r0 = f9.k.C     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.cz r0 = r0.A     // Catch: java.lang.Throwable -> L59
            r0.a(r5)     // Catch: java.lang.Throwable -> L59
            r5.H()     // Catch: java.lang.Throwable -> L59
            r0 = 1
            r5.O = r0     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.f10766hc     // Catch: java.lang.Throwable -> L59
            g9.r r1 = g9.r.e     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.ql r1 = r1.f17698c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L59
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto Lb8
            com.google.android.gms.internal.ads.d10 r0 = r5.f10434u     // Catch: java.lang.Throwable -> L59
            android.app.Activity r0 = r0.f5247a     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto La9
            boolean r0 = r0.isDestroyed()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto La9
            java.lang.String r0 = "Destroying the WebView immediately..."
            k9.a0.k(r0)     // Catch: java.lang.Throwable -> L59
            r5.r()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r5)
            return
        La9:
            java.lang.String r0 = "Initiating WebView self destruct sequence in 3..."
            k9.a0.k(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = "Loading blank page in WebView, 2..."
            k9.a0.k(r0)     // Catch: java.lang.Throwable -> L59
            r5.E()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r5)
            return
        Lb8:
            java.lang.String r0 = "Destroying the WebView immediately..."
            k9.a0.k(r0)     // Catch: java.lang.Throwable -> L59
            r5.r()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r5)
            return
        Lc2:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s00.destroy():void");
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void e1(boolean z3) {
        this.H.Y = z3;
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (o0()) {
            int i = k9.a0.f19634b;
            l9.i.i(null, "#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (((Boolean) g9.r.e.f17698c.a(sl.f10782ic)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
            xx.f12655f.f(new r1(4, this, str, valueCallback));
        } else {
            super.evaluateJavascript(str, valueCallback);
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final Activity f() {
        return this.f10434u.f5247a;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void f1(String str, lx0 lx0Var) {
        x00 x00Var = this.H;
        if (x00Var != null) {
            synchronized (x00Var.f12393x) {
                try {
                    List<mp> list = (List) x00Var.f12392w.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (mp mpVar : list) {
                        if (mpVar instanceof sq) {
                            if (((sq) mpVar).f11108u.equals((mp) lx0Var.f8177v)) {
                                arrayList.add(mpVar);
                            }
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void finalize() {
        try {
            synchronized (this) {
                try {
                    if (!this.O) {
                        this.H.e();
                        f9.k.C.A.a(this);
                        H();
                        G();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final ul g() {
        return this.f10422g0;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void g1(qp0 qp0Var, sp0 sp0Var) {
        this.D = qp0Var;
        this.E = sp0Var;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void h() {
        j9.d z02 = z0();
        if (z02 != null) {
            z02.F.f19080v = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final Context h0() {
        return this.f10434u.f5249c;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void h1(String str, mp mpVar) {
        x00 x00Var = this.H;
        if (x00Var != null) {
            x00Var.b(str, mpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final j6.l i() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final cq0 i0() {
        return this.f10438w;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized boolean i1() {
        return this.f10419d0 > 0;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final j6.l j() {
        return this.f10424i0;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final /* synthetic */ x00 j0() {
        return this.H;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized qn j1() {
        return this.f10416a0;
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final void k(zh zhVar) {
        boolean z3;
        synchronized (this) {
            z3 = zhVar.f13171j;
            this.V = z3;
        }
        K(z3);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void k0(boolean z3, int i, String str, String str2, boolean z9) {
        g9.a aVar;
        k00 k00Var;
        f90 f90Var;
        x00 x00Var = this.H;
        q00 q00Var = x00Var.f12390u;
        boolean I0 = q00Var.f9696u.I0();
        boolean y10 = x00.y(I0, q00Var);
        boolean z10 = true;
        if (!y10 && z9) {
            z10 = false;
        }
        if (y10) {
            aVar = null;
        } else {
            aVar = x00Var.f12394y;
        }
        if (I0) {
            k00Var = null;
        } else {
            k00Var = new k00(q00Var, x00Var.f12395z);
        }
        dp dpVar = x00Var.C;
        wh0 wh0Var = null;
        ep epVar = x00Var.D;
        boolean z11 = z10;
        k00 k00Var2 = k00Var;
        j9.c cVar = x00Var.O;
        l9.a aVar2 = q00Var.f9696u.f10440y;
        if (z11) {
            f90Var = null;
        } else {
            f90Var = x00Var.E;
        }
        if (x00.x(q00Var)) {
            wh0Var = x00Var.f12388a0;
        }
        x00Var.a(new AdOverlayInfoParcel(aVar, k00Var2, dpVar, epVar, cVar, q00Var, z3, i, str, str2, aVar2, f90Var, wh0Var));
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void k1() {
        this.f10437v0 = true;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized x0 l0() {
        return this.L;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void l1() {
        boolean z3;
        HashMap hashMap = new HashMap(3);
        f9.k kVar = f9.k.C;
        k9.a aVar = kVar.i;
        synchronized (aVar) {
            z3 = aVar.f19632a;
        }
        hashMap.put("app_muted", String.valueOf(z3));
        hashMap.put("app_volume", String.valueOf(kVar.i.a()));
        hashMap.put("device_volume", String.valueOf(k9.a.b(getContext())));
        b("volume", hashMap);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.h00
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!o0()) {
            super.loadData(str, str2, str3);
        } else {
            int i = k9.a0.f19634b;
            l9.i.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.h00
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            try {
                if (!o0()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                } else {
                    int i = k9.a0.f19634b;
                    l9.i.f("#004 The webview is destroyed. Ignoring action.");
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.h00
    public final synchronized void loadUrl(String str) {
        if (!o0()) {
            try {
                k9.f0.f19676l.post(new ac.a(this, 10, str));
                return;
            } catch (Throwable th) {
                f9.k.C.f16817h.d("AdWebViewImpl.loadUrl", th);
                int i = k9.a0.f19634b;
                l9.i.g("Could not call loadUrl. ", th);
                return;
            }
        }
        int i10 = k9.a0.f19634b;
        l9.i.f("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized String m() {
        return this.T;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void m0(int i) {
        j9.d dVar = this.I;
        if (dVar != null) {
            dVar.O(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void m1(boolean z3) {
        String str;
        try {
            boolean z9 = this.P;
            this.P = z3;
            F();
            if (z3 != z9) {
                if (((Boolean) g9.r.e.f17698c.a(sl.f11040z0)).booleanValue()) {
                    if (!this.L.b()) {
                    }
                }
                if (true != z3) {
                    str = "default";
                } else {
                    str = "expanded";
                }
                try {
                    c("onStateChanged", new JSONObject().put("state", str));
                } catch (JSONException e) {
                    int i = k9.a0.f19634b;
                    l9.i.d("Error occurred while dispatching state change.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized String n() {
        sp0 sp0Var = this.E;
        if (sp0Var == null) {
            return null;
        }
        return sp0Var.f11091b;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void n0(String str, String str2) {
        x00 x00Var = this.H;
        wh0 wh0Var = x00Var.f12388a0;
        q00 q00Var = x00Var.f12390u;
        x00Var.a(new AdOverlayInfoParcel(q00Var, q00Var.f9696u.f10440y, str, str2, wh0Var));
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void n1(hc0 hc0Var) {
        this.f10417b0 = hc0Var;
    }

    @Override // com.google.android.gms.internal.ads.vq
    public final void o(String str) {
        w(str);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized boolean o0() {
        return this.O;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized boolean o1() {
        return this.S;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z3 = true;
            if (!o0()) {
                k9.z zVar = this.m0;
                zVar.f19732b = true;
                if (zVar.f19733c) {
                    zVar.b();
                }
            }
            if (this.f10437v0) {
                onResume();
                this.f10437v0 = false;
            }
            boolean z9 = this.V;
            x00 x00Var = this.H;
            if (x00Var != null && x00Var.C()) {
                if (!this.W) {
                    synchronized (this.H.f12393x) {
                    }
                    synchronized (this.H.f12393x) {
                    }
                    this.W = true;
                }
                t();
            } else {
                z3 = z9;
            }
            K(z3);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x0013, B:10:0x0017, B:15:0x0030, B:16:0x0033, B:17:0x0022, B:19:0x0028, B:20:0x0038, B:22:0x003f, B:24:0x0043, B:26:0x0049, B:28:0x004f, B:30:0x0059, B:31:0x005d, B:34:0x005f, B:35:0x0063, B:38:0x0065, B:42:0x006a, B:47:0x006d, B:48:0x006e, B:37:0x0064, B:33:0x005e), top: B:2:0x0001, inners: #1, #2 }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDetachedFromWindow() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.o0()     // Catch: java.lang.Throwable -> L36
            r1 = 0
            if (r0 != 0) goto L38
            k9.z r0 = r4.m0     // Catch: java.lang.Throwable -> L36
            r0.f19732b = r1     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r0.f19735f     // Catch: java.lang.Throwable -> L36
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L13
            goto L38
        L13:
            boolean r3 = r0.f19731a     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L38
            java.lang.Object r3 = r0.e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.s00 r3 = (com.google.android.gms.internal.ads.s00) r3     // Catch: java.lang.Throwable -> L36
            android.view.Window r2 = r2.getWindow()     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L22
            goto L2d
        L22:
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L2d
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()     // Catch: java.lang.Throwable -> L36
            goto L2e
        L2d:
            r2 = 0
        L2e:
            if (r2 == 0) goto L33
            r2.removeOnGlobalLayoutListener(r3)     // Catch: java.lang.Throwable -> L36
        L33:
            r0.f19731a = r1     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r0 = move-exception
            goto L73
        L38:
            super.onDetachedFromWindow()     // Catch: java.lang.Throwable -> L36
            boolean r0 = r4.W     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L6e
            com.google.android.gms.internal.ads.x00 r0 = r4.H     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L6e
            boolean r0 = r0.C()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L6e
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L6e
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.isAlive()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L6e
            com.google.android.gms.internal.ads.x00 r0 = r4.H     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.f12393x     // Catch: java.lang.Throwable -> L36
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.x00 r0 = r4.H     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.f12393x     // Catch: java.lang.Throwable -> L36
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            r4.W = r1     // Catch: java.lang.Throwable -> L36
            goto L6e
        L68:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r1     // Catch: java.lang.Throwable -> L36
        L6b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r1     // Catch: java.lang.Throwable -> L36
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            r4.K(r1)
            return
        L73:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s00.onDetachedFromWindow():void");
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) g9.r.e.f17698c.a(sl.f11003wc)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            k9.f0 f0Var = f9.k.C.f16813c;
            k9.f0.s(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            String l10 = a5.a.l(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()), "Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i = k9.a0.f19634b;
            l9.i.a(l10);
            f9.k.C.f16817h.d("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (o0()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue <= 0.0f || canScrollVertically(-1)) {
                if (axisValue >= 0.0f || canScrollVertically(1)) {
                    if (axisValue2 <= 0.0f || canScrollHorizontally(-1)) {
                        if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean t3 = t();
        j9.d z02 = z0();
        if (z02 != null && t3 && z02.G) {
            z02.G = false;
            z02.f19066x.s0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d3 A[Catch: all -> 0x000d, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:18:0x0025, B:23:0x002d, B:25:0x003f, B:28:0x0044, B:30:0x004b, B:33:0x0055, B:36:0x005a, B:39:0x006b, B:40:0x0083, B:44:0x0072, B:47:0x0077, B:53:0x0095, B:55:0x00a7, B:58:0x00ac, B:60:0x00c8, B:61:0x00d0, B:64:0x00cc, B:65:0x00d5, B:67:0x00db, B:70:0x00e6, B:77:0x010a, B:79:0x0111, B:82:0x0118, B:84:0x012a, B:86:0x0138, B:89:0x0145, B:92:0x0148, B:94:0x01bc, B:95:0x01bf, B:97:0x01c6, B:102:0x01d3, B:104:0x01d9, B:105:0x01dc, B:107:0x01e0, B:108:0x01e9, B:114:0x01f4), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012a A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:18:0x0025, B:23:0x002d, B:25:0x003f, B:28:0x0044, B:30:0x004b, B:33:0x0055, B:36:0x005a, B:39:0x006b, B:40:0x0083, B:44:0x0072, B:47:0x0077, B:53:0x0095, B:55:0x00a7, B:58:0x00ac, B:60:0x00c8, B:61:0x00d0, B:64:0x00cc, B:65:0x00d5, B:67:0x00db, B:70:0x00e6, B:77:0x010a, B:79:0x0111, B:82:0x0118, B:84:0x012a, B:86:0x0138, B:89:0x0145, B:92:0x0148, B:94:0x01bc, B:95:0x01bf, B:97:0x01c6, B:102:0x01d3, B:104:0x01d9, B:105:0x01dc, B:107:0x01e0, B:108:0x01e9, B:114:0x01f4), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0148 A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:18:0x0025, B:23:0x002d, B:25:0x003f, B:28:0x0044, B:30:0x004b, B:33:0x0055, B:36:0x005a, B:39:0x006b, B:40:0x0083, B:44:0x0072, B:47:0x0077, B:53:0x0095, B:55:0x00a7, B:58:0x00ac, B:60:0x00c8, B:61:0x00d0, B:64:0x00cc, B:65:0x00d5, B:67:0x00db, B:70:0x00e6, B:77:0x010a, B:79:0x0111, B:82:0x0118, B:84:0x012a, B:86:0x0138, B:89:0x0145, B:92:0x0148, B:94:0x01bc, B:95:0x01bf, B:97:0x01c6, B:102:0x01d3, B:104:0x01d9, B:105:0x01dc, B:107:0x01e0, B:108:0x01e9, B:114:0x01f4), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s00.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.h00
    public final void onPause() {
        if (!o0()) {
            try {
                super.onPause();
                if (((Boolean) g9.r.e.f17698c.a(sl.ae)).booleanValue() && ya.ee.a("MUTE_AUDIO")) {
                    int i = k9.a0.f19634b;
                    l9.i.a("Muting webview");
                    int i10 = y5.b.f30913a;
                    if (z5.k.f31930h.b()) {
                        ((WebViewProviderBoundaryInterface) y5.b.b(this).f25315v).setAudioMuted(true);
                        return;
                    }
                    throw z5.k.a();
                }
            } catch (Exception e) {
                int i11 = k9.a0.f19634b;
                l9.i.d("Could not pause webview.", e);
                if (((Boolean) g9.r.e.f17698c.a(sl.f10704de)).booleanValue()) {
                    f9.k.C.f16817h.d("AdWebViewImpl.onPause", e);
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.h00
    public final void onResume() {
        if (!o0()) {
            try {
                super.onResume();
                if (((Boolean) g9.r.e.f17698c.a(sl.ae)).booleanValue() && ya.ee.a("MUTE_AUDIO")) {
                    int i = k9.a0.f19634b;
                    l9.i.a("Unmuting webview");
                    int i10 = y5.b.f30913a;
                    if (z5.k.f31930h.b()) {
                        ((WebViewProviderBoundaryInterface) y5.b.b(this).f25315v).setAudioMuted(false);
                        return;
                    }
                    throw z5.k.a();
                }
            } catch (Exception e) {
                int i11 = k9.a0.f19634b;
                l9.i.d("Could not resume webview.", e);
                if (((Boolean) g9.r.e.f17698c.a(sl.f10704de)).booleanValue()) {
                    f9.k.C.f16817h.d("AdWebViewImpl.onResume", e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.f10920r4
            g9.r r1 = g9.r.e
            com.google.android.gms.internal.ads.ql r1 = r1.f17698c
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L20
            com.google.android.gms.internal.ads.x00 r0 = r7.H
            java.lang.Object r3 = r0.f12393x
            monitor-enter(r3)
            boolean r0 = r0.M     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L20
            r0 = r1
            goto L25
        L20:
            r0 = r2
            goto L25
        L22:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r8
        L25:
            com.google.android.gms.internal.ads.x00 r3 = r7.H
            boolean r3 = r3.C()
            if (r3 == 0) goto L3b
            com.google.android.gms.internal.ads.x00 r3 = r7.H
            java.lang.Object r4 = r3.f12393x
            monitor-enter(r4)
            boolean r3 = r3.N     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L3d
            goto L3b
        L38:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r8
        L3b:
            if (r0 == 0) goto L4c
        L3d:
            monitor-enter(r7)
            com.google.android.gms.internal.ads.qn r0 = r7.f10416a0     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L48
            r0.s(r8)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r8 = move-exception
            goto L4a
        L48:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L46
            goto L8e
        L4a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L46
            throw r8
        L4c:
            com.google.android.gms.internal.ads.of r0 = r7.f10436v
            if (r0 == 0) goto L55
            com.google.android.gms.internal.ads.lf r0 = r0.f9103b
            r0.b(r8)
        L55:
            com.google.android.gms.internal.ads.hm r0 = r7.f10439x
            if (r0 == 0) goto L8e
            int r3 = r8.getAction()
            if (r3 != r1) goto L74
            long r3 = r8.getEventTime()
            android.view.MotionEvent r1 = r0.f6837a
            long r5 = r1.getEventTime()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L74
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r8)
            r0.f6837a = r1
            goto L8e
        L74:
            int r1 = r8.getAction()
            if (r1 != 0) goto L8e
            long r3 = r8.getEventTime()
            android.view.MotionEvent r1 = r0.f6838b
            long r5 = r1.getEventTime()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L8e
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r8)
            r0.f6838b = r1
        L8e:
            boolean r0 = r7.o0()
            if (r0 == 0) goto L95
            return r2
        L95:
            boolean r8 = super.onTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s00.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.gms.internal.ads.vq
    public final void p(String str, String str2) {
        w(a5.a.l(new StringBuilder(g3.a.v(str, 1, String.valueOf(str2).length()) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final ArrayList p0() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void p1(boolean z3) {
        this.S = z3;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized int q() {
        return this.f10425j0;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final int q0() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized boolean q1() {
        return this.N;
    }

    public final synchronized void r() {
        k9.a0.k("Destroying WebView!");
        G();
        k9.f0.f19676l.post(new r00(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void s() {
        hc0 hc0Var = this.f10417b0;
        if (hc0Var != null) {
            k9.f0.f19676l.post(new e40(8, hc0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void s0() {
        if (this.f10421f0 == null) {
            j6.l lVar = this.f10424i0;
            an1.j((wl) lVar.f18934w, this.f10422g0, "aes2");
            ul d2 = wl.d();
            this.f10421f0 = d2;
            ((HashMap) lVar.f18933v).put("native:view_show", d2);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f10440y.f20029u);
        b("onshow", hashMap);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.h00
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof x00) {
            this.H = (x00) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (o0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            int i = k9.a0.f19634b;
            l9.i.d("Could not stop loading webview.", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r10.f10431r0 != r9) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r10.f10431r0 != r9) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t() {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s00.t():boolean");
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized no0 t0() {
        return this.f10418c0;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final WebView u() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void u0(String str, jz jzVar) {
        try {
            if (this.f10432s0 == null) {
                this.f10432s0 = new HashMap();
            }
            this.f10432s0.put(str, jzVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // f9.g
    public final synchronized void v() {
        f9.g gVar = this.f10441z;
        if (gVar != null) {
            gVar.v();
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final ac.b v0() {
        hm hmVar = this.f10439x;
        if (hmVar == null) {
            return v81.f11836v;
        }
        return (q81) ed1.Y(q81.t(v81.f11836v), ((Long) vm.f11943c.p()).longValue(), TimeUnit.MILLISECONDS, hmVar.f6839c);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Boolean r0 = r3.R     // Catch: java.lang.Throwable -> L75
            monitor-exit(r3)
            r1 = 0
            if (r0 != 0) goto L30
            monitor-enter(r3)
            f9.k r0 = f9.k.C     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.px r0 = r0.f16817h     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r0.f9632a     // Catch: java.lang.Throwable -> L22
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.Boolean r0 = r0.f9639j     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r3.R = r0     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L20
            java.lang.String r0 = "(function(){})()"
            r3.evaluateJavascript(r0, r1)     // Catch: java.lang.Throwable -> L22 java.lang.IllegalStateException -> L24
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L22 java.lang.IllegalStateException -> L24
            r3.x(r0)     // Catch: java.lang.Throwable -> L22 java.lang.IllegalStateException -> L24
        L20:
            monitor-exit(r3)
            goto L30
        L22:
            r4 = move-exception
            goto L2e
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L22
            r3.x(r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)
            goto L30
        L2b:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r4     // Catch: java.lang.Throwable -> L22
        L2e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r4
        L30:
            monitor-enter(r3)
            java.lang.Boolean r0 = r3.R     // Catch: java.lang.Throwable -> L72
            monitor-exit(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L53
            monitor-enter(r3)
            boolean r0 = r3.o0()     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L48
            r3.evaluateJavascript(r4, r1)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            goto L6f
        L46:
            r4 = move-exception
            goto L51
        L48:
            int r4 = k9.a0.f19634b     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "#004 The webview is destroyed. Ignoring action."
            l9.i.f(r4)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            goto L6f
        L51:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L46
            throw r4
        L53:
            java.lang.String r0 = "javascript:"
            java.lang.String r4 = r0.concat(r4)
            monitor-enter(r3)
            boolean r0 = r3.o0()     // Catch: java.lang.Throwable -> L65
            if (r0 != 0) goto L67
            r3.loadUrl(r4)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r3)
            goto L6f
        L65:
            r4 = move-exception
            goto L70
        L67:
            int r4 = k9.a0.f19634b     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "#004 The webview is destroyed. Ignoring action."
            l9.i.f(r4)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r3)
        L6f:
            return
        L70:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L65
            throw r4
        L72:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L72
            throw r4
        L75:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L75
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s00.w(java.lang.String):void");
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void w0(j9.d dVar) {
        this.f10426k0 = dVar;
    }

    public final void x(Boolean bool) {
        synchronized (this) {
            this.R = bool;
        }
        px pxVar = f9.k.C.f16817h;
        synchronized (pxVar.f9632a) {
            pxVar.f9639j = bool;
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void x0(boolean z3) {
        boolean z9;
        j9.d dVar = this.I;
        if (dVar != null) {
            x00 x00Var = this.H;
            synchronized (x00Var.f12393x) {
                z9 = x00Var.K;
            }
            dVar.z4(z9, z3);
            return;
        }
        this.N = z3;
    }

    @Override // f9.g
    public final synchronized void y() {
        f9.g gVar = this.f10441z;
        if (gVar != null) {
            gVar.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized void y0(int i, boolean z3) {
        if (z3) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        j9.d dVar = this.I;
        if (dVar != null) {
            j9.j jVar = dVar.F;
            if (z3) {
                jVar.setBackgroundColor(0);
                dVar.H = i;
                Window window = dVar.f19064v.getWindow();
                if (((Boolean) g9.r.e.f17698c.a(sl.f10900q1)).booleanValue() && Build.VERSION.SDK_INT >= 31 && window != null) {
                    window.setBackgroundBlurRadius(i);
                }
            } else {
                jVar.setBackgroundColor(-16777216);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final synchronized j9.d z0() {
        return this.I;
    }
}

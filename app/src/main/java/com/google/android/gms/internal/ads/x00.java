package com.google.android.gms.internal.ads;
import f9.k;
import g9.a;
import j9.m;
import k9.r;
import l9.a;
import q3.p;
import r.e;
import a0.k;
import a0.m;
import ac.b;
import c2.y2;
import c7.t;
import eb.y;
import f9.a;
import g9.r;
import j6.l;
import j9.c;
import j9.e;
import k9.a0;
import k9.b0;
import k9.f0;
import k9.p;
import l9.i;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class x00 extends WebViewClient implements g9.a, f90 {

    /* renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f12387c0 = 0;
    public a10 A;
    public b10 B;
    public dp C;
    public ep D;
    public f90 E;
    public boolean F;
    public boolean G;
    public int H;
    public String I;
    public String J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public j9.c O;
    public pt P;
    public f9.a Q;
    public mt R;
    public mw S;
    public be0 T;
    public c60 U;
    public boolean V;
    public boolean W;
    public int X;
    public boolean Y;
    public final HashSet Z;

    /* renamed from: a0, reason: collision with root package name */
    public final wh0 f12388a0;

    /* renamed from: b0, reason: collision with root package name */
    public c2.y2 f12389b0;

    /* renamed from: u, reason: collision with root package name */
    public final q00 f12390u;

    /* renamed from: v, reason: collision with root package name */
    public final jj f12391v;

    /* renamed from: w, reason: collision with root package name */
    public final HashMap f12392w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f12393x;

    /* renamed from: y, reason: collision with root package name */
    public g9.a f12394y;

    /* renamed from: z, reason: collision with root package name */
    public j9.m f12395z;

    public x00(q00 q00Var, jj jjVar, boolean z3, wh0 wh0Var) {
        pt ptVar = new pt(q00Var, q00Var.h0(), new ll(q00Var.getContext()));
        this.f12392w = new HashMap();
        this.f12393x = new Object();
        this.H = 0;
        this.I = "";
        this.J = "";
        this.f12391v = jjVar;
        this.f12390u = q00Var;
        this.K = z3;
        this.P = ptVar;
        this.R = null;
        this.Z = new HashSet(Arrays.asList(((String) g9.r.e.f17698c.a(sl.E6)).split(",")));
        this.f12388a0 = wh0Var;
    }

    public static WebResourceResponse t() {
        if (((Boolean) g9.r.e.f17698c.a(sl.f10917r1)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean x(q00 q00Var) {
        qp0 qp0Var = q00Var.f9696u.D;
        if (qp0Var != null && qp0Var.b()) {
            return true;
        }
        return false;
    }

    public static final boolean y(boolean z3, q00 q00Var) {
        if (z3 && !q00Var.f9696u.l0().b() && !q00Var.f9696u.P().equals("interstitial_mb")) {
            return true;
        }
        return false;
    }

    public final void B(g30 g30Var, rh0 rh0Var, be0 be0Var) {
        c("/open");
        b("/open", new tp(this.Q, this.R, rh0Var, be0Var, g30Var, null, null));
    }

    public final boolean C() {
        boolean z3;
        synchronized (this.f12393x) {
            z3 = this.L;
        }
        return z3;
    }

    public final void D() {
        mw mwVar = this.S;
        if (mwVar != null) {
            q00 q00Var = this.f12390u;
            s00 s00Var = q00Var.f9696u;
            boolean z3 = q3.p.f23420a;
            if (s00Var.isAttachedToWindow()) {
                r(s00Var, mwVar, 10);
                return;
            }
            c2.y2 y2Var = this.f12389b0;
            if (y2Var != null) {
                q00Var.removeOnAttachStateChangeListener(y2Var);
            }
            c2.y2 y2Var2 = new c2.y2(this, mwVar);
            this.f12389b0 = y2Var2;
            q00Var.addOnAttachStateChangeListener(y2Var2);
        }
    }

    public final void E() {
        s00 s00Var;
        j6.l lVar;
        a10 a10Var = this.A;
        q00 q00Var = this.f12390u;
        if (a10Var != null && ((this.V && this.X <= 0) || this.W || this.G)) {
            if (((Boolean) g9.r.e.f17698c.a(sl.f11010x2)).booleanValue() && (lVar = (s00Var = q00Var.f9696u).f10424i0) != null) {
                an1.j((wl) lVar.f18934w, s00Var.f10422g0, "awfllc");
            }
            a10 a10Var2 = this.A;
            boolean z3 = false;
            if (!this.W && !this.G) {
                z3 = true;
            }
            a10Var2.h(this.I, this.H, this.J, z3);
            this.A = null;
        }
        s00 s00Var2 = q00Var.f9696u;
        if (s00Var2.f10423h0 == null) {
            j6.l lVar2 = s00Var2.f10424i0;
            lVar2.getClass();
            ul d2 = wl.d();
            s00Var2.f10423h0 = d2;
            ((HashMap) lVar2.f18933v).put("native:view_load", d2);
        }
    }

    public final void F(j9.e eVar, boolean z3, boolean z9, String str) {
        boolean z10;
        boolean z11;
        g9.a aVar;
        j9.m mVar;
        q00 q00Var = this.f12390u;
        boolean I0 = q00Var.f9696u.I0();
        boolean z12 = false;
        if (y(I0, q00Var) || z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || !z3) {
            z11 = I0;
            z12 = true;
        } else {
            z11 = I0;
        }
        f90 f90Var = null;
        if (z10) {
            aVar = null;
        } else {
            aVar = this.f12394y;
        }
        if (z11) {
            mVar = null;
        } else {
            mVar = this.f12395z;
        }
        j9.c cVar = this.O;
        l9.a aVar2 = q00Var.f9696u.f10440y;
        if (!z12) {
            f90Var = this.E;
        }
        a(new AdOverlayInfoParcel(eVar, aVar, mVar, cVar, aVar2, q00Var, f90Var, str));
    }

    @Override // g9.a
    public final void L() {
        g9.a aVar = this.f12394y;
        if (aVar != null) {
            aVar.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void M() {
        f90 f90Var = this.E;
        if (f90Var != null) {
            f90Var.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void Q() {
        f90 f90Var = this.E;
        if (f90Var != null) {
            f90Var.Q();
        }
    }

    public final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        j9.e eVar;
        mt mtVar = this.R;
        boolean z3 = false;
        if (mtVar != null) {
            synchronized (mtVar.G) {
                if (mtVar.N != null) {
                    z3 = true;
                }
            }
        }
        eb.y yVar = f9.k.C.f16812b;
        eb.y.c(this.f12390u.getContext(), adOverlayInfoParcel, !z3, this.T);
        mw mwVar = this.S;
        if (mwVar != null) {
            String str = adOverlayInfoParcel.F;
            if (str == null && (eVar = adOverlayInfoParcel.f4263u) != null) {
                str = eVar.f19070v;
            }
            mwVar.a(str);
        }
    }

    public final void b(String str, mp mpVar) {
        synchronized (this.f12393x) {
            try {
                HashMap hashMap = this.f12392w;
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    hashMap.put(str, list);
                }
                list.add(mpVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) {
        synchronized (this.f12393x) {
            try {
                List list = (List) this.f12392w.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        mw mwVar = this.S;
        if (mwVar != null) {
            synchronized (mwVar.f8444h) {
                mwVar.f8439b.keySet();
                v81 e = ed1.e(Collections.EMPTY_MAP);
                dq dqVar = new dq(1, mwVar);
                wx wxVar = xx.f12657h;
                b81 c02 = ed1.c0(e, dqVar, wxVar);
                ac.b Y = ed1.Y(c02, 10L, TimeUnit.SECONDS, xx.f12654d);
                c02.a(new t81(c02, 0, new tf(mwVar, Y)), wxVar);
                mw.f8437l.add(Y);
            }
            this.S = null;
        }
        c2.y2 y2Var = this.f12389b0;
        if (y2Var != null) {
            this.f12390u.removeOnAttachStateChangeListener(y2Var);
        }
        synchronized (this.f12393x) {
            try {
                this.f12392w.clear();
                this.f12394y = null;
                this.f12395z = null;
                this.A = null;
                this.B = null;
                this.C = null;
                this.D = null;
                this.F = false;
                this.K = false;
                this.L = false;
                this.M = false;
                this.O = null;
                this.Q = null;
                this.P = null;
                mt mtVar = this.R;
                if (mtVar != null) {
                    mtVar.u(true);
                    this.R = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0299 A[Catch: NoClassDefFoundError -> 0x0024, Exception -> 0x0027, TryCatch #17 {Exception -> 0x0027, NoClassDefFoundError -> 0x0024, blocks: (B:3:0x0014, B:5:0x0021, B:6:0x002a, B:8:0x003a, B:11:0x0041, B:13:0x004d, B:15:0x0069, B:17:0x0083, B:19:0x009c, B:20:0x009f, B:21:0x00a2, B:23:0x00b4, B:26:0x00be, B:28:0x00cc, B:29:0x00e1, B:78:0x0227, B:51:0x01fc, B:54:0x02f1, B:56:0x0303, B:58:0x0309, B:60:0x0317, B:67:0x025f, B:68:0x0298, B:50:0x01c7, B:83:0x0142, B:104:0x00d7, B:105:0x0299, B:107:0x02a3, B:109:0x02a9, B:112:0x02ac, B:113:0x02ad, B:114:0x02ca, B:117:0x02cd, B:118:0x02ce, B:120:0x02dc, B:125:0x02e9, B:129:0x02ec, B:116:0x02cb, B:111:0x02aa), top: B:2:0x0014, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4 A[Catch: NoClassDefFoundError -> 0x0024, Exception -> 0x0027, TryCatch #17 {Exception -> 0x0027, NoClassDefFoundError -> 0x0024, blocks: (B:3:0x0014, B:5:0x0021, B:6:0x002a, B:8:0x003a, B:11:0x0041, B:13:0x004d, B:15:0x0069, B:17:0x0083, B:19:0x009c, B:20:0x009f, B:21:0x00a2, B:23:0x00b4, B:26:0x00be, B:28:0x00cc, B:29:0x00e1, B:78:0x0227, B:51:0x01fc, B:54:0x02f1, B:56:0x0303, B:58:0x0309, B:60:0x0317, B:67:0x025f, B:68:0x0298, B:50:0x01c7, B:83:0x0142, B:104:0x00d7, B:105:0x0299, B:107:0x02a3, B:109:0x02a9, B:112:0x02ac, B:113:0x02ad, B:114:0x02ca, B:117:0x02cd, B:118:0x02ce, B:120:0x02dc, B:125:0x02e9, B:129:0x02ec, B:116:0x02cb, B:111:0x02aa), top: B:2:0x0014, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02f1 A[Catch: NoClassDefFoundError -> 0x0024, Exception -> 0x0027, TryCatch #17 {Exception -> 0x0027, NoClassDefFoundError -> 0x0024, blocks: (B:3:0x0014, B:5:0x0021, B:6:0x002a, B:8:0x003a, B:11:0x0041, B:13:0x004d, B:15:0x0069, B:17:0x0083, B:19:0x009c, B:20:0x009f, B:21:0x00a2, B:23:0x00b4, B:26:0x00be, B:28:0x00cc, B:29:0x00e1, B:78:0x0227, B:51:0x01fc, B:54:0x02f1, B:56:0x0303, B:58:0x0309, B:60:0x0317, B:67:0x025f, B:68:0x0298, B:50:0x01c7, B:83:0x0142, B:104:0x00d7, B:105:0x0299, B:107:0x02a3, B:109:0x02a9, B:112:0x02ac, B:113:0x02ad, B:114:0x02ca, B:117:0x02cd, B:118:0x02ce, B:120:0x02dc, B:125:0x02e9, B:129:0x02ec, B:116:0x02cb, B:111:0x02aa), top: B:2:0x0014, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0309 A[Catch: NoClassDefFoundError -> 0x0024, Exception -> 0x0027, TryCatch #17 {Exception -> 0x0027, NoClassDefFoundError -> 0x0024, blocks: (B:3:0x0014, B:5:0x0021, B:6:0x002a, B:8:0x003a, B:11:0x0041, B:13:0x004d, B:15:0x0069, B:17:0x0083, B:19:0x009c, B:20:0x009f, B:21:0x00a2, B:23:0x00b4, B:26:0x00be, B:28:0x00cc, B:29:0x00e1, B:78:0x0227, B:51:0x01fc, B:54:0x02f1, B:56:0x0303, B:58:0x0309, B:60:0x0317, B:67:0x025f, B:68:0x0298, B:50:0x01c7, B:83:0x0142, B:104:0x00d7, B:105:0x0299, B:107:0x02a3, B:109:0x02a9, B:112:0x02ac, B:113:0x02ad, B:114:0x02ca, B:117:0x02cd, B:118:0x02ce, B:120:0x02dc, B:125:0x02e9, B:129:0x02ec, B:116:0x02cb, B:111:0x02aa), top: B:2:0x0014, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0219 A[Catch: all -> 0x0222, TryCatch #1 {all -> 0x0222, blocks: (B:73:0x0207, B:75:0x0219, B:77:0x0224), top: B:72:0x0207 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse k(java.lang.String r23, java.util.Map r24) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x00.k(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void l(Uri uri) {
        String str;
        k9.a0.k("Received GMSG: ".concat(String.valueOf(uri)));
        String path = uri.getPath();
        List list = (List) this.f12392w.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            nl nlVar = sl.D6;
            g9.r rVar = g9.r.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && this.Z.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) rVar.f17698c.a(sl.F6)).intValue()) {
                    k9.a0.k("Parsing gmsg query params on BG thread: ".concat(path));
                    k9.f0 f0Var = f9.k.C.f16813c;
                    f0Var.getClass();
                    h91 E = ed1.E(new c7.t(3, uri), f0Var.f19685k);
                    tw twVar = new tw(this, list, path, uri, 9, false);
                    E.a(new t81(E, 0, twVar), xx.f12655f);
                    return;
                }
            }
            k9.f0 f0Var2 = f9.k.C.f16813c;
            w(k9.f0.o(uri), list, path);
            return;
        }
        k9.a0.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (((Boolean) g9.r.e.f17698c.a(sl.E7)).booleanValue() && f9.k.C.f16817h.a() != null) {
            if (path != null && path.length() >= 2) {
                str = path.substring(1);
            } else {
                str = "null";
            }
            xx.f12651a.execute(new f(23, str));
        }
    }

    public final void o(int i, int i10) {
        pt ptVar = this.P;
        if (ptVar != null) {
            ptVar.u(i, i10);
        }
        mt mtVar = this.R;
        if (mtVar != null) {
            synchronized (mtVar.G) {
                mtVar.A = i;
                mtVar.B = i10;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        k9.a0.k("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            l(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.f12393x) {
            try {
                q00 q00Var = this.f12390u;
                if (q00Var.f9696u.o0()) {
                    k9.a0.k("Blank page loaded, 1...");
                    q00Var.r();
                    return;
                }
                this.V = true;
                b10 b10Var = this.B;
                if (b10Var != null) {
                    b10Var.mo212zza();
                    this.B = null;
                }
                E();
                q00 q00Var2 = this.f12390u;
                if (q00Var2.f9696u.z0() != null) {
                    if (((Boolean) g9.r.e.f17698c.a(sl.f10927rd)).booleanValue() && (toolbar = q00Var2.f9696u.z0().Q) != null) {
                        toolbar.setSubtitle(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.G = true;
        this.H = i;
        this.I = str;
        this.J = str2;
    }

    public final void p(g9.a aVar, dp dpVar, j9.m mVar, ep epVar, j9.c cVar, boolean z3, op opVar, f9.a aVar2, hx0 hx0Var, mw mwVar, rh0 rh0Var, xs0 xs0Var, be0 be0Var, np npVar, f90 f90Var, cp cpVar, cp cpVar2, np npVar2, g30 g30Var, me0 me0Var, g60 g60Var, c60 c60Var, b60 b60Var) {
        qp0 qp0Var;
        q00 q00Var = this.f12390u;
        f9.a aVar3 = aVar2 == null ? new f9.a(q00Var.getContext(), mwVar) : aVar2;
        this.R = new mt(q00Var, hx0Var);
        this.S = mwVar;
        nl nlVar = sl.A1;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
            b("/adMetadata", new cp(0, dpVar));
        }
        if (epVar != null) {
            b("/appEvent", new cp(1, epVar));
        }
        b("/backButton", lp.e);
        b("/refresh", lp.f8080f);
        b("/canOpenApp", hp.f6857v);
        b("/canOpenURLs", hp.f6861z);
        b("/canOpenIntents", hp.f6858w);
        b("/close", lp.f8076a);
        b("/customClose", lp.f8077b);
        b("/instrument", lp.i);
        b("/delayPageLoaded", lp.f8084k);
        b("/delayPageClosed", lp.f8085l);
        b("/getLocationInfo", lp.f8086m);
        b("/log", lp.f8078c);
        b("/mraid", new pp(aVar3, this.R, hx0Var));
        pt ptVar = this.P;
        if (ptVar != null) {
            b("/mraidLoaded", ptVar);
        }
        f9.a aVar4 = aVar3;
        b("/open", new tp(aVar4, this.R, rh0Var, be0Var, g30Var, g60Var, b60Var));
        b("/precache", new hp(26));
        b("/touch", hp.f6860y);
        b("/video", lp.f8081g);
        b("/videoMeta", lp.f8082h);
        if (rh0Var != null && xs0Var != null) {
            b("/click", new ba0(f90Var, g30Var, xs0Var, rh0Var));
            b("/httpTrack", new jp(xs0Var, 6, rh0Var));
        } else {
            b("/click", new jp(f90Var, 0, g30Var));
            b("/httpTrack", hp.f6859x);
        }
        ww wwVar = f9.k.C.f16833y;
        Context context = q00Var.getContext();
        s00 s00Var = q00Var.f9696u;
        if (wwVar.a(context)) {
            HashMap hashMap = new HashMap();
            qp0 qp0Var2 = s00Var.D;
            if (qp0Var2 != null) {
                hashMap = qp0Var2.f9965w0;
            }
            b("/logScionEvent", new jp(q00Var.getContext(), 1, hashMap));
        }
        if (opVar != null) {
            b("/setInterstitialProperties", new cp(2, opVar));
        }
        if (npVar != null && ((Boolean) qlVar2.a(sl.f10811ka)).booleanValue()) {
            b("/inspectorNetworkExtras", npVar);
        }
        if (((Boolean) qlVar2.a(sl.Da)).booleanValue() && cpVar != null) {
            b("/shareSheet", cpVar);
        }
        if (((Boolean) qlVar2.a(sl.H8)).booleanValue() && me0Var != null) {
            b("/onDeviceStorageEvent", new cp(3, me0Var));
        }
        if (((Boolean) qlVar2.a(sl.Ia)).booleanValue() && cpVar2 != null) {
            b("/inspectorOutOfContextTest", cpVar2);
        }
        if (((Boolean) qlVar2.a(sl.Na)).booleanValue() && npVar2 != null) {
            b("/inspectorStorage", npVar2);
        }
        if (((Boolean) qlVar2.a(sl.Wc)).booleanValue()) {
            b("/bindPlayStoreOverlay", lp.f8089p);
            b("/presentPlayStoreOverlay", lp.f8090q);
            b("/expandPlayStoreOverlay", lp.f8091r);
            b("/collapsePlayStoreOverlay", lp.f8092s);
            b("/closePlayStoreOverlay", lp.f8093t);
        }
        if (((Boolean) qlVar2.a(sl.f10758h4)).booleanValue()) {
            b("/setPAIDPersonalizationEnabled", lp.f8095v);
            b("/resetPAID", lp.f8094u);
        }
        if (((Boolean) qlVar2.a(sl.f10912qd)).booleanValue() && (qp0Var = s00Var.D) != null && qp0Var.f9955r0) {
            b("/writeToLocalStorage", lp.f8096w);
            b("/clearLocalStorageKeys", lp.f8097x);
        }
        this.f12394y = aVar;
        this.f12395z = mVar;
        this.C = dpVar;
        this.D = epVar;
        this.O = cVar;
        this.Q = aVar4;
        this.E = f90Var;
        this.T = be0Var;
        this.U = c60Var;
        this.F = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(android.view.View r8, com.google.android.gms.internal.ads.mw r9, int r10) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.nw r0 = r9.f8443g
            boolean r0 = r0.f8880w
            if (r0 == 0) goto Lbb
            boolean r1 = r9.f8445j
            if (r1 != 0) goto Lbb
            if (r10 <= 0) goto Lbb
            if (r0 != 0) goto L10
            goto La5
        L10:
            if (r1 != 0) goto La5
            f9.k r0 = f9.k.C
            k9.f0 r0 = r0.f16813c
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L1c
            goto L7d
        L1c:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2e
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2e
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2e
            if (r3 == 0) goto L30
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2e
            goto L31
        L2e:
            r2 = move-exception
            goto L37
        L30:
            r3 = r1
        L31:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L35
            goto L3f
        L35:
            r2 = move-exception
            goto L38
        L37:
            r3 = r1
        L38:
            int r4 = k9.a0.f19634b
            java.lang.String r4 = "Fail to capture the web view"
            l9.i.d(r4, r2)
        L3f:
            if (r3 != 0) goto L7c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L6a
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L6a
            if (r2 == 0) goto L6c
            if (r3 != 0) goto L4e
            goto L6c
        L4e:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L6a
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L6a
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L6a
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L6a
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L6a
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L6a
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L6a
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L6a
            r1 = r4
            goto L7d
        L6a:
            r2 = move-exception
            goto L74
        L6c:
            java.lang.String r2 = "Width or height of view is zero"
            int r3 = k9.a0.f19634b     // Catch: java.lang.RuntimeException -> L6a
            l9.i.f(r2)     // Catch: java.lang.RuntimeException -> L6a
            goto L7d
        L74:
            int r3 = k9.a0.f19634b
            java.lang.String r3 = "Fail to capture the webview"
            l9.i.d(r3, r2)
            goto L7d
        L7c:
            r1 = r3
        L7d:
            if (r1 != 0) goto L85
            java.lang.String r0 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.b80.k(r0)
            goto La5
        L85:
            r9.f8445j = r0
            com.google.android.gms.internal.ads.t81 r0 = new com.google.android.gms.internal.ads.t81
            r2 = 9
            r0.<init>(r9, r2, r1)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r1 == r2) goto La0
            r0.run()
            goto La5
        La0:
            com.google.android.gms.internal.ads.wx r1 = com.google.android.gms.internal.ads.xx.f12651a
            r1.execute(r0)
        La5:
            com.google.android.gms.internal.ads.nw r0 = r9.f8443g
            boolean r0 = r0.f8880w
            if (r0 == 0) goto Lbb
            boolean r0 = r9.f8445j
            if (r0 != 0) goto Lbb
            k9.b0 r0 = k9.f0.f19676l
            com.google.android.gms.internal.ads.gz r1 = new com.google.android.gms.internal.ads.gz
            r1.<init>(r7, r8, r9, r10)
            r8 = 100
            r0.postDelayed(r1, r8)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x00.r(android.view.View, com.google.android.gms.internal.ads.mw, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            String uri = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (!(webView instanceof h00)) {
                int i = k9.a0.f19634b;
                l9.i.f("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return null;
            }
            h00 h00Var = (h00) webView;
            mw mwVar = this.S;
            if (mwVar != null) {
                mwVar.b(uri, requestHeaders, 1);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(uri).getName())) {
                if (requestHeaders == null) {
                    requestHeaders = Collections.EMPTY_MAP;
                }
                return k(uri, requestHeaders);
            }
            if (h00Var.j0() != null) {
                x00 j02 = h00Var.j0();
                synchronized (j02.f12393x) {
                    j02.F = false;
                    j02.K = true;
                    xx.f12655f.execute(new f(22, j02));
                }
            }
            if (h00Var.l0().b()) {
                str = (String) g9.r.e.f17698c.a(sl.f11008x0);
            } else if (h00Var.I0()) {
                str = (String) g9.r.e.f17698c.a(sl.f10991w0);
            } else {
                str = (String) g9.r.e.f17698c.a(sl.f10977v0);
            }
            f9.k kVar = f9.k.C;
            k9.f0 f0Var = kVar.f16813c;
            Context context = h00Var.getContext();
            String str2 = h00Var.A().f20029u;
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", kVar.f16813c.E(context, str2));
                hashMap.put("Cache-Control", "max-stale=3600");
                k9.p a10 = new k9.r(context).a(0, str, hashMap, null);
                String str3 = (String) a10.f12998u.get(60L, TimeUnit.SECONDS);
                if (str3 != null) {
                    return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)));
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                int i10 = k9.a0.f19634b;
                l9.i.g("Could not fetch MRAID JS.", e);
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        k9.a0.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            l(parse);
            return true;
        }
        boolean z3 = this.F;
        q00 q00Var = this.f12390u;
        if (z3 && webView == q00Var.f9696u) {
            String scheme = parse.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                g9.a aVar = this.f12394y;
                if (aVar != null) {
                    aVar.L();
                    mw mwVar = this.S;
                    if (mwVar != null) {
                        mwVar.a(str);
                    }
                    this.f12394y = null;
                }
                f90 f90Var = this.E;
                if (f90Var != null) {
                    f90Var.M();
                    this.E = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        s00 s00Var = q00Var.f9696u;
        s00 s00Var2 = q00Var.f9696u;
        if (!s00Var.willNotDraw()) {
            try {
                of ofVar = s00Var2.f10436v;
                cq0 cq0Var = s00Var2.f10438w;
                if (((Boolean) g9.r.e.f17698c.a(sl.f10988vd)).booleanValue() && cq0Var != null) {
                    if (ofVar != null && ofVar.a(parse)) {
                        parse = cq0Var.a(parse, q00Var.getContext(), q00Var, q00Var.f());
                    }
                } else if (ofVar != null && ofVar.a(parse)) {
                    parse = ofVar.b(parse, q00Var.getContext(), q00Var, q00Var.f());
                }
            } catch (pf unused) {
                l9.i.f("Unable to append parameter to URL: ".concat(String.valueOf(str)));
            }
            f9.a aVar2 = this.Q;
            if (aVar2 != null && !aVar2.a()) {
                aVar2.b(str);
            } else {
                F(new j9.e("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true, false, s00Var2.n());
            }
            return true;
        }
        l9.i.f("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0107, code lost:
    
        r0 = r8.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        r0 = r8.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012a, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
    
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0161, code lost:
    
        r0 = r8.getHeaderFields();
        r1 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017a, code lost:
    
        if (r0.hasNext() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017c, code lost:
    
        r2 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0186, code lost:
    
        if (r2.getKey() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018c, code lost:
    
        if (r2.getValue() == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0198, code lost:
    
        if (r2.getValue().isEmpty() != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019a, code lost:
    
        r1.put(r2.getKey(), r2.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b0, code lost:
    
        r0 = f9.k.C.f16815f;
        r14 = r8.getResponseCode();
        r15 = r8.getResponseMessage();
        r17 = r8.getInputStream();
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ca, code lost:
    
        r7 = new android.webkit.WebResourceResponse(r12, r13, r14, r15, r1, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012e, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0133, code lost:
    
        if (r0.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0136, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0138, code lost:
    
        if (r1 >= r0.length) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0146, code lost:
    
        if (r0[r1].trim().startsWith("charset") == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0148, code lost:
    
        r2 = r0[r1].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0155, code lost:
    
        if (r2.length <= 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0157, code lost:
    
        r4 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015e, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0117, code lost:
    
        r12 = r0.split(";")[0].trim();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse v(java.lang.String r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x00.v(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void w(Map map, List list, String str) {
        if (k9.a0.m()) {
            k9.a0.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(str3);
                k9.a0.k(sb2.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((mp) it.next()).d(this.f12390u, map);
        }
    }

    public final void z(g30 g30Var, rh0 rh0Var, xs0 xs0Var) {
        c("/click");
        if (rh0Var != null && xs0Var != null) {
            b("/click", new ba0(this.E, g30Var, xs0Var, rh0Var));
            return;
        }
        f90 f90Var = this.E;
        hp hpVar = lp.f8076a;
        b("/click", new jp(f90Var, 0, g30Var));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return k(str, Collections.EMPTY_MAP);
    }
}

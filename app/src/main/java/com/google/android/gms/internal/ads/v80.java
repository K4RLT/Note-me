package com.google.android.gms.internal.ads;
import f9.k;
import k9.a0;
import a0.k;
import a0.t;
import g9.a0;
import g9.a2;
import g9.p;
import g9.r;
import g9.x;
import g9.z0;
import g9.z1;
import l9.i;
import r.e;
import z8.o;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class v80 implements n80, s81, z8.o, dr0, gr, hr, y40, so0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11835u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ v80 f11830v = new v80(0);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ v80 f11831w = new v80(1);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ v80 f11832x = new v80(2);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ v80 f11833y = new v80(3);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ v80 f11834z = new v80(4);
    public static final /* synthetic */ v80 A = new v80(5);
    public static final /* synthetic */ v80 B = new v80(6);
    public static final /* synthetic */ v80 C = new v80(7);
    public static final /* synthetic */ v80 D = new v80(8);
    public static final /* synthetic */ v80 E = new v80(9);
    public static final /* synthetic */ v80 F = new v80(10);
    public static final /* synthetic */ v80 G = new v80(11);
    public static final /* synthetic */ v80 H = new v80(12);
    public static final /* synthetic */ v80 I = new v80(13);
    public static final /* synthetic */ v80 J = new v80(17);
    public static final /* synthetic */ v80 K = new v80(18);
    public static final /* synthetic */ v80 L = new v80(19);
    public static final /* synthetic */ v80 M = new v80(20);
    public static final /* synthetic */ v80 N = new v80(23);
    public static final /* synthetic */ v80 O = new v80(24);
    public static final /* synthetic */ v80 P = new v80(25);
    public static final /* synthetic */ v80 Q = new v80(26);
    public static final /* synthetic */ v80 R = new v80(27);
    public static final /* synthetic */ v80 S = new v80(28);
    public static final /* synthetic */ v80 T = new v80(29);

    public /* synthetic */ v80(int i) {
        this.f11835u = i;
    }

    public static boolean d(Context context) {
        if (!((Boolean) g9.r.e.f17698c.a(sl.f10760h6)).booleanValue()) {
            int i = k9.a0.f19634b;
            l9.i.f("Omid flag is disabled");
            return false;
        }
        Boolean bool = (Boolean) o(new rl(context, 3));
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static String e() {
        if (!((Boolean) g9.r.e.f17698c.a(sl.f10760h6)).booleanValue()) {
            return null;
        }
        return "a.1.5.2-google_20241009";
    }

    public static bi0 f(int i, int i10, WebView webView, String str, String str2, String str3) {
        if (((Boolean) g9.r.e.f17698c.a(sl.f10760h6)).booleanValue() && ct.D.f8992v) {
            return (bi0) o(new a0.t(i10, i, webView, str, str2, str3));
        }
        return null;
    }

    public static void g(tt0 tt0Var) {
        if (((Boolean) g9.r.e.f17698c.a(sl.f10760h6)).booleanValue() && ct.D.f8992v) {
            p(new xh0(tt0Var, 0));
        }
    }

    public static void i(tt0 tt0Var, View view) {
        p(new t81(tt0Var, 20, view));
    }

    public static final Set j(ke0 ke0Var, Executor executor) {
        if (((Boolean) ym.f12911a.p()).booleanValue()) {
            return Collections.singleton(new c90(ke0Var, executor));
        }
        return Collections.EMPTY_SET;
    }

    public static yt0 k(String str) {
        if ("native".equals(str)) {
            return yt0.NATIVE;
        }
        if ("javascript".equals(str)) {
            return yt0.JAVASCRIPT;
        }
        return yt0.NONE;
    }

    public static wt0 m(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1104128070) {
            if (hashCode != 1318088141) {
                if (hashCode == 1988248512 && str.equals("onePixel")) {
                    return wt0.ONE_PIXEL;
                }
            } else if (str.equals("definedByJavascript")) {
                return wt0.DEFINED_BY_JAVASCRIPT;
            }
        } else if (str.equals("beginToRender")) {
            return wt0.BEGIN_TO_RENDER;
        }
        return wt0.UNSPECIFIED;
    }

    public static ut0 n(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -382745961) {
            if (hashCode != 112202875) {
                if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                    return ut0.NATIVE_DISPLAY;
                }
                return null;
            }
            if (str.equals("video")) {
                return ut0.VIDEO;
            }
            return null;
        }
        if (str.equals("htmlDisplay")) {
            return ut0.HTML_DISPLAY;
        }
        return null;
    }

    public static final Object o(zh0 zh0Var) {
        try {
            return zh0Var.zza();
        } catch (RuntimeException e) {
            f9.k.C.f16817h.e("omid exception", e);
            return null;
        }
    }

    public static final void p(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            f9.k.C.f16817h.e("omid exception", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.gr
    public /* synthetic */ Object a(JSONObject jSONObject) {
        return new ev(jSONObject);
    }

    @Override // z8.o
    public /* synthetic */ void h(fp fpVar) {
        int i = this.f11835u;
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public void mo205l(Object obj) {
        g9.a2 a2Var = null;
        switch (this.f11835u) {
            case 0:
                ((w80) obj).d();
                return;
            case 1:
                ((y80) obj).y();
                return;
            case 2:
                ((y80) obj).l();
                return;
            case 3:
                ((b90) obj).g();
                return;
            case 4:
                ((f90) obj).Q();
                return;
            case 5:
                ((f90) obj).M();
                return;
            case 6:
                h90 h90Var = (h90) obj;
                if (!h90Var.f6639d) {
                    h90Var.f6637b.a(h90Var.f6636a, h90Var.f6638c);
                    h90Var.f6639d = true;
                    return;
                }
                return;
            case 7:
                ((xp) obj).E();
                return;
            case 8:
                ((xp) obj).l();
                return;
            case 9:
                g9.z1 r8 = ((wc0) obj).f12214a.r();
                if (r8 != null) {
                    try {
                        a2Var = r8.p();
                    } catch (RemoteException unused) {
                    }
                }
                if (a2Var != null) {
                    try {
                        a2Var.d();
                        return;
                    } catch (RemoteException e) {
                        int i = k9.a0.f19634b;
                        l9.i.g("Unable to call onVideoEnd()", e);
                        return;
                    }
                }
                return;
            case 10:
                ((wc0) obj).a();
                return;
            case 11:
                ((wc0) obj).getClass();
                return;
            case 12:
                ((wc0) obj).a();
                return;
            case 13:
                g9.z1 r10 = ((wc0) obj).f12214a.r();
                if (r10 != null) {
                    try {
                        a2Var = r10.p();
                    } catch (RemoteException unused2) {
                    }
                }
                if (a2Var != null) {
                    try {
                        a2Var.e();
                        return;
                    } catch (RemoteException e8) {
                        int i10 = k9.a0.f19634b;
                        l9.i.g("Unable to call onVideoEnd()", e8);
                        return;
                    }
                }
                return;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case gl.zzm /* 21 */:
            case 22:
            case 23:
            default:
                ((ft0) obj).a();
                return;
            case 24:
                ((g9.x) obj).a();
                return;
            case 25:
                ((g9.x) obj).g();
                return;
            case 26:
                ((g9.x) obj).l();
                return;
            case 27:
                ((g9.a0) obj).l();
                return;
            case 28:
                ((g9.z0) obj).E();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.hr
    public JSONObject r(Object obj) {
        ch0 ch0Var = (ch0) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) g9.r.e.f17698c.a(sl.Da)).booleanValue()) {
            ev evVar = ch0Var.f5090c;
            jSONObject2.put("ad_request_url", evVar.f5819f);
            jSONObject2.put("ad_request_post_body", evVar.f5817c);
        }
        ev evVar2 = ch0Var.f5090c;
        jSONObject2.put("base_url", evVar2.f5816b);
        jSONObject2.put("signals", ch0Var.f5089b);
        gh0 gh0Var = ch0Var.f5088a;
        jSONObject3.put("body", gh0Var.f6398c);
        jSONObject3.put("headers", g9.p.f17688g.f17689a.k(gh0Var.f6397b));
        jSONObject3.put("response_code", gh0Var.f6396a);
        jSONObject3.put("latency", gh0Var.f6399d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", evVar2.f5821h);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.y40
    /* renamed from: zza */
    public /* synthetic */ g9.z1 mo208zza() {
        return null;
    }

    private final /* synthetic */ void b(fp fpVar) {
    }

    private final /* synthetic */ void c(fp fpVar) {
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public /* synthetic */ void mo202r(Object obj) {
        ((h00) obj).destroy();
    }

    @Override // com.google.android.gms.internal.ads.dr0
    public /* synthetic */ Object l(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        k9.a0.k("Ad request signals:");
        k9.a0.k(jSONObject.toString(2));
        return jSONObject;
    }
}

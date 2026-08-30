package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tp implements mp {
    public final g60 A;
    public final b60 B;

    /* renamed from: u, reason: collision with root package name */
    public final f9.a f11407u;

    /* renamed from: v, reason: collision with root package name */
    public final be0 f11408v;

    /* renamed from: x, reason: collision with root package name */
    public final mt f11410x;

    /* renamed from: y, reason: collision with root package name */
    public final rh0 f11411y;

    /* renamed from: z, reason: collision with root package name */
    public final g30 f11412z;

    /* renamed from: w, reason: collision with root package name */
    public l9.l f11409w = null;
    public j9.a C = null;
    public final wx D = xx.f12657h;

    public tp(f9.a aVar, mt mtVar, rh0 rh0Var, be0 be0Var, g30 g30Var, g60 g60Var, b60 b60Var) {
        this.f11407u = aVar;
        this.f11410x = mtVar;
        this.f11411y = rh0Var;
        this.f11408v = be0Var;
        this.f11412z = g30Var;
        this.A = g60Var;
        this.B = b60Var;
    }

    public static int a(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            if ("c".equalsIgnoreCase(str)) {
                return 14;
            }
            return -1;
        }
        return -1;
    }

    public static Uri b(Context context, of ofVar, Uri uri, View view, Activity activity, cq0 cq0Var) {
        if (ofVar != null) {
            try {
                if (((Boolean) g9.r.e.f17698c.a(sl.f10988vd)).booleanValue() && cq0Var != null) {
                    if (ofVar.c(uri)) {
                        return cq0Var.a(uri, context, view, activity);
                    }
                } else if (ofVar.c(uri)) {
                    return ofVar.b(uri, context, view, activity);
                }
            } catch (pf unused) {
            } catch (Exception e) {
                f9.k.C.f16817h.d("OpenGmsgHandler.maybeAddClickSignalsToUri", e);
            }
        }
        return uri;
    }

    public static Uri c(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
            return uri;
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            int i = k9.a0.f19634b;
            l9.i.d("Error adding click uptime parameter to url: ".concat(valueOf), e);
            return uri;
        }
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final void d(Object obj, Map map) {
        ac.b e;
        g30 g30Var;
        g9.a aVar = (g9.a) obj;
        String str = (String) map.get("u");
        HashMap hashMap = new HashMap();
        h00 h00Var = (h00) aVar;
        if (h00Var.J() != null) {
            hashMap = h00Var.J().f9965w0;
        }
        String f10 = ay0.f(str, h00Var.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = k9.a0.f19634b;
            l9.i.f("Action missing from an open GMSG.");
            return;
        }
        f9.a aVar2 = this.f11407u;
        if (aVar2 != null && !aVar2.a()) {
            aVar2.b(f10);
            return;
        }
        if (((Boolean) g9.r.e.f17698c.a(sl.f10986vb)).booleanValue() && (g30Var = this.f11412z) != null && g30.b(f10)) {
            e = g30Var.a(f10, g9.p.f17688g.e);
        } else {
            e = ed1.e(f10);
        }
        e.a(new t81(e, 0, new tw(this, map, aVar, str2, 6, false)), this.D);
    }

    public final void e(String str, Bundle bundle, String str2) {
        String str3;
        be0 be0Var = this.f11408v;
        if (be0Var != null) {
            if (bundle != null) {
                str3 = Base64.encodeToString(g9.p.f17688g.f17689a.l(bundle, new JSONObject()).toString().getBytes(), 1);
            } else {
                str3 = null;
            }
            if (((Boolean) g9.r.e.f17698c.a(sl.se)).booleanValue()) {
                j6.s a10 = be0Var.a();
                a10.k("action", str);
                if (str2 != null) {
                    a10.k("gqi", str2);
                }
                if (str3 != null) {
                    a10.k("hsoe", str3);
                }
                a10.n();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (((java.lang.Boolean) g9.r.e.f17698c.a(com.google.android.gms.internal.ads.sl.J9)).booleanValue() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        if (r3 != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(g9.a r11, android.content.Context r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tp.f(g9.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final void g(Context context, String str, String str2) {
        rh0 rh0Var = this.f11411y;
        rh0Var.j(str);
        be0 be0Var = this.f11408v;
        if (be0Var != null) {
            ed1.k("dialog_not_shown_reason", str2);
            wh0.w4(context, be0Var, rh0Var, str, "dialog_not_shown", d61.e(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0110, code lost:
    
        if (com.google.android.gms.internal.ads.ct.q(r13, new java.util.ArrayList(), r6) == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0153, code lost:
    
        r6 = r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(g9.a r17, java.util.Map r18, boolean r19, java.lang.String r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tp.h(g9.a, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    public final void i(boolean z3) {
        mt mtVar = this.f11410x;
        if (mtVar != null) {
            mtVar.u(z3);
        }
    }

    public final void j(int i) {
        be0 be0Var;
        String str;
        if (((Boolean) g9.r.e.f17698c.a(sl.f11029y5)).booleanValue() && (be0Var = this.f11408v) != null) {
            j6.s a10 = be0Var.a();
            a10.k("action", "cct_action");
            switch (i) {
                case 2:
                    str = "CONTEXT_NOT_AN_ACTIVITY";
                    break;
                case 3:
                    str = "CONTEXT_NULL";
                    break;
                case 4:
                    str = "CCT_NOT_SUPPORTED";
                    break;
                case 5:
                    str = "CCT_READY_TO_OPEN";
                    break;
                case 6:
                    str = "ACTIVITY_NOT_FOUND";
                    break;
                case 7:
                    str = "EMPTY_URL";
                    break;
                case 8:
                    str = "UNKNOWN";
                    break;
                case 9:
                    str = "WRONG_EXP_SETUP";
                    break;
                default:
                    str = "OPT_OUT";
                    break;
            }
            a10.k("cct_open_status", str);
            a10.l();
        }
    }
}

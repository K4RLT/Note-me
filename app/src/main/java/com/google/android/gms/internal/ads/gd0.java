package com.google.android.gms.internal.ads;
import f9.k;
import g9.c3;
import g9.r;
import j6.l;
import k9.a0;
import l9.a;
import l9.i;
import x0.a;
import y5.b;
import z5.k;

import android.content.Context;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public final class gd0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6369a;

    /* renamed from: b, reason: collision with root package name */
    public final of f6370b;

    /* renamed from: c, reason: collision with root package name */
    public final hm f6371c;

    /* renamed from: d, reason: collision with root package name */
    public final a f6372d;
    public final l e;

    /* renamed from: f, reason: collision with root package name */
    public final jj f6373f;

    /* renamed from: g, reason: collision with root package name */
    public final x70 f6374g;

    /* renamed from: h, reason: collision with root package name */
    public final wh0 f6375h;
    public final cq0 i;

    /* renamed from: j, reason: collision with root package name */
    public final be0 f6376j;

    /* renamed from: k, reason: collision with root package name */
    public final c10 f6377k;

    public gd0(Context context, of ofVar, hm hmVar, a aVar, l lVar, jj jjVar, x70 x70Var, wh0 wh0Var, cq0 cq0Var, be0 be0Var, c10 c10Var) {
        this.f6369a = context;
        this.f6370b = ofVar;
        this.f6371c = hmVar;
        this.f6372d = aVar;
        this.e = lVar;
        this.f6373f = jjVar;
        this.f6374g = x70Var;
        this.f6375h = wh0Var;
        this.i = cq0Var;
        this.f6376j = be0Var;
        this.f6377k = c10Var;
    }

    public final h00 a(c3 c3Var, qp0 qp0Var, sp0 sp0Var) {
        h00 e = fp.e(this.f6369a, a(c3Var), c3Var.f17589u, false, false, this.f6370b, this.f6371c, this.f6372d, new jk0(19, this), this.e, this.f6373f, qp0Var, sp0Var, this.f6375h, this.i, this.f6376j);
        if (((Boolean) r.e.f17698c.a(sl.Ff)).booleanValue()) {
            WebView u9 = e.u();
            if (this.f6377k.f4942a != null) {
                try {
                    int i = b.f30913a;
                    if (k.f31929g.b()) {
                        ((WebViewProviderBoundaryInterface) b.b(u9).f25315v).setProfile("GMA_WEBVIEW_PROFILE");
                        a0.k("WebViewCompat Profile is defined");
                        return e;
                    }
                    throw k.a();
                } catch (IllegalStateException e8) {
                    String concat = "WebViewCompat error: ".concat(e8.toString());
                    int i10 = a0.f19634b;
                    i.f(concat);
                    if (((Boolean) r.e.f17698c.a(sl.Ef)).booleanValue()) {
                        k.C.f16817h.d("WebViewCompat.setProfile", e8);
                    }
                }
            }
        }
        return e;
    }
}

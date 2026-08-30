package com.google.android.gms.internal.ads;
import b.b;
import ee.a;
import k.a;
import q.x;
import y5.b;
import ya.ee;
import z5.b;
import z5.h;
import z5.k;

import android.view.View;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public final class xt0 {

    /* renamed from: a, reason: collision with root package name */
    public final zt0 f12620a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f12621b;

    /* renamed from: c, reason: collision with root package name */
    public final av0 f12622c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f12623d;
    public final iu0 e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.ref.WeakReference, com.google.android.gms.internal.ads.av0] */
    public xt0(zt0 zt0Var, WebView webView) {
        View view;
        HashMap hashMap = new HashMap();
        this.f12623d = hashMap;
        this.e = new iu0();
        if (ct.D.f8992v) {
            this.f12620a = zt0Var;
            this.f12621b = webView;
            av0 av0Var = this.f12622c;
            if (av0Var == null) {
                view = null;
            } else {
                view = (View) av0Var.get();
            }
            if (view != webView) {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((tt0) it.next()).b(webView);
                }
                this.f12622c = new WeakReference(webView);
            }
            if (ya.ee.a("WEB_MESSAGE_LISTENER")) {
                WebView webView2 = this.f12621b;
                int i = y5.b.f30913a;
                z5.b bVar = z5.k.f31927d;
                if (bVar.b()) {
                    ((WebViewProviderBoundaryInterface) y5.b.b(webView2).f25315v).removeWebMessageListener("omidJsSessionService");
                    zq0 zq0Var = new zq0(2, this);
                    WebView webView3 = this.f12621b;
                    HashSet hashSet = new HashSet(Arrays.asList("*"));
                    if (bVar.b()) {
                        ((WebViewProviderBoundaryInterface) y5.b.b(webView3).f25315v).addWebMessageListener("omidJsSessionService", (String[]) hashSet.toArray(new String[0]), new com.facebook.ads.internal.dynamicloading.h(1, new z5.h(0, zq0Var)));
                        return;
                    }
                    throw z5.k.a();
                }
                throw z5.k.a();
            }
            androidx.datastore.preferences.protobuf.s1.k("The JavaScriptSessionService cannot be supported in this WebView version.");
            throw null;
        }
        q.x.o("Method called before OM SDK activation");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        View view;
        ut0 ut0Var = ut0.DEFINED_BY_JAVASCRIPT;
        wt0 wt0Var = wt0.DEFINED_BY_JAVASCRIPT;
        yt0 yt0Var = yt0.JAVASCRIPT;
        int i = 0;
        tt0 tt0Var = new tt0(xv0.a(ut0Var, wt0Var, yt0Var, yt0Var, false), new a8(this.f12620a, this.f12621b, null, null, st0.HTML), str);
        this.f12623d.put(str, tt0Var);
        av0 av0Var = this.f12622c;
        if (av0Var == null) {
            view = null;
        } else {
            view = (View) av0Var.get();
        }
        tt0Var.b(view);
        ArrayList arrayList = this.e.f7224a;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hu0 hu0Var = (hu0) obj;
            View view2 = (View) hu0Var.f6894a.get();
            vt0 vt0Var = hu0Var.f6896c;
            if (!tt0Var.f11441f) {
                tt0Var.f11438b.a(view2, vt0Var);
            }
        }
        tt0Var.a();
    }
}

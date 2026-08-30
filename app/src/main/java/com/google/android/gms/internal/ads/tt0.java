package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tt0 {

    /* renamed from: a, reason: collision with root package name */
    public final a8 f11437a;

    /* renamed from: d, reason: collision with root package name */
    public nu0 f11440d;

    /* renamed from: g, reason: collision with root package name */
    public final String f11442g;

    /* renamed from: b, reason: collision with root package name */
    public final iu0 f11438b = new iu0();
    public boolean e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11441f = false;

    /* renamed from: c, reason: collision with root package name */
    public av0 f11439c = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.ref.WeakReference, com.google.android.gms.internal.ads.av0] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.ref.WeakReference, com.google.android.gms.internal.ads.av0] */
    public tt0(xv0 xv0Var, a8 a8Var, String str) {
        this.f11437a = a8Var;
        this.f11442g = str;
        st0 st0Var = (st0) a8Var.A;
        if (st0Var != st0.HTML && st0Var != st0.JAVASCRIPT) {
            this.f11440d = new ru0(str, Collections.unmodifiableMap((HashMap) a8Var.f4408x));
        } else {
            WebView webView = (WebView) a8Var.f4406v;
            nu0 nu0Var = new nu0(str);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            nu0Var.f8868b = new WeakReference(webView);
            this.f11440d = nu0Var;
        }
        this.f11440d.a();
        eu0.f5810c.f5811a.add(this);
        nu0 nu0Var2 = this.f11440d;
        s6 s6Var = s6.A;
        WebView c10 = nu0Var2.c();
        String str2 = nu0Var2.f8867a;
        JSONObject jSONObject = new JSONObject();
        su0.b(jSONObject, "impressionOwner", (yt0) xv0Var.f12634v);
        su0.b(jSONObject, "mediaEventsOwner", (yt0) xv0Var.f12635w);
        su0.b(jSONObject, "creativeType", (ut0) xv0Var.f12636x);
        su0.b(jSONObject, "impressionType", (wt0) xv0Var.f12637y);
        su0.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(xv0Var.f12633u));
        s6Var.C(c10, "init", jSONObject, str2);
    }

    public final void a() {
        boolean z3;
        Date date;
        if (!this.e && this.f11440d != null) {
            this.e = true;
            ArrayList arrayList = eu0.f5810c.f5812b;
            boolean z9 = false;
            if (arrayList.size() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            arrayList.add(this);
            if (!z3) {
                ku0 b10 = ku0.b();
                b10.getClass();
                du0 du0Var = du0.f5522x;
                du0Var.f6458w = b10;
                du0Var.f6456u = true;
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (runningAppProcessInfo.importance == 100 || du0Var.a()) {
                    z9 = true;
                }
                du0Var.f6457v = z9;
                du0Var.b(z9);
                vu0.f12002f.getClass();
                vu0.b();
                bu0 bu0Var = b10.f7879b;
                bu0Var.getClass();
                bu0Var.f4880f.submit(new e40(29, bu0Var));
                bu0Var.f4877b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, bu0Var);
            }
            float f10 = ku0.b().f7878a;
            nu0 nu0Var = this.f11440d;
            s6.A.C(nu0Var.c(), "setDeviceVolume", Float.valueOf(f10), nu0Var.f8867a);
            nu0 nu0Var2 = this.f11440d;
            Date date2 = (Date) cu0.e.f5173c;
            if (date2 != null) {
                date = (Date) date2.clone();
            } else {
                date = null;
            }
            nu0Var2.f(date);
            this.f11440d.d(this, this.f11437a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.ref.WeakReference, com.google.android.gms.internal.ads.av0] */
    public final void b(View view) {
        if (!this.f11441f && ((View) this.f11439c.get()) != view) {
            this.f11439c = new WeakReference(view);
            nu0 nu0Var = this.f11440d;
            nu0Var.getClass();
            nu0Var.f8869c = System.nanoTime();
            nu0Var.f8870d = 1;
            Collection<tt0> unmodifiableCollection = Collections.unmodifiableCollection(eu0.f5810c.f5811a);
            if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
                for (tt0 tt0Var : unmodifiableCollection) {
                    if (tt0Var != this && ((View) tt0Var.f11439c.get()) == view) {
                        tt0Var.f11439c.clear();
                    }
                }
            }
        }
    }

    public final void c() {
        if (this.f11441f) {
            return;
        }
        this.f11439c.clear();
        if (!this.f11441f) {
            this.f11438b.f7224a.clear();
        }
        boolean z3 = true;
        this.f11441f = true;
        nu0 nu0Var = this.f11440d;
        s6.A.C(nu0Var.c(), "finishSession", nu0Var.f8867a);
        eu0 eu0Var = eu0.f5810c;
        ArrayList arrayList = eu0Var.f5811a;
        ArrayList arrayList2 = eu0Var.f5812b;
        if (arrayList2.size() <= 0) {
            z3 = false;
        }
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z3 && arrayList2.size() <= 0) {
            ku0 b10 = ku0.b();
            b10.getClass();
            vu0 vu0Var = vu0.f12002f;
            vu0Var.getClass();
            Handler handler = vu0.f12004h;
            if (handler != null) {
                handler.removeCallbacks(vu0.f12005j);
                vu0.f12004h = null;
            }
            vu0Var.f12006a.clear();
            vu0.f12003g.post(new qu0(vu0Var));
            du0 du0Var = du0.f5522x;
            du0Var.f6456u = false;
            du0Var.f6458w = null;
            bu0 bu0Var = b10.f7879b;
            bu0Var.f4877b.getContentResolver().unregisterContentObserver(bu0Var);
        }
        this.f11440d.b();
        this.f11440d = null;
    }
}

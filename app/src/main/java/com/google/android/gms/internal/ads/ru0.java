package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ru0 extends nu0 {
    public WebView e;

    /* renamed from: f, reason: collision with root package name */
    public Long f10291f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f10292g;

    public ru0(String str, Map map) {
        super(str);
        this.f10291f = null;
        this.f10292g = map;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.ref.WeakReference, com.google.android.gms.internal.ads.av0] */
    @Override // com.google.android.gms.internal.ads.nu0
    public final void a() {
        WebView webView = new WebView(ju0.f7542v.f7543u);
        this.e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.e.getSettings().setAllowContentAccess(false);
        this.e.getSettings().setAllowFileAccess(false);
        this.e.setWebViewClient(new pu0(0, this));
        this.f8868b = new WeakReference(this.e);
        s6.E(this.e, null);
        Map map = this.f10292g;
        Iterator it = map.keySet().iterator();
        if (!it.hasNext()) {
            this.f10291f = Long.valueOf(System.nanoTime());
        } else {
            map.get((String) it.next()).getClass();
            g5.q.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.nu0
    public final void b() {
        long nanoTime;
        super.b();
        if (this.f10291f == null) {
            nanoTime = 4000;
        } else {
            nanoTime = (System.nanoTime() - this.f10291f.longValue()) / 1000000;
        }
        new Handler().postDelayed(new qu0(this), Math.max(4000 - nanoTime, 2000L));
        this.e = null;
    }

    @Override // com.google.android.gms.internal.ads.nu0
    public final void d(tt0 tt0Var, a8 a8Var) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((HashMap) a8Var.f4408x);
        Iterator it = unmodifiableMap.keySet().iterator();
        if (!it.hasNext()) {
            e(tt0Var, a8Var, jSONObject);
        } else {
            unmodifiableMap.get((String) it.next()).getClass();
            g5.q.b();
        }
    }
}

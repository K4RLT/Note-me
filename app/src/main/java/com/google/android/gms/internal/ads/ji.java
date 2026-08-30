package com.google.android.gms.internal.ads;
import f9.k;
import k9.a0;
import l9.i;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class ji implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f7446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fi f7447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f7448c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7449d;

    public /* synthetic */ ji(r1 r1Var, fi fiVar, WebView webView, boolean z3) {
        this.f7446a = r1Var;
        this.f7447b = fiVar;
        this.f7448c = webView;
        this.f7449d = z3;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        ki kiVar = (ki) this.f7446a.f10054x;
        fi fiVar = this.f7447b;
        WebView webView = this.f7448c;
        String str = (String) obj;
        boolean z3 = this.f7449d;
        kiVar.getClass();
        synchronized (fiVar.f6071g) {
            fiVar.f6076m--;
        }
        try {
            boolean z9 = true;
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!kiVar.H && !TextUtils.isEmpty(webView.getTitle())) {
                    String title = webView.getTitle();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb2.append(title);
                    sb2.append("\n");
                    sb2.append(optString);
                    fiVar.a(sb2.toString(), z3, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    fiVar.a(optString, z3, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            synchronized (fiVar.f6071g) {
                if (fiVar.f6076m != 0) {
                    z9 = false;
                }
            }
            if (z9) {
                kiVar.f7758x.i(fiVar);
            }
        } catch (JSONException unused) {
            int i = a0.f19634b;
            i.a("Json string may be malformed.");
        } catch (Throwable th) {
            int i10 = a0.f19634b;
            i.b("Failed to get webview content.", th);
            k.C.f16817h.d("ContentFetchTask.processWebViewContent", th);
        }
    }
}

package com.google.android.gms.internal.ads;
import a5.a;
import b6.u;
import d.b;
import f9.j;
import g9.p;
import g9.x;
import k9.a0;
import l9.d;
import l9.i;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class pu0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9613b;

    public /* synthetic */ pu0(com.google.android.gms.internal.consent_sdk.q qVar) {
        this.f9612a = 1;
        Objects.requireNonNull(qVar);
        this.f9613b = qVar;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f9612a) {
            case 1:
                com.google.android.gms.internal.consent_sdk.q qVar = (com.google.android.gms.internal.consent_sdk.q) this.f9613b;
                int i = com.google.android.gms.internal.consent_sdk.q.f13527x;
                if (str != null && str.startsWith("consent://")) {
                    qVar.f13529v.h(str);
                    return;
                }
                return;
            default:
                super.onLoadResource(webView, str);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.f9612a) {
            case 1:
                com.google.android.gms.internal.consent_sdk.q qVar = (com.google.android.gms.internal.consent_sdk.q) this.f9613b;
                if (!qVar.f13530w) {
                    Log.d("UserMessagingPlatform", "Wall html loaded.");
                    qVar.f13530w = true;
                    return;
                }
                return;
            default:
                super.onPageFinished(webView, str);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.f9612a) {
            case 1:
                b6.u uVar = ((com.google.android.gms.internal.consent_sdk.q) this.f9613b).f13529v;
                uVar.getClass();
                Locale locale = Locale.US;
                ((com.google.android.gms.internal.consent_sdk.k) uVar.A).b(new com.google.android.gms.internal.consent_sdk.l1(2, "WebResourceError(" + i + ", " + str2 + "): " + str));
                return;
            default:
                super.onReceivedError(webView, i, str, str2);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.ref.WeakReference, com.google.android.gms.internal.ads.av0] */
    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        String str;
        int rendererPriorityAtExit;
        switch (this.f9612a) {
            case 0:
                String obj = renderProcessGoneDetail.toString();
                String valueOf = String.valueOf(webView);
                Log.w("NativeBridge", a5.a.l(new StringBuilder(String.valueOf(obj).length() + 36 + valueOf.length()), "WebView renderer gone: ", obj, "for WebView: ", valueOf));
                ru0 ru0Var = (ru0) this.f9613b;
                if (ru0Var.c() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    ru0Var.f8868b = new WeakReference(null);
                }
                webView.destroy();
                return true;
            case 1:
                if (webView != null) {
                    didCrash = renderProcessGoneDetail.didCrash();
                    if (true != didCrash) {
                        str = "was stopped by system";
                    } else {
                        str = "crashed";
                    }
                    rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
                    Log.w("UserMessagingPlatform", "WebView render process " + str + ". Renderer priority at exit: " + rendererPriorityAtExit);
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                }
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = this.f9612a;
        Object obj = this.f9613b;
        int i10 = 0;
        switch (i) {
            case 1:
                com.google.android.gms.internal.consent_sdk.q qVar = (com.google.android.gms.internal.consent_sdk.q) obj;
                int i11 = com.google.android.gms.internal.consent_sdk.q.f13527x;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                qVar.f13529v.h(str);
                return true;
            case 2:
                f9.j jVar = (f9.j) obj;
                String w42 = jVar.w4();
                Context context = jVar.f16807w;
                if (str.startsWith(w42)) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    g9.x xVar = jVar.f16810z;
                    if (xVar != null) {
                        try {
                            xVar.F(x21.J(3, null, null));
                        } catch (RemoteException e) {
                            int i12 = k9.a0.f19634b;
                            l9.i.i(e, "#007 Could not call remote method.");
                        }
                    }
                    g9.x xVar2 = jVar.f16810z;
                    if (xVar2 != null) {
                        try {
                            xVar2.w(3);
                        } catch (RemoteException e8) {
                            int i13 = k9.a0.f19634b;
                            l9.i.i(e8, "#007 Could not call remote method.");
                        }
                    }
                    jVar.v4(0);
                    return true;
                }
                if (str.startsWith("gmsg://scriptLoadFailed")) {
                    g9.x xVar3 = jVar.f16810z;
                    if (xVar3 != null) {
                        try {
                            xVar3.F(x21.J(1, null, null));
                        } catch (RemoteException e10) {
                            int i14 = k9.a0.f19634b;
                            l9.i.i(e10, "#007 Could not call remote method.");
                        }
                    }
                    g9.x xVar4 = jVar.f16810z;
                    if (xVar4 != null) {
                        try {
                            xVar4.w(0);
                        } catch (RemoteException e11) {
                            int i15 = k9.a0.f19634b;
                            l9.i.i(e11, "#007 Could not call remote method.");
                        }
                    }
                    jVar.v4(0);
                    return true;
                }
                if (str.startsWith("gmsg://adResized")) {
                    g9.x xVar5 = jVar.f16810z;
                    if (xVar5 != null) {
                        try {
                            xVar5.a();
                        } catch (RemoteException e12) {
                            int i16 = k9.a0.f19634b;
                            l9.i.i(e12, "#007 Could not call remote method.");
                        }
                    }
                    String queryParameter = Uri.parse(str).getQueryParameter("height");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        try {
                            l9.d dVar = g9.p.f17688g.f17689a;
                            i10 = l9.d.b(context, Integer.parseInt(queryParameter));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    jVar.v4(i10);
                    return true;
                }
                if (str.startsWith("gmsg://")) {
                    return true;
                }
                g9.x xVar6 = jVar.f16810z;
                if (xVar6 != null) {
                    try {
                        xVar6.e();
                        jVar.f16810z.k();
                    } catch (RemoteException e13) {
                        int i17 = k9.a0.f19634b;
                        l9.i.i(e13, "#007 Could not call remote method.");
                    }
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                context.startActivity(intent);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public /* synthetic */ pu0(int i, Object obj) {
        this.f9612a = i;
        this.f9613b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f9612a) {
            case 2:
                f9.j jVar = (f9.j) this.f9613b;
                g9.x xVar = jVar.f16810z;
                if (xVar != null) {
                    try {
                        xVar.F(x21.J(1, null, null));
                    } catch (RemoteException e) {
                        int i = k9.a0.f19634b;
                        l9.i.i(e, "#007 Could not call remote method.");
                    }
                }
                g9.x xVar2 = jVar.f16810z;
                if (xVar2 != null) {
                    try {
                        xVar2.w(0);
                        return;
                    } catch (RemoteException e8) {
                        int i10 = k9.a0.f19634b;
                        l9.i.i(e8, "#007 Could not call remote method.");
                        return;
                    }
                }
                return;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f9612a) {
            case 1:
                String uri = webResourceRequest.getUrl().toString();
                com.google.android.gms.internal.consent_sdk.q qVar = (com.google.android.gms.internal.consent_sdk.q) this.f9613b;
                int i = com.google.android.gms.internal.consent_sdk.q.f13527x;
                if (uri == null || !uri.startsWith("consent://")) {
                    return false;
                }
                qVar.f13529v.h(uri);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}

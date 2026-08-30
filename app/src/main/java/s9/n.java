package s9;

import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import k9.f0;
import ya.ee;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25088u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f25089v;

    public /* synthetic */ n(o oVar, int i) {
        this.f25088u = i;
        this.f25089v = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebViewClient d2;
        switch (this.f25088u) {
            case 0:
                o oVar = this.f25089v;
                synchronized (oVar.f25092c) {
                    WebView webView = oVar.f25094f;
                    if (webView != null) {
                        try {
                            f0 f0Var = f9.k.C.f16813c;
                            if (Build.VERSION.SDK_INT >= 26) {
                                d2 = webView.getWebViewClient();
                            } else {
                                if (ee.a("GET_WEB_VIEW_CLIENT")) {
                                    try {
                                        d2 = y5.b.d(webView);
                                    } catch (RuntimeException e) {
                                        f9.k.C.f16817h.d("AdUtil.getWebViewClient", e);
                                    }
                                }
                                throw new IllegalStateException("getWebViewClient not supported");
                            }
                            if (d2 != oVar) {
                                if (d2 != null) {
                                    oVar.e = d2;
                                }
                                webView.setWebViewClient(oVar);
                                oVar.x();
                                return;
                            }
                            return;
                        } catch (IllegalStateException unused) {
                            return;
                        }
                    }
                    return;
                }
            default:
                o oVar2 = this.f25089v;
                oVar2.f25091b.execute(new n(oVar2, 0));
                return;
        }
    }
}

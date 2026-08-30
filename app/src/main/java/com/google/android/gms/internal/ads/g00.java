package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g00 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final q00 f6235a;

    public g00(q00 q00Var) {
        this.f6235a = q00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof h00)) {
            return webView.getContext();
        }
        h00 h00Var = (h00) webView;
        Activity f10 = h00Var.f();
        if (f10 != null) {
            return f10;
        }
        return h00Var.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z3) {
        x00 x00Var;
        f9.a aVar;
        try {
            q00 q00Var = this.f6235a;
            if (q00Var != null && (x00Var = q00Var.f9696u.H) != null && (aVar = x00Var.Q) != null && aVar != null && !aVar.a()) {
                StringBuilder sb2 = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb2.append("window.");
                sb2.append(str);
                sb2.append("('");
                sb2.append(str3);
                sb2.append("')");
                aVar.b(sb2.toString());
                return false;
            }
            k9.f0 f0Var = f9.k.C.f16813c;
            AlertDialog.Builder k3 = k9.f0.k(context);
            k3.setTitle(str2);
            if (z3) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                k3.setView(linearLayout).setPositiveButton(R.string.ok, new e00(jsPromptResult, 0, editText)).setNegativeButton(R.string.cancel, new nt(1, jsPromptResult)).setOnCancelListener(new c00(1, jsPromptResult)).create().show();
                return true;
            }
            k3.setMessage(str3).setPositiveButton(R.string.ok, new d00(jsResult, 1)).setNegativeButton(R.string.cancel, new d00(jsResult, 0)).setOnCancelListener(new c00(0, jsResult)).create().show();
            return true;
        } catch (WindowManager.BadTokenException e) {
            int i = k9.a0.f19634b;
            l9.i.g("Fail to display Dialog.", e);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof h00)) {
            int i = k9.a0.f19634b;
            l9.i.f("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        j9.d z02 = ((h00) webView).z0();
        if (z02 == null) {
            int i10 = k9.a0.f19634b;
            l9.i.f("Tried to close an AdWebView not associated with an overlay.");
        } else {
            z02.l();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(message).length();
        StringBuilder sb2 = new StringBuilder(length + 6 + String.valueOf(sourceId).length() + 1 + String.valueOf(lineNumber).length() + 1);
        g3.a.t(sb2, "JS: ", message, " (", sourceId);
        String j10 = a5.a.j(sb2, ":", lineNumber, ")");
        if (j10.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = f00.f5875a[consoleMessage.messageLevel().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    if (i != 5) {
                        int i10 = k9.a0.f19634b;
                        l9.i.e(j10);
                    } else {
                        int i11 = k9.a0.f19634b;
                        l9.i.a(j10);
                    }
                } else {
                    int i12 = k9.a0.f19634b;
                    l9.i.e(j10);
                }
            } else {
                int i13 = k9.a0.f19634b;
                l9.i.f(j10);
            }
        } else {
            int i14 = k9.a0.f19634b;
            l9.i.c(j10);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z3, boolean z9, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        x00 x00Var = this.f6235a.f9696u.H;
        if (x00Var != null) {
            webView2.setWebViewClient(x00Var);
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        long j13 = 5242880 - j12;
        if (j13 <= 0) {
            quotaUpdater.updateQuota(j10);
            return;
        }
        if (j10 == 0) {
            if (j11 > j13 || j11 > 1048576) {
                j11 = 0;
            }
        } else if (j11 == 0) {
            j11 = Math.min(Math.min(131072L, j13) + j10, 1048576L);
        } else {
            if (j11 <= Math.min(1048576 - j10, j13)) {
                j10 += j11;
            }
            j11 = j10;
        }
        quotaUpdater.updateQuota(j11);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z3;
        if (callback != null) {
            k9.f0 f0Var = f9.k.C.f16813c;
            q00 q00Var = this.f6235a;
            if (k9.f0.c(q00Var.getContext(), "android.permission.ACCESS_FINE_LOCATION") || k9.f0.c(q00Var.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                z3 = true;
            } else {
                z3 = false;
            }
            nl nlVar = sl.Ne;
            g9.r rVar = g9.r.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                callback.invoke(str, false, true);
            } else {
                callback.invoke(str, z3, true);
            }
            if (((Boolean) rVar.f17698c.a(sl.Oe)).booleanValue()) {
                int i = k9.a0.f19634b;
                l9.i.a("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        j9.d z02 = this.f6235a.f9696u.z0();
        if (z02 == null) {
            int i = k9.a0.f19634b;
            l9.i.f("Could not get ad overlay when hiding custom view.");
        } else {
            z02.y();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        j9.d z02 = this.f6235a.f9696u.z0();
        if (z02 == null) {
            int i10 = k9.a0.f19634b;
            l9.i.f("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = z02.f19064v;
        FrameLayout frameLayout = new FrameLayout(activity);
        z02.B = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        z02.B.addView(view, -1, -1);
        activity.setContentView(z02.B);
        z02.M = true;
        z02.C = customViewCallback;
        z02.A = true;
        z02.O(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}

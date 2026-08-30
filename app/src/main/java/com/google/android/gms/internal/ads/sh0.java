package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.webkit.WebView;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public final class sh0 extends TimerTask {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10613u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Timer f10614v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f10615w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f10616x;

    public sh0(xt0 xt0Var, hx0 hx0Var, Timer timer) {
        this.f10615w = hx0Var;
        this.f10614v = timer;
        Objects.requireNonNull(xt0Var);
        this.f10616x = xt0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.f10613u;
        Timer timer = this.f10614v;
        Object obj = this.f10615w;
        Object obj2 = this.f10616x;
        switch (i) {
            case 0:
                ((AlertDialog) obj).dismiss();
                timer.cancel();
                j9.d dVar = (j9.d) obj2;
                if (dVar != null) {
                    dVar.l();
                    return;
                }
                return;
            default:
                WebView webView = ((xt0) obj2).f12621b;
                int i10 = y5.b.f30913a;
                if (z5.k.f31927d.b()) {
                    ((WebViewProviderBoundaryInterface) y5.b.b(webView).f25315v).removeWebMessageListener("omidJsSessionService");
                    s00 s00Var = ((q00) ((hx0) obj).f6914v).f9696u;
                    k9.b0 b0Var = k9.f0.f19676l;
                    Objects.requireNonNull(s00Var);
                    b0Var.post(new p00(s00Var, 0));
                    timer.cancel();
                    return;
                }
                throw z5.k.a();
        }
    }

    public sh0(wh0 wh0Var, AlertDialog alertDialog, Timer timer, j9.d dVar) {
        this.f10615w = alertDialog;
        this.f10614v = timer;
        this.f10616x = dVar;
    }
}

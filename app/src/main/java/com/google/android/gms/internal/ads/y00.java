package com.google.android.gms.internal.ads;
import g9.r;
import r.e;

import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class y00 extends x00 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.ads.ij, com.google.android.filament.j, java.lang.Object] */
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        q00 q00Var = this.f12390u;
        if (q00Var.f9698w.compareAndSet(false, true)) {
            if (((Boolean) g9.r.e.f17698c.a(sl.f10947t1)).booleanValue()) {
                return false;
            }
            s00 s00Var = q00Var.f9696u;
            if (s00Var.getParent() instanceof ViewGroup) {
                ((ViewGroup) s00Var.getParent()).removeView(s00Var);
            }
            s00Var.destroy();
            Object obj = new Object();
            obj.f4252u = didCrash;
            obj.f4253v = rendererPriorityAtExit;
            jj jjVar = s00Var.f10435u0;
            jjVar.a(obj);
            jjVar.b(10003);
        }
        return true;
    }
}

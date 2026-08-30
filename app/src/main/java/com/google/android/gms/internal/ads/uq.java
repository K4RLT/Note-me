package com.google.android.gms.internal.ads;
import g9.p;
import k9.a0;
import k9.f0;
import l9.d;
import l9.i;

import android.os.Looper;

/* loaded from: classes.dex */
public final class uq implements rq, er {

    /* renamed from: u, reason: collision with root package name */
    public h00 f11699u;

    public static final void k(Runnable runnable) {
        d dVar = p.f17688g.f17689a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a0.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            a0.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (!f0.f19676l.post(runnable)) {
                i.f("runOnUiThread > the runnable could not be placed to the message queue");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.er
    public final void e(String str, mp mpVar) {
        h00 h00Var = this.f11699u;
        if (h00Var != null) {
            h00Var.f1(str, new lx0(9, mpVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.er
    public final void l(String str, mp mpVar) {
        h00 h00Var = this.f11699u;
        if (h00Var != null) {
            h00Var.h1(str, new sq(this, mpVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.rq, com.google.android.gms.internal.ads.vq
    public final void o(String str) {
        a0.k("invokeJavascript on adWebView from js");
        k(new tq(this, str, 1));
    }
}

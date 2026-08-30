package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.app.Dialog;
import android.os.Handler;
import com.google.android.gms.internal.ads.pu0;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Application f13461a;

    /* renamed from: b, reason: collision with root package name */
    public final r f13462b;

    /* renamed from: c, reason: collision with root package name */
    public final g f13463c;

    /* renamed from: d, reason: collision with root package name */
    public final o f13464d;
    public final m e;

    /* renamed from: f, reason: collision with root package name */
    public final y f13465f;

    /* renamed from: g, reason: collision with root package name */
    public Dialog f13466g;

    /* renamed from: h, reason: collision with root package name */
    public q f13467h;
    public final AtomicBoolean i = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f13468j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f13469k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f13470l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    public boolean f13471m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13472n = false;

    public k(Application application, r rVar, g gVar, o oVar, m mVar, y yVar) {
        this.f13461a = application;
        this.f13462b = rVar;
        this.f13463c = gVar;
        this.f13464d = oVar;
        this.e = mVar;
        this.f13465f = yVar;
    }

    public final void a(xb.b bVar, xb.a aVar) {
        m mVar = this.e;
        r rVar = (r) ((d7) mVar.f13487u).zzb();
        Handler handler = d0.f13387a;
        f0.c(handler);
        this.f13467h = new q(rVar, handler, ((g9.n) mVar.f13488v).zzb());
        boolean z3 = this.f13471m;
        y yVar = this.f13465f;
        if (!z3) {
            ((Queue) yVar.f13614j.get()).add(Long.valueOf(System.currentTimeMillis()));
        }
        q qVar = this.f13467h;
        qVar.setBackgroundColor(0);
        qVar.getSettings().setJavaScriptEnabled(true);
        qVar.getSettings().setAllowFileAccess(false);
        qVar.getSettings().setAllowContentAccess(false);
        qVar.setWebViewClient(new pu0(qVar));
        if (!this.f13471m) {
            yVar.a((Queue) yVar.f13614j.get(), 3, 2, null);
        }
        this.f13468j.set(new j(bVar, aVar));
        q qVar2 = this.f13467h;
        o oVar = this.f13464d;
        qVar2.loadDataWithBaseURL(oVar.f13507a, oVar.f13508b, "text/html", "UTF-8", null);
        handler.postDelayed(new h(0, this), 10000L);
    }

    public final void b(l1 l1Var) {
        j jVar = (j) this.f13468j.getAndSet(null);
        if (jVar == null) {
            return;
        }
        if (!this.f13471m) {
            String message = l1Var.getMessage();
            boolean z3 = this.f13472n;
            y yVar = this.f13465f;
            if (z3) {
                yVar.a((Queue) yVar.i.get(), 10, 11, message);
            } else {
                yVar.a((Queue) yVar.f13612g.get(), 4, 5, message);
            }
        }
        jVar.d(l1Var.a());
    }

    public final void c(l1 l1Var) {
        String message;
        if (this.f13471m) {
            return;
        }
        if (l1Var == null) {
            message = null;
        } else {
            message = l1Var.getMessage();
        }
        boolean z3 = this.f13472n;
        y yVar = this.f13465f;
        if (z3) {
            yVar.a((Queue) yVar.i.get(), 10, 11, message);
        } else {
            yVar.a((Queue) yVar.f13613h.get(), 6, 7, message);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class fw {

    /* renamed from: a, reason: collision with root package name */
    public final wv f6189a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6190b;

    /* renamed from: c, reason: collision with root package name */
    public final kw f6191c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6192d;

    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.internal.ads.yv, com.google.android.gms.internal.ads.kw] */
    public fw(Context context, String str) {
        g9.n nVar = g9.p.f17688g.f17690b;
        tr trVar = new tr();
        nVar.getClass();
        wv wvVar = (wv) new g9.b(nVar, context, str, trVar).d(context, false);
        this.f6192d = System.currentTimeMillis();
        new AtomicLong();
        this.f6190b = context.getApplicationContext();
        new AtomicReference(str);
        this.f6189a = wvVar;
        this.f6191c = new yv();
    }

    public static void a(Context context, String str, z8.g gVar, m9.b bVar) {
        fa.y.i(context, "Context cannot be null.");
        fa.y.i(str, "AdUnitId cannot be null.");
        fa.y.d("#008 Must be called on the main UI thread.");
        sl.a(context);
        if (((Boolean) um.f11684k.p()).booleanValue()) {
            if (((Boolean) g9.r.e.f17698c.a(sl.Cc)).booleanValue()) {
                l9.b.f20035b.execute(new b9.a(context, str, gVar, bVar, 14));
                return;
            }
        }
        l9.i.a("Loading on UI thread");
        new fw(context, str).c(gVar.f31983a, bVar);
    }

    public final void b(Activity activity, z8.o oVar) {
        kw kwVar = this.f6191c;
        kwVar.f7893v = oVar;
        if (activity == null) {
            l9.i.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            wv wvVar = this.f6189a;
            if (wvVar != null) {
                wvVar.B2(kwVar);
                wvVar.Y0(new oa.b(activity));
            }
        } catch (RemoteException e) {
            l9.i.i(e, "#007 Could not call remote method.");
        }
    }

    public final void c(g9.d2 d2Var, m9.b bVar) {
        try {
            wv wvVar = this.f6189a;
            if (wvVar != null) {
                d2Var.f17607m = this.f6192d;
                wvVar.w0(g9.b3.a(this.f6190b, d2Var), new gw(bVar, this, 0));
            }
        } catch (RemoteException e) {
            l9.i.i(e, "#007 Could not call remote method.");
        }
    }
}

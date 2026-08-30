package com.google.android.gms.internal.ads;
import b9.a;
import fa.y;
import g9.b3;
import g9.b;
import g9.d2;
import g9.n;
import g9.p;
import g9.r;
import l9.b;
import l9.i;
import z8.g;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class lw {

    /* renamed from: a, reason: collision with root package name */
    public final wv f8162a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8163b;

    /* renamed from: c, reason: collision with root package name */
    public final kw f8164c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8165d = System.currentTimeMillis();

    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.internal.ads.yv, com.google.android.gms.internal.ads.kw] */
    public lw(Context context, String str) {
        new AtomicLong();
        this.f8163b = context.getApplicationContext();
        n nVar = p.f17688g.f17690b;
        tr trVar = new tr();
        nVar.getClass();
        this.f8162a = (wv) new b(nVar, context, str, trVar).d(context, false);
        this.f8164c = new yv();
    }

    public static void a(Context context, String str, g gVar, rf0 rf0Var) {
        y.i(context, "Context cannot be null.");
        y.i(str, "AdUnitId cannot be null.");
        y.d("#008 Must be called on the main UI thread.");
        sl.a(context);
        if (((Boolean) um.f11684k.p()).booleanValue()) {
            if (((Boolean) r.e.f17698c.a(sl.Cc)).booleanValue()) {
                b.f20035b.execute(new a(context, str, gVar, rf0Var, 15));
                return;
            }
        }
        new lw(context, str).b(gVar.f31983a, rf0Var);
    }

    public final void b(d2 d2Var, rf0 rf0Var) {
        try {
            wv wvVar = this.f8162a;
            if (wvVar != null) {
                d2Var.f17607m = this.f8165d;
                wvVar.Y3(b3.a(this.f8163b, d2Var), new gw(rf0Var, this, 1));
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }
}

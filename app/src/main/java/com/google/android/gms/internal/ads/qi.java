package com.google.android.gms.internal.ads;
import b9.a;
import fa.y;
import g9.r;
import l9.b;
import r.e;
import z8.g;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class qi {

    /* renamed from: a, reason: collision with root package name */
    public final ti f9848a;

    /* renamed from: b, reason: collision with root package name */
    public final ri f9849b = new ph("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.ri, com.google.android.gms.internal.ads.ph] */
    public qi(ti tiVar, String str) {
        new AtomicLong();
        this.f9848a = tiVar;
        new AtomicReference(str);
    }

    public static void a(Context context, String str, z8.g gVar, rf0 rf0Var) {
        fa.y.i(context, "Context cannot be null.");
        fa.y.i(str, "adUnitId cannot be null.");
        fa.y.d("#008 Must be called on the main UI thread.");
        sl.a(context);
        if (((Boolean) um.f11679d.p()).booleanValue()) {
            if (((Boolean) g9.r.e.f17698c.a(sl.Cc)).booleanValue()) {
                l9.b.f20035b.execute(new b9.a(context, str, gVar, rf0Var, 0));
                return;
            }
        }
        new a8(context, str, gVar.f31983a, rf0Var).b();
    }
}

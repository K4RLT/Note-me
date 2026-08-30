package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fc0 {

    /* renamed from: a, reason: collision with root package name */
    public final aq0 f6010a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f6011b;

    /* renamed from: c, reason: collision with root package name */
    public final gd0 f6012c;

    /* renamed from: d, reason: collision with root package name */
    public final vc0 f6013d;
    public final Context e;

    /* renamed from: f, reason: collision with root package name */
    public final be0 f6014f;

    /* renamed from: g, reason: collision with root package name */
    public final xs0 f6015g;

    /* renamed from: h, reason: collision with root package name */
    public final rh0 f6016h;
    public final b60 i;

    /* renamed from: j, reason: collision with root package name */
    public final zd0 f6017j;

    /* renamed from: k, reason: collision with root package name */
    public final me0 f6018k;

    public fc0(aq0 aq0Var, Executor executor, gd0 gd0Var, Context context, be0 be0Var, xs0 xs0Var, rh0 rh0Var, vc0 vc0Var, zd0 zd0Var, me0 me0Var, b60 b60Var) {
        this.f6010a = aq0Var;
        this.f6011b = executor;
        this.f6012c = gd0Var;
        this.e = context;
        this.f6014f = be0Var;
        this.f6015g = xs0Var;
        this.f6016h = rh0Var;
        this.f6013d = vc0Var;
        this.f6017j = zd0Var;
        this.f6018k = me0Var;
        this.i = b60Var;
    }

    public static final void b(h00 h00Var) {
        h00Var.h1("/videoClicked", lp.f8079d);
        x00 j02 = h00Var.j0();
        synchronized (j02.f12393x) {
            j02.L = true;
        }
        h00Var.h1("/getNativeAdViewSignals", lp.f8087n);
        h00Var.h1("/getNativeClickMeta", lp.f8088o);
    }

    public final void a(h00 h00Var, f9.a aVar, mw mwVar) {
        me0 me0Var;
        f9.a aVar2;
        b(h00Var);
        h00Var.h1("/video", lp.f8081g);
        h00Var.h1("/videoMeta", lp.f8082h);
        h00Var.h1("/precache", new hp(26));
        h00Var.h1("/delayPageLoaded", lp.f8084k);
        h00Var.h1("/instrument", lp.i);
        h00Var.h1("/log", lp.f8078c);
        h00Var.h1("/click", new jp(null, 0, null));
        if (this.f6010a.f4579b != null) {
            x00 j02 = h00Var.j0();
            synchronized (j02.f12393x) {
                j02.N = true;
            }
            if (true != ((Boolean) g9.r.e.f17698c.a(sl.f10846mf)).booleanValue()) {
                aVar2 = null;
            } else {
                aVar2 = aVar;
            }
            h00Var.h1("/open", new tp(aVar2, null, null, null, null, null, this.i));
        } else {
            x00 j03 = h00Var.j0();
            synchronized (j03.f12393x) {
                j03.N = false;
            }
        }
        if (f9.k.C.f16833y.a(h00Var.getContext())) {
            HashMap hashMap = new HashMap();
            if (h00Var.J() != null) {
                hashMap = h00Var.J().f9965w0;
            }
            h00Var.h1("/logScionEvent", new jp(h00Var.getContext(), 1, hashMap));
        }
        nl nlVar = sl.f10846mf;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            h00Var.j0().Q = aVar;
            h00Var.j0().S = mwVar;
        }
        if (((Boolean) rVar.f17698c.a(sl.H8)).booleanValue() && (me0Var = this.f6018k) != null) {
            h00Var.h1("/onDeviceStorageEvent", new cp(3, me0Var));
        }
    }
}

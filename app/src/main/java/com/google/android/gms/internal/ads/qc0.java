package com.google.android.gms.internal.ads;
import b6.u;
import g9.r;
import j6.l;
import l9.a;
import r.e;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qc0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final j6.l f9805a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9806b;

    /* renamed from: c, reason: collision with root package name */
    public final be0 f9807c;

    /* renamed from: d, reason: collision with root package name */
    public final rh0 f9808d;
    public final Executor e;

    /* renamed from: f, reason: collision with root package name */
    public final of f9809f;

    /* renamed from: g, reason: collision with root package name */
    public final l9.a f9810g;

    /* renamed from: h, reason: collision with root package name */
    public final xs0 f9811h;
    public final wh0 i;

    /* renamed from: j, reason: collision with root package name */
    public final cq0 f9812j;

    /* renamed from: k, reason: collision with root package name */
    public final b60 f9813k;

    public qc0(Context context, Executor executor, of ofVar, l9.a aVar, j6.l lVar, rh0 rh0Var, xs0 xs0Var, be0 be0Var, wh0 wh0Var, cq0 cq0Var, b60 b60Var) {
        this.f9806b = context;
        this.e = executor;
        this.f9809f = ofVar;
        this.f9810g = aVar;
        this.f9805a = lVar;
        this.f9808d = rh0Var;
        this.f9811h = xs0Var;
        this.f9807c = be0Var;
        this.i = wh0Var;
        this.f9812j = cq0Var;
        this.f9813k = b60Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        rc0 rc0Var = new rc0(this);
        synchronized (rc0Var) {
            String str = (String) g9.r.e.f17698c.a(sl.E4);
            of ofVar = rc0Var.f10203f;
            j6.l lVar = rc0Var.f10200b;
            wh0 wh0Var = rc0Var.f10207k;
            c81 d02 = ed1.d0(ed1.O(new b6.u(rc0Var.f10201c, ofVar, rc0Var.f10204g, lVar, wh0Var, rc0Var.f10208l, rc0Var.f10202d, str), xx.f12655f), new cv(1, rc0Var), rc0Var.e);
            rc0Var.f10210n = d02;
            x21.i(d02, "NativeJavascriptExecutor.initializeEngine", xx.f12657h);
        }
        return rc0Var;
    }
}

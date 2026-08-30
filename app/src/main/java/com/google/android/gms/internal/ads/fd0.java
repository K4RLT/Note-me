package com.google.android.gms.internal.ads;
import a5.a;
import f9.a;
import f9.k;
import g9.a;
import g9.r;
import j6.l;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fd0 {

    /* renamed from: a, reason: collision with root package name */
    public final q60 f6023a;

    /* renamed from: b, reason: collision with root package name */
    public final e90 f6024b;

    /* renamed from: c, reason: collision with root package name */
    public final g70 f6025c;

    /* renamed from: d, reason: collision with root package name */
    public final n70 f6026d;
    public final r70 e;

    /* renamed from: f, reason: collision with root package name */
    public final h80 f6027f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f6028g;

    /* renamed from: h, reason: collision with root package name */
    public final d90 f6029h;
    public final u30 i;

    /* renamed from: j, reason: collision with root package name */
    public final a f6030j;

    /* renamed from: k, reason: collision with root package name */
    public final mw f6031k;

    /* renamed from: l, reason: collision with root package name */
    public final of f6032l;

    /* renamed from: m, reason: collision with root package name */
    public final d80 f6033m;

    /* renamed from: n, reason: collision with root package name */
    public final rh0 f6034n;

    /* renamed from: o, reason: collision with root package name */
    public final xs0 f6035o;

    /* renamed from: p, reason: collision with root package name */
    public final be0 f6036p;

    /* renamed from: q, reason: collision with root package name */
    public final g30 f6037q;

    /* renamed from: r, reason: collision with root package name */
    public final jd0 f6038r;

    /* renamed from: s, reason: collision with root package name */
    public final me0 f6039s;

    /* renamed from: t, reason: collision with root package name */
    public final g60 f6040t;

    /* renamed from: u, reason: collision with root package name */
    public final c60 f6041u;

    /* renamed from: v, reason: collision with root package name */
    public final b60 f6042v;

    public fd0(q60 q60Var, g70 g70Var, n70 n70Var, r70 r70Var, h80 h80Var, Executor executor, d90 d90Var, u30 u30Var, a aVar, mw mwVar, of ofVar, d80 d80Var, rh0 rh0Var, xs0 xs0Var, be0 be0Var, e90 e90Var, g30 g30Var, jd0 jd0Var, me0 me0Var, g60 g60Var, c60 c60Var, b60 b60Var) {
        this.f6023a = q60Var;
        this.f6025c = g70Var;
        this.f6026d = n70Var;
        this.e = r70Var;
        this.f6027f = h80Var;
        this.f6028g = executor;
        this.f6029h = d90Var;
        this.i = u30Var;
        this.f6030j = aVar;
        this.f6031k = mwVar;
        this.f6032l = ofVar;
        this.f6033m = d80Var;
        this.f6034n = rh0Var;
        this.f6035o = xs0Var;
        this.f6036p = be0Var;
        this.f6024b = e90Var;
        this.f6037q = g30Var;
        this.f6038r = jd0Var;
        this.f6039s = me0Var;
        this.f6040t = g60Var;
        this.f6041u = c60Var;
        this.f6042v = b60Var;
    }

    public static final yx b(h00 h00Var, String str, String str2, zd0 zd0Var, ur0 ur0Var) {
        nl nlVar = sl.M2;
        r rVar = r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            a.u(k.C.f16819k, zd0Var, "rendering-webview-load-html-start");
        }
        yx yxVar = new yx();
        if (((Boolean) rVar.f17698c.a(sl.f10732fa)).booleanValue()) {
            rr0 d2 = rr0.d(h00Var.getContext(), 112);
            d2.zza();
            ed1.V(yxVar, ur0Var, d2, false);
        }
        h00Var.j0().A = new l(zd0Var, 6, yxVar);
        h00Var.D0(str, str2);
        return yxVar;
    }

    public final void a(h00 h00Var, boolean z3, op opVar, zd0 zd0Var) {
        lf lfVar;
        nl nlVar = sl.M2;
        r rVar = r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
            a.u(k.C.f16819k, zd0Var, "rendering-configure-webview-start");
        }
        h00Var.j0().p(new a() { // from class: com.google.android.gms.internal.ads.ed0
            @Override // a
            public final /* synthetic */ void L() {
                fd0.this.f6023a.L();
            }
        }, this.f6026d, this.e, new ep() { // from class: com.google.android.gms.internal.ads.bd0
            @Override // com.google.android.gms.internal.ads.ep
            public final /* synthetic */ void R(String str, String str2) {
                fd0.this.f6027f.R(str, str2);
            }
        }, new oc0(2, this), z3, opVar, this.f6030j, new hx0(18, this), this.f6031k, this.f6034n, this.f6035o, this.f6036p, null, this.f6024b, null, null, null, this.f6037q, this.f6039s, this.f6040t, this.f6041u, this.f6042v);
        h00Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.cd0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                fd0 fd0Var = fd0.this;
                if (((Boolean) r.e.f17698c.a(sl.f10986vb)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    fd0Var.f6038r.f7421a = motionEvent;
                }
                fd0Var.f6030j.f16785b = true;
                if (view != null) {
                    view.performClick();
                    return false;
                }
                return false;
            }
        });
        h00Var.setOnClickListener(new kt(this));
        if (((Boolean) qlVar2.a(sl.f10979v3)).booleanValue() && (lfVar = this.f6032l.f9103b) != null) {
            lfVar.g(h00Var.U());
        }
        d90 d90Var = this.f6029h;
        Executor executor = this.f6028g;
        d90Var.L1(h00Var, executor);
        d90Var.L1(new cc0(h00Var, 2), executor);
        d90Var.U1(h00Var.U());
        h00Var.h1("/trackActiveViewUnit", new jp(this, 5, h00Var));
        u30 u30Var = this.i;
        u30Var.getClass();
        u30Var.D = new WeakReference(h00Var);
        if (((Boolean) qlVar2.a(nlVar)).booleanValue()) {
            a.u(k.C.f16819k, zd0Var, "rendering-configure-webview-end");
        }
    }
}

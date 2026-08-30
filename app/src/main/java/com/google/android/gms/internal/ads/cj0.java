package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cj0 implements di0 {

    /* renamed from: b, reason: collision with root package name */
    public final Context f5094b;

    /* renamed from: c, reason: collision with root package name */
    public final gd0 f5095c;

    /* renamed from: d, reason: collision with root package name */
    public final aq0 f5096d;
    public final Executor e;

    /* renamed from: f, reason: collision with root package name */
    public final l9.a f5097f;

    /* renamed from: g, reason: collision with root package name */
    public final op f5098g;
    public final wh0 i;

    /* renamed from: j, reason: collision with root package name */
    public final zd0 f5100j;

    /* renamed from: k, reason: collision with root package name */
    public final be0 f5101k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f5102l;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5093a = 0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5099h = ((Boolean) g9.r.e.f17698c.a(sl.f10796ja)).booleanValue();

    public cj0(Context context, l9.a aVar, aq0 aq0Var, Executor executor, h20 h20Var, gd0 gd0Var, op opVar, wh0 wh0Var, zd0 zd0Var, be0 be0Var) {
        this.f5094b = context;
        this.f5096d = aq0Var;
        this.f5102l = h20Var;
        this.e = executor;
        this.f5097f = aVar;
        this.f5095c = gd0Var;
        this.f5098g = opVar;
        this.i = wh0Var;
        this.f5100j = zd0Var;
        this.f5101k = be0Var;
    }

    @Override // com.google.android.gms.internal.ads.di0
    public final ac.b a(wp0 wp0Var, qp0 qp0Var) {
        switch (this.f5093a) {
            case 0:
                v80 v80Var = new v80(15);
                v81 v81Var = v81.f11836v;
                d50 d50Var = new d50(this, qp0Var, wp0Var, v80Var, 7);
                Executor executor = this.e;
                b81 c02 = ed1.c0(v81Var, d50Var, executor);
                c02.a(new af(5), executor);
                return c02;
            default:
                v80 v80Var2 = new v80(15);
                v81 v81Var2 = v81.f11836v;
                d50 d50Var2 = new d50(this, qp0Var, wp0Var, v80Var2, 9);
                Executor executor2 = this.e;
                b81 c03 = ed1.c0(v81Var2, d50Var2, executor2);
                c03.a(new af(6), executor2);
                return c03;
        }
    }

    @Override // com.google.android.gms.internal.ads.di0
    public final boolean b(wp0 wp0Var, qp0 qp0Var) {
        switch (this.f5093a) {
            case 0:
                up0 up0Var = qp0Var.f9956s;
                if (up0Var != null && up0Var.f11695a != null) {
                    return true;
                }
                return false;
            default:
                up0 up0Var2 = qp0Var.f9956s;
                if (up0Var2 != null && up0Var2.f11695a != null) {
                    return true;
                }
                return false;
        }
    }

    public cj0(Context context, l9.a aVar, aq0 aq0Var, Executor executor, k20 k20Var, gd0 gd0Var, op opVar, wh0 wh0Var, zd0 zd0Var, be0 be0Var) {
        this.f5094b = context;
        this.f5096d = aq0Var;
        this.f5102l = k20Var;
        this.e = executor;
        this.f5097f = aVar;
        this.f5095c = gd0Var;
        this.f5098g = opVar;
        this.i = wh0Var;
        this.f5100j = zd0Var;
        this.f5101k = be0Var;
    }
}

package com.google.android.gms.internal.ads;
import ac.b;
import g9.r;
import l9.a;
import r.e;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class li0 implements di0 {

    /* renamed from: a, reason: collision with root package name */
    public final b20 f8038a;

    /* renamed from: b, reason: collision with root package name */
    public final gd0 f8039b;

    /* renamed from: c, reason: collision with root package name */
    public final aq0 f8040c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f8041d;
    public final l9.a e;

    /* renamed from: f, reason: collision with root package name */
    public final op f8042f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8043g = ((Boolean) g9.r.e.f17698c.a(sl.f10796ja)).booleanValue();

    /* renamed from: h, reason: collision with root package name */
    public final wh0 f8044h;
    public final zd0 i;

    /* renamed from: j, reason: collision with root package name */
    public final be0 f8045j;

    public li0(b20 b20Var, Executor executor, gd0 gd0Var, aq0 aq0Var, l9.a aVar, op opVar, wh0 wh0Var, zd0 zd0Var, be0 be0Var) {
        this.f8038a = b20Var;
        this.f8041d = executor;
        this.f8039b = gd0Var;
        this.f8040c = aq0Var;
        this.e = aVar;
        this.f8042f = opVar;
        this.f8044h = wh0Var;
        this.i = zd0Var;
        this.f8045j = be0Var;
    }

    @Override // com.google.android.gms.internal.ads.di0
    public final ac.b a(wp0 wp0Var, qp0 qp0Var) {
        v80 v80Var = new v80(15);
        v81 v81Var = v81.f11836v;
        d50 d50Var = new d50(this, qp0Var, wp0Var, v80Var, 3);
        Executor executor = this.f8041d;
        b81 c02 = ed1.c0(v81Var, d50Var, executor);
        c02.a(new af(4), executor);
        return c02;
    }

    @Override // com.google.android.gms.internal.ads.di0
    public final boolean b(wp0 wp0Var, qp0 qp0Var) {
        up0 up0Var = qp0Var.f9956s;
        if (up0Var != null && up0Var.f11695a != null) {
            return true;
        }
        return false;
    }
}

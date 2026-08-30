package com.google.android.gms.internal.ads;
import ac.b;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class si0 implements di0 {

    /* renamed from: a, reason: collision with root package name */
    public final d20 f10617a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10618b;

    /* renamed from: c, reason: collision with root package name */
    public final gd0 f10619c;

    /* renamed from: d, reason: collision with root package name */
    public final aq0 f10620d;
    public final Executor e;

    /* renamed from: f, reason: collision with root package name */
    public final f31 f10621f;

    /* renamed from: g, reason: collision with root package name */
    public final zd0 f10622g;

    public si0(d20 d20Var, Context context, Executor executor, gd0 gd0Var, aq0 aq0Var, f31 f31Var, zd0 zd0Var) {
        this.f10618b = context;
        this.f10617a = d20Var;
        this.e = executor;
        this.f10619c = gd0Var;
        this.f10620d = aq0Var;
        this.f10621f = f31Var;
        this.f10622g = zd0Var;
    }

    @Override // com.google.android.gms.internal.ads.di0
    public final ac.b a(wp0 wp0Var, qp0 qp0Var) {
        return ed1.c0(v81.f11836v, new d50(4, this, wp0Var, qp0Var), this.e);
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

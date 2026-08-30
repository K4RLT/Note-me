package com.google.android.gms.internal.ads;
import g9.r;
import s9.m;

import android.content.Context;

/* loaded from: classes.dex */
public final class dg0 implements a80, j90, k70, b70 {

    /* renamed from: u, reason: collision with root package name */
    public final Context f5431u;

    /* renamed from: v, reason: collision with root package name */
    public final be0 f5432v;

    public dg0(Context context, be0 be0Var) {
        this.f5431u = context;
        this.f5432v = be0Var;
    }

    @Override // com.google.android.gms.internal.ads.j90
    public final void G(String str) {
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void S(wp0 wp0Var) {
    }

    @Override // com.google.android.gms.internal.ads.j90
    public final void a(m mVar) {
        if (((Boolean) r.e.f17698c.a(sl.C5)).booleanValue()) {
            b(this.f5431u);
        }
    }

    public final void b(Context context) {
        if (((Boolean) r.e.f17698c.a(sl.f11044z5)).booleanValue()) {
            xx.f12651a.execute(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this, 19, context));
        }
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final void e() {
        if (((Boolean) r.e.f17698c.a(sl.D5)).booleanValue()) {
            b(this.f5431u);
        }
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void r(dv dvVar) {
        if (((Boolean) r.e.f17698c.a(sl.B5)).booleanValue()) {
            b(this.f5431u);
        }
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void y() {
        if (((Boolean) r.e.f17698c.a(sl.E5)).booleanValue()) {
            b(this.f5431u);
        }
    }
}

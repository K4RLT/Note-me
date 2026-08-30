package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class v50 implements a80, j90 {
    public final nf0 A;

    /* renamed from: u, reason: collision with root package name */
    public final Context f11803u;

    /* renamed from: v, reason: collision with root package name */
    public final aq0 f11804v;

    /* renamed from: w, reason: collision with root package name */
    public final l9.a f11805w;

    /* renamed from: x, reason: collision with root package name */
    public final k9.c0 f11806x;

    /* renamed from: y, reason: collision with root package name */
    public final af0 f11807y;

    /* renamed from: z, reason: collision with root package name */
    public final vr0 f11808z;

    public v50(Context context, aq0 aq0Var, l9.a aVar, k9.c0 c0Var, af0 af0Var, vr0 vr0Var, nf0 nf0Var) {
        this.f11803u = context;
        this.f11804v = aq0Var;
        this.f11805w = aVar;
        this.f11806x = c0Var;
        this.f11807y = af0Var;
        this.f11808z = vr0Var;
        this.A = nf0Var;
    }

    @Override // com.google.android.gms.internal.ads.j90
    public final void G(String str) {
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void S(wp0 wp0Var) {
    }

    @Override // com.google.android.gms.internal.ads.j90
    public final void a(s9.m mVar) {
        if (((Boolean) g9.r.e.f17698c.a(sl.T4)).booleanValue()) {
            b();
        }
    }

    public final void b() {
        String str;
        if (((Boolean) g9.r.e.f17698c.a(sl.S4)).booleanValue()) {
            String str2 = this.f11804v.f4583g;
            mx n10 = this.f11806x.n();
            f3 f3Var = f9.k.C.f16820l;
            boolean f10 = this.A.f();
            if (n10 != null) {
                f3Var.getClass();
                str = n10.f8474d;
            } else {
                str = null;
            }
            f3Var.i(this.f11803u, this.f11805w, false, n10, str, str2, null, this.f11808z, null, null, f10);
        }
        this.f11807y.a();
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void r(dv dvVar) {
        b();
    }
}

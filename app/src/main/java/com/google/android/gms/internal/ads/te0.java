package com.google.android.gms.internal.ads;
import g9.c3;
import g9.z2;
import oa.b;

import android.content.Context;

/* loaded from: classes.dex */
public final class te0 implements oe0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f11331a;

    /* renamed from: b, reason: collision with root package name */
    public final cl0 f11332b;

    public te0(long j10, Context context, tf tfVar, y10 y10Var, String str) {
        this.f11331a = j10;
        y10 y10Var2 = y10Var.f12709b;
        g9.c3 c3Var = new g9.c3();
        str.getClass();
        cl0 cl0Var = (cl0) new i20(y10Var2, context, str, c3Var).f6968a.zzb();
        this.f11332b = cl0Var;
        cl0Var.G3(new se0(this, tfVar));
    }

    @Override // com.google.android.gms.internal.ads.oe0
    public final void a(g9.z2 z2Var) {
        this.f11332b.n1(z2Var);
    }

    @Override // com.google.android.gms.internal.ads.oe0
    public final void c() {
        this.f11332b.y();
    }

    @Override // com.google.android.gms.internal.ads.oe0
    public final void zzb() {
        this.f11332b.r4(new oa.b(null));
    }
}

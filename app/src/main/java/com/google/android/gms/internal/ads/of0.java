package com.google.android.gms.internal.ads;
import g9.r;
import l9.a;
import s9.b;

import android.content.Context;

/* loaded from: classes.dex */
public final class of0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9104a;

    /* renamed from: b, reason: collision with root package name */
    public final o10 f9105b;

    /* renamed from: c, reason: collision with root package name */
    public final u10 f9106c;

    public /* synthetic */ of0(o10 o10Var, u10 u10Var, int i) {
        this.f9104a = i;
        this.f9105b = o10Var;
        this.f9106c = u10Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        int i = this.f9104a;
        u10 u10Var = this.f9106c;
        o10 o10Var = this.f9105b;
        switch (i) {
            case 0:
                return new qf0(o10Var.a(), u10Var.a());
            case 1:
                Context a10 = o10Var.a();
                a a11 = u10Var.a();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new ag0(a10, a11, wxVar);
            default:
                Context a12 = o10Var.a();
                nl nlVar = sl.f10642a;
                return new b(a12, r.e.f17696a.F(), u10Var.a());
        }
    }
}
